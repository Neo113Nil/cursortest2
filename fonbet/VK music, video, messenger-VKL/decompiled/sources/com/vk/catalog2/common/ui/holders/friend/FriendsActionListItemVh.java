package com.vk.catalog2.common.ui.holders.friend;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionTextButton;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import xsna.ams;
import xsna.b5a;
import xsna.bwt0;
import xsna.c98;
import xsna.cfp0;
import xsna.dhr0;
import xsna.gpo0;
import xsna.gzs;
import xsna.qcy;
import xsna.rns;
import xsna.tlo0;
import xsna.tq;
import xsna.vu5;

/* compiled from: FriendsActionListItemVh.kt */
/* loaded from: classes16.dex */
public final class FriendsActionListItemVh implements CatalogViewHolder, View.OnClickListener {
    public final b5a b;
    public final rns c;
    public VkCell d;
    public UIBlockActionTextButton e;

    /* compiled from: FriendsActionListItemVh.kt */
    public static final class a implements VkCell.d {
        public final ImageView a;

        public a(Context context) {
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            gpo0.f(imageView, Integer.valueOf(R.attr.vk_ui_icon_contrast));
            this.a = imageView;
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final void a(VkCell.f fVar) {
            c cVar = fVar instanceof c ? (c) fVar : null;
            if (cVar != null) {
                int i = cVar.a;
                ImageView imageView = this.a;
                imageView.setImageResource(i);
                int i2 = cVar.b;
                qcy<Object>[] qcyVarArr = bwt0.a;
                dhr0.h0(i2, imageView);
            }
        }

        @Override // com.vk.core.view.components.cell.VkCell.d
        public final View getView() {
            return this.a;
        }
    }

    /* compiled from: FriendsActionListItemVh.kt */
    public static final class b implements VkCell.e {
        @Override // com.vk.core.view.components.cell.VkCell.e
        public final VkCell.d create(Context context) {
            return new a(context);
        }
    }

    /* compiled from: FriendsActionListItemVh.kt */
    public static final class c implements VkCell.f {
        public final int a;
        public final int b;

        public c(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LeftImageParams(imageRes=");
            sb.append(this.a);
            sb.append(", backgroundRes=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: FriendsActionListItemVh.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_ADD_FRIENDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_IMPORT_CONTACTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogViewType.SYNTHETIC_ACTION_FRIENDS_CLEANUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FriendsActionListItemVh(b5a b5aVar, rns rnsVar) {
        this.b = b5aVar;
        this.c = rnsVar;
    }

    public static VkCell.Left.b a(int i, int i2) {
        return new VkCell.Left.b(new VkCell.Left.Main.d(new c(i, i2), VkCell.Left.Main.Size.Small), null);
    }

    public static VkCell.Middle.b b(int i, Integer num) {
        VkCell.Middle.d dVar;
        if (num != null) {
            dVar = new VkCell.Middle.d(tq.h(tlo0.Companion, num.intValue()), (gzs) null, 0, TextUtils.TruncateAt.END, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 54);
        } else {
            dVar = null;
        }
        return new VkCell.Middle.b(new VkCell.Middle.e(tq.h(tlo0.Companion, i), 0, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 54), dVar, (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 12);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockActionTextButton uIBlockActionTextButton = uIBlock instanceof UIBlockActionTextButton ? (UIBlockActionTextButton) uIBlock : null;
        if (uIBlockActionTextButton == null) {
            return;
        }
        VkCell vkCell = this.d;
        if (vkCell == null) {
            vkCell = null;
        }
        vkCell.getContext();
        int i = d.$EnumSwitchMapping$0[uIBlockActionTextButton.d.ordinal()];
        if (i == 1) {
            VkCell vkCell2 = this.d;
            if (vkCell2 == null) {
                vkCell2 = null;
            }
            vkCell2.setMiddle(b(R.string.friends_catalog_add_friend_experiment, Integer.valueOf(R.string.friends_catalog_add_friend_subtitle_experiment)));
            VkCell vkCell3 = this.d;
            (vkCell3 != null ? vkCell3 : null).setLeft(a(R.drawable.vk_icon_user_add_24, R.drawable.catalog_bg_gradient_blue_circle));
        } else if (i == 2) {
            VkCell vkCell4 = this.d;
            if (vkCell4 == null) {
                vkCell4 = null;
            }
            vkCell4.setMiddle(b(R.string.friends_catalog_import_contacts_experiment, Integer.valueOf(R.string.friends_catalog_import_contacts_subtitle_experiment)));
            VkCell vkCell5 = this.d;
            (vkCell5 != null ? vkCell5 : null).setLeft(a(R.drawable.vk_icon_phone_24, R.drawable.catalog_bg_gradient_green_circle));
        } else if (i == 3) {
            VkCell vkCell6 = this.d;
            if (vkCell6 == null) {
                vkCell6 = null;
            }
            vkCell6.setMiddle(b(R.string.friends_catalog_friends_cleanup, Integer.valueOf(R.string.friends_catalog_friends_cleanup_subtitle)));
            VkCell vkCell7 = this.d;
            (vkCell7 != null ? vkCell7 : null).setLeft(a(R.drawable.vk_icon_users_24, R.drawable.catalog_bg_gradient_violet_circle));
        }
        this.e = uIBlockActionTextButton;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        VkCell vkCell = (VkCell) layoutInflater.inflate(R.layout.catalog_action_list_item_friends, viewGroup, false);
        this.d = vkCell;
        if (vkCell == null) {
            vkCell = null;
        }
        vkCell.setOnClickListener(new c98(this, 1));
        VkCell vkCell2 = this.d;
        if (vkCell2 == null) {
            vkCell2 = null;
        }
        vkCell2.getContext();
        VkCell vkCell3 = this.d;
        if (vkCell3 == null) {
            vkCell3 = null;
        }
        vkCell3.setLeftMainPictureController(new b());
        VkCell vkCell4 = this.d;
        if (vkCell4 == null) {
            return null;
        }
        return vkCell4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlockActionTextButton uIBlockActionTextButton;
        if (view == null || (uIBlockActionTextButton = this.e) == null) {
            return;
        }
        this.b.a(new cfp0(uIBlockActionTextButton, null));
        int i = d.$EnumSwitchMapping$0[uIBlockActionTextButton.d.ordinal()];
        if (i == 1) {
            ams.a().a(view.getContext(), false);
        } else if (i == 2) {
            ams.a().e(view.getContext());
        } else {
            if (i != 3) {
                return;
            }
            this.c.a(view.getContext());
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
