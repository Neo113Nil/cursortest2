package ru.ozon.app.android.core.navigation.deeplink;

import GZ.j;
import IZ.a;
import J.d;
import Kk.c;
import android.content.Context;
import i10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.BottomSheetComposerFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.navigation.miniapp.MiniAppExtKt;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import uZ.C9992d;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/core/navigation/deeplink/ModalDeeplinkHandler;", "LIZ/a;", "LHZ/a;", "deeplinkHandlersCache", "<init>", "(LHZ/a;)V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "LHZ/a;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ModalDeeplinkHandler implements a {

    @NotNull
    private final HZ.a deeplinkHandlersCache;

    public ModalDeeplinkHandler(@NotNull HZ.a deeplinkHandlersCache) {
        Intrinsics.checkNotNullParameter(deeplinkHandlersCache, "deeplinkHandlersCache");
        this.deeplinkHandlersCache = deeplinkHandlersCache;
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        if (d.d(route, "route", "modal")) {
            return !this.deeplinkHandlersCache.c(route, this);
        }
        return false;
    }

    @Override // IZ.a
    @NotNull
    public f getDestination(@NotNull Context context, @NotNull j route) {
        Integer w02;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        Object obj = route.e().get("minHeight");
        String str = obj instanceof String ? (String) obj : null;
        Integer valueOf = (str == null || (w02 = h.w0(str)) == null) ? null : Integer.valueOf(ResourceExtKt.toPx(w02.intValue()));
        return new BottomSheetComposerFragmentDestination(c.c(route, "toString(...)"), new ComposerScreenConfig(new h.c.a(c.c(route, "toString(...)"), (String) null, (String) null, 14), null, false, new ComposerScreenConfig.BottomSheetConfig(ComposerFragment.DisplayMode.BOTTOM_SHEET_WRAP, false, false, null, valueOf != null ? valueOf.intValue() : ComposerScreenConfig.BottomSheetConfig.INSTANCE.getMIN_HEIGHT_DEFAULT(), false, false, false, false, false, false, 2030, null), false, false, false, false, null, false, false, false, null, null, null, BackgroundColorAttr.m672boximpl(BackgroundColorAttr.m673constructorimpl(R$attr.layerFloor1)), false, null, null, null, false, false, null, null, 16744438, null), MiniAppExtKt.isExpress(context) ? C9992d.b.c.f100438a : C9992d.b.a.f100436a, null, 9001, null, 40, null);
    }
}
