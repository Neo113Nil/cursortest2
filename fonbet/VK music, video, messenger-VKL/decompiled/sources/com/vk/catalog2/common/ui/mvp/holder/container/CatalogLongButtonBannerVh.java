package com.vk.catalog2.common.ui.mvp.holder.container;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.ui.core.design.tools.view.BannersFrameLayout;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.b5a;
import xsna.bwt0;
import xsna.cfp0;
import xsna.f4m;
import xsna.fm4;
import xsna.gzs;
import xsna.iah0;
import xsna.itg0;
import xsna.q3a;
import xsna.r8a;
import xsna.rsg0;
import xsna.s3q0;
import xsna.u4a;
import xsna.xo2;
import xsna.xxf0;
import xsna.y8g0;

/* compiled from: CatalogLongButtonBannerVh.kt */
/* loaded from: classes16.dex */
public final class CatalogLongButtonBannerVh implements CatalogViewHolder, View.OnClickListener {
    public final q3a b;
    public final b5a c;
    public final r8a d;
    public final com.vk.catalog2.common.ui.mvp.util.a e;
    public final boolean f;
    public UIBlockPlaceholder g;
    public BannersFrameLayout h;
    public TextView i;
    public TextView j;
    public TextView k;
    public VKImageView l;
    public UIBlockAction m;
    public gzs<s3q0> n;
    public boolean o;

    public CatalogLongButtonBannerVh(u4a u4aVar, boolean z) {
        u4a.a aVar = u4aVar.b;
        q3a q3aVar = aVar.e;
        b5a b5aVar = aVar.f;
        r8a r8aVar = aVar.q;
        com.vk.catalog2.common.ui.mvp.util.a aVar2 = aVar.w;
        this.b = q3aVar;
        this.c = b5aVar;
        this.d = r8aVar;
        this.e = aVar2;
        this.f = z;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockPlaceholder uIBlockPlaceholder;
        com.vk.catalog2.common.ui.mvp.util.a aVar;
        int i;
        ImageSize Cb;
        Object obj;
        String str = null;
        if (this.f) {
            UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
            if (uIBlockList == null) {
                return;
            }
            Iterator<T> it = uIBlockList.y.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((UIBlock) obj) instanceof UIBlockPlaceholder) {
                        break;
                    }
                }
            }
            uIBlockPlaceholder = obj instanceof UIBlockPlaceholder ? (UIBlockPlaceholder) obj : null;
            if (uIBlockPlaceholder == null) {
                return;
            }
        } else {
            uIBlockPlaceholder = uIBlock instanceof UIBlockPlaceholder ? (UIBlockPlaceholder) uIBlock : null;
            if (uIBlockPlaceholder == null) {
                return;
            }
        }
        this.g = uIBlockPlaceholder;
        TextView textView = this.i;
        if (textView == null) {
            textView = null;
        }
        textView.setText(uIBlockPlaceholder.A);
        TextView textView2 = this.j;
        if (textView2 == null) {
            textView2 = null;
        }
        String str2 = uIBlockPlaceholder.D;
        if (str2 == null) {
            str2 = "";
        }
        textView2.setText(this.d.a(str2));
        this.m = null;
        ArrayList<UIBlockAction> arrayList = uIBlockPlaceholder.G;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            aVar = this.e;
            if (i2 >= size) {
                break;
            }
            if (this.m == null) {
                UIBlockAction uIBlockAction = arrayList.get(i2);
                aVar.getClass();
                if (com.vk.catalog2.common.ui.mvp.util.a.d(uIBlockAction)) {
                    this.m = arrayList.get(i2);
                }
            }
            i2++;
        }
        TextView textView3 = this.k;
        if (textView3 == null) {
            textView3 = null;
        }
        aVar.a(textView3, this.m);
        VKImageView vKImageView = this.l;
        if (vKImageView == null) {
            vKImageView = null;
        }
        if (vKImageView.getLayoutParams().width > 0) {
            i = vKImageView.getLayoutParams().width;
        } else {
            BannersFrameLayout bannersFrameLayout = this.h;
            if (bannersFrameLayout == null) {
                bannersFrameLayout = null;
            }
            if (bannersFrameLayout.getLayoutParams().width > 0) {
                BannersFrameLayout bannersFrameLayout2 = this.h;
                if (bannersFrameLayout2 == null) {
                    bannersFrameLayout2 = null;
                }
                i = bannersFrameLayout2.getLayoutParams().width;
            } else {
                i = iah0.f().widthPixels;
            }
        }
        xo2.a(vKImageView, y8g0.b(R.dimen.clips_music_extraction_banner_corner_radius));
        Image image = uIBlockPlaceholder.B;
        if (image != null && (Cb = image.Cb(i, true, false)) != null) {
            str = Cb.d.d;
        }
        vKImageView.s0(str);
        this.o = true;
    }

    public final void a(boolean z) {
        BannersFrameLayout bannersFrameLayout = this.h;
        if (bannersFrameLayout == null) {
            return;
        }
        if (z) {
            xo2.d(31, 0L, bannersFrameLayout);
        } else {
            f4m.j(bannersFrameLayout);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        BannersFrameLayout bannersFrameLayout = (BannersFrameLayout) layoutInflater.inflate(R.layout.catalog_banner_container_normal, viewGroup, false);
        bannersFrameLayout.setWidthPadding(0);
        bannersFrameLayout.setMaxWidthValue(-1);
        this.h = bannersFrameLayout;
        xo2.a(bannersFrameLayout, y8g0.b(R.dimen.clips_music_extraction_banner_corner_radius));
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.catalog_banner_header_long_button, bannersFrameLayout);
        this.i = (TextView) viewGroup2.findViewById(R.id.catalog_banner_title);
        this.j = (TextView) viewGroup2.findViewById(R.id.catalog_banner_message);
        this.l = (VKImageView) viewGroup2.findViewById(R.id.catalog_banner_end_image);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.catalog_banner_button);
        bwt0.h0(this, textView);
        this.k = textView;
        if (this.f) {
            bannersFrameLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        }
        return bannersFrameLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view != null && view.getId() == R.id.catalog_banner_button) {
            UIBlockPlaceholder uIBlockPlaceholder = this.g;
            UIBlockAction uIBlockAction = this.m;
            if (uIBlockPlaceholder != null) {
                String str = uIBlockPlaceholder.z;
                if (uIBlockAction != null) {
                    gzs<s3q0> gzsVar = this.n;
                    if (gzsVar != null) {
                        gzsVar.invoke();
                        return;
                    }
                    com.vk.catalog2.common.ui.mvp.util.a.e(this.e, view.getContext(), uIBlockPlaceholder, uIBlockAction, null, 56);
                    this.c.a(new cfp0(uIBlockPlaceholder, Boolean.TRUE));
                    String str2 = uIBlockAction.y;
                    if (str2 != null) {
                        itg0.m(rsg0.y0(new fm4(str, str2, uIBlockPlaceholder.f), null, null, 3));
                        this.b.b(new xxf0(str), false);
                    }
                }
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

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
