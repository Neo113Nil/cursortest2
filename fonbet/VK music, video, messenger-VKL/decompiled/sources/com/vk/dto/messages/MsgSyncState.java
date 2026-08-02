package com.vk.dto.messages;

import java.util.List;
import xsna.asp;
import xsna.e43;
import xsna.lhg;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MsgSyncState.kt */
/* loaded from: classes18.dex */
public final class MsgSyncState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MsgSyncState[] $VALUES;
    private static final List<MsgSyncState> CURRENTLY_SYNCING;
    public static final a Companion;
    public static final MsgSyncState DONE;
    public static final MsgSyncState EDITING;
    public static final MsgSyncState ERROR;
    private static final List<MsgSyncState> NOT_SYNCED;
    public static final MsgSyncState SENDING;
    private static final MsgSyncState[] VALUES;
    private final int id;

    /* compiled from: MsgSyncState.kt */
    public static final class a {
        public static MsgSyncState a(int i) {
            MsgSyncState msgSyncState;
            MsgSyncState[] msgSyncStateArr = MsgSyncState.VALUES;
            int length = msgSyncStateArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    msgSyncState = null;
                    break;
                }
                msgSyncState = msgSyncStateArr[i2];
                if (msgSyncState.id == i) {
                    break;
                }
                i2++;
            }
            if (msgSyncState != null) {
                return msgSyncState;
            }
            throw new IllegalArgumentException(lhg.a(i, "Illegal id value: "));
        }
    }

    static {
        MsgSyncState msgSyncState = new MsgSyncState("DONE", 0, 0);
        DONE = msgSyncState;
        MsgSyncState msgSyncState2 = new MsgSyncState("ERROR", 1, 1);
        ERROR = msgSyncState2;
        MsgSyncState msgSyncState3 = new MsgSyncState("SENDING", 2, 2);
        SENDING = msgSyncState3;
        MsgSyncState msgSyncState4 = new MsgSyncState("EDITING", 3, 3);
        EDITING = msgSyncState4;
        MsgSyncState[] msgSyncStateArr = {msgSyncState, msgSyncState2, msgSyncState3, msgSyncState4};
        $VALUES = msgSyncStateArr;
        $ENTRIES = new asp(msgSyncStateArr);
        Companion = new a();
        VALUES = values();
        NOT_SYNCED = e43.l(msgSyncState2, msgSyncState3, msgSyncState4);
        CURRENTLY_SYNCING = e43.l(msgSyncState3, msgSyncState4);
    }

    public MsgSyncState(String str, int i, int i2) {
        this.id = i2;
    }

    public static MsgSyncState valueOf(String str) {
        return (MsgSyncState) Enum.valueOf(MsgSyncState.class, str);
    }

    public static MsgSyncState[] values() {
        return (MsgSyncState[]) $VALUES.clone();
    }

    public final int j() {
        return this.id;
    }
}
