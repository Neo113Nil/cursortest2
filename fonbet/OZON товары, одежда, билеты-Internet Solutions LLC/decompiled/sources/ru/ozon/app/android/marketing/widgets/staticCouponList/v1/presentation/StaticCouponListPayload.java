package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListPayload;", "", "<init>", "(Ljava/lang/String;I)V", "IMAGE", "CONTENT", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StaticCouponListPayload {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ StaticCouponListPayload[] $VALUES;
    public static final StaticCouponListPayload IMAGE = new StaticCouponListPayload("IMAGE", 0);
    public static final StaticCouponListPayload CONTENT = new StaticCouponListPayload("CONTENT", 1);

    private static final /* synthetic */ StaticCouponListPayload[] $values() {
        return new StaticCouponListPayload[]{IMAGE, CONTENT};
    }

    static {
        StaticCouponListPayload[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private StaticCouponListPayload(String str, int i11) {
    }

    public static StaticCouponListPayload valueOf(String str) {
        return (StaticCouponListPayload) Enum.valueOf(StaticCouponListPayload.class, str);
    }

    public static StaticCouponListPayload[] values() {
        return (StaticCouponListPayload[]) $VALUES.clone();
    }
}
