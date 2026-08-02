package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class nw1 implements j1g {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public nw1(Resources resources, j1g j1gVar) {
        this.a = 0;
        this.c = resources;
        this.b = j1gVar;
    }

    @Override // defpackage.j1g
    public final boolean a(Object obj, uvd uvdVar) {
        switch (this.a) {
            case 0:
                return ((j1g) this.b).a(obj, uvdVar);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                return true;
        }
    }

    @Override // defpackage.j1g
    public final e1g b(Object obj, int i, int i2, uvd uvdVar) {
        boolean z;
        uqf uqfVar;
        ce6 ce6Var;
        switch (this.a) {
            case 0:
                e1g b = ((j1g) this.b).b(obj, i, i2, uvdVar);
                Resources resources = (Resources) this.c;
                if (b == null) {
                    return null;
                }
                return new ex1(resources, b);
            case 1:
                e1g c = ((l1g) this.b).c((Uri) obj, uvdVar);
                if (c == null) {
                    return null;
                }
                return ml4.N((dx1) this.c, (Drawable) ((yx8) c).get(), i, i2);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof uqf) {
                    uqfVar = (uqf) inputStream;
                    z = false;
                } else {
                    z = true;
                    uqfVar = new uqf(inputStream, (kn4) this.c);
                }
                ArrayDeque arrayDeque = ce6.c;
                synchronized (arrayDeque) {
                    ce6Var = (ce6) arrayDeque.poll();
                }
                if (ce6Var == null) {
                    ce6Var = new ce6();
                }
                ce6 ce6Var2 = ce6Var;
                ce6Var2.a = uqfVar;
                xub xubVar = new xub(ce6Var2);
                y3g y3gVar = new y3g(17, uqfVar, ce6Var2);
                try {
                    n75 n75Var = (n75) this.b;
                    ArrayList arrayList = n75Var.d;
                    kn4 kn4Var = n75Var.c;
                    sx2 sx2Var = new sx2();
                    w1a.m(kn4Var, "Argument must not be null");
                    sx2Var.b = kn4Var;
                    sx2Var.c = arrayList;
                    sx2Var.a = new de0(xubVar, kn4Var);
                    ex1 a = n75Var.a(sx2Var, i, i2, uvdVar, y3gVar);
                    ce6Var2.b = null;
                    ce6Var2.a = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(ce6Var2);
                    }
                    if (z) {
                        uqfVar.release();
                    }
                    return a;
                } catch (Throwable th) {
                    ce6Var2.b = null;
                    ce6Var2.a = null;
                    ArrayDeque arrayDeque2 = ce6.c;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(ce6Var2);
                        if (!z) {
                            throw th;
                        }
                        uqfVar.release();
                        throw th;
                    }
                }
        }
    }

    public /* synthetic */ nw1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
