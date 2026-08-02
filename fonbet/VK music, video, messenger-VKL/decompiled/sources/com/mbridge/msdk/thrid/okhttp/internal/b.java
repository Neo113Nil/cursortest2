package com.mbridge.msdk.thrid.okhttp.internal;

/* compiled from: NamedRunnable.java */
/* loaded from: classes14.dex */
public abstract class b implements Runnable {
    protected final String a;

    public b(String str, Object... objArr) {
        this.a = c.a(str, objArr);
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.a);
        try {
            b();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
