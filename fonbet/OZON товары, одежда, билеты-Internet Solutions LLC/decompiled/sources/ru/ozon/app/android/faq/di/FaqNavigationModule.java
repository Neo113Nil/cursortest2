package ru.ozon.app.android.faq.di;

import IZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.faq.deeplink.FaqDeeplinkHandler;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/faq/di/FaqNavigationModule;", "", "<init>", "()V", "", "LIZ/a;", "provideDeeplinkHandlersSet$faq_prodGoogleAllVendorsRelease", "()Ljava/util/Set;", "provideDeeplinkHandlersSet", "faq_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FaqNavigationModule {

    @NotNull
    public static final FaqNavigationModule INSTANCE = new FaqNavigationModule();

    private FaqNavigationModule() {
    }

    @NotNull
    public final Set<a> provideDeeplinkHandlersSet$faq_prodGoogleAllVendorsRelease() {
        return e0.b(new FaqDeeplinkHandler());
    }
}
