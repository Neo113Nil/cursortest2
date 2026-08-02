package ru.ozon.app.android.product.tiles.utils;

import I0.C3173b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toAccesibilityTileID", "", "", "product_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AccessibilityUtilsKt {
    @NotNull
    public static final String toAccesibilityTileID(long j11) {
        return j11 == -1 ? "" : C3173b.b(j11, "tileId=");
    }
}
