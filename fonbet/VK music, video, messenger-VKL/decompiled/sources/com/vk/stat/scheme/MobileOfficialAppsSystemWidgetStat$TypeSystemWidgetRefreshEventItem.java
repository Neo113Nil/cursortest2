package com.vk.stat.scheme;

import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.tay;
import xsna.tru;
import xsna.uay;
import xsna.urd0;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsSystemWidgetStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem implements SchemeStat$TypeAction.b {
    public final transient String a;
    public final transient String b;

    @pmi0("client_time")
    private final String clientTime;

    @pmi0("error_description")
    private final FilteredString filteredErrorDescription;

    @pmi0("refer")
    private final FilteredString filteredRefer;

    @pmi0("product_type")
    private final ProductType productType;

    @pmi0("refresh_type")
    private final RefreshType refreshType;

    @pmi0("widget_type")
    private final WidgetType widgetType;

    /* compiled from: MobileOfficialAppsSystemWidgetStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem>, a9y<MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem((ProductType) dq.f(x9yVar, "product_type", tru.a(), ProductType.class), (WidgetType) dq.f(x9yVar, "widget_type", tru.a(), WidgetType.class), fai.s(x9yVar, "client_time"), (RefreshType) dq.f(x9yVar, "refresh_type", tru.a(), RefreshType.class), fai.C(x9yVar, "refer"), fai.C(x9yVar, "error_description"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem = (MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("product_type", tru.a().toJson(mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem.b()));
            x9yVar.o("widget_type", tru.a().toJson(mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem.d()));
            x9yVar.o("client_time", mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem.a());
            x9yVar.o("refresh_type", tru.a().toJson(mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem.c()));
            x9yVar.o("refer", mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem.a);
            x9yVar.o("error_description", mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem.b);
            return x9yVar;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsSystemWidgetStat.kt */
    /* loaded from: classes5.dex */
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
    /* loaded from: classes5.dex */
    public static final class RefreshType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ RefreshType[] $VALUES;

        @pmi0("preview")
        public static final RefreshType PREVIEW;

        @pmi0(ToolBar.REFRESH)
        public static final RefreshType REFRESH;

        static {
            RefreshType refreshType = new RefreshType("PREVIEW", 0);
            PREVIEW = refreshType;
            RefreshType refreshType2 = new RefreshType("REFRESH", 1);
            REFRESH = refreshType2;
            RefreshType[] refreshTypeArr = {refreshType, refreshType2};
            $VALUES = refreshTypeArr;
            $ENTRIES = new asp(refreshTypeArr);
        }

        private RefreshType(String str, int i) {
        }

        public static RefreshType valueOf(String str) {
            return (RefreshType) Enum.valueOf(RefreshType.class, str);
        }

        public static RefreshType[] values() {
            return (RefreshType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsSystemWidgetStat.kt */
    /* loaded from: classes5.dex */
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

    public MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem(ProductType productType, WidgetType widgetType, String str, RefreshType refreshType, String str2, String str3) {
        this.productType = productType;
        this.widgetType = widgetType;
        this.clientTime = str;
        this.refreshType = refreshType;
        this.a = str2;
        this.b = str3;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredRefer = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(256));
        this.filteredErrorDescription = filteredString2;
        filteredString.a(str2);
        filteredString2.a(str3);
    }

    public final String a() {
        return this.clientTime;
    }

    public final ProductType b() {
        return this.productType;
    }

    public final RefreshType c() {
        return this.refreshType;
    }

    public final WidgetType d() {
        return this.widgetType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem)) {
            return false;
        }
        MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem = (MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem) obj;
        return this.productType == mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem.productType && this.widgetType == mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem.widgetType && epx.f(this.clientTime, mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem.clientTime) && this.refreshType == mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem.refreshType && epx.f(this.a, mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem.a) && epx.f(this.b, mobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem.b);
    }

    public final int hashCode() {
        int hashCode = (this.refreshType.hashCode() + urd0.a((this.widgetType.hashCode() + (this.productType.hashCode() * 31)) * 31, 31, this.clientTime)) * 31;
        String str = this.a;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.b;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeSystemWidgetRefreshEventItem(productType=");
        sb.append(this.productType);
        sb.append(", widgetType=");
        sb.append(this.widgetType);
        sb.append(", clientTime=");
        sb.append(this.clientTime);
        sb.append(", refreshType=");
        sb.append(this.refreshType);
        sb.append(", refer=");
        sb.append(this.a);
        sb.append(", errorDescription=");
        return ho8.a(sb, this.b, ')');
    }

    public /* synthetic */ MobileOfficialAppsSystemWidgetStat$TypeSystemWidgetRefreshEventItem(ProductType productType, WidgetType widgetType, String str, RefreshType refreshType, String str2, String str3, int i, zcl zclVar) {
        this(productType, widgetType, str, refreshType, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3);
    }
}
