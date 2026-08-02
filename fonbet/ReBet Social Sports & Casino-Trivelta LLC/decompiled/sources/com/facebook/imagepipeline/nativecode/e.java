package com.facebook.imagepipeline.nativecode;

import x8.AbstractC6803a;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f30595a;

    public static synchronized void a() {
        synchronized (e.class) {
            if (!f30595a) {
                AbstractC6803a.d("static-webp");
                f30595a = true;
            }
        }
    }
}
