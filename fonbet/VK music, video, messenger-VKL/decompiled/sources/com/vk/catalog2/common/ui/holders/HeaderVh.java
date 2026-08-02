package com.vk.catalog2.common.ui.holders;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.ironsource.X3;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.badge.CatalogBadge;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockBadge;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenScreen;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSearchTab;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionSwitchSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockHideBlockButton;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.text.VkText;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.af0;
import xsna.b5a;
import xsna.baf0;
import xsna.bpn0;
import xsna.bwt0;
import xsna.c98;
import xsna.drm0;
import xsna.f4m;
import xsna.gbh;
import xsna.i68;
import xsna.iah0;
import xsna.q3a;
import xsna.xga;

/* compiled from: HeaderVh.kt */
/* loaded from: classes16.dex */
public class HeaderVh implements CatalogViewHolder, View.OnClickListener {
    public final int b;
    public final q3a c;
    public final b5a d;
    public final xga e;
    public View f;
    public TextView g;
    public TextView h;
    public VkText i;
    public TextView j;
    public UIBlockHeader k;
    public VKImageView l;
    public ImageView m;
    public View n;
    public io.reactivex.rxjava3.disposables.c o;
    public float p;
    public final bpn0 q;
    public final bpn0 r;

    public HeaderVh() {
        this(0, null, null, 15);
    }

    public static boolean a(UIBlockHideBlockButton uIBlockHideBlockButton) {
        CatalogViewType.a aVar = CatalogViewType.Companion;
        String str = uIBlockHideBlockButton.D;
        aVar.getClass();
        CatalogViewType a = CatalogViewType.a.a(str);
        if (a == null) {
            return false;
        }
        switch (CatalogViewType.b.$EnumSwitchMapping$0[a.ordinal()]) {
        }
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void L() {
        io.reactivex.rxjava3.disposables.c cVar = this.o;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void N6(UIBlock uIBlock) {
        String str;
        CatalogBadge catalogBadge;
        String str2;
        CatalogBadge catalogBadge2;
        String str3;
        UIBlockHeader uIBlockHeader = uIBlock instanceof UIBlockHeader ? (UIBlockHeader) uIBlock : null;
        if (uIBlockHeader == null) {
            return;
        }
        String str4 = uIBlockHeader.z;
        TextView textView = this.g;
        if (textView == null) {
            textView = null;
        }
        textView.setText(uIBlockHeader.y);
        TextView textView2 = this.h;
        if (textView2 != null) {
            textView2.setText(str4);
        }
        TextView textView3 = this.h;
        if (textView3 != null) {
            bwt0.p0(textView3, !(str4 == null || drm0.N(str4)));
        }
        VKImageView vKImageView = this.l;
        if (vKImageView != null) {
            bwt0.p0(vKImageView, false);
        }
        View view = this.n;
        if (view != null) {
            bwt0.p0(view, false);
        }
        UIBlockActionOpenScreen uIBlockActionOpenScreen = uIBlockHeader.I;
        if (uIBlockActionOpenScreen == null || (str = uIBlockActionOpenScreen.z) == null) {
            UIBlockActionOpenSection uIBlockActionOpenSection = uIBlockHeader.E;
            if (uIBlockActionOpenSection != null) {
                str = uIBlockActionOpenSection.z;
            } else {
                UIBlockActionSwitchSection uIBlockActionSwitchSection = uIBlockHeader.F;
                str = uIBlockActionSwitchSection != null ? uIBlockActionSwitchSection.z : null;
                if (str == null) {
                    UIBlockActionOpenSearchTab uIBlockActionOpenSearchTab = uIBlockHeader.G;
                    str = uIBlockActionOpenSearchTab != null ? uIBlockActionOpenSearchTab.z : null;
                    if (str == null) {
                        UIBlockActionOpenUrl uIBlockActionOpenUrl = uIBlockHeader.J;
                        str = uIBlockActionOpenUrl != null ? uIBlockActionOpenUrl.z : null;
                    }
                }
            }
        }
        UIBlockHideBlockButton uIBlockHideBlockButton = uIBlockHeader.K;
        if (uIBlockHideBlockButton != null) {
            TextView textView4 = this.g;
            if (textView4 == null) {
                textView4 = null;
            }
            textView4.setTextAppearance(R.style.VkUiTypography_Headline2);
            View view2 = this.f;
            if (view2 == null) {
                view2 = null;
            }
            bwt0.c0(iah0.a(46.0f), view2);
            TextView textView5 = this.j;
            if (textView5 != null) {
                bwt0.p0(textView5, false);
            }
            View view3 = this.n;
            if (view3 != null) {
                bwt0.p0(view3, true);
            }
            View view4 = this.n;
            if (view4 != null) {
                view4.setOnClickListener(new i68(3, this, uIBlockHideBlockButton));
            }
        } else if (uIBlockHeader.D != null) {
            TextView textView6 = this.j;
            if (textView6 != null) {
                textView6.setText(R.string.catalog_lists);
            }
            TextView textView7 = this.j;
            if (textView7 != null) {
                textView7.setCompoundDrawablePadding(iah0.a(4));
            }
            TextView textView8 = this.j;
            if (textView8 != null) {
                textView8.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (baf0) this.q.getValue(), (Drawable) null);
            }
            TextView textView9 = this.j;
            if (textView9 != null) {
                bwt0.p0(textView9, true);
            }
        } else if (str != null) {
            TextView textView10 = this.j;
            if (textView10 != null) {
                bwt0.Q(textView10, R.id.catalog_ui_test_show_all_btn, uIBlock.b);
            }
            TextView textView11 = this.j;
            if (textView11 != null) {
                textView11.setText(str);
            }
            TextView textView12 = this.j;
            if (textView12 != null) {
                textView12.setCompoundDrawablePadding(iah0.a(0));
            }
            TextView textView13 = this.j;
            if (textView13 != null) {
                textView13.setCompoundDrawables(null, null, null, null);
            }
            TextView textView14 = this.j;
            if (textView14 != null) {
                bwt0.p0(textView14, true);
            }
        } else {
            TextView textView15 = this.j;
            if (textView15 != null) {
                bwt0.p0(textView15, false);
            }
        }
        UIBlockBadge uIBlockBadge = uIBlockHeader.C;
        VkText vkText = this.i;
        if (vkText != null) {
            bwt0.p0(vkText, (uIBlockBadge == null || (catalogBadge2 = uIBlockBadge.y) == null || (str3 = catalogBadge2.b) == null || str3.length() <= 0) ? false : true);
            if (uIBlockBadge != null && (catalogBadge = uIBlockBadge.y) != null && (str2 = catalogBadge.b) != null && str2.length() > 0) {
                CatalogBadge catalogBadge3 = uIBlockBadge.y;
                vkText.setText(catalogBadge3 != null ? catalogBadge3.b : null);
                CatalogBadge catalogBadge4 = uIBlockBadge.y;
                String str5 = catalogBadge4 != null ? catalogBadge4.c : null;
                if (str5 != null) {
                    switch (str5.hashCode()) {
                        case -1726194350:
                            if (str5.equals(X3.i.T)) {
                                vkText.setBackgroundResource(R.drawable.transparent);
                                vkText.setTextColor(vkText.getContext().getColor(R.color.vk_gray_400));
                                vkText.setTextSize(2, 15.0f);
                                vkText.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                                vkText.setCompoundDrawablePadding(0);
                                break;
                            }
                            break;
                        case -817598092:
                            if (str5.equals(X3.i.Y)) {
                                vkText.setBackgroundResource(R.drawable.catalog_header_badge_secondary);
                                vkText.setTextColor(vkText.getContext().getColor(R.color.vk_white));
                                vkText.setTextSize(2, 14.0f);
                                vkText.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                                vkText.setCompoundDrawablePadding(0);
                                break;
                            }
                            break;
                        case -804936122:
                            if (str5.equals("prominent")) {
                                vkText.setBackgroundResource(R.drawable.catalog_header_badge_prominent);
                                vkText.setTextColor(vkText.getContext().getColor(R.color.vk_white));
                                vkText.setTextSize(2, 14.0f);
                                vkText.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                                vkText.setCompoundDrawablePadding(0);
                                break;
                            }
                            break;
                        case -635754306:
                            if (str5.equals("arrow_secondary")) {
                                vkText.setBackgroundResource(R.drawable.catalog_header_badge_arrow);
                                vkText.setTextColor(vkText.getContext().getColor(R.color.vk_white));
                                vkText.setTextSize(2, 13.0f);
                                vkText.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (baf0) this.r.getValue(), (Drawable) null);
                                vkText.setCompoundDrawablePadding(iah0.a(3));
                                break;
                            }
                            break;
                        case -314765822:
                            if (str5.equals("primary")) {
                                vkText.setBackgroundResource(R.drawable.catalog_header_badge_primary);
                                vkText.setTextColor(vkText.getContext().getColor(R.color.vk_white));
                                vkText.setTextSize(2, 14.0f);
                                vkText.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                                vkText.setCompoundDrawablePadding(0);
                                break;
                            }
                            break;
                    }
                }
            }
        }
        this.k = uIBlockHeader;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.b, viewGroup, false);
        this.f = inflate;
        this.g = (TextView) inflate.findViewById(R.id.title);
        this.h = (TextView) inflate.findViewById(R.id.subtitle);
        this.i = (VkText) inflate.findViewById(R.id.badge);
        this.l = (VKImageView) inflate.findViewById(R.id.icon);
        this.j = (TextView) inflate.findViewById(R.id.show_all_btn);
        this.n = inflate.findViewById(R.id.options);
        this.m = (ImageView) inflate.findViewById(R.id.sort);
        TextView textView = this.j;
        if (textView != null) {
            textView.setOnClickListener(new c98(this, 1));
        }
        this.p = this.p;
        View view = this.f;
        View view2 = view != null ? view : null;
        if (view == null) {
            view = null;
        }
        f4m.y(iah0.a(this.p) + view.getPaddingTop(), view2);
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public boolean ze(Rect rect) {
        return false;
    }

    public HeaderVh(int i, q3a q3aVar, b5a b5aVar, int i2) {
        i = (i2 & 1) != 0 ? R.layout.catalog_header_item_view : i;
        q3aVar = (i2 & 2) != 0 ? null : q3aVar;
        b5aVar = (i2 & 4) != 0 ? null : b5aVar;
        xga xgaVar = new xga();
        this.b = i;
        this.c = q3aVar;
        this.d = b5aVar;
        this.e = xgaVar;
        this.q = new bpn0(new af0(19));
        this.r = new bpn0(new gbh(this, 23));
    }

    public void onClick(View view) {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
