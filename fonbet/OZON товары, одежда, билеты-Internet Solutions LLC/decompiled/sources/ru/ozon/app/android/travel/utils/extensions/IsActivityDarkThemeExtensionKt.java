package ru.ozon.app.android.travel.utils.extensions;

import android.content.Context;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.core.R$color;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"isActivityDarkThemeActive", "", "Landroid/content/Context;", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IsActivityDarkThemeExtensionKt {
    public static final boolean isActivityDarkThemeActive(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return StyleParser.INSTANCE.parseColorInt(context, UniColors.LAYER_FLOOR_1.getToken(), 0) == a.getColor(context, R$color.layer_floor_1_on_dark);
    }
}
