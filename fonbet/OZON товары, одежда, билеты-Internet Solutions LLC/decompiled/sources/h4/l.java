package h4;

import N3.G;
import c4.b;
import j3.v;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import m3.C8050C;

/* loaded from: classes.dex */
final class l {

    /* renamed from: d, reason: collision with root package name */
    private static final O7.m f64902d = O7.m.c(':');

    /* renamed from: e, reason: collision with root package name */
    private static final O7.m f64903e = O7.m.c('*');

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f64904a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private int f64905b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f64906c;

    /* loaded from: classes8.dex */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f64907a;

        /* renamed from: b, reason: collision with root package name */
        public final int f64908b;

        public a(long j11, int i11) {
            this.f64907a = j11;
            this.f64908b = i11;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(N3.q qVar, G g10, ArrayList arrayList) throws IOException {
        char c11;
        char c12;
        int i11 = 4;
        int i12 = this.f64905b;
        if (i12 == 0) {
            long length = qVar.getLength();
            g10.f18501a = (length == -1 || length < 8) ? 0L : length - 8;
            this.f64905b = 1;
            return;
        }
        if (i12 == 1) {
            C8050C c8050c = new C8050C(8);
            qVar.readFully(c8050c.e(), 0, 8);
            this.f64906c = c8050c.s() + 8;
            if (c8050c.p() != 1397048916) {
                g10.f18501a = 0L;
                return;
            } else {
                g10.f18501a = qVar.getPosition() - (this.f64906c - 12);
                this.f64905b = 2;
                return;
            }
        }
        ArrayList arrayList2 = this.f64904a;
        char c13 = 2820;
        int i13 = 8;
        short s11 = 2819;
        short s12 = 2192;
        if (i12 == 2) {
            long length2 = qVar.getLength();
            int i14 = this.f64906c - 20;
            C8050C c8050c2 = new C8050C(i14);
            qVar.readFully(c8050c2.e(), 0, i14);
            int i15 = 0;
            while (i15 < i14 / 12) {
                c8050c2.S(2);
                short u11 = c8050c2.u();
                if (u11 != s12 && u11 != 2816 && u11 != 2817 && u11 != s11) {
                    if (u11 != 2820) {
                        c8050c2.S(i13);
                        i15++;
                        s11 = 2819;
                        s12 = 2192;
                        i13 = 8;
                    }
                }
                arrayList2.add(new a((length2 - this.f64906c) - c8050c2.s(), c8050c2.s()));
                i15++;
                s11 = 2819;
                s12 = 2192;
                i13 = 8;
            }
            if (arrayList2.isEmpty()) {
                g10.f18501a = 0L;
                return;
            } else {
                this.f64905b = 3;
                g10.f18501a = ((a) arrayList2.get(0)).f64907a;
                return;
            }
        }
        if (i12 != 3) {
            throw new IllegalStateException();
        }
        long position = qVar.getPosition();
        int length3 = (int) ((qVar.getLength() - qVar.getPosition()) - this.f64906c);
        C8050C c8050c3 = new C8050C(length3);
        qVar.readFully(c8050c3.e(), 0, length3);
        int i16 = 0;
        while (i16 < arrayList2.size()) {
            a aVar = (a) arrayList2.get(i16);
            c8050c3.R((int) (aVar.f64907a - position));
            c8050c3.S(i11);
            int s13 = c8050c3.s();
            Charset charset = StandardCharsets.UTF_8;
            String C11 = c8050c3.C(s13, charset);
            switch (C11.hashCode()) {
                case -1711564334:
                    if (C11.equals("SlowMotion_Data")) {
                        c11 = 0;
                        break;
                    }
                    break;
                case -1332107749:
                    if (C11.equals("Super_SlowMotion_Edit_Data")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case -1251387154:
                    if (C11.equals("Super_SlowMotion_Data")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case -830665521:
                    if (C11.equals("Super_SlowMotion_Deflickering_On")) {
                        c11 = 3;
                        break;
                    }
                    break;
                case 1760745220:
                    if (C11.equals("Super_SlowMotion_BGM")) {
                        c11 = 4;
                        break;
                    }
                    break;
            }
            c11 = 65535;
            switch (c11) {
                case 0:
                    c12 = 2192;
                    break;
                case 1:
                    c12 = 2819;
                    break;
                case 2:
                    c12 = 2816;
                    break;
                case 3:
                    c12 = c13;
                    break;
                case 4:
                    c12 = 2817;
                    break;
                default:
                    throw v.a(null, "Invalid SEF name");
            }
            int i17 = aVar.f64908b - (s13 + 8);
            if (c12 == 2192) {
                ArrayList arrayList3 = new ArrayList();
                List<String> d11 = f64903e.d(c8050c3.C(i17, charset));
                for (int i18 = 0; i18 < d11.size(); i18++) {
                    List<String> d12 = f64902d.d(d11.get(i18));
                    if (d12.size() != 3) {
                        throw v.a(null, null);
                    }
                    try {
                        arrayList3.add(new b.a(1 << (Integer.parseInt(d12.get(2)) - 1), Long.parseLong(d12.get(0)), Long.parseLong(d12.get(1))));
                    } catch (NumberFormatException e11) {
                        throw v.a(e11, null);
                    }
                }
                arrayList.add(new c4.b(arrayList3));
            } else if (c12 != 2816 && c12 != 2817 && c12 != 2819 && c12 != c13) {
                throw new IllegalStateException();
            }
            i16++;
            i11 = 4;
            c13 = 2820;
        }
        g10.f18501a = 0L;
    }

    public final void b() {
        this.f64904a.clear();
        this.f64905b = 0;
    }
}
