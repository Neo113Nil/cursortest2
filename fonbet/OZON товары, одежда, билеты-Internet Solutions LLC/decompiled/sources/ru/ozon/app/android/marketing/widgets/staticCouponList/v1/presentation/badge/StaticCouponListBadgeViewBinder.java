package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.badge;

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
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\fH\u0014J,\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0014J\u0012\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0018H\u0002J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0018H\u0002J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/badge/StaticCouponListBadgeViewBinder;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/adapter/StaticCouponListContentViewBinder;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/badge/StaticCouponListBadgeView;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "bindTyped", "", "item", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "payload", "", "bindLiftIcon", "leftIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "bindBgColor", "bgColor", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground;", "bindStaticText", "textItem", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge$Text;", "bindTimerText", "timerItem", "bindTimerStyle", "bindTimer", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StaticCouponListBadgeViewBinder extends StaticCouponListContentViewBinder<StaticCouponListVO.ContentItem.Badge, StaticCouponListBadgeView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticCouponListBadgeViewBinder(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    private final void bindBgColor(StaticCouponListBackground bgColor) {
        getCurrentView().bindBgColor(bgColor);
    }

    private final void bindLiftIcon(IconDTO leftIcon) {
        getCurrentView().bindLiftIcon(leftIcon);
    }

    private final void bindStaticText(StaticCouponListVO.ContentItem.Badge.Text textItem) {
        if (textItem instanceof StaticCouponListVO.ContentItem.Badge.Text.Static) {
            getCurrentView().bindStaticText((StaticCouponListVO.ContentItem.Badge.Text.Static) textItem);
        }
    }

    private final void bindTimer(StaticCouponListVO.ContentItem.Badge.Text timerItem) {
        if (timerItem instanceof StaticCouponListVO.ContentItem.Badge.Text.Timer) {
            getCurrentView().bindTimer((StaticCouponListVO.ContentItem.Badge.Text.Timer) timerItem);
        }
    }

    private final void bindTimerStyle(StaticCouponListVO.ContentItem.Badge.Text timerItem) {
        if (timerItem instanceof StaticCouponListVO.ContentItem.Badge.Text.Timer) {
            getCurrentView().bindTimerStyle((StaticCouponListVO.ContentItem.Badge.Text.Timer) timerItem);
        }
    }

    private final void bindTimerText(StaticCouponListVO.ContentItem.Badge.Text timerItem) {
        if (timerItem instanceof StaticCouponListVO.ContentItem.Badge.Text.Timer) {
            getCurrentView().bindTimerText((StaticCouponListVO.ContentItem.Badge.Text.Timer) timerItem);
        }
    }

    @Override // ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter.StaticCouponListContentViewBinder
    public /* bridge */ /* synthetic */ void bindTyped(StaticCouponListVO.ContentItem.Badge badge, Function1 function1) {
        bindTyped2(badge, (Function1<? super AtomAction, Unit>) function1);
    }

    @Override // ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter.StaticCouponListContentViewBinder
    public /* bridge */ /* synthetic */ void bindTyped(StaticCouponListVO.ContentItem.Badge badge, Function1 function1, Object obj) {
        bindTyped2(badge, (Function1<? super AtomAction, Unit>) function1, obj);
    }

    /* renamed from: bindTyped, reason: avoid collision after fix types in other method */
    protected void bindTyped2(@NotNull StaticCouponListVO.ContentItem.Badge item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        getCurrentView().bind(item);
    }

    /* renamed from: bindTyped, reason: avoid collision after fix types in other method */
    protected void bindTyped2(@NotNull StaticCouponListVO.ContentItem.Badge item, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (!(payload instanceof List)) {
            super.bindTyped((StaticCouponListBadgeViewBinder) item, actionHandler, payload);
            return;
        }
        for (Object obj : (Iterable) payload) {
            if (obj == StaticCouponListContentPayload.BADGE_LEFT_ICON) {
                bindLiftIcon(item.getLeftIcon());
            } else if (obj == StaticCouponListContentPayload.BADGE_BG_COLOR) {
                bindBgColor(item.getBgColor());
            } else if (obj == StaticCouponListContentPayload.BADGE_STATIC_TEXT) {
                bindStaticText(item.getText());
            } else if (obj == StaticCouponListContentPayload.BADGE_TIMER_TEXT) {
                bindTimerText(item.getText());
            } else if (obj == StaticCouponListContentPayload.BADGE_TIMER_STYLE) {
                bindTimerStyle(item.getText());
            } else if (obj == StaticCouponListContentPayload.BADGE_SALE_TIMER) {
                bindTimer(item.getText());
            }
        }
    }
}
