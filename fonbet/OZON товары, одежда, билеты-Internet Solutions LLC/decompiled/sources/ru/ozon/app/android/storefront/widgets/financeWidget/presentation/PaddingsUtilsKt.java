package ru.ozon.app.android.storefront.widgets.financeWidget.presentation;

import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"dp8", "", "dp4", "getPaddings", "Landroid/graphics/Rect;", "spanPosition", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PaddingsUtilsKt {
    private static final int dp8 = UiExtKt.toPx(8);
    private static final int dp4 = UiExtKt.toPx(4);

    @NotNull
    public static final Rect getPaddings(int i11) {
        Pair pair = i11 != 0 ? i11 != 1 ? new Pair(0, 0) : new Pair(Integer.valueOf(dp4), Integer.valueOf(dp8)) : new Pair(Integer.valueOf(dp8), Integer.valueOf(dp4));
        return new Rect(((Number) pair.a()).intValue(), 0, ((Number) pair.b()).intValue(), 0);
    }
}
