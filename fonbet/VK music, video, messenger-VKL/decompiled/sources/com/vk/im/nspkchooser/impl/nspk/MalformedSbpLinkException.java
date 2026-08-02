package com.vk.im.nspkchooser.impl.nspk;

import java.net.MalformedURLException;

/* compiled from: MalformedSbpLinkException.kt */
/* loaded from: classes2.dex */
public final class MalformedSbpLinkException extends MalformedURLException {
    private final Throwable cause;

    public MalformedSbpLinkException(String str, IllegalArgumentException illegalArgumentException) {
        super(str);
        this.cause = illegalArgumentException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.cause;
    }
}
