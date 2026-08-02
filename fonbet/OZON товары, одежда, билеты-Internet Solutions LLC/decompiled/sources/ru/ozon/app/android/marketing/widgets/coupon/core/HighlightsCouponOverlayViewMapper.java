package ru.ozon.app.android.marketing.widgets.coupon.core;

import A00.a;
import c20.r;
import d20.AbstractC6065b;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import l10.e;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;
import ru.ozon.app.android.marketing.coupon.ActivateCouponActionHandler;
import ru.ozon.app.android.marketing.widgets.coupon.data.CouponDTO;
import ru.ozon.app.android.marketing.widgets.coupon.data.HighlightsMiniWidgetState;
import ru.ozon.app.android.marketing.widgets.coupon.di.CouponWidgetComponent;
import ru.ozon.app.android.marketing.widgets.coupon.presentation.CouponVO;
import ru.ozon.app.android.marketing.widgets.coupon.presentation.HighlightsCouponOverlayViewHolder;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.core.HighlightsWrapperCurrentMiniWidget;
import ru.ozon.app.android.marketing.widgets.highlightsWrapper.data.HighlightsCurrentMiniWidget;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001ej\b\u0012\u0004\u0012\u00020\u0002`\u001f2\n\u0010\u001d\u001a\u00060\u001bj\u0002`\u001cH\u0016¢\u0006\u0004\b \u0010!R\u001a\u0010#\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R(\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00160'0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/marketing/widgets/coupon/core/HighlightsCouponOverlayViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "Lru/ozon/app/android/marketing/widgets/coupon/di/CouponWidgetComponent;", "Lru/ozon/app/android/marketing/widgets/coupon/data/HighlightsMiniWidgetState;", "Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponVO;", "<init>", "()V", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/marketing/widgets/coupon/data/HighlightsMiniWidgetState;Ll20/d;)Ljava/util/List;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Ll10/i;", "container", "Ld20/b;", "createHolder", "(Ll10/i;)Ld20/b;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponVO;)Lru/ozon/app/android/marketing/widgets/coupon/presentation/CouponVO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HighlightsCouponOverlayViewMapper extends OverlayWidgetScreenViewItemMapper2<CouponWidgetComponent, HighlightsMiniWidgetState, CouponVO> {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.b0(CouponUpdateState.class, HighlightsWrapperCurrentMiniWidget.class);

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof HighlightsMiniWidgetState) && ((HighlightsMiniWidgetState) state).getCoupon() != null;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<CouponVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        e V11 = container.V();
        ComposerReferences composerReferences = V11 instanceof ComposerReferences ? (ComposerReferences) V11 : null;
        if (composerReferences != null) {
            return new HighlightsCouponOverlayViewHolder(container, new ActivateCouponActionHandler(composerReferences, component().getInteractor(), component().getCouponStorage()));
        }
        AbstractC6065b.INSTANCE.getClass();
        return AbstractC6065b.Companion.a();
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
    public C7473e<CouponWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return CouponWidgetComponent.INSTANCE.create(storage);
    }

    @Override // c20.r, I00.d
    public CouponVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull CouponVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(update instanceof CouponUpdateState)) {
            if (update instanceof HighlightsWrapperCurrentMiniWidget) {
                return CouponVO.copy$default(oldItem, 0L, null, null, null, null, null, null, null, ((HighlightsWrapperCurrentMiniWidget) update).getCurrentMiniWidget(), 255, null);
            }
            return null;
        }
        CouponDTO couponDto = ((CouponUpdateState) update).getCouponDto();
        if (couponDto == null) {
            return null;
        }
        CouponVO mapDto = component().getCouponMapper().mapDto(couponDto, oldItem.getId());
        HighlightsCurrentMiniWidget currentMiniWidget = mapDto.getCurrentMiniWidget();
        if (currentMiniWidget == null) {
            currentMiniWidget = oldItem.getCurrentMiniWidget();
        }
        return CouponVO.copy$default(mapDto, 0L, null, null, null, null, null, null, null, currentMiniWidget, 255, null);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<CouponVO> map(@NotNull HighlightsMiniWidgetState state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        CouponDTO coupon = state.getCoupon();
        if (coupon == null) {
            return K.f71697a;
        }
        coupon.setCurrentMiniWidget(state.getCurrentMiniWidget());
        return component().getCouponMapper().invoke(coupon, info);
    }
}
