package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import xsna.x500;

/* compiled from: StableIdStorage.java */
/* loaded from: classes12.dex */
public interface p0 {

    /* compiled from: StableIdStorage.java */
    public static class a implements p0 {
        public long a;

        /* compiled from: StableIdStorage.java */
        /* renamed from: androidx.recyclerview.widget.p0$a$a, reason: collision with other inner class name */
        public class C0082a implements d {
            public final x500<Long> a = new x500<>();

            public C0082a() {
            }

            @Override // androidx.recyclerview.widget.p0.d
            public final long a(long j) {
                x500<Long> x500Var = this.a;
                Long l = x500Var.get(j);
                if (l == null) {
                    a aVar = a.this;
                    long j2 = aVar.a;
                    aVar.a = 1 + j2;
                    l = Long.valueOf(j2);
                    x500Var.put(j, l);
                }
                return l.longValue();
            }
        }

        @Override // androidx.recyclerview.widget.p0
        @NonNull
        public final d a() {
            return new C0082a();
        }
    }

    /* compiled from: StableIdStorage.java */
    public static class b implements p0 {
        public final a a = new a();

        /* compiled from: StableIdStorage.java */
        public class a implements d {
            @Override // androidx.recyclerview.widget.p0.d
            public final long a(long j) {
                return -1L;
            }
        }

        @Override // androidx.recyclerview.widget.p0
        @NonNull
        public final d a() {
            return this.a;
        }
    }

    /* compiled from: StableIdStorage.java */
    public interface d {
        long a(long j);
    }

    @NonNull
    d a();

    /* compiled from: StableIdStorage.java */
    public static class c implements p0 {
        public final a a = new a();

        @Override // androidx.recyclerview.widget.p0
        @NonNull
        public final d a() {
            return this.a;
        }

        /* compiled from: StableIdStorage.java */
        public class a implements d {
            @Override // androidx.recyclerview.widget.p0.d
            public final long a(long j) {
                return j;
            }
        }
    }
}
