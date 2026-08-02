package com.vk.clips.viewer.impl.feed.view.list.item.badges.holders;

import android.app.Activity;
import android.graphics.Rect;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import com.vk.clips.design.view.component.badge.ClipBadge;
import com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.BaseBadgeHolder;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a76;
import xsna.b76;
import xsna.bpn0;
import xsna.cn70;
import xsna.h7v;
import xsna.hfz;
import xsna.izs;
import xsna.l7v;
import xsna.m8v0;
import xsna.mhl;
import xsna.mih0;
import xsna.p1d0;
import xsna.pla;
import xsna.s3q0;
import xsna.sd4;
import xsna.tlo0;
import xsna.wr0;
import xsna.wvw;
import xsna.yof;

/* compiled from: TrendingHashtagBadgeHolder.kt */
/* loaded from: classes17.dex */
public final class l extends BaseBadgeHolder<mih0.q> {
    public static final /* synthetic */ int u = 0;
    public final yof p;
    public final h7v q;
    public final String r;
    public final Hint s;
    public mih0.q t;

    /* compiled from: TrendingHashtagBadgeHolder.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<BaseBadgeHolder.a, Rect> {
        @Override // xsna.izs
        public final Rect invoke(BaseBadgeHolder.a aVar) {
            tlo0 tlo0Var;
            BaseBadgeHolder.a aVar2 = aVar;
            l lVar = (l) this.receiver;
            int i = l.u;
            lVar.getClass();
            if (aVar2 instanceof BaseBadgeHolder.a.b) {
                return new Rect(cn70.b(0), cn70.b(0), cn70.b(0), cn70.b(0));
            }
            if (!(aVar2 instanceof BaseBadgeHolder.a.C0709a)) {
                throw new NoWhenBranchMatchedException();
            }
            mih0.q qVar = lVar.t;
            CharSequence a = (qVar == null || (tlo0Var = qVar.i) == null) ? null : tlo0Var.a(lVar.itemView.getContext());
            return (a == null || a.length() == 0) ? new Rect(cn70.b(2), cn70.b(2), cn70.b(2), cn70.b(2)) : new Rect(cn70.b(0), cn70.b(2), cn70.b(4), cn70.b(2));
        }
    }

    public l(ViewGroup viewGroup, yof yofVar) {
        super(viewGroup);
        this.p = yofVar;
        bpn0 bpn0Var = pla.a;
        l7v b = ((wvw) (bpn0Var == null ? null : bpn0Var).getValue()).b();
        this.q = b;
        String id = HintId.CLIPS_OTHER_TRENDING_CLIPS_CAN_BE_VIEWED_THERE.getId();
        this.r = id;
        this.s = b.p(id);
        this.l.setMode(ClipBadge.BadgeMode.INTERACTIVE);
        t6(BaseBadgeHolder.BadgeSide.RIGHT, new a(1, this, l.class, "calculateBadgeInsets", "calculateBadgeInsets(Lcom/vk/clips/viewer/impl/feed/view/list/item/badges/holders/BaseBadgeHolder$BadgeImageContent;)Landroid/graphics/Rect;", 0), new sd4(1), new b76((byte) 0, 0));
        if (yofVar.J().a) {
            ClipBadge clipBadge = this.l;
            wr0 wr0Var = new wr0(3);
            byte b2 = 0;
            a76 a76Var = new a76(b2, b2);
            VKReplacerView c = clipBadge.c();
            mhl.a aVar = new mhl.a(new mhl(wr0Var, a76Var), c.getContext());
            clipBadge.g = aVar;
            s3q0 s3q0Var = s3q0.a;
            c.a(aVar.getView());
        }
    }

    @Override // xsna.vfz
    public final void W5(hfz hfzVar) {
        final mih0.q qVar = (mih0.q) hfzVar;
        if (qVar.equals(this.t)) {
            return;
        }
        this.t = qVar;
        boolean c = qVar.c();
        final ClipBadge clipBadge = this.l;
        clipBadge.setEnabled(c);
        i6(clipBadge, qVar);
        BaseBadgeHolder.q6(clipBadge, qVar);
        BaseBadgeHolder.l6(clipBadge, BaseBadgeHolder.BadgeSide.RIGHT, new Size(cn70.b(16), cn70.b(16)), new p1d0(qVar, 24));
        BaseBadgeHolder.m6(clipBadge, qVar.i.a(this.itemView.getContext()), qVar.f);
        if (this.p.J().a) {
            tlo0 tlo0Var = qVar.k;
            BaseBadgeHolder.o6(clipBadge, tlo0Var != null ? tlo0Var.a(this.itemView.getContext()) : null);
        }
        final View findViewById = clipBadge.findViewById(R.id.clips_badge_right_extra_group);
        if (findViewById == null) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: xsna.tpp0
            @Override // java.lang.Runnable
            public final void run() {
                View view = findViewById;
                Activity a2 = zwt0.a(view);
                boolean z = false;
                if (a2 != null && a2.isFinishing()) {
                    z = true;
                }
                com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.l lVar = com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.l.this;
                if (lVar.q.a(lVar.r) && !z && bwt0.K(view)) {
                    ClipBadge clipBadge2 = clipBadge;
                    boolean isLaidOut = clipBadge2.isLaidOut();
                    mih0.q qVar2 = qVar;
                    if (!isLaidOut || clipBadge2.isLayoutRequested()) {
                        clipBadge2.addOnLayoutChangeListener(new wpp0(qVar2, lVar, view));
                        return;
                    }
                    if (qVar2.l) {
                        int i = m8v0.M;
                        Hint hint = lVar.s;
                        String str = hint != null ? hint.c : null;
                        if (str == null) {
                            str = "";
                        }
                        m8v0.a.a(view, str, null, VkTooltip$MarkerStyle.Style4, VkTooltip$MarkerSize.Size48, VkOnboarding$TintColor.Lime, VkTooltip$BalloonPosition.TopLeft, null, upp0.b, null, null, null, null, new vpp0(lVar), null, 0, true, null, null, false, null, false, 16686724);
                    }
                }
            }
        };
        this.n = runnable;
        clipBadge.postDelayed(runnable, 300L);
    }
}
