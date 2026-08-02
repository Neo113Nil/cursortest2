package ru.ozon.app.android.messenger.deeplink;

import B0.C2454a;
import C.J;
import GZ.j;
import IZ.a;
import android.content.Context;
import android.net.Uri;
import i10.h;
import i10.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.BottomSheetComposerFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.uni.R$color;
import uZ.C9992d;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/messenger/deeplink/ChatsByOrdersDeeplinkHandler;", "LIZ/a;", "", "isSelectApp", "<init>", "(Z)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "Z", "messenger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatsByOrdersDeeplinkHandler implements a {
    private final boolean isSelectApp;

    public ChatsByOrdersDeeplinkHandler(boolean z11) {
        this.isSelectApp = z11;
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        return Intrinsics.d(b11.getAuthority(), "modal") && b11.getPathSegments().size() > 0 && (C2454a.h(b11, "chatListByOrders", 0) || C2454a.h(b11, "startChatByOrder", 0));
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        String a11 = J.a(context, "context", route, "route", "toString(...)");
        boolean e11 = Co.a.e(route, 0, "startChatByOrder");
        String str = null;
        return new BottomSheetComposerFragmentDestination(a11, new ComposerScreenConfig(new h.c.a(a11, str, str, 14), null, false, new ComposerScreenConfig.BottomSheetConfig(e11 ? ComposerFragment.DisplayMode.BOTTOM_SHEET_WRAP : ComposerFragment.DisplayMode.BOTTOM_SHEET_FULL, false, false, null, 0, false, false, false, false, false, false, 2046, null), false, false, false, false, null, false, false, false, null, null, Integer.valueOf(this.isSelectApp ? R$color.layer_floor_1 : R$color.layer_floor_0), null, false, new ComposerScreenConfig.AppearanceConfig(new l.a.C1079a(100L, null, 2)), null, null, true, false, null, null, 15581174, null), C9992d.b.c.f100438a, null, null, null, 56, null);
    }
}
