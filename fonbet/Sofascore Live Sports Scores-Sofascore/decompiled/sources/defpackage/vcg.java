package defpackage;

import android.content.Context;
import android.view.View;
import androidx.media3.exoplayer.ExoPlayer;
import com.ironsource.mediationsdk.s;
import com.sofascore.results.R;
import com.unity3d.mediation.LevelPlay;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class vcg implements ct8 {
    public final /* synthetic */ int a;

    public /* synthetic */ vcg(int i) {
        this.a = i;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Unit a;
        switch (this.a) {
            case 0:
                Context context = (Context) obj;
                View view = (View) obj2;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                context.getClass();
                view.getClass();
                return new deg(context, view, booleanValue);
            case 1:
                Context context2 = (Context) obj;
                int intValue = ((Integer) obj2).intValue();
                int intValue2 = ((Integer) obj3).intValue();
                context2.getClass();
                return new kcg(context2, intValue, intValue2);
            case 2:
                Context context3 = (Context) obj;
                ExoPlayer exoPlayer = (ExoPlayer) obj2;
                ffg ffgVar = (ffg) obj3;
                context3.getClass();
                exoPlayer.getClass();
                ffgVar.getClass();
                return new fhg(context3, exoPlayer, ffgVar);
            case 3:
                Context context4 = (Context) obj;
                List list = (List) obj2;
                String str = (String) obj3;
                context4.getClass();
                list.getClass();
                str.getClass();
                return new qig(context4, str, list);
            case 4:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                of3 of3Var = (of3) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((av8) of3Var).h(booleanValue2) ? 4 : 2;
                }
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue3 & 1, (intValue3 & 19) != 18)) {
                    utc utcVar = utc.a;
                    if (booleanValue2) {
                        av8Var.d0(-15872152);
                        xtc l = bkh.l(utcVar, 24.0f);
                        long D = lz.D(R.color.n_lv_4, av8Var);
                        Object O = av8Var.O();
                        a99 a99Var = nf3.a;
                        if (O == a99Var) {
                            O = mz1.e(av8Var);
                        }
                        wzc wzcVar = (wzc) O;
                        Object[] objArr = new Object[0];
                        Object O2 = av8Var.O();
                        if (O2 == a99Var) {
                            O2 = mce.p;
                            av8Var.n0(O2);
                        }
                        kq9.b(s6a.N(R.drawable.ic_chevron_left, 6, av8Var), null, tol.y(l, true, false, true, D, wzcVar, new ps4((boh) o3a.N(objArr, (Function0) O2, av8Var, 48), 11), av8Var, 0), lz.D(R.color.n_lv_1, av8Var), av8Var, 48, 0);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(-15341618);
                        kq9.b(s6a.N(R.drawable.ic_search, 6, av8Var), null, bkh.l(utcVar, 24.0f), lz.D(R.color.n_lv_1, av8Var), av8Var, 432, 0);
                        av8Var.s(false);
                    }
                } else {
                    av8Var.W();
                }
                return Unit.a;
            default:
                a = s.a((LevelPlay.AdFormat) obj, (Integer) obj2, (String) obj3);
                return a;
        }
    }
}
