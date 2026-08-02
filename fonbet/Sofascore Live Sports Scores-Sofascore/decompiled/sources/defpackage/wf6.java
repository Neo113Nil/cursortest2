package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wf6 {
    public static final int q;
    public static final boolean r;
    public final Context a;
    public tmi b;
    public tmi c;
    public final on0 d;
    public tmi e;
    public final on0 f;
    public final Looper g;
    public boolean h;
    public d0h i;
    public final vvg j;
    public long k;
    public long l;
    public final uq4 m;
    public final int n;
    public final int o;
    public boolean p;

    static {
        String str = nik.a;
        String W = rz8.W(Build.DEVICE);
        q = (W.contains("emulator") || W.contains("emu64a") || W.contains("emu64x") || W.contains("generic")) ? 30000 : 10000;
        r = true;
    }

    public wf6(Context context) {
        on0 on0Var = new on0(context, 4);
        on0 on0Var2 = new on0(context, 5);
        on0 on0Var3 = new on0(context, 7);
        tr4 tr4Var = new tr4(3);
        on0 on0Var4 = new on0(context, 8);
        context.getClass();
        this.a = context;
        this.b = on0Var;
        this.c = on0Var2;
        this.d = on0Var3;
        this.e = tr4Var;
        this.f = on0Var4;
        String str = nik.a;
        Looper myLooper = Looper.myLooper();
        this.g = myLooper == null ? Looper.getMainLooper() : myLooper;
        an0 an0Var = an0.b;
        this.i = d0h.f;
        this.k = 5000L;
        this.l = 15000L;
        this.j = vvg.b;
        this.m = new uq4(nik.T(20L), nik.T(500L), 1);
        boolean z = r;
        this.n = z ? q : Integer.MAX_VALUE;
        this.o = z ? 60000 : Integer.MAX_VALUE;
        new wxf();
    }

    public final vg6 a() {
        z1a.E(!this.p);
        this.p = true;
        return new vg6(this);
    }

    public final void b(qcc qccVar) {
        z1a.E(!this.p);
        qccVar.getClass();
        this.c = new uf6(qccVar, 1);
    }
}
