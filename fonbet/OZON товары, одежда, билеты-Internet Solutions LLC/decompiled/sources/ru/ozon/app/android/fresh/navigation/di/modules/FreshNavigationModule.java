package ru.ozon.app.android.fresh.navigation.di.modules;

import Ve.C4598rp;
import android.content.Context;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import ru.ozon.app.android.fresh.navigation.profileAvatar.data.repository.AvatarApi;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentApi;
import ru.ozon.app.android.platform.image.ImageResizer;
import ru.ozon.app.android.tabbar.miniapp.fresh.FreshTabBarApi;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/fresh/navigation/di/modules/FreshNavigationModule;", "", "Companion", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class FreshNavigationModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/navigation/di/modules/FreshNavigationModule$Companion;", "", "<init>", "()V", "provideFreshTabBarApi", "Lru/ozon/app/android/tabbar/miniapp/fresh/FreshTabBarApi;", "retrofit", "Lretrofit2/Retrofit;", "provideAvatarApi", "Lru/ozon/app/android/fresh/navigation/profileAvatar/data/repository/AvatarApi;", "provideImageResizer", "Lru/ozon/app/android/platform/image/ImageResizer;", "context", "Landroid/content/Context;", "provideDispatcherProvider", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AvatarApi provideAvatarApi(@NotNull Retrofit retrofit) {
            return (AvatarApi) C4598rp.b(retrofit, "retrofit", AvatarApi.class, "create(...)");
        }

        @NotNull
        public final CoroutineDispatcherProvider provideDispatcherProvider(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (CoroutineDispatchersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
                throw new IllegalStateException("Requested component CoroutineDispatchersComponentApi is not DiComponent");
            }
            C6740b dependencyStorage = C6739a.a(context, CoroutineDispatchersComponentApi.class).getDependencyStorage();
            if (CoroutineDispatchersComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
                throw new IllegalStateException("Requested component CoroutineDispatchersComponentApi is not DiComponent");
            }
            return ((CoroutineDispatchersComponentApi) dependencyStorage.b(CoroutineDispatchersComponentApi.class)).getDispatcherProvider();
        }

        @NotNull
        public final FreshTabBarApi provideFreshTabBarApi(@NotNull Retrofit retrofit) {
            return (FreshTabBarApi) C4598rp.b(retrofit, "retrofit", FreshTabBarApi.class, "create(...)");
        }

        @NotNull
        public final ImageResizer provideImageResizer(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (AndroidPlatformComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
                throw new IllegalStateException("Requested component AndroidPlatformComponentApi is not DiComponent");
            }
            C6740b dependencyStorage = C6739a.a(context, AndroidPlatformComponentApi.class).getDependencyStorage();
            if (AndroidPlatformComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
                throw new IllegalStateException("Requested component AndroidPlatformComponentApi is not DiComponent");
            }
            return ((AndroidPlatformComponentApi) dependencyStorage.b(AndroidPlatformComponentApi.class)).getImageResizer();
        }

        private Companion() {
        }
    }
}
