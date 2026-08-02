package com.vk.clips.design.view.timeline;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import java.util.List;
import xsna.ad0;
import xsna.bpn0;
import xsna.dn70;
import xsna.f4m;
import xsna.gp6;
import xsna.ixd;
import xsna.izs;
import xsna.k6p;
import xsna.las;
import xsna.maj;
import xsna.mwe0;
import xsna.s3q0;
import xsna.s6k;
import xsna.t0w0;
import xsna.xq3;

/* compiled from: FragmentActionsView.kt */
/* loaded from: classes16.dex */
public final class FragmentActionsView extends c {
    public static final int g = dn70.b(52);
    public static final int h = dn70.b(4);
    public izs<? super las, s3q0> d;
    public final bpn0 e;
    public final b f;

    /* compiled from: FragmentActionsView.kt */
    public static final class a extends RecyclerView.e0 {
        public final s6k l;
        public final ActionButton m;
        public las n;

        public a(ViewGroup viewGroup, s6k s6kVar) {
            super(viewGroup);
            this.l = s6kVar;
            this.m = (ActionButton) this.itemView.findViewById(R.id.fragment_action_button);
            viewGroup.setOnClickListener(new k6p(this, 2));
        }
    }

    public FragmentActionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.e = new bpn0(new maj(this, 13));
        b bVar = new b(this);
        this.f = bVar;
        LayoutInflater.from(context).inflate(R.layout.timeline_fragment_actions_view, this);
        float dimension = context.getResources().getDimension(R.dimen.bg_timeline_fragment_actions_corner_radius);
        setClipToOutline(true);
        setOutlineProvider(new t0w0(dimension, true, true));
        setBackgroundResource(R.drawable.bg_timeline_segment_action_view);
        ixd ixdVar = ad0.g;
        ixd.a aVar = (ixdVar == null ? null : ixdVar).b;
        setBackgroundTintList(ColorStateList.valueOf(context.getColor(R.color.vk_azure_300)));
        RecyclerView actionsList = getActionsList();
        actionsList.setLayoutManager(new LinearLayoutManager(0, false));
        actionsList.setAdapter(bVar);
    }

    public static void c(FragmentActionsView fragmentActionsView) {
        RecyclerView.e0 findViewHolderForAdapterPosition;
        View view;
        if (fragmentActionsView.f.getItemCount() <= 0 || (findViewHolderForAdapterPosition = fragmentActionsView.getActionsList().findViewHolderForAdapterPosition(0)) == null || (view = findViewHolderForAdapterPosition.itemView) == null) {
            return;
        }
        view.performAccessibilityAction(64, null);
    }

    private final RecyclerView getActionsList() {
        return (RecyclerView) this.e.getValue();
    }

    public final void d() {
        announceForAccessibility(getContext().getString(R.string.accessibility_timeline_fragment_actions_opened));
        getActionsList().post(new xq3(this, 7));
    }

    public final void e(gp6 gp6Var) {
        if (gp6Var == null) {
            return;
        }
        f4m.t(((((int) gp6Var.u().top) - g) - ((int) mwe0.q)) - h, this);
        f4m.q((int) gp6Var.u().top, this);
    }

    public final izs<las, s3q0> getOnActionListener() {
        return this.d;
    }

    public final void setActions(List<las> list) {
        this.f.setItems(list);
    }

    public final void setOnActionListener(izs<? super las, s3q0> izsVar) {
        this.d = izsVar;
    }
}
