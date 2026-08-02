package com.vk.catalog2.common.ui.mvp.holder.clip;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.catalog2.common.dto.api.CatalogDataType;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockCatalog;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.api.CatalogVh;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipDiscoverRootVh;
import com.vk.catalog2.common.ui.mvp.holder.container.TabsOrListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.ViewPagerVh;
import com.vk.catalog2.common.ui.mvp.holder.header.ToolbarVh;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vkontakte.android.R;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.bwt0;
import xsna.c6f;
import xsna.dhr0;
import xsna.f4m;
import xsna.g3a;
import xsna.m9;
import xsna.mba;
import xsna.nda;
import xsna.q3a;
import xsna.rda;
import xsna.u4a;
import xsna.wia;
import xsna.xqc;
import xsna.yqc;
import xsna.zrp;

/* compiled from: ClipDiscoverVh.kt */
/* loaded from: classes16.dex */
public final class ClipDiscoverVh implements CatalogVh, rda {
    public final c6f b;
    public final u4a c;
    public final wia d;
    public final mba e;
    public boolean f;
    public final ClipDiscoverRootVh.CatalogViewType g;
    public final ToolbarMode h;
    public SchemeStat$EventItem i;
    public final g3a j;
    public final CatalogViewHolder k;
    public final ViewPagerVh l;
    public final TabsOrListVh m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipDiscoverVh.kt */
    public static final class ToolbarMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ToolbarMode[] $VALUES;
        public static final ToolbarMode BANNERS;
        public static final ToolbarMode NONE;
        public static final ToolbarMode TITLE;

        static {
            ToolbarMode toolbarMode = new ToolbarMode("NONE", 0);
            NONE = toolbarMode;
            ToolbarMode toolbarMode2 = new ToolbarMode("BANNERS", 1);
            BANNERS = toolbarMode2;
            ToolbarMode toolbarMode3 = new ToolbarMode(NativeAdContent.ViewTag.AD_TITLE, 2);
            TITLE = toolbarMode3;
            ToolbarMode[] toolbarModeArr = {toolbarMode, toolbarMode2, toolbarMode3};
            $VALUES = toolbarModeArr;
            $ENTRIES = new asp(toolbarModeArr);
        }

        public ToolbarMode() {
            throw null;
        }

        public static ToolbarMode valueOf(String str) {
            return (ToolbarMode) Enum.valueOf(ToolbarMode.class, str);
        }

        public static ToolbarMode[] values() {
            return (ToolbarMode[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipDiscoverVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ClipDiscoverRootVh.CatalogViewType.values().length];
            try {
                iArr[ClipDiscoverRootVh.CatalogViewType.MUSIC_TEMPLATES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipDiscoverRootVh.CatalogViewType.TRENDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipDiscoverRootVh.CatalogViewType.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ToolbarMode.values().length];
            try {
                iArr2[ToolbarMode.TITLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ToolbarMode.BANNERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ToolbarMode.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public ClipDiscoverVh(c6f c6fVar, u4a u4aVar, wia wiaVar, Bundle bundle, ClipSearchRootVh clipSearchRootVh) {
        ToolbarMode toolbarMode;
        CatalogViewHolder catalogViewHolder;
        u4a.a aVar = u4aVar.b;
        this.b = c6fVar;
        this.c = u4aVar;
        this.d = wiaVar;
        this.e = clipSearchRootVh;
        Serializable serializable = bundle != null ? bundle.getSerializable("clips_catalog_view_type") : null;
        ClipDiscoverRootVh.CatalogViewType catalogViewType = serializable instanceof ClipDiscoverRootVh.CatalogViewType ? (ClipDiscoverRootVh.CatalogViewType) serializable : null;
        catalogViewType = catalogViewType == null ? ClipDiscoverRootVh.CatalogViewType.DEFAULT : catalogViewType;
        this.g = catalogViewType;
        int i = a.$EnumSwitchMapping$0[catalogViewType.ordinal()];
        if (i == 1 || i == 2) {
            toolbarMode = (bundle == null || !bundle.getBoolean("clips_catalog_no_toolbar")) ? ToolbarMode.TITLE : ToolbarMode.NONE;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            toolbarMode = ToolbarMode.BANNERS;
        }
        ToolbarMode toolbarMode2 = toolbarMode;
        this.h = toolbarMode2;
        g3a S = aVar.s.S(u4aVar, null);
        this.j = S;
        CatalogViewHolder w = aVar.s.w(CatalogDataType.DATA_TYPE_LINKS, CatalogViewType.BANNER, null, null, u4aVar);
        this.k = w;
        ViewPagerVh viewPagerVh = new ViewPagerVh(u4aVar, true, new yqc(this, ClipDiscoverVh.class, "isActive", "isActive()Z", 0), true, null, null, null, wiaVar, null, null, 7152);
        this.l = viewPagerVh;
        nda ndaVar = aVar.b;
        q3a q3aVar = aVar.e;
        String string = bundle != null ? bundle.getString("clips_catalog_toolbar_title") : null;
        dhr0.a.getClass();
        ToolbarVh toolbarVh = new ToolbarVh(ndaVar, q3aVar, string, 0, false, bwt0.u(dhr0.E()), null, null, null, null, null, 4194232);
        int i2 = a.$EnumSwitchMapping$1[toolbarMode2.ordinal()];
        if (i2 == 1) {
            catalogViewHolder = toolbarVh;
        } else if (i2 == 2) {
            catalogViewHolder = w;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            catalogViewHolder = null;
        }
        this.m = new TabsOrListVh(u4aVar, catalogViewHolder, R.layout.catalog_clip_discover_fragment, Integer.valueOf(R.layout.catalog_clip_discover_tab_layout), true, S, wiaVar, viewPagerVh, null, null, false, null, 259104);
    }

    @Override // xsna.hha
    public final boolean A(String str) {
        return this.m.A(str);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.m.L();
        this.j.b();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        Object obj;
        if (uIBlock instanceof UIBlockCatalog) {
            this.m.N6(uIBlock);
            int i = a.$EnumSwitchMapping$1[this.h.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
                Iterator<T> it = ((UIBlockCatalog) uIBlock).y.y.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((UIBlock) obj) instanceof UIBlockList) {
                            break;
                        }
                    }
                }
                UIBlock uIBlock2 = (UIBlock) obj;
                if (uIBlock2 == null) {
                    Serializer.c<UIBlockList> cVar = UIBlockList.CREATOR;
                    uIBlock2 = UIBlockList.a.a();
                }
                this.k.N6(uIBlock2);
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = viewGroup != null ? viewGroup.getContext() : null;
        if (context != null) {
            dhr0.a.getClass();
            layoutInflater = layoutInflater.cloneInContext(new ContextThemeWrapper(context, dhr0.u().c));
        }
        TabsOrListVh tabsOrListVh = this.m;
        View k5 = tabsOrListVh.k5(layoutInflater, viewGroup, bundle);
        View view = tabsOrListVh.t;
        if (view == null) {
            view = null;
        }
        view.setBackgroundColor(0);
        AppBarLayout appBarLayout = (AppBarLayout) k5.findViewById(R.id.vk_app_bar);
        if (appBarLayout != null) {
            appBarLayout.setBackgroundColor(0);
        }
        k5.post(new xqc(this, 0));
        c6f c6fVar = this.b;
        int T3 = c6fVar != null ? c6fVar.T3() : 0;
        if (T3 > 0) {
            f4m.y(T3, k5);
            return k5;
        }
        bwt0.l(k5, 100L, new m9(6, k5, this), null);
        return k5;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void rg(Throwable th) {
        this.m.rg(th);
    }

    @Override // xsna.rda
    public final void s() {
        this.m.s();
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.f = this.i;
        this.i = null;
        int i = a.$EnumSwitchMapping$0[this.g.ordinal()];
        uiTrackingScreen.a = i != 1 ? i != 2 ? MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_DISCOVER : MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_TRENDS_CATALOG : MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_TEMPLATES_CATALOG;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogVh
    public final void ya() {
        this.m.ya();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }
}
