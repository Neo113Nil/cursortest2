package ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.adapter.cards;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/adapter/cards/ServicePackageCarouselCardsPayload;", "", "<init>", "(Ljava/lang/String;I)V", "IS_ACTIVE", "SMS", "BUTTON", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ServicePackageCarouselCardsPayload {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ServicePackageCarouselCardsPayload[] $VALUES;
    public static final ServicePackageCarouselCardsPayload IS_ACTIVE = new ServicePackageCarouselCardsPayload("IS_ACTIVE", 0);
    public static final ServicePackageCarouselCardsPayload SMS = new ServicePackageCarouselCardsPayload("SMS", 1);
    public static final ServicePackageCarouselCardsPayload BUTTON = new ServicePackageCarouselCardsPayload("BUTTON", 2);

    private static final /* synthetic */ ServicePackageCarouselCardsPayload[] $values() {
        return new ServicePackageCarouselCardsPayload[]{IS_ACTIVE, SMS, BUTTON};
    }

    static {
        ServicePackageCarouselCardsPayload[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ServicePackageCarouselCardsPayload(String str, int i11) {
    }

    public static ServicePackageCarouselCardsPayload valueOf(String str) {
        return (ServicePackageCarouselCardsPayload) Enum.valueOf(ServicePackageCarouselCardsPayload.class, str);
    }

    public static ServicePackageCarouselCardsPayload[] values() {
        return (ServicePackageCarouselCardsPayload[]) $VALUES.clone();
    }
}
