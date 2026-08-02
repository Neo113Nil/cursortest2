package ru.ozon.app.android.session.userSocialsMobile.di;

import Ve.C4598rp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.session.userSocialsMobile.core.UserSocialsMobileConfig;
import ru.ozon.app.android.session.userSocialsMobile.data.item.UserSocialsMobileApi;
import ru.ozon.app.android.session.userSocialsMobile.presentation.header.UserSocialsMobileHeaderViewMapper;
import ru.ozon.app.android.session.userSocialsMobile.presentation.item.UserSocialsMobileItemViewMapper;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/session/userSocialsMobile/di/UserSocialsMobileModule;", "", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface UserSocialsMobileModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/session/userSocialsMobile/di/UserSocialsMobileModule$Companion;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/di/Widget;", "userSocialsMobileConfig", "Lru/ozon/app/android/session/userSocialsMobile/core/UserSocialsMobileConfig;", "userSocialsMobileHeaderViewMapper", "Lru/ozon/app/android/session/userSocialsMobile/presentation/header/UserSocialsMobileHeaderViewMapper;", "userSocialsMobileItemViewMapper", "Lru/ozon/app/android/session/userSocialsMobile/presentation/item/UserSocialsMobileItemViewMapper;", "provideUserSocialsMobileApi", "Lru/ozon/app/android/session/userSocialsMobile/data/item/UserSocialsMobileApi;", "retrofit", "Lretrofit2/Retrofit;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final UserSocialsMobileApi provideUserSocialsMobileApi(@NotNull Retrofit retrofit) {
            return (UserSocialsMobileApi) C4598rp.b(retrofit, "retrofit", UserSocialsMobileApi.class, "create(...)");
        }

        @NotNull
        public final Widget provideWidget(@NotNull UserSocialsMobileConfig userSocialsMobileConfig, @NotNull UserSocialsMobileHeaderViewMapper userSocialsMobileHeaderViewMapper, @NotNull UserSocialsMobileItemViewMapper userSocialsMobileItemViewMapper) {
            Intrinsics.checkNotNullParameter(userSocialsMobileConfig, "userSocialsMobileConfig");
            Intrinsics.checkNotNullParameter(userSocialsMobileHeaderViewMapper, "userSocialsMobileHeaderViewMapper");
            Intrinsics.checkNotNullParameter(userSocialsMobileItemViewMapper, "userSocialsMobileItemViewMapper");
            return new Widget("csma", "userSocialsMobile", userSocialsMobileConfig, new WidgetViewMapper[]{userSocialsMobileHeaderViewMapper, userSocialsMobileItemViewMapper});
        }
    }
}
