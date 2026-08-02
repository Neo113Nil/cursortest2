package com.bumptech.glide.load;

import androidx.annotation.Nullable;
import java.io.IOException;
import xsna.na8;

/* loaded from: classes12.dex */
public final class HttpException extends IOException {
    private static final long serialVersionUID = 1;
    private final int statusCode;

    public HttpException(String str, @Nullable IOException iOException, int i) {
        super(na8.a(i, str, ", status code: "), iOException);
        this.statusCode = i;
    }
}
