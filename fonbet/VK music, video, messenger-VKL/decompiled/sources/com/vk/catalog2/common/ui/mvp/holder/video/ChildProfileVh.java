package com.vk.catalog2.common.ui.mvp.holder.video;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenScreen;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenScreenLarge;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.Image;
import com.vk.dto.newsfeed.Owner;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.b5a;
import xsna.bwt0;
import xsna.h7v;
import xsna.iut0;
import xsna.j5g;
import xsna.nda;
import xsna.oh3;
import xsna.w9c;

/* compiled from: ChildProfileVh.kt */
/* loaded from: classes16.dex */
public final class ChildProfileVh implements CatalogViewHolder {
    public final com.vk.catalog2.common.ui.mvp.util.a b;
    public final nda c;
    public final b5a d;
    public final h7v e;
    public TextView f;
    public VKImageView g;
    public VkButton h;
    public View i;

    /* compiled from: ChildProfileVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_OPEN_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_OPEN_SCREEN_LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_OPEN_URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: ViewExt.kt */
    public static final class b implements View.OnLayoutChangeListener {
        public final /* synthetic */ VKImageView b;
        public final /* synthetic */ UIBlock c;

        public b(VKImageView vKImageView, UIBlock uIBlock) {
            this.b = vKImageView;
            this.c = uIBlock;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            String str;
            view.removeOnLayoutChangeListener(this);
            Image image = ((UIBlockPlaceholder) this.c).B;
            VKImageView vKImageView = this.b;
            if (image != null) {
                Serializer.c<Owner> cVar = Owner.CREATOR;
                str = Owner.a.a(vKImageView.getWidth(), image);
            } else {
                str = null;
            }
            vKImageView.load(str);
        }
    }

    public ChildProfileVh(com.vk.catalog2.common.ui.mvp.util.a aVar, nda ndaVar, b5a b5aVar, h7v h7vVar) {
        this.b = aVar;
        this.c = ndaVar;
        this.d = b5aVar;
        this.e = h7vVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        VkButton vkButton;
        String str;
        if (uIBlock instanceof UIBlockPlaceholder) {
            TextView textView = this.f;
            if (textView != null) {
                textView.setText(((UIBlockPlaceholder) uIBlock).D);
            }
            VKImageView vKImageView = this.g;
            String str2 = null;
            if (vKImageView != null) {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                if (vKImageView.isLaidOut()) {
                    Image image = ((UIBlockPlaceholder) uIBlock).B;
                    if (image != null) {
                        Serializer.c<Owner> cVar = Owner.CREATOR;
                        str = Owner.a.a(vKImageView.getWidth(), image);
                    } else {
                        str = null;
                    }
                    vKImageView.load(str);
                } else {
                    vKImageView.addOnLayoutChangeListener(new b(vKImageView, uIBlock));
                }
            }
            VkButton vkButton2 = this.h;
            if (vkButton2 != null) {
                UIBlockAction uIBlockAction = (UIBlockAction) j5g.a0(((UIBlockPlaceholder) uIBlock).G);
                if (uIBlockAction instanceof UIBlockActionOpenScreen) {
                    str2 = ((UIBlockActionOpenScreen) uIBlockAction).z;
                } else if (uIBlockAction instanceof UIBlockActionOpenScreenLarge) {
                    str2 = ((UIBlockActionOpenScreenLarge) uIBlockAction).z;
                } else if (uIBlockAction instanceof UIBlockActionOpenUrl) {
                    str2 = ((UIBlockActionOpenUrl) uIBlockAction).z;
                }
                vkButton2.setText(str2);
            }
            UIBlockHint uIBlockHint = uIBlock.j;
            if (uIBlockHint != null) {
                String str3 = uIBlockHint.y;
                h7v h7vVar = this.e;
                if (h7vVar.a(str3) && (vkButton = this.h) != null) {
                    vkButton.postDelayed(new w9c(0, vkButton, uIBlockHint), 350L);
                    h7vVar.b(str3);
                }
            }
            View view = this.i;
            if (view != null) {
                bwt0.i0(view, new oh3(6, this, uIBlock));
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.video_child_profile_view, viewGroup, false);
        this.i = inflate;
        this.f = (TextView) inflate.findViewById(R.id.title);
        this.g = (VKImageView) inflate.findViewById(R.id.icon);
        this.h = (VkButton) inflate.findViewById(R.id.action);
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

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
