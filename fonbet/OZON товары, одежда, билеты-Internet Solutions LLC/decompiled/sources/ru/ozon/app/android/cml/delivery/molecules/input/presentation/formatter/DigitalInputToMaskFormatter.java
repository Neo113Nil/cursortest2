package ru.ozon.app.android.cml.delivery.molecules.input.presentation.formatter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\"\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bJ\u001a\u0010\u0011\u001a\u00020\b*\u00020\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0005H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/input/presentation/formatter/DigitalInputToMaskFormatter;", "", "<init>", "()V", "placeholders", "", "", "lastMaskCharsCount", "", "updateMask", "", FormPageDTO.Field.FIELD_TYPE_MASK, "format", "Lkotlin/Pair;", "input", "", "cursorPosition", "correctWithMaskCharIndexes", "maskCharIndexes", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DigitalInputToMaskFormatter {
    private int lastMaskCharsCount;

    @NotNull
    private List<String> placeholders = K.f71697a;

    private final int correctWithMaskCharIndexes(int i11, List<Integer> list) {
        return list.contains(Integer.valueOf(i11)) ? i11 + 1 : i11;
    }

    @NotNull
    public final Pair<String, Integer> format(@NotNull CharSequence input, int cursorPosition) {
        Intrinsics.checkNotNullParameter(input, "input");
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.placeholders.iterator();
        int i11 = 0;
        for (int i12 = 0; i12 < input.length(); i12++) {
            char charAt = input.charAt(i12);
            if (Character.isDigit(charAt) && it.hasNext()) {
                String next = it.next();
                if (next.length() > 0) {
                    i11++;
                    arrayList.add(Integer.valueOf(h.G(sb2) + 1));
                }
                sb2.append(next);
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        int e11 = kotlin.ranges.h.e(correctWithMaskCharIndexes((i11 - this.lastMaskCharsCount) + cursorPosition, arrayList), 0, sb3.length());
        this.lastMaskCharsCount = i11;
        return new Pair<>(sb3, Integer.valueOf(e11));
    }

    public final void updateMask(String mask) {
        List l11;
        List<String> E11 = (mask == null || (l11 = h.l(mask, new char[]{'#'}, 0, 6)) == null) ? null : C7714v.E(l11);
        if (E11 == null) {
            E11 = K.f71697a;
        }
        this.placeholders = E11;
    }
}
