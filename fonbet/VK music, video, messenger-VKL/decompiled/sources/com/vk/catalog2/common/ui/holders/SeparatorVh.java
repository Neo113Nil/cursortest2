package com.vk.catalog2.common.ui.holders;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.layout.LayoutSize;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockSeparator;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.divider.VkSeparator;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.cn70;
import xsna.dhr0;
import xsna.f4m;

/* compiled from: SeparatorVh.kt */
/* loaded from: classes16.dex */
public class SeparatorVh implements CatalogViewHolder {
    public final int b;
    public final a c;
    public final int d;
    public View e;

    /* compiled from: SeparatorVh.kt */
    public static final class a {
        public final Integer a;

        public a(Integer num) {
            this.a = num;
        }
    }

    /* compiled from: SeparatorVh.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.SYNTHETIC_SEPARATOR_TRANSPARENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LayoutSize.values().length];
            try {
                iArr2[LayoutSize.EXTRA_SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[LayoutSize.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[LayoutSize.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[LayoutSize.LARGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[LayoutSize.EXTRA_LARGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public SeparatorVh(int i, a aVar, int i2, int i3) {
        i = (i3 & 1) != 0 ? R.layout.catalog_separator : i;
        aVar = (i3 & 2) != 0 ? null : aVar;
        i2 = (i3 & 4) != 0 ? R.attr.vk_ui_separator_primary_alpha : i2;
        this.b = i;
        this.c = aVar;
        this.d = i2;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockSeparator) {
            if (b.$EnumSwitchMapping$0[uIBlock.d.ordinal()] == 1) {
                LayoutSize layoutSize = ((UIBlockSeparator) uIBlock).y;
                int i = layoutSize != null ? b.$EnumSwitchMapping$1[layoutSize.ordinal()] : -1;
                int i2 = i != 1 ? i != 2 ? i != 3 ? (i == 4 || i != 5) ? 12 : 24 : 8 : 6 : 4;
                View view = this.e;
                f4m.k(cn70.b(i2), view != null ? view : null);
                return;
            }
            UIBlockSeparator uIBlockSeparator = (UIBlockSeparator) uIBlock;
            a aVar = this.c;
            if (aVar != null) {
                int intValue = aVar.a.intValue();
                View view2 = this.e;
                f4m.q(intValue, view2 != null ? view2 : null);
            } else {
                LayoutSize layoutSize2 = uIBlockSeparator.y;
                if ((layoutSize2 != null ? b.$EnumSwitchMapping$1[layoutSize2.ordinal()] : -1) == 2) {
                    View view3 = this.e;
                    bwt0.f0(view3 != null ? view3 : null, 0, cn70.b(4), 0, 0, 5);
                }
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.b, viewGroup, false);
        this.e = inflate;
        if (inflate instanceof VkSeparator) {
            ((VkSeparator) inflate).setBackgroundColor(dhr0.t.c(this.d));
        }
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public void yh(int i, UIBlock uIBlock) {
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
