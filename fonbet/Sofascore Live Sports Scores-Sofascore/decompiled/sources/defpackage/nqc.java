package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.sofascore.model.newNetwork.newRankings.RankingRow;
import com.sofascore.model.newNetwork.newRankings.RankingType;
import com.sofascore.results.R;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class nqc extends g7 {
    public ArrayList l;

    public final boolean G(int i) {
        Object a0 = CollectionsKt.a0((i - this.g.size()) + 1, this.i);
        boolean z = false;
        if (a0 != null && v(a0) == 3) {
            z = true;
        }
        return !z;
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return i == 1 || i == 2 || i == 3;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new ame(arrayList2, arrayList, 20);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        if (obj instanceof RankingRow) {
            return ((RankingRow) obj).getPosition() == 0 ? 2 : 3;
        }
        if (obj instanceof RankingType) {
            return 1;
        }
        if (Intrinsics.c(obj, 4)) {
            return 4;
        }
        throw new IllegalAccessException();
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        Context context = this.b;
        if (i == 1) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.sub_section_left_with_icon, viewGroup, false);
            inflate.getClass();
            return new l32(inflate);
        }
        if (i == 2) {
            View inflate2 = LayoutInflater.from(context).inflate(R.layout.mma_fighter_rankings_champion_item, viewGroup, false);
            inflate2.getClass();
            return new dlc(inflate2, true, new v9b(1, this, nqc.class, "isLastFighter", "isLastFighter(I)Z", 0, 17));
        }
        if (i == 3) {
            View inflate3 = LayoutInflater.from(context).inflate(R.layout.mma_fighter_rankings_item, viewGroup, false);
            inflate3.getClass();
            return new roc(inflate3, true, new v9b(1, this, nqc.class, "isLastFighter", "isLastFighter(I)Z", 0, 16));
        }
        if (i != 4) {
            ilg.c();
            return null;
        }
        View inflate4 = LayoutInflater.from(context).inflate(R.layout.mma_rankings_header_subtitle, viewGroup, false);
        inflate4.getClass();
        return new ja9(inflate4);
    }
}
