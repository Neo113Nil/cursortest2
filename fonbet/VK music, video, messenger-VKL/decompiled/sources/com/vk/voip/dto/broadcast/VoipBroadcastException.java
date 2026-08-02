package com.vk.voip.dto.broadcast;

/* compiled from: VoipBroadcastException.kt */
/* loaded from: classes7.dex */
public class VoipBroadcastException extends Exception {
    private final int code;
    private final String detailMessage;

    public VoipBroadcastException(int i, String str) {
        super(str);
        this.code = i;
        this.detailMessage = str;
    }

    public final int d() {
        return this.code;
    }
}
