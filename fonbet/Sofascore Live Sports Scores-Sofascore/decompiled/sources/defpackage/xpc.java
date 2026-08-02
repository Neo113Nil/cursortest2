package defpackage;

import android.view.View;
import androidx.recyclerview.widget.n;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.mma.organisation.rankings.MmaOrganisationRankingsFragment;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class xpc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MmaOrganisationRankingsFragment b;

    public /* synthetic */ xpc(MmaOrganisationRankingsFragment mmaOrganisationRankingsFragment, int i) {
        this.a = i;
        this.b = mmaOrganisationRankingsFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 0;
        Object obj2 = null;
        MmaOrganisationRankingsFragment mmaOrganisationRankingsFragment = this.b;
        switch (i) {
            case 0:
                ((View) obj).getClass();
                krk krkVar = mmaOrganisationRankingsFragment.l;
                krkVar.getClass();
                ((gp8) krkVar).b.g(false, true, true);
                krk krkVar2 = mmaOrganisationRankingsFragment.l;
                krkVar2.getClass();
                n layoutManager = ((gp8) krkVar2).g.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.startSmoothScroll((g8b) mmaOrganisationRankingsFragment.y.getValue());
                }
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                Iterator<E> it = mqc.c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (Intrinsics.c(((mqc) next).name(), str)) {
                            obj2 = next;
                        }
                    }
                }
                mqc mqcVar = (mqc) obj2;
                if (mqcVar != null) {
                    String string = mmaOrganisationRankingsFragment.getResources().getString(mqcVar.a);
                    if (string == null) {
                    }
                }
                break;
            case 2:
                UniqueTournament uniqueTournament = (UniqueTournament) obj;
                uniqueTournament.getClass();
                mmaOrganisationRankingsFragment.r = uniqueTournament;
                break;
            case 3:
                List list = (List) obj;
                mmaOrganisationRankingsFragment.n();
                if (list != null) {
                    if (!mmaOrganisationRankingsFragment.v) {
                        mmaOrganisationRankingsFragment.v = true;
                        krk krkVar3 = mmaOrganisationRankingsFragment.l;
                        krkVar3.getClass();
                        TypeHeaderView typeHeaderView = ((gp8) krkVar3).f;
                        kp5 kp5Var = mqc.c;
                        ArrayList arrayList = new ArrayList(k13.r(kp5Var, 10));
                        Iterator<E> it2 = kp5Var.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(((mqc) it2.next()).name());
                        }
                        TypeHeaderView.z(typeHeaderView, arrayList, null, 2);
                    }
                    krk krkVar4 = mmaOrganisationRankingsFragment.l;
                    krkVar4.getClass();
                    ((gp8) krkVar4).b.setVisibility(0);
                    krk krkVar5 = mmaOrganisationRankingsFragment.l;
                    krkVar5.getClass();
                    ((gp8) krkVar5).d.setVisibility(8);
                    krk krkVar6 = mmaOrganisationRankingsFragment.l;
                    krkVar6.getClass();
                    ((gp8) krkVar6).f.setVisibility(0);
                    krk krkVar7 = mmaOrganisationRankingsFragment.l;
                    krkVar7.getClass();
                    ((gp8) krkVar7).f.requestLayout();
                    krk krkVar8 = mmaOrganisationRankingsFragment.l;
                    krkVar8.getClass();
                    ((gp8) krkVar8).e.setVisibility(0);
                } else {
                    krk krkVar9 = mmaOrganisationRankingsFragment.l;
                    krkVar9.getClass();
                    ((gp8) krkVar9).b.setVisibility(8);
                    krk krkVar10 = mmaOrganisationRankingsFragment.l;
                    krkVar10.getClass();
                    ((gp8) krkVar10).d.setVisibility(0);
                    krk krkVar11 = mmaOrganisationRankingsFragment.l;
                    krkVar11.getClass();
                    ((gp8) krkVar11).e.setVisibility(8);
                    krk krkVar12 = mmaOrganisationRankingsFragment.l;
                    krkVar12.getClass();
                    if (((gp8) krkVar12).f.getSelectedItem() != null) {
                        krk krkVar13 = mmaOrganisationRankingsFragment.l;
                        krkVar13.getClass();
                        ((gp8) krkVar13).f.setVisibility(8);
                    }
                }
                break;
            default:
                zl2 zl2Var = (zl2) obj;
                zl2Var.getClass();
                int i3 = zl2Var.b;
                Integer valueOf = i3 != -1 ? Integer.valueOf(i3) : null;
                if (valueOf != null) {
                    ((g8b) mmaOrganisationRankingsFragment.y.getValue()).setTargetPosition(valueOf.intValue());
                    krk krkVar14 = mmaOrganisationRankingsFragment.l;
                    krkVar14.getClass();
                    mmaOrganisationRankingsFragment.t(((gp8) krkVar14).g, new xpc(mmaOrganisationRankingsFragment, i2));
                }
                break;
        }
        return Unit.a;
    }
}
