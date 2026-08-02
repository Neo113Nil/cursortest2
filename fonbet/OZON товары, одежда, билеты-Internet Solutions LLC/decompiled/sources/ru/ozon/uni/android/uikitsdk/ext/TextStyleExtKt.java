package ru.ozon.uni.android.uikitsdk.ext;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"textAttrs", "", "isTextStyleAllCaps", "", "Landroid/content/Context;", "style", "", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TextStyleExtKt {

    @NotNull
    private static final int[] textAttrs = {R.attr.textAllCaps};

    public static final boolean isTextStyleAllCaps(@NotNull Context context, int i11) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        int[] iArr = textAttrs;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i11, iArr);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        boolean z11 = obtainStyledAttributes.getBoolean(C7705l.L(iArr, R.attr.textAllCaps), false);
        obtainStyledAttributes.recycle();
        return z11;
    }
}
