package ru.ozon.app.android.travel.feature.hotels.widgets.cellWithTimer.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.travel.feature.hotels.widgets.cellWithTimer.data.CellWithTimerMapper;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/feature/hotels/widgets/cellWithTimer/data/CellWithTimerMapper;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class CellWithTimerComponent$Companion$create$1$1$mapper$2 extends AbstractC7737t implements Function0<CellWithTimerMapper> {
    final /* synthetic */ CellWithTimerComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CellWithTimerComponent$Companion$create$1$1$mapper$2(CellWithTimerComponent$Companion$create$1$1 cellWithTimerComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = cellWithTimerComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CellWithTimerMapper invoke() {
        ContextComponentDependencies contextComponentDependencies;
        contextComponentDependencies = this.this$0.contextComponentDependencies;
        return new CellWithTimerMapper(contextComponentDependencies.getContext(), CellWithTimerModule.INSTANCE.provideTimerFormatter());
    }
}
