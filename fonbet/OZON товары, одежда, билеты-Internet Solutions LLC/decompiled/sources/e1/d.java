package e1;

import F3.G;
import Z1.n;
import Z1.s;
import e1.InterfaceC6250b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class d implements InterfaceC6250b {

    /* renamed from: a, reason: collision with root package name */
    private final float f61776a;

    /* renamed from: b, reason: collision with root package name */
    private final float f61777b;

    public static final class a implements InterfaceC6250b.InterfaceC0966b {

        /* renamed from: a, reason: collision with root package name */
        private final float f61778a;

        public a(float f7) {
            this.f61778a = f7;
        }

        @Override // e1.InterfaceC6250b.InterfaceC0966b
        public final int a(int i11, int i12, @NotNull s sVar) {
            float f7 = (i12 - i11) / 2.0f;
            s sVar2 = s.Ltr;
            float f11 = this.f61778a;
            if (sVar != sVar2) {
                f11 *= -1;
            }
            return Math.round((1 + f11) * f7);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.f61778a, ((a) obj).f61778a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f61778a);
        }

        @NotNull
        public final String toString() {
            return G.a(new StringBuilder("Horizontal(bias="), this.f61778a, ')');
        }
    }

    public static final class b implements InterfaceC6250b.c {

        /* renamed from: a, reason: collision with root package name */
        private final float f61779a;

        public b(float f7) {
            this.f61779a = f7;
        }

        @Override // e1.InterfaceC6250b.c
        public final int a(int i11, int i12) {
            return Math.round((1 + this.f61779a) * ((i12 - i11) / 2.0f));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.f61779a, ((b) obj).f61779a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f61779a);
        }

        @NotNull
        public final String toString() {
            return G.a(new StringBuilder("Vertical(bias="), this.f61779a, ')');
        }
    }

    public d(float f7, float f11) {
        this.f61776a = f7;
        this.f61777b = f11;
    }

    @Override // e1.InterfaceC6250b
    public final long a(long j11, long j12, @NotNull s sVar) {
        float f7 = (((int) (j12 >> 32)) - ((int) (j11 >> 32))) / 2.0f;
        float f11 = (((int) (j12 & 4294967295L)) - ((int) (j11 & 4294967295L))) / 2.0f;
        s sVar2 = s.Ltr;
        float f12 = this.f61776a;
        if (sVar != sVar2) {
            f12 *= -1;
        }
        float f13 = 1;
        return n.a(Math.round((f12 + f13) * f7), Math.round((f13 + this.f61777b) * f11));
    }

    public final float b() {
        return this.f61776a;
    }

    public final float c() {
        return this.f61777b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.compare(this.f61776a, dVar.f61776a) == 0 && Float.compare(this.f61777b, dVar.f61777b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f61777b) + (Float.hashCode(this.f61776a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BiasAlignment(horizontalBias=");
        sb2.append(this.f61776a);
        sb2.append(", verticalBias=");
        return G.a(sb2, this.f61777b, ')');
    }
}
