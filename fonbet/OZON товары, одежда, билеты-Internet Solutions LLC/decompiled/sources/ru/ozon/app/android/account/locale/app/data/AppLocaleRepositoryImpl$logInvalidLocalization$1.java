package ru.ozon.app.android.account.locale.app.data;

import Ub0.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LUb0/d;", "it", "", "invoke", "(LUb0/d;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class AppLocaleRepositoryImpl$logInvalidLocalization$1 extends AbstractC7737t implements Function1<d, CharSequence> {
    public static final AppLocaleRepositoryImpl$logInvalidLocalization$1 INSTANCE = new AppLocaleRepositoryImpl$logInvalidLocalization$1();

    AppLocaleRepositoryImpl$logInvalidLocalization$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String languageTag = it.d().toLanguageTag();
        Intrinsics.checkNotNullExpressionValue(languageTag, "toLanguageTag(...)");
        return languageTag;
    }
}
