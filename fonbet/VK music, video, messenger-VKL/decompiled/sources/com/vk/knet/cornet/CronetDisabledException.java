package com.vk.knet.cornet;

/* compiled from: CronetDisabledException.kt */
/* loaded from: classes2.dex */
public final class CronetDisabledException extends RuntimeException {
    public static final CronetDisabledException b = new CronetDisabledException();

    private CronetDisabledException() {
    }

    private final Object readResolve() {
        return b;
    }
}
