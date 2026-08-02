package E;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public abstract class c implements Iterator, KMappedMarker {

    /* renamed from: a, reason: collision with root package name */
    public int f2909a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2910b = true;

    @NotNull
    private final k[] path;

    public c(j jVar, k[] kVarArr) {
        this.path = kVarArr;
        kVarArr[0].g(jVar.h(), jVar.e() * 2);
        this.f2909a = 0;
        b();
    }

    public final void a() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    public final void b() {
        if (this.path[this.f2909a].d()) {
            return;
        }
        for (int i10 = this.f2909a; -1 < i10; i10--) {
            int c10 = c(i10);
            if (c10 == -1 && this.path[i10].e()) {
                this.path[i10].f();
                c10 = c(i10);
            }
            if (c10 != -1) {
                this.f2909a = c10;
                return;
            }
            if (i10 > 0) {
                this.path[i10 - 1].f();
            }
            this.path[i10].g(j.f2914c.a().h(), 0);
        }
        this.f2910b = false;
    }

    public final int c(int i10) {
        if (this.path[i10].d()) {
            return i10;
        }
        if (!this.path[i10].e()) {
            return -1;
        }
        j a10 = this.path[i10].a();
        if (i10 == 6) {
            this.path[i10 + 1].g(a10.h(), a10.h().length);
        } else {
            this.path[i10 + 1].g(a10.h(), a10.e() * 2);
        }
        return c(i10 + 1);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f2910b;
    }

    @Override // java.util.Iterator
    public Object next() {
        a();
        Object next = this.path[this.f2909a].next();
        b();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
