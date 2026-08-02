package ru.ozon.app.android.storefront.widgets.rateApp.presentation.compose;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/storefront/widgets/rateApp/presentation/compose/RateAppComposeProperties;", "", "<init>", "()V", "isDismissed", "", "()Z", "setDismissed", "(Z)V", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RateAppComposeProperties {
    private static boolean isDismissed;

    @NotNull
    public static final RateAppComposeProperties INSTANCE = new RateAppComposeProperties();
    public static final int $stable = 8;

    private RateAppComposeProperties() {
    }

    public final boolean isDismissed() {
        return isDismissed;
    }

    public final void setDismissed(boolean z11) {
        isDismissed = z11;
    }
}
