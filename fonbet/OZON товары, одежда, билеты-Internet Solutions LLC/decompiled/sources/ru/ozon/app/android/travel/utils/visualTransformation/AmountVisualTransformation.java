package ru.ozon.app.android.travel.utils.visualTransformation;

import K1.C3422b;
import Q1.D;
import Q1.W;
import Q1.X;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/utils/visualTransformation/AmountVisualTransformation;", "LQ1/X;", "", "suffix", "", "separator", "decimalSeparator", "<init>", "(Ljava/lang/String;CC)V", "LK1/b;", "text", "LQ1/W;", "filter", "(LK1/b;)LQ1/W;", "Ljava/lang/String;", "C", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AmountVisualTransformation implements X {
    private final char decimalSeparator;
    private final char separator;
    private final String suffix;

    public AmountVisualTransformation() {
        this(null, (char) 0, (char) 0, 7, null);
    }

    @Override // Q1.X
    @NotNull
    public W filter(@NotNull C3422b text) {
        int i11;
        Intrinsics.checkNotNullParameter(text, "text");
        final String h11 = text.h();
        if (h11.length() == 0) {
            return new W(text, D.a.a());
        }
        int I11 = h.I(this.decimalSeparator, 0, 6, h11);
        boolean z11 = I11 != -1;
        int length = z11 ? I11 : h11.length();
        int i12 = length > 0 ? (length - 1) / 3 : 0;
        String str = this.suffix;
        final int length2 = h11.length() + i12 + (str != null ? str.length() : 0);
        StringBuilder sb2 = new StringBuilder(length2);
        final int[] iArr = new int[h11.length() + 1];
        final int[] iArr2 = new int[length2 + 1];
        iArr2[0] = 0;
        int length3 = h11.length();
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < length3; i15++) {
            iArr[i14] = i13;
            sb2.append(h11.charAt(i15));
            i14++;
            int i16 = i13 + 1;
            iArr2[i16] = i14;
            if ((!z11 || i14 < I11) && (i11 = length - i14) > 0 && i11 % 3 == 0) {
                sb2.append(this.separator);
                i13 += 2;
                iArr2[i13] = i14;
            } else {
                i13 = i16;
            }
        }
        iArr[h11.length()] = i13;
        String str2 = this.suffix;
        if (str2 != null) {
            sb2.append(str2);
            int length4 = this.suffix.length();
            for (int i17 = 0; i17 < length4; i17++) {
                i13++;
                iArr2[i13] = h11.length();
            }
        }
        D d11 = new D() { // from class: ru.ozon.app.android.travel.utils.visualTransformation.AmountVisualTransformation$filter$offsetMapping$1
            @Override // Q1.D
            public int originalToTransformed(int offset) {
                return offset < 0 ? iArr[0] : offset > h11.length() ? iArr[h11.length()] : iArr[offset];
            }

            @Override // Q1.D
            public int transformedToOriginal(int offset) {
                if (offset < 0) {
                    return iArr2[0];
                }
                int i18 = length2;
                return offset > i18 ? iArr2[i18] : iArr2[offset];
            }
        };
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return new W(new C3422b(6, sb3, null), d11);
    }

    public AmountVisualTransformation(String str, char c11, char c12) {
        this.suffix = str;
        this.separator = c11;
        this.decimalSeparator = c12;
    }

    public /* synthetic */ AmountVisualTransformation(String str, char c11, char c12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? (char) 8201 : c11, (i11 & 4) != 0 ? ',' : c12);
    }
}
