package D1;

import D1.b;
import e1.AbstractC4134a;
import e1.Z;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g implements b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2408a;
    private a[] availableAllocations;

    /* renamed from: b, reason: collision with root package name */
    public final int f2409b;

    /* renamed from: c, reason: collision with root package name */
    public int f2410c;

    /* renamed from: d, reason: collision with root package name */
    public int f2411d;

    /* renamed from: e, reason: collision with root package name */
    public int f2412e;
    private final byte[] initialAllocationBlock;

    public g(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    @Override // D1.b
    public synchronized a a() {
        a aVar;
        try {
            this.f2411d++;
            int i10 = this.f2412e;
            if (i10 > 0) {
                a[] aVarArr = this.availableAllocations;
                int i11 = i10 - 1;
                this.f2412e = i11;
                aVar = (a) AbstractC4134a.e(aVarArr[i11]);
                this.availableAllocations[this.f2412e] = null;
            } else {
                aVar = new a(new byte[this.f2409b], 0);
                int i12 = this.f2411d;
                a[] aVarArr2 = this.availableAllocations;
                if (i12 > aVarArr2.length) {
                    this.availableAllocations = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    @Override // D1.b
    public synchronized void b(b.a aVar) {
        while (aVar != null) {
            try {
                a[] aVarArr = this.availableAllocations;
                int i10 = this.f2412e;
                this.f2412e = i10 + 1;
                aVarArr[i10] = aVar.a();
                this.f2411d--;
                aVar = aVar.next();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notifyAll();
    }

    @Override // D1.b
    public synchronized void c(a aVar) {
        a[] aVarArr = this.availableAllocations;
        int i10 = this.f2412e;
        this.f2412e = i10 + 1;
        aVarArr[i10] = aVar;
        this.f2411d--;
        notifyAll();
    }

    @Override // D1.b
    public synchronized void d() {
        try {
            int i10 = 0;
            int max = Math.max(0, Z.k(this.f2410c, this.f2409b) - this.f2411d);
            int i11 = this.f2412e;
            if (max >= i11) {
                return;
            }
            if (this.initialAllocationBlock != null) {
                int i12 = i11 - 1;
                while (i10 <= i12) {
                    a aVar = (a) AbstractC4134a.e(this.availableAllocations[i10]);
                    if (aVar.data == this.initialAllocationBlock) {
                        i10++;
                    } else {
                        a aVar2 = (a) AbstractC4134a.e(this.availableAllocations[i12]);
                        if (aVar2.data != this.initialAllocationBlock) {
                            i12--;
                        } else {
                            a[] aVarArr = this.availableAllocations;
                            aVarArr[i10] = aVar2;
                            aVarArr[i12] = aVar;
                            i12--;
                            i10++;
                        }
                    }
                }
                max = Math.max(max, i10);
                if (max >= this.f2412e) {
                    return;
                }
            }
            Arrays.fill(this.availableAllocations, max, this.f2412e, (Object) null);
            this.f2412e = max;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // D1.b
    public int e() {
        return this.f2409b;
    }

    public synchronized int f() {
        return this.f2411d * this.f2409b;
    }

    public synchronized void g() {
        if (this.f2408a) {
            h(0);
        }
    }

    public synchronized void h(int i10) {
        boolean z10 = i10 < this.f2410c;
        this.f2410c = i10;
        if (z10) {
            d();
        }
    }

    public g(boolean z10, int i10, int i11) {
        AbstractC4134a.a(i10 > 0);
        AbstractC4134a.a(i11 >= 0);
        this.f2408a = z10;
        this.f2409b = i10;
        this.f2412e = i11;
        this.availableAllocations = new a[i11 + 100];
        if (i11 <= 0) {
            this.initialAllocationBlock = null;
            return;
        }
        this.initialAllocationBlock = new byte[i11 * i10];
        for (int i12 = 0; i12 < i11; i12++) {
            this.availableAllocations[i12] = new a(this.initialAllocationBlock, i12 * i10);
        }
    }
}
