package ru.ozon.app.android.travel.feature.general.common.tab.presentation;

import EZ.e;
import GZ.j;
import NZ.a;
import NZ.g;
import NZ.h;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.f;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00132\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/tab/presentation/TravelMiniAppTabNavigator;", "LNZ/a;", "", "containerId", "LNZ/h;", "config", "Landroidx/fragment/app/m;", "fragment", "Landroidx/fragment/app/G;", "fragmentManager", "<init>", "(ILNZ/h;Landroidx/fragment/app/m;Landroidx/fragment/app/G;)V", "tabId", "", "shouldSwitchTab", "(I)Z", "LEZ/e;", "response", "requestCode", "", "navigate", "(LEZ/e;I)V", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TravelMiniAppTabNavigator extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TravelMiniAppTabNavigator(int i11, @NotNull h config, @NotNull ComponentCallbacksC5392m fragment, @NotNull G fragmentManager) {
        super(fragment, fragmentManager, i11, config, null, 16, null);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
    }

    private final boolean shouldSwitchTab(int tabId) {
        g activeTabOrNull = activeTabOrNull();
        boolean z11 = false;
        if (activeTabOrNull != null && tabId == activeTabOrNull.getHostId()) {
            z11 = true;
        }
        return !z11;
    }

    @Override // NZ.a, EZ.g
    public void navigate(@NotNull e<?> response, int requestCode) {
        Intrinsics.checkNotNullParameter(response, "response");
        j c11 = response.c();
        Object b11 = response.b();
        if (!(b11 instanceof OZ.e) || c11 == null) {
            super.navigate(response, requestCode);
            return;
        }
        String uri = c11.b().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        Integer num = getPathConfig().get(PZ.a.b(uri, true));
        int intValue = num != null ? num.intValue() : ((OZ.e) b11).b();
        if (shouldSwitchTab(intValue)) {
            super.navigate(response.e(OZ.e.c((OZ.e) b11, intValue)), requestCode);
            return;
        }
        OZ.e eVar = (OZ.e) b11;
        if (eVar.a() != null) {
            f a11 = eVar.a();
            Intrinsics.g(a11, "null cannot be cast to non-null type ru.ozon.compass.destination.Destination");
            redirect(response.e(a11), requestCode);
        }
    }
}
