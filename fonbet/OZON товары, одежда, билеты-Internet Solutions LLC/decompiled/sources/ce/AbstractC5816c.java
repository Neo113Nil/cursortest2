package ce;

import org.jetbrains.annotations.NotNull;

/* renamed from: ce.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC5816c {

    /* renamed from: ce.c$a */
    public static final class a extends AbstractC5816c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f57010a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final int f57011b;

        static {
            int i11;
            int i12;
            int i13;
            d dVar = d.f57022l;
            i11 = d.f57020j;
            i12 = d.f57018h;
            i13 = d.f57019i;
            f57011b = i11 & (~(i12 | i13));
        }

        @Override // ce.AbstractC5816c
        public final int a() {
            return f57011b;
        }
    }

    /* renamed from: ce.c$b */
    public static final class b extends AbstractC5816c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final b f57012a = new b();

        @Override // ce.AbstractC5816c
        public final int a() {
            return 0;
        }
    }

    public abstract int a();

    public final String toString() {
        return getClass().getSimpleName();
    }
}
