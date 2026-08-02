package com.vk.libvideo.exceptions;

import xsna.m7q;

/* compiled from: CacheException.kt */
/* loaded from: classes14.dex */
public final class CacheException extends Exception {
    private final m7q source;

    public CacheException(m7q m7qVar, Throwable th) {
        super(th);
        this.source = m7qVar;
    }

    public final m7q d() {
        return this.source;
    }
}
