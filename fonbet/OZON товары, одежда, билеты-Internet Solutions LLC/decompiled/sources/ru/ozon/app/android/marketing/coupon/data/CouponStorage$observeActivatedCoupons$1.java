package ru.ozon.app.android.marketing.coupon.data;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "it", "", "", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Ljava/util/Set;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CouponStorage$observeActivatedCoupons$1 extends AbstractC7737t implements Function1<Set<? extends String>, Boolean> {
    public static final CouponStorage$observeActivatedCoupons$1 INSTANCE = new CouponStorage$observeActivatedCoupons$1();

    CouponStorage$observeActivatedCoupons$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Boolean invoke2(Set<String> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(!it.isEmpty());
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Set<? extends String> set) {
        return invoke2((Set<String>) set);
    }
}
