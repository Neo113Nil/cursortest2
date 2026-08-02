package com.vk.clips.viewer.impl.feed.view.list.item.badges.holders;

import android.util.Size;
import com.vk.clips.design.view.component.badge.ClipBadge;
import com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.BaseBadgeHolder;
import xsna.cn70;
import xsna.drm0;
import xsna.hfz;
import xsna.m130;
import xsna.mih0;
import xsna.uq;

/* compiled from: PlaylistManyBadgeHolder.kt */
/* loaded from: classes17.dex */
public final class i extends BaseBadgeHolder<mih0.l.a> {
    public static final /* synthetic */ int q = 0;
    public mih0.l.a p;

    @Override // xsna.vfz
    public final void W5(hfz hfzVar) {
        mih0.l.a aVar = (mih0.l.a) hfzVar;
        this.p = aVar;
        ClipBadge clipBadge = this.l;
        BaseBadgeHolder.j6(clipBadge, aVar);
        i6(clipBadge, aVar);
        CharSequence a = aVar.c.a(this.itemView.getContext());
        String str = null;
        if (drm0.N(a)) {
            a = null;
        }
        if (a != null) {
            StringBuilder sb = new StringBuilder();
            sb.append((Object) a);
            sb.append(" · ");
            str = uq.b(aVar.i, sb);
        }
        BaseBadgeHolder.m6(clipBadge, str, aVar.f);
        BaseBadgeHolder.l6(clipBadge, BaseBadgeHolder.BadgeSide.RIGHT, new Size(cn70.b(16), cn70.b(16)), new m130(aVar, 19));
    }
}
