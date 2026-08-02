package defpackage;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.sofascore.results.bettingtips.fragment.HighValueStreaksFragment;
import com.sofascore.results.dialog.FollowSubStagesDialog;
import com.sofascore.results.manager.matches.ManagerEventsFragment;
import com.sofascore.results.matchOfTheWeek.MatchOfTheWeekBottomSheet;
import com.sofascore.results.mma.fighter.editfighter.MmaEditFighterDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hv7 extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hv7(Object obj, int i) {
        super(0);
        this.i = i;
        this.j = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ye4 ye4Var;
        sg3 sg3Var;
        switch (this.i) {
            case 0:
                return (ttk) ((gv7) this.j).invoke();
            case 1:
                return (ttk) ((hx7) this.j).invoke();
            case 2:
                ((ne8) this.j).m1();
                return Unit.a;
            case 3:
                return (FollowSubStagesDialog) this.j;
            case 4:
                return (ttk) ((hv7) this.j).invoke();
            case 5:
                ry8 ry8Var = (ry8) this.j;
                synchronized (ry8.d) {
                    ye4Var = ry8.f;
                    if (ye4Var == null) {
                        Context context = ry8Var.a;
                        KProperty[] kPropertyArr = my8.a;
                        ye4Var = (ye4) ry8.e.getValue(context, my8.a[0]);
                        ry8.f = ye4Var;
                    }
                }
                return ye4Var;
            case 6:
                return (HighValueStreaksFragment) this.j;
            case 7:
                return (ttk) ((hv7) this.j).invoke();
            case 8:
                return (ttk) ((yb9) this.j).invoke();
            case 9:
                Object systemService = ((View) ((ejg) this.j).c).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 10:
                o7a o7aVar = (o7a) this.j;
                long nanoTime = System.nanoTime();
                esf esfVar = new esf();
                esf esfVar2 = new esf();
                synchronized (o7aVar.c) {
                    esfVar.a = nanoTime - o7aVar.e;
                    esfVar2.a = 1000000000 / o7aVar.d;
                    Unit unit = Unit.a;
                }
                xw3.L(o7aVar.a, null, null, new h2(esfVar, esfVar2, o7aVar, nanoTime, (rq3) null), 3);
                return Unit.a;
            case 11:
                ana anaVar = ((wma) this.j).G;
                anaVar.p.A = true;
                zkb zkbVar = anaVar.q;
                if (zkbVar != null) {
                    zkbVar.u = true;
                }
                return Unit.a;
            case 12:
                cna cnaVar = (cna) this.j;
                if (!((Boolean) ((eoh) cnaVar.g).getValue()).booleanValue() && (sg3Var = cnaVar.c) != null) {
                    sg3Var.p();
                }
                return Unit.a;
            case 13:
                return (ttk) ((dua) this.j).invoke();
            case 14:
                return (ttk) ((sva) this.j).invoke();
            case 15:
                return (ttk) ((qwa) this.j).invoke();
            case 16:
                return (ttk) ((vya) this.j).invoke();
            case 17:
                return (ttk) ((qza) this.j).invoke();
            case 18:
                return (ttk) ((g4b) this.j).invoke();
            case 19:
                r45 r45Var = (r45) ((c7b) this.j).a.b;
                if (!r45Var.b) {
                    if (r45Var.c) {
                        i3f.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    r45Var.b();
                    r45Var.c = true;
                }
                return Unit.a;
            case 20:
                return (ttk) ((seb) this.j).invoke();
            case 21:
                return Float.valueOf(((Number) ((flb) this.j).getValue()).floatValue());
            case 22:
                return (ManagerEventsFragment) this.j;
            case 23:
                return (ttk) ((hv7) this.j).invoke();
            case 24:
                return (MatchOfTheWeekBottomSheet) this.j;
            case 25:
                return (ttk) ((hv7) this.j).invoke();
            case 26:
                return (ttk) ((yxb) this.j).invoke();
            case 27:
                return (ttk) ((f7c) this.j).invoke();
            case 28:
                return (MmaEditFighterDialog) this.j;
            default:
                return (ttk) ((hv7) this.j).invoke();
        }
    }
}
