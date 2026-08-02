package ru.ozon.app.android.messenger.initializer.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.navigation.action.f;
import ru.ozon.app.android.messenger.initializer.MessengerActionHandlerImpl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/messenger/initializer/di/MessengerInitializerModule;", "", "Companion", "messenger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface MessengerInitializerModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\nJ!\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lru/ozon/app/android/messenger/initializer/di/MessengerInitializerModule$Companion;", "", "<init>", "()V", "Lru/ozon/app/android/messenger/initializer/MessengerActionHandlerImpl$Factory;", "factory", "", "namespace", "Lru/ozon/android/messenger/framework/navigation/action/f;", "provideMessengerActionHandlerImpl", "(Lru/ozon/app/android/messenger/initializer/MessengerActionHandlerImpl$Factory;Ljava/lang/String;)Lru/ozon/android/messenger/framework/navigation/action/f;", "provideAiMessengerActionHandlerImpl", "provideBloggerMessengerActionHandlerImpl", "messenger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final f provideAiMessengerActionHandlerImpl(@NotNull MessengerActionHandlerImpl.Factory factory, @NotNull String namespace) {
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(namespace, "namespace");
            return factory.create(namespace);
        }

        @NotNull
        public final f provideBloggerMessengerActionHandlerImpl(@NotNull MessengerActionHandlerImpl.Factory factory, @NotNull String namespace) {
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(namespace, "namespace");
            return factory.create(namespace);
        }

        @NotNull
        public final f provideMessengerActionHandlerImpl(@NotNull MessengerActionHandlerImpl.Factory factory, @NotNull String namespace) {
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(namespace, "namespace");
            return factory.create(namespace);
        }
    }
}
