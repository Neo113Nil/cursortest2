package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.presentation;

import A00.a;
import android.view.View;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.travel.feature.tours.R$layout;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.data.TouristCountSelectorDTO;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.di.TouristCountSelectorComponent;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00172\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR,\u0010#\u001a\u0014\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R&\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0(0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R0\u00100\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060-j\u0002`.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040'0\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010&¨\u00061"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/di/TouristCountSelectorComponent;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorDTO;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorVO;", "<init>", "()V", "vo", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/UpdateCountSelectors;", "update", "updateCells", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorVO;Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/UpdateCountSelectors;)Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorVO;", "LA00/a$J$a;", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorVO;)Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorVO;", "newItem", "", "getPayload", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorVO;Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorVO;)Ljava/lang/Object;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "getMapper", "mapper", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TouristCountSelectorViewMapper extends WidgetViewMapper2<TouristCountSelectorComponent, TouristCountSelectorDTO, TouristCountSelectorVO> {
    private final int layout = R$layout.widget_tourist_count_selector;

    @NotNull
    private final Function2<View, ComposerReferences, TouristCountSelectorWidgetViewHolder> holderProducer = new TouristCountSelectorViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<UpdateCountSelectors>> supportedUpdates = C7714v.a0(UpdateCountSelectors.class);

    private final TouristCountSelectorVO updateCells(TouristCountSelectorVO vo, UpdateCountSelectors update) {
        return TouristCountSelectorVO.copy$default(vo, 0L, update.getUpdatedCells(), 0, null, null, null, update.getAgeSelectors(), null, update.getIsChildrenAgeAnnotationVisible(), null, 701, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, TouristCountSelectorWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<TouristCountSelectorDTO, d, List<TouristCountSelectorVO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<UpdateCountSelectors>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<TouristCountSelectorComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return TouristCountSelectorComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull TouristCountSelectorVO oldItem, @NotNull TouristCountSelectorVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (!Intrinsics.d(oldItem.getCells(), newItem.getCells())) {
            return "count_cell_and_age_selectors";
        }
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        return Unit.f71690a;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public TouristCountSelectorVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull TouristCountSelectorVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof UpdateCountSelectors) {
            return updateCells(oldItem, (UpdateCountSelectors) update);
        }
        return null;
    }
}
