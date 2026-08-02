package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class puo implements Callable {
    public final zro a;
    public final String b;
    public final String c;
    public final s9n d;
    public Method e;
    public final int f;
    public final int g;

    public puo(zro zroVar, String str, String str2, s9n s9nVar, int i, int i2) {
        this.a = zroVar;
        this.b = str;
        this.c = str2;
        this.d = s9nVar;
        this.f = i;
        this.g = i2;
    }

    public abstract void a();

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        try {
            long nanoTime = System.nanoTime();
            zro zroVar = this.a;
            Method d = zroVar.d(this.b, this.c);
            this.e = d;
            if (d == null) {
                return null;
            }
            a();
            ino inoVar = zroVar.k;
            if (inoVar == null || (i = this.f) == Integer.MIN_VALUE) {
                return null;
            }
            inoVar.a(this.g, i, (System.nanoTime() - nanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
