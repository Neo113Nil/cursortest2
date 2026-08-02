package com.vk.dto.attaches;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AttachSyncState.kt */
/* loaded from: classes18.dex */
public final class AttachSyncState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AttachSyncState[] $VALUES;
    public static final a Companion;
    public static final AttachSyncState DONE;
    public static final AttachSyncState ERROR;
    public static final AttachSyncState REJECTED;
    public static final AttachSyncState UPLOAD_ON_BG;
    public static final AttachSyncState UPLOAD_REQUIRED;
    private final int mIntId;

    /* compiled from: AttachSyncState.kt */
    public static final class a {
        public static boolean a(AttachSyncState attachSyncState) {
            return attachSyncState == AttachSyncState.ERROR || attachSyncState == AttachSyncState.REJECTED;
        }
    }

    static {
        AttachSyncState attachSyncState = new AttachSyncState("UPLOAD_REQUIRED", 0, 1);
        UPLOAD_REQUIRED = attachSyncState;
        AttachSyncState attachSyncState2 = new AttachSyncState("UPLOAD_ON_BG", 1, 2);
        UPLOAD_ON_BG = attachSyncState2;
        AttachSyncState attachSyncState3 = new AttachSyncState("DONE", 2, 3);
        DONE = attachSyncState3;
        AttachSyncState attachSyncState4 = new AttachSyncState("ERROR", 3, 4);
        ERROR = attachSyncState4;
        AttachSyncState attachSyncState5 = new AttachSyncState("REJECTED", 4, 5);
        REJECTED = attachSyncState5;
        AttachSyncState[] attachSyncStateArr = {attachSyncState, attachSyncState2, attachSyncState3, attachSyncState4, attachSyncState5};
        $VALUES = attachSyncStateArr;
        $ENTRIES = new asp(attachSyncStateArr);
        Companion = new a();
    }

    public AttachSyncState(String str, int i, int i2) {
        this.mIntId = i2;
    }

    public static AttachSyncState valueOf(String str) {
        return (AttachSyncState) Enum.valueOf(AttachSyncState.class, str);
    }

    public static AttachSyncState[] values() {
        return (AttachSyncState[]) $VALUES.clone();
    }

    public final int h() {
        return this.mIntId;
    }

    public final boolean i() {
        return this == UPLOAD_REQUIRED || this == UPLOAD_ON_BG;
    }
}
