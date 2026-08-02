package K7;

import java.util.LinkedList;
import java.util.Queue;

/* renamed from: K7.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1371l {

    /* renamed from: a, reason: collision with root package name */
    public final int f6327a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6328b;

    /* renamed from: c, reason: collision with root package name */
    public final Queue f6329c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f6330d;

    /* renamed from: e, reason: collision with root package name */
    public int f6331e;

    public C1371l(int i10, int i11, int i12, boolean z10) {
        D6.k.i(i10 > 0);
        D6.k.i(i11 >= 0);
        D6.k.i(i12 >= 0);
        this.f6327a = i10;
        this.f6328b = i11;
        this.f6329c = new LinkedList();
        this.f6331e = i12;
        this.f6330d = z10;
    }

    public void a(Object obj) {
        this.f6329c.add(obj);
    }

    public void b() {
        D6.k.i(this.f6331e > 0);
        this.f6331e--;
    }

    public Object c() {
        Object g10 = g();
        if (g10 != null) {
            this.f6331e++;
        }
        return g10;
    }

    public int d() {
        return this.f6329c.size();
    }

    public void e() {
        this.f6331e++;
    }

    public boolean f() {
        return this.f6331e + d() > this.f6328b;
    }

    public Object g() {
        return this.f6329c.poll();
    }

    public void h(Object obj) {
        D6.k.g(obj);
        if (this.f6330d) {
            D6.k.i(this.f6331e > 0);
            this.f6331e--;
            a(obj);
        } else {
            int i10 = this.f6331e;
            if (i10 <= 0) {
                E6.a.o("BUCKET", "Tried to release value %s from an empty bucket!", obj);
            } else {
                this.f6331e = i10 - 1;
                a(obj);
            }
        }
    }
}
