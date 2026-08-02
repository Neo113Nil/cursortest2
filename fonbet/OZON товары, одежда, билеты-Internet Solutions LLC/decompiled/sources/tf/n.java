package tf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.M;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;
import sf.AbstractC9686l;
import sf.C9681g;
import sf.C9687m;
import sf.D;
import sf.G;
import sf.O;
import sf.x;
import sf.z;

/* loaded from: classes10.dex */
public final class n {
    private static final LinkedHashMap a(ArrayList arrayList) {
        String str = D.f98654b;
        D a11 = D.a.a("/", false);
        LinkedHashMap l11 = U.l(new Pair(a11, new j(a11)));
        for (j jVar : C7714v.I0(new k(), arrayList)) {
            if (((j) l11.put(jVar.a(), jVar)) == null) {
                while (true) {
                    D e11 = jVar.a().e();
                    if (e11 != null) {
                        j jVar2 = (j) l11.get(e11);
                        if (jVar2 != null) {
                            jVar2.b().add(jVar.a());
                            break;
                        }
                        j jVar3 = new j(e11);
                        l11.put(e11, jVar3);
                        jVar3.b().add(jVar.a());
                        jVar = jVar3;
                    }
                }
            }
        }
        return l11;
    }

    private static final String b(int i11) {
        StringBuilder sb2 = new StringBuilder("0x");
        String num = Integer.toString(i11, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(num, "toString(this, checkRadix(radix))");
        sb2.append(num);
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01c0, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        r9 = r3.q() & 65535;
        r11 = r3.q() & 65535;
        r12 = r3.q() & 65535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r12 != (r3.q() & 65535)) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r9 != 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r11 != 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        r19 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        r3.skip(4);
        r13 = new tf.e(r3.q() & 65535, r12, r3.o() & 4294967295L);
        r3.r(r13.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
    
        r3.close();
        r5 = r5 - 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0097, code lost:
    
        if (r5 <= r19) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
    
        r3 = sf.z.d(r4.t(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a8, code lost:
    
        if (r3.o() != 117853008) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00aa, code lost:
    
        r5 = r3.o();
        r8 = r3.p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b7, code lost:
    
        if (r3.o() != 1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b9, code lost:
    
        if (r5 != 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bb, code lost:
    
        r5 = sf.z.d(r4.t(r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c3, code lost:
    
        r6 = r5.o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ca, code lost:
    
        if (r6 != 101075792) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cc, code lost:
    
        r5.skip(12);
        r6 = r5.o();
        r8 = r5.o();
        r23 = r5.p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e3, code lost:
    
        if (r23 != r5.p()) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e5, code lost:
    
        if (r6 != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e7, code lost:
    
        if (r8 != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e9, code lost:
    
        r5.skip(8);
        r21 = new tf.e(r13.b(), r23, r5.p());
        r6 = kotlin.Unit.f71690a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0100, code lost:
    
        r13 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010d, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0134, code lost:
    
        throw new java.io.IOException("bad zip: expected " + b(101075792) + " but was " + b(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0105, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0142, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0143, code lost:
    
        r5 = kotlin.Unit.f71690a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0154, code lost:
    
        r3 = new java.util.ArrayList();
        r5 = sf.z.d(r4.t(r13.a()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0165, code lost:
    
        r6 = r13.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016b, code lost:
    
        if (r19 >= r6) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x016d, code lost:
    
        r8 = d(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017b, code lost:
    
        if (r8.f() >= r13.a()) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x018a, code lost:
    
        if (((java.lang.Boolean) ((tf.g) r29).invoke(r8)).booleanValue() == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x018c, code lost:
    
        r3.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0193, code lost:
    
        r19 = r19 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019f, code lost:
    
        throw new java.io.IOException("bad zip: local file header offset >= central directory offset");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01a0, code lost:
    
        r2 = kotlin.Unit.f71690a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a2, code lost:
    
        r5.close();
        r3 = new sf.O(r27, r28, a(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ae, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b1, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0190, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b2, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01b3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b7, code lost:
    
        throw r0;
     */
    /* JADX WARN: Finally extract failed */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final O c(@NotNull D zipPath, @NotNull x fileSystem, @NotNull Function1 predicate) throws IOException {
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        AbstractC9686l m11 = fileSystem.m(zipPath);
        try {
            long size = m11.size() - 22;
            long j11 = 0;
            if (size < 0) {
                throw new IOException("not a zip: size=" + m11.size());
            }
            long max = Math.max(size - 65536, 0L);
            while (true) {
                G d11 = z.d(m11.t(size));
                try {
                    if (d11.o() == 101010256) {
                        break;
                    }
                    long j12 = j11;
                    d11.close();
                    size--;
                    if (size < max) {
                        throw new IOException("not a zip: end of central directory signature not found");
                    }
                    j11 = j12;
                } finally {
                    d11.close();
                }
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                Vd0.b.a(m11, th2);
                throw th3;
            }
        }
    }

    @NotNull
    public static final j d(@NotNull G g10) throws IOException {
        Long valueOf;
        Intrinsics.checkNotNullParameter(g10, "<this>");
        int o11 = g10.o();
        if (o11 != 33639248) {
            throw new IOException("bad zip: expected " + b(33639248) + " but was " + b(o11));
        }
        g10.skip(4L);
        short q11 = g10.q();
        int i11 = q11 & 65535;
        if ((q11 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + b(i11));
        }
        int q12 = g10.q() & 65535;
        short q13 = g10.q();
        int i12 = q13 & 65535;
        short q14 = g10.q();
        int i13 = q14 & 65535;
        if (i12 == -1) {
            valueOf = null;
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.set(14, 0);
            gregorianCalendar.set(((i13 >> 9) & 127) + 1980, ((i13 >> 5) & 15) - 1, q14 & 31, (i12 >> 11) & 31, (i12 >> 5) & 63, (q13 & 31) << 1);
            valueOf = Long.valueOf(gregorianCalendar.getTime().getTime());
        }
        Long l11 = valueOf;
        g10.o();
        L l12 = new L();
        l12.f71786a = g10.o() & 4294967295L;
        L l13 = new L();
        l13.f71786a = g10.o() & 4294967295L;
        int q15 = g10.q() & 65535;
        int q16 = g10.q() & 65535;
        int q17 = g10.q() & 65535;
        g10.skip(8L);
        L l14 = new L();
        l14.f71786a = g10.o() & 4294967295L;
        String r11 = g10.r(q15);
        if (kotlin.text.h.u(r11, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j11 = l13.f71786a == 4294967295L ? 8 : 0L;
        if (l12.f71786a == 4294967295L) {
            j11 += 8;
        }
        if (l14.f71786a == 4294967295L) {
            j11 += 8;
        }
        I i14 = new I();
        e(g10, q16, new l(i14, j11, l13, g10, l12, l14));
        if (j11 > 0 && !i14.f71783a) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String r12 = g10.r(q17);
        String str = D.f98654b;
        return new j(D.a.a("/", false).g(r11), kotlin.text.h.A(r11, "/", false), r12, l12.f71786a, l13.f71786a, q12, l11, l14.f71786a);
    }

    private static final void e(G g10, int i11, Function2 function2) {
        long j11 = i11;
        while (j11 != 0) {
            if (j11 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int q11 = g10.q() & 65535;
            long q12 = g10.q() & 65535;
            long j12 = j11 - 4;
            if (j12 < q12) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            g10.r1(q12);
            C9681g c9681g = g10.f98667b;
            long size = c9681g.size();
            function2.invoke(Integer.valueOf(q11), Long.valueOf(q12));
            long size2 = (c9681g.size() + q12) - size;
            if (size2 < 0) {
                throw new IOException(Ej.b.a(q11, "unsupported zip: too many bytes processed for "));
            }
            if (size2 > 0) {
                c9681g.skip(size2);
            }
            j11 = j12 - q12;
        }
    }

    @NotNull
    public static final C9687m f(@NotNull G g10, @NotNull C9687m basicMetadata) {
        Intrinsics.checkNotNullParameter(g10, "<this>");
        Intrinsics.checkNotNullParameter(basicMetadata, "basicMetadata");
        C9687m g11 = g(g10, basicMetadata);
        Intrinsics.f(g11);
        return g11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final C9687m g(G g10, C9687m c9687m) {
        M m11 = new M();
        m11.f71787a = c9687m != null ? c9687m.b() : 0;
        M m12 = new M();
        M m13 = new M();
        int o11 = g10.o();
        if (o11 != 67324752) {
            throw new IOException("bad zip: expected " + b(67324752) + " but was " + b(o11));
        }
        g10.skip(2L);
        short q11 = g10.q();
        int i11 = q11 & 65535;
        if ((q11 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + b(i11));
        }
        g10.skip(18L);
        int q12 = g10.q() & 65535;
        g10.skip(g10.q() & 65535);
        if (c9687m == null) {
            g10.skip(q12);
            return null;
        }
        e(g10, q12, new m(g10, m11, m12, m13));
        return new C9687m(c9687m.f(), c9687m.e(), null, c9687m.c(), (Long) m13.f71787a, (Long) m11.f71787a, (Long) m12.f71787a);
    }

    public static final void h(@NotNull G g10) {
        Intrinsics.checkNotNullParameter(g10, "<this>");
        g(g10, null);
    }
}
