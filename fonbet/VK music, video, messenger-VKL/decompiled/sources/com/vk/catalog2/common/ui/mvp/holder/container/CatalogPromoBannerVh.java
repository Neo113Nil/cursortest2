package com.vk.catalog2.common.ui.mvp.holder.container;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.banner.CatalogBannerImageMode;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.ui.core.design.tools.view.BannersFrameLayout;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import xsna.b5a;
import xsna.bt1;
import xsna.bwt0;
import xsna.cfp0;
import xsna.dhr0;
import xsna.e3m;
import xsna.fm4;
import xsna.iah0;
import xsna.itg0;
import xsna.q3a;
import xsna.qc80;
import xsna.r8a;
import xsna.rsg0;
import xsna.xwk;
import xsna.xxf0;

/* compiled from: CatalogPromoBannerVh.kt */
/* loaded from: classes16.dex */
public class CatalogPromoBannerVh implements CatalogViewHolder, View.OnClickListener {
    public final q3a b;
    public final b5a c;
    public final r8a d;
    public final com.vk.catalog2.common.ui.mvp.util.a e;
    public final boolean f;
    public final Integer g;
    public final int h;
    public final int i;
    public final boolean j;
    public final LinkedHashMap k;
    public TextView l;
    public View m;
    public TextView n;
    public TextView o;
    public ImageView p;
    public BannersFrameLayout q;
    public View r;
    public int s;
    public UIBlockPlaceholder t;
    public UIBlockAction u;
    public UIBlockAction v;

    public CatalogPromoBannerVh(q3a q3aVar, b5a b5aVar, r8a r8aVar, com.vk.catalog2.common.ui.mvp.util.a aVar, boolean z, Integer num, int i, int i2, boolean z2) {
        this.b = q3aVar;
        this.c = b5aVar;
        this.d = r8aVar;
        this.e = aVar;
        this.f = z;
        this.g = num;
        this.h = i;
        this.i = i2;
        this.j = z2;
        this.k = new LinkedHashMap();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void N6(UIBlock uIBlock) {
        LinkedHashMap linkedHashMap;
        int i;
        ImageSize Cb;
        UIBlockPlaceholder uIBlockPlaceholder = uIBlock instanceof UIBlockPlaceholder ? (UIBlockPlaceholder) uIBlock : null;
        if (uIBlockPlaceholder == null) {
            return;
        }
        this.t = uIBlockPlaceholder;
        CatalogBannerImageMode catalogBannerImageMode = CatalogBannerImageMode.FULL_BACKGROUND;
        UIBlockPlaceholder uIBlockPlaceholder2 = (UIBlockPlaceholder) uIBlock;
        String str = uIBlockPlaceholder2.D;
        CatalogBannerImageMode catalogBannerImageMode2 = uIBlockPlaceholder2.H;
        boolean z = catalogBannerImageMode == catalogBannerImageMode2;
        View view = this.r;
        if (view == null) {
            view = null;
        }
        bwt0.p0(view, (CatalogBannerImageMode.NONE == catalogBannerImageMode2 || catalogBannerImageMode == catalogBannerImageMode2) ? false : true);
        this.u = null;
        this.v = null;
        ArrayList<UIBlockAction> arrayList = uIBlockPlaceholder2.G;
        UIBlockAction uIBlockAction = uIBlockPlaceholder2.F;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (arrayList.get(i2).d == CatalogViewType.SYNTHETIC_ACTION_CLOSE_BANNER && this.u == null) {
                this.u = arrayList.get(i2);
            }
        }
        this.e.getClass();
        if (com.vk.catalog2.common.ui.mvp.util.a.d(uIBlockAction)) {
            this.v = uIBlockAction;
        }
        CatalogBannerImageMode[] values = CatalogBannerImageMode.values();
        int length = values.length;
        int i3 = 0;
        while (true) {
            linkedHashMap = this.k;
            if (i3 >= length) {
                break;
            }
            CatalogBannerImageMode catalogBannerImageMode3 = values[i3];
            VKImageView vKImageView = (VKImageView) linkedHashMap.get(catalogBannerImageMode3);
            if (vKImageView != null) {
                bwt0.p0(vKImageView, catalogBannerImageMode3 == catalogBannerImageMode2);
            }
            i3++;
        }
        VKImageView vKImageView2 = (VKImageView) linkedHashMap.get(catalogBannerImageMode2);
        if (vKImageView2 != null) {
            if (vKImageView2.getLayoutParams().width > 0) {
                i = vKImageView2.getLayoutParams().width;
            } else {
                BannersFrameLayout bannersFrameLayout = this.q;
                if (bannersFrameLayout == null) {
                    bannersFrameLayout = null;
                }
                if (bannersFrameLayout.getLayoutParams().width > 0) {
                    BannersFrameLayout bannersFrameLayout2 = this.q;
                    if (bannersFrameLayout2 == null) {
                        bannersFrameLayout2 = null;
                    }
                    i = bannersFrameLayout2.getLayoutParams().width;
                } else {
                    i = iah0.f().widthPixels;
                }
            }
            Image image = uIBlockPlaceholder2.B;
            vKImageView2.s0((image == null || (Cb = image.Cb(i, true, false)) == null) ? null : Cb.d.d);
        }
        TextView textView = this.l;
        if (textView == null) {
            textView = null;
        }
        textView.setText(uIBlockPlaceholder2.A);
        int i4 = !xwk.d().a().g(str == null ? "" : str) ? 2 : 1;
        TextView textView2 = this.o;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setImportantForAccessibility(i4);
        TextView textView3 = this.o;
        if (textView3 == null) {
            textView3 = null;
        }
        if (str == null) {
            str = "";
        }
        textView3.setText(this.d.a(str));
        TextView textView4 = this.n;
        if (textView4 == null) {
            textView4 = null;
        }
        textView4.setText(uIBlockPlaceholder2.E);
        ImageView imageView = this.p;
        if (imageView == null) {
            imageView = null;
        }
        Drawable mutate = imageView.getDrawable().mutate();
        mutate.setTint(z ? this.s : dhr0.t.c(R.attr.vk_ui_icon_tertiary));
        ImageView imageView2 = this.p;
        if (imageView2 == null) {
            imageView2 = null;
        }
        imageView2.setImageDrawable(mutate);
        ImageView imageView3 = this.p;
        if (imageView3 == null) {
            imageView3 = null;
        }
        bwt0.p0(imageView3, this.u != null);
        View view2 = this.m;
        bwt0.p0(view2 != null ? view2 : null, this.v != null);
    }

    public final void a(UIBlockPlaceholder uIBlockPlaceholder, UIBlockAction uIBlockAction, boolean z) {
        qc80 qc80Var = new qc80(uIBlockPlaceholder, z);
        String str = uIBlockPlaceholder.z;
        this.c.a(qc80Var);
        String str2 = uIBlockAction.y;
        if (str2 != null) {
            itg0.m(rsg0.y0(new fm4(str, str2, uIBlockPlaceholder.f), null, null, 3));
            this.b.b(new xxf0(str), false);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        BannersFrameLayout bannersFrameLayout = (BannersFrameLayout) layoutInflater.inflate(this.i, viewGroup, false);
        boolean z = this.j;
        Integer num = this.g;
        if (num != null) {
            i = num.intValue();
        } else if (this.f) {
            i = iah0.a(z ? 32 : 20);
        }
        bannersFrameLayout.setWidthPadding(i);
        bannersFrameLayout.setMaxWidthValue(z ? -1 : iah0.a(400));
        this.q = bannersFrameLayout;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(this.h, bannersFrameLayout);
        this.l = (TextView) viewGroup2.findViewById(R.id.catalog_banner_title);
        this.o = (TextView) viewGroup2.findViewById(R.id.catalog_banner_message);
        this.n = (TextView) viewGroup2.findViewById(R.id.catalog_banner_subtext);
        this.r = bannersFrameLayout.findViewById(R.id.images_container);
        CatalogBannerImageMode catalogBannerImageMode = CatalogBannerImageMode.ROUND_SMALL;
        View findViewById = viewGroup2.findViewById(R.id.catalog_banner_image_round_small);
        LinkedHashMap linkedHashMap = this.k;
        linkedHashMap.put(catalogBannerImageMode, findViewById);
        linkedHashMap.put(CatalogBannerImageMode.ROUND_BIG, viewGroup2.findViewById(R.id.catalog_banner_image_round_big));
        linkedHashMap.put(CatalogBannerImageMode.SQUARE_SMALL, viewGroup2.findViewById(R.id.catalog_banner_image_small));
        linkedHashMap.put(CatalogBannerImageMode.SQUARE_BIG, viewGroup2.findViewById(R.id.catalog_banner_image_big));
        CatalogBannerImageMode catalogBannerImageMode2 = CatalogBannerImageMode.FULL_BACKGROUND;
        View findViewById2 = viewGroup2.findViewById(R.id.catalog_banner_background_image);
        ((VKImageView) findViewById2).getHierarchy().o(bt1.a);
        linkedHashMap.put(catalogBannerImageMode2, findViewById2);
        ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.catalog_banner_button_close);
        bwt0.h0(this, imageView);
        this.p = imageView;
        this.m = viewGroup2.findViewById(R.id.catalog_banner_block_button);
        bwt0.h0(this, viewGroup2);
        Context context = viewGroup2.getContext();
        e3m.a aVar = e3m.a;
        this.s = context.getColor(R.color.vk_white);
        return bannersFrameLayout;
    }

    public void onClick(View view) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ImageView imageView = this.p;
        if (imageView == null) {
            imageView = null;
        }
        if (id == imageView.getId()) {
            UIBlockPlaceholder uIBlockPlaceholder = this.t;
            UIBlockAction uIBlockAction = this.u;
            if (uIBlockPlaceholder == null || uIBlockAction == null) {
                return;
            }
            a(uIBlockPlaceholder, uIBlockAction, true);
            return;
        }
        UIBlockPlaceholder uIBlockPlaceholder2 = this.t;
        UIBlockAction uIBlockAction2 = this.v;
        if (uIBlockPlaceholder2 == null || uIBlockAction2 == null) {
            return;
        }
        this.c.a(new cfp0(uIBlockPlaceholder2, null));
        com.vk.catalog2.common.ui.mvp.util.a.e(this.e, view.getContext(), uIBlockPlaceholder2, uIBlockAction2, null, 56);
        a(uIBlockPlaceholder2, uIBlockAction2, false);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    public /* synthetic */ CatalogPromoBannerVh(q3a q3aVar, b5a b5aVar, r8a r8aVar, com.vk.catalog2.common.ui.mvp.util.a aVar, boolean z, boolean z2) {
        this(q3aVar, b5aVar, r8aVar, aVar, z, null, R.layout.catalog_banner_content_center_promo_banner, R.layout.catalog_banner_container_promo_banner, z2);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
