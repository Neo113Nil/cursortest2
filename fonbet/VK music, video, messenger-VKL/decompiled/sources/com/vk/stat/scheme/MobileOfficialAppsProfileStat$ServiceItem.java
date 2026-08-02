package com.vk.stat.scheme;

import xsna.asp;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsProfileStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsProfileStat$ServiceItem {

    @pmi0("native_service_type")
    private final NativeServiceType nativeServiceType;

    @pmi0("service_id")
    private final Long serviceId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsProfileStat.kt */
    public static final class NativeServiceType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NativeServiceType[] $VALUES;

        @pmi0("questions")
        public static final NativeServiceType QUESTIONS;

        static {
            NativeServiceType nativeServiceType = new NativeServiceType("QUESTIONS", 0);
            QUESTIONS = nativeServiceType;
            NativeServiceType[] nativeServiceTypeArr = {nativeServiceType};
            $VALUES = nativeServiceTypeArr;
            $ENTRIES = new asp(nativeServiceTypeArr);
        }

        private NativeServiceType(String str, int i) {
        }

        public static NativeServiceType valueOf(String str) {
            return (NativeServiceType) Enum.valueOf(NativeServiceType.class, str);
        }

        public static NativeServiceType[] values() {
            return (NativeServiceType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsProfileStat$ServiceItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsProfileStat$ServiceItem)) {
            return false;
        }
        MobileOfficialAppsProfileStat$ServiceItem mobileOfficialAppsProfileStat$ServiceItem = (MobileOfficialAppsProfileStat$ServiceItem) obj;
        return epx.f(this.serviceId, mobileOfficialAppsProfileStat$ServiceItem.serviceId) && this.nativeServiceType == mobileOfficialAppsProfileStat$ServiceItem.nativeServiceType;
    }

    public final int hashCode() {
        Long l = this.serviceId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        NativeServiceType nativeServiceType = this.nativeServiceType;
        return hashCode + (nativeServiceType != null ? nativeServiceType.hashCode() : 0);
    }

    public final String toString() {
        return "ServiceItem(serviceId=" + this.serviceId + ", nativeServiceType=" + this.nativeServiceType + ')';
    }

    public MobileOfficialAppsProfileStat$ServiceItem(Long l, NativeServiceType nativeServiceType) {
        this.serviceId = l;
        this.nativeServiceType = nativeServiceType;
    }

    public /* synthetic */ MobileOfficialAppsProfileStat$ServiceItem(Long l, NativeServiceType nativeServiceType, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : nativeServiceType);
    }
}
