package ru.ozon.android.composerCommonViewKit.compose.util;

import android.content.Context;
import android.util.TypedValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.R$attr;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"isSelect", "", "Landroid/content/Context;", "common-view-kit_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ResourcesExtKt {
    public static final boolean isSelect(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R$attr.round_corners_flag, typedValue, true)) {
            return typedValue.resourceId != 0 ? context.getResources().getBoolean(typedValue.resourceId) : typedValue.data != 0;
        }
        return false;
    }
}
