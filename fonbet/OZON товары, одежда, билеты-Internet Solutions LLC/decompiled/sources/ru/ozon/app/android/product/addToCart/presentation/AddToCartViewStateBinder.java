package ru.ozon.app.android.product.addToCart.presentation;

import WZ.l;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/product/addToCart/presentation/AddToCartViewStateBinder;", "", "LWZ/l;", "tokenizedAnalytics", "", "init", "(LWZ/l;)V", "subscribe", "()V", TokenizedTrackingInfo.ACTION_UNSUBSCRIBE, "product_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface AddToCartViewStateBinder {
    void init(@NotNull l tokenizedAnalytics);

    void subscribe();

    void unsubscribe();
}
