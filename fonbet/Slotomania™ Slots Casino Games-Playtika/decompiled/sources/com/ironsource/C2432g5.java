package com.ironsource;

import java.util.Date;

/* renamed from: com.ironsource.g5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2432g5 {
    private long a = new Date().getTime();

    public static long a(C2432g5 c2432g5) {
        if (c2432g5 == null) {
            return 0L;
        }
        return new Date().getTime() - c2432g5.a;
    }
}
