package pd;

import com.sports.insider.ui.activities.MainActivity;
import eg.m0;
import hg.d1;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l implements hg.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21777a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f21778b;

    public /* synthetic */ l(MainActivity mainActivity, int i5) {
        this.f21777a = i5;
        this.f21778b = mainActivity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (eg.c0.j(300, r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (eg.c0.A(r10, r2, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(int i5, Continuation continuation) {
        n nVar;
        int i10;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i11 = nVar.f21785d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                nVar.f21785d = i11 - Integer.MIN_VALUE;
                Object obj = nVar.f21783b;
                lf.a aVar = lf.a.f20034a;
                i10 = nVar.f21785d;
                if (i10 != 0) {
                    h8.b.B(obj);
                    if (i5 != 401) {
                        return Unit.f19194a;
                    }
                    lg.e eVar = m0.f9201a;
                    fg.e eVar2 = jg.q.f18523a;
                    h hVar = new h(this.f21778b, null, 3);
                    nVar.f21782a = i5;
                    nVar.f21785d = 1;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return Unit.f19194a;
                    }
                    i5 = nVar.f21782a;
                    h8.b.B(obj);
                }
                nVar.f21782a = i5;
                nVar.f21785d = 2;
            }
        }
        nVar = new n(this, continuation);
        Object obj2 = nVar.f21783b;
        lf.a aVar2 = lf.a.f20034a;
        i10 = nVar.f21785d;
        if (i10 != 0) {
        }
        nVar.f21782a = i5;
        nVar.f21785d = 2;
    }

    @Override // hg.h
    public final Object d(Object obj, Continuation continuation) {
        int i5 = this.f21777a;
        MainActivity mainActivity = this.f21778b;
        Continuation continuation2 = null;
        switch (i5) {
            case 0:
                Pair pair = (Pair) obj;
                Object obj2 = pair.f19192a;
                Object obj3 = pair.f19193b;
                int intValue = ((Number) obj2).intValue();
                if (intValue == 1 || intValue == 2 || intValue == 3) {
                    Number number = (Number) obj3;
                    if (number.intValue() > 0) {
                        Set set = MainActivity.J0;
                        mainActivity.H().h(number.intValue(), ((Number) pair.f19192a).intValue(), true);
                    } else {
                        Set set2 = MainActivity.J0;
                        mainActivity.H().f();
                    }
                    d1 d1Var = da.r.f8343a;
                    Pair state = new Pair(new Integer(0), new Integer(0));
                    Intrinsics.checkNotNullParameter(state, "state");
                    d1 d1Var2 = da.r.f8350h;
                    d1Var2.getClass();
                    d1Var2.k(null, state);
                    da.r.a(1);
                } else if (intValue != 4) {
                    Unit unit = Unit.f19194a;
                } else {
                    Set set3 = MainActivity.J0;
                    mainActivity.H().g(true);
                    d1 d1Var3 = da.r.f8343a;
                    Pair state2 = new Pair(new Integer(0), new Integer(0));
                    Intrinsics.checkNotNullParameter(state2, "state");
                    d1 d1Var4 = da.r.f8350h;
                    d1Var4.getClass();
                    d1Var4.k(null, state2);
                    da.r.a(1);
                }
                Object j = eg.c0.j(300L, continuation);
                return j == lf.a.f20034a ? j : Unit.f19194a;
            case 1:
                if (((Number) obj).intValue() == 1) {
                    Set set4 = MainActivity.J0;
                    eg.c0.t(androidx.lifecycle.d1.g(mainActivity), null, null, new m2.f0(mainActivity, continuation2, 8), 3);
                }
                Object j6 = eg.c0.j(300L, continuation);
                return j6 == lf.a.f20034a ? j6 : Unit.f19194a;
            default:
                return a(((Number) obj).intValue(), continuation);
        }
    }
}
