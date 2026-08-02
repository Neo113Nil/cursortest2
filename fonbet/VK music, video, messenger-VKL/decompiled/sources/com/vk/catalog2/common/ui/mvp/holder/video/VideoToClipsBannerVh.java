package com.vk.catalog2.common.ui.mvp.holder.video;

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
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.abg0;
import xsna.b5a;
import xsna.bt1;
import xsna.bwt0;
import xsna.dhr0;
import xsna.e3m;
import xsna.f4m;
import xsna.fm4;
import xsna.iah0;
import xsna.itg0;
import xsna.q3a;
import xsna.qc80;
import xsna.rsg0;
import xsna.xxf0;

/* compiled from: VideoToClipsBannerVh.kt */
/* loaded from: classes16.dex */
public final class VideoToClipsBannerVh implements CatalogViewHolder, View.OnClickListener {
    public final q3a b;
    public final b5a c;
    public final com.vk.catalog2.common.ui.mvp.util.a d;
    public VKImageView e;
    public TextView f;
    public TextView g;
    public ImageView h;
    public UIBlockPlaceholder i;
    public UIBlockAction j;
    public UIBlockAction k;

    public VideoToClipsBannerVh(q3a q3aVar, b5a b5aVar, com.vk.catalog2.common.ui.mvp.util.a aVar) {
        this.b = q3aVar;
        this.c = b5aVar;
        this.d = aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        com.vk.catalog2.common.ui.mvp.util.a aVar;
        UIBlockPlaceholder uIBlockPlaceholder = uIBlock instanceof UIBlockPlaceholder ? (UIBlockPlaceholder) uIBlock : null;
        if (uIBlockPlaceholder == null) {
            return;
        }
        this.i = uIBlockPlaceholder;
        UIBlockPlaceholder uIBlockPlaceholder2 = (UIBlockPlaceholder) uIBlock;
        this.j = null;
        this.k = null;
        ArrayList<UIBlockAction> arrayList = uIBlockPlaceholder2.G;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            aVar = this.d;
            if (i >= size) {
                break;
            }
            if (arrayList.get(i).d == CatalogViewType.SYNTHETIC_ACTION_CLOSE_BANNER) {
                if (this.k == null) {
                    this.k = arrayList.get(i);
                }
            } else if (this.j == null) {
                UIBlockAction uIBlockAction = arrayList.get(i);
                aVar.getClass();
                if (com.vk.catalog2.common.ui.mvp.util.a.d(uIBlockAction)) {
                    this.j = arrayList.get(i);
                }
            }
            i++;
        }
        VKImageView vKImageView = this.e;
        if (vKImageView == null) {
            vKImageView = null;
        }
        bwt0.L(vKImageView, uIBlockPlaceholder2.B);
        TextView textView = this.f;
        if (textView == null) {
            textView = null;
        }
        textView.setText(uIBlockPlaceholder2.A);
        TextView textView2 = this.g;
        if (textView2 == null) {
            textView2 = null;
        }
        aVar.a(textView2, this.j);
        ImageView imageView = this.h;
        bwt0.p0(imageView != null ? imageView : null, this.k != null);
    }

    public final void a(UIBlockPlaceholder uIBlockPlaceholder, UIBlockAction uIBlockAction) {
        qc80 qc80Var = new qc80(uIBlockPlaceholder, true);
        String str = uIBlockPlaceholder.z;
        this.c.a(qc80Var);
        String str2 = uIBlockAction.y;
        if (str2 != null) {
            itg0.m(rsg0.y0(new fm4(str, str2, uIBlockPlaceholder.f), null, null, 3));
            this.b.b(new xxf0(str), false);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.catalog2_banner_rounded_small_image, viewGroup, false);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.catalog_banner_title);
        textView.setTextSize(15.0f);
        abg0 abg0Var = dhr0.t;
        textView.setTextColor(abg0Var.c(R.attr.vk_legacy_text_primary));
        textView.setMaxLines(2);
        this.f = textView;
        VKImageView vKImageView = (VKImageView) viewGroup2.findViewById(R.id.catalog_banner_rounded_small_image);
        vKImageView.getHierarchy().o(bt1.a);
        this.e = vKImageView;
        ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.catalog_banner_button_close);
        Drawable mutate = imageView.getDrawable().mutate();
        mutate.setTint(abg0Var.c(R.attr.vk_legacy_icon_tertiary));
        imageView.setImageDrawable(mutate);
        bwt0.h0(this, imageView);
        this.h = imageView;
        TextView textView2 = (TextView) viewGroup2.findViewById(R.id.catalog_banner_button_primary);
        textView2.setBackgroundResource(R.drawable.vkui_bg_button_primary);
        textView2.setTextColor(abg0Var.c(R.attr.vk_legacy_button_primary_foreground));
        textView2.setTextSize(14.0f);
        bwt0.h0(this, textView2);
        this.g = textView2;
        float f = 12;
        f4m.s(iah0.a(f), viewGroup2);
        f4m.r(iah0.a(f), viewGroup2);
        bwt0.h0(this, viewGroup2);
        Context context = viewGroup2.getContext();
        e3m.a aVar = e3m.a;
        context.getColor(R.color.vk_white);
        return viewGroup2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        TextView textView = this.g;
        if (textView == null) {
            textView = null;
        }
        if (id == textView.getId()) {
            UIBlockPlaceholder uIBlockPlaceholder = this.i;
            UIBlockAction uIBlockAction = this.j;
            if (uIBlockPlaceholder == null || uIBlockAction == null) {
                return;
            }
            com.vk.catalog2.common.ui.mvp.util.a.e(this.d, view.getContext(), uIBlockPlaceholder, uIBlockAction, null, 56);
            a(uIBlockPlaceholder, uIBlockAction);
            return;
        }
        ImageView imageView = this.h;
        if (id == (imageView != null ? imageView : null).getId()) {
            UIBlockPlaceholder uIBlockPlaceholder2 = this.i;
            UIBlockAction uIBlockAction2 = this.k;
            if (uIBlockPlaceholder2 == null || uIBlockAction2 == null) {
                return;
            }
            a(uIBlockPlaceholder2, uIBlockAction2);
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
