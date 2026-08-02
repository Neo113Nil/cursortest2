package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.FootballShotmapItem;
import com.sofascore.results.R;
import com.sofascore.results.event.statistics.view.football.FootballShotmapView;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import com.sofascore.results.view.typeheader.SegmentedButtonsView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public class ml8 extends o8 {
    public final Event d;
    public final ct8 e;
    public final ik8 f;
    public FootballShotmapItem g;
    public final boolean h;
    public boolean i;
    public Map j;
    public List k;
    public vk8 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml8(Context context, Event event, s16 s16Var) {
        super(context, null, 0);
        Throwable th;
        LinearLayout linearLayout;
        context.getClass();
        final int i = 0;
        this.d = event;
        this.e = s16Var;
        View root = getRoot();
        int i2 = R.id.empty_state;
        GraphicLarge graphicLarge = (GraphicLarge) nq8.B(R.id.empty_state, root);
        if (graphicLarge != null) {
            i2 = R.id.footer_card;
            View B = nq8.B(R.id.footer_card, root);
            if (B != null) {
                int i3 = R.id.arrow_left;
                ImageView imageView = (ImageView) nq8.B(R.id.arrow_left, B);
                if (imageView != null) {
                    i3 = R.id.arrow_right;
                    ImageView imageView2 = (ImageView) nq8.B(R.id.arrow_right, B);
                    if (imageView2 != null) {
                        i3 = R.id.divider_1_1;
                        View B2 = nq8.B(R.id.divider_1_1, B);
                        if (B2 != null) {
                            i3 = R.id.divider_1_2;
                            View B3 = nq8.B(R.id.divider_1_2, B);
                            if (B3 != null) {
                                i3 = R.id.divider_2_1;
                                View B4 = nq8.B(R.id.divider_2_1, B);
                                if (B4 != null) {
                                    i3 = R.id.divider_2_2;
                                    View B5 = nq8.B(R.id.divider_2_2, B);
                                    if (B5 != null) {
                                        i3 = R.id.info_1_1;
                                        View B6 = nq8.B(R.id.info_1_1, B);
                                        if (B6 != null) {
                                            y2a a = y2a.a(B6);
                                            i3 = R.id.info_1_2;
                                            View B7 = nq8.B(R.id.info_1_2, B);
                                            if (B7 != null) {
                                                y2a a2 = y2a.a(B7);
                                                i3 = R.id.info_1_3;
                                                View B8 = nq8.B(R.id.info_1_3, B);
                                                if (B8 != null) {
                                                    y2a a3 = y2a.a(B8);
                                                    LinearLayout linearLayout2 = a3.a;
                                                    int i4 = R.id.info_2_1;
                                                    View B9 = nq8.B(R.id.info_2_1, B);
                                                    if (B9 != null) {
                                                        y2a a4 = y2a.a(B9);
                                                        i4 = R.id.info_2_2;
                                                        View B10 = nq8.B(R.id.info_2_2, B);
                                                        if (B10 != null) {
                                                            y2a a5 = y2a.a(B10);
                                                            i4 = R.id.info_2_3;
                                                            View B11 = nq8.B(R.id.info_2_3, B);
                                                            if (B11 != null) {
                                                                y2a a6 = y2a.a(B11);
                                                                LinearLayout linearLayout3 = a6.a;
                                                                int i5 = R.id.minute;
                                                                TextView textView = (TextView) nq8.B(R.id.minute, B);
                                                                if (textView != null) {
                                                                    i5 = R.id.player_click_overlay;
                                                                    View B12 = nq8.B(R.id.player_click_overlay, B);
                                                                    if (B12 != null) {
                                                                        i5 = R.id.player_image;
                                                                        ImageView imageView3 = (ImageView) nq8.B(R.id.player_image, B);
                                                                        if (imageView3 != null) {
                                                                            i5 = R.id.player_name;
                                                                            TextView textView2 = (TextView) nq8.B(R.id.player_name, B);
                                                                            if (textView2 != null) {
                                                                                xk8 xk8Var = new xk8((ConstraintLayout) B, imageView, imageView2, B2, B3, B4, B5, a, a2, a3, a4, a5, a6, textView, B12, imageView3, textView2);
                                                                                int i6 = R.id.graphs_card;
                                                                                View B13 = nq8.B(R.id.graphs_card, root);
                                                                                if (B13 != null) {
                                                                                    dd c = dd.c(B13);
                                                                                    i6 = R.id.sofascore_watermark;
                                                                                    ImageView imageView4 = (ImageView) nq8.B(R.id.sofascore_watermark, root);
                                                                                    if (imageView4 != null) {
                                                                                        i6 = R.id.team_selector;
                                                                                        SegmentedButtonsView segmentedButtonsView = (SegmentedButtonsView) nq8.B(R.id.team_selector, root);
                                                                                        if (segmentedButtonsView != null) {
                                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) root;
                                                                                            this.f = new ik8(constraintLayout, graphicLarge, xk8Var, c, imageView4, segmentedButtonsView);
                                                                                            final int i7 = 1;
                                                                                            this.i = true;
                                                                                            lm5 lm5Var = lm5.a;
                                                                                            lm5Var.getClass();
                                                                                            this.j = lm5Var;
                                                                                            this.k = km5.a;
                                                                                            this.l = vk8.a;
                                                                                            setVisibility(8);
                                                                                            ((LinearLayout) c.b).setClipToOutline(true);
                                                                                            aba.y(B12, 0, 3);
                                                                                            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: jl8
                                                                                                public final /* synthetic */ ml8 b;

                                                                                                {
                                                                                                    this.b = this;
                                                                                                }

                                                                                                @Override // android.view.View.OnClickListener
                                                                                                public final void onClick(View view) {
                                                                                                    int i8 = i;
                                                                                                    ml8 ml8Var = this.b;
                                                                                                    switch (i8) {
                                                                                                        case 0:
                                                                                                            ml8Var.j(kl8.LEFT);
                                                                                                            break;
                                                                                                        default:
                                                                                                            ml8Var.j(kl8.RIGHT);
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                            });
                                                                                            imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: jl8
                                                                                                public final /* synthetic */ ml8 b;

                                                                                                {
                                                                                                    this.b = this;
                                                                                                }

                                                                                                @Override // android.view.View.OnClickListener
                                                                                                public final void onClick(View view) {
                                                                                                    int i8 = i7;
                                                                                                    ml8 ml8Var = this.b;
                                                                                                    switch (i8) {
                                                                                                        case 0:
                                                                                                            ml8Var.j(kl8.LEFT);
                                                                                                            break;
                                                                                                        default:
                                                                                                            ml8Var.j(kl8.RIGHT);
                                                                                                            break;
                                                                                                    }
                                                                                                }
                                                                                            });
                                                                                            Boolean bool = Boolean.FALSE;
                                                                                            Pair pair = new Pair(bool, bool);
                                                                                            vqg vqgVar = new vqg(29);
                                                                                            hl7 hl7Var = new hl7(this, 17);
                                                                                            t1h[] t1hVarArr = {new r1h("FIRST", new tc3(2136467272, new ll8(this, i), true)), new r1h("SECOND", new tc3(-19660151, new ll8(this, i7), true))};
                                                                                            rlh rlhVar = rlh.b;
                                                                                            rlhVar.getClass();
                                                                                            hfe d = rlhVar.d();
                                                                                            o13.w(d, t1hVarArr);
                                                                                            b7 d2 = d.d();
                                                                                            segmentedButtonsView.k = hl7Var;
                                                                                            segmentedButtonsView.g = false;
                                                                                            segmentedButtonsView.h = pair;
                                                                                            segmentedButtonsView.j = v1h.f;
                                                                                            segmentedButtonsView.i = vqgVar;
                                                                                            d2 = d2 == null ? rlh.b : d2;
                                                                                            if (!d2.isEmpty()) {
                                                                                                SegmentedButtonsView.t(segmentedButtonsView, d2, null, 6);
                                                                                            }
                                                                                            setupShotmap(Integer.valueOf(event.getId()));
                                                                                            constraintLayout.getClass();
                                                                                            aba.G(constraintLayout);
                                                                                            if (Intrinsics.c(event.getHasXg(), Boolean.TRUE)) {
                                                                                                this.h = true;
                                                                                                B3.setVisibility(0);
                                                                                                B5.setVisibility(0);
                                                                                                linearLayout = linearLayout2;
                                                                                                linearLayout.setVisibility(0);
                                                                                                linearLayout3.setVisibility(0);
                                                                                            } else {
                                                                                                linearLayout = linearLayout2;
                                                                                            }
                                                                                            imageView4.setVisibility(8);
                                                                                            a.a.setBackground(null);
                                                                                            a2.a.setBackground(null);
                                                                                            linearLayout.setBackground(null);
                                                                                            a4.a.setBackground(null);
                                                                                            a5.a.setBackground(null);
                                                                                            linearLayout3.setBackground(null);
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                i2 = i6;
                                                                                th = null;
                                                                                yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i2)));
                                                                                throw th;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                i3 = i5;
                                                            }
                                                        }
                                                    }
                                                    i3 = i4;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                yhk.s("Missing required view with ID: ".concat(B.getResources().getResourceName(i3)));
                throw null;
            }
        }
        th = null;
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i2)));
        throw th;
    }

    private final void setEmptyStateVisibility(boolean z) {
        ik8 ik8Var = this.f;
        ((ConstraintLayout) ik8Var.c.g).setVisibility(!z ? 0 : 8);
        LinearLayout linearLayout = (LinearLayout) ik8Var.d.b;
        linearLayout.getClass();
        linearLayout.setVisibility(!z ? 0 : 8);
        ik8Var.b.setVisibility(z ? 0 : 8);
    }

    private final void setupShotmap(Integer num) {
        FootballShotmapView footballShotmapView = (FootballShotmapView) ((dd) this.f.d.d).c;
        footballShotmapView.setOnShotSelectedCallback(new yx7(this, 14));
        footballShotmapView.setAnalyticsCallback(new ij8(3, num, footballShotmapView));
    }

    @NotNull
    public final ik8 getBinding() {
        return this.f;
    }

    @NotNull
    public final Event getEvent() {
        return this.d;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.football_match_shotmap;
    }

    @NotNull
    public final FootballShotmapItem getSelectedShot() {
        FootballShotmapItem footballShotmapItem = this.g;
        if (footballShotmapItem != null) {
            return footballShotmapItem;
        }
        Intrinsics.i("selectedShot");
        throw null;
    }

    @NotNull
    public final vk8 getTeamSide() {
        return this.l;
    }

    public final void j(kl8 kl8Var) {
        int id = this.d.getId();
        Context context = getContext();
        context.getClass();
        nv.D(context, id, "arrow_click", uk8.EVENT_STATISTICS);
        int indexOf = this.k.indexOf(getSelectedShot()) + kl8Var.a;
        int size = this.k.size();
        int i = indexOf % size;
        ((FootballShotmapView) ((dd) this.f.d.d).c).c((FootballShotmapItem) this.k.get(i + (size & (((i ^ size) & ((-i) | i)) >> 31))));
    }

    public final void l(List list) {
        List B0 = CollectionsKt.B0(list);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : B0) {
            vk8 vk8Var = ((FootballShotmapItem) obj).isHome() ? vk8.a : vk8.b;
            Object obj2 = linkedHashMap.get(vk8Var);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(vk8Var, obj2);
            }
            ((List) obj2).add(obj);
        }
        this.j = linkedHashMap;
        if (this.i) {
            Collection collection = (Collection) linkedHashMap.get(vk8.a);
            if (collection == null || collection.isEmpty()) {
                Map map = this.j;
                vk8 vk8Var2 = vk8.b;
                Collection collection2 = (Collection) map.get(vk8Var2);
                if (collection2 != null && !collection2.isEmpty()) {
                    setTeamSide(vk8Var2);
                    this.f.f.q(this.l.name(), false);
                }
            }
            this.i = false;
        }
        n(false);
    }

    public final void n(boolean z) {
        List list = (List) this.j.get(this.l);
        if (list == null) {
            list = km5.a;
        }
        this.k = list;
        if (!list.isEmpty()) {
            List list2 = this.k;
            setVisibility(!list2.isEmpty() ? 0 : 8);
            ((FootballShotmapView) ((dd) this.f.d.d).c).h(list2, this.l, z, (r10 & 8) != 0, false);
        }
        setEmptyStateVisibility(this.k.isEmpty());
    }

    public final void setShotSelection(@NotNull FootballShotmapItem footballShotmapItem) {
        footballShotmapItem.getClass();
        ((FootballShotmapView) ((dd) this.f.d.d).c).c(footballShotmapItem);
    }

    public final void setTeamSide(@NotNull vk8 vk8Var) {
        vk8Var.getClass();
        this.l = vk8Var;
        n(true);
        if (this.i) {
            return;
        }
        Context context = getContext();
        context.getClass();
        nv.D(context, this.d.getId(), "team_toggle", uk8.EVENT_STATISTICS);
    }
}
