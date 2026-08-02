package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class b25 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tc3 b;

    public /* synthetic */ b25(int i, int i2, tc3 tc3Var) {
        this.a = i2;
        this.b = tc3Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 1;
        tc3 tc3Var = this.b;
        switch (i) {
            case 0:
                of3 of3Var = (of3) obj;
                int intValue = ((Integer) obj2).intValue();
                av8 av8Var = (av8) of3Var;
                if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                    ff5 ff5Var = nz.f;
                    Object parent = ((View) av8Var.k(ff5Var)).getParent();
                    View view = parent instanceof View ? (View) parent : null;
                    FragmentActivity O = hkg.O((Context) av8Var.k(nz.b));
                    Window window = O != null ? O.getWindow() : null;
                    ViewParent parent2 = ((View) av8Var.k(ff5Var)).getParent();
                    e25 e25Var = parent2 instanceof e25 ? (e25) parent2 : null;
                    Window window2 = e25Var != null ? e25Var.getWindow() : null;
                    boolean i3 = av8Var.i(window) | av8Var.i(window2) | av8Var.i(view);
                    Object O2 = av8Var.O();
                    if (i3 || O2 == nf3.a) {
                        O2 = new mi(20, window, window2, view);
                        av8Var.n0(O2);
                    }
                    hz8.t((Function0) O2, av8Var);
                    uni.a(bkh.c, null, r13.h, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, yqo.H(805929413, av8Var, new b25(tc3Var, i2)), av8Var, 12583302, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                } else {
                    av8Var.W();
                }
                break;
            case 1:
                of3 of3Var2 = (of3) obj;
                int intValue2 = ((Integer) obj2).intValue();
                av8 av8Var2 = (av8) of3Var2;
                if (av8Var2.T(intValue2 & 1, (intValue2 & 3) != 2)) {
                    tc3Var.invoke(av8Var2, 0);
                } else {
                    av8Var2.W();
                }
                break;
            case 2:
                of3 of3Var3 = (of3) obj;
                int intValue3 = ((Integer) obj2).intValue();
                av8 av8Var3 = (av8) of3Var3;
                if (av8Var3.T(intValue3 & 1, (intValue3 & 3) != 2)) {
                    tc3Var.invoke(d98.a, av8Var3, 6);
                } else {
                    av8Var3.W();
                }
                break;
            case 3:
                of3 of3Var4 = (of3) obj;
                int intValue4 = ((Integer) obj2).intValue();
                av8 av8Var4 = (av8) of3Var4;
                if (av8Var4.T(intValue4 & 1, (intValue4 & 3) != 2)) {
                    tc3Var.invoke(kb8.a, av8Var4, 6);
                } else {
                    av8Var4.W();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                pea.f(tc3Var, (of3) obj, aba.K(7));
                break;
            case 5:
                of3 of3Var5 = (of3) obj;
                int intValue5 = ((Integer) obj2).intValue();
                av8 av8Var5 = (av8) of3Var5;
                if (av8Var5.T(intValue5 & 1, (intValue5 & 3) != 2)) {
                    q5a.l(tc3Var, av8Var5, 0);
                } else {
                    av8Var5.W();
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                q5a.l(tc3Var, (of3) obj, aba.K(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                bfh.a(tc3Var, (of3) obj, aba.K(55));
                break;
            case 8:
                of3 of3Var6 = (of3) obj;
                int intValue6 = ((Integer) obj2).intValue();
                av8 av8Var6 = (av8) of3Var6;
                if (av8Var6.T(intValue6 & 1, (intValue6 & 3) != 2)) {
                    tzb.b(null, null, null, yqo.H(-1667434665, av8Var6, new b25(tc3Var, 10)), av8Var6, 3072, 7);
                } else {
                    av8Var6.W();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                i2a.g(tc3Var, (of3) obj, aba.K(7));
                break;
            case 10:
                of3 of3Var7 = (of3) obj;
                int intValue7 = ((Integer) obj2).intValue();
                av8 av8Var7 = (av8) of3Var7;
                if (av8Var7.T(intValue7 & 1, (intValue7 & 3) != 2)) {
                    tc3Var.invoke(av8Var7, 0);
                } else {
                    av8Var7.W();
                }
                break;
            case 11:
                of3 of3Var8 = (of3) obj;
                int intValue8 = ((Integer) obj2).intValue();
                av8 av8Var8 = (av8) of3Var8;
                if (av8Var8.T(intValue8 & 1, (intValue8 & 3) != 2)) {
                    wej wejVar = new wej(lz.D(R.color.primary_default, av8Var8), r13.c(lz.D(R.color.primary_default, av8Var8), 0.5f));
                    Configuration configuration = (Configuration) av8Var8.k(nz.a);
                    configuration.getClass();
                    tol.c(new gb0[]{xej.a.a(wejVar), jhb.a.a(new w05((configuration.screenLayout & 15) >= 3))}, yqo.H(481459123, av8Var8, new b25(tc3Var, 13)), av8Var8, 56);
                } else {
                    av8Var8.W();
                }
                break;
            case 12:
                ((Integer) obj2).getClass();
                haa.f(tc3Var, (of3) obj, aba.K(7));
                break;
            case 13:
                of3 of3Var9 = (of3) obj;
                int intValue9 = ((Integer) obj2).intValue();
                av8 av8Var9 = (av8) of3Var9;
                if (av8Var9.T(intValue9 & 1, (intValue9 & 3) != 2)) {
                    tc3Var.invoke(av8Var9, 0);
                } else {
                    av8Var9.W();
                }
                break;
            case 14:
                of3 of3Var10 = (of3) obj;
                int intValue10 = ((Integer) obj2).intValue();
                av8 av8Var10 = (av8) of3Var10;
                if (av8Var10.T(intValue10 & 1, (intValue10 & 3) != 2)) {
                    tc3Var.invoke(av8Var10, 0);
                } else {
                    av8Var10.W();
                }
                break;
            default:
                of3 of3Var11 = (of3) obj;
                int intValue11 = ((Integer) obj2).intValue();
                av8 av8Var11 = (av8) of3Var11;
                if (av8Var11.T(intValue11 & 1, (intValue11 & 3) != 2)) {
                    tc3Var.invoke(av8Var11, 0);
                } else {
                    av8Var11.W();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ b25(tc3 tc3Var, int i) {
        this.a = i;
        this.b = tc3Var;
    }
}
