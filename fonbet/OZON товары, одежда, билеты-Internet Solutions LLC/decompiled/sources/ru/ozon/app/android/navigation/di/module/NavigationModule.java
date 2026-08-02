package ru.ozon.app.android.navigation.di.module;

import EZ.h;
import GZ.g;
import GZ.k;
import HZ.a;
import HZ.d;
import HZ.e;
import KZ.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nZ.C8475a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.newrouter.destinations.flashbar.FlashbarDestination;
import ru.ozon.app.android.navigation.newrouter.navigators.ClearToRootTabNavigationHandler;
import ru.ozon.app.android.navigation.newrouter.navigators.NotificationNavigationHandler;
import yZ.InterfaceC10874a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/navigation/di/module/NavigationModule;", "", "Companion", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class NavigationModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\nH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\u000fH\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020%2\u0006\u0010\u0012\u001a\u00020\u000fH\u0007¢\u0006\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/navigation/di/module/NavigationModule$Companion;", "", "<init>", "()V", "LnZ/a$c;", "config", "LGZ/a;", "commonPageProvider", "LyZ/a;", "activityNavigationChecker", "", "LKZ/c;", "deeplinkInterceptors", "LKZ/d;", "destinationInterceptors", "LnZ/a;", "provideNavigationGraph", "(LnZ/a$c;LGZ/a;LyZ/a;[LKZ/c;[LKZ/d;)LnZ/a;", "navigation", "LGZ/k;", "provideRouteFactory", "(LnZ/a;)LGZ/k;", "LEZ/h;", "provideNavigatorHolder", "(LnZ/a;)LEZ/h;", "LGZ/g;", "provideOzonRouter", "(LnZ/a;)LGZ/g;", "LBZ/e;", "provideMiniAppConfigHolder", "(LnZ/a;)LBZ/e;", "LHZ/d;", "provideMiniAppMapper", "(LnZ/a;)LHZ/d;", "LHZ/a;", "bindDeeplinkHandlersCache", "(LnZ/a;)LHZ/a;", "LHZ/e;", "bindDeeplinkPageResolver", "(LnZ/a;)LHZ/e;", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final a bindDeeplinkHandlersCache(@NotNull C8475a navigation) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            return navigation.j();
        }

        @NotNull
        public final e bindDeeplinkPageResolver(@NotNull C8475a navigation) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            return navigation.k();
        }

        @NotNull
        public final BZ.e provideMiniAppConfigHolder(@NotNull C8475a navigation) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            return navigation.l();
        }

        @NotNull
        public final d provideMiniAppMapper(@NotNull C8475a navigation) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            return navigation.m();
        }

        @NotNull
        public final C8475a provideNavigationGraph(@NotNull C8475a.c config, @NotNull GZ.a commonPageProvider, @NotNull InterfaceC10874a activityNavigationChecker, @NotNull c[] deeplinkInterceptors, @NotNull KZ.d[] destinationInterceptors) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(commonPageProvider, "commonPageProvider");
            Intrinsics.checkNotNullParameter(activityNavigationChecker, "activityNavigationChecker");
            Intrinsics.checkNotNullParameter(deeplinkInterceptors, "deeplinkInterceptors");
            Intrinsics.checkNotNullParameter(destinationInterceptors, "destinationInterceptors");
            int i11 = C8475a.f76671s;
            C8475a.C1293a c1293a = new C8475a.C1293a(config);
            c1293a.e(commonPageProvider);
            c1293a.a(activityNavigationChecker);
            for (c cVar : deeplinkInterceptors) {
                c1293a.b(cVar);
            }
            for (KZ.d dVar : destinationInterceptors) {
                c1293a.c(dVar);
            }
            c1293a.d(new NotificationNavigationHandler());
            c1293a.d(new ClearToRootTabNavigationHandler());
            c1293a.d(new FlashbarDestination.NavHandler());
            return C8475a.b.a(c1293a);
        }

        @NotNull
        public final h provideNavigatorHolder(@NotNull C8475a navigation) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            return navigation.o();
        }

        @NotNull
        public final g provideOzonRouter(@NotNull C8475a navigation) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            return navigation.q();
        }

        @NotNull
        public final k provideRouteFactory(@NotNull C8475a navigation) {
            Intrinsics.checkNotNullParameter(navigation, "navigation");
            return navigation.p();
        }

        private Companion() {
        }
    }
}
