package pd;

import androidx.lifecycle.d1;
import com.google.android.play.core.install.zza;
import com.sports.insider.ui.activities.MainActivity;
import eg.m0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainActivity f21826a;

    public /* synthetic */ y(MainActivity mainActivity) {
        this.f21826a = mainActivity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r0 != 6) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(zza state) {
        int i5;
        Intrinsics.checkNotNullParameter(state, "state");
        int i10 = com.sports.insider.ui.activities.a.G;
        int i11 = state.f6020a;
        String message = "GMS InstallStatus:" + i11;
        Intrinsics.checkNotNullParameter(message, "message");
        if (i11 != 0) {
            if (i11 != 11) {
                if (i11 != 4) {
                    if (i11 != 5) {
                    }
                }
                z.a();
            } else {
                MainActivity mainActivity = this.f21826a;
                androidx.lifecycle.z g10 = d1.g(mainActivity);
                lg.e eVar = m0.f9201a;
                fg.e eVar2 = jg.q.f18523a;
                eg.y v5 = com.sports.insider.ui.activities.a.v();
                eVar2.getClass();
                eg.c0.t(g10, kotlin.coroutines.e.c(eVar2, v5), null, new m(mainActivity, null, 3), 2);
            }
            i5 = state.f6023d;
            String message2 = "GMS InstallErrorCode:" + i5;
            Intrinsics.checkNotNullParameter(message2, "message");
            if (i5 != -100 || i5 == -10 || i5 == -9 || i5 == -6 || i5 == -5 || i5 == -4 || i5 == -3) {
                z.a();
            } else if (i5 == 0 || i5 == 1) {
                return;
            }
            zc.d.c("GMS InstallErrorCode:" + i5, "InstallStateCoreUpdate");
        }
        zc.d.c("GMS InstallStatus:" + i11, "InstallStateCoreUpdate");
        i5 = state.f6023d;
        String message22 = "GMS InstallErrorCode:" + i5;
        Intrinsics.checkNotNullParameter(message22, "message");
        if (i5 != -100) {
        }
        z.a();
        zc.d.c("GMS InstallErrorCode:" + i5, "InstallStateCoreUpdate");
    }
}
