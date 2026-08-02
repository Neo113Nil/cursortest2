package ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation;

import B0.A0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.M;
import kotlin.collections.U;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.b;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00062\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0006J\"\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001c\u001a\u00020\u0014H\u0002J$\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012H\u0002J\f\u0010\u001e\u001a\u00020\u0014*\u00020\u0014H\u0002J\f\u0010\u001f\u001a\u00020\u0012*\u00020\u0014H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/PhoneFormatter;", "", "<init>", "()V", "countryCodes", "", "", "placeholders", "placeholderChars", "", "", "updatePhoneFormat", "", "mainCountryCode", "additionalCountryCodes", FormPageDTO.Field.FIELD_TYPE_MASK, "format", "Lkotlin/Pair;", "", "input", "", "cursorPosition", "unformat", "isFullPhoneEntered", "", "isPhoneNumber", "handleCountryCode", "resolveEnteredCountryCode", "inputDigits", "formatPhoneWithPlaceholders", "digits", "digitsCount", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PhoneFormatter {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final char defaultChar = (char) 0;

    @NotNull
    private static final Set<Character> digits = C7714v.Y0(new b('0', '9'));

    @NotNull
    private List<String> countryCodes;

    @NotNull
    private Set<Character> placeholderChars;

    @NotNull
    private List<String> placeholders;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/participantPhone/presentation/PhoneFormatter$Companion;", "", "<init>", "()V", "", "REPLACE_CHARACTER", "C", "", "MAIN_CODE_SIZE", "I", "", "PLUS_PREFIX", "Ljava/lang/String;", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PhoneFormatter() {
        K k11 = K.f71697a;
        this.countryCodes = k11;
        this.placeholders = k11;
        this.placeholderChars = M.f71699a;
    }

    private final CharSequence digits(CharSequence charSequence) {
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

    private final int digitsCount(CharSequence charSequence) {
        int i11 = 0;
        for (int i12 = 0; i12 < charSequence.length(); i12++) {
            if (Character.isDigit(charSequence.charAt(i12))) {
                i11++;
            }
        }
        return i11;
    }

    private final Pair<String, Integer> formatPhoneWithPlaceholders(CharSequence input, int cursorPosition) {
        int G11 = (cursorPosition < 0 || cursorPosition > h.G(input)) ? h.G(input) : cursorPosition - 1;
        Iterator<String> it = this.placeholders.iterator();
        char c11 = defaultChar;
        I i11 = new I();
        StringBuilder sb2 = new StringBuilder();
        kotlin.jvm.internal.K k11 = new kotlin.jvm.internal.K();
        int i12 = 0;
        int i13 = 0;
        while (i12 < input.length()) {
            char charAt = input.charAt(i12);
            int i14 = i13 + 1;
            if (Character.isDigit(charAt)) {
                formatPhoneWithPlaceholders$updateResult(it, sb2, i11, k11, c11);
                c11 = charAt;
            }
            i11.f71783a = i13 == G11;
            i12++;
            i13 = i14;
        }
        formatPhoneWithPlaceholders$updateResult(it, sb2, i11, k11, c11);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return new Pair<>(sb3, Integer.valueOf(k11.f71785a));
    }

    private static final void formatPhoneWithPlaceholders$updateResult(Iterator<String> it, StringBuilder sb2, I i11, kotlin.jvm.internal.K k11, char c11) {
        if (c11 != defaultChar) {
            if (it.hasNext()) {
                sb2.append(it.next());
                sb2.append(c11);
            } else {
                sb2.append(c11);
            }
        }
        if (i11.f71783a) {
            k11.f71785a = sb2.length();
            i11.f71783a = false;
        }
    }

    private final CharSequence handleCountryCode(CharSequence input) {
        CharSequence digits2 = digits(input);
        boolean z11 = this.placeholders.size() > digits2.length();
        String resolveEnteredCountryCode = resolveEnteredCountryCode(digits2);
        return (z11 || resolveEnteredCountryCode == null) ? digits2 : h.R(digits2, resolveEnteredCountryCode);
    }

    private final String resolveEnteredCountryCode(CharSequence inputDigits) {
        Object obj;
        Iterator<T> it = this.countryCodes.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String str = (String) obj;
            if (inputDigits.length() == this.placeholders.size() + str.length() && h.g0(inputDigits, str)) {
                break;
            }
        }
        return (String) obj;
    }

    @NotNull
    public final Pair<String, Integer> format(@NotNull CharSequence input, int cursorPosition) {
        Intrinsics.checkNotNullParameter(input, "input");
        return formatPhoneWithPlaceholders(handleCountryCode(input), cursorPosition);
    }

    public final boolean isFullPhoneEntered(@NotNull CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.placeholders.size() <= digitsCount(input);
    }

    public final boolean isPhoneNumber(@NotNull CharSequence input) {
        Object obj;
        CharSequence R11;
        Intrinsics.checkNotNullParameter(input, "input");
        CharSequence R12 = h.R(input, "+");
        Iterator<T> it = this.countryCodes.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (h.g0(R12, (String) obj)) {
                break;
            }
        }
        String str = (String) obj;
        if (str != null && (R11 = h.R(R12, str)) != null) {
            R12 = R11;
        }
        for (int i11 = 0; i11 < R12.length(); i11++) {
            char charAt = R12.charAt(i11);
            if (!digits.contains(Character.valueOf(charAt)) && !this.placeholderChars.contains(Character.valueOf(charAt))) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final String unformat(@NotNull CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return new Regex(A0.b("[", C7714v.V(this.placeholderChars, "", null, null, PhoneFormatter$unformat$pattern$1.INSTANCE, 30), "]")).replace(input, "");
    }

    public final void updatePhoneFormat(@NotNull String mainCountryCode, List<String> additionalCountryCodes, @NotNull String mask) {
        Set<Character> destination;
        Intrinsics.checkNotNullParameter(mainCountryCode, "mainCountryCode");
        Intrinsics.checkNotNullParameter(mask, "mask");
        Tc.b builder = new Tc.b((additionalCountryCodes != null ? additionalCountryCodes.size() : 0) + 1);
        builder.add(digits(mainCountryCode).toString());
        if (additionalCountryCodes != null) {
            List<String> list = additionalCountryCodes;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(digits((String) it.next()).toString());
            }
            builder.addAll(arrayList);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.countryCodes = builder.B();
        this.placeholders = C7714v.E(h.l(mask, new char[]{'#'}, 0, 6));
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < mask.length(); i11++) {
            char charAt = mask.charAt(i11);
            if (charAt != '#') {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        char[] charArray = sb3.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        Intrinsics.checkNotNullParameter(charArray, "<this>");
        int length = charArray.length;
        if (length == 0) {
            destination = M.f71699a;
        } else if (length != 1) {
            int length2 = charArray.length;
            if (length2 > 128) {
                length2 = 128;
            }
            destination = new LinkedHashSet<>(U.h(length2));
            Intrinsics.checkNotNullParameter(charArray, "<this>");
            Intrinsics.checkNotNullParameter(destination, "destination");
            for (char c11 : charArray) {
                destination.add(Character.valueOf(c11));
            }
        } else {
            destination = e0.h(Character.valueOf(charArray[0]));
        }
        this.placeholderChars = destination;
    }
}
