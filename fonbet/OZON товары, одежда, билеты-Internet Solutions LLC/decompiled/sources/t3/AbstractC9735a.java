package t3;

import F3.W;
import android.util.Pair;
import j3.AbstractC7252H;

/* renamed from: t3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9735a extends AbstractC7252H {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f99007c = 0;

    /* renamed from: a, reason: collision with root package name */
    private final int f99008a;

    /* renamed from: b, reason: collision with root package name */
    private final W f99009b;

    public AbstractC9735a(W w11) {
        this.f99009b = w11;
        this.f99008a = w11.getLength();
    }

    private int g(int i11, boolean z11) {
        if (z11) {
            return this.f99009b.b(i11);
        }
        if (i11 < this.f99008a - 1) {
            return i11 + 1;
        }
        return -1;
    }

    protected abstract int a(Object obj);

    protected abstract int b(int i11);

    protected abstract int c(int i11);

    protected abstract Object d(int i11);

    protected abstract int e(int i11);

    protected abstract int f(int i11);

    @Override // j3.AbstractC7252H
    public final int getFirstWindowIndex(boolean z11) {
        if (this.f99008a != 0) {
            int e11 = z11 ? this.f99009b.e() : 0;
            while (h(e11).isEmpty()) {
                e11 = g(e11, z11);
                if (e11 == -1) {
                }
            }
            return h(e11).getFirstWindowIndex(z11) + f(e11);
        }
        return -1;
    }

    @Override // j3.AbstractC7252H
    public final int getIndexOfPeriod(Object obj) {
        int indexOfPeriod;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int a11 = a(obj2);
        if (a11 == -1 || (indexOfPeriod = h(a11).getIndexOfPeriod(obj3)) == -1) {
            return -1;
        }
        return e(a11) + indexOfPeriod;
    }

    @Override // j3.AbstractC7252H
    public final int getLastWindowIndex(boolean z11) {
        int i11 = this.f99008a;
        if (i11 != 0) {
            W w11 = this.f99009b;
            int c11 = z11 ? w11.c() : i11 - 1;
            while (h(c11).isEmpty()) {
                c11 = z11 ? w11.a(c11) : c11 > 0 ? c11 - 1 : -1;
                if (c11 == -1) {
                }
            }
            return h(c11).getLastWindowIndex(z11) + f(c11);
        }
        return -1;
    }

    @Override // j3.AbstractC7252H
    public final int getNextWindowIndex(int i11, int i12, boolean z11) {
        int c11 = c(i11);
        int f7 = f(c11);
        int nextWindowIndex = h(c11).getNextWindowIndex(i11 - f7, i12 == 2 ? 0 : i12, z11);
        if (nextWindowIndex != -1) {
            return f7 + nextWindowIndex;
        }
        int g10 = g(c11, z11);
        while (g10 != -1 && h(g10).isEmpty()) {
            g10 = g(g10, z11);
        }
        if (g10 != -1) {
            return h(g10).getFirstWindowIndex(z11) + f(g10);
        }
        if (i12 == 2) {
            return getFirstWindowIndex(z11);
        }
        return -1;
    }

    @Override // j3.AbstractC7252H
    public final AbstractC7252H.b getPeriod(int i11, AbstractC7252H.b bVar, boolean z11) {
        int b11 = b(i11);
        int f7 = f(b11);
        h(b11).getPeriod(i11 - e(b11), bVar, z11);
        bVar.f68939c += f7;
        if (z11) {
            Object d11 = d(b11);
            Object obj = bVar.f68938b;
            obj.getClass();
            bVar.f68938b = Pair.create(d11, obj);
        }
        return bVar;
    }

    @Override // j3.AbstractC7252H
    public final AbstractC7252H.b getPeriodByUid(Object obj, AbstractC7252H.b bVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int a11 = a(obj2);
        int f7 = f(a11);
        h(a11).getPeriodByUid(obj3, bVar);
        bVar.f68939c += f7;
        bVar.f68938b = obj;
        return bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0025, code lost:
    
        if (r0 > 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x002b, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x002b, code lost:
    
        r0 = r0 - 1;
     */
    @Override // j3.AbstractC7252H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int getPreviousWindowIndex(int i11, int i12, boolean z11) {
        int i13;
        int c11 = c(i11);
        int f7 = f(c11);
        int previousWindowIndex = h(c11).getPreviousWindowIndex(i11 - f7, i12 == 2 ? 0 : i12, z11);
        if (previousWindowIndex != -1) {
            return f7 + previousWindowIndex;
        }
        W w11 = this.f99009b;
        if (z11) {
            i13 = w11.a(c11);
        }
        while (i13 != -1 && h(i13).isEmpty()) {
            i13 = z11 ? w11.a(i13) : i13 > 0 ? i13 - 1 : -1;
        }
        if (i13 != -1) {
            return h(i13).getLastWindowIndex(z11) + f(i13);
        }
        if (i12 == 2) {
            return getLastWindowIndex(z11);
        }
        return -1;
    }

    @Override // j3.AbstractC7252H
    public final Object getUidOfPeriod(int i11) {
        int b11 = b(i11);
        return Pair.create(d(b11), h(b11).getUidOfPeriod(i11 - e(b11)));
    }

    @Override // j3.AbstractC7252H
    public final AbstractC7252H.c getWindow(int i11, AbstractC7252H.c cVar, long j11) {
        int c11 = c(i11);
        int f7 = f(c11);
        int e11 = e(c11);
        h(c11).getWindow(i11 - f7, cVar, j11);
        Object d11 = d(c11);
        if (!AbstractC7252H.c.f68944q.equals(cVar.f68946a)) {
            d11 = Pair.create(d11, cVar.f68946a);
        }
        cVar.f68946a = d11;
        cVar.f68959n += e11;
        cVar.f68960o += e11;
        return cVar;
    }

    protected abstract AbstractC7252H h(int i11);
}
