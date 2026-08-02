package com.github.luben.zstd;

/* loaded from: classes12.dex */
public class ZstdException extends RuntimeException {
    private long code;

    public ZstdException(long j) {
        this(Zstd.getErrorCode(j), Zstd.getErrorName(j));
    }

    public long getErrorCode() {
        return this.code;
    }

    public ZstdException(long j, String str) {
        super(str);
        this.code = j;
    }
}
