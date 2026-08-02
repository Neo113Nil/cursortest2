package ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v3.presentation.util;

import FO.a;
import FO.b;
import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0001\u001a\"\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0001¨\u0006\b"}, d2 = {"showLoader", "", "parent", "Landroid/view/ViewGroup;", "buttonsLayout", "buttonIndex", "", "hideLoader", "common_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EmptyStateV3ShowLoaderHelperKt {
    @SuppressLint({"ClickableViewAccessibility"})
    public static final void hideLoader(@NotNull ViewGroup parent, @NotNull ViewGroup buttonsLayout, String str) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(buttonsLayout, "buttonsLayout");
        int i11 = 0;
        for (View view : ViewGroupExtKt.children(buttonsLayout)) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            View view2 = view;
            if ((view2 instanceof ButtonV3View) && Intrinsics.d(String.valueOf(i11), str)) {
                ((ButtonV3View) view2).hideLoader();
                view2.setOnTouchListener(null);
                parent.setOnTouchListener(null);
            }
            i11 = i12;
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public static final void showLoader(@NotNull ViewGroup parent, @NotNull ViewGroup buttonsLayout, String str) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(buttonsLayout, "buttonsLayout");
        int i11 = 0;
        for (View view : ViewGroupExtKt.children(buttonsLayout)) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            View view2 = view;
            if ((view2 instanceof ButtonV3View) && Intrinsics.d(String.valueOf(i11), str)) {
                parent.setOnTouchListener(new a());
                view2.setOnTouchListener(new b(0));
                ((ButtonV3View) view2).showLoader();
            }
            i11 = i12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showLoader$lambda$2$lambda$0(View view, MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showLoader$lambda$2$lambda$1(View view, MotionEvent motionEvent) {
        return true;
    }
}
