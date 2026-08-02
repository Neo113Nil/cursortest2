package ru.ozon.app.android.universalwidgets.widgets.uw.sku.utils;

import Cm.e;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aY\u0010\u000b\u001a\u00020\t*\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u00052\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/constraintlayout/widget/ConstraintLayout;", "", "innerMargin", "style", "", "Landroid/view/View;", "views", "Lkotlin/Function2;", "Landroidx/constraintlayout/widget/d;", "", "extraConstraintsBlock", "createVerticalChain", "(Landroidx/constraintlayout/widget/ConstraintLayout;II[Landroid/view/View;Lkotlin/jvm/functions/Function2;)V", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ConstraintLayoutExtKt {
    public static final void createVerticalChain(@NotNull ConstraintLayout constraintLayout, int i11, int i12, @NotNull View[] views, Function2<? super d, ? super View, Unit> function2) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<this>");
        Intrinsics.checkNotNullParameter(views, "views");
        d b11 = e.b(constraintLayout);
        int length = views.length;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            View view = views[i13];
            int i15 = i14 + 1;
            boolean z11 = i14 == 0;
            Intrinsics.checkNotNullParameter(views, "<this>");
            boolean z12 = i14 == views.length - 1;
            boolean z13 = (z11 || z12) ? false : true;
            if (z11) {
                b11.g0(view.getId(), i12);
                ConstraintLayoutExtensionsKt.topToParent(b11, view);
                if (!z12) {
                    ConstraintLayoutExtensionsKt.bottomToTop(b11, view, views[i15]);
                }
            }
            if (z13) {
                ConstraintLayoutExtensionsKt.topToBottom(b11, view, views[i14 - 1], i11);
                ConstraintLayoutExtensionsKt.bottomToTop(b11, view, views[i15]);
            }
            if (z12) {
                ConstraintLayoutExtensionsKt.bottomToParent(b11, view);
                if (!z11) {
                    ConstraintLayoutExtensionsKt.topToBottom(b11, view, views[i14 - 1], i11);
                }
            }
            if (function2 != null) {
                function2.invoke(b11, view);
            }
            i13++;
            i14 = i15;
        }
        b11.f(constraintLayout);
    }

    public static /* synthetic */ void createVerticalChain$default(ConstraintLayout constraintLayout, int i11, int i12, View[] viewArr, Function2 function2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = 0;
        }
        if ((i13 & 2) != 0) {
            i12 = 2;
        }
        if ((i13 & 8) != 0) {
            function2 = null;
        }
        createVerticalChain(constraintLayout, i11, i12, viewArr, function2);
    }
}
