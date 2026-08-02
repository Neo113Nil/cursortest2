package mc0;

import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;

/* renamed from: mc0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8127a {

    /* renamed from: a, reason: collision with root package name */
    private boolean f74719a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private b f74720b;

    /* renamed from: mc0.a$a, reason: collision with other inner class name */
    public static final class C1268a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f74721a;

        /* renamed from: b, reason: collision with root package name */
        private final int f74722b;

        public C1268a(@NotNull String formattedInput, int i11) {
            Intrinsics.checkNotNullParameter(formattedInput, "formattedInput");
            this.f74721a = formattedInput;
            this.f74722b = i11;
        }

        public final int a() {
            return this.f74722b;
        }

        @NotNull
        public final String b() {
            return this.f74721a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1268a)) {
                return false;
            }
            C1268a c1268a = (C1268a) obj;
            return Intrinsics.d(this.f74721a, c1268a.f74721a) && this.f74722b == c1268a.f74722b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f74722b) + (this.f74721a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FormatResult(formattedInput=");
            sb2.append(this.f74721a);
            sb2.append(", cursorPosition=");
            return K00.b.e(this.f74722b, ")", sb2);
        }
    }

    /* renamed from: mc0.a$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f74723a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final String f74724b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final List<String> f74725c;

        /* renamed from: d, reason: collision with root package name */
        private final int f74726d;

        public b(@NotNull String phoneCode, @NotNull String mask) {
            Intrinsics.checkNotNullParameter(phoneCode, "phoneCode");
            Intrinsics.checkNotNullParameter(mask, "mask");
            this.f74723a = phoneCode;
            this.f74724b = mask;
            List<String> E11 = C7714v.E(h.l(mask, new char[]{'#'}, 0, 6));
            this.f74725c = E11;
            this.f74726d = E11.size() + phoneCode.length();
        }

        public final int a() {
            return this.f74726d;
        }

        @NotNull
        public final String b() {
            return this.f74724b;
        }

        @NotNull
        public final List<String> c() {
            return this.f74725c;
        }

        @NotNull
        public final String d() {
            return this.f74723a;
        }

        public final int e() {
            return this.f74725c.size();
        }
    }

    public C8127a() {
        Intrinsics.checkNotNullParameter("", "phoneCode");
        Intrinsics.checkNotNullParameter("", FormPageDTO.Field.FIELD_TYPE_MASK);
        this.f74720b = new b("", "");
    }

    private static StringBuilder a(CharSequence charSequence) {
        StringBuilder sb2 = new StringBuilder();
        int length = charSequence.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = charSequence.charAt(i11);
            if (Character.isDigit(charAt)) {
                sb2.append(charAt);
            }
        }
        return sb2;
    }

    private static final void c(Iterator<String> it, StringBuilder sb2, K k11, char c11, boolean z11) {
        if (it.hasNext()) {
            sb2.append(it.next() + c11);
        }
        if (z11) {
            k11.f71785a = sb2.length();
        }
    }

    @NotNull
    public final Spannable b(CharSequence input) {
        CharSequence input2;
        if (input == null) {
            return new SpannableString("");
        }
        Intrinsics.checkNotNullParameter(input, "input");
        b bVar = this.f74720b;
        int i11 = 0;
        for (int i12 = 0; i12 < input.length(); i12++) {
            if (Character.isDigit(input.charAt(i12))) {
                i11++;
            }
        }
        if (!(i11 != bVar.a() ? false : h.g0(a(input), bVar.d())) || this.f74719a) {
            input2 = input;
        } else {
            this.f74719a = true;
            input2 = h.R(a(input), this.f74720b.d());
        }
        int e11 = this.f74720b.e();
        int i13 = 0;
        for (int i14 = 0; i14 < input.length(); i14++) {
            if (Character.isDigit(input.charAt(i14))) {
                i13++;
            }
        }
        if (e11 - i13 > 1) {
            this.f74719a = false;
        }
        int selectionEnd = Selection.getSelectionEnd(input);
        Intrinsics.checkNotNullParameter(input2, "input");
        b bVar2 = this.f74720b;
        int G11 = selectionEnd < 0 ? h.G(input2) : selectionEnd - 1;
        K k11 = new K();
        Iterator<String> it = bVar2.c().iterator();
        StringBuilder sb2 = new StringBuilder();
        int i15 = 0;
        char c11 = 0;
        int i16 = 0;
        boolean z11 = false;
        while (i15 < input2.length()) {
            char charAt = input2.charAt(i15);
            int i17 = i16 + 1;
            if (Character.isDigit(charAt)) {
                if (c11 != 0) {
                    c(it, sb2, k11, c11, z11);
                    z11 = false;
                }
                c11 = charAt;
            }
            if (i16 == G11) {
                z11 = true;
            }
            i15++;
            i16 = i17;
        }
        if (c11 != 0) {
            c(it, sb2, k11, c11, z11);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        C1268a c1268a = new C1268a(sb3, k11.f71785a);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(c1268a.b());
        Selection.setSelection(spannableStringBuilder, c1268a.a());
        return spannableStringBuilder;
    }

    public final boolean d(@NotNull String phoneNumber) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        b bVar = this.f74720b;
        if (phoneNumber.length() == bVar.b().length()) {
            StringBuilder a11 = a(phoneNumber);
            if (a11.length() == bVar.e()) {
                StringBuilder sb2 = new StringBuilder();
                int length = a11.length();
                for (int i11 = 0; i11 < length; i11++) {
                    sb2.append(bVar.c().get(i11));
                    sb2.append(a11.charAt(i11));
                }
                String sb3 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                return phoneNumber.equals(sb3);
            }
        }
        return false;
    }

    public final void e(@NotNull String phoneCode, @NotNull String mask) {
        Intrinsics.checkNotNullParameter(phoneCode, "phoneCode");
        Intrinsics.checkNotNullParameter(mask, "mask");
        this.f74720b = new b(phoneCode, mask);
    }
}
