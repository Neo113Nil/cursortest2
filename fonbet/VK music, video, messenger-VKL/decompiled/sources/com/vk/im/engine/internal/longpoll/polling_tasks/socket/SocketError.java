package com.vk.im.engine.internal.longpoll.polling_tasks.socket;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.ironsource.InterfaceC4319fe;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SocketError.kt */
/* loaded from: classes2.dex */
public final class SocketError {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ SocketError[] $VALUES;
    public static final SocketError BAD_PARAMS;
    public static final a Companion;
    public static final SocketError ENRICHMENT_FAILED;
    public static final SocketError FLOOD_CONTROL;
    public static final SocketError INTERNAL_ERROR;
    public static final SocketError NOT_FOUND;
    public static final SocketError OFFSET_IS_TOO_OLD;
    public static final SocketError PARSE_ERROR;
    public static final SocketError UNEXPECTED_DATA;
    public static final SocketError UNKNOWN;
    public static final SocketError UNKNOWN_METHOD;
    private final int code;

    /* compiled from: SocketError.kt */
    public static final class a {
    }

    static {
        SocketError socketError = new SocketError("ENRICHMENT_FAILED", 0, 1100);
        ENRICHMENT_FAILED = socketError;
        SocketError socketError2 = new SocketError("UNKNOWN_METHOD", 1, 1200);
        UNKNOWN_METHOD = socketError2;
        SocketError socketError3 = new SocketError("BAD_PARAMS", 2, InterfaceC4319fe.a.b);
        BAD_PARAMS = socketError3;
        SocketError socketError4 = new SocketError("INTERNAL_ERROR", 3, InterfaceC4319fe.a.c);
        INTERNAL_ERROR = socketError4;
        SocketError socketError5 = new SocketError("NOT_FOUND", 4, InterfaceC4319fe.a.g);
        NOT_FOUND = socketError5;
        SocketError socketError6 = new SocketError("PARSE_ERROR", 5, 1204);
        PARSE_ERROR = socketError6;
        SocketError socketError7 = new SocketError("FLOOD_CONTROL", 6, 1205);
        FLOOD_CONTROL = socketError7;
        SocketError socketError8 = new SocketError("UNEXPECTED_DATA", 7, 2000);
        UNEXPECTED_DATA = socketError8;
        SocketError socketError9 = new SocketError("OFFSET_IS_TOO_OLD", 8, 2001);
        OFFSET_IS_TOO_OLD = socketError9;
        SocketError socketError10 = new SocketError(GrsBaseInfo.CountryCodeSource.UNKNOWN, 9, 0);
        UNKNOWN = socketError10;
        SocketError[] socketErrorArr = {socketError, socketError2, socketError3, socketError4, socketError5, socketError6, socketError7, socketError8, socketError9, socketError10};
        $VALUES = socketErrorArr;
        $ENTRIES = new asp(socketErrorArr);
        Companion = new a();
    }

    public SocketError(String str, int i, int i2) {
        this.code = i2;
    }

    public static zrp<SocketError> i() {
        return $ENTRIES;
    }

    public static SocketError valueOf(String str) {
        return (SocketError) Enum.valueOf(SocketError.class, str);
    }

    public static SocketError[] values() {
        return (SocketError[]) $VALUES.clone();
    }

    public final int h() {
        return this.code;
    }
}
