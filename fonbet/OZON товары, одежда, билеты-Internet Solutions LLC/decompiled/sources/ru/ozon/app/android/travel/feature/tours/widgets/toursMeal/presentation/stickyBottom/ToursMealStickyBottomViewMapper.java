package ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.presentation.stickyBottom;

import A00.a;
import OT.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import c20.r;
import d20.AbstractC6065b;
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
import ru.ozon.app.android.travel.feature.tours.widgets.toursMeal.updateKeys.ToursMealSelectUpdateKey;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\n\u001a\u00020\u0004*\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\f\u001a\u00020\u00032\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020 2\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001eH\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010$\u001a\u00020#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R&\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0(0\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/stickyBottom/ToursMealStickyBottomViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/di/ToursMealComponent;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/data/ToursMealDTO;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/stickyBottom/ToursMealStickyBottomVO;", "<init>", "()V", "", "selectLink", "selectButtonTitle", "consumeSelection", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/stickyBottom/ToursMealStickyBottomVO;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/stickyBottom/ToursMealStickyBottomVO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/data/ToursMealDTO;Ll20/d;)Ljava/util/List;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/stickyBottom/ToursMealStickyBottomVO;)Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/presentation/stickyBottom/ToursMealStickyBottomVO;", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "Lru/ozon/app/android/travel/feature/tours/widgets/toursMeal/updateKeys/ToursMealSelectUpdateKey;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ToursMealStickyBottomViewMapper extends OverlayWidgetScreenViewItemMapper2<ToursMealComponent, ToursMealDTO, ToursMealStickyBottomVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @NotNull
    private final List<Class<ToursMealSelectUpdateKey>> supportedUpdates = C7714v.a0(ToursMealSelectUpdateKey.class);

    private final ToursMealStickyBottomVO consumeSelection(ToursMealStickyBottomVO toursMealStickyBottomVO, String str, String str2) {
        ButtonV3Atom.LargeButton selectButton = toursMealStickyBottomVO.getSelectButton();
        OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(str2 == null ? "" : str2);
        AtomActionDTO action = toursMealStickyBottomVO.getSelectButton().getAction();
        return ToursMealStickyBottomVO.copy$default(toursMealStickyBottomVO, 0L, ButtonV3Atom.LargeButton.copy$default(selectButton, ozonSpannableString, null, null, null, null, action != null ? AtomActionDTO.copy$default(action, null, str, null, null, null, 29, null) : null, null, null, null, 478, null), null, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createHolder$lambda$3(i iVar, LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ToursMealStickyBottomView toursMealStickyBottomView = new ToursMealStickyBottomView(context, null, 0, 0, 14, null);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        Context L11 = iVar.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        marginLayoutParams.topMargin = ResourceExtKt.toPx(16, L11);
        toursMealStickyBottomView.setLayoutParams(marginLayoutParams);
        return toursMealStickyBottomView;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<ToursMealStickyBottomVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new ToursMealStickyBottomWidgetViewHolder(container, new a(0, container));
    }

    @Override // c20.r, I00.d
    @NotNull
    public List<Class<ToursMealSelectUpdateKey>> getSupportedUpdates() {
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
    public ToursMealStickyBottomVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull ToursMealStickyBottomVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        ToursMealSelectUpdateKey toursMealSelectUpdateKey = update instanceof ToursMealSelectUpdateKey ? (ToursMealSelectUpdateKey) update : null;
        if (toursMealSelectUpdateKey != null) {
            return consumeSelection(oldItem, toursMealSelectUpdateKey.getSelectLink(), toursMealSelectUpdateKey.getSelectButtonTitle());
        }
        return null;
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<ToursMealStickyBottomVO> map(@NotNull ToursMealDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return component().getToursMealStickyBottomMapper().invoke(state, info);
    }
}
