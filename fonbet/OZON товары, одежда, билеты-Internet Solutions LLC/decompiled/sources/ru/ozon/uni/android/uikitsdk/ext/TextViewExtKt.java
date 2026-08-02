package ru.ozon.uni.android.uikitsdk.ext;

import Sc.InterfaceC3999a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.core.content.res.g;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.core.R$font;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0001\u001a\u0012\u0010\u0006\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\b\u001a\u00020\t\u001a\u001e\u0010\n\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"calculateLetterSpacing", "", "Landroid/widget/TextView;", "letterSpacingInDp", "styledAttrs", "", "setTextCopyable", "", "isCopyable", "", "applyStyle", "context", "Landroid/content/Context;", "style", "", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TextViewExtKt {

    @NotNull
    private static final int[] styledAttrs;

    static {
        int[] iArr = {R.attr.fontFamily, R.attr.lineHeight};
        C7705l.Z(iArr);
        styledAttrs = iArr;
    }

    @SuppressLint({"ResourceType"})
    public static final void applyStyle(@NotNull TextView textView, @NotNull Context context, int i11) {
        int fontMetricsInt;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        int[] iArr = styledAttrs;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i11, iArr);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = obtainStyledAttributes.getResourceId(C7705l.L(iArr, R.attr.fontFamily), R$font.onest_regular);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C7705l.L(iArr, R.attr.lineHeight), -1);
        obtainStyledAttributes.recycle();
        textView.setTypeface(g.e(resourceId, context));
        textView.setTextAppearance(i11);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i11, R$styleable.OzonTextAppearance);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes2, "obtainStyledAttributes(...)");
        if (obtainStyledAttributes2.hasValue(R$styleable.OzonTextAppearance_letterSpacingInDP)) {
            textView.setLetterSpacing(calculateLetterSpacing(textView, obtainStyledAttributes2.getFloat(R$styleable.OzonTextAppearance_letterSpacingInDP, 0.0f)));
        }
        obtainStyledAttributes2.recycle();
        if (dimensionPixelSize == -1 || dimensionPixelSize == (fontMetricsInt = textView.getPaint().getFontMetricsInt(null))) {
            return;
        }
        int i12 = dimensionPixelSize - fontMetricsInt;
        textView.setLineSpacing(i12, 1.0f);
        int i13 = i12 / 2;
        textView.setPadding(0, i12 - i13, 0, i13);
    }

    @InterfaceC3999a
    public static final float calculateLetterSpacing(@NotNull TextView textView, float f7) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        return f7 / textView.getTextSize();
    }

    public static final void setTextCopyable(@NotNull TextView textView, boolean z11) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setTextIsSelectable(z11);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
