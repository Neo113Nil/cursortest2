package l4;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.m;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k4.i;
import k4.k;
import k4.n;
import l3.C7855a;
import m3.C8050C;
import m3.s;
import ru.ozon.fintech.ui.dots.BaseDotsIndicator;

/* renamed from: l4.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7865a extends AbstractC7869e {

    /* renamed from: i, reason: collision with root package name */
    private final int f72678i;

    /* renamed from: j, reason: collision with root package name */
    private final int f72679j;

    /* renamed from: k, reason: collision with root package name */
    private final int f72680k;

    /* renamed from: o, reason: collision with root package name */
    private List<C7855a> f72684o;

    /* renamed from: p, reason: collision with root package name */
    private List<C7855a> f72685p;

    /* renamed from: q, reason: collision with root package name */
    private int f72686q;

    /* renamed from: r, reason: collision with root package name */
    private int f72687r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f72688s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f72689t;

    /* renamed from: u, reason: collision with root package name */
    private byte f72690u;

    /* renamed from: v, reason: collision with root package name */
    private byte f72691v;

    /* renamed from: x, reason: collision with root package name */
    private boolean f72693x;

    /* renamed from: y, reason: collision with root package name */
    private long f72694y;

    /* renamed from: z, reason: collision with root package name */
    private static final int[] f72676z = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: A, reason: collision with root package name */
    private static final int[] f72669A = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: B, reason: collision with root package name */
    private static final int[] f72670B = {-1, -16711936, -16776961, BaseDotsIndicator.DEFAULT_POINT_COLOR, -65536, -256, -65281};

    /* renamed from: C, reason: collision with root package name */
    private static final int[] f72671C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, m.e.DEFAULT_SWIPE_ANIMATION_DURATION, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: D, reason: collision with root package name */
    private static final int[] f72672D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: E, reason: collision with root package name */
    private static final int[] f72673E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, m.e.DEFAULT_DRAG_ANIMATION_DURATION, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: F, reason: collision with root package name */
    private static final int[] f72674F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: G, reason: collision with root package name */
    private static final boolean[] f72675G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: h, reason: collision with root package name */
    private final C8050C f72677h = new C8050C();

    /* renamed from: m, reason: collision with root package name */
    private final ArrayList<C1212a> f72682m = new ArrayList<>();

    /* renamed from: n, reason: collision with root package name */
    private C1212a f72683n = new C1212a(0, 4);

    /* renamed from: w, reason: collision with root package name */
    private int f72692w = 0;

    /* renamed from: l, reason: collision with root package name */
    private final long f72681l = 16000000;

    /* renamed from: l4.a$a, reason: collision with other inner class name */
    private static final class C1212a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f72695a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f72696b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private final StringBuilder f72697c = new StringBuilder();

        /* renamed from: d, reason: collision with root package name */
        private int f72698d;

        /* renamed from: e, reason: collision with root package name */
        private int f72699e;

        /* renamed from: f, reason: collision with root package name */
        private int f72700f;

        /* renamed from: g, reason: collision with root package name */
        private int f72701g;

        /* renamed from: h, reason: collision with root package name */
        private int f72702h;

        /* renamed from: l4.a$a$a, reason: collision with other inner class name */
        private static class C1213a {

            /* renamed from: a, reason: collision with root package name */
            public final int f72703a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f72704b;

            /* renamed from: c, reason: collision with root package name */
            public int f72705c;

            public C1213a(int i11, boolean z11, int i12) {
                this.f72703a = i11;
                this.f72704b = z11;
                this.f72705c = i12;
            }
        }

        public C1212a(int i11, int i12) {
            j(i11);
            this.f72702h = i12;
        }

        private SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f72697c);
            int length = spannableStringBuilder.length();
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = 0;
            int i16 = 0;
            boolean z11 = false;
            while (true) {
                ArrayList arrayList = this.f72695a;
                if (i15 >= arrayList.size()) {
                    break;
                }
                C1213a c1213a = (C1213a) arrayList.get(i15);
                boolean z12 = c1213a.f72704b;
                int i17 = c1213a.f72703a;
                if (i17 != 8) {
                    boolean z13 = i17 == 7;
                    if (i17 != 7) {
                        i14 = C7865a.f72670B[i17];
                    }
                    z11 = z13;
                }
                int i18 = c1213a.f72705c;
                i15++;
                if (i18 != (i15 < arrayList.size() ? ((C1213a) arrayList.get(i15)).f72705c : length)) {
                    if (i11 != -1 && !z12) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i18, 33);
                        i11 = -1;
                    } else if (i11 == -1 && z12) {
                        i11 = i18;
                    }
                    if (i12 != -1 && !z11) {
                        spannableStringBuilder.setSpan(new StyleSpan(2), i12, i18, 33);
                        i12 = -1;
                    } else if (i12 == -1 && z11) {
                        i12 = i18;
                    }
                    if (i14 != i13) {
                        if (i13 != -1) {
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(i13), i16, i18, 33);
                        }
                        i13 = i14;
                        i16 = i18;
                    }
                }
            }
            if (i11 != -1 && i11 != length) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i11, length, 33);
            }
            if (i12 != -1 && i12 != length) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, length, 33);
            }
            if (i16 != length && i13 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i13), i16, length, 33);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final void e(char c11) {
            StringBuilder sb2 = this.f72697c;
            if (sb2.length() < 32) {
                sb2.append(c11);
            }
        }

        public final void f() {
            StringBuilder sb2 = this.f72697c;
            int length = sb2.length();
            if (length > 0) {
                sb2.delete(length - 1, length);
                ArrayList arrayList = this.f72695a;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C1213a c1213a = (C1213a) arrayList.get(size);
                    int i11 = c1213a.f72705c;
                    if (i11 != length) {
                        return;
                    }
                    c1213a.f72705c = i11 - 1;
                }
            }
        }

        public final C7855a g(int i11) {
            float f7;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i12 = 0;
            while (true) {
                ArrayList arrayList = this.f72696b;
                if (i12 >= arrayList.size()) {
                    break;
                }
                spannableStringBuilder.append((CharSequence) arrayList.get(i12));
                spannableStringBuilder.append('\n');
                i12++;
            }
            spannableStringBuilder.append((CharSequence) h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i13 = this.f72699e + this.f72700f;
            int length = (32 - i13) - spannableStringBuilder.length();
            int i14 = i13 - length;
            if (i11 == Integer.MIN_VALUE) {
                i11 = (this.f72701g != 2 || (Math.abs(i14) >= 3 && length >= 0)) ? (this.f72701g != 2 || i14 <= 0) ? 0 : 2 : 1;
            }
            if (i11 != 1) {
                if (i11 == 2) {
                    i13 = 32 - length;
                }
                f7 = ((i13 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f7 = 0.5f;
            }
            int i15 = this.f72698d;
            if (i15 > 7) {
                i15 -= 17;
            } else if (this.f72701g == 1) {
                i15 -= this.f72702h - 1;
            }
            C7855a.C1210a c1210a = new C7855a.C1210a();
            c1210a.o(spannableStringBuilder);
            c1210a.p(Layout.Alignment.ALIGN_NORMAL);
            c1210a.h(i15, 1);
            c1210a.k(f7);
            c1210a.l(i11);
            return c1210a.a();
        }

        public final boolean i() {
            return this.f72695a.isEmpty() && this.f72696b.isEmpty() && this.f72697c.length() == 0;
        }

        public final void j(int i11) {
            this.f72701g = i11;
            this.f72695a.clear();
            this.f72696b.clear();
            this.f72697c.setLength(0);
            this.f72698d = 15;
            this.f72699e = 0;
            this.f72700f = 0;
        }

        public final void k() {
            ArrayList arrayList = this.f72696b;
            arrayList.add(h());
            this.f72697c.setLength(0);
            this.f72695a.clear();
            int min = Math.min(this.f72702h, this.f72698d);
            while (arrayList.size() >= min) {
                arrayList.remove(0);
            }
        }

        public final void l(int i11) {
            this.f72701g = i11;
        }

        public final void m(int i11) {
            this.f72702h = i11;
        }

        public final void n(int i11, boolean z11) {
            this.f72695a.add(new C1213a(i11, z11, this.f72697c.length()));
        }
    }

    public C7865a(String str, int i11) {
        this.f72678i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i11 == 1) {
            this.f72680k = 0;
            this.f72679j = 0;
        } else if (i11 == 2) {
            this.f72680k = 1;
            this.f72679j = 0;
        } else if (i11 == 3) {
            this.f72680k = 0;
            this.f72679j = 1;
        } else if (i11 != 4) {
            s.f("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f72680k = 0;
            this.f72679j = 0;
        } else {
            this.f72680k = 1;
            this.f72679j = 1;
        }
        q(0);
        p();
        this.f72693x = true;
        this.f72694y = -9223372036854775807L;
    }

    private ArrayList o() {
        ArrayList<C1212a> arrayList = this.f72682m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i11 = 2;
        for (int i12 = 0; i12 < size; i12++) {
            C7855a g10 = arrayList.get(i12).g(LinearLayoutManager.INVALID_OFFSET);
            arrayList2.add(g10);
            if (g10 != null) {
                i11 = Math.min(i11, g10.f72607i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i13 = 0; i13 < size; i13++) {
            C7855a c7855a = (C7855a) arrayList2.get(i13);
            if (c7855a != null) {
                if (c7855a.f72607i != i11) {
                    c7855a = arrayList.get(i13).g(i11);
                    c7855a.getClass();
                }
                arrayList3.add(c7855a);
            }
        }
        return arrayList3;
    }

    private void p() {
        this.f72683n.j(this.f72686q);
        ArrayList<C1212a> arrayList = this.f72682m;
        arrayList.clear();
        arrayList.add(this.f72683n);
    }

    private void q(int i11) {
        int i12 = this.f72686q;
        if (i12 == i11) {
            return;
        }
        this.f72686q = i11;
        if (i11 != 3) {
            p();
            if (i12 == 3 || i11 == 1 || i11 == 0) {
                this.f72684o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i13 = 0;
        while (true) {
            ArrayList<C1212a> arrayList = this.f72682m;
            if (i13 >= arrayList.size()) {
                return;
            }
            arrayList.get(i13).l(i11);
            i13++;
        }
    }

    @Override // l4.AbstractC7869e, s3.d
    public final void flush() {
        super.flush();
        this.f72684o = null;
        this.f72685p = null;
        q(0);
        this.f72687r = 4;
        this.f72683n.m(4);
        p();
        this.f72688s = false;
        this.f72689t = false;
        this.f72690u = (byte) 0;
        this.f72691v = (byte) 0;
        this.f72692w = 0;
        this.f72693x = true;
        this.f72694y = -9223372036854775807L;
    }

    @Override // l4.AbstractC7869e
    protected final i g() {
        List<C7855a> list = this.f72684o;
        this.f72685p = list;
        list.getClass();
        return new C7870f(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085 A[SYNTHETIC] */
    @Override // l4.AbstractC7869e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void h(k4.m mVar) {
        boolean z11;
        ByteBuffer byteBuffer = mVar.f98184d;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        C8050C c8050c = this.f72677h;
        c8050c.P(limit, array);
        boolean z12 = false;
        while (true) {
            int a11 = c8050c.a();
            int i11 = this.f72678i;
            if (a11 < i11) {
                if (z12) {
                    int i12 = this.f72686q;
                    if (i12 == 1 || i12 == 3) {
                        this.f72684o = o();
                        this.f72694y = k();
                        return;
                    }
                    return;
                }
                return;
            }
            int E11 = i11 == 2 ? -4 : c8050c.E();
            int E12 = c8050c.E();
            int E13 = c8050c.E();
            if ((E11 & 2) == 0 && (E11 & 1) == this.f72679j) {
                byte b11 = (byte) (E12 & 127);
                byte b12 = (byte) (E13 & 127);
                if (b11 != 0 || b12 != 0) {
                    boolean z13 = this.f72688s;
                    if ((E11 & 4) == 4) {
                        boolean[] zArr = f72675G;
                        if (zArr[E12] && zArr[E13]) {
                            z11 = true;
                            this.f72688s = z11;
                            if (z11 || (b11 & 240) != 16) {
                                this.f72689t = false;
                            } else if (this.f72689t && this.f72690u == b11 && this.f72691v == b12) {
                                this.f72689t = false;
                            } else {
                                this.f72689t = true;
                                this.f72690u = b11;
                                this.f72691v = b12;
                            }
                            if (!z11) {
                                if (1 <= b11 && b11 <= 15) {
                                    this.f72693x = false;
                                } else if ((b11 & 246) == 20) {
                                    if (b12 != 32 && b12 != 47) {
                                        switch (b12) {
                                            default:
                                                switch (b12) {
                                                    case 42:
                                                    case 43:
                                                        this.f72693x = false;
                                                        break;
                                                }
                                            case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                            case 38:
                                            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                this.f72693x = true;
                                                break;
                                        }
                                    }
                                    this.f72693x = true;
                                }
                                if (this.f72693x) {
                                    int i13 = b11 & 224;
                                    if (i13 == 0) {
                                        this.f72692w = (b11 >> 3) & 1;
                                    }
                                    if (this.f72692w == this.f72680k) {
                                        if (i13 == 0) {
                                            int i14 = b11 & 247;
                                            if (i14 == 17 && (b12 & 240) == 48) {
                                                this.f72683n.e((char) f72672D[b12 & 15]);
                                            } else {
                                                int i15 = b11 & 246;
                                                if (i15 == 18 && (b12 & 224) == 32) {
                                                    this.f72683n.f();
                                                    this.f72683n.e((char) ((b11 & 1) == 0 ? f72673E[b12 & 31] : f72674F[b12 & 31]));
                                                } else if (i14 == 17 && (b12 & 240) == 32) {
                                                    this.f72683n.e(' ');
                                                    this.f72683n.n((b12 >> 1) & 7, (b12 & 1) == 1);
                                                } else if ((b11 & 240) == 16 && (b12 & 192) == 64) {
                                                    int i16 = f72676z[b11 & 7];
                                                    if ((b12 & 32) != 0) {
                                                        i16++;
                                                    }
                                                    if (i16 != this.f72683n.f72698d) {
                                                        if (this.f72686q != 1 && !this.f72683n.i()) {
                                                            C1212a c1212a = new C1212a(this.f72686q, this.f72687r);
                                                            this.f72683n = c1212a;
                                                            this.f72682m.add(c1212a);
                                                        }
                                                        this.f72683n.f72698d = i16;
                                                    }
                                                    boolean z14 = (b12 & 16) == 16;
                                                    int i17 = (b12 >> 1) & 7;
                                                    this.f72683n.n(z14 ? 8 : i17, (b12 & 1) == 1);
                                                    if (z14) {
                                                        this.f72683n.f72699e = f72669A[i17];
                                                    }
                                                } else if (i14 == 23 && b12 >= 33 && b12 <= 35) {
                                                    this.f72683n.f72700f = b12 - 32;
                                                } else if (i15 == 20 && (b12 & 240) == 32) {
                                                    if (b12 == 32) {
                                                        q(2);
                                                    } else if (b12 != 41) {
                                                        switch (b12) {
                                                            case DescriptorProtos$FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                                                                q(1);
                                                                this.f72687r = 2;
                                                                this.f72683n.m(2);
                                                                break;
                                                            case 38:
                                                                q(1);
                                                                this.f72687r = 3;
                                                                this.f72683n.m(3);
                                                                break;
                                                            case DescriptorProtos$FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                                                                q(1);
                                                                this.f72687r = 4;
                                                                this.f72683n.m(4);
                                                                break;
                                                            default:
                                                                int i18 = this.f72686q;
                                                                if (i18 != 0) {
                                                                    if (b12 == 33) {
                                                                        this.f72683n.f();
                                                                        break;
                                                                    } else {
                                                                        switch (b12) {
                                                                            case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                                                this.f72684o = Collections.EMPTY_LIST;
                                                                                if (i18 == 1 || i18 == 3) {
                                                                                    p();
                                                                                    break;
                                                                                }
                                                                            case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                                                if (i18 == 1 && !this.f72683n.i()) {
                                                                                    this.f72683n.k();
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                p();
                                                                                break;
                                                                            case 47:
                                                                                this.f72684o = o();
                                                                                p();
                                                                                break;
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        q(3);
                                                    }
                                                }
                                            }
                                        } else {
                                            C1212a c1212a2 = this.f72683n;
                                            int[] iArr = f72671C;
                                            c1212a2.e((char) iArr[(b11 & Byte.MAX_VALUE) - 32]);
                                            if ((b12 & 224) != 0) {
                                                this.f72683n.e((char) iArr[(b12 & Byte.MAX_VALUE) - 32]);
                                            }
                                        }
                                        z12 = true;
                                    }
                                }
                            } else if (z13) {
                                p();
                                z12 = true;
                            }
                        }
                    }
                    z11 = false;
                    this.f72688s = z11;
                    if (z11) {
                    }
                    this.f72689t = false;
                    if (!z11) {
                    }
                }
            }
        }
    }

    @Override // l4.AbstractC7869e, s3.d
    /* renamed from: i */
    public final n e() throws k {
        n j11;
        n e11 = super.e();
        if (e11 != null) {
            return e11;
        }
        long j12 = this.f72681l;
        if (j12 == -9223372036854775807L || this.f72694y == -9223372036854775807L || k() - this.f72694y < j12 || (j11 = j()) == null) {
            return null;
        }
        this.f72684o = Collections.EMPTY_LIST;
        this.f72694y = -9223372036854775807L;
        j11.o(k(), g(), Long.MAX_VALUE);
        return j11;
    }

    @Override // l4.AbstractC7869e
    protected final boolean l() {
        return this.f72684o != this.f72685p;
    }

    @Override // s3.d
    public final void release() {
    }
}
