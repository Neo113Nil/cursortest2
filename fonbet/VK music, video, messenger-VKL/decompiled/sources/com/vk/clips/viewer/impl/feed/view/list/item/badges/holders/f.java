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
import xsna.drm0;
import xsna.epx;
import xsna.f1s;
import xsna.g53;
import xsna.h7v;
import xsna.hfz;
import xsna.hkb;
import xsna.izs;
import xsna.l7v;
import xsna.m8v0;
import xsna.mhl;
import xsna.mih0;
import xsna.pla;
import xsna.s3q0;
import xsna.sd4;
import xsna.tlo0;
import xsna.ufa;
import xsna.v3n;
import xsna.wr0;
import xsna.wvw;
import xsna.yof;

/* compiled from: MusicBadgeHolder.kt */
/* loaded from: classes17.dex */
public final class f extends BaseBadgeHolder<mih0.i> {
    public static final /* synthetic */ int u = 0;
    public final yof p;
    public final h7v q;
    public final String r;
    public final Hint s;
    public mih0.i t;

    /* compiled from: MusicBadgeHolder.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<BaseBadgeHolder.a, Rect> {
        @Override // xsna.izs
        public final Rect invoke(BaseBadgeHolder.a aVar) {
            tlo0 tlo0Var;
            BaseBadgeHolder.a aVar2 = aVar;
            f fVar = (f) this.receiver;
            int i = f.u;
            fVar.getClass();
            if (aVar2 instanceof BaseBadgeHolder.a.b) {
                return new Rect(cn70.b(0), cn70.b(0), cn70.b(0), cn70.b(0));
            }
            if (!(aVar2 instanceof BaseBadgeHolder.a.C0709a)) {
                throw new NoWhenBranchMatchedException();
            }
            mih0.i iVar = fVar.t;
            if ((iVar != null ? iVar.k : null) != null) {
                if (((iVar == null || (tlo0Var = iVar.i) == null) ? null : tlo0Var.a(fVar.itemView.getContext())) == null) {
                    mih0.i iVar2 = fVar.t;
                    if ((iVar2 != null ? iVar2.r : null) == null) {
                        return new Rect(cn70.b(4), cn70.b(4), cn70.b(4), cn70.b(4));
                    }
                }
            }
            return new Rect(cn70.b(6), cn70.b(4), cn70.b(2), cn70.b(4));
        }
    }

    public f(ViewGroup viewGroup, yof yofVar) {
        super(viewGroup);
        this.p = yofVar;
        bpn0 bpn0Var = pla.a;
        l7v b = ((wvw) (bpn0Var == null ? null : bpn0Var).getValue()).b();
        this.q = b;
        String id = HintId.CLIPS_TRACK_IS_TRENDING_NOW_MORE_CLIPS_WITH_IT_HERE.getId();
        this.r = id;
        this.s = b.p(id);
        this.l.setMode(ClipBadge.BadgeMode.INTERACTIVE);
        t6(BaseBadgeHolder.BadgeSide.LEFT, new a(1, this, f.class, "calculateBadgeInsets", "calculateBadgeInsets(Lcom/vk/clips/viewer/impl/feed/view/list/item/badges/holders/BaseBadgeHolder$BadgeImageContent;)Landroid/graphics/Rect;", 0), new f1s(12), new hkb(6));
    }

    @Override // xsna.vfz
    public final void W5(hfz hfzVar) {
        tlo0 tlo0Var;
        CharSequence a2;
        final mih0.i iVar = (mih0.i) hfzVar;
        if (epx.f(this.t, iVar)) {
            return;
        }
        this.t = iVar;
        final ClipBadge clipBadge = this.l;
        BaseBadgeHolder.j6(clipBadge, iVar);
        i6(clipBadge, iVar);
        BaseBadgeHolder.q6(clipBadge, iVar);
        BaseBadgeHolder.l6(clipBadge, BaseBadgeHolder.BadgeSide.LEFT, iVar.k != null ? new Size(cn70.b(20), cn70.b(20)) : iVar.q != null ? new Size(cn70.b(22), cn70.b(22)) : new Size(-2, -2), new v3n(iVar, 19));
        CharSequence a3 = iVar.i.a(this.itemView.getContext());
        tlo0 tlo0Var2 = iVar.n;
        if (tlo0Var2 != null && (a2 = tlo0Var2.a(this.itemView.getContext())) != null) {
            if (drm0.N(a2)) {
                a2 = null;
            }
            if (a2 != null) {
                String str = ((Object) a3) + " - " + ((Object) a2);
                if (str != null) {
                    a3 = str;
                }
            }
        }
        BaseBadgeHolder.m6(clipBadge, a3, iVar.f);
        if (this.p.J().a) {
            mih0.i iVar2 = iVar.s ? iVar : null;
            CharSequence a4 = (iVar2 == null || (tlo0Var = iVar2.p) == null) ? null : tlo0Var.a(clipBadge.getContext());
            if (a4 != null) {
                wr0 wr0Var = new wr0(3);
                byte b = 0;
                a76 a76Var = new a76(b, b);
                VKReplacerView c = clipBadge.c();
                mhl.a aVar = new mhl.a(new mhl(wr0Var, a76Var), c.getContext());
                clipBadge.g = aVar;
                s3q0 s3q0Var = s3q0.a;
                c.a(aVar.getView());
                BaseBadgeHolder.o6(clipBadge, a4);
            } else {
                clipBadge.setRightMain(null);
                clipBadge.setRightView(null);
            }
        }
        Integer num = iVar.r;
        if (num != null) {
            int intValue = num.intValue();
            if (clipBadge.getRightExtra() == null) {
                t6(BaseBadgeHolder.BadgeSide.RIGHT, new g53(27), new sd4(1), new b76((byte) 0, 0));
            }
            BaseBadgeHolder.l6(clipBadge, BaseBadgeHolder.BadgeSide.RIGHT, new Size(cn70.b(16), cn70.b(16)), new ufa(intValue, iVar));
        } else {
            if (clipBadge.getRightExtra() != null) {
                clipBadge.setRightExtraView(null);
            }
            clipBadge.setRightExtra(null);
        }
        final View findViewById = clipBadge.findViewById(R.id.clips_badge_right_extra_group);
        if (findViewById == null) {
            return;
        }
        Runnable runnable = new Runnable() { // from class: xsna.cb40
            @Override // java.lang.Runnable
            public final void run() {
                mih0.i iVar3 = mih0.i.this;
                if (iVar3.s) {
                    View view = findViewById;
                    Activity a5 = zwt0.a(view);
                    boolean z = false;
                    if (a5 != null && a5.isFinishing()) {
                        z = true;
                    }
                    com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.f fVar = this;
                    if (fVar.q.a(fVar.r) && !z && bwt0.K(view)) {
                        ClipBadge clipBadge2 = clipBadge;
                        if (!clipBadge2.isLaidOut() || clipBadge2.isLayoutRequested()) {
                            clipBadge2.addOnLayoutChangeListener(new fb40(iVar3, fVar, view));
                            return;
                        }
                        if (iVar3.t) {
                            int i = m8v0.M;
                            Hint hint = fVar.s;
                            String str2 = hint != null ? hint.c : null;
                            if (str2 == null) {
                                str2 = "";
                            }
                            m8v0.a.a(view, str2, null, VkTooltip$MarkerStyle.Style4, VkTooltip$MarkerSize.Size48, VkOnboarding$TintColor.Lime, VkTooltip$BalloonPosition.TopLeft, null, db40.b, null, null, null, null, new eb40(fVar), null, 0, true, null, null, false, null, false, 16686724);
                        }
                    }
                }
            }
        };
        this.n = runnable;
        clipBadge.postDelayed(runnable, 300L);
    }
}
