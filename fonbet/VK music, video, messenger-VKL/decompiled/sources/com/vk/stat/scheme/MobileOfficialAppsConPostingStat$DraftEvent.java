package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPostingStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPostingStat$DraftEvent {

    @pmi0("draft_event_type")
    private final DraftEventType draftEventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPostingStat.kt */
    public static final class DraftEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ DraftEventType[] $VALUES;

        @pmi0("delete_draft")
        public static final DraftEventType DELETE_DRAFT;

        @pmi0("open_draft")
        public static final DraftEventType OPEN_DRAFT;

        @pmi0("save_draft")
        public static final DraftEventType SAVE_DRAFT;

        static {
            DraftEventType draftEventType = new DraftEventType("OPEN_DRAFT", 0);
            OPEN_DRAFT = draftEventType;
            DraftEventType draftEventType2 = new DraftEventType("SAVE_DRAFT", 1);
            SAVE_DRAFT = draftEventType2;
            DraftEventType draftEventType3 = new DraftEventType("DELETE_DRAFT", 2);
            DELETE_DRAFT = draftEventType3;
            DraftEventType[] draftEventTypeArr = {draftEventType, draftEventType2, draftEventType3};
            $VALUES = draftEventTypeArr;
            $ENTRIES = new asp(draftEventTypeArr);
        }

        private DraftEventType(String str, int i) {
        }

        public static DraftEventType valueOf(String str) {
            return (DraftEventType) Enum.valueOf(DraftEventType.class, str);
        }

        public static DraftEventType[] values() {
            return (DraftEventType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsConPostingStat$DraftEvent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsConPostingStat$DraftEvent) && this.draftEventType == ((MobileOfficialAppsConPostingStat$DraftEvent) obj).draftEventType;
    }

    public final int hashCode() {
        DraftEventType draftEventType = this.draftEventType;
        if (draftEventType == null) {
            return 0;
        }
        return draftEventType.hashCode();
    }

    public final String toString() {
        return "DraftEvent(draftEventType=" + this.draftEventType + ')';
    }

    public MobileOfficialAppsConPostingStat$DraftEvent(DraftEventType draftEventType) {
        this.draftEventType = draftEventType;
    }

    public /* synthetic */ MobileOfficialAppsConPostingStat$DraftEvent(DraftEventType draftEventType, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : draftEventType);
    }
}
