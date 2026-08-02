package ru.ozon.app.android.cml.delivery.widgets.participantPhone.presentation;

import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\f\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class PhoneFormatter$unformat$pattern$1 extends AbstractC7737t implements Function1<Character, CharSequence> {
    public static final PhoneFormatter$unformat$pattern$1 INSTANCE = new PhoneFormatter$unformat$pattern$1();

    PhoneFormatter$unformat$pattern$1() {
        super(1);
    }

    public final CharSequence invoke(char c11) {
        Regex.Companion companion = Regex.INSTANCE;
        String literal = String.valueOf(c11);
        companion.getClass();
        Intrinsics.checkNotNullParameter(literal, "literal");
        String quote = Pattern.quote(literal);
        Intrinsics.checkNotNullExpressionValue(quote, "quote(...)");
        return quote;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ CharSequence invoke(Character ch2) {
        return invoke(ch2.charValue());
    }
}
