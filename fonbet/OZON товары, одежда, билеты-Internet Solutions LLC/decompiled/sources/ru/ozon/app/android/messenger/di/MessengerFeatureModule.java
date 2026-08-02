package ru.ozon.app.android.messenger.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.api.a;
import ru.ozon.android.messenger.framework.navigation.action.f;
import ru.ozon.app.android.messenger.initializer.MessengerInitializer;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\fJ+\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000e\u0010\f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/messenger/di/MessengerFeatureModule;", "", "<init>", "()V", "Lru/ozon/app/android/messenger/initializer/MessengerInitializer;", "messengerInitializer", "Lru/ozon/android/messenger/framework/navigation/action/f;", "messengerActionHandler", "", "namespace", "Lru/ozon/android/messenger/api/a;", "provideMessengerFeature", "(Lru/ozon/app/android/messenger/initializer/MessengerInitializer;Lru/ozon/android/messenger/framework/navigation/action/f;Ljava/lang/String;)Lru/ozon/android/messenger/api/a;", "provideAIMessengerFeature", "provideBloggerFeature", "Companion", "messenger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MessengerFeatureModule {
    @NotNull
    public final a provideAIMessengerFeature(@NotNull MessengerInitializer messengerInitializer, @NotNull f messengerActionHandler, @NotNull String namespace) {
        Intrinsics.checkNotNullParameter(messengerInitializer, "messengerInitializer");
        Intrinsics.checkNotNullParameter(messengerActionHandler, "messengerActionHandler");
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        return messengerInitializer.createFeature(namespace, messengerActionHandler, true);
    }

    @NotNull
    public final a provideBloggerFeature(@NotNull MessengerInitializer messengerInitializer, @NotNull f messengerActionHandler, @NotNull String namespace) {
        Intrinsics.checkNotNullParameter(messengerInitializer, "messengerInitializer");
        Intrinsics.checkNotNullParameter(messengerActionHandler, "messengerActionHandler");
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        return messengerInitializer.createFeature(namespace, messengerActionHandler, false);
    }

    @NotNull
    public final a provideMessengerFeature(@NotNull MessengerInitializer messengerInitializer, @NotNull f messengerActionHandler, @NotNull String namespace) {
        Intrinsics.checkNotNullParameter(messengerInitializer, "messengerInitializer");
        Intrinsics.checkNotNullParameter(messengerActionHandler, "messengerActionHandler");
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        return messengerInitializer.createFeature(namespace, messengerActionHandler, false);
    }
}
