package ru.ozon.app.android.composer.widgets.base.config;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.base.config.ParseResult;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "params", "", "state", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class UndisplayedWidgetConfig$parser$1 extends AbstractC7737t implements Function2<String, String, Unit> {
    final /* synthetic */ UndisplayedWidgetConfig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UndisplayedWidgetConfig$parser$1(UndisplayedWidgetConfig undisplayedWidgetConfig) {
        super(2);
        this.this$0 = undisplayedWidgetConfig;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2) {
        try {
            ParseResult parseResult = this.this$0.parseResult(str, str2);
            if (parseResult instanceof ParseResult.Failure) {
                throw new ParseException(((ParseResult.Failure) parseResult).getMessage());
            }
        } catch (Exception e11) {
            if (!(e11 instanceof ParseException)) {
                throw new ParseException(e11);
            }
        }
    }
}
