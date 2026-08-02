package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import com.sofascore.results.fantasy.competition.leagues.bottomsheet.reorder.FantasyReorderLeaguesBottomSheet;
import com.sofascore.results.main.fantasy.center.reorder.FantasyReorderUserCompetitionsBottomSheet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xf7 extends bca {
    public final /* synthetic */ int d;
    public final /* synthetic */ BaseModalBottomSheetDialog e;

    public /* synthetic */ xf7(BaseModalBottomSheetDialog baseModalBottomSheetDialog, int i) {
        this.d = i;
        this.e = baseModalBottomSheetDialog;
    }

    @Override // defpackage.bca
    public final void c(RecyclerView recyclerView, u uVar) {
        int i = this.d;
        recyclerView.getClass();
        uVar.getClass();
        switch (i) {
            case 0:
                super.c(recyclerView, uVar);
                tf7 tf7Var = uVar instanceof tf7 ? (tf7) uVar : null;
                if (tf7Var != null) {
                    ((eoh) tf7Var.d).setValue(Boolean.FALSE);
                    break;
                }
                break;
            default:
                super.c(recyclerView, uVar);
                fv6 fv6Var = uVar instanceof fv6 ? (fv6) uVar : null;
                if (fv6Var != null) {
                    ((eoh) fv6Var.d).setValue(Boolean.FALSE);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.bca
    public final int i(RecyclerView recyclerView, u uVar) {
        int i = this.d;
        recyclerView.getClass();
        uVar.getClass();
        switch (i) {
        }
        return bca.n(3, 0);
    }

    @Override // defpackage.bca
    public final boolean q(RecyclerView recyclerView, u uVar, u uVar2) {
        int i = this.d;
        BaseModalBottomSheetDialog baseModalBottomSheetDialog = this.e;
        recyclerView.getClass();
        uVar.getClass();
        switch (i) {
            case 0:
                return ((uf7) ((FantasyReorderLeaguesBottomSheet) baseModalBottomSheetDialog).D.getValue()).E(uVar, uVar2);
            default:
                return ((gv6) ((FantasyReorderUserCompetitionsBottomSheet) baseModalBottomSheetDialog).D.getValue()).E(uVar, uVar2);
        }
    }

    @Override // defpackage.bca
    public final void s(u uVar, int i) {
        switch (this.d) {
            case 0:
                if (i == 2) {
                    tf7 tf7Var = uVar instanceof tf7 ? (tf7) uVar : null;
                    if (tf7Var != null) {
                        ((eoh) tf7Var.d).setValue(Boolean.TRUE);
                        break;
                    }
                }
                break;
            default:
                if (i == 2) {
                    fv6 fv6Var = uVar instanceof fv6 ? (fv6) uVar : null;
                    if (fv6Var != null) {
                        ((eoh) fv6Var.d).setValue(Boolean.TRUE);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.bca
    public final void t(u uVar, int i) {
        int i2 = this.d;
        uVar.getClass();
    }
}
