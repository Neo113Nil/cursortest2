package ru.ozon.uni.android.uikitsdk.ext;

import Sc.r;
import Sc.s;
import android.content.Context;
import android.content.res.TypedArray;
import androidx.core.content.res.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.core.UniGradient;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006\u001a*\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0001¨\u0006\t"}, d2 = {"getGradientOrColor", "Lru/ozon/uni/android/uikitsdk/Color;", "Landroid/content/res/TypedArray;", "context", "Landroid/content/Context;", "gradientAttr", "", "colorAttr", "defaultColor", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TypedArrayExtKt {
    @NotNull
    public static final Color getGradientOrColor(@NotNull TypedArray typedArray, @NotNull Context context, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        String string = typedArray.getString(i11);
        if (string != null) {
            UniGradient gradientByToken = TokensExtKt.getGradientByToken(string);
            Color.Gradient gradient = gradientByToken != null ? TokensExtKt.toGradient(gradientByToken, context) : null;
            if (gradient != null) {
                return gradient;
            }
        }
        return new Color.Solid(typedArray.getColor(i12, i13));
    }

    @NotNull
    public static final Color getGradientOrColor(@NotNull TypedArray typedArray, @NotNull Context context, int i11, int i12, @NotNull Color defaultColor) {
        Object a11;
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defaultColor, "defaultColor");
        String string = typedArray.getString(i11);
        if (string != null) {
            UniGradient gradientByToken = TokensExtKt.getGradientByToken(string);
            Color.Gradient gradient = gradientByToken != null ? TokensExtKt.toGradient(gradientByToken, context) : null;
            if (gradient != null) {
                return gradient;
            }
        }
        try {
            r.Companion companion = r.INSTANCE;
            a11 = new Color.Solid(j.a(typedArray, i12));
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        Color.Solid solid = (Color.Solid) (a11 instanceof r.b ? null : a11);
        return solid != null ? solid : defaultColor;
    }
}
