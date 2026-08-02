package ru.ozon.app.android.tabbar.ui.helper;

import C.J;
import GZ.j;
import IZ.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import i10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.ComposerFragmentDestination;
import ru.ozon.app.android.composer.navigations.destinations.ComposerTabFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.tabbar.data.BottomNavigationBehavior;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/tabbar/ui/helper/TabbarDeeplinkHandler;", "LIZ/a;", "Landroid/net/Uri;", "deeplink", "", "menuId", "Lru/ozon/app/android/tabbar/data/BottomNavigationBehavior;", "behavior", "<init>", "(Landroid/net/Uri;ILru/ozon/app/android/tabbar/data/BottomNavigationBehavior;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/net/Uri;", "I", "Lru/ozon/app/android/tabbar/data/BottomNavigationBehavior;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"MissingDeeplinkTestAnnotation"})
/* loaded from: classes2.dex */
final class TabbarDeeplinkHandler implements a {

    @NotNull
    private final BottomNavigationBehavior behavior;

    @NotNull
    private final Uri deeplink;
    private final int menuId;

    public TabbarDeeplinkHandler(@NotNull Uri deeplink, int i11, @NotNull BottomNavigationBehavior behavior) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        this.deeplink = deeplink;
        this.menuId = i11;
        this.behavior = behavior;
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return Intrinsics.d(this.deeplink, route.b());
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TabbarDeeplinkHandler)) {
            return false;
        }
        TabbarDeeplinkHandler tabbarDeeplinkHandler = (TabbarDeeplinkHandler) other;
        return Intrinsics.d(this.deeplink, tabbarDeeplinkHandler.deeplink) && this.behavior == tabbarDeeplinkHandler.behavior;
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        if (this.behavior == BottomNavigationBehavior.BEHAVIOR_TYPE_SELECT) {
            return new ComposerTabFragmentDestination(new ComposerScreenConfig(new h.c.a(a11, (String) null, (String) null, 14), null, false, null, false, false, false, false, null, false, false, false, null, null, null, null, false, null, null, null, false, false, null, null, 16777214, null), a11, this.menuId, null, false, true, null, 88, null);
        }
        return new ComposerFragmentDestination(new ComposerScreenConfig(new h.c.a(a11, (String) null, (String) null, 14), null, false, null, false, false, false, false, null, false, false, false, null, null, null, null, false, null, null, null, false, false, null, null, 16777214, null), a11, null, false, false, null, false, false, null, 508, null);
    }

    public int hashCode() {
        int hashCode = this.deeplink.hashCode();
        return this.behavior.hashCode() + (hashCode * 31) + hashCode;
    }
}
