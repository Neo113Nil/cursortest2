package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.payload;

import Tc.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.vo.HotelsBookTotalV3VO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0096\u0002¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/payload/HotelsBookTotalV3PayloadManager;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO;", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/payload/HotelsBookTotalV3Payload;", "<init>", "()V", "invoke", "oldItem", "newItem", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookTotalV3PayloadManager implements Function2<HotelsBookTotalV3VO, HotelsBookTotalV3VO, List<? extends HotelsBookTotalV3Payload>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsBookTotalV3Payload> invoke(@NotNull HotelsBookTotalV3VO oldItem, @NotNull HotelsBookTotalV3VO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        b builder = C7714v.B();
        if (!Intrinsics.d(oldItem.getPrice().getFinal(), newItem.getPrice().getFinal())) {
            builder.add(HotelsBookTotalV3Payload.FINAL_PRICE);
        }
        if (!Intrinsics.d(oldItem.getPrice().getBase(), newItem.getPrice().getBase())) {
            builder.add(HotelsBookTotalV3Payload.BASE_PRICE);
        }
        if (!Intrinsics.d(oldItem.getBonuses(), newItem.getBonuses())) {
            builder.add(HotelsBookTotalV3Payload.BONUSES_AMOUNT);
        }
        if (oldItem.getIsLoading() != newItem.getIsLoading()) {
            builder.add(HotelsBookTotalV3Payload.IS_LOADING);
        }
        if (!Intrinsics.d(oldItem.getNextButton(), newItem.getNextButton())) {
            builder.add(HotelsBookTotalV3Payload.NEXT_BUTTON);
        }
        if (!Intrinsics.d(oldItem.getAgreement(), newItem.getAgreement())) {
            builder.add(HotelsBookTotalV3Payload.AGREEMENT);
        }
        if (!Intrinsics.d(oldItem.getNotification(), newItem.getNotification())) {
            builder.add(HotelsBookTotalV3Payload.NOTIFICATION);
        }
        if (!Intrinsics.d(oldItem.getStarsBonuses(), newItem.getStarsBonuses())) {
            builder.add(HotelsBookTotalV3Payload.STARS_BONUSES);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }
}
