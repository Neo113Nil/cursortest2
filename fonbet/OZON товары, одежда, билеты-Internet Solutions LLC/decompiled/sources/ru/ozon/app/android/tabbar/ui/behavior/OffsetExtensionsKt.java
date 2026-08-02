package ru.ozon.app.android.tabbar.ui.behavior;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tabbar.ui.behavior.OffsetExtensionsKt;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"safeUpdateBottomMargin", "", "Landroid/view/View;", "offset", "", "tabbar_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OffsetExtensionsKt {
    public static final boolean safeUpdateBottomMargin(@NotNull final View view, final int i11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        if (((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin == i11) {
            return false;
        }
        if (view.isInLayout()) {
            view.post(new Runnable() { // from class: bM.a
                @Override // java.lang.Runnable
                public final void run() {
                    OffsetExtensionsKt.safeUpdateBottomMargin$lambda$1(view, i11);
                }
            });
            return true;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams.bottomMargin = i11;
        view.setLayoutParams(marginLayoutParams);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void safeUpdateBottomMargin$lambda$1(View view, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = i11;
        view.setLayoutParams(marginLayoutParams);
    }
}
