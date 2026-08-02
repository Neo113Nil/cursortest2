package com.ironsource;

import java.util.Date;

/* renamed from: com.ironsource.g5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4328g5 {
    private long a = new Date().getTime();

    public static long a(C4328g5 c4328g5) {
        if (c4328g5 == null) {
            return 0L;
        }
        return new Date().getTime() - c4328g5.a;
    }
}
