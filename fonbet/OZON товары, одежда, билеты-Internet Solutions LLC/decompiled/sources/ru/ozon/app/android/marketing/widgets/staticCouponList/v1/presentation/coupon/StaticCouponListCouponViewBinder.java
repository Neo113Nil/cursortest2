package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.coupon;

import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListBackground;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListVO;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter.StaticCouponListContentPayload;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter.StaticCouponListContentViewBinder;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\fH\u0014J,\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u0012\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0002J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002J\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020 H\u0002J$\u0010\"\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\fH\u0002¨\u0006#"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/coupon/StaticCouponListCouponViewBinder;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/adapter/StaticCouponListContentViewBinder;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Coupon;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/coupon/StaticCouponListCouponView;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "bindTyped", "", "item", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "payload", "", "bindLeftIcon", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "bindBgColor", "bgColor", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground;", "bindIsApplied", "bindIsAppliedAnimated", "bindChevron", "bindTitle", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "bindSubtitle", "subtitle", "bindStubText", "stub", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Coupon$Stub;", "bindStubColor", "setClickListeners", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StaticCouponListCouponViewBinder extends StaticCouponListContentViewBinder<StaticCouponListVO.ContentItem.Coupon, StaticCouponListCouponView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticCouponListCouponViewBinder(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    private final void bindBgColor(StaticCouponListBackground bgColor) {
        getCurrentView().bindBgColor(bgColor);
    }

    private final void bindChevron(IconDTO icon) {
        getCurrentView().bindChevron(icon);
    }

    private final void bindIsApplied(StaticCouponListVO.ContentItem.Coupon item) {
        getCurrentView().bindIsApplied(item);
    }

    private final void bindIsAppliedAnimated(StaticCouponListVO.ContentItem.Coupon item) {
        getCurrentView().bindIsAppliedAnimated(item);
    }

    private final void bindLeftIcon(IconDTO icon) {
        getCurrentView().bindLeftIcon(icon);
    }

    private final void bindStubColor(StaticCouponListVO.ContentItem.Coupon.Stub stub) {
        getCurrentView().bindStubColor(stub);
    }

    private final void bindStubText(StaticCouponListVO.ContentItem.Coupon.Stub stub) {
        getCurrentView().bindStubText(stub);
    }

    private final void bindSubtitle(TextDTO subtitle) {
        getCurrentView().bindSubtitle(subtitle);
    }

    private final void bindTitle(TextDTO title) {
        getCurrentView().bindTitle(title);
    }

    private final void setClickListeners(StaticCouponListVO.ContentItem.Coupon item, Function1<? super AtomAction, Unit> actionHandler) {
        getCurrentView().setOnCuponClickListener(new StaticCouponListCouponViewBinder$setClickListeners$1(item, actionHandler));
        getCurrentView().setOnStubClickListener(new StaticCouponListCouponViewBinder$setClickListeners$2(item, actionHandler));
    }

    @Override // ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter.StaticCouponListContentViewBinder
    public /* bridge */ /* synthetic */ void bindTyped(StaticCouponListVO.ContentItem.Coupon coupon, Function1 function1) {
        bindTyped2(coupon, (Function1<? super AtomAction, Unit>) function1);
    }

    @Override // ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter.StaticCouponListContentViewBinder
    public /* bridge */ /* synthetic */ void bindTyped(StaticCouponListVO.ContentItem.Coupon coupon, Function1 function1, Object obj) {
        bindTyped2(coupon, (Function1<? super AtomAction, Unit>) function1, obj);
    }

    /* renamed from: bindTyped, reason: avoid collision after fix types in other method */
    protected void bindTyped2(@NotNull StaticCouponListVO.ContentItem.Coupon item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        getCurrentView().bind(item);
        setClickListeners(item, actionHandler);
    }

    /* renamed from: bindTyped, reason: avoid collision after fix types in other method */
    protected void bindTyped2(@NotNull StaticCouponListVO.ContentItem.Coupon item, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (!(payload instanceof List)) {
            super.bindTyped((StaticCouponListCouponViewBinder) item, actionHandler, payload);
            return;
        }
        setClickListeners(item, actionHandler);
        for (Object obj : (Iterable) payload) {
            if (obj == StaticCouponListContentPayload.COUPON_LEFT_ICON) {
                bindLeftIcon(item.getLeftIcon());
            } else if (obj == StaticCouponListContentPayload.COUPON_BG_COLOR) {
                bindBgColor(item.getBg());
            } else if (obj == StaticCouponListContentPayload.COUPON_IS_APPLIED) {
                bindIsApplied(item);
            } else if (obj == StaticCouponListContentPayload.COUPON_CHEVRON) {
                bindChevron(item.getChevron());
            } else if (obj == StaticCouponListContentPayload.COUPON_TITLE) {
                bindTitle(item.getTitle());
            } else if (obj == StaticCouponListContentPayload.COUPON_SUBTITLE) {
                bindSubtitle(item.getSubtitle());
            } else if (obj == StaticCouponListContentPayload.COUPON_STUB_TEXT) {
                bindStubText(item.getStub());
            } else if (obj == StaticCouponListContentPayload.COUPON_STUB_BG_COLOR) {
                bindStubColor(item.getStub());
            } else if (obj == StaticCouponListContentPayload.COUPON_STUB_ANIMATION) {
                bindIsAppliedAnimated(item);
            }
        }
    }
}
