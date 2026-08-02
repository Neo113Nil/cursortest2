package defpackage;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bk6 {
    public static volatile bk6 e;
    public static final ReentrantLock f = new ReentrantLock();
    public final Context a;
    public final kk5 b;
    public final CopyOnWriteArrayList c;
    public final fp4 d;

    public bk6(Context context, jk5 jk5Var) {
        context.getClass();
        this.a = context;
        this.b = jk5Var;
        dad dadVar = new dad(this, 23);
        this.c = new CopyOnWriteArrayList();
        if (jk5Var != null) {
            jk5Var.b(dadVar);
        }
        this.d = new fp4(17);
        ypa.b(new h63(this, 27));
    }
}
