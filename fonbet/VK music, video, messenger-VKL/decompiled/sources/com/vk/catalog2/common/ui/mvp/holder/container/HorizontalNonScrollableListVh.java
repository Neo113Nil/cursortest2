package com.vk.catalog2.common.ui.mvp.holder.container;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.OpenSectionViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockButtons;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.e43;
import xsna.iah0;
import xsna.u4a;

/* compiled from: HorizontalNonScrollableListVh.kt */
/* loaded from: classes16.dex */
public class HorizontalNonScrollableListVh implements CatalogViewHolder {
    public final com.vk.catalog2.common.ui.mvp.configuration.a b;
    public final u4a c;
    public final int d;
    public final Integer e;
    public final int f;
    public UIBlockButtons g;
    public ViewGroup h;
    public LayoutInflater i;

    public HorizontalNonScrollableListVh(com.vk.catalog2.common.ui.mvp.configuration.a aVar, u4a u4aVar, int i, Integer num, int i2) {
        this.b = aVar;
        this.c = u4aVar;
        this.d = i;
        this.e = num;
        this.f = i2;
    }

    public static void a(int i, ViewGroup viewGroup) {
        viewGroup.addView(new Space(viewGroup.getContext()), new ViewGroup.LayoutParams(i, -1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        if (r0.b == com.vk.catalog2.common.dto.api.style.OpenSectionViewStyle.ButtonStyle.FLAT) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b2  */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void N6(UIBlock uIBlock) {
        boolean z;
        int i;
        ViewGroup viewGroup;
        if (!(uIBlock instanceof UIBlockButtons) || uIBlock.equals(this.g)) {
            return;
        }
        UIBlockButtons uIBlockButtons = (UIBlockButtons) uIBlock;
        ArrayList<UIBlock> arrayList = uIBlockButtons.y;
        this.g = uIBlockButtons;
        ViewGroup viewGroup2 = this.h;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        viewGroup2.removeAllViews();
        boolean z2 = true;
        if (arrayList.size() == 1) {
            UIBlock uIBlock2 = arrayList.get(0);
            CatalogViewType catalogViewType = uIBlock2.d;
            CatalogViewStyle catalogViewStyle = uIBlock2.l;
            if (catalogViewType != CatalogViewType.SYNTHETIC_ACTION_PLAY_SHUFFLED_AUDIO_FROM_BLOCK && catalogViewType != CatalogViewType.SYNTHETIC_ACTION_PLAY_AUDIO_FROM_BLOCK && catalogViewType != CatalogViewType.SYNTHETIC_ACTION_SAVE_AS_PLAYLIST && catalogViewType != CatalogViewType.SYNTHETIC_ACTION_CREATE_PLAYLIST && catalogViewType != CatalogViewType.SYNTHETIC_ACTION_CREATE_ALBUM && catalogViewType != CatalogViewType.SYNTHETIC_ACTION_OPEN_INFO_POPUP) {
                if (catalogViewType == CatalogViewType.SYNTHETIC_ACTION_OPEN_SECTION) {
                    OpenSectionViewStyle openSectionViewStyle = catalogViewStyle instanceof OpenSectionViewStyle ? (OpenSectionViewStyle) catalogViewStyle : null;
                    if (openSectionViewStyle != null) {
                    }
                }
            }
            z = true;
            if (!arrayList.isEmpty()) {
                Iterator<T> it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    CatalogViewType catalogViewType2 = ((UIBlock) it.next()).d;
                    if (catalogViewType2 != CatalogViewType.SYNTHETIC_ACTION_ADD_FRIEND && catalogViewType2 != CatalogViewType.SYNTHETIC_ACTION_SCAN_QR && catalogViewType2 != CatalogViewType.SYNTHETIC_ACTION_PLAY_SHUFFLED_AUDIO_FROM_BLOCK && catalogViewType2 != CatalogViewType.SYNTHETIC_ACTION_SAVE_AS_PLAYLIST && catalogViewType2 != CatalogViewType.SYNTHETIC_ACTION_PLAY_AUDIO_FROM_BLOCK) {
                        z2 = false;
                        break;
                    }
                }
            }
            if (z) {
                i = this.f;
                if (z2) {
                    i -= iah0.a(6);
                }
            } else {
                i = 0;
            }
            viewGroup = this.h;
            if (viewGroup == null) {
                viewGroup = null;
            }
            a(i, viewGroup);
            int i2 = 0;
            for (Object obj : arrayList) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    e43.t();
                    throw null;
                }
                UIBlock uIBlock3 = (UIBlock) obj;
                UIBlock uIBlock4 = uIBlock;
                CatalogViewHolder w = this.b.w(uIBlock3.e, uIBlock3.d, uIBlock3.l, uIBlock4, this.c);
                Integer num = this.e;
                int intValue = num != null ? num.intValue() : !z2 ? i : 0;
                LayoutInflater layoutInflater = this.i;
                if (layoutInflater == null) {
                    layoutInflater = null;
                }
                ViewGroup viewGroup3 = this.h;
                if (viewGroup3 == null) {
                    viewGroup3 = null;
                }
                View k5 = w.k5(layoutInflater, viewGroup3, null);
                b((LinearLayout.LayoutParams) k5.getLayoutParams());
                if (i2 != 0) {
                    ViewGroup viewGroup4 = this.h;
                    if (viewGroup4 == null) {
                        viewGroup4 = null;
                    }
                    a(intValue, viewGroup4);
                }
                ViewGroup viewGroup5 = this.h;
                if (viewGroup5 == null) {
                    viewGroup5 = null;
                }
                viewGroup5.addView(k5);
                w.N6(uIBlock3);
                i2 = i3;
                uIBlock = uIBlock4;
            }
            ViewGroup viewGroup6 = this.h;
            a(i, viewGroup6 != null ? viewGroup6 : null);
        }
        z = false;
        if (!arrayList.isEmpty()) {
        }
        if (z) {
        }
        viewGroup = this.h;
        if (viewGroup == null) {
        }
        a(i, viewGroup);
        int i22 = 0;
        while (r1.hasNext()) {
        }
        ViewGroup viewGroup62 = this.h;
        a(i, viewGroup62 != null ? viewGroup62 : null);
    }

    public void b(LinearLayout.LayoutParams layoutParams) {
        layoutParams.weight = 1.0f;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_non_scrolling_horizontal_list, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        this.h = viewGroup2;
        this.i = LayoutInflater.from(viewGroup2.getContext());
        int i = this.d;
        viewGroup2.setPadding(0, i, 0, i);
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

    public HorizontalNonScrollableListVh(com.vk.catalog2.common.ui.mvp.configuration.a aVar, u4a u4aVar, int i, Integer num, int i2, int i3) {
        this(aVar, u4aVar, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? null : num, (i3 & 16) != 0 ? iah0.a(16) : i2);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
