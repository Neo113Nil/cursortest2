package com.vk.stat.scheme;

import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPostingStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPostingStat$PrimaryModeEvent {

    @pmi0("attachments_info")
    private final List<MobileOfficialAppsConPostingStat$AttachmentInfo> attachmentsInfo;

    @pmi0("primary_mode_event_type")
    private final PrimaryModeEventType primaryModeEventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPostingStat.kt */
    public static final class PrimaryModeEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PrimaryModeEventType[] $VALUES;

        @pmi0("carousel_mode")
        public static final PrimaryModeEventType CAROUSEL_MODE;

        @pmi0("change_attach_order")
        public static final PrimaryModeEventType CHANGE_ATTACH_ORDER;

        @pmi0("grid_mode")
        public static final PrimaryModeEventType GRID_MODE;

        @pmi0("ratio_change")
        public static final PrimaryModeEventType RATIO_CHANGE;

        @pmi0("zoom")
        public static final PrimaryModeEventType ZOOM;

        static {
            PrimaryModeEventType primaryModeEventType = new PrimaryModeEventType("GRID_MODE", 0);
            GRID_MODE = primaryModeEventType;
            PrimaryModeEventType primaryModeEventType2 = new PrimaryModeEventType("CAROUSEL_MODE", 1);
            CAROUSEL_MODE = primaryModeEventType2;
            PrimaryModeEventType primaryModeEventType3 = new PrimaryModeEventType("CHANGE_ATTACH_ORDER", 2);
            CHANGE_ATTACH_ORDER = primaryModeEventType3;
            PrimaryModeEventType primaryModeEventType4 = new PrimaryModeEventType("RATIO_CHANGE", 3);
            RATIO_CHANGE = primaryModeEventType4;
            PrimaryModeEventType primaryModeEventType5 = new PrimaryModeEventType("ZOOM", 4);
            ZOOM = primaryModeEventType5;
            PrimaryModeEventType[] primaryModeEventTypeArr = {primaryModeEventType, primaryModeEventType2, primaryModeEventType3, primaryModeEventType4, primaryModeEventType5};
            $VALUES = primaryModeEventTypeArr;
            $ENTRIES = new asp(primaryModeEventTypeArr);
        }

        private PrimaryModeEventType(String str, int i) {
        }

        public static PrimaryModeEventType valueOf(String str) {
            return (PrimaryModeEventType) Enum.valueOf(PrimaryModeEventType.class, str);
        }

        public static PrimaryModeEventType[] values() {
            return (PrimaryModeEventType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsConPostingStat$PrimaryModeEvent() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsConPostingStat$PrimaryModeEvent)) {
            return false;
        }
        MobileOfficialAppsConPostingStat$PrimaryModeEvent mobileOfficialAppsConPostingStat$PrimaryModeEvent = (MobileOfficialAppsConPostingStat$PrimaryModeEvent) obj;
        return this.primaryModeEventType == mobileOfficialAppsConPostingStat$PrimaryModeEvent.primaryModeEventType && epx.f(this.attachmentsInfo, mobileOfficialAppsConPostingStat$PrimaryModeEvent.attachmentsInfo);
    }

    public final int hashCode() {
        PrimaryModeEventType primaryModeEventType = this.primaryModeEventType;
        int hashCode = (primaryModeEventType == null ? 0 : primaryModeEventType.hashCode()) * 31;
        List<MobileOfficialAppsConPostingStat$AttachmentInfo> list = this.attachmentsInfo;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrimaryModeEvent(primaryModeEventType=");
        sb.append(this.primaryModeEventType);
        sb.append(", attachmentsInfo=");
        return ms9.a(')', sb, this.attachmentsInfo);
    }

    public MobileOfficialAppsConPostingStat$PrimaryModeEvent(PrimaryModeEventType primaryModeEventType, List<MobileOfficialAppsConPostingStat$AttachmentInfo> list) {
        this.primaryModeEventType = primaryModeEventType;
        this.attachmentsInfo = list;
    }

    public /* synthetic */ MobileOfficialAppsConPostingStat$PrimaryModeEvent(PrimaryModeEventType primaryModeEventType, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : primaryModeEventType, (i & 2) != 0 ? null : list);
    }
}
