package ru.ozon.app.android.universalwidgets.widgets.uw.sku.mapper;

import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.texts.TextAtomWithIcon;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0001\u001a(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007*\u00020\u00022\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00072\u0006\u0010\u0005\u001a\u00020\u0001¨\u0006\t"}, d2 = {"calculateFixedHeight", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/mapper/TextMeasurer;", "item", "Lru/ozon/app/android/atoms/data/texts/TextAtomWithIcon;", "maxLines", "calculateButtonSubtitleHeights", "", "buttonsSubtitles", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextMeasurerKt {
    @NotNull
    public static final synchronized List<Integer> calculateButtonSubtitleHeights(@NotNull TextMeasurer textMeasurer, @NotNull List<TextAtomWithIcon> buttonsSubtitles, int i11) {
        ArrayList arrayList;
        synchronized (TextMeasurerKt.class) {
            try {
                Intrinsics.checkNotNullParameter(textMeasurer, "<this>");
                Intrinsics.checkNotNullParameter(buttonsSubtitles, "buttonsSubtitles");
                List<TextAtomWithIcon> list = buttonsSubtitles;
                arrayList = new ArrayList(C7714v.z(list, 10));
                for (TextAtomWithIcon textAtomWithIcon : list) {
                    arrayList.add(Integer.valueOf(textAtomWithIcon != null ? calculateFixedHeight(textMeasurer, textAtomWithIcon, i11) : 0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    public static final int calculateFixedHeight(@NotNull TextMeasurer textMeasurer, TextAtomWithIcon textAtomWithIcon, int i11) {
        Intrinsics.checkNotNullParameter(textMeasurer, "<this>");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) " a\na");
        ColorDrawable colorDrawable = new ColorDrawable();
        colorDrawable.setBounds(0, 0, 0, ResourceExtKt.toPx(16));
        spannableStringBuilder.setSpan(new ImageSpan(colorDrawable, 0), 0, 1, 0);
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(spannableStringBuilder);
        Integer parseTextStyle = StyleParser.INSTANCE.parseTextStyle(textAtomWithIcon != null ? textAtomWithIcon.getTextStyle() : null);
        return textMeasurer.measure(ozonSpannableString, parseTextStyle != null ? parseTextStyle.intValue() : R$style.TextStyle_Caption, 0, 0, i11).y;
    }
}
