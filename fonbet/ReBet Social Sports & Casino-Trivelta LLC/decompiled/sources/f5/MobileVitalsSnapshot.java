package f5;

import Zh.B;
import Zh.InterfaceC1901b;
import Zh.n;
import di.C;
import di.F0;
import di.J0;
import di.N;
import di.U0;
import e5.AbstractC4178a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@n
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u0000 -2\u00020\u0001:\u0002!\u0016B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nBE\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b!\u0010'R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'¨\u0006."}, d2 = {"Lf5/j;", "", "Le5/a;", "units", "", "min", "max", "avg", "p95", "<init>", "(Le5/a;DDDD)V", "", "seen0", "Ldi/U0;", "serializationConstructorMarker", "(ILe5/a;DDDDLdi/U0;)V", "self", "Lci/d;", "output", "Lbi/f;", "serialDesc", "", com.google.crypto.tink.integration.android.b.f37029b, "(Lf5/j;Lci/d;Lbi/f;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Le5/a;", "getUnits", "()Le5/a;", "D", "getMin", "()D", "c", "getMax", W9.d.f13160a, com.bumptech.glide.gifdecoder.e.f29601m, "getP95", "Companion", "library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: f5.j, reason: from toString */
/* loaded from: classes2.dex */
public final /* data */ class MobileVitalsSnapshot {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    public final AbstractC4178a units;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    public final double min;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public final double max;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    public final double avg;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public final double p95;

    /* renamed from: f5.j$a */
    public /* synthetic */ class a implements N {

        /* renamed from: a, reason: collision with root package name */
        public static final a f46422a;

        @NotNull
        private static final bi.f descriptor;

        static {
            a aVar = new a();
            f46422a = aVar;
            J0 j02 = new J0("com.coralogix.android.sdk.internal.features.instrumentations.vitals.detectors.MobileVitalsSnapshot", aVar, 5);
            j02.n("units", false);
            j02.n("min", false);
            j02.n("max", false);
            j02.n("avg", false);
            j02.n("p95", false);
            descriptor = j02;
        }

        @Override // Zh.InterfaceC1900a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MobileVitalsSnapshot deserialize(ci.e decoder) {
            int i10;
            AbstractC4178a abstractC4178a;
            double d10;
            double d11;
            double d12;
            double d13;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            bi.f fVar = descriptor;
            ci.c c10 = decoder.c(fVar);
            int i11 = 3;
            AbstractC4178a abstractC4178a2 = null;
            if (c10.q()) {
                AbstractC4178a abstractC4178a3 = (AbstractC4178a) c10.i(fVar, 0, AbstractC4178a.f.f45652a, null);
                double B10 = c10.B(fVar, 1);
                double B11 = c10.B(fVar, 2);
                double B12 = c10.B(fVar, 3);
                abstractC4178a = abstractC4178a3;
                d10 = c10.B(fVar, 4);
                i10 = 31;
                d11 = B10;
                d12 = B11;
                d13 = B12;
            } else {
                double d14 = 0.0d;
                boolean z10 = true;
                int i12 = 0;
                double d15 = 0.0d;
                double d16 = 0.0d;
                double d17 = 0.0d;
                while (z10) {
                    int e10 = c10.e(fVar);
                    if (e10 == -1) {
                        z10 = false;
                    } else if (e10 == 0) {
                        abstractC4178a2 = (AbstractC4178a) c10.i(fVar, 0, AbstractC4178a.f.f45652a, abstractC4178a2);
                        i12 |= 1;
                    } else if (e10 == 1) {
                        d15 = c10.B(fVar, 1);
                        i12 |= 2;
                    } else if (e10 == 2) {
                        d16 = c10.B(fVar, 2);
                        i12 |= 4;
                    } else if (e10 == i11) {
                        d17 = c10.B(fVar, i11);
                        i12 |= 8;
                    } else {
                        if (e10 != 4) {
                            throw new B(e10);
                        }
                        d14 = c10.B(fVar, 4);
                        i12 |= 16;
                    }
                    i11 = 3;
                }
                i10 = i12;
                abstractC4178a = abstractC4178a2;
                d10 = d14;
                d11 = d15;
                d12 = d16;
                d13 = d17;
            }
            c10.b(fVar);
            return new MobileVitalsSnapshot(i10, abstractC4178a, d11, d12, d13, d10, null);
        }

        @Override // Zh.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void serialize(ci.f encoder, MobileVitalsSnapshot value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            bi.f fVar = descriptor;
            ci.d c10 = encoder.c(fVar);
            MobileVitalsSnapshot.b(value, c10, fVar);
            c10.b(fVar);
        }

        @Override // di.N
        public final InterfaceC1901b[] childSerializers() {
            C c10 = C.f45283a;
            return new InterfaceC1901b[]{AbstractC4178a.f.f45652a, c10, c10, c10, c10};
        }

        @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
        public final bi.f getDescriptor() {
            return descriptor;
        }

        @Override // di.N
        public InterfaceC1901b[] typeParametersSerializers() {
            return N.a.a(this);
        }
    }

    /* renamed from: f5.j$b, reason: from kotlin metadata */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        public final InterfaceC1901b serializer() {
            return a.f46422a;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ MobileVitalsSnapshot(int i10, AbstractC4178a abstractC4178a, double d10, double d11, double d12, double d13, U0 u02) {
        if (31 != (i10 & 31)) {
            F0.a(i10, 31, a.f46422a.getDescriptor());
        }
        this.units = abstractC4178a;
        this.min = d10;
        this.max = d11;
        this.avg = d12;
        this.p95 = d13;
    }

    public static final /* synthetic */ void b(MobileVitalsSnapshot self, ci.d output, bi.f serialDesc) {
        output.B(serialDesc, 0, AbstractC4178a.f.f45652a, self.units);
        output.k(serialDesc, 1, self.min);
        output.k(serialDesc, 2, self.max);
        output.k(serialDesc, 3, self.avg);
        output.k(serialDesc, 4, self.p95);
    }

    /* renamed from: a, reason: from getter */
    public final double getAvg() {
        return this.avg;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileVitalsSnapshot)) {
            return false;
        }
        MobileVitalsSnapshot mobileVitalsSnapshot = (MobileVitalsSnapshot) other;
        return Intrinsics.areEqual(this.units, mobileVitalsSnapshot.units) && Double.compare(this.min, mobileVitalsSnapshot.min) == 0 && Double.compare(this.max, mobileVitalsSnapshot.max) == 0 && Double.compare(this.avg, mobileVitalsSnapshot.avg) == 0 && Double.compare(this.p95, mobileVitalsSnapshot.p95) == 0;
    }

    public int hashCode() {
        return (((((((this.units.hashCode() * 31) + Double.hashCode(this.min)) * 31) + Double.hashCode(this.max)) * 31) + Double.hashCode(this.avg)) * 31) + Double.hashCode(this.p95);
    }

    public String toString() {
        return "MobileVitalsSnapshot(units=" + this.units + ", min=" + this.min + ", max=" + this.max + ", avg=" + this.avg + ", p95=" + this.p95 + ")";
    }

    public MobileVitalsSnapshot(AbstractC4178a units, double d10, double d11, double d12, double d13) {
        Intrinsics.checkNotNullParameter(units, "units");
        this.units = units;
        this.min = d10;
        this.max = d11;
        this.avg = d12;
        this.p95 = d13;
    }
}
