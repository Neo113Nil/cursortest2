package ru.ozon.app.android.checkoutcomposer.total.presentation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.atom2.ButtonAtom;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.deprecated.Button;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0000\u001a\u001c\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0000¨\u0006\r"}, d2 = {"customizeButton", "", "Lru/ozon/app/android/atoms/atom2/ButtonAtom;", "buttonColor", "", "buttonTextColor", "onButtonColorChanged", "Lkotlin/Function0;", "rebindButton", "button", "Lru/ozon/uni/atoms/data/deprecated/Button;", "style", "Lru/ozon/uni/atoms/data/deprecated/Button$Style;", "checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ExtentionsKt {
    public static final void customizeButton(@NotNull ButtonAtom buttonAtom, String str, String str2, @NotNull Function0<Unit> onButtonColorChanged) {
        int themeColor;
        Intrinsics.checkNotNullParameter(buttonAtom, "<this>");
        Intrinsics.checkNotNullParameter(onButtonColorChanged, "onButtonColorChanged");
        if (str == null) {
            return;
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = buttonAtom.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer mapColor = styleParser.mapColor(context, str);
        if (mapColor != null) {
            int intValue = mapColor.intValue();
            View childAt = buttonAtom.getChildAt(0);
            ColorStateList valueOf = ColorStateList.valueOf(a.getColor(buttonAtom.getContext(), R$color.white));
            PaintDrawable paintDrawable = new PaintDrawable();
            paintDrawable.getPaint().setColor(a.getColor(buttonAtom.getContext(), intValue));
            Context context2 = buttonAtom.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            if (UniGlobalConfigKt.getRoundCornersFlag(context2)) {
                paintDrawable.setCornerRadius(ResourceExtKt.toPxF(99));
            } else {
                paintDrawable.setCornerRadius(ResourceExtKt.toPxF(10));
            }
            Unit unit = Unit.f71690a;
            childAt.setBackground(new RippleDrawable(valueOf, paintDrawable, null));
            Context context3 = buttonAtom.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            Integer mapColor2 = styleParser.mapColor(context3, str2);
            if (mapColor2 != null) {
                themeColor = mapColor2.intValue();
            } else {
                Context context4 = buttonAtom.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                themeColor = ThemeExtKt.themeColor(context4, R$attr.textPrimaryOnLight);
            }
            View childAt2 = buttonAtom.getChildAt(0);
            Intrinsics.g(childAt2, "null cannot be cast to non-null type android.view.ViewGroup");
            View childAt3 = ((ViewGroup) childAt2).getChildAt(1);
            Intrinsics.g(childAt3, "null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
            ((AppCompatTextView) childAt3).setTextColor(themeColor);
            onButtonColorChanged.invoke();
        }
    }

    public static final void rebindButton(@NotNull ButtonAtom buttonAtom, @NotNull Button button, @NotNull Button.Style style) {
        Intrinsics.checkNotNullParameter(buttonAtom, "<this>");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(style, "style");
        buttonAtom.bind(Button.copy$default(button, null, null, style, null, null, null, null, 123, null));
    }
}
