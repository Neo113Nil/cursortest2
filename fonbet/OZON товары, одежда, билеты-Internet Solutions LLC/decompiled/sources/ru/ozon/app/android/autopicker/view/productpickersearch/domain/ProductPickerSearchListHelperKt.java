package ru.ozon.app.android.autopicker.view.productpickersearch.domain;

import Hj.C3143a;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.content.res.g;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.A;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$font;
import ru.ozon.uni.atoms.html.spans.CustomTypefaceSpan;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b\u001a\n\u0010\t\u001a\u00020\u0005*\u00020\b\u001a\u0014\u0010\n\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¨\u0006\u000e"}, d2 = {"highlightText", "Landroid/text/SpannedString;", "context", "Landroid/content/Context;", "normalizedSearchText", "", "normalizedTitle", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "normalize", "getSelectionChain", "items", "", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO$ProductPickerSearchItem;", "autopicker_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductPickerSearchListHelperKt {
    @NotNull
    public static final String getSelectionChain(@NotNull List<ProductPickerSearchVO.ProductPickerSearchItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        ArrayList arrayList = new ArrayList();
        int P11 = C7714v.P(items);
        while (true) {
            if (-1 >= P11) {
                break;
            }
            if (items.get(P11).getIsSelected()) {
                arrayList.add(items.get(P11).getTitle());
                int offset = items.get(P11).getOffset();
                while (-1 < P11) {
                    if (items.get(P11).getOffset() == offset - 1) {
                        arrayList.add(items.get(P11).getTitle());
                        offset--;
                        if (offset <= 1) {
                            break;
                        }
                    }
                    P11--;
                }
            } else {
                P11--;
            }
        }
        String join = TextUtils.join("/", C7714v.z0(arrayList));
        Intrinsics.checkNotNullExpressionValue(join, "join(...)");
        return join;
    }

    @NotNull
    public static final SpannedString highlightText(@NotNull Context context, @NotNull String normalizedSearchText, @NotNull String normalizedTitle, @NotNull CharSequence title) {
        ArrayList o11;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(normalizedSearchText, "normalizedSearchText");
        Intrinsics.checkNotNullParameter(normalizedTitle, "normalizedTitle");
        Intrinsics.checkNotNullParameter(title, "title");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(title.toString());
        o11 = A.o(normalizedTitle, normalizedSearchText.length(), 1, false);
        Iterator it = o11.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            if (Intrinsics.d((String) next, normalizedSearchText)) {
                spannableStringBuilder.setSpan(new CustomTypefaceSpan(g.e(R$font.onest_semibold, context)), i11, normalizedSearchText.length() > (normalizedTitle.length() - i11) + 1 ? normalizedTitle.length() : normalizedSearchText.length() + i11, 33);
            } else {
                i11 = i12;
            }
        }
        return new SpannedString(spannableStringBuilder);
    }

    @NotNull
    public static final String normalize(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        String normalize = Normalizer.normalize(charSequence, Normalizer.Form.NFD);
        Intrinsics.checkNotNullExpressionValue(normalize, "normalize(...)");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = normalize.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return C3143a.g("\\p{InCombiningDiacriticalMarks}+", lowerCase, "");
    }
}
