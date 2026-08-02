package ru.ozon.app.android.checkout.prefetch;

import android.content.Context;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import xe.M;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001JI\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/checkout/prefetch/CheckoutPrefetchController;", "", "", ImagesContract.URL, "", "params", "Landroid/content/Context;", "context", "Lxe/M;", "coroutineScope", "currentPage", "", "prefetch", "(Ljava/lang/String;Ljava/util/Map;Landroid/content/Context;Lxe/M;Ljava/lang/String;)V", "removeAllCache", "()V", "checkout-prefetch_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CheckoutPrefetchController {
    void prefetch(@NotNull String url, Map<String, String> params, @NotNull Context context, @NotNull M coroutineScope, String currentPage);

    void removeAllCache();
}
