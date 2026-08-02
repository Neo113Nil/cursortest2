package com.vk.im.engine.exceptions;

/* compiled from: MsgStateExceptions.kt */
/* loaded from: classes2.dex */
public final class IllegalFwdStateException extends IllegalMsgStateException {
    public IllegalFwdStateException() {
        super("Message has unknown fwds", null);
    }
}
