package com.vk.catalog2.common.ui.holders.video;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionTextButton;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.Image;
import com.vk.dto.newsfeed.Owner;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.bwt0;
import xsna.iut0;
import xsna.n82;

/* compiled from: KidsModePlaceholderVh.kt */
/* loaded from: classes16.dex */
public final class KidsModePlaceholderVh implements CatalogViewHolder {
    public View b;
    public VkImage c;
    public VkText d;
    public VkButton e;

    /* compiled from: ViewExt.kt */
    public static final class a implements View.OnLayoutChangeListener {
        public final /* synthetic */ VkImage b;
        public final /* synthetic */ Image c;

        public a(VkImage vkImage, Image image) {
            this.b = vkImage;
            this.c = image;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            Serializer.c<Owner> cVar = Owner.CREATOR;
            Image image = this.c;
            VkImage vkImage = this.b;
            vkImage.o0(Owner.a.a(vkImage.getWidth(), image), null);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.c = null;
        this.d = null;
        this.e = null;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        Object obj;
        if (uIBlock instanceof UIBlockPlaceholder) {
            UIBlockPlaceholder uIBlockPlaceholder = (UIBlockPlaceholder) uIBlock;
            Image image = uIBlockPlaceholder.B;
            VkImage vkImage = this.c;
            if (image != null && vkImage != null) {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                if (vkImage.isLaidOut()) {
                    Serializer.c<Owner> cVar = Owner.CREATOR;
                    vkImage.o0(Owner.a.a(vkImage.getWidth(), image), null);
                } else {
                    vkImage.addOnLayoutChangeListener(new a(vkImage, image));
                }
            }
            VkText vkText = this.d;
            if (vkText != null) {
                vkText.setText(uIBlockPlaceholder.C);
            }
            Iterator<T> it = uIBlockPlaceholder.G.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((UIBlockAction) obj).d == CatalogViewType.SYNTHETIC_ACTION_OPEN_MODAL) {
                        break;
                    }
                }
            }
            UIBlockActionTextButton uIBlockActionTextButton = obj instanceof UIBlockActionTextButton ? (UIBlockActionTextButton) obj : null;
            VkButton vkButton = this.e;
            if (vkButton != null) {
                vkButton.setVisibility(uIBlockActionTextButton != null ? 0 : 8);
            }
            VkButton vkButton2 = this.e;
            if (vkButton2 != null) {
                vkButton2.setText(uIBlockActionTextButton != null ? uIBlockActionTextButton.z : null);
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_video_profile_catalog_kids_placeholder, viewGroup, false);
        this.c = (VkImage) inflate.findViewById(R.id.catalog_placeholder_view_image);
        this.d = (VkText) inflate.findViewById(R.id.catalog_placeholder_view_title);
        VkButton vkButton = (VkButton) inflate.findViewById(R.id.primary_button);
        this.e = vkButton;
        if (vkButton != null) {
            bwt0.i0(vkButton, new n82(this, 25));
        }
        this.b = inflate;
        return inflate;
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
