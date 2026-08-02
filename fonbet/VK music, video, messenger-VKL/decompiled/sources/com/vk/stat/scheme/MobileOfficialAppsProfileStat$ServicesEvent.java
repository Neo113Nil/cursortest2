package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsProfileStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsProfileStat$ServicesEvent {

    @pmi0("service_item")
    private final MobileOfficialAppsProfileStat$ServiceItem serviceItem;

    @pmi0("services_event_type")
    private final ServicesEventType servicesEventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsProfileStat.kt */
    public static final class ServicesEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ServicesEventType[] $VALUES;

        @pmi0("click_to_services")
        public static final ServicesEventType CLICK_TO_SERVICES;

        @pmi0("open_service")
        public static final ServicesEventType OPEN_SERVICE;

        static {
            ServicesEventType servicesEventType = new ServicesEventType("CLICK_TO_SERVICES", 0);
            CLICK_TO_SERVICES = servicesEventType;
            ServicesEventType servicesEventType2 = new ServicesEventType("OPEN_SERVICE", 1);
            OPEN_SERVICE = servicesEventType2;
            ServicesEventType[] servicesEventTypeArr = {servicesEventType, servicesEventType2};
            $VALUES = servicesEventTypeArr;
            $ENTRIES = new asp(servicesEventTypeArr);
        }

        private ServicesEventType(String str, int i) {
        }

        public static ServicesEventType valueOf(String str) {
            return (ServicesEventType) Enum.valueOf(ServicesEventType.class, str);
        }

        public static ServicesEventType[] values() {
            return (ServicesEventType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsProfileStat$ServicesEvent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsProfileStat$ServicesEvent)) {
            return false;
        }
        MobileOfficialAppsProfileStat$ServicesEvent mobileOfficialAppsProfileStat$ServicesEvent = (MobileOfficialAppsProfileStat$ServicesEvent) obj;
        return this.servicesEventType == mobileOfficialAppsProfileStat$ServicesEvent.servicesEventType && epx.f(this.serviceItem, mobileOfficialAppsProfileStat$ServicesEvent.serviceItem);
    }

    public final int hashCode() {
        ServicesEventType servicesEventType = this.servicesEventType;
        int hashCode = (servicesEventType == null ? 0 : servicesEventType.hashCode()) * 31;
        MobileOfficialAppsProfileStat$ServiceItem mobileOfficialAppsProfileStat$ServiceItem = this.serviceItem;
        return hashCode + (mobileOfficialAppsProfileStat$ServiceItem != null ? mobileOfficialAppsProfileStat$ServiceItem.hashCode() : 0);
    }

    public final String toString() {
        return "ServicesEvent(servicesEventType=" + this.servicesEventType + ", serviceItem=" + this.serviceItem + ')';
    }

    public MobileOfficialAppsProfileStat$ServicesEvent(ServicesEventType servicesEventType, MobileOfficialAppsProfileStat$ServiceItem mobileOfficialAppsProfileStat$ServiceItem) {
        this.servicesEventType = servicesEventType;
        this.serviceItem = mobileOfficialAppsProfileStat$ServiceItem;
    }

    public /* synthetic */ MobileOfficialAppsProfileStat$ServicesEvent(ServicesEventType servicesEventType, MobileOfficialAppsProfileStat$ServiceItem mobileOfficialAppsProfileStat$ServiceItem, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : servicesEventType, (i & 2) != 0 ? null : mobileOfficialAppsProfileStat$ServiceItem);
    }
}
