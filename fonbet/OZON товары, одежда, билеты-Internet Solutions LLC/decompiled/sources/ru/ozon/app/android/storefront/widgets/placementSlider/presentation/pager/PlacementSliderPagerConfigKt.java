package ru.ozon.app.android.storefront.widgets.placementSlider.presentation.pager;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001b\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "other", "floorMod", "(II)I", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlacementSliderPagerConfigKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int floorMod(int i11, int i12) {
        return ((i11 % i12) + i12) % i12;
    }
}
