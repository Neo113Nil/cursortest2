package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter;

import Tc.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListVO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u000bH\u0002J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\fH\u0002¨\u0006\r"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/adapter/StaticCouponListContentPayloadManager;", "", "<init>", "()V", "getChangePayload", "", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/adapter/StaticCouponListContentPayload;", "oldItem", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem;", "newItem", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Creative;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Coupon;", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StaticCouponListContentPayloadManager {
    @NotNull
    public final List<StaticCouponListContentPayload> getChangePayload(@NotNull StaticCouponListVO.ContentItem oldItem, @NotNull StaticCouponListVO.ContentItem newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        b builder = C7714v.B();
        if ((oldItem instanceof StaticCouponListVO.ContentItem.Badge) && (newItem instanceof StaticCouponListVO.ContentItem.Badge)) {
            builder.addAll(getChangePayload((StaticCouponListVO.ContentItem.Badge) oldItem, (StaticCouponListVO.ContentItem.Badge) newItem));
        }
        if ((oldItem instanceof StaticCouponListVO.ContentItem.Creative) && (newItem instanceof StaticCouponListVO.ContentItem.Creative)) {
            builder.addAll(getChangePayload((StaticCouponListVO.ContentItem.Creative) oldItem, (StaticCouponListVO.ContentItem.Creative) newItem));
        }
        if ((oldItem instanceof StaticCouponListVO.ContentItem.Coupon) && (newItem instanceof StaticCouponListVO.ContentItem.Coupon)) {
            builder.addAll(getChangePayload((StaticCouponListVO.ContentItem.Coupon) oldItem, (StaticCouponListVO.ContentItem.Coupon) newItem));
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }

    private final List<StaticCouponListContentPayload> getChangePayload(StaticCouponListVO.ContentItem.Badge oldItem, StaticCouponListVO.ContentItem.Badge newItem) {
        b builder = C7714v.B();
        if (!Intrinsics.d(oldItem.getLeftIcon(), newItem.getLeftIcon())) {
            builder.add(StaticCouponListContentPayload.BADGE_LEFT_ICON);
        }
        if (!Intrinsics.d(oldItem.getBgColor(), newItem.getBgColor())) {
            builder.add(StaticCouponListContentPayload.BADGE_BG_COLOR);
        }
        if ((oldItem.getText() instanceof StaticCouponListVO.ContentItem.Badge.Text.Static) && (newItem.getText() instanceof StaticCouponListVO.ContentItem.Badge.Text.Static)) {
            if (!Intrinsics.d(oldItem.getText(), newItem.getText())) {
                builder.add(StaticCouponListContentPayload.BADGE_STATIC_TEXT);
            }
        } else if ((oldItem.getText() instanceof StaticCouponListVO.ContentItem.Badge.Text.Timer) && (newItem.getText() instanceof StaticCouponListVO.ContentItem.Badge.Text.Timer)) {
            if (!Intrinsics.d(((StaticCouponListVO.ContentItem.Badge.Text.Timer) oldItem.getText()).getPostSaleText(), ((StaticCouponListVO.ContentItem.Badge.Text.Timer) newItem.getText()).getPostSaleText()) || !Intrinsics.d(((StaticCouponListVO.ContentItem.Badge.Text.Timer) oldItem.getText()).getPreSaleText(), ((StaticCouponListVO.ContentItem.Badge.Text.Timer) newItem.getText()).getPreSaleText()) || !Intrinsics.d(((StaticCouponListVO.ContentItem.Badge.Text.Timer) oldItem.getText()).getSaleActiveText(), ((StaticCouponListVO.ContentItem.Badge.Text.Timer) newItem.getText()).getSaleActiveText())) {
                builder.add(StaticCouponListContentPayload.BADGE_TIMER_TEXT);
            }
            if (!Intrinsics.d(((StaticCouponListVO.ContentItem.Badge.Text.Timer) oldItem.getText()).getTimerColorToken(), ((StaticCouponListVO.ContentItem.Badge.Text.Timer) newItem.getText()).getTimerColorToken()) || !Intrinsics.d(((StaticCouponListVO.ContentItem.Badge.Text.Timer) oldItem.getText()).getTimerStyleToken(), ((StaticCouponListVO.ContentItem.Badge.Text.Timer) newItem.getText()).getTimerStyleToken())) {
                builder.add(StaticCouponListContentPayload.BADGE_TIMER_STYLE);
            }
            if (!Intrinsics.d(((StaticCouponListVO.ContentItem.Badge.Text.Timer) oldItem.getText()).getSaleId(), ((StaticCouponListVO.ContentItem.Badge.Text.Timer) newItem.getText()).getSaleId()) || !Intrinsics.d(((StaticCouponListVO.ContentItem.Badge.Text.Timer) oldItem.getText()).getWordDeclension(), ((StaticCouponListVO.ContentItem.Badge.Text.Timer) newItem.getText()).getWordDeclension())) {
                builder.add(StaticCouponListContentPayload.BADGE_SALE_TIMER);
            }
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }

    private final List<StaticCouponListContentPayload> getChangePayload(StaticCouponListVO.ContentItem.Creative oldItem, StaticCouponListVO.ContentItem.Creative newItem) {
        return !Intrinsics.d(oldItem.getCreativeImage(), newItem.getCreativeImage()) ? C7714v.a0(StaticCouponListContentPayload.CREATIVE) : K.f71697a;
    }

    private final List<StaticCouponListContentPayload> getChangePayload(StaticCouponListVO.ContentItem.Coupon oldItem, StaticCouponListVO.ContentItem.Coupon newItem) {
        b builder = C7714v.B();
        if (oldItem.getIsApplied() != newItem.getIsApplied() && !newItem.getNeedAnimateTear()) {
            builder.add(StaticCouponListContentPayload.COUPON_IS_APPLIED);
        }
        if (newItem.getNeedAnimateTear() && newItem.getIsApplied()) {
            builder.add(StaticCouponListContentPayload.COUPON_STUB_ANIMATION);
        }
        if (!Intrinsics.d(oldItem.getBg(), newItem.getBg())) {
            builder.add(StaticCouponListContentPayload.COUPON_BG_COLOR);
        }
        if (!Intrinsics.d(oldItem.getLeftIcon(), newItem.getLeftIcon())) {
            builder.add(StaticCouponListContentPayload.COUPON_LEFT_ICON);
        }
        if (!Intrinsics.d(oldItem.getChevron(), newItem.getChevron())) {
            builder.add(StaticCouponListContentPayload.COUPON_CHEVRON);
        }
        if (!Intrinsics.d(oldItem.getTitle(), newItem.getTitle())) {
            builder.add(StaticCouponListContentPayload.COUPON_TITLE);
        }
        if (!Intrinsics.d(oldItem.getSubtitle(), newItem.getSubtitle())) {
            builder.add(StaticCouponListContentPayload.COUPON_SUBTITLE);
        }
        if (!Intrinsics.d(oldItem.getStub().getAppliedText(), newItem.getStub().getAppliedText()) || !Intrinsics.d(oldItem.getStub().getUnAppliedText(), newItem.getStub().getUnAppliedText())) {
            builder.add(StaticCouponListContentPayload.COUPON_STUB_TEXT);
        }
        if (!Intrinsics.d(oldItem.getStub().getUnappliedBg(), newItem.getStub().getUnappliedBg()) || !Intrinsics.d(oldItem.getStub().getAppliedBg(), newItem.getStub().getAppliedBg())) {
            builder.add(StaticCouponListContentPayload.COUPON_STUB_BG_COLOR);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }
}
