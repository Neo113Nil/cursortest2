package ru.ozon.app.android.regulardraw.miniapp.di;

import BZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.deeplinkhandlers.DailyRewardsDeeplinkHandler;
import ru.ozon.app.android.regulardraw.deeplinkhandlers.MorkovskModalMenuDeeplinkHandler;
import ru.ozon.app.android.regulardraw.deeplinkhandlers.PrizesDeeplinkHandler;
import ru.ozon.app.android.regulardraw.miniapp.RegularDrawAppHandler;
import ru.ozon.app.android.regulardraw.miniapp.deeplinkhandler.MorkovskHomeDeeplinkHandler;
import ru.ozon.app.android.regulardraw.miniapp.deeplinkhandler.MorkovskWelcomeScreenDeeplinkHandler;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/regulardraw/miniapp/di/RegularDrawNavigationModule;", "", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class RegularDrawNavigationModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\u00020\tH\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/regulardraw/miniapp/di/RegularDrawNavigationModule$Companion;", "", "<init>", "()V", "", "LIZ/a;", "provideDeeplinkHandlersSet$regulardraw_prodGoogleAllVendorsRelease", "()Ljava/util/Set;", "provideDeeplinkHandlersSet", "LBZ/a;", "bindRegularDrawAppHandler$regulardraw_prodGoogleAllVendorsRelease", "()LBZ/a;", "bindRegularDrawAppHandler", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final a bindRegularDrawAppHandler$regulardraw_prodGoogleAllVendorsRelease() {
            return new RegularDrawAppHandler();
        }

        @NotNull
        public final Set<IZ.a> provideDeeplinkHandlersSet$regulardraw_prodGoogleAllVendorsRelease() {
            return e0.b(new MorkovskHomeDeeplinkHandler(), new MorkovskModalMenuDeeplinkHandler(), new DailyRewardsDeeplinkHandler(), new PrizesDeeplinkHandler(), new MorkovskWelcomeScreenDeeplinkHandler());
        }

        private Companion() {
        }
    }
}
