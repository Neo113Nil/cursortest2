package o2;

import androidx.media3.common.a;
import e1.AbstractC4134a;
import java.util.Collections;
import java.util.List;
import o2.L;

/* renamed from: o2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5792l implements InterfaceC5793m {

    /* renamed from: a, reason: collision with root package name */
    public final List f59087a;

    /* renamed from: b, reason: collision with root package name */
    public final String f59088b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f59089c;

    /* renamed from: d, reason: collision with root package name */
    public int f59090d;

    /* renamed from: e, reason: collision with root package name */
    public int f59091e;

    /* renamed from: f, reason: collision with root package name */
    public long f59092f = -9223372036854775807L;
    private final H1.O[] outputs;

    public C5792l(List list, String str) {
        this.f59087a = list;
        this.f59088b = str;
        this.outputs = new H1.O[list.size()];
    }

    @Override // o2.InterfaceC5793m
    public void a(e1.J j10) {
        if (this.f59089c) {
            if (this.f59090d != 2 || f(j10, 32)) {
                if (this.f59090d != 1 || f(j10, 0)) {
                    int g10 = j10.g();
                    int a10 = j10.a();
                    for (H1.O o10 : this.outputs) {
                        j10.b0(g10);
                        o10.a(j10, a10);
                    }
                    this.f59091e += a10;
                }
            }
        }
    }

    @Override // o2.InterfaceC5793m
    public void b() {
        this.f59089c = false;
        this.f59092f = -9223372036854775807L;
    }

    @Override // o2.InterfaceC5793m
    public void c(boolean z10) {
        if (this.f59089c) {
            AbstractC4134a.g(this.f59092f != -9223372036854775807L);
            for (H1.O o10 : this.outputs) {
                o10.g(this.f59092f, 1, this.f59091e, 0, null);
            }
            this.f59089c = false;
        }
    }

    @Override // o2.InterfaceC5793m
    public void d(H1.r rVar, L.d dVar) {
        for (int i10 = 0; i10 < this.outputs.length; i10++) {
            L.a aVar = (L.a) this.f59087a.get(i10);
            dVar.a();
            H1.O c10 = rVar.c(dVar.c(), 3);
            c10.c(new a.b().j0(dVar.b()).W(this.f59088b).y0("application/dvbsubs").k0(Collections.singletonList(aVar.initializationData)).n0(aVar.f58980a).P());
            this.outputs[i10] = c10;
        }
    }

    @Override // o2.InterfaceC5793m
    public void e(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f59089c = true;
        this.f59092f = j10;
        this.f59091e = 0;
        this.f59090d = 2;
    }

    public final boolean f(e1.J j10, int i10) {
        if (j10.a() == 0) {
            return false;
        }
        if (j10.M() != i10) {
            this.f59089c = false;
        }
        this.f59090d--;
        return this.f59089c;
    }
}
