package ru.ozon.app.android.common.productselectormobile;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.UriExtKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/common/productselectormobile/PresentationUtils;", "", "<init>", "()V", "shouldRefreshPage", "", "currentUrl", "", "newUrl", "product-selector-mobile_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PresentationUtils {

    @NotNull
    public static final PresentationUtils INSTANCE = new PresentationUtils();

    private PresentationUtils() {
    }

    public final boolean shouldRefreshPage(String currentUrl, String newUrl) {
        Uri parse = currentUrl != null ? Uri.parse(UriExtKt.removeSchema(currentUrl)) : null;
        Uri parse2 = newUrl != null ? Uri.parse(UriExtKt.removeSchema(newUrl)) : null;
        if (Intrinsics.d(parse != null ? parse.getAuthority() : null, parse2 != null ? parse2.getAuthority() : null)) {
            return Intrinsics.d(parse != null ? parse.getPath() : null, parse2 != null ? parse2.getPath() : null);
        }
        return false;
    }
}
