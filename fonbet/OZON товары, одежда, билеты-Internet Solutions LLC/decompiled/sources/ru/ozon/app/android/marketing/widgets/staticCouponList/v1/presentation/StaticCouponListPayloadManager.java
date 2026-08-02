package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation;

import Tc.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListPayloadManager;", "", "<init>", "()V", "getPayload", "", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListPayload;", "oldItem", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO;", "newItem", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StaticCouponListPayloadManager {
    @NotNull
    public final List<StaticCouponListPayload> getPayload(@NotNull StaticCouponListVO oldItem, @NotNull StaticCouponListVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        b builder = C7714v.B();
        if (!Intrinsics.d(oldItem.getBackgroundImage(), newItem.getBackgroundImage())) {
            builder.add(StaticCouponListPayload.IMAGE);
        }
        if (!Intrinsics.d(oldItem.getContent(), newItem.getContent())) {
            builder.add(StaticCouponListPayload.CONTENT);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }
}
