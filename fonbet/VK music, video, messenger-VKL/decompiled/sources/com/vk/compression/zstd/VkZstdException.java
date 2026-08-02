package com.vk.compression.zstd;

/* compiled from: VkZstdException.kt */
/* loaded from: classes17.dex */
public final class VkZstdException extends RuntimeException {
    private final long errorCode;

    public VkZstdException(long j, String str) {
        super(str);
        this.errorCode = j;
    }

    public final long d() {
        return this.errorCode;
    }
}
