package defpackage;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class qb7 implements et8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ qb7(Function1 function1, Function1 function12, int i) {
        this.a = i;
        this.b = function1;
        this.c = function12;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        xtc r;
        int i = this.a;
        utc utcVar = utc.a;
        Function1 function1 = this.c;
        Function1 function12 = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj3;
                ((Integer) obj4).getClass();
                ((k60) obj).getClass();
                ((d6d) obj2).getClass();
                r = m6k.r(utc.a, "JoinLeagueTab", new su(Sdk.SDKError.Reason.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE, null, null));
                ttk a = cib.a(of3Var);
                if (a == null) {
                    a70.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return null;
                }
                f5p.f((ia7) sea.A(duf.a.getOrCreateKotlinClass(ia7.class), a, kik.V(ufa.s(a), of3Var), ufa.r(a), of3Var), this.b, this.c, r, of3Var, 0);
                return Unit.a;
            case 1:
                vvi vviVar = (vvi) obj2;
                of3 of3Var2 = (of3) obj3;
                int intValue = ((Integer) obj4).intValue();
                ((k60) obj).getClass();
                vviVar.getClass();
                if (vviVar instanceof rvi) {
                    av8 av8Var = (av8) of3Var2;
                    av8Var.d0(-1240012664);
                    aba.k(6, av8Var, bkh.e(utcVar, 76.0f));
                    av8Var.s(false);
                } else if (vviVar instanceof qvi) {
                    av8 av8Var2 = (av8) of3Var2;
                    av8Var2.d0(-1240008423);
                    aba.j((qvi) vviVar, bkh.e(utcVar, 76.0f), av8Var2, ((intValue >> 3) & 14) | 48);
                    av8Var2.s(false);
                } else if (vviVar instanceof tvi) {
                    av8 av8Var3 = (av8) of3Var2;
                    av8Var3.d0(-1240003565);
                    aba.l((tvi) vviVar, function12, bkh.e(utcVar, 76.0f), av8Var3, ((intValue >> 3) & 14) | 384);
                    av8Var3.s(false);
                } else {
                    if (!(vviVar instanceof uvi)) {
                        throw dmi.h((av8) of3Var2, -1240014929, false);
                    }
                    av8 av8Var4 = (av8) of3Var2;
                    av8Var4.d0(-1239997603);
                    aba.o((uvi) vviVar, function1, bkh.e(utcVar, 76.0f), av8Var4, ((intValue >> 3) & 14) | 384);
                    av8Var4.s(false);
                }
                return Unit.a;
            default:
                lwi lwiVar = (lwi) obj2;
                of3 of3Var3 = (of3) obj3;
                ((Integer) obj4).getClass();
                ((k60) obj).getClass();
                lwiVar.getClass();
                s02.n(l98.b0(bkh.d(utcVar, 1.0f), 8.0f), new ng0(2.0f, true, new a70(6)), new ng0(2.0f, true, new a70(6)), null, 7, 0, yqo.H(-842761817, of3Var3, new zya(11, lwiVar, function12, function1)), of3Var3, 1597878, 40);
                return Unit.a;
        }
    }
}
