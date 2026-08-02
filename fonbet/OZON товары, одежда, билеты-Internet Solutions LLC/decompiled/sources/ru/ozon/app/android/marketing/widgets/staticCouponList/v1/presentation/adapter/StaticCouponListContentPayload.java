package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0013\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/adapter/StaticCouponListContentPayload;", "", "<init>", "(Ljava/lang/String;I)V", "BADGE_LEFT_ICON", "BADGE_BG_COLOR", "BADGE_STATIC_TEXT", "BADGE_TIMER_TEXT", "BADGE_TIMER_STYLE", "BADGE_SALE_TIMER", "CREATIVE", "COUPON_LEFT_ICON", "COUPON_BG_COLOR", "COUPON_IS_APPLIED", "COUPON_CHEVRON", "COUPON_TITLE", "COUPON_SUBTITLE", "COUPON_STUB_TEXT", "COUPON_STUB_BG_COLOR", "COUPON_STUB_ANIMATION", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StaticCouponListContentPayload {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ StaticCouponListContentPayload[] $VALUES;
    public static final StaticCouponListContentPayload BADGE_LEFT_ICON = new StaticCouponListContentPayload("BADGE_LEFT_ICON", 0);
    public static final StaticCouponListContentPayload BADGE_BG_COLOR = new StaticCouponListContentPayload("BADGE_BG_COLOR", 1);
    public static final StaticCouponListContentPayload BADGE_STATIC_TEXT = new StaticCouponListContentPayload("BADGE_STATIC_TEXT", 2);
    public static final StaticCouponListContentPayload BADGE_TIMER_TEXT = new StaticCouponListContentPayload("BADGE_TIMER_TEXT", 3);
    public static final StaticCouponListContentPayload BADGE_TIMER_STYLE = new StaticCouponListContentPayload("BADGE_TIMER_STYLE", 4);
    public static final StaticCouponListContentPayload BADGE_SALE_TIMER = new StaticCouponListContentPayload("BADGE_SALE_TIMER", 5);
    public static final StaticCouponListContentPayload CREATIVE = new StaticCouponListContentPayload("CREATIVE", 6);
    public static final StaticCouponListContentPayload COUPON_LEFT_ICON = new StaticCouponListContentPayload("COUPON_LEFT_ICON", 7);
    public static final StaticCouponListContentPayload COUPON_BG_COLOR = new StaticCouponListContentPayload("COUPON_BG_COLOR", 8);
    public static final StaticCouponListContentPayload COUPON_IS_APPLIED = new StaticCouponListContentPayload("COUPON_IS_APPLIED", 9);
    public static final StaticCouponListContentPayload COUPON_CHEVRON = new StaticCouponListContentPayload("COUPON_CHEVRON", 10);
    public static final StaticCouponListContentPayload COUPON_TITLE = new StaticCouponListContentPayload("COUPON_TITLE", 11);
    public static final StaticCouponListContentPayload COUPON_SUBTITLE = new StaticCouponListContentPayload("COUPON_SUBTITLE", 12);
    public static final StaticCouponListContentPayload COUPON_STUB_TEXT = new StaticCouponListContentPayload("COUPON_STUB_TEXT", 13);
    public static final StaticCouponListContentPayload COUPON_STUB_BG_COLOR = new StaticCouponListContentPayload("COUPON_STUB_BG_COLOR", 14);
    public static final StaticCouponListContentPayload COUPON_STUB_ANIMATION = new StaticCouponListContentPayload("COUPON_STUB_ANIMATION", 15);

    private static final /* synthetic */ StaticCouponListContentPayload[] $values() {
        return new StaticCouponListContentPayload[]{BADGE_LEFT_ICON, BADGE_BG_COLOR, BADGE_STATIC_TEXT, BADGE_TIMER_TEXT, BADGE_TIMER_STYLE, BADGE_SALE_TIMER, CREATIVE, COUPON_LEFT_ICON, COUPON_BG_COLOR, COUPON_IS_APPLIED, COUPON_CHEVRON, COUPON_TITLE, COUPON_SUBTITLE, COUPON_STUB_TEXT, COUPON_STUB_BG_COLOR, COUPON_STUB_ANIMATION};
    }

    static {
        StaticCouponListContentPayload[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private StaticCouponListContentPayload(String str, int i11) {
    }

    public static StaticCouponListContentPayload valueOf(String str) {
        return (StaticCouponListContentPayload) Enum.valueOf(StaticCouponListContentPayload.class, str);
    }

    public static StaticCouponListContentPayload[] values() {
        return (StaticCouponListContentPayload[]) $VALUES.clone();
    }
}
