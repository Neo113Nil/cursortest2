package com.facebook;

import java.security.SecureRandom;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class q extends RuntimeException {
    public static final SecureRandom a = new SecureRandom();

    public q(String str) {
        super(str);
        if (str == null || !w.q.get() || a.nextInt(100) <= 50) {
            return;
        }
        com.facebook.internal.q.a(new p(str, 0), com.facebook.internal.o.ErrorReport);
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        return message == null ? "" : message;
    }
}
