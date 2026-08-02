package com.vk.catalog2.common.ui.holders;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.catalog.mvi.block.music.models.MusicMviAnalyticsInfo;
import com.vk.catalog.mvi.block.video.models.VideoCatalogAnalyticsEvent;
import com.vk.catalog.mvi.domain.CatalogLinkButtonActionDo;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.toggle.Features;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import xsna.b5a;
import xsna.ber;
import xsna.bjc;
import xsna.cfp0;
import xsna.e8a;
import xsna.epx;
import xsna.h8a;
import xsna.hba;
import xsna.hig;
import xsna.j5g;
import xsna.jai;
import xsna.ktf0;
import xsna.l8a;
import xsna.nw6;
import xsna.q3a;
import xsna.r1a;
import xsna.rmk;
import xsna.smk;
import xsna.snn0;
import xsna.t0a;
import xsna.uzp0;
import xsna.v0g0;
import xsna.wnk;
import xsna.yc40;

/* compiled from: CatalogMviVh.kt */
/* loaded from: classes16.dex */
public class CatalogMviVh implements CatalogViewHolder {
    public final b5a b;
    public final q3a c;
    public final CatalogBlockVariant d;
    public final hig e;
    public final e8a f;
    public UIBlock g;
    public Context h;

    /* compiled from: CatalogMviVh.kt */
    public final class a implements l8a {
        public a() {
        }

        @Override // xsna.l8a
        public final void a(t0a t0aVar) {
            CatalogMviVh catalogMviVh = CatalogMviVh.this;
            b5a b5aVar = catalogMviVh.b;
            UIBlock uIBlock = catalogMviVh.g;
            if (uIBlock == null || catalogMviVh.a(t0aVar)) {
                return;
            }
            if (t0aVar instanceof t0a.a) {
                t0a.a.c cVar = ((t0a.a) t0aVar).c;
                t0a.a.C3709a c3709a = cVar instanceof t0a.a.C3709a ? (t0a.a.C3709a) cVar : null;
                b5aVar.a(new cfp0(uIBlock, c3709a != null ? c3709a.a : null));
                return;
            }
            if (!(t0aVar instanceof yc40)) {
                if (!(t0aVar instanceof VideoCatalogAnalyticsEvent) && !(t0aVar instanceof rmk)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            yc40 yc40Var = (yc40) t0aVar;
            if (!(yc40Var instanceof yc40.f) && !(yc40Var instanceof yc40.g) && !(yc40Var instanceof yc40.b)) {
                if (yc40Var instanceof yc40.c) {
                    b5aVar.a(new cfp0(uIBlock, ((yc40.c) yc40Var).b));
                    return;
                } else if (yc40Var instanceof yc40.e) {
                    b5aVar.a(new cfp0(uIBlock, ((yc40.e) yc40Var).a));
                    return;
                } else {
                    if (!(yc40Var instanceof yc40.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b5aVar.a(new cfp0(uIBlock, null));
                    return;
                }
            }
            MusicMviAnalyticsInfo.ClickTarget clickTarget = ((yc40.a) yc40Var).getInfo().a;
            Iterator<E> it = MusicAnalyticsInfo.ClickTarget.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (epx.f(((MusicAnalyticsInfo.ClickTarget) next).i(), clickTarget.h())) {
                    r3 = next;
                    break;
                }
            }
            MusicAnalyticsInfo.ClickTarget clickTarget2 = (MusicAnalyticsInfo.ClickTarget) r3;
            if (clickTarget2 == null) {
                com.vk.metrics.eventtracking.b.a.q(new IllegalStateException("MusicAnalyticsInfo.ClickTarget has no entry " + clickTarget.h()));
                clickTarget2 = MusicAnalyticsInfo.ClickTarget.None;
            }
            b5aVar.a(new cfp0(uIBlock, new MusicAnalyticsInfo(clickTarget2)));
        }

        @Override // xsna.l8a
        public final void b() {
            CatalogMviVh catalogMviVh = CatalogMviVh.this;
            UIBlock uIBlock = catalogMviVh.g;
            if (uIBlock == null) {
                return;
            }
            catalogMviVh.c.b(new ktf0(uIBlock.b), false);
        }

        @Override // xsna.l8a
        public final void c() {
            throw new NotImplementedError("This action is not implemented in legacy catalog yet, please implement it yourself or don't use it.");
        }

        @Override // xsna.l8a
        public final void d() {
            throw new NotImplementedError("This action is not implemented in legacy catalog yet, please implement it yourself or don't use it.");
        }

        @Override // xsna.l8a
        public final void e(r1a r1aVar) {
            UIBlock uIBlock;
            CatalogMviVh catalogMviVh = CatalogMviVh.this;
            hig higVar = catalogMviVh.e;
            Context context = catalogMviVh.h;
            if (context == null || (uIBlock = catalogMviVh.g) == null) {
                return;
            }
            higVar.getClass();
            if (r1aVar instanceof smk) {
                return;
            }
            if (r1aVar instanceof wnk) {
                higVar.a(context, uIBlock, (wnk) r1aVar);
                return;
            }
            if (!(r1aVar instanceof r1a.a)) {
                if (!(r1aVar instanceof r1a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                r1a.b bVar = (r1a.b) r1aVar;
                higVar.b(context, bVar.a, null, bVar.b);
                return;
            }
            CatalogLinkButtonActionDo catalogLinkButtonActionDo = ((r1a.a) r1aVar).a;
            q3a q3aVar = higVar.a;
            if (epx.f(catalogLinkButtonActionDo, CatalogLinkButtonActionDo.ClearVideoHistory.b)) {
                hig.c();
                throw null;
            }
            if (epx.f(catalogLinkButtonActionDo, CatalogLinkButtonActionDo.OpenGroups.b)) {
                hig.c();
                throw null;
            }
            if (epx.f(catalogLinkButtonActionDo, CatalogLinkButtonActionDo.CreateAlbum.b)) {
                hig.c();
                throw null;
            }
            if (epx.f(catalogLinkButtonActionDo, CatalogLinkButtonActionDo.OpenHowBecomeAuthor.b)) {
                hig.c();
                throw null;
            }
            if (catalogLinkButtonActionDo instanceof CatalogLinkButtonActionDo.OpenUploadVideo) {
                hig.c();
                throw null;
            }
            if (catalogLinkButtonActionDo instanceof CatalogLinkButtonActionDo.OpenAddVideosToAlbum) {
                hig.c();
                throw null;
            }
            if (catalogLinkButtonActionDo instanceof CatalogLinkButtonActionDo.OpenUploadClip) {
                hig.c();
                throw null;
            }
            if (catalogLinkButtonActionDo instanceof CatalogLinkButtonActionDo.ToggleVideoAlbumSubscription) {
                hig.c();
                throw null;
            }
            if (catalogLinkButtonActionDo instanceof CatalogLinkButtonActionDo.OpenLink) {
                CatalogLinkButtonActionDo.OpenLink openLink = (CatalogLinkButtonActionDo.OpenLink) catalogLinkButtonActionDo;
                higVar.b(context, openLink.b, openLink.c, openLink.d);
                return;
            }
            if (catalogLinkButtonActionDo instanceof CatalogLinkButtonActionDo.OpenAuthorCabinet) {
                hig.c();
                throw null;
            }
            if (catalogLinkButtonActionDo instanceof CatalogLinkButtonActionDo.OpenSection) {
                hig.c();
                throw null;
            }
            if (catalogLinkButtonActionDo instanceof CatalogLinkButtonActionDo.SwitchSection) {
                CatalogLinkButtonActionDo.SwitchSection switchSection = (CatalogLinkButtonActionDo.SwitchSection) catalogLinkButtonActionDo;
                q3aVar.b(new snn0(switchSection.b), true);
                String str = switchSection.c;
                if (str != null) {
                    Features.Type type = Features.Type.FEATURE_VIDEO_CATALOG_NEW_FILTER_SWITCH;
                    type.getClass();
                    if (com.vk.toggle.b.A.a(type)) {
                        q3aVar.b(new ber(str), false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (catalogLinkButtonActionDo instanceof CatalogLinkButtonActionDo.OpenShowAllFragmentLegacySection) {
                CatalogLinkButtonActionDo.OpenShowAllFragmentLegacySection openShowAllFragmentLegacySection = (CatalogLinkButtonActionDo.OpenShowAllFragmentLegacySection) catalogLinkButtonActionDo;
                SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, openShowAllFragmentLegacySection.e, null, 38, null), null, 6);
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                uzp0 uzp0Var = UiTracker.h;
                uzp0Var.getClass();
                new bjc(c, b, uzp0Var.a).q();
                q3aVar.b(new snn0(openShowAllFragmentLegacySection.b), true);
                return;
            }
            if (catalogLinkButtonActionDo instanceof CatalogLinkButtonActionDo.PlayVideosFromBlock) {
                hig.c();
                throw null;
            }
            if (catalogLinkButtonActionDo instanceof CatalogLinkButtonActionDo.ToggleAlbumSubscription) {
                hig.c();
                throw null;
            }
            if (!(catalogLinkButtonActionDo instanceof CatalogLinkButtonActionDo.ToggleAlbumShuffle)) {
                throw new NoWhenBranchMatchedException();
            }
            hig.c();
            throw null;
        }

        @Override // xsna.l8a
        public final void f(List<String> list) {
            Object a0 = j5g.a0(list);
            CatalogMviVh catalogMviVh = CatalogMviVh.this;
            Context context = catalogMviVh.h;
            if (a0 == null || context == null) {
                return;
            }
            catalogMviVh.c.b(new v0g0(new hba((String) a0, 0), context), false);
        }

        @Override // xsna.l8a
        public final void g() {
            throw new NotImplementedError("This action is not implemented in legacy catalog yet, please implement it yourself or don't use it.");
        }

        @Override // xsna.l8a
        public final void h() {
            throw new NotImplementedError("This action is not implemented in legacy catalog yet, please implement it yourself or don't use it.");
        }
    }

    public CatalogMviVh(b5a b5aVar, q3a q3aVar, CatalogBlockVariant catalogBlockVariant, com.vk.catalog.mvi.legacy.api.a aVar, hig higVar) {
        this.b = b5aVar;
        this.c = q3aVar;
        this.d = catalogBlockVariant;
        this.e = higVar;
        h8a h8aVar = aVar.a().get(catalogBlockVariant);
        this.f = h8aVar != null ? h8aVar.a(new a()) : null;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        e8a e8aVar = this.f;
        if (e8aVar != null) {
            e8aVar.destroy();
        }
        this.h = null;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void N6(UIBlock uIBlock) {
        this.g = uIBlock;
        e8a e8aVar = this.f;
        if (e8aVar != null) {
            e8aVar.b(uIBlock);
        }
    }

    public boolean a(t0a t0aVar) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.h = layoutInflater.getContext();
        ComposeView composeView = new ComposeView(layoutInflater.getContext(), null, 6);
        composeView.setContent(new jai(1516440698, new nw6(this, 2), true));
        composeView.setTag(this.d.name());
        composeView.setClickable(true);
        return composeView;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    public /* synthetic */ CatalogMviVh(b5a b5aVar, q3a q3aVar, SearchStatInfoProvider searchStatInfoProvider, CatalogBlockVariant catalogBlockVariant, com.vk.catalog.mvi.legacy.api.a aVar) {
        this(b5aVar, q3aVar, catalogBlockVariant, aVar, new hig(q3aVar, searchStatInfoProvider));
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
