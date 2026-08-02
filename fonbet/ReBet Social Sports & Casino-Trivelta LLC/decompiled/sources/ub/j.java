package ub;

/* loaded from: classes3.dex */
public interface j {

    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);


        /* renamed from: a, reason: collision with root package name */
        public final int f66244a;

        a(int i10) {
            this.f66244a = i10;
        }

        public int b() {
            return this.f66244a;
        }
    }

    a b(String str);
}
