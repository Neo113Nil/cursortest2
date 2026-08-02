package androidx.media3.exoplayer.source;

import com.google.common.collect.AbstractC3445z;
import e1.AbstractC4134a;
import java.util.List;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: androidx.media3.exoplayer.source.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2208i implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC3445z f21813a;

    /* renamed from: b, reason: collision with root package name */
    public long f21814b;

    /* renamed from: androidx.media3.exoplayer.source.i$a */
    public static final class a implements d0 {

        /* renamed from: a, reason: collision with root package name */
        public final d0 f21815a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC3445z f21816b;

        public a(d0 d0Var, List list) {
            this.f21815a = d0Var;
            this.f21816b = AbstractC3445z.o(list);
        }

        public AbstractC3445z a() {
            return this.f21816b;
        }

        @Override // androidx.media3.exoplayer.source.d0
        public boolean b(androidx.media3.exoplayer.k kVar) {
            return this.f21815a.b(kVar);
        }

        @Override // androidx.media3.exoplayer.source.d0
        public long d() {
            return this.f21815a.d();
        }

        @Override // androidx.media3.exoplayer.source.d0
        public boolean e() {
            return this.f21815a.e();
        }

        @Override // androidx.media3.exoplayer.source.d0
        public long g() {
            return this.f21815a.g();
        }

        @Override // androidx.media3.exoplayer.source.d0
        public void h(long j10) {
            this.f21815a.h(j10);
        }
    }

    public C2208i(List list, List list2) {
        AbstractC3445z.a k10 = AbstractC3445z.k();
        AbstractC4134a.a(list.size() == list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            k10.a(new a((d0) list.get(i10), (List) list2.get(i10)));
        }
        this.f21813a = k10.m();
        this.f21814b = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.d0
    public boolean b(androidx.media3.exoplayer.k kVar) {
        boolean z10;
        boolean z11 = false;
        do {
            long d10 = d();
            if (d10 == Long.MIN_VALUE) {
                return z11;
            }
            z10 = false;
            for (int i10 = 0; i10 < this.f21813a.size(); i10++) {
                long d11 = ((a) this.f21813a.get(i10)).d();
                boolean z12 = d11 != Long.MIN_VALUE && d11 <= kVar.f21352a;
                if (d11 == d10 || z12) {
                    z10 |= ((a) this.f21813a.get(i10)).b(kVar);
                }
            }
            z11 |= z10;
        } while (z10);
        return z11;
    }

    @Override // androidx.media3.exoplayer.source.d0
    public long d() {
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.f21813a.size(); i10++) {
            long d10 = ((a) this.f21813a.get(i10)).d();
            if (d10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, d10);
            }
        }
        if (j10 == LongCompanionObject.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.d0
    public boolean e() {
        for (int i10 = 0; i10 < this.f21813a.size(); i10++) {
            if (((a) this.f21813a.get(i10)).e()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.d0
    public long g() {
        long j10 = Long.MAX_VALUE;
        long j11 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.f21813a.size(); i10++) {
            a aVar = (a) this.f21813a.get(i10);
            long g10 = aVar.g();
            if ((aVar.a().contains(1) || aVar.a().contains(2) || aVar.a().contains(4)) && g10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, g10);
            }
            if (g10 != Long.MIN_VALUE) {
                j11 = Math.min(j11, g10);
            }
        }
        if (j10 != LongCompanionObject.MAX_VALUE) {
            this.f21814b = j10;
            return j10;
        }
        if (j11 == LongCompanionObject.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j12 = this.f21814b;
        return j12 != -9223372036854775807L ? j12 : j11;
    }

    @Override // androidx.media3.exoplayer.source.d0
    public void h(long j10) {
        for (int i10 = 0; i10 < this.f21813a.size(); i10++) {
            ((a) this.f21813a.get(i10)).h(j10);
        }
    }
}
