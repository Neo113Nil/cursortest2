package ru.ozon.app.android.monetization.di;

import IZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.monetization.deeplink.AchievementInfoDeeplinkHandler;
import ru.ozon.app.android.monetization.deeplink.AchievementsListDeeplinkHandler;
import ru.ozon.app.android.monetization.deeplink.AddNewChannelBottomSheetDeeplinkHandler;
import ru.ozon.app.android.monetization.deeplink.BloggerChannelsPageDeeplinkHandler;
import ru.ozon.app.android.monetization.deeplink.BloggerMainPageDeeplinkHandler;
import ru.ozon.app.android.monetization.deeplink.BloggerPersonalDataFormDeeplinkHandler;
import ru.ozon.app.android.monetization.deeplink.BloggerPostCreateEditDeeplinkHandler;
import ru.ozon.app.android.monetization.deeplink.BloggerPostFormChannelsListDeeplinkHandler;
import ru.ozon.app.android.monetization.deeplink.BloggerPostFormItemListDeeplinkHandler;
import ru.ozon.app.android.monetization.deeplink.BloggerPostViewDeeplinkHandler;
import ru.ozon.app.android.monetization.deeplink.BloggerPostsListDeeplinkHandler;
import ru.ozon.app.android.monetization.deeplink.BloggerPublishedPostModalDeeplinkHandler;
import ru.ozon.app.android.monetization.deeplink.MatchShoppingCardsDeeplinkHandler;
import ru.ozon.app.android.storage.teensMode.TeensModeStorage;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/monetization/di/MonetizationNavigationModule;", "", "<init>", "()V", "Lru/ozon/app/android/storage/teensMode/TeensModeStorage;", "teenStorage", "", "LIZ/a;", "provideDeeplinkHandlersSet", "(Lru/ozon/app/android/storage/teensMode/TeensModeStorage;)Ljava/util/Set;", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MonetizationNavigationModule {

    @NotNull
    public static final MonetizationNavigationModule INSTANCE = new MonetizationNavigationModule();

    private MonetizationNavigationModule() {
    }

    @NotNull
    public final Set<a> provideDeeplinkHandlersSet(@NotNull TeensModeStorage teenStorage) {
        Intrinsics.checkNotNullParameter(teenStorage, "teenStorage");
        return e0.b(new AddNewChannelBottomSheetDeeplinkHandler(), new BloggerMainPageDeeplinkHandler(), new BloggerPersonalDataFormDeeplinkHandler(), new BloggerPostCreateEditDeeplinkHandler(), new BloggerPostFormChannelsListDeeplinkHandler(), new BloggerPostFormItemListDeeplinkHandler(), new BloggerPostViewDeeplinkHandler(), new BloggerPostsListDeeplinkHandler(), new BloggerPublishedPostModalDeeplinkHandler(), new BloggerChannelsPageDeeplinkHandler(), new AchievementsListDeeplinkHandler(), new AchievementInfoDeeplinkHandler(), new MatchShoppingCardsDeeplinkHandler(teenStorage));
    }
}
