package com.vk.clips.viewer.impl.feed.view.list.item.badges.holders;

import android.util.Size;
import com.vk.clips.design.view.component.badge.ClipBadge;
import com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.BaseBadgeHolder;
import xsna.cn70;
import xsna.hfz;
import xsna.mih0;
import xsna.s1m;

/* compiled from: DescriptionBadgeHolder.kt */
/* loaded from: classes17.dex */
public final class c extends BaseBadgeHolder<mih0> {
    public static final /* synthetic */ int q = 0;
    public mih0 p;

    @Override // xsna.vfz
    public final void W5(hfz hfzVar) {
        mih0 mih0Var = (mih0) hfzVar;
        this.p = mih0Var;
        ClipBadge clipBadge = this.l;
        BaseBadgeHolder.j6(clipBadge, mih0Var);
        i6(clipBadge, mih0Var);
        BaseBadgeHolder.l6(clipBadge, BaseBadgeHolder.BadgeSide.LEFT, new Size(cn70.b(20), cn70.b(20)), new s1m(mih0Var, 0));
        BaseBadgeHolder.m6(clipBadge, mih0Var.e().a(this.itemView.getContext()), mih0Var.f);
        BaseBadgeHolder.s6(clipBadge, mih0Var);
    }
}
