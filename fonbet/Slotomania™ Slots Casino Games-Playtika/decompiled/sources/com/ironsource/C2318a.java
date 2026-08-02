package com.ironsource;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

/* renamed from: com.ironsource.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2318a extends Thread {
    private static final int l = 1;
    private static final InterfaceC2336b m = new C0190a();
    private static final InterfaceC2650s9 n = new b();
    private final int d;
    private InterfaceC2336b a = m;
    private InterfaceC2650s9 b = n;
    private final Handler c = new Handler(Looper.getMainLooper());
    private String e = "";
    private boolean f = false;
    private boolean g = false;
    private volatile int h = 0;
    private int i = 1;
    private int j = 0;
    private final Runnable k = new c();

    /* renamed from: com.ironsource.a$a, reason: collision with other inner class name */
    class C0190a implements InterfaceC2336b {
        C0190a() {
        }

        @Override // com.ironsource.InterfaceC2336b
        public void a() {
        }

        @Override // com.ironsource.InterfaceC2336b
        public void b() {
            throw new RuntimeException("ANRHandler has given up");
        }
    }

    /* renamed from: com.ironsource.a$b */
    class b implements InterfaceC2650s9 {
        b() {
        }

        @Override // com.ironsource.InterfaceC2650s9
        public void a(InterruptedException interruptedException) {
            Log.w("ANRHandler", "Interrupted: " + interruptedException.getMessage());
        }
    }

    /* renamed from: com.ironsource.a$c */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2318a c2318a = C2318a.this;
            c2318a.h = (c2318a.h + 1) % Integer.MAX_VALUE;
        }
    }

    public C2318a(int i) {
        this.d = i;
    }

    public void a(int i) {
        this.i = i;
    }

    public int b() {
        return this.i;
    }

    public C2318a c() {
        this.e = null;
        return this;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        setName("|ANR-ANRHandler|");
        int i = -1;
        while (!isInterrupted() && this.j < this.i) {
            int i2 = this.h;
            this.c.post(this.k);
            try {
                Thread.sleep(this.d);
                if (this.h != i2) {
                    this.j = 0;
                } else if (this.g || !Debug.isDebuggerConnected()) {
                    this.j++;
                    this.a.a();
                    String str = C2556n4.l;
                    if (str != null && !str.trim().isEmpty()) {
                        new K5(C2556n4.l, String.valueOf(System.currentTimeMillis()), "ANR").a();
                    }
                } else {
                    if (this.h != i) {
                        Log.w("ANRHandler", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                    }
                    i = this.h;
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

    public int a() {
        return this.j;
    }

    public C2318a b(boolean z) {
        this.f = z;
        return this;
    }

    public C2318a a(InterfaceC2336b interfaceC2336b) {
        if (interfaceC2336b == null) {
            this.a = m;
            return this;
        }
        this.a = interfaceC2336b;
        return this;
    }

    public C2318a a(InterfaceC2650s9 interfaceC2650s9) {
        if (interfaceC2650s9 == null) {
            this.b = n;
            return this;
        }
        this.b = interfaceC2650s9;
        return this;
    }

    public C2318a a(String str) {
        if (str == null) {
            str = "";
        }
        this.e = str;
        return this;
    }

    public C2318a a(boolean z) {
        this.g = z;
        return this;
    }

    private String a(StackTraceElement[] stackTraceElementArr) {
        String str = "";
        if (stackTraceElementArr != null && stackTraceElementArr.length > 0) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                if (stackTraceElement != null) {
                    str = str + stackTraceElement.toString() + ";\n";
                }
            }
        }
        return str;
    }
}
