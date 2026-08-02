package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* compiled from: MobileOfficialAppsSystemWidgetStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsSystemWidgetStat$SystemWidgetDisplayedEventEntity {

    @pmi0("product_type")
    private final ProductType productType;

    @pmi0("widget_type")
    private final WidgetType widgetType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsSystemWidgetStat.kt */
    public static final class ProductType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ProductType[] $VALUES;

        @pmi0("steps")
        public static final ProductType STEPS;

        @pmi0("workouts")
        public static final ProductType WORKOUTS;

        static {
            ProductType productType = new ProductType("STEPS", 0);
            STEPS = productType;
            ProductType productType2 = new ProductType("WORKOUTS", 1);
            WORKOUTS = productType2;
            ProductType[] productTypeArr = {productType, productType2};
            $VALUES = productTypeArr;
            $ENTRIES = new asp(productTypeArr);
        }

        private ProductType(String str, int i) {
        }

        public static ProductType valueOf(String str) {
            return (ProductType) Enum.valueOf(ProductType.class, str);
        }

        public static ProductType[] values() {
            return (ProductType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsSystemWidgetStat.kt */
    public static final class WidgetType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ WidgetType[] $VALUES;

        @pmi0("large_overview")
        public static final WidgetType LARGE_OVERVIEW;

        @pmi0("small_overview")
        public static final WidgetType SMALL_OVERVIEW;

        static {
            WidgetType widgetType = new WidgetType("SMALL_OVERVIEW", 0);
            SMALL_OVERVIEW = widgetType;
            WidgetType widgetType2 = new WidgetType("LARGE_OVERVIEW", 1);
            LARGE_OVERVIEW = widgetType2;
            WidgetType[] widgetTypeArr = {widgetType, widgetType2};
            $VALUES = widgetTypeArr;
            $ENTRIES = new asp(widgetTypeArr);
        }

        private WidgetType(String str, int i) {
        }

        public static WidgetType valueOf(String str) {
            return (WidgetType) Enum.valueOf(WidgetType.class, str);
        }

        public static WidgetType[] values() {
            return (WidgetType[]) $VALUES.clone();
        }
    }

    public MobileOfficialAppsSystemWidgetStat$SystemWidgetDisplayedEventEntity(ProductType productType, WidgetType widgetType) {
        this.productType = productType;
        this.widgetType = widgetType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsSystemWidgetStat$SystemWidgetDisplayedEventEntity)) {
            return false;
        }
        MobileOfficialAppsSystemWidgetStat$SystemWidgetDisplayedEventEntity mobileOfficialAppsSystemWidgetStat$SystemWidgetDisplayedEventEntity = (MobileOfficialAppsSystemWidgetStat$SystemWidgetDisplayedEventEntity) obj;
        return this.productType == mobileOfficialAppsSystemWidgetStat$SystemWidgetDisplayedEventEntity.productType && this.widgetType == mobileOfficialAppsSystemWidgetStat$SystemWidgetDisplayedEventEntity.widgetType;
    }

    public final int hashCode() {
        return this.widgetType.hashCode() + (this.productType.hashCode() * 31);
    }

    public final String toString() {
        return "SystemWidgetDisplayedEventEntity(productType=" + this.productType + ", widgetType=" + this.widgetType + ')';
    }
}
