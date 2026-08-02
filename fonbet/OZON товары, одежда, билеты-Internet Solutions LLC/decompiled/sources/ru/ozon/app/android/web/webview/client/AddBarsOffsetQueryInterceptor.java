package ru.ozon.app.android.web.webview.client;

import android.net.Uri;
import android.view.View;
import androidx.core.graphics.d;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.web.webview.ai.CheckAiConversation;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001\bJ\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/web/webview/client/AddBarsOffsetQueryInterceptor;", "", "Landroid/view/View;", "view", "", ImagesContract.URL, "intercept", "(Landroid/view/View;Ljava/lang/String;)Ljava/lang/String;", "Default", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface AddBarsOffsetQueryInterceptor {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/web/webview/client/AddBarsOffsetQueryInterceptor$Default;", "Lru/ozon/app/android/web/webview/client/AddBarsOffsetQueryInterceptor;", "checkAiConversation", "Lru/ozon/app/android/web/webview/ai/CheckAiConversation;", "<init>", "(Lru/ozon/app/android/web/webview/ai/CheckAiConversation;)V", "intercept", "", "view", "Landroid/view/View;", ImagesContract.URL, "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Default implements AddBarsOffsetQueryInterceptor {

        @NotNull
        private final CheckAiConversation checkAiConversation;

        public Default(@NotNull CheckAiConversation checkAiConversation) {
            Intrinsics.checkNotNullParameter(checkAiConversation, "checkAiConversation");
            this.checkAiConversation = checkAiConversation;
        }

        @Override // ru.ozon.app.android.web.webview.client.AddBarsOffsetQueryInterceptor
        @NotNull
        public String intercept(@NotNull View view, @NotNull String url) {
            C5353y0 n11;
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(url, "url");
            if (!this.checkAiConversation.check(url) || (n11 = Y.n(view)) == null) {
                return url;
            }
            d f7 = n11.f(1);
            Intrinsics.checkNotNullExpressionValue(f7, "getInsets(...)");
            d f11 = n11.f(2);
            Intrinsics.checkNotNullExpressionValue(f11, "getInsets(...)");
            String uri = Uri.parse(url).buildUpon().appendQueryParameter("platform", "android").appendQueryParameter("stickyTopOffset", String.valueOf(ResourceExtKt.toDp(f7.f42127b))).appendQueryParameter("stickyBottomOffset", String.valueOf(ResourceExtKt.toDp(f11.f42129d))).build().toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            return uri;
        }
    }

    @NotNull
    String intercept(@NotNull View view, @NotNull String url);
}
