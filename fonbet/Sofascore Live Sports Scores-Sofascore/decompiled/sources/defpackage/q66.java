package defpackage;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.results.event.scorecard.EventScorecardFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class q66 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventScorecardFragment b;

    public /* synthetic */ q66(EventScorecardFragment eventScorecardFragment, int i) {
        this.a = i;
        this.b = eventScorecardFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        EventScorecardFragment eventScorecardFragment = this.b;
        switch (i) {
            case 0:
                float floatValue = ((Float) obj).floatValue();
                krk krkVar = eventScorecardFragment.l;
                krkVar.getClass();
                ((yq8) krkVar).b.setElevation(floatValue);
                break;
            case 1:
                e1d e1dVar = eventScorecardFragment.y;
                List list = (List) obj;
                int size = list.size();
                e1d e1dVar2 = eventScorecardFragment.x;
                if (size != ((List) ((eoh) e1dVar2).getValue()).size()) {
                    ((eoh) e1dVar2).setValue(list);
                }
                if (eventScorecardFragment.w) {
                    eventScorecardFragment.w = false;
                    Object d = ((mr5) eventScorecardFragment.r.getValue()).v.d();
                    if (d == null) {
                        a70.r("Required value was null.");
                        break;
                    } else {
                        ((eoh) e1dVar).setValue(me4.t(StatusKt.STATUS_IN_PROGRESS, (Event) d) ? (q16) CollectionsKt.j0((List) ((eoh) e1dVar2).getValue()) : (q16) CollectionsKt.firstOrNull((List) ((eoh) e1dVar2).getValue()));
                    }
                }
                q16 q16Var = (q16) ((eoh) e1dVar).getValue();
                if (q16Var != null) {
                    ((p66) eventScorecardFragment.t.getValue()).F(q16Var.b);
                }
                break;
            default:
                q16 q16Var2 = (q16) obj;
                q16Var2.getClass();
                ((eoh) eventScorecardFragment.y).setValue(q16Var2);
                ((p66) eventScorecardFragment.t.getValue()).F(q16Var2.b);
                ArrayList arrayList = q16Var2.c;
                LinkedHashMap linkedHashMap = eventScorecardFragment.z;
                linkedHashMap.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    qtg qtgVar = (qtg) it.next();
                    ConstraintLayout constraintLayout = (ConstraintLayout) p12.d(eventScorecardFragment.getLayoutInflater(), null).b;
                    constraintLayout.setId(View.generateViewId());
                    p12 b = p12.b(constraintLayout);
                    Context requireContext = eventScorecardFragment.requireContext();
                    requireContext.getClass();
                    tol.l(b, requireContext, qtgVar.a);
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) b.d;
                    constraintLayout2.getClass();
                    Context requireContext2 = eventScorecardFragment.requireContext();
                    requireContext2.getClass();
                    int s = ao2.s(24, requireContext2);
                    Context requireContext3 = eventScorecardFragment.requireContext();
                    requireContext3.getClass();
                    constraintLayout2.setPaddingRelative(s, constraintLayout2.getPaddingTop(), ao2.s(24, requireContext3), constraintLayout2.getPaddingBottom());
                    linkedHashMap.put(qtgVar, constraintLayout);
                }
                break;
        }
        return Unit.a;
    }
}
