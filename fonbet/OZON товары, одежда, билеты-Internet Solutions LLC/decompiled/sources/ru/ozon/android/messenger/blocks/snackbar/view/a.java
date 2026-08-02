package ru.ozon.android.messenger.blocks.snackbar.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import androidx.core.content.res.g;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.messenger.R$attr;
import ru.ozon.app.android.messenger.R$font;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final int[] f86470b;

    /* renamed from: c, reason: collision with root package name */
    private static final float f86471c;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f86472a;

    static {
        int[] iArr = {R.attr.fontFamily, R.attr.fontFeatureSettings, R.attr.letterSpacing, R.attr.textSize, R.attr.textStyle, R.attr.textColor, R$attr.fontWeight};
        C7705l.Z(iArr);
        f86470b = iArr;
        f86471c = UiExtKt.toSpF(12);
    }

    public a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f86472a = context;
    }

    public static void a(a aVar, TextPaint paint, int i11) {
        Typeface create;
        Intrinsics.checkNotNullParameter(paint, "paint");
        Context context = aVar.f86472a;
        int[] iArr = f86470b;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i11, iArr);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        paint.setFontFeatureSettings(obtainStyledAttributes.getString(C7705l.L(iArr, R.attr.fontFeatureSettings)));
        paint.setLetterSpacing(obtainStyledAttributes.getFloat(C7705l.L(iArr, R.attr.letterSpacing), 0.0f));
        int resourceId = obtainStyledAttributes.getResourceId(C7705l.L(iArr, R.attr.fontFamily), R$font.onest_regular);
        int i12 = obtainStyledAttributes.getInt(C7705l.L(iArr, R.attr.textStyle), 0);
        int i13 = obtainStyledAttributes.getInt(C7705l.L(iArr, R$attr.fontWeight), -1);
        Typeface e11 = g.e(resourceId, context);
        if (Build.VERSION.SDK_INT < 28 || i13 < 1 || i13 > 1000) {
            create = Typeface.create(e11, i12);
        } else {
            create = Typeface.create(e11, i13, i12 == 2);
        }
        paint.setTypeface(create);
        paint.setTextSize(obtainStyledAttributes.getDimension(C7705l.L(iArr, R.attr.textSize), f86471c));
        paint.setColor(obtainStyledAttributes.getColor(C7705l.L(iArr, R.attr.textColor), ThemeExtKt.themeColor(context, R$attr.textPrimary)));
        obtainStyledAttributes.recycle();
    }
}
