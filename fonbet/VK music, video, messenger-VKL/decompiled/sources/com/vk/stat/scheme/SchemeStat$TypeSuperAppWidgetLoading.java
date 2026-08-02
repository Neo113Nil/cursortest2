package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$EventBenchmarkMain;
import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SchemeStat.kt */
/* loaded from: classes11.dex */
public final class SchemeStat$TypeSuperAppWidgetLoading implements SchemeStat$EventBenchmarkMain.b {

    @pmi0("device_info_item")
    private final MobileOfficialAppsCoreDeviceStat$DeviceInfoItem deviceInfoItem;

    @pmi0("loading_time")
    private final String loadingTime;

    @pmi0("type")
    private final Type type;

    @pmi0("widget_id")
    private final String widgetId;

    @pmi0("widget_uid")
    private final String widgetUid;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SchemeStat.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @pmi0("widget_failed_to_load")
        public static final Type WIDGET_FAILED_TO_LOAD;

        @pmi0("widget_loaded")
        public static final Type WIDGET_LOADED;

        static {
            Type type = new Type("WIDGET_LOADED", 0);
            WIDGET_LOADED = type;
            Type type2 = new Type("WIDGET_FAILED_TO_LOAD", 1);
            WIDGET_FAILED_TO_LOAD = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        private Type(String str, int i) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public SchemeStat$TypeSuperAppWidgetLoading(Type type, String str, String str2, String str3, MobileOfficialAppsCoreDeviceStat$DeviceInfoItem mobileOfficialAppsCoreDeviceStat$DeviceInfoItem) {
        this.type = type;
        this.widgetId = str;
        this.widgetUid = str2;
        this.loadingTime = str3;
        this.deviceInfoItem = mobileOfficialAppsCoreDeviceStat$DeviceInfoItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SchemeStat$TypeSuperAppWidgetLoading)) {
            return false;
        }
        SchemeStat$TypeSuperAppWidgetLoading schemeStat$TypeSuperAppWidgetLoading = (SchemeStat$TypeSuperAppWidgetLoading) obj;
        return this.type == schemeStat$TypeSuperAppWidgetLoading.type && epx.f(this.widgetId, schemeStat$TypeSuperAppWidgetLoading.widgetId) && epx.f(this.widgetUid, schemeStat$TypeSuperAppWidgetLoading.widgetUid) && epx.f(this.loadingTime, schemeStat$TypeSuperAppWidgetLoading.loadingTime) && epx.f(this.deviceInfoItem, schemeStat$TypeSuperAppWidgetLoading.deviceInfoItem);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(urd0.a(this.type.hashCode() * 31, 31, this.widgetId), 31, this.widgetUid), 31, this.loadingTime);
        MobileOfficialAppsCoreDeviceStat$DeviceInfoItem mobileOfficialAppsCoreDeviceStat$DeviceInfoItem = this.deviceInfoItem;
        return a + (mobileOfficialAppsCoreDeviceStat$DeviceInfoItem == null ? 0 : mobileOfficialAppsCoreDeviceStat$DeviceInfoItem.hashCode());
    }

    public final String toString() {
        return "TypeSuperAppWidgetLoading(type=" + this.type + ", widgetId=" + this.widgetId + ", widgetUid=" + this.widgetUid + ", loadingTime=" + this.loadingTime + ", deviceInfoItem=" + this.deviceInfoItem + ')';
    }

    public /* synthetic */ SchemeStat$TypeSuperAppWidgetLoading(Type type, String str, String str2, String str3, MobileOfficialAppsCoreDeviceStat$DeviceInfoItem mobileOfficialAppsCoreDeviceStat$DeviceInfoItem, int i, zcl zclVar) {
        this(type, str, str2, str3, (i & 16) != 0 ? null : mobileOfficialAppsCoreDeviceStat$DeviceInfoItem);
    }
}
