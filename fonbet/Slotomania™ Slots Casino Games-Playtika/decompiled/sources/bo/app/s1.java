package bo.app;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.braze.Constants;
import com.braze.support.BrazeLogger;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\t"}, d2 = {"Lbo/app/s1;", "", "Landroid/content/Context;", "context", "", Constants.BRAZE_PUSH_CONTENT_KEY, "b", "<init>", "()V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final class s1 {
    public static final s1 a = new s1();

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<String> {
        public static final a b = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Google Play Services Availability API not found. Google Play Services not enabled.";
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
            return "Google Play Services is available.";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;"}, k = 3, mv = {1, 6, 0})
    static final class c extends Lambda implements Function0<String> {
        final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i) {
            super(0);
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return Intrinsics.stringPlus("Google Play Services is unavailable. Connection result: ", Integer.valueOf(this.b));
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
            return "Unexpected exception while checking for com.google.android.gsf";
        }
    }

    private s1() {
    }

    @JvmStatic
    public static final boolean a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Class.forName("com.google.android.gms.common.GoogleApiAvailability");
            int isGooglePlayServicesAvailable = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context);
            if (isGooglePlayServicesAvailable == 0) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a, (BrazeLogger.Priority) null, (Throwable) null, b.b, 3, (Object) null);
                return true;
            }
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, a, (BrazeLogger.Priority) null, (Throwable) null, new c(isGooglePlayServicesAvailable), 3, (Object) null);
            return false;
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(a, BrazeLogger.Priority.I, e, a.b);
            return false;
        }
    }

    @JvmStatic
    public static final boolean b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                context.getPackageManager().getPackageInfo(GooglePlayServicesUtilLight.GOOGLE_SERVICES_FRAMEWORK_PACKAGE, PackageManager.PackageInfoFlags.of(0L));
                return true;
            }
            context.getPackageManager().getPackageInfo(GooglePlayServicesUtilLight.GOOGLE_SERVICES_FRAMEWORK_PACKAGE, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        } catch (Exception e) {
            BrazeLogger.INSTANCE.brazelog(a, BrazeLogger.Priority.W, e, d.b);
            return false;
        }
    }
}
