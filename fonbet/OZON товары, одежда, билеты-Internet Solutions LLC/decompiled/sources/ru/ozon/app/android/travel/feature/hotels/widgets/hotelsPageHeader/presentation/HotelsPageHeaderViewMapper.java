package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageHeader.presentation;

import A00.a;
import android.view.View;
import h20.InterfaceC6786a;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.travel.feature.hotels.R$layout;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageHeader.data.HotelsPageHeaderDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageHeader.di.HotelsPageHeaderComponent;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsPageHeader.presentation.HotelsPageHeaderVO;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R,\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR(\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070 0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R0\u0010(\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060%j\u0002`&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001f0\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001eR \u0010.\u001a\u000e\u0012\n\b\u0001\u0012\u00060*j\u0002`+0)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/di/HotelsPageHeaderComponent;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/data/HotelsPageHeaderDTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderVO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsPageHeader/presentation/HotelsPageHeaderWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "getMapper", "mapper", "LPc/a;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "getViewModelWidgetProvider", "()LPc/a;", "viewModelWidgetProvider", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HotelsPageHeaderViewMapper extends WidgetViewMapper2<HotelsPageHeaderComponent, HotelsPageHeaderDTO, HotelsPageHeaderVO> {
    private final int layout = R$layout.widget_hotels_page_header;

    @NotNull
    private final Function2<View, ComposerReferences, HotelsPageHeaderWidgetViewHolder> holderProducer = new HotelsPageHeaderViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(HotelsPageHeaderFullStateUpdate.class, HotelsPageHeaderPriceInfoUpdate.class);

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, HotelsPageHeaderWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<HotelsPageHeaderDTO, d, List<HotelsPageHeaderVO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Pc.a<? extends InterfaceC6786a> getViewModelWidgetProvider() {
        return component().getWidgetViewModelProvider();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<HotelsPageHeaderComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return HotelsPageHeaderComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public HotelsPageHeaderVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull HotelsPageHeaderVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof HotelsPageHeaderPriceInfoUpdate) {
            return HotelsPageHeaderVO.copy$default(oldItem, 0L, HotelsPageHeaderVO.StateWrapper.copy$default(oldItem.getStateWrapper(), ((HotelsPageHeaderPriceInfoUpdate) update).getPriceInfo(), null, false, false, null, null, null, false, 254, null), 0, null, 13, null);
        }
        if (update instanceof HotelsPageHeaderFullStateUpdate) {
            return HotelsPageHeaderVO.copy$default(oldItem, 0L, ((HotelsPageHeaderFullStateUpdate) update).getStateWrapper(), 0, null, 13, null);
        }
        return null;
    }
}
