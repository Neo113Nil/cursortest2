package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.presentation;

import A00.a;
import Bl.b;
import Pc.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import gk0.q;
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
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.data.HotelsHorizontalShelvesDTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.di.HotelsHorizontalShelvesComponent;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.presentation.HotelsHorizontalShelvesVO;
import ru.ozon.app.android.travel.feature.hotels.widgets.hotelsHorizontalShelves.view.HotelsHorizontalShelvesView;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00182\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR,\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R&\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R,\u0010+\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\"0\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010!R\u001c\u00100\u001a\n\u0012\u0006\b\u0001\u0012\u00020-0,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/di/HotelsHorizontalShelvesComponent;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/data/HotelsHorizontalShelvesDTO;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO;", "<init>", "()V", "oldItem", "newItem", "", "getPayload", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO;)Ljava/lang/Object;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "LA00/a$J$a;", "update", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesVO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesWidgetViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsHorizontalShelves/presentation/HotelsHorizontalShelvesUpdate;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Ll20/d;", "getMapper", "mapper", "LPc/a;", "Lh20/a;", "getViewModelWidgetProvider", "()LPc/a;", "viewModelWidgetProvider", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HotelsHorizontalShelvesViewMapper extends WidgetViewMapper2<HotelsHorizontalShelvesComponent, HotelsHorizontalShelvesDTO, HotelsHorizontalShelvesVO> {

    @NotNull
    private final Function2<View, ComposerReferences, HotelsHorizontalShelvesWidgetViewHolder> holderProducer = new HotelsHorizontalShelvesViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<HotelsHorizontalShelvesUpdate>> supportedUpdates = C7714v.a0(HotelsHorizontalShelvesUpdate.class);

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        HotelsHorizontalShelvesView hotelsHorizontalShelvesView = (HotelsHorizontalShelvesView) b.a(HotelsHorizontalShelvesView.class, "type", q.f64554a, null);
        if (hotelsHorizontalShelvesView == null) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            hotelsHorizontalShelvesView = new HotelsHorizontalShelvesView(context);
        }
        hotelsHorizontalShelvesView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return hotelsHorizontalShelvesView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, HotelsHorizontalShelvesWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<HotelsHorizontalShelvesDTO, d, List<HotelsHorizontalShelvesVO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<HotelsHorizontalShelvesUpdate>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public a<? extends InterfaceC6786a> getViewModelWidgetProvider() {
        return component().getWidgetViewModelProvider();
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<HotelsHorizontalShelvesComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return HotelsHorizontalShelvesComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Object getPayload(@NotNull HotelsHorizontalShelvesVO oldItem, @NotNull HotelsHorizontalShelvesVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        if (!(oldItem.getState() instanceof HotelsHorizontalShelvesVO.Loaded) || !(newItem.getState() instanceof HotelsHorizontalShelvesVO.Loaded)) {
            return null;
        }
        HotelsHorizontalShelvesPayload hotelsHorizontalShelvesPayload = new HotelsHorizontalShelvesPayload();
        if (!Intrinsics.d(((HotelsHorizontalShelvesVO.Loaded) oldItem.getState()).getTitle(), ((HotelsHorizontalShelvesVO.Loaded) newItem.getState()).getTitle())) {
            hotelsHorizontalShelvesPayload.setTitleChanged();
        }
        if (!Intrinsics.d(((HotelsHorizontalShelvesVO.Loaded) oldItem.getState()).getSubtitle(), ((HotelsHorizontalShelvesVO.Loaded) newItem.getState()).getSubtitle())) {
            hotelsHorizontalShelvesPayload.setSubtitleChanged();
        }
        if (!Intrinsics.d(((HotelsHorizontalShelvesVO.Loaded) oldItem.getState()).getBackgroundImage(), ((HotelsHorizontalShelvesVO.Loaded) newItem.getState()).getBackgroundImage()) || !Intrinsics.d(((HotelsHorizontalShelvesVO.Loaded) oldItem.getState()).getBackgroundToken(), ((HotelsHorizontalShelvesVO.Loaded) newItem.getState()).getBackgroundToken()) || !Intrinsics.d(((HotelsHorizontalShelvesVO.Loaded) oldItem.getState()).getBackgroundGradient(), ((HotelsHorizontalShelvesVO.Loaded) newItem.getState()).getBackgroundGradient()) || ((HotelsHorizontalShelvesVO.Loaded) oldItem.getState()).getCornerRadius() != ((HotelsHorizontalShelvesVO.Loaded) newItem.getState()).getCornerRadius()) {
            hotelsHorizontalShelvesPayload.setBackgroundChanged();
        }
        if (!Intrinsics.d(((HotelsHorizontalShelvesVO.Loaded) oldItem.getState()).getCardOptions(), ((HotelsHorizontalShelvesVO.Loaded) newItem.getState()).getCardOptions()) || ((HotelsHorizontalShelvesVO.Loaded) oldItem.getState()).getCardsOnScreen() != ((HotelsHorizontalShelvesVO.Loaded) newItem.getState()).getCardsOnScreen() || !Intrinsics.d(((HotelsHorizontalShelvesVO.Loaded) oldItem.getState()).getCards(), ((HotelsHorizontalShelvesVO.Loaded) newItem.getState()).getCards())) {
            hotelsHorizontalShelvesPayload.setCardsChanged();
        }
        if (((HotelsHorizontalShelvesVO.Loaded) oldItem.getState()).getCardsTopMargin() != ((HotelsHorizontalShelvesVO.Loaded) newItem.getState()).getCardsTopMargin()) {
            hotelsHorizontalShelvesPayload.setCardsTopMarginChanged();
        }
        if (!Intrinsics.d(((HotelsHorizontalShelvesVO.Loaded) oldItem.getState()).getAtomAction(), ((HotelsHorizontalShelvesVO.Loaded) newItem.getState()).getAtomAction())) {
            hotelsHorizontalShelvesPayload.setActionChanged();
        }
        return hotelsHorizontalShelvesPayload;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    public HotelsHorizontalShelvesVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull HotelsHorizontalShelvesVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof HotelsHorizontalShelvesUpdate)) {
            return null;
        }
        HotelsHorizontalShelvesUpdate hotelsHorizontalShelvesUpdate = (HotelsHorizontalShelvesUpdate) update;
        Long widgetId = hotelsHorizontalShelvesUpdate.getWidgetId();
        long id2 = oldItem.getId();
        if (widgetId != null && widgetId.longValue() == id2) {
            return HotelsHorizontalShelvesVO.copy$default(oldItem, 0L, hotelsHorizontalShelvesUpdate.getNewState(), 1, null);
        }
        return null;
    }
}
