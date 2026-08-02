package ru.ozon.app.android.uikit.view.shimmer;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a:\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\nH\u0000¨\u0006\f"}, d2 = {"obtain", "", "Landroid/util/AttributeSet;", "context", "Landroid/content/Context;", "styleableArray", "", "defStyleAttr", "", "block", "Lkotlin/Function1;", "Landroid/content/res/TypedArray;", "ui-kit_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AttrsExtensionKt {
    public static final void obtain(@NotNull AttributeSet attributeSet, @NotNull Context context, @NotNull int[] styleableArray, int i11, @NotNull Function1<? super TypedArray, Unit> block) {
        Intrinsics.checkNotNullParameter(attributeSet, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(styleableArray, "styleableArray");
        Intrinsics.checkNotNullParameter(block, "block");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, styleableArray, i11, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        block.invoke(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }
}
