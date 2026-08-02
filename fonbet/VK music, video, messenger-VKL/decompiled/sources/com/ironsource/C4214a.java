package com.ironsource;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import xsna.fw3;

/* renamed from: com.ironsource.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4214a extends Thread {
    private static final int l = 1;
    private static final InterfaceC4232b m = new C0212a();
    private static final InterfaceC4564t9 n = new b();
    private final int d;
    private InterfaceC4232b a = m;
    private InterfaceC4564t9 b = n;
    private final Handler c = new Handler(Looper.getMainLooper());
    private String e = "";
    private boolean f = false;
    private boolean g = false;
    private volatile int h = 0;
    private int i = 1;
    private int j = 0;
    private final Runnable k = new c();

    /* renamed from: com.ironsource.a$b */
    public class b implements InterfaceC4564t9 {
        @Override // com.ironsource.InterfaceC4564t9
        public void a(InterruptedException interruptedException) {
            interruptedException.getMessage();
        }
    }

    /* renamed from: com.ironsource.a$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4214a c4214a = C4214a.this;
            c4214a.h = (c4214a.h + 1) % Integer.MAX_VALUE;
        }
    }

    public C4214a(int i) {
        this.d = i;
    }

    public C4214a c() {
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
                    String str = C4452n4.l;
                    if (str != null && !str.trim().isEmpty()) {
                        new K5(C4452n4.l, String.valueOf(System.currentTimeMillis()), "ANR").a();
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

    public void a(int i) {
        this.i = i;
    }

    public int b() {
        return this.i;
    }

    public int a() {
        return this.j;
    }

    public C4214a b(boolean z) {
        this.f = z;
        return this;
    }

    public C4214a a(InterfaceC4232b interfaceC4232b) {
        if (interfaceC4232b == null) {
            this.a = m;
            return this;
        }
        this.a = interfaceC4232b;
        return this;
    }

    public C4214a a(InterfaceC4564t9 interfaceC4564t9) {
        if (interfaceC4564t9 == null) {
            this.b = n;
            return this;
        }
        this.b = interfaceC4564t9;
        return this;
    }

    public C4214a a(String str) {
        if (str == null) {
            str = "";
        }
        this.e = str;
        return this;
    }

    public C4214a a(boolean z) {
        this.g = z;
        return this;
    }

    private String a(StackTraceElement[] stackTraceElementArr) {
        String str = "";
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                if (stackTraceElement != null) {
                    StringBuilder e = fw3.e(str);
                    e.append(stackTraceElement.toString());
                    e.append(";\n");
                    str = e.toString();
                }
            }
        }
        return str;
    }

    /* renamed from: com.ironsource.a$a, reason: collision with other inner class name */
    public class C0212a implements InterfaceC4232b {
        @Override // com.ironsource.InterfaceC4232b
        public void b() {
            throw new RuntimeException("ANRHandler has given up");
        }

        @Override // com.ironsource.InterfaceC4232b
        public void a() {
        }
    }
}
