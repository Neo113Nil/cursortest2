package defpackage;

import android.animation.LayoutTransition;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sofascore.common.widget.NestedHorizontalScrollView;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.SubTeam;
import com.sofascore.model.mvvm.model.TennisEvent;
import com.sofascore.results.R;
import com.sofascore.results.view.graph.TennisPowerGraph;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class p6j extends o8 {
    public static final /* synthetic */ int k = 0;
    public final bu1 d;
    public n6j e;
    public Event f;
    public final boolean g;
    public boolean h;
    public boolean i;
    public g9i j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6j(Context context, boolean z) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        int i = R.id.first_player_1;
        ImageView imageView = (ImageView) nq8.B(R.id.first_player_1, root);
        if (imageView != null) {
            i = R.id.first_player_2;
            ImageView imageView2 = (ImageView) nq8.B(R.id.first_player_2, root);
            if (imageView2 != null) {
                i = R.id.info_button;
                ImageView imageView3 = (ImageView) nq8.B(R.id.info_button, root);
                if (imageView3 != null) {
                    i = R.id.match_time;
                    TextView textView = (TextView) nq8.B(R.id.match_time, root);
                    if (textView != null) {
                        i = R.id.second_player_1;
                        ImageView imageView4 = (ImageView) nq8.B(R.id.second_player_1, root);
                        if (imageView4 != null) {
                            i = R.id.second_player_2;
                            ImageView imageView5 = (ImageView) nq8.B(R.id.second_player_2, root);
                            if (imageView5 != null) {
                                i = R.id.shadow;
                                View B = nq8.B(R.id.shadow, root);
                                if (B != null) {
                                    i = R.id.tennis_power_holder;
                                    TennisPowerGraph tennisPowerGraph = (TennisPowerGraph) nq8.B(R.id.tennis_power_holder, root);
                                    if (tennisPowerGraph != null) {
                                        i = R.id.tennis_power_scroll_view;
                                        NestedHorizontalScrollView nestedHorizontalScrollView = (NestedHorizontalScrollView) nq8.B(R.id.tennis_power_scroll_view, root);
                                        if (nestedHorizontalScrollView != null) {
                                            this.d = new bu1((ConstraintLayout) root, imageView, imageView2, imageView3, textView, imageView4, imageView5, B, tennisPowerGraph, nestedHorizontalScrollView);
                                            this.g = hkg.c0(context);
                                            this.h = true;
                                            setShowAsCard(z);
                                            o8.d(this, 0, 7);
                                            setVisibility(8);
                                            LayoutTransition layoutTransition = new LayoutTransition();
                                            layoutTransition.setAnimateParentHierarchy(false);
                                            setLayoutTransition(layoutTransition);
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
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setMatchTime(Event event) {
        CharSequence sb;
        String u = z8e.u(getContext(), event.getStatusDescription(), ok3.s(event), true);
        long totalPeriodTime = event.getTotalPeriodTime();
        Long valueOf = Long.valueOf(totalPeriodTime);
        if (totalPeriodTime <= 0) {
            valueOf = null;
        }
        String C = valueOf != null ? ug5.C(valueOf.longValue()) : null;
        if (ok3.D(event)) {
            Long currentPeriodTime = event.getCurrentPeriodTime();
            String C2 = currentPeriodTime != null ? ug5.C(currentPeriodTime.longValue()) : null;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getContext().getColor(R.color.live));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) u);
            if (C2 != null) {
                spannableStringBuilder.append((CharSequence) " - ".concat(C2));
            }
            spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
            if (!Intrinsics.c(C, C2) && C != null) {
                ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(getContext().getColor(R.color.n_lv_1));
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) bf3.k(" (", getContext().getString(R.string.total), ": ", C, ")"));
                spannableStringBuilder.setSpan(foregroundColorSpan2, length2, spannableStringBuilder.length(), 17);
            }
            sb = new SpannedString(spannableStringBuilder);
        } else {
            g9i g9iVar = this.j;
            if (g9iVar != null) {
                g9iVar.e(null);
            }
            StringBuilder q = fc6.q(u);
            if (C != null) {
                q.append(" - ".concat(C));
            }
            sb = q.toString();
        }
        ((TextView) this.d.e).setText(sb);
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.view_tennis_power_graph;
    }

    public final void l(n6j n6jVar, Event event, boolean z, boolean z2, Function0 function0) {
        g9i g9iVar;
        n6jVar.getClass();
        event.getClass();
        setVisibility(0);
        this.e = n6jVar;
        this.f = event;
        bu1 bu1Var = this.d;
        TextView textView = (TextView) bu1Var.e;
        NestedHorizontalScrollView nestedHorizontalScrollView = (NestedHorizontalScrollView) bu1Var.k;
        ImageView imageView = (ImageView) bu1Var.h;
        ImageView imageView2 = (ImageView) bu1Var.g;
        ImageView imageView3 = (ImageView) bu1Var.j;
        TennisPowerGraph tennisPowerGraph = (TennisPowerGraph) bu1Var.i;
        textView.setVisibility(!z2 ? 0 : 8);
        if (function0 != null) {
            tennisPowerGraph.setOnClickListener(new s61(11, function0));
        }
        boolean F = ok3.F(event);
        ImageView imageView4 = (ImageView) bu1Var.d;
        int i = 1;
        rq3 rq3Var = null;
        if (F) {
            SubTeam subTeam1 = Event.getHomeTeam$default(event, null, 1, null).getSubTeam1();
            as9.o(imageView4, subTeam1 != null ? subTeam1.getId() : 0);
            SubTeam subTeam2 = Event.getHomeTeam$default(event, null, 1, null).getSubTeam2();
            as9.o(imageView3, subTeam2 != null ? subTeam2.getId() : 0);
            SubTeam subTeam12 = Event.getAwayTeam$default(event, null, 1, null).getSubTeam1();
            as9.o(imageView2, subTeam12 != null ? subTeam12.getId() : 0);
            SubTeam subTeam22 = Event.getAwayTeam$default(event, null, 1, null).getSubTeam2();
            as9.o(imageView, subTeam22 != null ? subTeam22.getId() : 0);
            imageView3.setVisibility(0);
            imageView.setVisibility(0);
        } else {
            as9.o(imageView4, Event.getHomeTeam$default(event, null, 1, null).getId());
            as9.o(imageView2, Event.getAwayTeam$default(event, null, 1, null).getId());
        }
        tennisPowerGraph.d = event instanceof TennisEvent ? (TennisEvent) event : null;
        tennisPowerGraph.e = z;
        if (!Intrinsics.c(tennisPowerGraph.c, n6jVar)) {
            tennisPowerGraph.c = n6jVar;
            tennisPowerGraph.requestLayout();
        }
        tennisPowerGraph.invalidate();
        nestedHorizontalScrollView.setOnScrollChangeListener(new hye(this, i));
        if (ok3.D(event) && (g9iVar = this.j) == null) {
            if (g9iVar != null) {
                g9iVar.e(null);
            }
            u6b w = qha.w(this);
            if (w != null) {
                g6b lifecycle = w.getLifecycle();
                lifecycle.a(new h6(6, lifecycle, this));
                wd5 wd5Var = xd5.b;
                long R = wkn.R(1, be5.MINUTES);
                e6b e6bVar = e6b.a;
                this.j = xw3.L(wca.x(w.getLifecycle()), null, null, new a74(w, new ej(this, rq3Var, 7), R, (rq3) null), 3);
            }
        } else {
            setMatchTime(event);
        }
        if (this.h) {
            this.h = false;
            nestedHorizontalScrollView.post(new pn0(this, this.g ? 17 : 66, 18));
        }
    }

    public final void n(Event event, h84 h84Var) {
        p6j p6jVar;
        n6j n6jVar = this.e;
        if (n6jVar != null) {
            p6jVar = this;
            p6jVar.l(n6jVar, event, true, false, null);
        } else {
            p6jVar = this;
        }
        if (h84Var != null) {
            ImageView imageView = (ImageView) p6jVar.d.c;
            imageView.setVisibility(0);
            imageView.setOnClickListener(new s61(10, h84Var));
        }
    }
}
