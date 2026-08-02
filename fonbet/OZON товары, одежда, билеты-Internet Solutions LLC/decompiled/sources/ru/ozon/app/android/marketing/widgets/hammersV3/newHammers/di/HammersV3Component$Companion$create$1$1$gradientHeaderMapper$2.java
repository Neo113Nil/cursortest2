package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.di;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.core.HammersV3GradientHeaderMapper;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/core/HammersV3GradientHeaderMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class HammersV3Component$Companion$create$1$1$gradientHeaderMapper$2 extends AbstractC7737t implements Function0<HammersV3GradientHeaderMapper> {
    final /* synthetic */ HammersV3Component$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HammersV3Component$Companion$create$1$1$gradientHeaderMapper$2(HammersV3Component$Companion$create$1$1 hammersV3Component$Companion$create$1$1) {
        super(0);
        this.this$0 = hammersV3Component$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final HammersV3GradientHeaderMapper invoke() {
        Context context;
        context = this.this$0.context;
        return new HammersV3GradientHeaderMapper(context);
    }
}
