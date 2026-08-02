package ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.adapter.cardContent;

import Xc.a;
import Xc.b;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/adapter/cardContent/ServicePackageCarouselCardContentViewType;", "", "type", "", "<init>", "(Ljava/lang/String;II)V", "getType", "()I", "TEXT", "HORIZONTAL_BADGES", "BENEFIT", "PRICE", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ServicePackageCarouselCardContentViewType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ServicePackageCarouselCardContentViewType[] $VALUES;
    private final int type;
    public static final ServicePackageCarouselCardContentViewType TEXT = new ServicePackageCarouselCardContentViewType("TEXT", 0, 0);
    public static final ServicePackageCarouselCardContentViewType HORIZONTAL_BADGES = new ServicePackageCarouselCardContentViewType("HORIZONTAL_BADGES", 1, 1);
    public static final ServicePackageCarouselCardContentViewType BENEFIT = new ServicePackageCarouselCardContentViewType("BENEFIT", 2, 2);
    public static final ServicePackageCarouselCardContentViewType PRICE = new ServicePackageCarouselCardContentViewType("PRICE", 3, 3);

    private static final /* synthetic */ ServicePackageCarouselCardContentViewType[] $values() {
        return new ServicePackageCarouselCardContentViewType[]{TEXT, HORIZONTAL_BADGES, BENEFIT, PRICE};
    }

    static {
        ServicePackageCarouselCardContentViewType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private ServicePackageCarouselCardContentViewType(String str, int i11, int i12) {
        this.type = i12;
    }

    public static ServicePackageCarouselCardContentViewType valueOf(String str) {
        return (ServicePackageCarouselCardContentViewType) Enum.valueOf(ServicePackageCarouselCardContentViewType.class, str);
    }

    public static ServicePackageCarouselCardContentViewType[] values() {
        return (ServicePackageCarouselCardContentViewType[]) $VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}
