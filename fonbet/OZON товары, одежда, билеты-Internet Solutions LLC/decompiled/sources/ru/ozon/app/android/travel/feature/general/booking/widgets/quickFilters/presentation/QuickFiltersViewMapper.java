package ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation;

import A00.a;
import Cn.C2782a;
import Pc.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import h20.InterfaceC6786a;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.data.QuickFiltersDTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.di.QuickFiltersComponent;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.QuickFiltersAsyncActionViewModel;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.QuickFiltersViewMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.view.QuickFiltersView;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R,\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R,\u0010'\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001e0\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001dR \u0010-\u001a\u000e\u0012\n\b\u0001\u0012\u00060)j\u0002`*0(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/di/QuickFiltersComponent;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersUpdate;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Ll20/d;", "getMapper", "mapper", "LPc/a;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "getViewModelWidgetProvider", "()LPc/a;", "viewModelWidgetProvider", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class QuickFiltersViewMapper extends WidgetViewMapper2<QuickFiltersComponent, QuickFiltersDTO, QuickFiltersVO> {

    @NotNull
    private final Function2<View, ComposerReferences, QuickFiltersWidgetViewHolder> holderProducer = new QuickFiltersViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<QuickFiltersUpdate>> supportedUpdates = C7714v.a0(QuickFiltersUpdate.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final QuickFiltersAsyncActionViewModel _get_viewModelWidgetProvider_$lambda$0(QuickFiltersViewMapper quickFiltersViewMapper) {
        return quickFiltersViewMapper.component().getAsyncActionWidgetViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QuickFiltersComponent widgetComponent$lambda$1(C7475g c7475g) {
        return new QuickFiltersComponent(c7475g);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new QuickFiltersView(context);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, QuickFiltersWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<QuickFiltersDTO, d, List<QuickFiltersVO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<QuickFiltersUpdate>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public a<? extends InterfaceC6786a> getViewModelWidgetProvider() {
        return new a() { // from class: SN.a
            @Override // Pc.a
            public final Object get() {
                QuickFiltersAsyncActionViewModel _get_viewModelWidgetProvider_$lambda$0;
                _get_viewModelWidgetProvider_$lambda$0 = QuickFiltersViewMapper._get_viewModelWidgetProvider_$lambda$0(QuickFiltersViewMapper.this);
                return _get_viewModelWidgetProvider_$lambda$0;
            }
        };
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<QuickFiltersComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(QuickFiltersComponent.class), new C2782a(storage, 9));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public QuickFiltersVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull QuickFiltersVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof QuickFiltersUpdate) {
            return QuickFiltersVO.copy$default(oldItem, 0L, ((QuickFiltersUpdate) update).getState(), 1, null);
        }
        return null;
    }
}
