package com.vk.im.engine.models;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.bpn0;
import xsna.lhg;
import xsna.on00;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MsgRequestStatus.kt */
/* loaded from: classes2.dex */
public final class MsgRequestStatus {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MsgRequestStatus[] $VALUES;
    public static final MsgRequestStatus ACCEPTED;
    public static final a Companion;
    public static final MsgRequestStatus DELETED;
    public static final MsgRequestStatus NONE;
    public static final MsgRequestStatus PENDING;
    public static final MsgRequestStatus REJECTED;
    private static final Lazy<Map<Integer, MsgRequestStatus>> values$delegate;
    private final int id;

    /* compiled from: MsgRequestStatus.kt */
    public static final class a {
        public static MsgRequestStatus a(int i) {
            Object obj = ((Map) MsgRequestStatus.values$delegate.getValue()).get(Integer.valueOf(i));
            if (obj != null) {
                return (MsgRequestStatus) obj;
            }
            throw new IllegalArgumentException(lhg.a(i, "Unknown id: ").toString());
        }
    }

    static {
        MsgRequestStatus msgRequestStatus = new MsgRequestStatus("NONE", 0, 0);
        NONE = msgRequestStatus;
        MsgRequestStatus msgRequestStatus2 = new MsgRequestStatus("PENDING", 1, 1);
        PENDING = msgRequestStatus2;
        MsgRequestStatus msgRequestStatus3 = new MsgRequestStatus(SignalingProtocol.PARTICIPANT_STATE_ACCEPTED, 2, 2);
        ACCEPTED = msgRequestStatus3;
        MsgRequestStatus msgRequestStatus4 = new MsgRequestStatus("REJECTED", 3, 3);
        REJECTED = msgRequestStatus4;
        MsgRequestStatus msgRequestStatus5 = new MsgRequestStatus("DELETED", 4, 4);
        DELETED = msgRequestStatus5;
        MsgRequestStatus[] msgRequestStatusArr = {msgRequestStatus, msgRequestStatus2, msgRequestStatus3, msgRequestStatus4, msgRequestStatus5};
        $VALUES = msgRequestStatusArr;
        $ENTRIES = new asp(msgRequestStatusArr);
        Companion = new a();
        values$delegate = new bpn0(new com.vk.movika.sdk.android.defaultplayer.interactive.b(21));
    }

    public MsgRequestStatus(String str, int i, int i2) {
        this.id = i2;
    }

    public static LinkedHashMap h() {
        MsgRequestStatus[] values = values();
        int e = on00.e(values.length);
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (MsgRequestStatus msgRequestStatus : values) {
            linkedHashMap.put(Integer.valueOf(msgRequestStatus.id), msgRequestStatus);
        }
        return linkedHashMap;
    }

    public static MsgRequestStatus valueOf(String str) {
        return (MsgRequestStatus) Enum.valueOf(MsgRequestStatus.class, str);
    }

    public static MsgRequestStatus[] values() {
        return (MsgRequestStatus[]) $VALUES.clone();
    }

    public final int j() {
        return this.id;
    }

    public final boolean k() {
        return this == NONE || this == ACCEPTED;
    }
}
