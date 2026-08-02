package tf;

import java.util.ArrayList;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9681g;
import sf.C9684j;
import sf.D;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C9684j f99485a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final C9684j f99486b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final C9684j f99487c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private static final C9684j f99488d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final C9684j f99489e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f99490f = 0;

    static {
        C9684j c9684j = C9684j.f98719d;
        f99485a = C9684j.a.c("/");
        f99486b = C9684j.a.c("\\");
        f99487c = C9684j.a.c("/\\");
        f99488d = C9684j.a.c(".");
        f99489e = C9684j.a.c("..");
    }

    public static final int d(D d11) {
        int s11 = C9684j.s(d11.a(), f99485a);
        return s11 != -1 ? s11 : C9684j.s(d11.a(), f99486b);
    }

    public static final boolean g(D d11) {
        C9684j a11 = d11.a();
        C9684j suffix = f99489e;
        a11.getClass();
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (a11.u(a11.g() - suffix.g(), suffix, suffix.g())) {
            return d11.a().g() == 2 || d11.a().u(d11.a().g() + (-3), f99485a, 1) || d11.a().u(d11.a().g() + (-3), f99486b, 1);
        }
        return false;
    }

    public static final int h(D d11) {
        if (d11.a().g() != 0) {
            if (d11.a().n(0) != 47) {
                if (d11.a().n(0) == 92) {
                    if (d11.a().g() > 2 && d11.a().n(1) == 92) {
                        int i11 = d11.a().i(2, f99486b);
                        return i11 == -1 ? d11.a().g() : i11;
                    }
                } else if (d11.a().g() > 2 && d11.a().n(1) == 58 && d11.a().n(2) == 92) {
                    char n11 = (char) d11.a().n(0);
                    if ('a' <= n11 && n11 < '{') {
                        return 3;
                    }
                    if ('A' <= n11 && n11 < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    @NotNull
    public static final D j(@NotNull D d11, @NotNull D child, boolean z11) {
        Intrinsics.checkNotNullParameter(d11, "<this>");
        Intrinsics.checkNotNullParameter(child, "child");
        child.getClass();
        if (h(child) != -1 || child.j() != null) {
            return child;
        }
        C9684j k11 = k(d11);
        if (k11 == null && (k11 = k(child)) == null) {
            k11 = n(D.f98654b);
        }
        C9681g c9681g = new C9681g();
        c9681g.X(d11.a());
        if (c9681g.size() > 0) {
            c9681g.X(k11);
        }
        c9681g.X(child.a());
        return l(c9681g, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C9684j k(D d11) {
        C9684j a11 = d11.a();
        C9684j c9684j = f99485a;
        if (C9684j.l(a11, c9684j) != -1) {
            return c9684j;
        }
        C9684j a12 = d11.a();
        C9684j c9684j2 = f99486b;
        if (C9684j.l(a12, c9684j2) != -1) {
            return c9684j2;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0117 A[EDGE_INSN: B:68:0x0117->B:69:0x0117 BREAK  A[LOOP:1: B:20:0x00b4->B:36:0x00b4], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ae  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final D l(@NotNull C9681g c9681g, boolean z11) {
        C9684j c9684j;
        long j11;
        char o11;
        boolean m11;
        C9684j c9684j2;
        int size;
        int i11;
        C9684j w11;
        Intrinsics.checkNotNullParameter(c9681g, "<this>");
        C9681g c9681g2 = new C9681g();
        C9684j c9684j3 = null;
        int i12 = 0;
        while (true) {
            if (!c9681g.w1(0L, f99485a)) {
                c9684j = f99486b;
                if (!c9681g.w1(0L, c9684j)) {
                    break;
                }
            }
            byte readByte = c9681g.readByte();
            if (c9684j3 == null) {
                c9684j3 = m(readByte);
            }
            i12++;
        }
        boolean z12 = i12 >= 2 && Intrinsics.d(c9684j3, c9684j);
        C9684j c9684j4 = f99487c;
        if (z12) {
            Intrinsics.f(c9684j3);
            c9681g2.X(c9684j3);
            c9681g2.X(c9684j3);
        } else if (i12 > 0) {
            Intrinsics.f(c9684j3);
            c9681g2.X(c9684j3);
        } else {
            long F02 = c9681g.F0(c9684j4);
            if (c9684j3 == null) {
                c9684j3 = F02 == -1 ? n(D.f98654b) : m(c9681g.o(F02));
            }
            if (Intrinsics.d(c9684j3, c9684j) && c9681g.size() >= 2) {
                j11 = -1;
                if (c9681g.o(1L) == 58 && (('a' <= (o11 = (char) c9681g.o(0L)) && o11 < '{') || ('A' <= o11 && o11 < '['))) {
                    if (F02 == 2) {
                        c9681g2.z0(c9681g, 3L);
                    } else {
                        c9681g2.z0(c9681g, 2L);
                    }
                }
                boolean z13 = c9681g2.size() <= 0;
                ArrayList arrayList = new ArrayList();
                while (true) {
                    m11 = c9681g.m();
                    c9684j2 = f99488d;
                    if (!m11) {
                        break;
                    }
                    long F03 = c9681g.F0(c9684j4);
                    if (F03 == j11) {
                        w11 = c9681g.v0();
                    } else {
                        w11 = c9681g.w(F03);
                        c9681g.readByte();
                    }
                    C9684j c9684j5 = f99489e;
                    if (Intrinsics.d(w11, c9684j5)) {
                        if (!z13 || !arrayList.isEmpty()) {
                            if (!z11 || (!z13 && (arrayList.isEmpty() || Intrinsics.d(C7714v.X(arrayList), c9684j5)))) {
                                arrayList.add(w11);
                            } else if (!z12 || arrayList.size() != 1) {
                                C7714v.x0(arrayList);
                            }
                        }
                    } else if (!Intrinsics.d(w11, c9684j2) && !Intrinsics.d(w11, C9684j.f98719d)) {
                        arrayList.add(w11);
                    }
                }
                size = arrayList.size();
                for (i11 = 0; i11 < size; i11++) {
                    if (i11 > 0) {
                        c9681g2.X(c9684j3);
                    }
                    c9681g2.X((C9684j) arrayList.get(i11));
                }
                if (c9681g2.size() == 0) {
                    c9681g2.X(c9684j2);
                }
                return new D(c9681g2.v0());
            }
        }
        j11 = -1;
        if (c9681g2.size() <= 0) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            m11 = c9681g.m();
            c9684j2 = f99488d;
            if (!m11) {
            }
        }
        size = arrayList2.size();
        while (i11 < size) {
        }
        if (c9681g2.size() == 0) {
        }
        return new D(c9681g2.v0());
    }

    private static final C9684j m(byte b11) {
        if (b11 == 47) {
            return f99485a;
        }
        if (b11 == 92) {
            return f99486b;
        }
        throw new IllegalArgumentException(Ej.b.a(b11, "not a directory separator: "));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C9684j n(String str) {
        if (Intrinsics.d(str, "/")) {
            return f99485a;
        }
        if (Intrinsics.d(str, "\\")) {
            return f99486b;
        }
        throw new IllegalArgumentException(Nk.a.b("not a directory separator: ", str));
    }
}
