package com.vk.clips.viewer.impl.feed.view.list.item.badges.holders;

import android.util.Size;
import com.vk.clips.design.view.component.badge.ClipBadge;
import com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.BaseBadgeHolder;
import xsna.cn70;
import xsna.drm0;
import xsna.hfz;
import xsna.krh;
import xsna.mih0;
import xsna.uq;

/* compiled from: GroupBadgeHolder.kt */
/* loaded from: classes17.dex */
public final class e extends BaseBadgeHolder<mih0.d<?>> {
    public static final /* synthetic */ int p = 0;

    @Override // xsna.vfz
    public final void W5(hfz hfzVar) {
        mih0.d dVar = (mih0.d) hfzVar;
        ClipBadge clipBadge = this.l;
        BaseBadgeHolder.j6(clipBadge, dVar);
        i6(clipBadge, dVar);
        CharSequence a = dVar.c.a(this.itemView.getContext());
        String str = null;
        if (drm0.N(a)) {
            a = null;
        }
        if (a != null) {
            StringBuilder sb = new StringBuilder();
            sb.append((Object) a);
            sb.append(" · ");
            str = uq.b(dVar.j, sb);
        }
        BaseBadgeHolder.m6(clipBadge, str, dVar.f);
        BaseBadgeHolder.l6(clipBadge, BaseBadgeHolder.BadgeSide.RIGHT, new Size(cn70.b(16), cn70.b(16)), new krh(dVar, 20));
    }
}
