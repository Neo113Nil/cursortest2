package ru.ozon.app.android.composer.network.util;

import android.net.Uri;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.network.cache.util.PageUrl;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0015\u0010\u0001\u001a\u0004\u0018\u00010\u0004*\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0002¨\u0006\u0006"}, d2 = {"", "pageUrl", "(Ljava/lang/String;)Ljava/lang/String;", "Lru/ozon/app/android/composer/network/cache/util/Url;", "Lru/ozon/app/android/composer/network/cache/util/PageUrl;", "pageUrl-VgcI5v0", "composer_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StringsKt {
    public static final String pageUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return Uri.parse(str).getQueryParameter(ImagesContract.URL);
    }

    /* renamed from: pageUrl-VgcI5v0, reason: not valid java name */
    public static final String m671pageUrlVgcI5v0(@NotNull String pageUrl) {
        Intrinsics.checkNotNullParameter(pageUrl, "$this$pageUrl");
        String pageUrl2 = pageUrl(pageUrl);
        if (pageUrl2 != null) {
            return PageUrl.m657constructorimpl(pageUrl2);
        }
        return null;
    }
}
