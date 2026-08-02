package com.vk.im.stability;

/* compiled from: ImMsgSendDisabledByUnstableConnection.kt */
/* loaded from: classes2.dex */
public final class ImMsgSendDisabledByUnstableConnection extends RuntimeException {
    public ImMsgSendDisabledByUnstableConnection() {
        super("Msg send is not allowed due to connection stability issue");
    }
}
