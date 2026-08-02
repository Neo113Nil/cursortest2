package defpackage;

import androidx.compose.runtime.e;
import com.sofascore.results.R;
import com.sofascore.results.event.details.bottomSheet.EventPlayerOfTheMatchVoteBottomSheet;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class l56 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventPlayerOfTheMatchVoteBottomSheet b;

    public /* synthetic */ l56(EventPlayerOfTheMatchVoteBottomSheet eventPlayerOfTheMatchVoteBottomSheet, int i) {
        this.a = i;
        this.b = eventPlayerOfTheMatchVoteBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        av8 av8Var;
        Integer num;
        switch (this.a) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var;
                if (av8Var2.T(intValue & 1, (intValue & 3) != 2)) {
                    EventPlayerOfTheMatchVoteBottomSheet eventPlayerOfTheMatchVoteBottomSheet = this.b;
                    Long l = (Long) eventPlayerOfTheMatchVoteBottomSheet.B.getValue();
                    utc utcVar = utc.a;
                    xtc f0 = l98.f0(utcVar, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 16.0f, 2);
                    u23 a = t23.a(ww9.d, uxf.o, av8Var2, 0);
                    int hashCode = Long.hashCode(av8Var2.T);
                    aee m = av8Var2.m();
                    xtc C = fqj.C(av8Var2, f0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var2.h0();
                    if (av8Var2.S) {
                        av8Var2.l(zg3Var);
                    } else {
                        av8Var2.q0();
                    }
                    f50 f50Var = hf3.g;
                    waa.K(av8Var2, a, f50Var);
                    ff3 ff3Var = hf3.f;
                    waa.K(av8Var2, m, ff3Var);
                    Integer valueOf = Integer.valueOf(hashCode);
                    f50 f50Var2 = hf3.j;
                    waa.K(av8Var2, valueOf, f50Var2);
                    ry ryVar = hf3.k;
                    waa.J(av8Var2, ryVar);
                    f50 f50Var3 = hf3.d;
                    waa.K(av8Var2, C, f50Var3);
                    mte mteVar = (mte) CollectionsKt.firstOrNull((gv9) eventPlayerOfTheMatchVoteBottomSheet.A.getValue());
                    String H = s02.H(R.string.who_is_your_player_of_the_match, mteVar != null ? mteVar.h : null, null, av8Var2, 4);
                    long D = lz.D(R.color.n_lv_1, av8Var2);
                    yf8 yf8Var = xth.a;
                    udj.c(H, null, D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var2, 0, 0, 131066);
                    nq8.h(av8Var2, bkh.e(utcVar, 4.0f));
                    if (((Integer) eventPlayerOfTheMatchVoteBottomSheet.z.getValue()) == null) {
                        av8Var2.d0(-1763861112);
                        udj.c(oea.v(R.string.you_be_the_judge_fan_voting, av8Var2), null, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var2, 0, 0, 131066);
                        av8Var = av8Var2;
                        av8Var.s(false);
                    } else if (l != null) {
                        av8Var2.d0(-1763517911);
                        cdi M = hda.M(l.longValue(), av8Var2, 0);
                        l8g a2 = k8g.a(ww9.b, uxf.m, av8Var2, 48);
                        int hashCode2 = Long.hashCode(av8Var2.T);
                        aee m2 = av8Var2.m();
                        xtc C2 = fqj.C(av8Var2, utcVar);
                        av8Var2.h0();
                        if (av8Var2.S) {
                            av8Var2.l(zg3Var);
                        } else {
                            av8Var2.q0();
                        }
                        waa.K(av8Var2, a2, f50Var);
                        waa.K(av8Var2, m2, ff3Var);
                        bf3.s(hashCode2, av8Var2, f50Var2, av8Var2, ryVar);
                        waa.K(av8Var2, C2, f50Var3);
                        udj.c(oea.v(R.string.leaderboard_voting_closes_in, av8Var2), null, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var2, 0, 0, 131066);
                        nq8.h(av8Var2, bkh.p(utcVar, 2.0f));
                        long j = ((js8) M.getValue()).c;
                        wd5 wd5Var = xd5.b;
                        be5 be5Var = be5.SECONDS;
                        long S = wkn.S(j, be5Var);
                        udj.c(String.format(dla.d(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(xd5.k(S, be5.HOURS)), Long.valueOf(xd5.k(S, be5.MINUTES) % 60), Long.valueOf(xd5.k(S, be5Var) % 60)}, 3)), null, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var2, 0, 0, 131066);
                        av8Var = av8Var2;
                        av8Var.s(true);
                        av8Var.s(false);
                    } else {
                        av8Var2.d0(-1762626568);
                        udj.c(oea.v(R.string.voting_open, av8Var2), null, lz.D(R.color.n_lv_3, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var2, 0, 0, 131066);
                        av8Var = av8Var2;
                        av8Var.s(false);
                    }
                    av8Var.s(true);
                } else {
                    av8Var2.W();
                }
                break;
            default:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var3 = (av8) of3Var2;
                if (av8Var3.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Object[] objArr = new Object[0];
                    Object O = av8Var3.O();
                    Object obj3 = nf3.a;
                    if (O == obj3) {
                        O = new qt5(13);
                        av8Var3.n0(O);
                    }
                    znh znhVar = (znh) o3a.N(objArr, (Function0) O, av8Var3, 48);
                    EventPlayerOfTheMatchVoteBottomSheet eventPlayerOfTheMatchVoteBottomSheet2 = this.b;
                    Integer num2 = (Integer) eventPlayerOfTheMatchVoteBottomSheet2.z.getValue();
                    if (num2 == null) {
                        int h = znhVar.h();
                        num = h != -1 ? Integer.valueOf(h) : null;
                    } else {
                        num = num2;
                    }
                    Object O2 = av8Var3.O();
                    if (O2 == obj3) {
                        O2 = e.f(null);
                        av8Var3.n0(O2);
                    }
                    e1d e1dVar = (e1d) O2;
                    gv9 gv9Var = (gv9) eventPlayerOfTheMatchVoteBottomSheet2.A.getValue();
                    Long l2 = (Long) eventPlayerOfTheMatchVoteBottomSheet2.B.getValue();
                    Object O3 = av8Var3.O();
                    int i = 25;
                    if (O3 == obj3) {
                        O3 = new w30(i, e1dVar);
                        av8Var3.n0(O3);
                    }
                    Function1 function1 = (Function1) O3;
                    boolean i2 = av8Var3.i(eventPlayerOfTheMatchVoteBottomSheet2);
                    Object O4 = av8Var3.O();
                    if (i2 || O4 == obj3) {
                        Object nyVar = new ny(0, eventPlayerOfTheMatchVoteBottomSheet2, EventPlayerOfTheMatchVoteBottomSheet.class, "dismiss", "dismiss()V", 0, 23);
                        av8Var3.n0(nyVar);
                        O4 = nyVar;
                    }
                    v9g.r(gv9Var, num, l2, function1, (Function0) ((KFunction) O4), null, av8Var3, 3072);
                    boolean z = ((mte) e1dVar.getValue()) != null;
                    Object O5 = av8Var3.O();
                    if (O5 == obj3) {
                        O5 = new v30(18, e1dVar);
                        av8Var3.n0(O5);
                    }
                    un0.f(z, (Function0) O5, false, false, yqo.H(197346626, av8Var3, new cyb(i, e1dVar, eventPlayerOfTheMatchVoteBottomSheet2, znhVar)), av8Var3, 24624, 12);
                } else {
                    av8Var3.W();
                }
                break;
        }
        return Unit.a;
    }
}
