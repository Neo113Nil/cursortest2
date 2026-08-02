package pd;

import android.R;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.g0;
import com.google.android.material.snackbar.Snackbar;
import com.sports.insider.ui.activities.MainActivity;
import hg.d1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m extends mf.i implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f21779b;

    /* renamed from: c, reason: collision with root package name */
    public int f21780c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MainActivity f21781d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(MainActivity mainActivity, Continuation continuation, int i5) {
        super(2, continuation);
        this.f21779b = i5;
        this.f21781d = mainActivity;
    }

    @Override // mf.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f21779b) {
            case 0:
                return new m(this.f21781d, continuation, 0);
            case 1:
                return new m(this.f21781d, continuation, 1);
            case 2:
                return new m(this.f21781d, continuation, 2);
            default:
                return new m(this.f21781d, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        eg.z zVar = (eg.z) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f21779b) {
        }
        return ((m) create(zVar, continuation)).invokeSuspend(Unit.f19194a);
    }

    @Override // mf.a
    public final Object invokeSuspend(Object obj) {
        View decorView;
        View findViewById;
        int i5 = this.f21779b;
        int i10 = 2;
        int i11 = 3;
        Continuation continuation = null;
        MainActivity mainActivity = this.f21781d;
        switch (i5) {
            case 0:
                lf.a aVar = lf.a.f20034a;
                int i12 = this.f21780c;
                if (i12 == 0) {
                    h8.b.B(obj);
                    d1 d1Var = da.r.f8350h;
                    g0 g0Var = mainActivity.f3250a;
                    androidx.lifecycle.x xVar = androidx.lifecycle.x.f2253a;
                    hg.u uVar = new hg.u(androidx.lifecycle.d1.f(d1Var, g0Var), new k(3, null, 0));
                    l lVar = new l(mainActivity, 0);
                    this.f21780c = 1;
                    if (uVar.a(lVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 1:
                lf.a aVar2 = lf.a.f20034a;
                int i13 = this.f21780c;
                if (i13 == 0) {
                    h8.b.B(obj);
                    d1 d1Var2 = da.r.f8349g;
                    g0 g0Var2 = mainActivity.f3250a;
                    androidx.lifecycle.x xVar2 = androidx.lifecycle.x.f2253a;
                    hg.u uVar2 = new hg.u(androidx.lifecycle.d1.f(d1Var2, g0Var2), new k(3, null, 1));
                    l lVar2 = new l(mainActivity, 1);
                    this.f21780c = 1;
                    if (uVar2.a(lVar2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            case 2:
                lf.a aVar3 = lf.a.f20034a;
                int i14 = this.f21780c;
                if (i14 == 0) {
                    h8.b.B(obj);
                    d1 d1Var3 = da.r.f8344b;
                    g0 g0Var3 = mainActivity.f3250a;
                    androidx.lifecycle.x xVar3 = androidx.lifecycle.x.f2253a;
                    hg.u uVar3 = new hg.u(androidx.lifecycle.d1.f(d1Var3, g0Var3), new ge.o(i11, continuation, 17));
                    l lVar3 = new l(mainActivity, 2);
                    this.f21780c = 1;
                    if (uVar3.a(lVar3, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                return Unit.f19194a;
            default:
                lf.a aVar4 = lf.a.f20034a;
                int i15 = this.f21780c;
                if (i15 == 0) {
                    h8.b.B(obj);
                    int i16 = com.sports.insider.ui.activities.a.G;
                    io.sentry.util.network.b bVar = new io.sentry.util.network.b(7);
                    this.f21780c = 1;
                    obj = bVar.i(this);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return Unit.f19194a;
                }
                try {
                    Window window = mainActivity.getWindow();
                    if (window != null && (decorView = window.getDecorView()) != null && (findViewById = decorView.findViewById(R.id.content)) != null) {
                        Snackbar.make(findViewById, "An update has just been downloaded.", -2).setAction("INSTALL", new ke.e(i10, mainActivity)).show();
                    }
                } catch (Exception unused) {
                    ((com.google.android.play.core.appupdate.e) mainActivity.B.getValue()).a();
                }
                return Unit.f19194a;
        }
    }
}
