package com.facebook.imagepipeline.nativecode;

import x8.AbstractC6803a;

/* loaded from: classes2.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f30594a;

    public static synchronized void a() {
        synchronized (d.class) {
            if (!f30594a) {
                AbstractC6803a.d("native-imagetranscoder");
                f30594a = true;
            }
        }
    }
}
