package com.vk.im.engine.exceptions;

import xsna.mla;
import xsna.xe9;

/* compiled from: ImproperExecutionThreadException.kt */
/* loaded from: classes2.dex */
public final class ImproperExecutionThreadException extends IllegalStateException {
    private final String currentThread;
    private final String queueName;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ImproperExecutionThreadException(String str, String str2, mla mlaVar) {
        super(r0.toString());
        StringBuilder a = xe9.a("Command is run on ", str, ", but expected on ", str2, ", cause: ");
        a.append(mlaVar);
        this.currentThread = str;
        this.queueName = str2;
    }
}
