package com.vk.clips.viewer.impl.feed.view.list.item.badges.holders;

import android.graphics.Rect;
import android.util.Size;
import android.view.ViewGroup;
import com.vk.clips.design.view.component.badge.ClipBadge;
import com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.BaseBadgeHolder;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b76;
import xsna.cn70;
import xsna.epx;
import xsna.hfz;
import xsna.izs;
import xsna.mih0;
import xsna.sd4;
import xsna.sgr;
import xsna.sy50;
import xsna.yof;

/* compiled from: NewsMonothemeBadgeHolder.kt */
/* loaded from: classes17.dex */
public final class g extends BaseBadgeHolder<mih0.k> {
    public static final /* synthetic */ int r = 0;
    public final yof p;
    public mih0.k q;

    /* compiled from: NewsMonothemeBadgeHolder.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<BaseBadgeHolder.a, Rect> {
        @Override // xsna.izs
        public final Rect invoke(BaseBadgeHolder.a aVar) {
            BaseBadgeHolder.a aVar2 = aVar;
            g gVar = (g) this.receiver;
            int i = g.r;
            gVar.getClass();
            if (aVar2 instanceof BaseBadgeHolder.a.b) {
                return new Rect(cn70.b(0), cn70.b(0), cn70.b(0), cn70.b(0));
            }
            if (aVar2 instanceof BaseBadgeHolder.a.C0709a) {
                return new Rect(cn70.b(6), cn70.b(4), cn70.b(2), cn70.b(4));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public g(ViewGroup viewGroup, yof yofVar) {
        super(viewGroup);
        this.p = yofVar;
        this.l.setMode(ClipBadge.BadgeMode.STATIC);
        t6(BaseBadgeHolder.BadgeSide.LEFT, new a(1, this, g.class, "calculateBadgeInsets", "calculateBadgeInsets(Lcom/vk/clips/viewer/impl/feed/view/list/item/badges/holders/BaseBadgeHolder$BadgeImageContent;)Landroid/graphics/Rect;", 0), new sd4(1), new b76((byte) 0, 0));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(hfz hfzVar) {
        mih0.k kVar = (mih0.k) hfzVar;
        if (epx.f(this.q, kVar)) {
            return;
        }
        this.q = kVar;
        ClipBadge clipBadge = this.l;
        BaseBadgeHolder.j6(clipBadge, kVar);
        i6(clipBadge, kVar);
        BaseBadgeHolder.l6(clipBadge, BaseBadgeHolder.BadgeSide.LEFT, new Size(cn70.b(20), cn70.b(20)), new sy50(kVar, 1));
        BaseBadgeHolder.m6(clipBadge, kVar.i.a(this.itemView.getContext()), kVar.f);
        BaseBadgeHolder.s6(clipBadge, kVar);
        BaseBadgeHolder.q6(clipBadge, kVar);
        if (kVar.n || !kVar.o) {
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(this.p.t().b);
        Runnable sgrVar = new sgr(1, this, kVar);
        this.n = sgrVar;
        clipBadge.postDelayed(sgrVar, millis);
    }

    @Override // com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.BaseBadgeHolder, xsna.vfz
    public final void a6() {
        this.q = null;
        super.a6();
    }

    @Override // xsna.vfz
    public final void g6() {
        this.q = null;
    }
}
