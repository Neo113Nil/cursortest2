package com.vk.im.reactions.impl.set_reaction;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.reactions.impl.set_reaction.list.ReactionListController;
import com.vkontakte.android.R;
import xsna.asp;
import xsna.brj0;
import xsna.bwt0;
import xsna.cn70;
import xsna.cpj0;
import xsna.dp0;
import xsna.f1f0;
import xsna.f4m;
import xsna.gzs;
import xsna.hbw;
import xsna.izs;
import xsna.oi40;
import xsna.p31;
import xsna.paw;
import xsna.q1f0;
import xsna.qcy;
import xsna.s3q0;
import xsna.u3c0;
import xsna.wzs;
import xsna.zaw;
import xsna.zrp;

/* compiled from: SetReactionViewHolderDelegate.kt */
/* loaded from: classes2.dex */
public final class SetReactionViewHolderDelegate implements q1f0, cpj0 {
    public final hbw b;
    public final zaw c;
    public final paw d;
    public final Msg e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final wzs<Integer, Integer, s3q0> i;
    public gzs<s3q0> j;
    public final izs<Integer, s3q0> k;
    public final String l;
    public final StaticSizeStyle m;
    public ReactionListController n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SetReactionViewHolderDelegate.kt */
    public static final class StaticSizeStyle {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StaticSizeStyle[] $VALUES;
        public static final StaticSizeStyle AlwaysCollapsed;
        public static final StaticSizeStyle AlwaysExpanded;

        static {
            StaticSizeStyle staticSizeStyle = new StaticSizeStyle("AlwaysExpanded", 0);
            AlwaysExpanded = staticSizeStyle;
            StaticSizeStyle staticSizeStyle2 = new StaticSizeStyle("AlwaysCollapsed", 1);
            AlwaysCollapsed = staticSizeStyle2;
            StaticSizeStyle[] staticSizeStyleArr = {staticSizeStyle, staticSizeStyle2};
            $VALUES = staticSizeStyleArr;
            $ENTRIES = new asp(staticSizeStyleArr);
        }

        public StaticSizeStyle() {
            throw null;
        }

        public static StaticSizeStyle valueOf(String str) {
            return (StaticSizeStyle) Enum.valueOf(StaticSizeStyle.class, str);
        }

        public static StaticSizeStyle[] values() {
            return (StaticSizeStyle[]) $VALUES.clone();
        }
    }

    /* compiled from: SetReactionViewHolderDelegate.kt */
    public static final class a {
        public final Integer a;
        public final Integer b;
        public final Integer c;
        public final Integer d;
        public final boolean e;
        public final boolean f;

        public a(Integer num, Integer num2, Integer num3, Integer num4, int i) {
            num = (i & 1) != 0 ? null : num;
            num2 = (i & 2) != 0 ? null : num2;
            num3 = (i & 4) != 0 ? null : num3;
            num4 = (i & 8) != 0 ? null : num4;
            boolean z = (i & 16) == 0;
            boolean z2 = (i & 32) == 0;
            this.a = num;
            this.b = num2;
            this.c = num3;
            this.d = num4;
            this.e = z;
            this.f = z2;
        }
    }

    public SetReactionViewHolderDelegate(hbw hbwVar, zaw zawVar, paw pawVar, Msg msg, boolean z, boolean z2, boolean z3, wzs wzsVar, gzs gzsVar, izs izsVar, String str, StaticSizeStyle staticSizeStyle, int i) {
        gzsVar = (i & 512) != 0 ? new u3c0(1) : gzsVar;
        izsVar = (i & 1024) != 0 ? new oi40(14) : izsVar;
        staticSizeStyle = (i & 4096) != 0 ? null : staticSizeStyle;
        this.b = hbwVar;
        this.c = zawVar;
        this.d = pawVar;
        this.e = msg;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = wzsVar;
        this.j = gzsVar;
        this.k = izsVar;
        this.l = str;
        this.m = staticSizeStyle;
    }

    @Override // xsna.cpj0
    public final void a(ViewGroup viewGroup, brj0 brj0Var, izs<? super brj0, s3q0> izsVar) {
        RecyclerView recyclerView;
        StaticSizeStyle staticSizeStyle = this.m;
        int i = staticSizeStyle == null ? -1 : com.vk.im.reactions.impl.set_reaction.a.$EnumSwitchMapping$0[staticSizeStyle.ordinal()];
        ReactionListController.StaticSize staticSize = null;
        a aVar = i != 1 ? i != 2 ? null : new a(Integer.valueOf(cn70.b(48)), Integer.valueOf(cn70.b(8)), Integer.valueOf(cn70.b(32)), Integer.valueOf(cn70.b(6)), 32) : new a(null, null, null, null, 31);
        if (aVar == null || !aVar.e) {
            viewGroup.removeAllViews();
            qcy<Object>[] qcyVarArr = bwt0.a;
            recyclerView = (RecyclerView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.im_set_reaction_list, viewGroup, true).findViewById(R.id.my_reaction_rv);
        } else {
            recyclerView = (RecyclerView) bwt0.I(R.layout.im_set_reaction_list, viewGroup, false);
            viewGroup.addView(recyclerView, 0);
        }
        RecyclerView recyclerView2 = recyclerView;
        if (aVar != null && aVar.e) {
            Integer num = aVar.a;
            if (num != null) {
                int intValue = num.intValue();
                ViewGroup.LayoutParams layoutParams = recyclerView2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = intValue;
                recyclerView2.setLayoutParams(layoutParams);
            }
            Integer num2 = aVar.b;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                recyclerView2.setPadding(intValue2, intValue2, intValue2, intValue2);
            }
        }
        Integer num3 = aVar != null ? aVar.c : null;
        Integer num4 = aVar != null ? aVar.d : null;
        Integer num5 = aVar != null ? aVar.b : null;
        if (aVar != null && aVar.f) {
            staticSize = ReactionListController.StaticSize.AlwaysExpanded;
        } else if (aVar != null && aVar.e) {
            staticSize = ReactionListController.StaticSize.AlwaysCollapsed;
        }
        this.n = new ReactionListController(recyclerView2, this.b, this.c, this.d, this.e, new ReactionListController.b(this.f, this.g, this.h, num3, num4, num5, staticSize), new ReactionListController.a(this.i, this.j, this.k), this.l, new dp0(18, aVar, viewGroup));
    }

    @Override // xsna.cpj0
    public final void b() {
        this.n = null;
    }

    @Override // xsna.q1f0
    public final void e() {
        ReactionListController reactionListController = this.n;
        if (reactionListController != null) {
            int e = (reactionListController.e() * 2) + reactionListController.d();
            RecyclerView recyclerView = reactionListController.a;
            f4m.n(e, recyclerView);
            recyclerView.scrollToPosition(0);
            f1f0 f1f0Var = reactionListController.k;
            int i = reactionListController.l;
            f1f0Var.c.setNestedScrollingEnabled(false);
            f1f0Var.j = Integer.valueOf(i);
            f1f0Var.notifyDataSetChanged();
            reactionListController.g.c.invoke(Integer.valueOf(e));
        }
    }

    @Override // xsna.q1f0
    public final void i() {
        ReactionListController reactionListController = this.n;
        if (reactionListController != null) {
            reactionListController.b(false);
        }
    }

    @Override // xsna.q1f0
    public final void k(boolean z) {
        ReactionListController reactionListController = this.n;
        if (reactionListController != null) {
            if (!z) {
                reactionListController.b(false);
            } else {
                reactionListController.b(false);
                reactionListController.a.post(new p31(reactionListController, 19));
            }
        }
    }
}
