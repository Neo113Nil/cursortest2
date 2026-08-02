package com.github.luben.zstd;

import java.io.IOException;

/* loaded from: classes12.dex */
public class ZstdIOException extends IOException {
    private long code;

    public ZstdIOException(long j) {
        this(Zstd.getErrorCode(j), Zstd.getErrorName(j));
    }

    public long getErrorCode() {
        return this.code;
    }

    public ZstdIOException(long j, String str) {
        super(str);
        this.code = j;
    }
}
