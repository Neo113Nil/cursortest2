package ru.ozon.app.android.account.orders.recipientWidget.deeplink;

import B0.C2454a;
import GZ.j;
import IZ.a;
import Kk.c;
import android.content.Context;
import android.net.Uri;
import i10.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import pZ.f;
import ru.ozon.app.android.composer.navigations.destinations.BottomSheetComposerFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.uni.android.component.sheet.SheetSoftInputMode;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/account/orders/recipientWidget/deeplink/ChangeOrderRecipientModalDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "LpZ/f;", "getDestination", "(Landroid/content/Context;LGZ/j;)LpZ/f;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChangeOrderRecipientModalDeeplinkHandler implements a {
    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        Uri b11 = route.b();
        return Intrinsics.d(b11.getAuthority(), "modal") && b11.getPathSegments().size() > 0 && C2454a.h(b11, "changeOrderRecipient", 0);
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
        return new BottomSheetComposerFragmentDestination(c.c(route, "toString(...)"), new ComposerScreenConfig(new h.c.a(c.c(route, "toString(...)"), (String) null, (String) null, 14), null, false, new ComposerScreenConfig.BottomSheetConfig(ComposerFragment.DisplayMode.BOTTOM_SHEET_WRAP, false, false, SheetSoftInputMode.ADJUST_RESIZE, valueOf != null ? valueOf.intValue() : ComposerScreenConfig.BottomSheetConfig.INSTANCE.getMIN_HEIGHT_DEFAULT(), false, false, false, false, false, false, 2022, null), false, false, false, false, null, false, false, false, null, null, null, null, false, null, null, null, false, false, null, null, 16777206, null), null, null, 9001, null, 44, null);
    }
}
