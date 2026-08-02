package ru.ozon.app.android.network.cookie;

import We.A;
import We.C4873o;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ+\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/network/cookie/CookieListener;", "", "LWe/A;", ImagesContract.URL, "", "LWe/o;", "cookies", "", "saveFromResponse", "(LWe/A;Ljava/util/List;)V", "fromRequest", "(Ljava/util/List;LWe/A;)Ljava/util/List;", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CookieListener {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static List<C4873o> fromRequest(@NotNull CookieListener cookieListener, @NotNull List<C4873o> cookies, @NotNull A url) {
            Intrinsics.checkNotNullParameter(cookies, "cookies");
            Intrinsics.checkNotNullParameter(url, "url");
            return cookies;
        }

        public static void saveFromResponse(@NotNull CookieListener cookieListener, @NotNull A url, @NotNull List<C4873o> cookies) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(cookies, "cookies");
        }
    }

    @NotNull
    List<C4873o> fromRequest(@NotNull List<C4873o> cookies, @NotNull A url);

    void saveFromResponse(@NotNull A url, @NotNull List<C4873o> cookies);
}
