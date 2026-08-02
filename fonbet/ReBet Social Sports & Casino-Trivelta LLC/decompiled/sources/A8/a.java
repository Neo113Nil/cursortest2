package A8;

import com.facebook.systrace.TraceListener;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f275a = new a();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: A8.a$a, reason: collision with other inner class name */
    public static final class EnumC0007a {
        private static final /* synthetic */ EnumC0007a[] $VALUES;

        /* renamed from: b, reason: collision with root package name */
        public static final EnumC0007a f276b = new EnumC0007a("THREAD", 0, 't');

        /* renamed from: c, reason: collision with root package name */
        public static final EnumC0007a f277c = new EnumC0007a("PROCESS", 1, 'p');

        /* renamed from: d, reason: collision with root package name */
        public static final EnumC0007a f278d = new EnumC0007a("GLOBAL", 2, 'g');

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ EnumEntries f279e;

        /* renamed from: a, reason: collision with root package name */
        public final char f280a;

        static {
            EnumC0007a[] a10 = a();
            $VALUES = a10;
            f279e = EnumEntriesKt.enumEntries(a10);
        }

        public EnumC0007a(String str, int i10, char c10) {
            this.f280a = c10;
        }

        public static final /* synthetic */ EnumC0007a[] a() {
            return new EnumC0007a[]{f276b, f277c, f278d};
        }

        public static EnumC0007a valueOf(String str) {
            return (EnumC0007a) Enum.valueOf(EnumC0007a.class, str);
        }

        public static EnumC0007a[] values() {
            return (EnumC0007a[]) $VALUES.clone();
        }
    }

    public static final void a(long j10, String sectionName, int i10) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        K2.a.a(sectionName, i10);
    }

    public static final void b(long j10, String sectionName, int i10, long j11) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        a(j10, sectionName, i10);
    }

    public static final void c(long j10, String sectionName) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        K2.a.c(sectionName);
    }

    public static final void d(long j10, String sectionName, String[] args, int i10) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        Intrinsics.checkNotNullParameter(args, "args");
        K2.a.c(sectionName + "|" + f275a.e(args, i10));
    }

    public static final void f(long j10, String sectionName, int i10) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        g(j10, sectionName, i10);
    }

    public static final void g(long j10, String sectionName, int i10) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        K2.a.d(sectionName, i10);
    }

    public static final void h(long j10, String sectionName, int i10, long j11) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        g(j10, sectionName, i10);
    }

    public static final void i(long j10) {
        K2.a.f();
    }

    public static final boolean j(long j10) {
        return false;
    }

    public static final void l(long j10, String sectionName, int i10) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        a(j10, sectionName, i10);
    }

    public static final void m(long j10, String counterName, int i10) {
        Intrinsics.checkNotNullParameter(counterName, "counterName");
        K2.a.j(counterName, i10);
    }

    public static final void o(long j10, String sectionName, Runnable block) {
        Intrinsics.checkNotNullParameter(sectionName, "sectionName");
        Intrinsics.checkNotNullParameter(block, "block");
        c(j10, sectionName);
        try {
            block.run();
        } finally {
            i(j10);
        }
    }

    public final String e(String[] strArr, int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 1; i11 < i10; i11 += 2) {
            String str = strArr[i11 - 1];
            String str2 = strArr[i11];
            sb2.append(str);
            sb2.append('=');
            sb2.append(str2);
            if (i11 < i10 - 1) {
                sb2.append(';');
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public static final void k(TraceListener traceListener) {
    }

    public static final void p(TraceListener traceListener) {
    }

    public static final void n(long j10, String str, EnumC0007a enumC0007a) {
    }
}
