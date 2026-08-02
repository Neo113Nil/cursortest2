package ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation;

import B0.C2454a;
import K00.b;
import N3.C3660k;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u001a\u0010\u0010\u001a\u00020\u0005*\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0012H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/OtpMaskFormatter;", "", "<init>", "()V", "lastMaskCharsCount", "", "formatByMask", "Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/OtpMaskFormatter$OtpFormatResult;", "input", "", FormPageDTO.Field.FIELD_TYPE_MASK, "", "cursorPosition", "getMaskLength", "reset", "", "correctWithMaskCharIndexes", "maskCharIndexes", "", "OtpFormatResult", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OtpMaskFormatter {
    private int lastMaskCharsCount;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0015\u0010\f¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/changeEmail/presentation/OtpMaskFormatter$OtpFormatResult;", "", "", "formattedText", "", "cursorPosition", "maskCharsCount", "<init>", "(Ljava/lang/String;II)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFormattedText", "I", "getCursorPosition", "getMaskCharsCount", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OtpFormatResult {
        private final int cursorPosition;

        @NotNull
        private final String formattedText;
        private final int maskCharsCount;

        public OtpFormatResult(@NotNull String formattedText, int i11, int i12) {
            Intrinsics.checkNotNullParameter(formattedText, "formattedText");
            this.formattedText = formattedText;
            this.cursorPosition = i11;
            this.maskCharsCount = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OtpFormatResult)) {
                return false;
            }
            OtpFormatResult otpFormatResult = (OtpFormatResult) other;
            return Intrinsics.d(this.formattedText, otpFormatResult.formattedText) && this.cursorPosition == otpFormatResult.cursorPosition && this.maskCharsCount == otpFormatResult.maskCharsCount;
        }

        public final int getCursorPosition() {
            return this.cursorPosition;
        }

        @NotNull
        public final String getFormattedText() {
            return this.formattedText;
        }

        public int hashCode() {
            return Integer.hashCode(this.maskCharsCount) + C2454a.a(this.cursorPosition, this.formattedText.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            String str = this.formattedText;
            return b.e(this.maskCharsCount, ")", C3660k.c(this.cursorPosition, "OtpFormatResult(formattedText=", str, ", cursorPosition=", ", maskCharsCount="));
        }
    }

    private final int correctWithMaskCharIndexes(int i11, List<Integer> list) {
        return list.contains(Integer.valueOf(i11)) ? i11 + 1 : i11;
    }

    @NotNull
    public final OtpFormatResult formatByMask(@NotNull CharSequence input, @NotNull String mask, int cursorPosition) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(mask, "mask");
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        List E11 = C7714v.E(h.l(mask, new char[]{'#'}, 0, 6));
        int i11 = 0;
        for (int i12 = 0; i12 < input.length(); i12++) {
            char charAt = input.charAt(i12);
            if (Character.isDigit(charAt) && E11.iterator().hasNext()) {
                String str = (String) E11.iterator().next();
                if (str.length() > 0) {
                    i11++;
                    arrayList.add(Integer.valueOf(h.G(sb2) + 1));
                }
                sb2.append(str);
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        int e11 = kotlin.ranges.h.e(correctWithMaskCharIndexes((i11 - this.lastMaskCharsCount) + cursorPosition, arrayList), 0, sb3.length());
        this.lastMaskCharsCount = i11;
        return new OtpFormatResult(sb3, e11, i11);
    }

    public final int getMaskLength(@NotNull String mask) {
        Intrinsics.checkNotNullParameter(mask, "mask");
        int i11 = 0;
        for (int i12 = 0; i12 < mask.length(); i12++) {
            if (mask.charAt(i12) == '#') {
                i11++;
            }
        }
        return i11;
    }

    public final void reset() {
        this.lastMaskCharsCount = 0;
    }
}
