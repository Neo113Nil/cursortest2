package defpackage;

import android.content.Context;
import android.os.Looper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vf6 {
    public final Context a;
    public final on0 b;
    public final on0 c;
    public final on0 d;
    public final on0 e;
    public Looper f;
    public final c0h g;
    public final uq4 h;
    public boolean i;
    public boolean j;

    public vf6(Context context) {
        on0 on0Var = new on0(context, 1);
        on0 on0Var2 = new on0(context, 2);
        on0 on0Var3 = new on0(context, 3);
        on0 on0Var4 = new on0(context, 6);
        context.getClass();
        this.a = context;
        this.b = on0Var;
        this.c = on0Var2;
        this.d = on0Var3;
        this.e = on0Var4;
        int i = lik.a;
        Looper myLooper = Looper.myLooper();
        this.f = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.g = c0h.c;
        this.h = new uq4(lik.y(20L), lik.y(500L), 0);
    }
}
