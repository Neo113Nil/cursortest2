package ru.ozon.app.android.checkoutcomposer.common.scrollToWidget;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/scrollToWidget/CheckoutScrollToWidgetKeyRepositoryImpl;", "Lru/ozon/app/android/checkoutcomposer/common/scrollToWidget/CheckoutScrollToWidgetKeyRepository;", "<init>", "()V", "scrollToWidgetKey", "", "putScrollWidgetKey", "", "scrollWidgetName", "popScrollWidgetKey", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CheckoutScrollToWidgetKeyRepositoryImpl implements CheckoutScrollToWidgetKeyRepository {
    private String scrollToWidgetKey;

    @Override // ru.ozon.app.android.checkoutcomposer.common.scrollToWidget.CheckoutScrollToWidgetKeyRepository
    public String popScrollWidgetKey() {
        String str = this.scrollToWidgetKey;
        this.scrollToWidgetKey = null;
        return str;
    }

    @Override // ru.ozon.app.android.checkoutcomposer.common.scrollToWidget.CheckoutScrollToWidgetKeyRepository
    public void putScrollWidgetKey(@NotNull String scrollWidgetName) {
        Intrinsics.checkNotNullParameter(scrollWidgetName, "scrollWidgetName");
        this.scrollToWidgetKey = scrollWidgetName;
    }
}
