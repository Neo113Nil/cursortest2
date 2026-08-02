package com.vk.ecomm.storefrontservices.impl.presentation.feature;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StorefrontServicesViewState.kt */
/* loaded from: classes18.dex */
public final class ServicesSort {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ServicesSort[] $VALUES;
    public static final ServicesSort DATE_ADDED;
    public static final ServicesSort DEFAULT;
    public static final ServicesSort PRICE_DEC;
    public static final ServicesSort PRICE_INC;
    private final int resId;
    private final int rev;
    private final int sort;

    static {
        ServicesSort servicesSort = new ServicesSort("DEFAULT", 0, 0, 1, R.string.storefront_services_sort_type_default);
        DEFAULT = servicesSort;
        ServicesSort servicesSort2 = new ServicesSort("DATE_ADDED", 1, 1, 1, R.string.storefront_services_sort_type_date_added);
        DATE_ADDED = servicesSort2;
        ServicesSort servicesSort3 = new ServicesSort("PRICE_INC", 2, 2, 0, R.string.storefront_services_sort_type_date_price_inc);
        PRICE_INC = servicesSort3;
        ServicesSort servicesSort4 = new ServicesSort("PRICE_DEC", 3, 2, 1, R.string.storefront_services_sort_type_date_price_dec);
        PRICE_DEC = servicesSort4;
        ServicesSort[] servicesSortArr = {servicesSort, servicesSort2, servicesSort3, servicesSort4};
        $VALUES = servicesSortArr;
        $ENTRIES = new asp(servicesSortArr);
    }

    public ServicesSort(String str, int i, int i2, int i3, int i4) {
        this.sort = i2;
        this.rev = i3;
        this.resId = i4;
    }

    public static zrp<ServicesSort> h() {
        return $ENTRIES;
    }

    public static ServicesSort valueOf(String str) {
        return (ServicesSort) Enum.valueOf(ServicesSort.class, str);
    }

    public static ServicesSort[] values() {
        return (ServicesSort[]) $VALUES.clone();
    }

    public final int i() {
        return this.resId;
    }

    public final int j() {
        return this.rev;
    }

    public final int k() {
        return this.sort;
    }
}
