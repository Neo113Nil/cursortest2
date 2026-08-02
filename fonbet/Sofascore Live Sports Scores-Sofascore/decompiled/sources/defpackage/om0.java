package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.newNetwork.EventGraphResponse;
import com.sofascore.results.R;
import com.sofascore.results.event.details.view.graph.AttackMomentumGraph;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class om0 extends h4 {
    public final dd d;
    public boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public om0(Context context) {
        super(context, null, 0);
        context.getClass();
        View root = getRoot();
        LinearLayout linearLayout = (LinearLayout) root;
        int i = R.id.graph;
        AttackMomentumGraph attackMomentumGraph = (AttackMomentumGraph) nq8.B(R.id.graph, root);
        if (attackMomentumGraph != null) {
            i = R.id.title;
            TextView textView = (TextView) nq8.B(R.id.title, root);
            if (textView != null) {
                this.d = new dd(linearLayout, attackMomentumGraph, textView, 1);
                this.e = true;
                o8.d(this, 0, 7);
                linearLayout.getClass();
                aba.y(linearLayout, 0, 3);
                linearLayout.setOnClickListener(new cn(3, this, context));
                return;
            }
        }
        yhk.s("Missing required view with ID: ".concat(root.getResources().getResourceName(i)));
        throw null;
    }

    public final boolean getAnimateBars() {
        return this.e;
    }

    @Override // defpackage.o8
    public int getLayoutId() {
        return R.layout.attack_momentum_layout;
    }

    @Override // defpackage.h4
    public final void j(Event event, EventGraphResponse eventGraphResponse, List list, boolean z, boolean z2) {
        String string;
        event.getClass();
        eventGraphResponse.getClass();
        if (eventGraphResponse.getGraphPoints().isEmpty()) {
            return;
        }
        setVisibility(0);
        setTime(event);
        dd ddVar = this.d;
        ((AttackMomentumGraph) ddVar.c).c(event, eventGraphResponse, list, event.getSportSlug(), this.e);
        TextView textView = (TextView) ddVar.d;
        String s = ok3.s(event);
        if (Intrinsics.c(s, Sports.ICE_HOCKEY)) {
            q9k q9kVar = nm0.ICE_HOCKEY.a;
            Context context = getContext();
            context.getClass();
            string = q9kVar.b(context);
        } else if (Intrinsics.c(s, Sports.FOOTBALL)) {
            q9k q9kVar2 = nm0.FOOTBALL.a;
            Context context2 = getContext();
            context2.getClass();
            string = q9kVar2.b(context2);
        } else {
            string = getContext().getString(R.string.football_match_momentum);
        }
        textView.setText(string);
    }

    public final void setAnimateBars(boolean z) {
        this.e = z;
    }

    @Override // defpackage.h4
    public void setTime(@NotNull Event event) {
        event.getClass();
        AttackMomentumGraph attackMomentumGraph = (AttackMomentumGraph) this.d.c;
        attackMomentumGraph.event = event;
        attackMomentumGraph.invalidate();
    }
}
