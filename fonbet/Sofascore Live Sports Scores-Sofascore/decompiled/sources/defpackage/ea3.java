package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import com.sofascore.model.mvvm.model.PinnedTournament;
import com.sofascore.results.main.matches.redesign.competitions.CompetitionsFragment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ea3 extends bca {
    public final /* synthetic */ CompetitionsFragment d;

    public ea3(CompetitionsFragment competitionsFragment) {
        this.d = competitionsFragment;
    }

    @Override // defpackage.bca
    public final boolean a(RecyclerView recyclerView, u uVar, u uVar2) {
        recyclerView.getClass();
        uVar.getClass();
        uVar2.getClass();
        return uVar2 instanceof aa3;
    }

    @Override // defpackage.bca
    public final void c(RecyclerView recyclerView, u uVar) {
        recyclerView.getClass();
        uVar.getClass();
        super.c(recyclerView, uVar);
        CompetitionsFragment competitionsFragment = this.d;
        ArrayList arrayList = competitionsFragment.C().i;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof PinnedTournament) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = competitionsFragment.C().i;
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (next2 instanceof y93) {
                arrayList4.add(next2);
            }
        }
        y93 y93Var = (y93) CollectionsKt.firstOrNull(arrayList4);
        if (y93Var != null) {
            ArrayList arrayList5 = y93Var.c;
            arrayList5.clear();
            arrayList5.addAll(arrayList2);
        }
    }

    @Override // defpackage.bca
    public final int i(RecyclerView recyclerView, u uVar) {
        recyclerView.getClass();
        uVar.getClass();
        return bca.n(3, 0);
    }

    @Override // defpackage.bca
    public final boolean q(RecyclerView recyclerView, u uVar, u uVar2) {
        recyclerView.getClass();
        uVar.getClass();
        return this.d.C().E(uVar, uVar2);
    }

    @Override // defpackage.bca
    public final void t(u uVar, int i) {
        uVar.getClass();
    }
}
