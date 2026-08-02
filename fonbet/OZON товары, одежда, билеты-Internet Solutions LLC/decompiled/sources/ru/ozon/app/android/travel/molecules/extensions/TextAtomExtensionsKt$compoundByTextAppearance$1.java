package ru.ozon.app.android.travel.molecules.extensions;

import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "textAtom", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TextAtomExtensionsKt$compoundByTextAppearance$1 extends AbstractC7737t implements Function1<TextAtom, CharSequence> {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextAtomExtensionsKt$compoundByTextAppearance$1(Context context) {
        super(1);
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(TextAtom textAtom) {
        Intrinsics.checkNotNullParameter(textAtom, "textAtom");
        StyleParser styleParser = StyleParser.INSTANCE;
        Integer parseTextStyle = styleParser.parseTextStyle(textAtom.getTextStyle());
        Integer parseColor = styleParser.parseColor(this.$context, textAtom.getTextColor());
        OzonSpannableString text = textAtom.getText();
        Context context = this.$context;
        if (parseTextStyle != null) {
            text.setSpan(new TextAppearanceSpan(context, parseTextStyle.intValue()), 0, text.length(), 33);
        }
        if (parseColor != null) {
            text.setSpan(new ForegroundColorSpan(parseColor.intValue()), 0, text.length(), 33);
        }
        return text;
    }
}
