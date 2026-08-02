package ru.ozon.app.android.returns.common.presentation.untils;

import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bJ\u0014\u0010\t\u001a\u00020\u0005*\u00020\n2\b\b\u0001\u0010\u0007\u001a\u00020\bJ\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/returns/common/presentation/untils/TextAppearanceHelper;", "", "<init>", "()V", "setTextAppearanceStyle", "", "Landroid/widget/TextView;", "styleRes", "", "setStyle", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "getLetterSpacing", "", "getLineSpacingMultiplier", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TextAppearanceHelper {

    @NotNull
    public static final TextAppearanceHelper INSTANCE = new TextAppearanceHelper();

    private TextAppearanceHelper() {
    }

    private final float getLetterSpacing(int styleRes) {
        if (styleRes == R$style.TextStyle_Body_L || styleRes == R$style.TextStyle_Body_L_Bold || styleRes == R$style.TextStyle_Body_M || styleRes == R$style.TextStyle_Body_M_Bold) {
            return 0.01f;
        }
        return (styleRes == R$style.TextStyle_Head_M || styleRes == R$style.TextStyle_Caption_Gray60) ? 0.02f : 0.0f;
    }

    private final float getLineSpacingMultiplier(int styleRes) {
        if (styleRes == R$style.TextStyle_Body_L || styleRes == R$style.TextStyle_Body_L_Bold) {
            return 1.25f;
        }
        if (styleRes == R$style.TextStyle_Body_M || styleRes == R$style.TextStyle_Body_M_Bold) {
            return 1.28f;
        }
        if (styleRes == R$style.TextStyle_Head_M) {
            return 1.3f;
        }
        return styleRes == R$style.TextStyle_Caption_Gray60 ? 1.33f : 1.0f;
    }

    public final void setStyle(@NotNull TextAtomView textAtomView, int i11) {
        Intrinsics.checkNotNullParameter(textAtomView, "<this>");
        textAtomView.setStyleOrDefault(Integer.valueOf(i11));
        textAtomView.setLetterSpacing(getLetterSpacing(i11));
        textAtomView.setLineSpacing(textAtomView.getLineSpacingExtra(), getLineSpacingMultiplier(i11));
    }

    public final void setTextAppearanceStyle(@NotNull TextView textView, int i11) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        textView.setTextAppearance(i11);
        textView.setLetterSpacing(getLetterSpacing(i11));
        textView.setLineSpacing(textView.getLineSpacingExtra(), getLineSpacingMultiplier(i11));
    }
}
