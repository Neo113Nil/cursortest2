package defpackage;

import android.view.ViewGroup;
import androidx.fragment.app.g;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zs4 extends xka implements Function0 {
    public final /* synthetic */ int i = 0;
    public final /* synthetic */ g j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ ViewGroup l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zs4(g gVar, Object obj, ViewGroup viewGroup) {
        super(0);
        this.j = gVar;
        this.k = obj;
        this.l = viewGroup;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        ViewGroup viewGroup = this.l;
        Object obj = this.k;
        g gVar = this.j;
        switch (i) {
            case 0:
                gVar.f.e(viewGroup, obj);
                break;
            default:
                ArrayList arrayList = gVar.c;
                mq8 mq8Var = gVar.f;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (!((at4) it.next()).a.g) {
                            rj2 rj2Var = new rj2();
                            mq8Var.u(((at4) arrayList.get(0)).a.c, obj, rj2Var, new wb3(gVar, 12));
                            rj2Var.b();
                            break;
                        }
                    }
                }
                Object obj2 = gVar.q;
                obj2.getClass();
                mq8Var.d(obj2, new mc3(22, gVar, viewGroup));
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zs4(g gVar, ViewGroup viewGroup, Object obj) {
        super(0);
        this.j = gVar;
        this.l = viewGroup;
        this.k = obj;
    }
}
