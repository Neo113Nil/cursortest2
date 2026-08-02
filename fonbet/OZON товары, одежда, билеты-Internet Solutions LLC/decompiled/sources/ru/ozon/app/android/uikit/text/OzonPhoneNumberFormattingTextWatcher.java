package ru.ozon.app.android.uikit.text;

import M8.a;
import M8.e;
import android.text.Editable;
import android.text.Selection;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u0005R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/uikit/text/OzonPhoneNumberFormattingTextWatcher;", "Lru/ozon/uni/android/uikit/common/SimpleTextWatcher;", "", "usePlusForEmptyString", "<init>", "(Z)V", "", "input", "", "cursor", "", "reformat", "(Ljava/lang/CharSequence;I)Ljava/lang/String;", "", "lastNonSeparator", "hasCursor", "getFormattedNumber", "(CZ)Ljava/lang/String;", "Landroid/text/Editable;", "", "afterTextChanged", "(Landroid/text/Editable;)V", "Z", "getUsePlusForEmptyString", "()Z", "setUsePlusForEmptyString", "selfChange", "LM8/a;", "formatter", "LM8/a;", "Companion", "ui-kit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class OzonPhoneNumberFormattingTextWatcher extends SimpleTextWatcher {

    @NotNull
    private final a formatter;
    private boolean selfChange;
    private boolean usePlusForEmptyString;

    public /* synthetic */ OzonPhoneNumberFormattingTextWatcher(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? true : z11);
    }

    private final String getFormattedNumber(char lastNonSeparator, boolean hasCursor) {
        if (hasCursor) {
            String j11 = this.formatter.j(lastNonSeparator);
            Intrinsics.f(j11);
            return j11;
        }
        String i11 = this.formatter.i(lastNonSeparator);
        Intrinsics.f(i11);
        return i11;
    }

    private final String reformat(CharSequence input, int cursor) {
        int i11 = cursor - 1;
        this.formatter.f();
        int length = input.length();
        String str = null;
        char c11 = 0;
        boolean z11 = false;
        for (int i12 = 0; i12 < length; i12++) {
            char charAt = input.charAt(i12);
            if (Character.isDigit(charAt) || (charAt == '+' && i12 == 0)) {
                if (c11 != 0) {
                    str = getFormattedNumber(c11, z11);
                    z11 = false;
                }
                c11 = charAt;
            }
            if (i12 == i11) {
                z11 = true;
            }
        }
        return c11 != 0 ? getFormattedNumber(c11, z11) : str;
    }

    @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
    public void afterTextChanged(@NotNull Editable input) {
        Character O11;
        Intrinsics.checkNotNullParameter(input, "input");
        if (this.selfChange) {
            return;
        }
        String obj = input.toString();
        StringBuilder sb2 = new StringBuilder();
        int length = obj.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = obj.charAt(i11);
            if (Character.isDigit(charAt)) {
                sb2.append(charAt);
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        if (sb3.length() > 15 && (O11 = h.O(sb3)) != null) {
            input.delete(h.N(O11.charValue(), 0, 6, input), input.length());
        }
        Editable editable = !h.f0(input, '+') ? input : null;
        if (editable != null) {
            if ((h.K(input) ? this.usePlusForEmptyString : true ? editable : null) != null) {
                input.insert(0, "+");
            }
        }
        String reformat = reformat(input, Selection.getSelectionEnd(input));
        if (reformat != null) {
            int g10 = this.formatter.g();
            this.selfChange = true;
            input.replace(0, input.length(), reformat, 0, reformat.length());
            if (reformat.equals(input.toString())) {
                Selection.setSelection(input, g10);
            }
            this.selfChange = false;
        }
    }

    public OzonPhoneNumberFormattingTextWatcher(boolean z11) {
        this.usePlusForEmptyString = z11;
        e g10 = e.g();
        String country = Locale.getDefault().getCountry();
        g10.getClass();
        a e11 = e.e(country);
        Intrinsics.checkNotNullExpressionValue(e11, "getAsYouTypeFormatter(...)");
        this.formatter = e11;
    }
}
