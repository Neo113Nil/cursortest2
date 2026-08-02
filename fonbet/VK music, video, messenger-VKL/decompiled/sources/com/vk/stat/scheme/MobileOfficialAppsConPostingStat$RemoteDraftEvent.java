package com.vk.stat.scheme;

import xsna.asp;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsConPostingStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsConPostingStat$RemoteDraftEvent {

    @pmi0("remote_draft_event_type")
    private final RemoteDraftEventType remoteDraftEventType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsConPostingStat.kt */
    public static final class RemoteDraftEventType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ RemoteDraftEventType[] $VALUES;

        @pmi0("delete")
        public static final RemoteDraftEventType DELETE;

        @pmi0("exit_draft")
        public static final RemoteDraftEventType EXIT_DRAFT;

        @pmi0("open_drafts_list")
        public static final RemoteDraftEventType OPEN_DRAFTS_LIST;

        @pmi0("post_draft")
        public static final RemoteDraftEventType POST_DRAFT;

        @pmi0("save_draft")
        public static final RemoteDraftEventType SAVE_DRAFT;

        @pmi0("save_draft_changes")
        public static final RemoteDraftEventType SAVE_DRAFT_CHANGES;

        static {
            RemoteDraftEventType remoteDraftEventType = new RemoteDraftEventType("OPEN_DRAFTS_LIST", 0);
            OPEN_DRAFTS_LIST = remoteDraftEventType;
            RemoteDraftEventType remoteDraftEventType2 = new RemoteDraftEventType("SAVE_DRAFT", 1);
            SAVE_DRAFT = remoteDraftEventType2;
            RemoteDraftEventType remoteDraftEventType3 = new RemoteDraftEventType("SAVE_DRAFT_CHANGES", 2);
            SAVE_DRAFT_CHANGES = remoteDraftEventType3;
            RemoteDraftEventType remoteDraftEventType4 = new RemoteDraftEventType("EXIT_DRAFT", 3);
            EXIT_DRAFT = remoteDraftEventType4;
            RemoteDraftEventType remoteDraftEventType5 = new RemoteDraftEventType("POST_DRAFT", 4);
            POST_DRAFT = remoteDraftEventType5;
            RemoteDraftEventType remoteDraftEventType6 = new RemoteDraftEventType("DELETE", 5);
            DELETE = remoteDraftEventType6;
            RemoteDraftEventType[] remoteDraftEventTypeArr = {remoteDraftEventType, remoteDraftEventType2, remoteDraftEventType3, remoteDraftEventType4, remoteDraftEventType5, remoteDraftEventType6};
            $VALUES = remoteDraftEventTypeArr;
            $ENTRIES = new asp(remoteDraftEventTypeArr);
        }

        private RemoteDraftEventType(String str, int i) {
        }

        public static RemoteDraftEventType valueOf(String str) {
            return (RemoteDraftEventType) Enum.valueOf(RemoteDraftEventType.class, str);
        }

        public static RemoteDraftEventType[] values() {
            return (RemoteDraftEventType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsConPostingStat$RemoteDraftEvent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsConPostingStat$RemoteDraftEvent) && this.remoteDraftEventType == ((MobileOfficialAppsConPostingStat$RemoteDraftEvent) obj).remoteDraftEventType;
    }

    public final int hashCode() {
        RemoteDraftEventType remoteDraftEventType = this.remoteDraftEventType;
        if (remoteDraftEventType == null) {
            return 0;
        }
        return remoteDraftEventType.hashCode();
    }

    public final String toString() {
        return "RemoteDraftEvent(remoteDraftEventType=" + this.remoteDraftEventType + ')';
    }

    public MobileOfficialAppsConPostingStat$RemoteDraftEvent(RemoteDraftEventType remoteDraftEventType) {
        this.remoteDraftEventType = remoteDraftEventType;
    }

    public /* synthetic */ MobileOfficialAppsConPostingStat$RemoteDraftEvent(RemoteDraftEventType remoteDraftEventType, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : remoteDraftEventType);
    }
}
