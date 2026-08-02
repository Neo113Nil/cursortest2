package ru.ozon.app.android.universalwidgets.widgets.uw.utils;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroid/view/View;", "Landroid/view/ViewGroup;", "findParentComposerView", "(Landroid/view/View;)Landroid/view/ViewGroup;", "", "increaseSize", "Landroid/view/TouchDelegate;", "getIncreasedTouchDelegate", "(Landroid/view/View;I)Landroid/view/TouchDelegate;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ViewExtensionsKt {
    public static final ViewGroup findParentComposerView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return ViewExtKt.findParent(view, ViewExtensionsKt$findParentComposerView$1.INSTANCE);
    }

    @NotNull
    public static final TouchDelegate getIncreasedTouchDelegate(@NotNull View view, int i11) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return new TouchDelegate(new Rect(view.getLeft() - i11, view.getTop() - i11, view.getRight() + i11, view.getBottom() + i11), view);
    }
}
