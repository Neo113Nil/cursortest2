package ru.ozon.app.android.messenger.di;

import IZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.messenger.deeplink.ChatsByOrdersDeeplinkHandler;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/messenger/di/MessengerNavigationModule;", "", "<init>", "()V", "Lru/ozon/app/android/utils/AppType;", "appType", "", "LIZ/a;", "provideDeeplinkHandler", "(Lru/ozon/app/android/utils/AppType;)Ljava/util/Set;", "messenger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MessengerNavigationModule {

    @NotNull
    public static final MessengerNavigationModule INSTANCE = new MessengerNavigationModule();

    private MessengerNavigationModule() {
    }

    @NotNull
    public final Set<a> provideDeeplinkHandler(@NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        return e0.h(new ChatsByOrdersDeeplinkHandler(appType == AppType.SELECT));
    }
}
