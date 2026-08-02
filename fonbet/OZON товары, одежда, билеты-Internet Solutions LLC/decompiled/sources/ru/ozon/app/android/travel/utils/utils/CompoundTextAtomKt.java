package ru.ozon.app.android.travel.utils.utils;

import android.content.Context;
import android.text.SpannableStringBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.utils.CharSequenceExtensionKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"compoundTextAtom", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "firstText", "secondTextName", "separator", "", "context", "Landroid/content/Context;", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CompoundTextAtomKt {
    public static final TextAtom compoundTextAtom(TextAtom textAtom, TextAtom textAtom2, @NotNull String separator, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(context, "context");
        if (textAtom == null) {
            return textAtom2;
        }
        if (textAtom2 == null) {
            return textAtom;
        }
        StyleParser styleParser = StyleParser.INSTANCE;
        String textColor = textAtom.getTextColor();
        UniColors uniColors = UniColors.BG_ACTION_SECONDARY_SOLID;
        CharSequence color = CharSequenceExtensionKt.setColor(textAtom.getText(), styleParser.parseColor(context, textColor, uniColors.getResId()));
        SpannableStringBuilder append = new SpannableStringBuilder(color).append((CharSequence) separator).append(CharSequenceExtensionKt.setColor(textAtom2.getText(), styleParser.parseColor(context, textAtom2.getTextColor(), uniColors.getResId())));
        Intrinsics.checkNotNullExpressionValue(append, "append(...)");
        return TextAtom.copy$default(textAtom, OzonSpannableStringKt.toOzonSpannableString(append), null, null, null, null, null, null, 126, null);
    }
}
