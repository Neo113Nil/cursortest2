package air.com.playtika.android.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import io.sentry.SentryEvent;
import io.sentry.protocol.Mechanism;
import io.sentry.protocol.SentryException;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class SentryEventHandler {
    private static final String ANR_EVENT_KEY = "latestAnr";
    private static final String ANR_STORAGE_KEY = "Sentry_ANR_Event";
    private static final String ANR_TYPE = "ApplicationNotResponding";
    private final Context context;

    public SentryEventHandler(Context context) {
        this.context = context;
    }

    public void handleEvent(SentryEvent sentryEvent) {
        handleAnrEvent(sentryEvent);
    }

    public String retrieveLastSentryAnrEvent() {
        SharedPreferences sharedPreferences = this.context.getSharedPreferences(ANR_STORAGE_KEY, 0);
        String string = sharedPreferences.getString(ANR_EVENT_KEY, "");
        sharedPreferences.edit().clear().apply();
        return string;
    }

    private void handleAnrEvent(SentryEvent sentryEvent) {
        List<SentryException> exceptions = sentryEvent.getExceptions();
        if (exceptions == null || exceptions.isEmpty()) {
            return;
        }
        for (SentryException sentryException : exceptions) {
            if (ANR_TYPE.equals(sentryException.getType())) {
                Mechanism mechanism = sentryException.getMechanism();
                try {
                    this.context.getSharedPreferences(ANR_STORAGE_KEY, 0).edit().putString(ANR_EVENT_KEY, new JSONObject().put("id", sentryEvent.getEventId()).put("timestamp", String.valueOf(sentryEvent.getTimestamp().getTime())).put(SentryException.JsonKeys.MECHANISM, String.valueOf(mechanism != null ? mechanism.getType() : null)).put("type", sentryException.getType()).put("value", sentryException.getValue()).toString()).apply();
                } catch (Exception e) {
                    Log.e(SentryEventHandler.class.getName(), "Failed to handle ANR event", e);
                }
            }
        }
    }
}
