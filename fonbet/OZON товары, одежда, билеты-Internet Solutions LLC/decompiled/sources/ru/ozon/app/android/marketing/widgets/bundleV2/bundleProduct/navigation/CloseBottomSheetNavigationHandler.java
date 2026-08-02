package ru.ozon.app.android.marketing.widgets.bundleV2.bundleProduct.navigation;

import EZ.e;
import EZ.g;
import androidx.fragment.app.ComponentCallbacksC5392m;
import com.google.android.material.bottomsheet.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sZ.AbstractC9644b;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/marketing/widgets/bundleV2/bundleProduct/navigation/CloseBottomSheetNavigationHandler;", "LsZ/b;", "", "<init>", "()V", "LEZ/g;", "navigator", "", "closeAllBottomSheets", "(LEZ/g;)V", "LEZ/e;", "response", "", "requestCode", "navigateFragment", "(LEZ/g;LEZ/e;I)V", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CloseBottomSheetNavigationHandler extends AbstractC9644b<Object> {
    private final void closeAllBottomSheets(g navigator) {
        List<ComponentCallbacksC5392m> r02 = navigator.getFragmentManager().r0();
        Intrinsics.checkNotNullExpressionValue(r02, "getFragments(...)");
        Object Z11 = C7714v.Z(r02);
        while (true) {
            ComponentCallbacksC5392m componentCallbacksC5392m = (ComponentCallbacksC5392m) Z11;
            if (!(componentCallbacksC5392m instanceof b)) {
                return;
            }
            ((b) componentCallbacksC5392m).dismiss();
            navigator.getFragmentManager().c0();
            List<ComponentCallbacksC5392m> r03 = navigator.getFragmentManager().r0();
            Intrinsics.checkNotNullExpressionValue(r03, "getFragments(...)");
            Z11 = C7714v.Z(r03);
        }
    }

    @Override // sZ.AbstractC9644b
    public void navigateFragment(@NotNull g navigator, @NotNull e<Object> response, int requestCode) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(response, "response");
        closeAllBottomSheets(navigator);
    }
}
