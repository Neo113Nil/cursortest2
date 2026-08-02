package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsProfileStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsProfileStat$QrProfileEvent {

    @pmi0("qr_profile_event_type")
    private final QrProfileEventType qrProfileEventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsProfileStat.kt */
    public static final class QrProfileEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ QrProfileEventType[] $VALUES;

        @pmi0("share_profile_link")
        public static final QrProfileEventType SHARE_PROFILE_LINK;

        static {
            QrProfileEventType qrProfileEventType = new QrProfileEventType("SHARE_PROFILE_LINK", 0);
            SHARE_PROFILE_LINK = qrProfileEventType;
            QrProfileEventType[] qrProfileEventTypeArr = {qrProfileEventType};
            $VALUES = qrProfileEventTypeArr;
            $ENTRIES = new asp(qrProfileEventTypeArr);
        }

        private QrProfileEventType(String str, int i) {
        }

        public static QrProfileEventType valueOf(String str) {
            return (QrProfileEventType) Enum.valueOf(QrProfileEventType.class, str);
        }

        public static QrProfileEventType[] values() {
            return (QrProfileEventType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsProfileStat$QrProfileEvent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsProfileStat$QrProfileEvent) && this.qrProfileEventType == ((MobileOfficialAppsProfileStat$QrProfileEvent) obj).qrProfileEventType;
    }

    public final int hashCode() {
        QrProfileEventType qrProfileEventType = this.qrProfileEventType;
        if (qrProfileEventType == null) {
            return 0;
        }
        return qrProfileEventType.hashCode();
    }

    public final String toString() {
        return "QrProfileEvent(qrProfileEventType=" + this.qrProfileEventType + ')';
    }

    public MobileOfficialAppsProfileStat$QrProfileEvent(QrProfileEventType qrProfileEventType) {
        this.qrProfileEventType = qrProfileEventType;
    }

    public /* synthetic */ MobileOfficialAppsProfileStat$QrProfileEvent(QrProfileEventType qrProfileEventType, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : qrProfileEventType);
    }
}
