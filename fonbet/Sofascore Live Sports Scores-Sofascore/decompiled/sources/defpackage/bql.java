package defpackage;

import android.content.Context;
import com.blaze.blazesdk.custom_views.BlazeRecyclerView;
import com.blaze.blazesdk.style.widgets.BlazeWidgetLayout;
import com.blaze.blazesdk.widgets.ui.BlazeBaseWidget;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bql implements ct8 {
    public final /* synthetic */ BlazeWidgetLayout a;
    public final /* synthetic */ BlazeBaseWidget b;

    public bql(BlazeWidgetLayout blazeWidgetLayout, BlazeBaseWidget blazeBaseWidget) {
        this.a = blazeWidgetLayout;
        this.b = blazeBaseWidget;
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        myd mydVar;
        xtc xtcVar = (xtc) obj;
        ((Number) obj3).intValue();
        xtcVar.getClass();
        av8 av8Var = (av8) ((of3) obj2);
        av8Var.d0(2084228322);
        Integer maxDisplayItemsCount = this.a.getMaxDisplayItemsCount();
        if (maxDisplayItemsCount != null && maxDisplayItemsCount.intValue() == 1) {
            av8Var.s(false);
            return xtcVar;
        }
        BlazeRecyclerView widgetRecyclerView$blazesdk_release = this.b.getWidgetRecyclerView$blazesdk_release();
        int i = v10.a;
        Context context = (Context) av8Var.k(nz.b);
        kx4 kx4Var = (kx4) av8Var.k(dh3.h);
        kyd kydVar = (kyd) av8Var.k(lyd.a);
        a99 a99Var = nf3.a;
        if (kydVar == null) {
            av8Var.d0(-1555403601);
            av8Var.s(false);
            mydVar = null;
        } else {
            av8Var.d0(-1555370896);
            boolean g = av8Var.g(context) | av8Var.g(kx4Var) | av8Var.g(kydVar);
            Object O = av8Var.O();
            if (g || O == a99Var) {
                n00 n00Var = new n00(context, kx4Var, kydVar.a, kydVar.b);
                av8Var.n0(n00Var);
                O = n00Var;
            }
            mydVar = (n00) O;
            av8Var.s(false);
        }
        if (mydVar == null) {
            mydVar = wug.a;
        }
        myd mydVar2 = mydVar;
        ewd ewdVar = ewd.b;
        av8Var.d0(33057276);
        boolean g2 = av8Var.g(widgetRecyclerView$blazesdk_release);
        Object O2 = av8Var.O();
        if (g2 || O2 == a99Var) {
            O2 = new iol(widgetRecyclerView$blazesdk_release, 1);
            av8Var.n0(O2);
        }
        av8Var.s(false);
        xtc a = nyd.a(bvg.a(xtcVar, haa.u((Function1) O2, av8Var, 0), ewdVar, mydVar2, false, false, null, 248), mydVar2);
        av8Var.s(false);
        return a;
    }
}
