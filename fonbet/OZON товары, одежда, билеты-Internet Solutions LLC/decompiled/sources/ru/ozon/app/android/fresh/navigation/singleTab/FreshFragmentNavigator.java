package ru.ozon.app.android.fresh.navigation.singleTab;

import EZ.f;
import EZ.g;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.fragment.app.G;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pZ.e;
import ru.ozon.app.android.fresh.navigation.R$id;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.navigation.newrouter.destinations.tabs.switchs.ClearToRootTabDestination;
import tZ.C9786a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u00020\b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/navigation/singleTab/FreshFragmentNavigator;", "LEZ/g;", "Landroidx/fragment/app/m;", "fragment", "", "shouldOpenMainPageInitially", "<init>", "(Landroidx/fragment/app/m;Z)V", "", "attachToHolder", "()V", "LEZ/e;", "response", "", "requestCode", "navigate", "(LEZ/e;I)V", "Z", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshFragmentNavigator extends g {
    private final boolean shouldOpenMainPageInitially;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FreshFragmentNavigator(@NotNull ComponentCallbacksC5392m fragment, boolean z11) {
        super(r0, r1, r2, fragment);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        r requireActivity = fragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
        Integer valueOf = Integer.valueOf(R$id.rootContainer);
        G childFragmentManager = fragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        this.shouldOpenMainPageInitially = z11;
    }

    @Override // EZ.g
    protected void attachToHolder() {
        super.attachToHolder();
        if (this.shouldOpenMainPageInitially) {
            String uri = LinkGenerator.INSTANCE.express().toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            g.navigate$default(this, f.a(new e(uri)), 0, 2, null);
        }
    }

    @Override // EZ.g
    public void navigate(@NotNull EZ.e<?> response, int requestCode) {
        Intrinsics.checkNotNullParameter(response, "response");
        Object b11 = response.b();
        if (b11 instanceof ClearToRootTabDestination) {
            G.k k02 = getFragmentManager().k0(0);
            Intrinsics.checkNotNullExpressionValue(k02, "getBackStackEntryAt(...)");
            if (Intrinsics.d(k02.getName(), LinkGenerator.INSTANCE.express().toString())) {
                getFragmentManager().R0(k02.getId(), 0);
                return;
            } else {
                next(response, requestCode);
                return;
            }
        }
        if (b11 instanceof OZ.e) {
            pZ.f a11 = ((OZ.e) b11).a();
            if (a11 != null) {
                g.redirect$default(this, response.e(a11), 0, 2, null);
                return;
            }
            return;
        }
        if (!(b11 instanceof C9786a)) {
            super.navigate(response, requestCode);
        } else if (getFragmentManager().l0() >= 1) {
            safeTransaction(new FreshFragmentNavigator$navigate$2(this, response, requestCode));
        } else {
            next(response, requestCode);
        }
    }
}
