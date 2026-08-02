package io.sentry.cache.tape;

import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public int f16262a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f16263b;

    /* renamed from: c, reason: collision with root package name */
    public int f16264c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f16265d;

    public g(h hVar) {
        this.f16265d = hVar;
        this.f16263b = hVar.f16271e.f16260a;
        this.f16264c = hVar.f16274h;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        h hVar = this.f16265d;
        if (hVar.j) {
            throw new IllegalStateException("closed");
        }
        if (hVar.f16274h == this.f16264c) {
            return this.f16262a != hVar.f16270d;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte[] bArr = h.f16266k;
        h hVar = this.f16265d;
        if (hVar.j) {
            throw new IllegalStateException("closed");
        }
        if (hVar.f16274h != this.f16264c) {
            throw new ConcurrentModificationException();
        }
        int i5 = hVar.f16270d;
        if (i5 == 0) {
            throw new NoSuchElementException();
        }
        if (this.f16262a >= i5) {
            throw new NoSuchElementException();
        }
        try {
            f t3 = hVar.t(this.f16263b);
            int i10 = t3.f16261b;
            long j = t3.f16260a;
            byte[] bArr2 = new byte[i10];
            long j6 = j + 4;
            long W = hVar.W(j6);
            this.f16263b = W;
            if (!hVar.R(i10, W, bArr2)) {
                this.f16262a = hVar.f16270d;
                return bArr;
            }
            this.f16263b = hVar.W(j6 + i10);
            this.f16262a++;
            return bArr2;
        } catch (IOException e7) {
            throw e7;
        } catch (OutOfMemoryError unused) {
            hVar.O();
            this.f16262a = hVar.f16270d;
            return bArr;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        h hVar = this.f16265d;
        if (hVar.f16274h != this.f16264c) {
            throw new ConcurrentModificationException();
        }
        if (hVar.f16270d == 0) {
            throw new NoSuchElementException();
        }
        if (this.f16262a != 1) {
            throw new UnsupportedOperationException("Removal is only permitted from the head.");
        }
        hVar.K(1);
        this.f16264c = hVar.f16274h;
        this.f16262a--;
    }
}
