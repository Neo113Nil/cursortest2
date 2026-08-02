package com.vk.catalog2.common.ui.holders.friend;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionTextButton;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import xsna.ams;
import xsna.b5a;
import xsna.c98;
import xsna.cfp0;

/* compiled from: FriendsActionVh.kt */
/* loaded from: classes16.dex */
public final class FriendsActionVh implements CatalogViewHolder, View.OnClickListener {
    public final b5a b;
    public TextView c;
    public ImageView d;
    public UIBlockActionTextButton e;

    /* compiled from: FriendsActionVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_ADD_FRIEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_SCAN_QR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FriendsActionVh(b5a b5aVar) {
        this.b = b5aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockActionTextButton uIBlockActionTextButton = uIBlock instanceof UIBlockActionTextButton ? (UIBlockActionTextButton) uIBlock : null;
        if (uIBlockActionTextButton == null) {
            return;
        }
        int i = a.$EnumSwitchMapping$0[uIBlockActionTextButton.d.ordinal()];
        if (i == 1) {
            TextView textView = this.c;
            if (textView == null) {
                textView = null;
            }
            textView.setText(R.string.friends_catalog_add_friend);
            ImageView imageView = this.d;
            (imageView != null ? imageView : null).setImageResource(R.drawable.vk_icon_user_add_outline_24);
        } else if (i == 2) {
            TextView textView2 = this.c;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.setText(R.string.friends_catalog_scan_qr);
            ImageView imageView2 = this.d;
            (imageView2 != null ? imageView2 : null).setImageResource(R.drawable.vk_icon_scan_viewfinder_outline_24);
        }
        this.e = uIBlockActionTextButton;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_action_button_friends, viewGroup, false);
        this.c = (TextView) inflate.findViewById(R.id.title);
        this.d = (ImageView) inflate.findViewById(R.id.image);
        inflate.setOnClickListener(new c98(this, 1));
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlockActionTextButton uIBlockActionTextButton;
        if (view == null || (uIBlockActionTextButton = this.e) == null) {
            return;
        }
        this.b.a(new cfp0(uIBlockActionTextButton, null));
        int i = a.$EnumSwitchMapping$0[uIBlockActionTextButton.d.ordinal()];
        if (i == 1) {
            ams.a().a(view.getContext(), false);
        } else {
            if (i != 2) {
                return;
            }
            ams.a().f(view.getContext(), "friends");
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
