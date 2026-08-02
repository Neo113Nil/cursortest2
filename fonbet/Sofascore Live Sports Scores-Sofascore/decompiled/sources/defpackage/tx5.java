package defpackage;

import android.view.ViewTreeObserver;
import com.sofascore.results.event.details.EventDetailsFragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tx5 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tx5(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        dz5 dz5Var;
        int i = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((c19) obj).getClass();
                EventDetailsFragment eventDetailsFragment = (EventDetailsFragment) ((WeakReference) obj2).get();
                if (eventDetailsFragment != null) {
                    eventDetailsFragment.s = false;
                }
                w3f w3fVar = (w3f) ((WeakReference) obj3).get();
                if (w3fVar != null && (dz5Var = (dz5) ((WeakReference) obj4).get()) != null) {
                    dz5Var.k(w3fVar);
                }
                break;
            case 1:
                int intValue = ((Number) obj).intValue();
                if (intValue != ((List) obj3).size() - 1 || !((List) ((Pair) CollectionsKt.h0((ArrayList) obj4)).b).isEmpty()) {
                }
                break;
            case 2:
                kl3 kl3Var = (kl3) obj;
                kl3Var.getClass();
                rl3.d(kl3Var.d, ((ll3) obj2).f, 8.0f, 4);
                rl3.c(kl3Var.e, ((ll3) obj3).g, 4.0f, 4);
                rl3.d(kl3Var.f, ((ll3) obj4).d, 8.0f, 4);
                kl3Var.d(new c35("spread"));
                break;
            case 3:
                opf opfVar = (opf) obj2;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) obj3;
                yuk yukVar = (yuk) obj4;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(yukVar);
                } else {
                    opfVar.a.getViewTreeObserver().removeOnPreDrawListener(yukVar);
                }
                break;
            default:
                yo8 yo8Var = (yo8) obj4;
                g6b g6bVar = (g6b) obj3;
                r69 r69Var = (r69) obj2;
                g gVar = g.a;
                if (r69Var.e0(gVar)) {
                    r69Var.i(gVar, new a8p(24, g6bVar, yo8Var));
                } else {
                    g6bVar.d(yo8Var);
                }
                break;
        }
        return Unit.a;
    }
}
