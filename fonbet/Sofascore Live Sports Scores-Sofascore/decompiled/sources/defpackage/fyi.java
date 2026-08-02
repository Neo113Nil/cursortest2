package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.divider.MaterialDivider;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.results.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fyi extends g7 {
    public final tug l;
    public final String m;
    public int n;
    public eyi o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyi(Context context, tug tugVar, String str) {
        super(context);
        context.getClass();
        tugVar.getClass();
        this.l = tugVar;
        this.m = str;
        this.n = 1;
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return true;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        return this.o;
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        ((qyi) obj).getClass();
        return 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        View inflate = LayoutInflater.from(this.b).inflate(R.layout.item_team_player_stats_row, viewGroup, false);
        int i2 = R.id.container;
        LinearLayout linearLayout = (LinearLayout) nq8.B(R.id.container, inflate);
        if (linearLayout != null) {
            i2 = R.id.divider;
            MaterialDivider materialDivider = (MaterialDivider) nq8.B(R.id.divider, inflate);
            if (materialDivider != null) {
                i2 = R.id.guideline;
                if (((Guideline) nq8.B(R.id.guideline, inflate)) != null) {
                    i2 = R.id.player_name;
                    TextView textView = (TextView) nq8.B(R.id.player_name, inflate);
                    if (textView != null) {
                        i2 = R.id.player_number;
                        TextView textView2 = (TextView) nq8.B(R.id.player_number, inflate);
                        if (textView2 != null) {
                            i2 = R.id.player_position;
                            TextView textView3 = (TextView) nq8.B(R.id.player_position, inflate);
                            if (textView3 != null) {
                                i2 = R.id.scroller;
                                ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) nq8.B(R.id.scroller, inflate);
                                if (scrollInterceptorHorizontalScrollView != null) {
                                    return new km1(new v82((ConstraintLayout) inflate, linearLayout, materialDivider, textView, textView2, textView3, scrollInterceptorHorizontalScrollView), this.l, this.m, new tj4(0, 22, fyi.class, this, "currentSortIndex", "getCurrentSortIndex()I"));
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        return null;
    }
}
