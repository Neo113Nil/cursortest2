package ru.ozon.app.android.marketing.widgets.enableNotifications.data;

import io.reactivex.AbstractC7094b;
import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J1\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H&¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/marketing/widgets/enableNotifications/data/EnableNotificationsRepository;", "", "", "link", "", "params", "Lio/reactivex/y;", "", "allowPush", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/y;", "Lio/reactivex/b;", "closeWidget", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/b;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface EnableNotificationsRepository {
    @NotNull
    y<Boolean> allowPush(@NotNull String link, @NotNull Map<String, String> params);

    @NotNull
    AbstractC7094b closeWidget(@NotNull String link, Map<String, String> params);
}
