package defpackage;

import android.content.Context;
import androidx.viewpager2.widget.ViewPager2;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kol extends hoi implements Function2 {
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ obm t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kol(obm obmVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.t = obmVar;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        kol kolVar = new kol(this.t, rq3Var);
        kolVar.s = obj;
        return kolVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kol kolVar = new kol(this.t, (rq3) obj2);
        kolVar.s = (List) obj;
        return kolVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        int i = this.r;
        obm obmVar = this.t;
        if (i == 0) {
            y6a.M(obj);
            List list = (List) this.s;
            if (list.isEmpty()) {
                return Unit.a;
            }
            n7m b = fgm.b(((xlm) CollectionsKt.Y(list)).b);
            int i2 = obm.D;
            if (((ilm) obmVar.getViewModel()).e == null) {
                ilm ilmVar = (ilm) obmVar.getViewModel();
                Context context = obmVar.getContext();
                boolean z = context != null && cnb.f(context) == 0;
                d0h d0hVar = d0h.d;
                d0hVar.getClass();
                ilmVar.w(false, z, b, d0hVar);
            }
            fam famVar = ((ilm) obmVar.getViewModel()).e;
            if (famVar != null) {
                ((qdm) obmVar.getPlayerRendererBridge()).a(famVar);
            } else {
                w0m.detachPlayer$default(obmVar.getPlayerRendererBridge(), false, 1, null);
            }
            urm urmVar = obmVar.r;
            if (urmVar != null) {
                urmVar.s(list);
            }
            if (obmVar.B) {
                return Unit.a;
            }
            int storyEntryPointIndex$default = ilm.getStoryEntryPointIndex$default((ilm) obmVar.getViewModel(), null, 1, null);
            orm ormVar = obmVar.q;
            ViewPager2 viewPager2 = ormVar.e;
            viewPager2.c(storyEntryPointIndex$default, false);
            viewPager2.getClass();
            viewPager2.setVisibility(0);
            urm urmVar2 = obmVar.r;
            if (urmVar2 != null) {
                Boolean bool = (Boolean) ((ilm) obmVar.getViewModel()).H.d();
                boolean booleanValue = bool != null ? bool.booleanValue() : false;
                int currentItem = viewPager2.getCurrentItem();
                this.s = ormVar;
                this.r = 1;
                if (urmVar2.z(booleanValue, currentItem, this) == lu3Var) {
                    return lu3Var;
                }
            }
        } else {
            if (i != 1) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
        }
        obmVar.B = true;
        return Unit.a;
    }
}
