package ru.ozon.app.android.cml.delivery.molecules.input.presentation.watcher;

import android.text.Editable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R0\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/input/presentation/watcher/MoneyInputTextWatcher;", "Lru/ozon/app/android/cml/delivery/molecules/input/presentation/watcher/DelayedActionTextWatcher;", "<init>", "()V", "", "input", "", "formatMoney", "(Ljava/lang/CharSequence;)Ljava/lang/String;", "", "", "getReversedFormattedChars", "(Ljava/lang/CharSequence;)Ljava/util/List;", "Landroid/text/Editable;", "", "afterTextChanged", "(Landroid/text/Editable;)V", "Lkotlin/Function1;", "onTextChange", "Lkotlin/jvm/functions/Function1;", "getOnTextChange", "()Lkotlin/jvm/functions/Function1;", "setOnTextChange", "(Lkotlin/jvm/functions/Function1;)V", "", "maxLength", "Ljava/lang/Integer;", "getMaxLength", "()Ljava/lang/Integer;", "setMaxLength", "(Ljava/lang/Integer;)V", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MoneyInputTextWatcher extends DelayedActionTextWatcher {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private Integer maxLength;
    private Function1<? super String, Unit> onTextChange;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cml/delivery/molecules/input/presentation/watcher/MoneyInputTextWatcher$Companion;", "", "<init>", "()V", "NUMBER_GROUP_SEPARATOR", "", "NUMBER_GROUP_SIZE", "", "DECIMAL_SEPARATOR", "ANOTHER_DECIMAL_SEPARATOR", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final String formatMoney(CharSequence input) {
        List<Character> reversedFormattedChars = getReversedFormattedChars(input);
        StringBuilder sb2 = new StringBuilder(reversedFormattedChars.size());
        int size = reversedFormattedChars.size() - 1;
        if (size >= 0) {
            while (true) {
                int i11 = size - 1;
                sb2.append(reversedFormattedChars.get(size).charValue());
                if (i11 < 0) {
                    break;
                }
                size = i11;
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    private final List<Character> getReversedFormattedChars(CharSequence input) {
        if (!h.K(input)) {
            int i11 = 0;
            for (int i12 = 0; i12 < input.length(); i12++) {
                if (Character.isDigit(input.charAt(i12))) {
                    StringBuilder sb2 = new StringBuilder();
                    String obj = input.toString();
                    boolean z11 = false;
                    for (int i13 = 0; i13 < obj.length(); i13++) {
                        char charAt = obj.charAt(i13);
                        if (Character.isDigit(charAt)) {
                            sb2.append(charAt);
                        } else if ((charAt == ',' || charAt == '.') && !z11) {
                            sb2.append('.');
                            z11 = true;
                        }
                    }
                    String sb3 = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                    String bigDecimal = new BigDecimal(sb3).setScale(0, RoundingMode.HALF_UP).toString();
                    Intrinsics.checkNotNullExpressionValue(bigDecimal, "toString(...)");
                    if (h.K(bigDecimal)) {
                        return K.f71697a;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int G11 = h.G(bigDecimal); -1 < G11; G11--) {
                        char charAt2 = bigDecimal.charAt(G11);
                        if (Character.isDigit(charAt2)) {
                            if (i11 >= 3 && i11 % 3 == 0) {
                                arrayList.add((char) 8201);
                            }
                            arrayList.add(Character.valueOf(charAt2));
                            i11++;
                        }
                    }
                    return arrayList;
                }
            }
        }
        return K.f71697a;
    }

    @Override // ru.ozon.app.android.cml.delivery.molecules.input.presentation.watcher.DelayedActionTextWatcher, ru.ozon.uni.android.input.textinput.domain.OzonTextWatcher, android.text.TextWatcher
    public void afterTextChanged(Editable input) {
        if (getSkipChange() || input == null) {
            return;
        }
        if (!getExecutingAction()) {
            String formatMoney = formatMoney(input);
            setSkipChange(true);
            int length = input.length();
            Integer num = this.maxLength;
            input.replace(0, length, h.r0(num != null ? num.intValue() : formatMoney.length(), formatMoney));
            setSkipChange(false);
            Function1<? super String, Unit> function1 = this.onTextChange;
            if (function1 != null) {
                function1.invoke(input.toString());
            }
        }
        super.afterTextChanged(input);
    }

    public final void setMaxLength(Integer num) {
        this.maxLength = num;
    }

    public final void setOnTextChange(Function1<? super String, Unit> function1) {
        this.onTextChange = function1;
    }
}
