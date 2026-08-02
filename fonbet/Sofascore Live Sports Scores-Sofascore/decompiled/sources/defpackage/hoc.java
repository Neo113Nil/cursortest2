package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.CustomizableDivider;
import com.sofascore.model.newNetwork.newRankings.RankingRow;
import com.sofascore.results.R;
import com.sofascore.results.redesign.dividers.SofaDivider;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hoc extends g7 {
    @Override // defpackage.g7
    public final void F(List list) {
        list.getClass();
        xbb b = a.b();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            b.add(obj);
            if (i != list.size() - 1) {
                b.add(new CustomizableDivider(true, 1, false, null, 12, null));
            }
            i = i2;
        }
        super.F(a.a(b));
    }

    @Override // defpackage.ysk
    public final boolean b() {
        return true;
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return obj instanceof RankingRow;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new th(arrayList2, arrayList, 27);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (!(obj instanceof RankingRow)) {
            goc[] gocVarArr = goc.a;
            return 2;
        }
        if (((RankingRow) obj).getPosition() == 0) {
            goc[] gocVarArr2 = goc.a;
            return 0;
        }
        goc[] gocVarArr3 = goc.a;
        return 1;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        goc[] gocVarArr = goc.a;
        Context context = this.b;
        if (i == 0) {
            ConstraintLayout constraintLayout = (ConstraintLayout) z82.d(LayoutInflater.from(context).inflate(R.layout.mma_fighter_rankings_champion_item, viewGroup, false)).b;
            constraintLayout.getClass();
            return new dlc(constraintLayout, false, new clc(0));
        }
        if (i != 1) {
            return new wh(new SofaDivider(context, null, 6));
        }
        ConstraintLayout constraintLayout2 = eoc.a(LayoutInflater.from(context).inflate(R.layout.mma_fighter_rankings_item, viewGroup, false)).b;
        constraintLayout2.getClass();
        return new roc(constraintLayout2, false, new clc(0));
    }
}
