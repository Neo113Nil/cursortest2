package ru.ozon.app.android.travel.feature.railway.widgets.travelNavTrain.presentation;

import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.travel.feature.railway.R$layout;
import ru.ozon.app.android.travel.feature.railway.widgets.travelNavTrain.data.TravelNavTrainDTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelNavTrain.di.TravelNavTrainComponent;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R,\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R0\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u001bj\u0002`\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001d0\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelNavTrain/presentation/TravelNavTrainViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelNavTrain/di/TravelNavTrainComponent;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelNavTrain/data/TravelNavTrainDTO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelNavTrain/presentation/TravelNavTrainVO;", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/reflect/KFunction2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelNavTrain/presentation/TravelNavTrainWidgetViewHolder;", "holderProducer", "Lkotlin/reflect/h;", "getHolderProducer", "()Lkotlin/reflect/h;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "getMapper", "()Lkotlin/jvm/functions/Function2;", "mapper", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelNavTrainViewMapper extends WidgetViewMapper2<TravelNavTrainComponent, TravelNavTrainDTO, TravelNavTrainVO> {
    private final int layout = R$layout.widget_travel_nav_train;

    @NotNull
    private final h<TravelNavTrainWidgetViewHolder> holderProducer = TravelNavTrainViewMapper$holderProducer$1.INSTANCE;

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    /* renamed from: getHolderProducer */
    public /* bridge */ /* synthetic */ Function2 mo614getHolderProducer() {
        return (Function2) getHolderProducer();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<TravelNavTrainDTO, d, List<TravelNavTrainVO>> getMapper() {
        return component().getTravelNavTrainMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<TravelNavTrainComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return TravelNavTrainComponent.INSTANCE.create();
    }

    @NotNull
    public h<TravelNavTrainWidgetViewHolder> getHolderProducer() {
        return this.holderProducer;
    }
}
