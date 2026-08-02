package ru.ozon.app.android.pdp.widgets.cartButtonQuant;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/QuantExpressSheetVisibilityStorage;", "", "<init>", "()V", "isShown", "", "isExpressSheetNotShown", "expressSheetShowed", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class QuantExpressSheetVisibilityStorage {
    private static boolean isShown;

    @NotNull
    public static final QuantExpressSheetVisibilityStorage INSTANCE = new QuantExpressSheetVisibilityStorage();
    public static final int $stable = 8;

    private QuantExpressSheetVisibilityStorage() {
    }

    public final void expressSheetShowed() {
        isShown = true;
    }

    public final boolean isExpressSheetNotShown() {
        return !isShown;
    }
}
