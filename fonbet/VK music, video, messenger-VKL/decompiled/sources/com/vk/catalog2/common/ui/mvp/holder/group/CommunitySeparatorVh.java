package com.vk.catalog2.common.ui.mvp.holder.group;

import android.view.View;
import com.vk.catalog2.common.dto.api.layout.LayoutSize;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockSeparator;
import com.vk.catalog2.common.ui.holders.SeparatorVh;
import xsna.bwt0;
import xsna.cn70;

/* compiled from: CommunitySeparatorVh.kt */
/* loaded from: classes16.dex */
public final class CommunitySeparatorVh extends SeparatorVh {

    /* compiled from: CommunitySeparatorVh.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutSize.values().length];
            try {
                iArr[LayoutSize.EXTRA_SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutSize.NO_INSETS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CommunitySeparatorVh() {
        super(0, null, 0, 7);
    }

    @Override // com.vk.catalog2.common.ui.holders.SeparatorVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockSeparator) {
            LayoutSize layoutSize = ((UIBlockSeparator) uIBlock).y;
            int i = layoutSize == null ? -1 : a.$EnumSwitchMapping$0[layoutSize.ordinal()];
            if (i == 1) {
                View view = this.e;
                bwt0.f0(view != null ? view : null, 0, cn70.b(4), 0, 0, 5);
            } else if (i != 2) {
                View view2 = this.e;
                bwt0.f0(view2 != null ? view2 : null, 0, cn70.b(8), 0, 0, 5);
            } else {
                View view3 = this.e;
                bwt0.f0(view3 != null ? view3 : null, 0, 0, 0, 0, 5);
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.SeparatorVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockSeparator) {
            N6(uIBlock);
            if (i == 0) {
                LayoutSize layoutSize = ((UIBlockSeparator) uIBlock).y;
                if (layoutSize == LayoutSize.SMALL) {
                    View view = this.e;
                    bwt0.f0(view != null ? view : null, 0, 0, 0, cn70.b(8), 5);
                } else if (layoutSize == LayoutSize.EXTRA_SMALL) {
                    View view2 = this.e;
                    bwt0.f0(view2 != null ? view2 : null, 0, cn70.b(4), 0, cn70.b(0), 5);
                }
            }
        }
    }
}
