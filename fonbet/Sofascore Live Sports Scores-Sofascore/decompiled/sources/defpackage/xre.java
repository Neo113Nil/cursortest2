package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.Sports;
import com.sofascore.model.newNetwork.statistics.season.player.HighlightedPlayerStatistic;
import com.sofascore.results.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xre extends o8 {
    public final vy1 d;
    public final List e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xre(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.highlighted_item_0;
        View B = nq8.B(R.id.highlighted_item_0, root);
        if (B != null) {
            vba a = vba.a(B);
            i = R.id.highlighted_item_1;
            View B2 = nq8.B(R.id.highlighted_item_1, root);
            if (B2 != null) {
                vba a2 = vba.a(B2);
                i = R.id.highlighted_item_2;
                View B3 = nq8.B(R.id.highlighted_item_2, root);
                if (B3 != null) {
                    vba a3 = vba.a(B3);
                    i = R.id.highlighted_item_3;
                    View B4 = nq8.B(R.id.highlighted_item_3, root);
                    if (B4 != null) {
                        vba a4 = vba.a(B4);
                        i = R.id.space_1;
                        if (((Space) nq8.B(R.id.space_1, root)) != null) {
                            i = R.id.space_2;
                            if (((Space) nq8.B(R.id.space_2, root)) != null) {
                                i = R.id.space_3;
                                if (((Space) nq8.B(R.id.space_3, root)) != null) {
                                    LinearLayout linearLayout = (LinearLayout) root;
                                    this.d = new vy1(linearLayout, a, a2, a3, a4);
                                    List j = b.j(a, a2, a3, a4);
                                    this.e = j;
                                    linearLayout.getClass();
                                    linearLayout.setVisibility(8);
                                    for (Object obj : j) {
                                        obj.getClass();
                                        int color = context.getColor(R.color.n_lv_4);
                                        Drawable background = ((vba) obj).e.getBackground();
                                        v9g.M(background, R.id.layer_frame_top, color);
                                        v9g.M(background, R.id.layer_frame_bottom, color);
                                    }
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Sequence<View> getLabelViews() {
        LinearLayout linearLayout = this.d.b;
        linearLayout.getClass();
        return i5h.g(pea.u(linearLayout), new jie(12));
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.view_highlighted_player_statistics;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x011e, code lost:
    
        if (r7 != null) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(String str, Map map, boolean z, int i) {
        Iterable<ure> iterable;
        String str2;
        map.getClass();
        int i2 = 8;
        if (map.size() <= 3) {
            setVisibility(8);
            return;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1160328212) {
                if (hashCode != 108869083) {
                    if (hashCode == 727149765 && str.equals(Sports.BASKETBALL)) {
                        xbb b = a.b();
                        kp5 kp5Var = tre.g;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : kp5Var) {
                            if (!((tre) obj).c) {
                                arrayList.add(obj);
                            }
                        }
                        b.addAll(arrayList);
                        tre treVar = tre.d;
                        HighlightedPlayerStatistic highlightedPlayerStatistic = (HighlightedPlayerStatistic) map.get("steals");
                        tre treVar2 = tre.e;
                        HighlightedPlayerStatistic highlightedPlayerStatistic2 = (HighlightedPlayerStatistic) map.get("blocks");
                        if ((highlightedPlayerStatistic != null ? z ? highlightedPlayerStatistic.getRankTotal() : highlightedPlayerStatistic.getRankPerGame() : Integer.MAX_VALUE) <= (highlightedPlayerStatistic2 != null ? z ? highlightedPlayerStatistic2.getRankTotal() : highlightedPlayerStatistic2.getRankPerGame() : Integer.MAX_VALUE)) {
                            highlightedPlayerStatistic2 = highlightedPlayerStatistic;
                        }
                        if (!Intrinsics.c(highlightedPlayerStatistic2, highlightedPlayerStatistic)) {
                            treVar = treVar2;
                        }
                        b.add(treVar);
                        iterable = a.a(b);
                    }
                } else if (str.equals(Sports.RUGBY)) {
                    iterable = vre.d;
                }
            } else if (str.equals(Sports.VOLLEYBALL)) {
                iterable = wre.d;
            }
            if (iterable != null) {
                setVisibility(8);
                return;
            }
            setVisibility(0);
            n(-2);
            int i3 = 0;
            for (ure ureVar : iterable) {
                int i4 = i3 + 1;
                Object obj2 = this.e.get(i3);
                obj2.getClass();
                vba vbaVar = (vba) obj2;
                int d = ureVar.d();
                HighlightedPlayerStatistic highlightedPlayerStatistic3 = (HighlightedPlayerStatistic) map.get(ureVar.g());
                Integer value = highlightedPlayerStatistic3 != null ? highlightedPlayerStatistic3.getValue() : null;
                ConstraintLayout constraintLayout = vbaVar.a;
                if (value != null) {
                    constraintLayout.setVisibility(0);
                    vbaVar.b.setText(d);
                    TextView textView = vbaVar.d;
                    Integer value2 = highlightedPlayerStatistic3.getValue();
                    if (value2 != null) {
                        int intValue = value2.intValue();
                        str2 = z ? String.valueOf(intValue) : yid.c("%.1f", Double.valueOf(intValue / i));
                    }
                    str2 = "-";
                    textView.setText(str2);
                    vbaVar.c.setText("#" + (z ? highlightedPlayerStatistic3.getRankTotal() : highlightedPlayerStatistic3.getRankPerGame()));
                } else {
                    constraintLayout.setVisibility(8);
                }
                i3 = i4;
            }
            LinearLayout linearLayout = this.d.b;
            linearLayout.getClass();
            if (!linearLayout.isLaidOut() || linearLayout.isLayoutRequested()) {
                linearLayout.addOnLayoutChangeListener(new b2(this, i2));
                return;
            }
            Iterator it = getLabelViews().iterator();
            if (!it.hasNext()) {
                yhk.d();
                return;
            }
            int height = ((View) it.next()).getHeight();
            while (it.hasNext()) {
                int height2 = ((View) it.next()).getHeight();
                if (height < height2) {
                    height = height2;
                }
            }
            n(height);
            return;
        }
        iterable = null;
        if (iterable != null) {
        }
    }

    public final void n(int i) {
        for (View view : getLabelViews()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                yhk.s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            } else {
                layoutParams.height = i;
                view.setLayoutParams(layoutParams);
            }
        }
    }
}
