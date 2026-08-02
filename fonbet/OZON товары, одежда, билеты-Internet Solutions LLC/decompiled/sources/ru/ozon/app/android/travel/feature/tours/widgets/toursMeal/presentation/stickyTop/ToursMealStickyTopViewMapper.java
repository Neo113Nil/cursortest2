package ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.presentation.stickyTop;

import A00.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import c20.r;
import d20.AbstractC6065b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.data.ToursMealDTO;
import ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.di.ToursMealComponent;
import ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.updateKeys.ToursMealApplyFilterUpdateKey;
import ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.updateKeys.ToursMealClearFilterUpdateKey;
import ru.ozon.app.android.travel.molecules.view.travelTab.v2.TravelTabVO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u0007\u001a\u00020\u00032\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R(\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0#0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/stickyTop/ToursMealStickyTopViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/di/ToursMealComponent;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/data/ToursMealDTO;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/stickyTop/ToursMealStickyTopVO;", "<init>", "()V", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/data/ToursMealDTO;Ll20/d;)Ljava/util/List;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/stickyTop/ToursMealStickyTopVO;)Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/stickyTop/ToursMealStickyTopVO;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ToursMealStickyTopViewMapper extends OverlayWidgetScreenViewItemMapper2<ToursMealComponent, ToursMealDTO, ToursMealStickyTopVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(ToursMealApplyFilterUpdateKey.class, ToursMealClearFilterUpdateKey.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$3(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ToursMealStickyTopView toursMealStickyTopView = new ToursMealStickyTopView(context, null, 0, 0, 14, null);
        toursMealStickyTopView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Context context2 = toursMealStickyTopView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        toursMealStickyTopView.setBackgroundColor(ThemeExtKt.themeColor(context2, R$attr.layerFloor1));
        return toursMealStickyTopView;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<ToursMealStickyTopVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new ToursMealStickyTopWidgetViewHolder(container, new DQ.a(1));
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<ToursMealComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return ToursMealComponent.INSTANCE.create(storage);
    }

    @Override // c20.r, I00.d
    public ToursMealStickyTopVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull ToursMealStickyTopVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        int i11 = 0;
        if (update instanceof ToursMealApplyFilterUpdateKey) {
            ToursMealApplyFilterUpdateKey toursMealApplyFilterUpdateKey = (ToursMealApplyFilterUpdateKey) update;
            Integer composerHeight = toursMealApplyFilterUpdateKey.getComposerHeight();
            Iterator<TravelTabVO> it = oldItem.getFilterTabs().iterator();
            int i12 = -1;
            int i13 = -1;
            while (it.hasNext() && (i12 == -1 || i13 == -1)) {
                TravelTabVO next = it.next();
                if (i12 == -1 && next.getIsSelected()) {
                    i12 = i11;
                }
                if (i13 == -1) {
                    AtomAction action = next.getAction();
                    if (Intrinsics.d(action != null ? action.getId() : null, "applyFilter")) {
                        AtomAction action2 = next.getAction();
                        AtomAction.Click click = action2 instanceof AtomAction.Click ? (AtomAction.Click) action2 : null;
                        if (Intrinsics.d(click != null ? click.getLink() : null, toursMealApplyFilterUpdateKey.getFilterKey())) {
                            i13 = i11;
                        }
                    }
                }
                i11++;
            }
            if (i12 >= 0 && i13 >= 0 && i12 != i13) {
                ArrayList W02 = C7714v.W0(oldItem.getFilterTabs());
                W02.set(i12, TravelTabVO.copy$default((TravelTabVO) W02.get(i12), 0, null, false, null, null, null, null, null, 251, null));
                W02.set(i13, TravelTabVO.copy$default((TravelTabVO) W02.get(i13), 0, null, true, null, null, null, null, null, 251, null));
                Integer fixedComposerHeight = oldItem.getFixedComposerHeight();
                return ToursMealStickyTopVO.copy$default(oldItem, 0L, null, null, W02, false, null, fixedComposerHeight == null ? composerHeight : fixedComposerHeight, 55, null);
            }
        } else if (update instanceof ToursMealClearFilterUpdateKey) {
            Iterator<TravelTabVO> it2 = oldItem.getFilterTabs().iterator();
            int i14 = -1;
            int i15 = -1;
            while (it2.hasNext() && (i14 == -1 || i15 == -1)) {
                TravelTabVO next2 = it2.next();
                if (i14 == -1 && next2.getIsSelected()) {
                    i14 = i11;
                }
                if (i15 == -1) {
                    AtomAction action3 = next2.getAction();
                    if (Intrinsics.d(action3 != null ? action3.getId() : null, "clearFilter")) {
                        i15 = i11;
                    }
                }
                i11++;
            }
            if (i14 >= 0 && i15 >= 0 && i14 != i15) {
                ArrayList W03 = C7714v.W0(oldItem.getFilterTabs());
                W03.set(i14, TravelTabVO.copy$default((TravelTabVO) W03.get(i14), 0, null, false, null, null, null, null, null, 251, null));
                W03.set(i15, TravelTabVO.copy$default((TravelTabVO) W03.get(i15), 0, null, true, null, null, null, null, null, 251, null));
                Integer fixedComposerHeight2 = oldItem.getFixedComposerHeight();
                return ToursMealStickyTopVO.copy$default(oldItem, 0L, null, null, W03, false, null, fixedComposerHeight2 == null ? null : fixedComposerHeight2, 55, null);
            }
        }
        return null;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<ToursMealStickyTopVO> map(@NotNull ToursMealDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getToursMealStickyTopMapper().invoke(state, info);
    }
}
