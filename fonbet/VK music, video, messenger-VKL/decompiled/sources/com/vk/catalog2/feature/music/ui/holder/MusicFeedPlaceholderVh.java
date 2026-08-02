package com.vk.catalog2.feature.music.ui.holder;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.PlaceholderCatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.actions.UIBlockHideBlockButton;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.music.ui.holder.MusicFeedPlaceholderVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.bwt0;
import xsna.c98;
import xsna.dhr0;
import xsna.e3m;
import xsna.gzs;
import xsna.iah0;
import xsna.itg0;
import xsna.nda;
import xsna.oq;
import xsna.q3a;
import xsna.qhv0;
import xsna.rk40;
import xsna.rsg0;
import xsna.tlo0;
import xsna.vlw;
import xsna.xga;
import xsna.xxf0;
import xsna.yfb;

/* compiled from: MusicFeedPlaceholderVh.kt */
/* loaded from: classes16.dex */
public final class MusicFeedPlaceholderVh implements CatalogViewHolder, View.OnClickListener {
    public final q3a b;
    public final com.vk.catalog2.common.ui.mvp.util.a c;
    public final nda d;
    public final xga e = new xga();
    public VkPlaceholder f;
    public View g;
    public View h;
    public View i;
    public UIBlockPlaceholder j;

    public MusicFeedPlaceholderVh(q3a q3aVar, com.vk.catalog2.common.ui.mvp.util.a aVar, nda ndaVar) {
        this.b = q3aVar;
        this.c = aVar;
        this.d = ndaVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.c.f();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(final UIBlock uIBlock) {
        Object obj;
        Object obj2;
        ImageSize Cb;
        if (uIBlock instanceof UIBlockPlaceholder) {
            View view = this.g;
            if (view == null) {
                view = null;
            }
            final Context context = view.getContext();
            if (context == null) {
                return;
            }
            CatalogViewStyle catalogViewStyle = uIBlock.l;
            PlaceholderCatalogViewStyle placeholderCatalogViewStyle = catalogViewStyle instanceof PlaceholderCatalogViewStyle ? (PlaceholderCatalogViewStyle) catalogViewStyle : null;
            if (placeholderCatalogViewStyle == null) {
                return;
            }
            PlaceholderCatalogViewStyle.Style style = placeholderCatalogViewStyle.b;
            boolean z = style == PlaceholderCatalogViewStyle.Style.WithPointer;
            View view2 = this.i;
            if (view2 == null) {
                view2 = null;
            }
            bwt0.p0(view2, z);
            boolean z2 = style == PlaceholderCatalogViewStyle.Style.Secondary;
            VkPlaceholder vkPlaceholder = this.f;
            if (vkPlaceholder == null) {
                vkPlaceholder = null;
            }
            tlo0.a aVar = tlo0.Companion;
            UIBlockPlaceholder uIBlockPlaceholder = (UIBlockPlaceholder) uIBlock;
            ArrayList<UIBlockAction> arrayList = uIBlockPlaceholder.G;
            tlo0.h d = oq.d(aVar, uIBlockPlaceholder.A);
            String str = uIBlockPlaceholder.D;
            if (str == null) {
                str = "";
            }
            vkPlaceholder.setMiddle(new VkPlaceholder.b(new VkPlaceholder.b.c(2, d), new VkPlaceholder.b.C0859b(14, new tlo0.h(str))));
            Iterator<T> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (obj instanceof UIBlockHideBlockButton) {
                        break;
                    }
                }
            }
            if (!(obj instanceof UIBlockHideBlockButton)) {
                obj = null;
            }
            UIBlockHideBlockButton uIBlockHideBlockButton = (UIBlockHideBlockButton) obj;
            View view3 = this.h;
            if (view3 == null) {
                view3 = null;
            }
            bwt0.p0(view3, uIBlockHideBlockButton != null);
            this.j = uIBlockPlaceholder;
            Iterator<T> it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                this.c.getClass();
                if (com.vk.catalog2.common.ui.mvp.util.a.d((UIBlockAction) obj2)) {
                    break;
                }
            }
            final UIBlockAction uIBlockAction = (UIBlockAction) obj2;
            if (uIBlockAction != null) {
                VkPlaceholder.a.C0857a g = (z2 || z) ? com.vk.catalog2.common.ui.mvp.util.a.g(this.c, uIBlockAction, VkButton.Mode.Primary, VkButton.Appearance.Overlay, true, null, new gzs() { // from class: xsna.qk40
                    @Override // xsna.gzs
                    public final Object invoke() {
                        MusicFeedPlaceholderVh musicFeedPlaceholderVh = MusicFeedPlaceholderVh.this;
                        com.vk.catalog2.common.ui.mvp.util.a.e(musicFeedPlaceholderVh.c, context, uIBlock, uIBlockAction, musicFeedPlaceholderVh.d, 48);
                        return s3q0.a;
                    }
                }, 16) : com.vk.catalog2.common.ui.mvp.util.a.g(this.c, uIBlockAction, VkButton.Mode.Tertiary, VkButton.Appearance.Accent, false, null, new rk40(this, context, uIBlock, uIBlockAction, 0), 16);
                if (g != null) {
                    VkPlaceholder vkPlaceholder2 = this.f;
                    if (vkPlaceholder2 == null) {
                        vkPlaceholder2 = null;
                    }
                    vkPlaceholder2.setBottom(new VkPlaceholder.a.b(g, null, null, null, 8));
                }
            }
            View view4 = this.g;
            if (view4 == null) {
                view4 = null;
            }
            int a = e3m.a(R.dimen.catalog_music_placeholder_icon_height, view4.getContext());
            Image image = uIBlockPlaceholder.B;
            String str2 = (image == null || (Cb = image.Cb(a, false, true)) == null) ? null : Cb.d.d;
            if (str2 != null) {
                VkPlaceholder vkPlaceholder3 = this.f;
                if (vkPlaceholder3 == null) {
                    vkPlaceholder3 = null;
                }
                vkPlaceholder3.setTop(new VkPlaceholder.c.C0860c(new vlw(str2, null), new Size(-1, a), null, qhv0.c.a, 12));
            }
            VkPlaceholder vkPlaceholder4 = this.f;
            if (vkPlaceholder4 == null) {
                vkPlaceholder4 = null;
            }
            vkPlaceholder4.setWithPaddings(false);
            View view5 = this.i;
            if (view5 == null) {
                view5 = null;
            }
            bwt0.p0(view5, z);
            if (z2) {
                View view6 = this.g;
                float f = 16;
                bwt0.f0(view6 == null ? null : view6, iah0.a(f), 0, iah0.a(f), 0, 10);
                VkPlaceholder vkPlaceholder5 = this.f;
                if (vkPlaceholder5 == null) {
                    vkPlaceholder5 = null;
                }
                dhr0.f0(R.drawable.catalog_bg_corner_18, R.attr.vk_ui_background_secondary, vkPlaceholder5);
                VkPlaceholder vkPlaceholder6 = this.f;
                if (vkPlaceholder6 == null) {
                    vkPlaceholder6 = null;
                }
                float f2 = 12;
                vkPlaceholder6.setPadding(iah0.a(f2), iah0.a(32), iah0.a(f2), iah0.a(f2));
            } else if (z) {
                View view7 = this.g;
                if (view7 == null) {
                    view7 = null;
                }
                float f3 = 16;
                bwt0.e0(view7, iah0.a(f3), 0, iah0.a(f3), iah0.a(f3));
                VkPlaceholder vkPlaceholder7 = this.f;
                if (vkPlaceholder7 == null) {
                    vkPlaceholder7 = null;
                }
                dhr0.f0(R.drawable.bg_rounded_corners_12, R.attr.vk_ui_background_secondary, vkPlaceholder7);
                VkPlaceholder vkPlaceholder8 = this.f;
                if (vkPlaceholder8 == null) {
                    vkPlaceholder8 = null;
                }
                int a2 = iah0.a(24);
                vkPlaceholder8.setPadding(a2, a2, a2, a2);
            } else {
                View view8 = this.g;
                if (view8 == null) {
                    view8 = null;
                }
                bwt0.e0(view8, 0, 0, 0, 0);
                VkPlaceholder vkPlaceholder9 = this.f;
                if (vkPlaceholder9 == null) {
                    vkPlaceholder9 = null;
                }
                vkPlaceholder9.setBackground(null);
                VkPlaceholder vkPlaceholder10 = this.f;
                if (vkPlaceholder10 == null) {
                    vkPlaceholder10 = null;
                }
                int a3 = iah0.a(32);
                vkPlaceholder10.setPadding(a3, a3, a3, a3);
            }
            View view9 = this.g;
            if (view9 == null) {
                view9 = null;
            }
            view9.requestLayout();
            View view10 = this.g;
            bwt0.Q(view10 != null ? view10 : null, R.id.catalog_ui_test_placeholder, uIBlock.b);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_music_placeholder_feed, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.catalog_placeholder_hide);
        findViewById.setOnClickListener(new c98(this, 1));
        this.h = findViewById;
        this.i = inflate.findViewById(R.id.tip);
        this.f = (VkPlaceholder) inflate.findViewById(R.id.catalog_placeholder);
        this.g = inflate;
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj;
        UIBlockPlaceholder uIBlockPlaceholder = this.j;
        if (uIBlockPlaceholder == null) {
            return;
        }
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == R.id.catalog_placeholder_hide) {
            Iterator<T> it = uIBlockPlaceholder.G.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (obj instanceof UIBlockHideBlockButton) {
                        break;
                    }
                }
            }
            if (!(obj instanceof UIBlockHideBlockButton)) {
                obj = null;
            }
            UIBlockHideBlockButton uIBlockHideBlockButton = (UIBlockHideBlockButton) obj;
            if (uIBlockHideBlockButton != null) {
                itg0.m(rsg0.y0(yfb.x(this.e.m(uIBlockHideBlockButton.A, null)), null, null, 3));
                this.b.b(new xxf0(uIBlockPlaceholder.z), false);
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
