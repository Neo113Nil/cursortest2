package io.sentry.react;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONObject;

/* loaded from: classes9.dex */
final class RNSentryJsonUtils {
    private RNSentryJsonUtils() {
        throw new AssertionError("Utility class should not be instantiated");
    }

    static JSONObject getOptionsFromConfigurationFile(Context context, String str, ILogger iLogger) {
        try {
            InputStream open = context.getAssets().open(str);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    }
                    JSONObject jSONObject = new JSONObject(sb.toString());
                    bufferedReader.close();
                    if (open != null) {
                        open.close();
                    }
                    return jSONObject;
                } finally {
                }
            } finally {
            }
        } catch (Exception e) {
            iLogger.log(SentryLevel.ERROR, "Failed to read configuration file. Please make sure " + str + " exists in the root of your project.", e);
            return null;
        }
    }
}
