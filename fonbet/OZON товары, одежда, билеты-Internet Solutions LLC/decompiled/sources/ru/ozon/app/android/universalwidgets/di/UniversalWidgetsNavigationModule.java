package ru.ozon.app.android.universalwidgets.di;

import IZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.universalwidgets.deeplink.SetDeeplinkHandler;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/universalwidgets/di/UniversalWidgetsNavigationModule;", "", "<init>", "()V", "", "LIZ/a;", "provideDeeplinkHandlersSet", "()Ljava/util/Set;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UniversalWidgetsNavigationModule {

    @NotNull
    public static final UniversalWidgetsNavigationModule INSTANCE = new UniversalWidgetsNavigationModule();

    private UniversalWidgetsNavigationModule() {
    }

    @NotNull
    public static final Set<a> provideDeeplinkHandlersSet() {
        return e0.b(new SetDeeplinkHandler());
    }
}
