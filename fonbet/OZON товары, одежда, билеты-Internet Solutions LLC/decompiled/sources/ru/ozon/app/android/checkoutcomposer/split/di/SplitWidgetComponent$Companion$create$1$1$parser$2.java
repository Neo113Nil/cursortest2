package ru.ozon.app.android.checkoutcomposer.split.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.checkoutcomposer.split.core.SplitParser;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/checkoutcomposer/split/core/SplitParser;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class SplitWidgetComponent$Companion$create$1$1$parser$2 extends AbstractC7737t implements Function0<SplitParser> {
    final /* synthetic */ SplitWidgetComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SplitWidgetComponent$Companion$create$1$1$parser$2(SplitWidgetComponent$Companion$create$1$1 splitWidgetComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = splitWidgetComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SplitParser invoke() {
        return new SplitParser(this.this$0.getNetworkComponentApi().getJsonDeserializer());
    }
}
