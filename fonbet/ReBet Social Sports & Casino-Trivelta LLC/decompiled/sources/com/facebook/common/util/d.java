package com.facebook.common.util;

import D6.k;
import java.io.InputStream;

/* loaded from: classes2.dex */
public abstract class d {
    public static long a(InputStream inputStream, long j10) {
        k.g(inputStream);
        k.b(Boolean.valueOf(j10 >= 0));
        long j11 = j10;
        while (j11 > 0) {
            long skip = inputStream.skip(j11);
            if (skip <= 0) {
                if (inputStream.read() == -1) {
                    return j10 - j11;
                }
                skip = 1;
            }
            j11 -= skip;
        }
        return j10;
    }
}
