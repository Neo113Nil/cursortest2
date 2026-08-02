package B1;

import e1.AbstractC4134a;
import h1.C4418n;
import h1.InterfaceC4411g;

/* loaded from: classes.dex */
public abstract class a extends m {
    private int[] firstSampleIndices;

    /* renamed from: k, reason: collision with root package name */
    public final long f530k;

    /* renamed from: l, reason: collision with root package name */
    public final long f531l;

    /* renamed from: m, reason: collision with root package name */
    public c f532m;

    public a(InterfaceC4411g interfaceC4411g, C4418n c4418n, androidx.media3.common.a aVar, int i10, Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(interfaceC4411g, c4418n, aVar, i10, obj, j10, j11, j14);
        this.f530k = j12;
        this.f531l = j13;
    }

    public final int i(int i10) {
        return ((int[]) AbstractC4134a.i(this.firstSampleIndices))[i10];
    }

    public final c j() {
        return (c) AbstractC4134a.i(this.f532m);
    }

    public void k(c cVar) {
        this.f532m = cVar;
        this.firstSampleIndices = cVar.a();
    }
}
