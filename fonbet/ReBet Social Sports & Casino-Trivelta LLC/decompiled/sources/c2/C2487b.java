package c2;

import H1.InterfaceC1184q;
import H1.J;
import H1.v;
import H1.w;
import H1.x;
import H1.y;
import c2.i;
import e1.AbstractC4134a;
import e1.Z;
import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: c2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2487b extends i {

    /* renamed from: n, reason: collision with root package name */
    public y f26860n;

    /* renamed from: o, reason: collision with root package name */
    public a f26861o;

    /* renamed from: c2.b$a */
    public static final class a implements g {

        /* renamed from: a, reason: collision with root package name */
        public y f26862a;

        /* renamed from: b, reason: collision with root package name */
        public y.a f26863b;

        /* renamed from: c, reason: collision with root package name */
        public long f26864c = -1;

        /* renamed from: d, reason: collision with root package name */
        public long f26865d = -1;

        public a(y yVar, y.a aVar) {
            this.f26862a = yVar;
            this.f26863b = aVar;
        }

        @Override // c2.g
        public long a(InterfaceC1184q interfaceC1184q) {
            long j10 = this.f26865d;
            if (j10 < 0) {
                return -1L;
            }
            long j11 = -(j10 + 2);
            this.f26865d = -1L;
            return j11;
        }

        @Override // c2.g
        public J b() {
            AbstractC4134a.g(this.f26864c != -1);
            return new x(this.f26862a, this.f26864c);
        }

        @Override // c2.g
        public void c(long j10) {
            long[] jArr = this.f26863b.pointSampleNumbers;
            this.f26865d = jArr[Z.h(jArr, j10, true, true)];
        }

        public void d(long j10) {
            this.f26864c = j10;
        }
    }

    public static boolean o(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean p(e1.J j10) {
        return j10.a() >= 5 && j10.M() == 127 && j10.O() == 1179402563;
    }

    @Override // c2.i
    public long f(e1.J j10) {
        if (o(j10.f())) {
            return n(j10);
        }
        return -1L;
    }

    @Override // c2.i
    public boolean i(e1.J j10, long j11, i.b bVar) {
        byte[] f10 = j10.f();
        y yVar = this.f26860n;
        if (yVar == null) {
            y yVar2 = new y(f10, 17);
            this.f26860n = yVar2;
            bVar.f26899a = yVar2.g(Arrays.copyOfRange(f10, 9, j10.j()), null).b().W("audio/ogg").P();
            return true;
        }
        if ((f10[0] & ByteCompanionObject.MAX_VALUE) == 3) {
            y.a g10 = w.g(j10);
            y b10 = yVar.b(g10);
            this.f26860n = b10;
            this.f26861o = new a(b10, g10);
            return true;
        }
        if (!o(f10)) {
            return true;
        }
        a aVar = this.f26861o;
        if (aVar != null) {
            aVar.d(j11);
            bVar.f26900b = this.f26861o;
        }
        AbstractC4134a.e(bVar.f26899a);
        return false;
    }

    @Override // c2.i
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f26860n = null;
            this.f26861o = null;
        }
    }

    public final int n(e1.J j10) {
        int i10 = (j10.f()[2] & UByte.MAX_VALUE) >> 4;
        if (i10 == 6 || i10 == 7) {
            j10.c0(4);
            j10.V();
        }
        int j11 = v.j(j10, i10);
        j10.b0(0);
        return j11;
    }
}
