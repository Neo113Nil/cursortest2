package ru.ozon.uni.android.ds;

import android.content.Context;
import android.util.TypedValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"roundCornersFlag", "", "Landroid/content/Context;", "getRoundCornersFlag", "(Landroid/content/Context;)Z", "underlineLinksFlag", "getUnderlineLinksFlag", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UniGlobalConfigKt {
    public static final boolean getRoundCornersFlag(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R$attr.round_corners_flag, typedValue, true) && typedValue.type == 18 && typedValue.data != 0;
    }

    public static final boolean getUnderlineLinksFlag(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R$attr.underline_links_flag, typedValue, true) && typedValue.type == 18 && typedValue.data != 0;
    }
}
