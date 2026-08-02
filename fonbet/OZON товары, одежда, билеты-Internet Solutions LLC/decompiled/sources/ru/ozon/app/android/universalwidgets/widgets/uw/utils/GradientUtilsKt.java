package ru.ozon.app.android.universalwidgets.widgets.uw.utils;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.core.UniGradient;
import ru.ozon.uni.core.UniGradients;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"mapGradientToVO", "Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "", "context", "Landroid/content/Context;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GradientUtilsKt {
    @NotNull
    public static final Color.Gradient mapGradientToVO(@NotNull String str, @NotNull Context context) {
        Color.Gradient gradient;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        UniGradient gradientByToken = TokensExtKt.getGradientByToken(str);
        return (gradientByToken == null || (gradient = TokensExtKt.toGradient(gradientByToken, context)) == null) ? TokensExtKt.toGradient(UniGradients.GR_OVERLAY_PRIMARY.getGradient(), context) : gradient;
    }
}
