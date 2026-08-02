package ru.ozon.app.android.marketing.widgets.wannaDiscountV2.data;

import android.net.Uri;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.data.api.WannaDiscountV2Api;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.data.api.WannaDiscountV2Request;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.data.api.WannaDiscountV2Response;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2Repository;", "", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/api/WannaDiscountV2Api;", "api", "<init>", "(Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/api/WannaDiscountV2Api;)V", "", "action", "appendUri", "(Ljava/lang/String;)Ljava/lang/String;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/api/WannaDiscountV2Request;", "request", "Lio/reactivex/y;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/api/WannaDiscountV2Response;", "sendDiscountV2", "(Ljava/lang/String;Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/api/WannaDiscountV2Request;)Lio/reactivex/y;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/api/WannaDiscountV2Api;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WannaDiscountV2Repository {

    @NotNull
    private final WannaDiscountV2Api api;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/data/WannaDiscountV2Repository$Companion;", "", "<init>", "()V", "COMPOSER_ACTION_API_BASE_URL", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public WannaDiscountV2Repository(@NotNull WannaDiscountV2Api api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    private final String appendUri(String action) {
        String uri = Uri.parse("composer-api.bx/_action/").buildUpon().appendEncodedPath(action).build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    @NotNull
    public final y<WannaDiscountV2Response> sendDiscountV2(@NotNull String action, @NotNull WannaDiscountV2Request request) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(request, "request");
        return this.api.sendDiscountV2(appendUri(action), request);
    }
}
