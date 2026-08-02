package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.button;

import A00.a;
import Bw.C2676a;
import Vg.d;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import c20.r;
import d20.AbstractC6065b;
import d20.InterfaceC6068e;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models.TravelRailwaySeatSelectFooterWrapper;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.di.TravelRailwaySeatSelectWithSchemeComponent;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.TravelRailwaySeatSelectWidgetViewModel;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.UpdateSeatSelect;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.button.TravelRailwaySeatSelectStickyButtonViewMapper;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.view.button.TravelRailwaySeatSelectStickyButtonViewKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0007\u001a\u00020\u00032\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001fj\b\u0012\u0004\u0012\u00020\u0002` 2\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001dH\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R&\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/button/TravelRailwaySeatSelectStickyButtonViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/di/TravelRailwaySeatSelectWithSchemeComponent;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectFooterWrapper;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/button/TravelRailwaySeatSelectStickyButtonVO;", "<init>", "()V", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TravelRailwaySeatSelectFooterWrapper;Ll20/d;)Ljava/util/List;", "", "", "canMap", "(Ljava/lang/Object;)Z", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/button/TravelRailwaySeatSelectStickyButtonVO;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/button/TravelRailwaySeatSelectStickyButtonVO;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/UpdateSeatSelect;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelRailwaySeatSelectStickyButtonViewMapper extends OverlayWidgetScreenViewItemMapper2<TravelRailwaySeatSelectWithSchemeComponent, TravelRailwaySeatSelectFooterWrapper, TravelRailwaySeatSelectStickyButtonVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @NotNull
    private final List<Class<UpdateSeatSelect>> supportedUpdates = C7714v.a0(UpdateSeatSelect.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$1(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return TravelRailwaySeatSelectStickyButtonViewKt.travelRailwaySeatSelectStickyButtonView(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TravelRailwaySeatSelectWithSchemeComponent widgetComponent$lambda$2(C7475g c7475g) {
        return new TravelRailwaySeatSelectWithSchemeComponent(c7475g);
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof TravelRailwaySeatSelectFooterWrapper;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<TravelRailwaySeatSelectStickyButtonVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        InterfaceC6068e interfaceC6068e = new InterfaceC6068e() { // from class: mT.a
            @Override // d20.InterfaceC6068e
            public final View create(ViewGroup viewGroup) {
                View createHolder$lambda$1;
                createHolder$lambda$1 = TravelRailwaySeatSelectStickyButtonViewMapper.createHolder$lambda$1((LinearLayout) viewGroup);
                return createHolder$lambda$1;
            }
        };
        d customActionHandlersStoreFactory = component().getCustomActionHandlersStoreFactory();
        TravelRailwaySeatSelectWidgetViewModel travelRailwaySeatSelectWidgetViewModel = component().getRailwaySeatSelectViewModelProvider().get();
        Intrinsics.checkNotNullExpressionValue(travelRailwaySeatSelectWidgetViewModel, "get(...)");
        return new TravelRailwaySeatSelectStickyButtonWidgetViewHolder(container, interfaceC6068e, customActionHandlersStoreFactory, travelRailwaySeatSelectWidgetViewModel);
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<UpdateSeatSelect>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<TravelRailwaySeatSelectWithSchemeComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(TravelRailwaySeatSelectWithSchemeComponent.class), new C2676a(storage, 8));
    }

    @Override // c20.r, I00.d
    public TravelRailwaySeatSelectStickyButtonVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull TravelRailwaySeatSelectStickyButtonVO oldItem) {
        ButtonV3Atom.LargeButton newButton;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        UpdateSeatSelect updateSeatSelect = update instanceof UpdateSeatSelect ? (UpdateSeatSelect) update : null;
        if (updateSeatSelect == null || (newButton = updateSeatSelect.getNewButton()) == null) {
            return null;
        }
        return TravelRailwaySeatSelectStickyButtonVO.copy$default(oldItem, 0L, newButton, 1, null);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<TravelRailwaySeatSelectStickyButtonVO> map(@NotNull TravelRailwaySeatSelectFooterWrapper state, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getButtonMapper().invoke(state, info);
    }
}
