package ru.ozon.app.android.monetization.widgets.skuListCopy.core.compose;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.monetization.widgets.skuListCopy.data.SkuListCopyDTO;
import ru.ozon.app.android.monetization.widgets.skuListCopy.di.SkuListCopyComponent;
import ru.ozon.app.android.monetization.widgets.skuListCopy.presentation.SkuListItemVI;
import ru.ozon.composer.compose.widget.scrollable.j;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/monetization/widgets/skuListCopy/di/SkuListCopyComponent;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class SkuListCopyWidgetKt$SkuListCopyWidget$1$3$component$2 extends AbstractC7737t implements Function0<SkuListCopyComponent> {
    final /* synthetic */ j<SkuListCopyDTO, SkuListItemVI> $this_viewMapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SkuListCopyWidgetKt$SkuListCopyWidget$1$3$component$2(j<SkuListCopyDTO, SkuListItemVI> jVar) {
        super(0);
        this.$this_viewMapper = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SkuListCopyComponent invoke() {
        return (SkuListCopyComponent) this.$this_viewMapper.getWidgetComponentStorage().getComponent(SkuListCopyComponent.class);
    }
}
