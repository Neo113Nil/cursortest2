package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.support.BrazeLogger;
import io.sentry.ProfilingTraceData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\b\u0010\n¨\u0006\u0011"}, d2 = {"Lbo/app/o4;", "Lbo/app/k2;", "", "b", "()Z", "isAutomaticRegistrationEnabled", "", "pushToken", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;", "(Ljava/lang/String;)V", "Landroid/content/Context;", "context", "Lcom/braze/configuration/BrazeConfigurationProvider;", "configurationProvider", "<init>", "(Landroid/content/Context;Lcom/braze/configuration/BrazeConfigurationProvider;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class o4 implements k2 {
    public static final a c = new a(null);
    private final BrazeConfigurationProvider a;
    public final SharedPreferences b;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u0012\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004¨\u0006\u000b"}, d2 = {"Lbo/app/o4$a;", "", "", "PUSH_SHARED_PREFERENCES_FILENAME", "Ljava/lang/String;", "PUSH_SHARED_PREFERENCES_PERSISTENT_DEVICE_ID", "getPUSH_SHARED_PREFERENCES_PERSISTENT_DEVICE_ID$annotations", "()V", "PUSH_SHARED_PREFERENCES_REGISTRATION_ID_KEY", "PUSH_SHARED_PREFERENCES_VERSION_CODE", "<init>", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class b extends Lambda implements Function0<String> {
        final /* synthetic */ int b;
        final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i, int i2) {
            super(0);
            this.b = i;
            this.c = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Stored push registration ID version code " + this.b + " does not match live version code " + this.c + ". Not returning saved registration ID.";
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
            return "Device identifier differs from saved device identifier. Returning null token.";
        }
    }

    public o4(Context context, BrazeConfigurationProvider configurationProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        this.a = configurationProvider;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.braze.push_registration", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        this.b = sharedPreferences;
    }

    private final boolean b() {
        return this.a.isFirebaseCloudMessagingRegistrationEnabled() || this.a.isAdmMessagingRegistrationEnabled();
    }

    @Override // bo.app.k2
    public synchronized String a() {
        int versionCode;
        int i;
        if (b() && this.b.contains(ProfilingTraceData.JsonKeys.VERSION_CODE) && (versionCode = this.a.getVersionCode()) != (i = this.b.getInt(ProfilingTraceData.JsonKeys.VERSION_CODE, Integer.MIN_VALUE))) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.V, (Throwable) null, new b(i, versionCode), 2, (Object) null);
            return null;
        }
        if (this.b.contains("device_identifier")) {
            if (!Intrinsics.areEqual(n0.b.a(), this.b.getString("device_identifier", ""))) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, this, BrazeLogger.Priority.I, (Throwable) null, c.b, 2, (Object) null);
                return null;
            }
        }
        return this.b.getString("registration_id", null);
    }

    @Override // bo.app.k2
    public synchronized void a(String str) {
        if (str != null) {
            this.b.edit().putString("registration_id", str).putInt(ProfilingTraceData.JsonKeys.VERSION_CODE, this.a.getVersionCode()).putString("device_identifier", n0.b.a()).apply();
        } else {
            throw new NullPointerException("Provided push token is null. Cannot set null push token.");
        }
    }
}
