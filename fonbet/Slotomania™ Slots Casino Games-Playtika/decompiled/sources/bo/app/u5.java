package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.Constants;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.StringUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import io.sentry.cache.EnvelopeCache;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0005B#\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\n¨\u0006\u0012"}, d2 = {"Lbo/app/u5;", "Lbo/app/q2;", "Lorg/json/JSONObject;", "jsonObject", "", Constants.BRAZE_PUSH_CONTENT_KEY, "Lbo/app/m5;", EnvelopeCache.PREFIX_CURRENT_SESSION_FILE, "", JsonStorageKeyNames.SESSION_ID_KEY, "()Lbo/app/m5;", "storedOpenSession", "Landroid/content/Context;", "context", "userId", "apiKey", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class u5 implements q2 {
    public static final a b = new a(null);
    private final SharedPreferences a;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lbo/app/u5$a;", "", "", "SESSION_STORAGE_FILENAME", "Ljava/lang/String;", "STORED_OPEN_SESSION_KEY", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        public static final b b = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Failed to set end time to now for session json data";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        public static final c b = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "No stored open session in storage.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class d extends Lambda implements Function0<String> {
        public static final d b = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Could not create new mutable session for open session.";
        }
    }

    public u5(Context context, String str, String str2) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context.getSharedPreferences(Intrinsics.stringPlus("com.appboy.storage.session_storage", StringUtils.getCacheFileSuffix(context, str, str2)), 0);
    }

    @Override // bo.app.q2
    public m5 a() {
        String str = "";
        if (!this.a.contains("current_open_session")) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, (BrazeLogger.Priority) null, (Throwable) null, c.b, 3, (Object) null);
            return null;
        }
        try {
            String string = this.a.getString(this.a.getString("current_open_session", ""), "");
            if (string != null) {
                str = string;
            }
            return new m5(new JSONObject(str));
        } catch (JSONException e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, d.b);
            return null;
        }
    }

    @Override // bo.app.q2
    public void a(m5 session) {
        Intrinsics.checkNotNullParameter(session, "session");
        String o5Var = session.getB().toString();
        JSONObject c2 = session.getC();
        SharedPreferences.Editor edit = this.a.edit();
        a(c2);
        edit.putString(o5Var, c2.toString());
        if (!session.getE()) {
            edit.putString("current_open_session", o5Var);
        } else if (Intrinsics.areEqual(this.a.getString("current_open_session", ""), o5Var)) {
            edit.remove("current_open_session");
        }
        edit.apply();
    }

    @Override // bo.app.q2
    public void a(String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        SharedPreferences.Editor edit = this.a.edit();
        edit.remove(sessionId);
        if (Intrinsics.areEqual(sessionId, this.a.getString("current_open_session", null))) {
            edit.remove("current_open_session");
        }
        edit.apply();
    }

    private final void a(JSONObject jsonObject) {
        if (jsonObject.has(SDKConstants.PARAM_TOURNAMENTS_END_TIME)) {
            return;
        }
        try {
            jsonObject.put(SDKConstants.PARAM_TOURNAMENTS_END_TIME, DateTimeUtils.nowInSecondsPrecise());
        } catch (JSONException e) {
            BrazeLogger.INSTANCE.brazelog(this, BrazeLogger.Priority.E, e, b.b);
        }
    }
}
