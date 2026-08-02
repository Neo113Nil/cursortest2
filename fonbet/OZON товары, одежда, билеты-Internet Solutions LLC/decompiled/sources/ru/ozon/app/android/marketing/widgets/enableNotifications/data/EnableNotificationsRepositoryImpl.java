package ru.ozon.app.android.marketing.widgets.enableNotifications.data;

import android.net.Uri;
import io.reactivex.AbstractC7094b;
import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.enableNotifications.api.EnableNotificationsApi;
import ru.ozon.app.android.network.di.NetworkComponentConfig;
import ru.ozon.app.android.network.utils.UriExtKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/marketing/widgets/enableNotifications/data/EnableNotificationsRepositoryImpl;", "Lru/ozon/app/android/marketing/widgets/enableNotifications/data/EnableNotificationsRepository;", "Lru/ozon/app/android/marketing/widgets/enableNotifications/api/EnableNotificationsApi;", "api", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "config", "<init>", "(Lru/ozon/app/android/marketing/widgets/enableNotifications/api/EnableNotificationsApi;Lru/ozon/app/android/network/di/NetworkComponentConfig;)V", "", "link", "getUrl", "(Ljava/lang/String;)Ljava/lang/String;", "", "params", "Lio/reactivex/y;", "", "allowPush", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/y;", "Lio/reactivex/b;", "closeWidget", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/b;", "Lru/ozon/app/android/marketing/widgets/enableNotifications/api/EnableNotificationsApi;", "Lru/ozon/app/android/network/di/NetworkComponentConfig;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EnableNotificationsRepositoryImpl implements EnableNotificationsRepository {

    @NotNull
    private final EnableNotificationsApi api;

    @NotNull
    private final NetworkComponentConfig config;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/marketing/widgets/enableNotifications/data/EnableNotificationsRepositoryImpl$Companion;", "", "<init>", "()V", "COMPOSER_ACTION_API", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public EnableNotificationsRepositoryImpl(@NotNull EnableNotificationsApi api, @NotNull NetworkComponentConfig config) {
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(config, "config");
        this.api = api;
        this.config = config;
    }

    private final String getUrl(String link) {
        Uri.Builder appendEncodedPath = Uri.parse(this.config.getApiUrl()).buildUpon().appendEncodedPath("composer-api.bx/_action/");
        Intrinsics.checkNotNullExpressionValue(appendEncodedPath, "appendEncodedPath(...)");
        String uri = UriExtKt.appendEndPoint(appendEncodedPath, link).build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    @Override // ru.ozon.app.android.marketing.widgets.enableNotifications.data.EnableNotificationsRepository
    @NotNull
    public y<Boolean> allowPush(@NotNull String link, @NotNull Map<String, String> params) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(params, "params");
        return this.api.allowNotifications(getUrl(link), params);
    }

    @Override // ru.ozon.app.android.marketing.widgets.enableNotifications.data.EnableNotificationsRepository
    @NotNull
    public AbstractC7094b closeWidget(@NotNull String link, Map<String, String> params) {
        Intrinsics.checkNotNullParameter(link, "link");
        String url = getUrl(link);
        return params != null ? this.api.closeWidget(url, params) : this.api.closeWidget(url);
    }
}
