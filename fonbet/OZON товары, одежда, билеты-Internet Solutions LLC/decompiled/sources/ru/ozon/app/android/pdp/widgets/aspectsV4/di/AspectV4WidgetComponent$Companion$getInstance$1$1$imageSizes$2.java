package ru.ozon.app.android.pdp.widgets.aspectsV4.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.widgets.aspectsV4.presentation.rv.AspectsV4ImageConst;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4ImageConst;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AspectV4WidgetComponent$Companion$getInstance$1$1$imageSizes$2 extends AbstractC7737t implements Function0<AspectsV4ImageConst> {
    final /* synthetic */ AspectV4WidgetComponent$Companion$getInstance$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AspectV4WidgetComponent$Companion$getInstance$1$1$imageSizes$2(AspectV4WidgetComponent$Companion$getInstance$1$1 aspectV4WidgetComponent$Companion$getInstance$1$1) {
        super(0);
        this.this$0 = aspectV4WidgetComponent$Companion$getInstance$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AspectsV4ImageConst invoke() {
        AppType appType;
        appType = this.this$0.appType;
        return new AspectsV4ImageConst(appType == AppType.SELECT);
    }
}
