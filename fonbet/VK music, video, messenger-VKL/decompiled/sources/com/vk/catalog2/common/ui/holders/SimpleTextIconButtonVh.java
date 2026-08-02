package com.vk.catalog2.common.ui.holders;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionTextButton;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.dhr0;
import xsna.e3m;

/* compiled from: SimpleTextIconButtonVh.kt */
/* loaded from: classes16.dex */
public abstract class SimpleTextIconButtonVh extends ActionVh {
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public TextView f;
    public ImageView g;
    public UIBlockAction h;

    public SimpleTextIconButtonVh(int i, int i2, int i3) {
        i = (i3 & 1) != 0 ? 0 : i;
        i2 = (i3 & 4) != 0 ? R.layout.catalog_music_action_music_btn : i2;
        int i4 = (i3 & 8) != 0 ? -1 : R.dimen.catalog_playlist_play_icon_padding;
        this.b = i;
        this.c = R.attr.vk_ui_background_accent_themed;
        this.d = i2;
        this.e = i4;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void N6(UIBlock uIBlock) {
        UIBlockAction uIBlockAction = uIBlock instanceof UIBlockAction ? (UIBlockAction) uIBlock : null;
        if (uIBlockAction == null) {
            return;
        }
        TextView textView = this.f;
        if (textView == null) {
            textView = null;
        }
        UIBlockActionTextButton uIBlockActionTextButton = uIBlockAction instanceof UIBlockActionTextButton ? (UIBlockActionTextButton) uIBlockAction : null;
        textView.setText(uIBlockActionTextButton != null ? uIBlockActionTextButton.z : null);
        this.h = uIBlockAction;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.d, viewGroup, false);
        this.f = (TextView) inflate.findViewById(R.id.title);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.icon);
        this.g = imageView;
        int i = this.b;
        if (i > 0) {
            dhr0.a.l0(imageView, i, this.c);
        }
        bwt0.h0(this, inflate);
        int i2 = this.e;
        if (i2 != -1) {
            int a = e3m.a(i2, inflate.getContext());
            ImageView imageView2 = this.g;
            ImageView imageView3 = imageView2 != null ? imageView2 : null;
            if (imageView2 == null) {
                imageView2 = null;
            }
            ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
            layoutParams.width = a;
            layoutParams.height = a;
            imageView3.setLayoutParams(layoutParams);
        }
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}
