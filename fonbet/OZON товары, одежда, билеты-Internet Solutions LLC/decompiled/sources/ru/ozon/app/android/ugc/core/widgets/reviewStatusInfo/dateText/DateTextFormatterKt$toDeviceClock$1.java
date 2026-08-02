package ru.ozon.app.android.ugc.core.widgets.reviewStatusInfo.dateText;

import U7.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.h;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lkotlin/text/MatchResult;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DateTextFormatterKt$toDeviceClock$1 extends AbstractC7737t implements Function1<MatchResult, CharSequence> {
    public static final DateTextFormatterKt$toDeviceClock$1 INSTANCE = new DateTextFormatterKt$toDeviceClock$1();

    DateTextFormatterKt$toDeviceClock$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(MatchResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return d.e(h.C0(it.getValue()).toString(), " a");
    }
}
