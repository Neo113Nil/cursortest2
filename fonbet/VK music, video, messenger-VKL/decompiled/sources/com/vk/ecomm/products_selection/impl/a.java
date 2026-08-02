package com.vk.ecomm.products_selection.impl;

import android.content.Context;
import com.vk.ecomm.products_selection.api.model.ProductsSelectionContextContent;
import com.vk.ecomm.products_selection.api.model.ProductsSelectionRefSource;
import com.vk.ecomm.products_selection.impl.ProductsSelectionBottomSheet;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.itd0;
import xsna.ntd0;

/* compiled from: ProductsSelectionRouterImpl.kt */
/* loaded from: classes18.dex */
public final class a implements ntd0 {

    /* compiled from: ProductsSelectionRouterImpl.kt */
    /* renamed from: com.vk.ecomm.products_selection.impl.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1003a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ProductsSelectionRefSource.values().length];
            try {
                iArr[ProductsSelectionRefSource.LivesAttachedItems.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductsSelectionRefSource.ClipsAttachedItems.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ProductsSelectionContextContent.values().length];
            try {
                iArr2[ProductsSelectionContextContent.Live.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ProductsSelectionContextContent.Clip.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // xsna.ntd0
    public final void a(Context context, List list, boolean z, itd0 itd0Var) {
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource;
        CommonMarketStat$TypeMarketContextContent.Type type;
        itd0.a aVar = itd0Var.b;
        int i = C1003a.$EnumSwitchMapping$0[itd0Var.a.ordinal()];
        if (i == 1) {
            commonMarketStat$TypeRefSource = CommonMarketStat$TypeRefSource.LIVES_ATTACHED_ITEMS;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            commonMarketStat$TypeRefSource = CommonMarketStat$TypeRefSource.CLIPS_ATTACHED_ITEMS;
        }
        ProductsSelectionContextContent productsSelectionContextContent = aVar.a;
        if (productsSelectionContextContent != null) {
            int i2 = C1003a.$EnumSwitchMapping$1[productsSelectionContextContent.ordinal()];
            if (i2 == 1) {
                type = CommonMarketStat$TypeMarketContextContent.Type.LIVE;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                type = CommonMarketStat$TypeMarketContextContent.Type.CLIP;
            }
        } else {
            type = null;
        }
        new ProductsSelectionBottomSheet.Builder(context, new ProductsSelectionBottomSheet.Builder.Arguments(list, new ProductsSelectionBottomSheet.Builder.AnalyticParams(commonMarketStat$TypeRefSource, type, Integer.valueOf(aVar.b), Long.valueOf(aVar.c)), z, null)).I0(null);
    }
}
