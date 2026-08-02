package cc0;

import M8.j;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final String f56905a;

    /* renamed from: b, reason: collision with root package name */
    private final M8.e f56906b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final j f56907c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final M8.a f56908d;

    public e() {
        String country = Locale.getDefault().getCountry();
        this.f56905a = country;
        M8.e g10 = M8.e.g();
        this.f56906b = g10;
        this.f56907c = new j();
        g10.getClass();
        M8.a e11 = M8.e.e(country);
        Intrinsics.checkNotNullExpressionValue(e11, "getAsYouTypeFormatter(...)");
        this.f56908d = e11;
    }

    @NotNull
    public final Spannable a(CharSequence charSequence) {
        String i11;
        if (charSequence == null) {
            return new SpannableString("+");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        int selectionEnd = Selection.getSelectionEnd(charSequence);
        int i12 = selectionEnd - 1;
        M8.a aVar = this.f56908d;
        aVar.f();
        Selection.setSelection(spannableStringBuilder, selectionEnd);
        if (spannableStringBuilder.length() > 15) {
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (i13 < spannableStringBuilder.length()) {
                int i17 = i15 + 1;
                if (Character.isDigit(spannableStringBuilder.charAt(i13))) {
                    i16++;
                }
                if (i16 == 15) {
                    i14 = i15;
                }
                i13++;
                i15 = i17;
            }
            if (i14 > 0) {
                spannableStringBuilder.delete(i14, spannableStringBuilder.length());
            }
        }
        if (!h.f0(spannableStringBuilder, '+')) {
            spannableStringBuilder.insert(0, (CharSequence) "+");
        }
        String str = "";
        int i18 = 0;
        char c11 = 0;
        int i19 = 0;
        boolean z11 = false;
        while (true) {
            if (i18 >= spannableStringBuilder.length()) {
                break;
            }
            char charAt = spannableStringBuilder.charAt(i18);
            int i21 = i19 + 1;
            if (Character.isDigit(charAt) || (charAt == '+' && i19 == 0)) {
                if (c11 != 0) {
                    if (z11) {
                        str = aVar.j(c11);
                        Intrinsics.f(str);
                    } else {
                        str = aVar.i(c11);
                        Intrinsics.f(str);
                    }
                    z11 = false;
                }
                c11 = charAt;
            }
            if (i19 == i12) {
                z11 = true;
            }
            i18++;
            i19 = i21;
        }
        if (c11 != 0) {
            if (z11) {
                i11 = aVar.j(c11);
                Intrinsics.f(i11);
            } else {
                i11 = aVar.i(c11);
                Intrinsics.f(i11);
            }
            str = i11;
        }
        String str2 = str;
        spannableStringBuilder.replace(0, spannableStringBuilder.length(), (CharSequence) str2, 0, str2.length());
        int g10 = aVar.g();
        Integer valueOf = Integer.valueOf(g10);
        if (g10 < 0) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : spannableStringBuilder.length();
        Selection.setSelection(spannableStringBuilder, intValue >= 1 ? intValue : 1);
        return spannableStringBuilder;
    }

    public final boolean b(@NotNull String phone) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        M8.e eVar = this.f56906b;
        String str = this.f56905a;
        j jVar = this.f56907c;
        eVar.v(phone, str, jVar);
        return eVar.o(jVar);
    }
}
