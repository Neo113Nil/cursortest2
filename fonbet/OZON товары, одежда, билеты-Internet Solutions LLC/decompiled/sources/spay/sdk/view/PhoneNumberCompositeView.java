package spay.sdk.view;

import B0.A0;
import Lm0.a;
import Ve.C4205e7;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import spay.sdk.api.SPaymentTool;
import spay.sdk.domain.model.PayStrategy;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lspay/sdk/view/PhoneNumberCompositeView;", "Lspay/sdk/view/SPayEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lspay/sdk/domain/model/PayStrategy;", "strategy", "", "setPayStrategy", "(Lspay/sdk/domain/model/PayStrategy;)V", "SPaySDK_baseRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PhoneNumberCompositeView extends SPayEditText {

    /* renamed from: a, reason: collision with root package name */
    public boolean f98874a;

    public /* synthetic */ PhoneNumberCompositeView(Context context, AttributeSet attributeSet, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [T, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v6, types: [T, java.lang.String] */
    public static String a(String str) {
        int i11 = 0;
        String S11 = h.e0(str, "+7", false) ? h.S(str, "+7") : h.e0(str, "+", false) ? h.S(str, "+") : h.e0(str, "7", false) ? h.S(str, "7") : str;
        M m11 = new M();
        StringBuilder sb2 = new StringBuilder();
        int length = S11.length();
        for (int i12 = 0; i12 < length; i12++) {
            char charAt = S11.charAt(i12);
            if (Character.isDigit(charAt)) {
                sb2.append(charAt);
            }
        }
        ?? sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        m11.f71787a = sb3;
        if (sb3.length() > 10) {
            a.f17149a.i(A0.b("Phone number ", str, " is greater than 11 allowed chars"), new Object[0]);
            m11.f71787a = h.q0(10, (String) m11.f71787a);
        }
        StringBuilder sb4 = new StringBuilder("+7");
        CharSequence charSequence = (CharSequence) m11.f71787a;
        int i13 = 0;
        while (i11 < charSequence.length()) {
            char charAt2 = charSequence.charAt(i11);
            int i14 = i13 + 1;
            if (i13 == 0) {
                sb4.append(" " + charAt2);
            } else if (i13 == 3) {
                sb4.append(" " + charAt2);
            } else if (i13 == 6) {
                sb4.append("-" + charAt2);
            } else if (i13 != 8) {
                sb4.append(charAt2);
            } else {
                sb4.append("-" + charAt2);
            }
            i11++;
            i13 = i14;
        }
        String sb5 = sb4.toString();
        Intrinsics.checkNotNullExpressionValue(sb5, "toString(...)");
        return sb5;
    }

    @Override // android.widget.TextView
    public final void onSelectionChanged(int i11, int i12) {
        Editable text = getText();
        if (text == null || h.K(text)) {
            return;
        }
        Editable text2 = getText();
        int length = text2 != null ? text2.length() : 0;
        Editable text3 = getText();
        int length2 = text3 != null ? text3.length() : 0;
        setSelection(length, length2);
        super.onSelectionChanged(length, length2);
    }

    public final void setPayStrategy(@NotNull PayStrategy strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        setInputType(!(strategy instanceof PayStrategy.PayWithPhoneNumber) ? 2 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneNumberCompositeView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        new PayStrategy.PayWithPhoneNumber(SPaymentTool.CARDS);
        Intrinsics.checkNotNullParameter(this, "<this>");
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(16)});
        setInputType(3);
        setKeyListener(DigitsKeyListener.getInstance("0123456789"));
        addTextChangedListener(new C4205e7(this));
    }
}
