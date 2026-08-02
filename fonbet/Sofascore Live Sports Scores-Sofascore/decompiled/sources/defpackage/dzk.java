package defpackage;

import android.content.Context;
import androidx.viewpager2.widget.ViewPager2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dzk extends hoi implements Function2 {
    public /* synthetic */ Object r;
    public final /* synthetic */ syl s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzk(syl sylVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = sylVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        dzk dzkVar = new dzk(this.s, rq3Var);
        dzkVar.r = obj;
        return dzkVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        dzk dzkVar = new dzk(this.s, (rq3) obj2);
        dzkVar.r = (List) obj;
        return dzkVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        List list = (List) this.r;
        if (list.isEmpty()) {
            return Unit.a;
        }
        n7m b = fgm.b(list);
        int i = syl.C;
        syl sylVar = this.s;
        if (((sqm) sylVar.getViewModel()).e == null) {
            sqm sqmVar = (sqm) sylVar.getViewModel();
            Context context = sylVar.getContext();
            boolean z = context != null && cnb.f(context) == 0;
            d0h d0hVar = d0h.d;
            d0hVar.getClass();
            sqmVar.w(true, z, b, d0hVar);
        }
        fam famVar = ((sqm) sylVar.getViewModel()).e;
        if (famVar != null) {
            ((qdm) sylVar.getPlayerRendererBridge()).a(famVar);
        } else {
            w0m.detachPlayer$default(sylVar.getPlayerRendererBridge(), false, 1, null);
        }
        mpm mpmVar = sylVar.t;
        if (mpmVar != null) {
            mpmVar.s(list);
        }
        if (sylVar.B) {
            return Unit.a;
        }
        udm udmVar = sylVar.q;
        udmVar.j.c(((sqm) sylVar.getViewModel()).m0, false);
        ViewPager2 viewPager2 = udmVar.j;
        viewPager2.getClass();
        viewPager2.setVisibility(0);
        sylVar.B = true;
        return Unit.a;
    }
}
