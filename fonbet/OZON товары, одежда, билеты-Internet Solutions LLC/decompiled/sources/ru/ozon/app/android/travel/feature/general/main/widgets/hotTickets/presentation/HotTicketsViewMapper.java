package ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.presentation;

import A00.a;
import Pc.a;
import android.view.View;
import android.view.ViewGroup;
import gk0.q;
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
import ru.ozon.app.android.travel.feature.general.main.R$layout;
import ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.data.HotTicketsDTO;
import ru.ozon.app.android.travel.feature.general.main.widgets.hotTickets.di.HotTicketsComponent;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u000fj\b\u0012\u0004\u0012\u00020\u0002`\u00102\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R&\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR<\u0010#\u001a$\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020 \u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040!j\b\u0012\u0004\u0012\u00020\u0004`\"0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00020(0'8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R0\u0010/\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060,j\u0002`-\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00180\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010&¨\u00060"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/di/HotTicketsComponent;", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/data/HotTicketsDTO;", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsVO;)Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsVO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsUpdateEvent;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "LPc/a;", "Lru/ozon/app/android/travel/feature/general/main/widgets/hotTickets/presentation/HotTicketsWidgetViewModel;", "getViewModelWidgetProvider", "()LPc/a;", "viewModelWidgetProvider", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "getMapper", "mapper", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HotTicketsViewMapper extends WidgetViewMapper2<HotTicketsComponent, HotTicketsDTO, HotTicketsVO> {

    @NotNull
    private final List<Class<HotTicketsUpdateEvent>> supportedUpdates = C7714v.a0(HotTicketsUpdateEvent.class);

    @NotNull
    private final Function2<View, ComposerReferences, k<HotTicketsVO>> holderProducer = new HotTicketsViewMapper$holderProducer$1(this);

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View h11 = q.f64554a.h(R$layout.widget_hot_tickets);
        return h11 == null ? ViewGroupExtKt.inflate(parent, R$layout.widget_hot_tickets) : h11;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<HotTicketsVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<HotTicketsDTO, d, List<HotTicketsVO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<HotTicketsUpdateEvent>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public a<? extends HotTicketsWidgetViewModel> getViewModelWidgetProvider() {
        return component().getViewModelProvider();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<HotTicketsComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return HotTicketsComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public HotTicketsVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull HotTicketsVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof HotTicketsUpdateEvent) {
            return HotTicketsVO.copy$default(oldItem, 0L, ((HotTicketsUpdateEvent) update).getNewState(), null, 5, null);
        }
        return null;
    }
}
