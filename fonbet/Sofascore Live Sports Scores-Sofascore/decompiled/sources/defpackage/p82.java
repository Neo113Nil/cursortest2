package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.sofascore.model.buzzer.APIBuzzerTile;
import com.sofascore.results.R;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class p82 extends g7 {
    public final String l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p82(Context context, String str) {
        super(context);
        context.getClass();
        this.l = str;
        this.m = ao2.s(8, context);
        this.n = ao2.s(148, context);
        this.o = ao2.s(4, context);
        this.p = ao2.s(112, context);
    }

    @Override // defpackage.ysk
    public final boolean j(int i, Object obj) {
        return false;
    }

    @Override // defpackage.g7
    public final f3 u(ArrayList arrayList) {
        ArrayList arrayList2 = this.i;
        arrayList2.getClass();
        return new th(arrayList2, arrayList, 3);
    }

    @Override // defpackage.g7
    public final int v(Object obj) {
        obj.getClass();
        return obj instanceof APIBuzzerTile ? ((APIBuzzerTile) obj).getType() : obj instanceof o82 ? 200 : 0;
    }

    @Override // defpackage.g7
    public final p8 z(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        Context context = this.b;
        View inflate = LayoutInflater.from(context).inflate(R.layout.buzzer_tile_base_view, viewGroup, false);
        ed a = ed.a(inflate);
        ViewGroup.LayoutParams layoutParams = ((FrameLayout) a.b).getLayoutParams();
        CardView cardView = (CardView) a.c;
        ViewGroup.LayoutParams layoutParams2 = cardView.getLayoutParams();
        layoutParams2.getClass();
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
        String str = this.l;
        if (Intrinsics.c(str, "buzzer_feed")) {
            layoutParams.width = -1;
            layoutParams.height = -2;
            int i2 = this.n;
            layoutParams3.width = i2;
            layoutParams3.height = i2;
            int i3 = this.m;
            layoutParams3.setMargins(i3, i3, i3, i3);
        } else {
            layoutParams.width = -2;
            layoutParams.height = -1;
            int i4 = this.p;
            layoutParams3.width = i4;
            layoutParams3.height = i4;
            int i5 = this.o;
            layoutParams3.setMargins(i5, i5, i5, i5);
        }
        if (i != 18) {
            if (i == 200) {
                View inflate2 = LayoutInflater.from(context).inflate(R.layout.buzzer_show_more_tile, viewGroup, false);
                cardView.addView(inflate2);
                cardView.setBackground(null);
                inflate.getClass();
                inflate2.getClass();
                return new ts1(inflate, inflate2, str, 9);
            }
            switch (i) {
                case 1:
                case 2:
                case 16:
                    break;
                case 3:
                    View inflate3 = LayoutInflater.from(context).inflate(R.layout.buzzer_top_event_tile, viewGroup, false);
                    cardView.addView(inflate3);
                    inflate.getClass();
                    inflate3.getClass();
                    str.getClass();
                    return new ts1(inflate, inflate3, str, 10);
                case 4:
                    View inflate4 = LayoutInflater.from(context).inflate(R.layout.buzzer_top_event_player_performance_tile, viewGroup, false);
                    cardView.addView(inflate4);
                    inflate.getClass();
                    inflate4.getClass();
                    return new ts1(inflate, inflate4, str, 2);
                case 5:
                    View inflate5 = LayoutInflater.from(context).inflate(R.layout.buzzer_ranking_tile, viewGroup, false);
                    cardView.addView(inflate5);
                    inflate.getClass();
                    inflate5.getClass();
                    return new ts1(inflate, inflate5, str, 8);
                case 6:
                    View inflate6 = LayoutInflater.from(context).inflate(R.layout.buzzer_basketball_top_event_player_performance_tile, viewGroup, false);
                    cardView.addView(inflate6);
                    inflate.getClass();
                    inflate6.getClass();
                    return new ts1(inflate, inflate6, str, 0);
                case 7:
                    View inflate7 = LayoutInflater.from(context).inflate(R.layout.buzzer_key_moment_tile, viewGroup, false);
                    cardView.addView(inflate7);
                    inflate.getClass();
                    inflate7.getClass();
                    return new ts1(inflate, inflate7, str, 6);
                case 8:
                    View inflate8 = LayoutInflater.from(context).inflate(R.layout.buzzer_cup_progression_tile, viewGroup, false);
                    cardView.addView(inflate8);
                    inflate.getClass();
                    inflate8.getClass();
                    return new ts1(inflate, inflate8, str, 1);
                case 9:
                    View inflate9 = LayoutInflater.from(context).inflate(R.layout.buzzer_formula_one_tile, viewGroup, false);
                    cardView.addView(inflate9);
                    inflate.getClass();
                    inflate9.getClass();
                    return new ts1(inflate, inflate9, str, 4);
                case 10:
                    View inflate10 = LayoutInflater.from(context).inflate(R.layout.buzzer_interesting_statistics_tile, viewGroup, false);
                    cardView.addView(inflate10);
                    inflate.getClass();
                    inflate10.getClass();
                    return new fy4(inflate, inflate10, str, 1);
                case 11:
                    View inflate11 = LayoutInflater.from(context).inflate(R.layout.buzzer_football_transfer_tile, viewGroup, false);
                    cardView.addView(inflate11);
                    inflate.getClass();
                    inflate11.getClass();
                    return new ts1(inflate, inflate11, str, 3);
                case 12:
                    View inflate12 = LayoutInflater.from(context).inflate(R.layout.buzzer_mma_tile, viewGroup, false);
                    cardView.addView(inflate12);
                    inflate.getClass();
                    inflate12.getClass();
                    return new ts1(inflate, inflate12, str, 7);
                case 13:
                    View inflate13 = LayoutInflater.from(context).inflate(R.layout.buzzer_detail_statistics_tile, viewGroup, false);
                    cardView.addView(inflate13);
                    inflate.getClass();
                    inflate13.getClass();
                    return new fy4(inflate, inflate13, str, 0);
                case 14:
                    View inflate14 = LayoutInflater.from(context).inflate(R.layout.buzzer_team_of_the_week_tile, viewGroup, false);
                    cardView.addView(inflate14);
                    inflate.getClass();
                    inflate14.getClass();
                    return new fy4(inflate, inflate14, str, 3);
                case 15:
                    View inflate15 = LayoutInflater.from(context).inflate(R.layout.buzzer_sofascore_promotional_rating_tile, viewGroup, false);
                    cardView.addView(inflate15);
                    inflate.getClass();
                    inflate15.getClass();
                    return new fy4(inflate, inflate15, str, 2);
                default:
                    ilg.c();
                    return null;
            }
        }
        View inflate16 = LayoutInflater.from(context).inflate(R.layout.buzzer_image_bg_tile, viewGroup, false);
        cardView.addView(inflate16);
        inflate.getClass();
        inflate16.getClass();
        return new ts1(inflate, inflate16, str, 5);
    }
}
