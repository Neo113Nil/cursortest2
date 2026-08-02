package pd;

import android.os.Handler;
import android.os.Looper;
import com.sports.insider.MyApp;
import com.sports.insider.R;
import com.sports.insider.ui.activities.MainActivity;
import java.util.Set;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends e.z {

    /* renamed from: d, reason: collision with root package name */
    public final long f21767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ MainActivity f21768e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(MainActivity mainActivity) {
        super(true);
        this.f21768e = mainActivity;
        this.f21767d = 2000L;
    }

    @Override // e.z
    public final void b() {
        f(false);
        MainActivity mainActivity = this.f21768e;
        gf.t tVar = mainActivity.k0;
        Set set = MainActivity.J0;
        if (mainActivity.B()) {
            f(true);
            return;
        }
        y1.f0 C = mainActivity.C();
        y1.b0 f6 = C.f25625b.f();
        b2.j jVar = C.f25625b;
        Integer valueOf = f6 != null ? Integer.valueOf(f6.f25534b.f3017e) : null;
        y1.b0 f10 = jVar.f();
        if ((f10 != null ? f10.f25534b.f3017e : 0) == jVar.g().f25543g.f3078a && C.c() == null) {
            if (mainActivity.f6896u0) {
                mainActivity.getOnBackPressedDispatcher().f8405c.a();
                rc.g gVar = (rc.g) tVar.getValue();
                gVar.getClass();
                eg.c0.t(MyApp.f6830c, rc.b0.b(), null, new rc.c(gVar, null, 6), 2);
            } else {
                g();
                rc.g gVar2 = (rc.g) tVar.getValue();
                gVar2.getClass();
                eg.c0.t(MyApp.f6830c, rc.b0.b(), null, new rc.c(gVar2, null, 5), 2);
            }
        } else if (valueOf != null && MainActivity.J0.contains(valueOf)) {
            rc.g gVar3 = (rc.g) tVar.getValue();
            gVar3.getClass();
            eg.c0.t(MyApp.f6830c, rc.b0.b(), null, new rc.c(gVar3, null, 1), 2);
        } else if (C.c() != null) {
            C.e();
            rc.g gVar4 = (rc.g) tVar.getValue();
            gVar4.getClass();
            eg.c0.t(MyApp.f6830c, rc.b0.b(), null, new rc.c(gVar4, null, 0), 2);
        } else if (mainActivity.f6896u0) {
            mainActivity.getOnBackPressedDispatcher().f8405c.a();
            rc.g gVar5 = (rc.g) tVar.getValue();
            gVar5.getClass();
            eg.c0.t(MyApp.f6830c, rc.b0.b(), null, new rc.c(gVar5, null, 2), 2);
        } else {
            g();
            rc.g gVar6 = (rc.g) tVar.getValue();
            gVar6.getClass();
            eg.c0.t(MyApp.f6830c, rc.b0.b(), null, new rc.c(gVar6, null, 4), 2);
        }
        f(true);
    }

    public final void g() {
        MainActivity mainActivity = this.f21768e;
        mainActivity.f6896u0 = true;
        rc.x.a(R.string.click_to_exit, false);
        new Handler(Looper.getMainLooper()).postDelayed(new io.sentry.android.core.f(14, mainActivity), this.f21767d);
    }
}
