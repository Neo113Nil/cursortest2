package com.ironsource;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class I3 {
    private a a = a.NOT_READY;
    private ArrayList b = new ArrayList();
    private String c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum a {
        NOT_READY,
        READY
    }

    public I3(String str) {
        this.c = str;
    }

    public synchronized void a() {
        try {
            Object[] array = this.b.toArray();
            for (int i = 0; i < array.length; i++) {
                ((Runnable) array[i]).run();
                array[i] = null;
            }
            this.b.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void b() {
        this.a = a.NOT_READY;
    }

    public synchronized void c() {
        this.a = a.READY;
    }

    public synchronized void a(Runnable runnable) {
        if (this.a != a.READY) {
            this.b.add(runnable);
        } else {
            runnable.run();
        }
    }
}
