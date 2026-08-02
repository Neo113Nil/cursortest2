package oi;

/* loaded from: classes5.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    public static final F f61255a = a(0);

    /* renamed from: b, reason: collision with root package name */
    public static final F f61256b = a(-21600);

    /* renamed from: c, reason: collision with root package name */
    public static final F f61257c = a(21600);

    public static class b extends F {

        /* renamed from: d, reason: collision with root package name */
        public final int f61258d;

        @Override // oi.F
        public int b(InterfaceC5911g interfaceC5911g, net.time4j.tz.k kVar) {
            return this.f61258d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f61258d == ((b) obj).f61258d;
        }

        public int hashCode() {
            return this.f61258d;
        }

        public String toString() {
            return "FixedStartOfDay[" + this.f61258d + "]";
        }

        public b(int i10) {
            this.f61258d = i10;
        }
    }

    public static F a(int i10) {
        return new b(i10);
    }

    public abstract int b(InterfaceC5911g interfaceC5911g, net.time4j.tz.k kVar);
}
