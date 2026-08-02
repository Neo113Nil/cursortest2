package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.Sports;
import com.sofascore.model.newNetwork.UniqueTournamentGroup;
import com.sofascore.results.R;
import com.sofascore.results.view.typeheader.TypeHeaderView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class tv7 extends o8 {
    public final bu1 d;
    public cai e;
    public wai f;
    public ArrayList g;
    public x9i h;
    public bv7 i;
    public List j;
    public boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv7(Context context) {
        super(context, null, 0);
        context.getClass();
        int i = 0;
        View root = getRoot();
        int i2 = R.id.description;
        View B = nq8.B(R.id.description, root);
        if (B != null) {
            rfe a = rfe.a(B);
            i2 = R.id.header_title;
            if (((TextView) nq8.B(R.id.header_title, root)) != null) {
                i2 = R.id.standings_switcher;
                View B2 = nq8.B(R.id.standings_switcher, root);
                if (B2 != null) {
                    e92 e = e92.e(B2);
                    i2 = R.id.table;
                    if (((LinearLayout) nq8.B(R.id.table, root)) != null) {
                        i2 = R.id.table_header;
                        View B3 = nq8.B(R.id.table_header, root);
                        if (B3 != null) {
                            n9i a2 = n9i.a(B3);
                            i2 = R.id.table_team_1;
                            View B4 = nq8.B(R.id.table_team_1, root);
                            if (B4 != null) {
                                n9i a3 = n9i.a(B4);
                                i2 = R.id.table_team_2;
                                View B5 = nq8.B(R.id.table_team_2, root);
                                if (B5 != null) {
                                    n9i a4 = n9i.a(B5);
                                    i2 = R.id.table_team_3;
                                    View B6 = nq8.B(R.id.table_team_3, root);
                                    if (B6 != null) {
                                        n9i a5 = n9i.a(B6);
                                        i2 = R.id.table_team_4;
                                        View B7 = nq8.B(R.id.table_team_4, root);
                                        if (B7 != null) {
                                            n9i a6 = n9i.a(B7);
                                            i2 = R.id.table_team_5;
                                            View B8 = nq8.B(R.id.table_team_5, root);
                                            if (B8 != null) {
                                                n9i a7 = n9i.a(B8);
                                                i2 = R.id.table_team_6;
                                                View B9 = nq8.B(R.id.table_team_6, root);
                                                if (B9 != null) {
                                                    this.d = new bu1((CardView) root, a, e, a2, a3, a4, a5, a6, a7, n9i.a(B9));
                                                    this.e = d7a.z(context, Sports.FOOTBALL);
                                                    this.j = km5.a;
                                                    ((LinearLayout) e.f).setVisibility(8);
                                                    g5k g5kVar = new g5k((TypeHeaderView) e.b);
                                                    g5kVar.d = new sv7(this, i);
                                                    g5kVar.m = new ur1(this, 7);
                                                    g5kVar.g = new tc3(-1902502999, new s16(this, 24), true);
                                                    g5kVar.b();
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i2)));
        throw null;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.view_featured_tournament_standings;
    }

    @NotNull
    public final List<UniqueTournamentGroup> getTournamentGroups() {
        return this.j;
    }

    public final void j() {
        wai waiVar = this.f;
        if (waiVar != null) {
            cai caiVar = this.e;
            caiVar.getClass();
            waiVar.b = caiVar;
        }
        ArrayList<bbi> arrayList = this.g;
        if (arrayList != null) {
            for (bbi bbiVar : arrayList) {
                cai caiVar2 = this.e;
                bbiVar.getClass();
                caiVar2.getClass();
                bbiVar.e = caiVar2;
            }
        }
        wai waiVar2 = this.f;
        bu1 bu1Var = this.d;
        int i = 0;
        if (waiVar2 != null) {
            n9i n9iVar = (n9i) bu1Var.f;
            y6a.t(n9iVar, waiVar2, new iai(), b.j(n9iVar.b, n9iVar.c, n9iVar.d, n9iVar.e, n9iVar.f, n9iVar.g, n9iVar.h, n9iVar.i, n9iVar.j), false);
        }
        int i2 = 0;
        for (Object obj : b.j((n9i) bu1Var.h, (n9i) bu1Var.i, (n9i) bu1Var.b, (n9i) bu1Var.d, (n9i) bu1Var.j, (n9i) bu1Var.k)) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                b.q();
                throw null;
            }
            n9i n9iVar2 = (n9i) obj;
            n9iVar2.getClass();
            ArrayList arrayList2 = this.g;
            bbi bbiVar2 = arrayList2 != null ? (bbi) CollectionsKt.a0(i2, arrayList2) : null;
            ConstraintLayout constraintLayout = n9iVar2.a;
            constraintLayout.getClass();
            constraintLayout.setVisibility(bbiVar2 != null ? i : 8);
            if (bbiVar2 != null) {
                List j = b.j(n9iVar2.b, n9iVar2.c, n9iVar2.d, n9iVar2.e, n9iVar2.f, n9iVar2.g, n9iVar2.h, n9iVar2.i, n9iVar2.j);
                Map h = tub.h(new Pair(n9iVar2.w, n9iVar2.l), new Pair(n9iVar2.x, n9iVar2.m), new Pair(n9iVar2.y, n9iVar2.n), new Pair(n9iVar2.z, n9iVar2.o), new Pair(n9iVar2.A, n9iVar2.p), new Pair(n9iVar2.B, n9iVar2.q));
                aba.y(constraintLayout, 0, 3);
                constraintLayout.setOnClickListener(new au7(2, this, bbiVar2));
                y6a.u(n9iVar2, bbiVar2, new iai(), j, h, false);
            }
            i2 = i3;
            i = 0;
        }
        x9i x9iVar = this.h;
        if (x9iVar != null) {
            y6a.s((rfe) bu1Var.e, x9iVar, false);
        }
    }
}
