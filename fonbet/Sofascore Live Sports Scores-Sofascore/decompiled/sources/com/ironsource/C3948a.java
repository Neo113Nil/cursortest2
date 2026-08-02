package com.ironsource;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import defpackage.fc6;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3948a extends Thread {
    private static final int l = 1;
    private static final InterfaceC3991b m = new C0197a();
    private static final InterfaceC4305s9 n = new b();
    private final int d;
    private InterfaceC3991b a = m;
    private InterfaceC4305s9 b = n;
    private final Handler c = new Handler(Looper.getMainLooper());
    private String e = "";
    private boolean f = false;
    private boolean g = false;
    private volatile int h = 0;
    private int i = 1;
    private int j = 0;
    private final Runnable k = new c();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.a$b */
    public class b implements InterfaceC4305s9 {
        @Override // com.ironsource.InterfaceC4305s9
        public void a(InterruptedException interruptedException) {
            interruptedException.getMessage();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.a$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3948a c3948a = C3948a.this;
            c3948a.h = (c3948a.h + 1) % Integer.MAX_VALUE;
        }
    }

    public C3948a(int i) {
        this.d = i;
    }

    private String a(StackTraceElement[] stackTraceElementArr) {
        String str = "";
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                if (stackTraceElement != null) {
                    StringBuilder q = fc6.q(str);
                    q.append(stackTraceElement.toString());
                    q.append(";\n");
                    str = q.toString();
                }
            }
        }
        return str;
    }

    public C3948a c() {
        this.e = null;
        return this;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        setName("|ANR-ANRHandler|");
        while (!isInterrupted() && this.j < this.i) {
            int i = this.h;
            this.c.post(this.k);
            try {
                Thread.sleep(this.d);
                if (this.h != i) {
                    this.j = 0;
                } else if (this.g || !Debug.isDebuggerConnected()) {
                    this.j++;
                    this.a.a();
                    String str = C4157k4.l;
                    if (str != null && !str.trim().isEmpty()) {
                        new I5(C4157k4.l, String.valueOf(System.currentTimeMillis()), "ANR").a();
                    }
                }
            } catch (InterruptedException e) {
                this.b.a(e);
                return;
            }
        }
        if (this.j >= this.i) {
            this.a.b();
        }
    }

    public int b() {
        return this.i;
    }

    public C3948a b(boolean z) {
        this.f = z;
        return this;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.a$a, reason: collision with other inner class name */
    public class C0197a implements InterfaceC3991b {
        @Override // com.ironsource.InterfaceC3991b
        public void b() {
            throw new RuntimeException("ANRHandler has given up");
        }

        @Override // com.ironsource.InterfaceC3991b
        public void a() {
        }
    }

    public void a(int i) {
        this.i = i;
    }

    public int a() {
        return this.j;
    }

    public C3948a a(InterfaceC3991b interfaceC3991b) {
        if (interfaceC3991b == null) {
            this.a = m;
            return this;
        }
        this.a = interfaceC3991b;
        return this;
    }

    public C3948a a(InterfaceC4305s9 interfaceC4305s9) {
        if (interfaceC4305s9 == null) {
            this.b = n;
            return this;
        }
        this.b = interfaceC4305s9;
        return this;
    }

    public C3948a a(String str) {
        if (str == null) {
            str = "";
        }
        this.e = str;
        return this;
    }

    public C3948a a(boolean z) {
        this.g = z;
        return this;
    }
}
