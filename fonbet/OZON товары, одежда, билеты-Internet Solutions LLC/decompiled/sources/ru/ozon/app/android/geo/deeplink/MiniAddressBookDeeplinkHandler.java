package ru.ozon.app.android.geo.deeplink;

import GZ.j;
import IZ.a;
import J.d;
import Kk.C3531a;
import Kk.c;
import android.content.Context;
import i10.h;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutgeo.checkout.configurators.ConfirmDeleteResultConfigurator;
import ru.ozon.app.android.composer.navigations.destinations.BottomSheetComposerFragmentDestination;
import ru.ozon.app.android.composer.universalscreen.view.BackgroundColorAttr;
import ru.ozon.app.android.composer.universalscreen.view.ComposerFragment;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.component.sheet.SheetSoftInputMode;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/geo/deeplink/MiniAddressBookDeeplinkHandler;", "LIZ/a;", "<init>", "()V", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canHandle", "(LGZ/j;)Z", "Landroid/content/Context;", "context", "Lru/ozon/app/android/composer/navigations/destinations/BottomSheetComposerFragmentDestination;", "getDestination", "(Landroid/content/Context;LGZ/j;)Lru/ozon/app/android/composer/navigations/destinations/BottomSheetComposerFragmentDestination;", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MiniAddressBookDeeplinkHandler implements a {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/geo/deeplink/MiniAddressBookDeeplinkHandler$Companion;", "", "<init>", "()V", "MINI_ADDRESS_BOOK", "", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // IZ.a
    public boolean canHandle(@NotNull j route) {
        return d.d(route, "route", "modal") && C3531a.c(route, "getPathSegments(...)", "miniaddressbook");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // IZ.a
    @NotNull
    public BottomSheetComposerFragmentDestination getDestination(@NotNull Context context, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(route, "route");
        String c11 = c.c(route, "toString(...)");
        String str = null;
        Object[] objArr = 0 == true ? 1 : 0;
        boolean z11 = false;
        boolean z12 = false;
        SheetSoftInputMode sheetSoftInputMode = null;
        int i11 = 0;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        return new BottomSheetComposerFragmentDestination(c11, new ComposerScreenConfig(new h.c.a(c.c(route, "toString(...)"), str, (String) objArr, 14), null, false, new ComposerScreenConfig.BottomSheetConfig(ComposerFragment.DisplayMode.BOTTOM_SHEET_WRAP, z11, z12, sheetSoftInputMode, i11, z13, z14, z15, z16, false, false, 2046, null), false, false, false, false, null, false, false, false, e0.h(ConfirmDeleteResultConfigurator.class), null, null, BackgroundColorAttr.m672boximpl(BackgroundColorAttr.m673constructorimpl(R$attr.layerFloor1)), false, null, null, null, false, false, null, null, 16740342, null), null, 0 == true ? 1 : 0, null, null, 60, null);
    }
}
