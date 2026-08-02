package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class v0j extends g7 {
    public final String l;
    public final LayoutInflater m;
    public Integer n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0j(Context context, String str) {
        super(context);
        context.getClass();
        str.getClass();
        this.l = str;
        this.m = LayoutInflater.from(context);
    }

    @Override // defpackage.g7
    public final void F(List list) {
        list.getClass();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            if ((obj instanceof jei) && !(CollectionsKt.a0(i2, list) instanceof jei)) {
                ((jei) obj).d = true;
            }
            i = i2;
        }
        super.F(list);
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return false;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        return null;
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        boolean z = obj instanceof iei;
        String str = this.l;
        if (z) {
            return Intrinsics.c(str, Sports.BASKETBALL) ? 2 : 0;
        }
        if (obj instanceof jei) {
            return Intrinsics.c(str, Sports.BASKETBALL) ? 3 : 1;
        }
        if (obj instanceof w5b) {
            return 4;
        }
        ilg.c();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        LayoutInflater layoutInflater = this.m;
        if (i == 0) {
            return new gai(kqb.c(layoutInflater, viewGroup), new w1i(this, 11));
        }
        Gender gender = null;
        int i2 = 2;
        if (i == 1) {
            return new uih(h04.c(layoutInflater, viewGroup), gender, i2);
        }
        if (i == 2) {
            View inflate = layoutInflater.inflate(R.layout.statistics_basketball_header, viewGroup, false);
            TextView textView = (TextView) nq8.B(R.id.title, inflate);
            if (textView != null) {
                return new wh(new dk2((LinearLayout) inflate, textView, 10));
            }
            yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.title)));
            return null;
        }
        if (i != 3) {
            if (i == 4) {
                return new j8i(gh5.c(layoutInflater.inflate(R.layout.legend_item_layout, viewGroup, false)));
            }
            ilg.c();
            return null;
        }
        View inflate2 = layoutInflater.inflate(R.layout.basketball_statistics_ranking_row, viewGroup, false);
        int i3 = R.id.label;
        TextView textView2 = (TextView) nq8.B(R.id.label, inflate2);
        if (textView2 != null) {
            i3 = R.id.ranking;
            TextView textView3 = (TextView) nq8.B(R.id.ranking, inflate2);
            if (textView3 != null) {
                i3 = R.id.value;
                TextView textView4 = (TextView) nq8.B(R.id.value, inflate2);
                if (textView4 != null) {
                    return new gai(this, new hs1((LinearLayout) inflate2, textView2, textView3, textView4, 0));
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i3)));
        return null;
    }
}
