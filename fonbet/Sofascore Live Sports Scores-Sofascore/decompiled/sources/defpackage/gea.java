package defpackage;

import java.util.ArrayList;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class gea implements k0a {
    public static final /* synthetic */ long b;
    public static final /* synthetic */ long c;
    public static final /* synthetic */ long d;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public final ydd a;

    static {
        Unsafe unsafe = rh0.a;
        c = unsafe.objectFieldOffset(gea.class.getDeclaredField("_isCompleting$volatile"));
        d = unsafe.objectFieldOffset(gea.class.getDeclaredField("_rootCause$volatile"));
        b = unsafe.objectFieldOffset(gea.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public gea(ydd yddVar, Throwable th) {
        this.a = yddVar;
        this._rootCause$volatile = th;
    }

    public final void a(Throwable th) {
        Throwable c2 = c();
        if (c2 == null) {
            rh0.a.putObjectVolatile(this, d, th);
            return;
        }
        if (th == c2) {
            return;
        }
        Unsafe unsafe = rh0.a;
        long j = b;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            unsafe.putObjectVolatile(this, j, th);
            return;
        }
        if (!(objectVolatile instanceof Throwable)) {
            if (objectVolatile instanceof ArrayList) {
                ((ArrayList) objectVolatile).add(th);
                return;
            } else {
                cp4.g(objectVolatile, "State is ");
                return;
            }
        }
        if (th == objectVolatile) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(objectVolatile);
        arrayList.add(th);
        unsafe.putObjectVolatile(this, j, arrayList);
    }

    @Override // defpackage.k0a
    public final ydd b() {
        return this.a;
    }

    public final Throwable c() {
        return (Throwable) rh0.a.getObjectVolatile(this, d);
    }

    public final boolean d() {
        return c() != null;
    }

    public final boolean e() {
        return rh0.a.getIntVolatile(this, c) == 1;
    }

    public final ArrayList f(Throwable th) {
        ArrayList arrayList;
        Unsafe unsafe = rh0.a;
        long j = b;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            arrayList = new ArrayList(4);
        } else if (objectVolatile instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objectVolatile);
            arrayList = arrayList2;
        } else {
            if (!(objectVolatile instanceof ArrayList)) {
                cp4.g(objectVolatile, "State is ");
                return null;
            }
            arrayList = (ArrayList) objectVolatile;
        }
        Throwable c2 = c();
        if (c2 != null) {
            arrayList.add(0, c2);
        }
        if (th != null && !th.equals(c2)) {
            arrayList.add(th);
        }
        unsafe.putObjectVolatile(this, j, lea.e);
        return arrayList;
    }

    @Override // defpackage.k0a
    public final boolean isActive() {
        return c() == null;
    }

    public final String toString() {
        return "Finishing[cancelling=" + d() + ", completing=" + e() + ", rootCause=" + c() + ", exceptions=" + rh0.a.getObjectVolatile(this, b) + ", list=" + this.a + ']';
    }
}
