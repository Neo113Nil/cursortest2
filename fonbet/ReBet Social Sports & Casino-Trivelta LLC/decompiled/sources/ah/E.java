package ah;

import ah.z;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public abstract class E {
    public static final void a(InterfaceC2006A interfaceC2006A, String str, int i10, int i11, int i12, boolean z10) {
        String substring;
        String substring2;
        String substring3;
        if (i11 == -1) {
            int f10 = f(i10, i12, str);
            int e10 = e(f10, i12, str);
            if (e10 > f10) {
                if (z10) {
                    substring3 = AbstractC2010b.k(str, f10, e10, false, null, 12, null);
                } else {
                    substring3 = str.substring(f10, e10);
                    Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                interfaceC2006A.e(substring3, CollectionsKt.emptyList());
                return;
            }
            return;
        }
        int f11 = f(i10, i11, str);
        int e11 = e(f11, i11, str);
        if (e11 > f11) {
            if (z10) {
                substring = AbstractC2010b.k(str, f11, e11, false, null, 12, null);
            } else {
                substring = str.substring(f11, e11);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            int f12 = f(i11 + 1, i12, str);
            int e12 = e(f12, i12, str);
            if (z10) {
                substring2 = AbstractC2010b.k(str, f12, e12, true, null, 8, null);
            } else {
                substring2 = str.substring(f12, e12);
                Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            interfaceC2006A.f(substring, substring2);
        }
    }

    public static final void b(InterfaceC2006A interfaceC2006A, String str, int i10, int i11, boolean z10) {
        int i12;
        int i13;
        int lastIndex = StringsKt.getLastIndex(str);
        int i14 = 0;
        if (i10 <= lastIndex) {
            int i15 = -1;
            int i16 = i10;
            int i17 = i16;
            while (i14 != i11) {
                char charAt = str.charAt(i17);
                if (charAt == '&') {
                    a(interfaceC2006A, str, i16, i15, i17, z10);
                    i14++;
                    i15 = -1;
                    i16 = i17 + 1;
                } else if (charAt == '=' && i15 == -1) {
                    i15 = i17;
                }
                if (i17 != lastIndex) {
                    i17++;
                } else {
                    i13 = i16;
                    i12 = i15;
                }
            }
            return;
        }
        i12 = -1;
        i13 = i10;
        if (i14 == i11) {
            return;
        }
        a(interfaceC2006A, str, i13, i12, str.length(), z10);
    }

    public static final z c(String query, int i10, int i11, boolean z10) {
        Intrinsics.checkNotNullParameter(query, "query");
        if (i10 > StringsKt.getLastIndex(query)) {
            return z.f16246b.a();
        }
        z.a aVar = z.f16246b;
        InterfaceC2006A b10 = D.b(0, 1, null);
        b(b10, query, i10, i11, z10);
        return b10.build();
    }

    public static /* synthetic */ z d(String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = 1000;
        }
        if ((i12 & 8) != 0) {
            z10 = true;
        }
        return c(str, i10, i11, z10);
    }

    public static final int e(int i10, int i11, CharSequence charSequence) {
        while (i11 > i10 && CharsKt.isWhitespace(charSequence.charAt(i11 - 1))) {
            i11--;
        }
        return i11;
    }

    public static final int f(int i10, int i11, CharSequence charSequence) {
        while (i10 < i11 && CharsKt.isWhitespace(charSequence.charAt(i10))) {
            i10++;
        }
        return i10;
    }
}
