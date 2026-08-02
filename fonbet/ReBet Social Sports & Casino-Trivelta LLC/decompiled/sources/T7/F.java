package T7;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import g6.C4331C;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public static final F f10984a = new F();

    public interface a {
        void a(String str);
    }

    public static final void d(a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        F f10 = f10984a;
        if (f10.b()) {
            return;
        }
        f10.c(callback);
    }

    public final boolean b() {
        return C4331C.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false);
    }

    public final void c(a aVar) {
        InstallReferrerClient build = InstallReferrerClient.newBuilder(C4331C.l()).build();
        try {
            build.startConnection(new b(build, aVar));
        } catch (Exception unused) {
        }
    }

    public final void e() {
        C4331C.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }

    public static final class b implements InstallReferrerStateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InstallReferrerClient f10985a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f10986b;

        public b(InstallReferrerClient installReferrerClient, a aVar) {
            this.f10985a = installReferrerClient;
            this.f10986b = aVar;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int i10) {
            if (Y7.a.d(this)) {
                return;
            }
            try {
                if (i10 == 0) {
                    try {
                        ReferrerDetails installReferrer = this.f10985a.getInstallReferrer();
                        Intrinsics.checkNotNullExpressionValue(installReferrer, "{\n                      referrerClient.installReferrer\n                    }");
                        String installReferrer2 = installReferrer.getInstallReferrer();
                        if (installReferrer2 != null && (StringsKt.contains$default((CharSequence) installReferrer2, (CharSequence) "fb", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) installReferrer2, (CharSequence) "facebook", false, 2, (Object) null))) {
                            this.f10986b.a(installReferrer2);
                        }
                        F.f10984a.e();
                    } catch (RemoteException | Exception unused) {
                        return;
                    }
                } else if (i10 == 2) {
                    F.f10984a.e();
                }
                this.f10985a.endConnection();
            } catch (Throwable th2) {
                Y7.a.b(th2, this);
            }
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
        }
    }
}
