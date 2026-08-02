package l4;

import Ij.C3261b;
import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k4.i;
import k4.m;
import l3.C7855a;
import m3.C8049B;
import m3.C8050C;
import m3.C8065g;
import m3.s;

/* renamed from: l4.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7867c extends AbstractC7869e {

    /* renamed from: h, reason: collision with root package name */
    private final C8050C f72706h = new C8050C();

    /* renamed from: i, reason: collision with root package name */
    private final C8049B f72707i = new C8049B();

    /* renamed from: j, reason: collision with root package name */
    private int f72708j = -1;

    /* renamed from: k, reason: collision with root package name */
    private final int f72709k;

    /* renamed from: l, reason: collision with root package name */
    private final b[] f72710l;

    /* renamed from: m, reason: collision with root package name */
    private b f72711m;

    /* renamed from: n, reason: collision with root package name */
    private List<C7855a> f72712n;

    /* renamed from: o, reason: collision with root package name */
    private List<C7855a> f72713o;

    /* renamed from: p, reason: collision with root package name */
    private C1214c f72714p;

    /* renamed from: q, reason: collision with root package name */
    private int f72715q;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l4.c$a */
    static final class a {

        /* renamed from: c, reason: collision with root package name */
        private static final C7866b f72716c = new C7866b();

        /* renamed from: a, reason: collision with root package name */
        public final C7855a f72717a;

        /* renamed from: b, reason: collision with root package name */
        public final int f72718b;

        public a(SpannableStringBuilder spannableStringBuilder, Layout.Alignment alignment, float f7, int i11, float f11, int i12, boolean z11, int i13, int i14) {
            C7855a.C1210a c1210a = new C7855a.C1210a();
            c1210a.o(spannableStringBuilder);
            c1210a.p(alignment);
            c1210a.h(f7, 0);
            c1210a.i(i11);
            c1210a.k(f11);
            c1210a.l(i12);
            c1210a.n(-3.4028235E38f);
            if (z11) {
                c1210a.s(i13);
            }
            this.f72717a = c1210a.a();
            this.f72718b = i14;
        }
    }

    /* renamed from: l4.c$b */
    private static final class b {

        /* renamed from: A, reason: collision with root package name */
        private static final boolean[] f72719A;

        /* renamed from: B, reason: collision with root package name */
        private static final int[] f72720B;

        /* renamed from: C, reason: collision with root package name */
        private static final int[] f72721C;

        /* renamed from: D, reason: collision with root package name */
        private static final int[] f72722D;

        /* renamed from: E, reason: collision with root package name */
        private static final int[] f72723E;

        /* renamed from: v, reason: collision with root package name */
        public static final int f72724v = g(2, 2, 2, 0);

        /* renamed from: w, reason: collision with root package name */
        public static final int f72725w;

        /* renamed from: x, reason: collision with root package name */
        private static final int[] f72726x;

        /* renamed from: y, reason: collision with root package name */
        private static final int[] f72727y;

        /* renamed from: z, reason: collision with root package name */
        private static final int[] f72728z;

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f72729a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final SpannableStringBuilder f72730b = new SpannableStringBuilder();

        /* renamed from: c, reason: collision with root package name */
        private boolean f72731c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f72732d;

        /* renamed from: e, reason: collision with root package name */
        private int f72733e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f72734f;

        /* renamed from: g, reason: collision with root package name */
        private int f72735g;

        /* renamed from: h, reason: collision with root package name */
        private int f72736h;

        /* renamed from: i, reason: collision with root package name */
        private int f72737i;

        /* renamed from: j, reason: collision with root package name */
        private int f72738j;

        /* renamed from: k, reason: collision with root package name */
        private int f72739k;

        /* renamed from: l, reason: collision with root package name */
        private int f72740l;

        /* renamed from: m, reason: collision with root package name */
        private int f72741m;

        /* renamed from: n, reason: collision with root package name */
        private int f72742n;

        /* renamed from: o, reason: collision with root package name */
        private int f72743o;

        /* renamed from: p, reason: collision with root package name */
        private int f72744p;

        /* renamed from: q, reason: collision with root package name */
        private int f72745q;

        /* renamed from: r, reason: collision with root package name */
        private int f72746r;

        /* renamed from: s, reason: collision with root package name */
        private int f72747s;

        /* renamed from: t, reason: collision with root package name */
        private int f72748t;

        /* renamed from: u, reason: collision with root package name */
        private int f72749u;

        static {
            int g10 = g(0, 0, 0, 0);
            f72725w = g10;
            int g11 = g(0, 0, 0, 3);
            f72726x = new int[]{0, 0, 0, 0, 0, 2, 0};
            f72727y = new int[]{0, 0, 0, 0, 0, 0, 2};
            f72728z = new int[]{3, 3, 3, 3, 3, 3, 1};
            f72719A = new boolean[]{false, false, false, true, true, true, false};
            f72720B = new int[]{g10, g11, g10, g10, g11, g10, g10};
            f72721C = new int[]{0, 1, 2, 3, 4, 3, 4};
            f72722D = new int[]{0, 0, 0, 0, 0, 3, 3};
            f72723E = new int[]{g10, g10, g10, g10, g10, g11, g11};
        }

        public b() {
            k();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int g(int i11, int i12, int i13, int i14) {
            int i15;
            G10.a.d(i11, 4);
            G10.a.d(i12, 4);
            G10.a.d(i13, 4);
            G10.a.d(i14, 4);
            if (i14 != 0 && i14 != 1) {
                if (i14 == 2) {
                    i15 = 127;
                } else if (i14 == 3) {
                    i15 = 0;
                }
                return Color.argb(i15, i11 <= 1 ? 255 : 0, i12 <= 1 ? 255 : 0, i13 > 1 ? 255 : 0);
            }
            i15 = 255;
            return Color.argb(i15, i11 <= 1 ? 255 : 0, i12 <= 1 ? 255 : 0, i13 > 1 ? 255 : 0);
        }

        public final void a(char c11) {
            SpannableStringBuilder spannableStringBuilder = this.f72730b;
            if (c11 != '\n') {
                spannableStringBuilder.append(c11);
                return;
            }
            ArrayList arrayList = this.f72729a;
            arrayList.add(d());
            spannableStringBuilder.clear();
            if (this.f72743o != -1) {
                this.f72743o = 0;
            }
            if (this.f72744p != -1) {
                this.f72744p = 0;
            }
            if (this.f72745q != -1) {
                this.f72745q = 0;
            }
            if (this.f72747s != -1) {
                this.f72747s = 0;
            }
            while (true) {
                if (arrayList.size() < this.f72738j && arrayList.size() < 15) {
                    this.f72749u = arrayList.size();
                    return;
                }
                arrayList.remove(0);
            }
        }

        public final void b() {
            SpannableStringBuilder spannableStringBuilder = this.f72730b;
            int length = spannableStringBuilder.length();
            if (length > 0) {
                spannableStringBuilder.delete(length - 1, length);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final a c() {
            Layout.Alignment alignment;
            float f7;
            float f11;
            int i11;
            int i12;
            if (i()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int i13 = 0;
            while (true) {
                ArrayList arrayList = this.f72729a;
                if (i13 >= arrayList.size()) {
                    break;
                }
                spannableStringBuilder.append((CharSequence) arrayList.get(i13));
                spannableStringBuilder.append('\n');
                i13++;
            }
            spannableStringBuilder.append((CharSequence) d());
            int i14 = this.f72739k;
            int i15 = 2;
            if (i14 != 0) {
                if (i14 == 1) {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                } else if (i14 == 2) {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                } else if (i14 != 3) {
                    throw new IllegalArgumentException("Unexpected justification value: " + this.f72739k);
                }
                if (this.f72734f) {
                    f7 = this.f72736h / 209.0f;
                    f11 = this.f72735g / 74.0f;
                } else {
                    f7 = this.f72736h / 99.0f;
                    f11 = this.f72735g / 99.0f;
                }
                float f12 = (f7 * 0.9f) + 0.05f;
                float f13 = (f11 * 0.9f) + 0.05f;
                int i16 = this.f72737i;
                i11 = i16 / 3;
                if (i11 != 0) {
                    i12 = 2;
                    i15 = 0;
                } else if (i11 == 1) {
                    i12 = 2;
                    i15 = 1;
                } else {
                    i12 = 2;
                }
                int i17 = i16 % 3;
                int i18 = i17 != 0 ? 0 : i17 == 1 ? 1 : i12;
                int i19 = this.f72742n;
                return new a(spannableStringBuilder, alignment, f13, i15, f12, i18, i19 != f72725w, i19, this.f72733e);
            }
            alignment = Layout.Alignment.ALIGN_NORMAL;
            if (this.f72734f) {
            }
            float f122 = (f7 * 0.9f) + 0.05f;
            float f132 = (f11 * 0.9f) + 0.05f;
            int i162 = this.f72737i;
            i11 = i162 / 3;
            if (i11 != 0) {
            }
            int i172 = i162 % 3;
            if (i172 != 0) {
            }
            int i192 = this.f72742n;
            return new a(spannableStringBuilder, alignment, f132, i15, f122, i18, i192 != f72725w, i192, this.f72733e);
        }

        public final SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f72730b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f72743o != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f72743o, length, 33);
                }
                if (this.f72744p != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f72744p, length, 33);
                }
                if (this.f72745q != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f72746r), this.f72745q, length, 33);
                }
                if (this.f72747s != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f72748t), this.f72747s, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public final void e() {
            this.f72729a.clear();
            this.f72730b.clear();
            this.f72743o = -1;
            this.f72744p = -1;
            this.f72745q = -1;
            this.f72747s = -1;
            this.f72749u = 0;
        }

        public final void f(boolean z11, int i11, boolean z12, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f72731c = true;
            this.f72732d = z11;
            this.f72733e = i11;
            this.f72734f = z12;
            this.f72735g = i12;
            this.f72736h = i13;
            this.f72737i = i15;
            int i18 = i14 + 1;
            if (this.f72738j != i18) {
                this.f72738j = i18;
                while (true) {
                    ArrayList arrayList = this.f72729a;
                    if (arrayList.size() < this.f72738j && arrayList.size() < 15) {
                        break;
                    } else {
                        arrayList.remove(0);
                    }
                }
            }
            if (i16 != 0 && this.f72740l != i16) {
                this.f72740l = i16;
                int i19 = i16 - 1;
                int i21 = f72720B[i19];
                boolean z13 = f72719A[i19];
                int i22 = f72727y[i19];
                int i23 = f72728z[i19];
                int i24 = f72726x[i19];
                this.f72742n = i21;
                this.f72739k = i24;
            }
            if (i17 == 0 || this.f72741m == i17) {
                return;
            }
            this.f72741m = i17;
            int i25 = i17 - 1;
            int i26 = f72722D[i25];
            int i27 = f72721C[i25];
            l(false, false);
            m(f72724v, f72723E[i25]);
        }

        public final boolean h() {
            return this.f72731c;
        }

        public final boolean i() {
            if (this.f72731c) {
                return this.f72729a.isEmpty() && this.f72730b.length() == 0;
            }
            return true;
        }

        public final boolean j() {
            return this.f72732d;
        }

        public final void k() {
            e();
            this.f72731c = false;
            this.f72732d = false;
            this.f72733e = 4;
            this.f72734f = false;
            this.f72735g = 0;
            this.f72736h = 0;
            this.f72737i = 0;
            this.f72738j = 15;
            this.f72739k = 0;
            this.f72740l = 0;
            this.f72741m = 0;
            int i11 = f72725w;
            this.f72742n = i11;
            this.f72746r = f72724v;
            this.f72748t = i11;
        }

        public final void l(boolean z11, boolean z12) {
            int i11 = this.f72743o;
            SpannableStringBuilder spannableStringBuilder = this.f72730b;
            if (i11 != -1) {
                if (!z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f72743o, spannableStringBuilder.length(), 33);
                    this.f72743o = -1;
                }
            } else if (z11) {
                this.f72743o = spannableStringBuilder.length();
            }
            if (this.f72744p == -1) {
                if (z12) {
                    this.f72744p = spannableStringBuilder.length();
                }
            } else {
                if (z12) {
                    return;
                }
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f72744p, spannableStringBuilder.length(), 33);
                this.f72744p = -1;
            }
        }

        public final void m(int i11, int i12) {
            int i13 = this.f72745q;
            SpannableStringBuilder spannableStringBuilder = this.f72730b;
            if (i13 != -1 && this.f72746r != i11) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f72746r), this.f72745q, spannableStringBuilder.length(), 33);
            }
            if (i11 != f72724v) {
                this.f72745q = spannableStringBuilder.length();
                this.f72746r = i11;
            }
            if (this.f72747s != -1 && this.f72748t != i12) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f72748t), this.f72747s, spannableStringBuilder.length(), 33);
            }
            if (i12 != f72725w) {
                this.f72747s = spannableStringBuilder.length();
                this.f72748t = i12;
            }
        }

        public final void n(int i11) {
            if (this.f72749u != i11) {
                a('\n');
            }
            this.f72749u = i11;
        }

        public final void o(boolean z11) {
            this.f72732d = z11;
        }

        public final void p(int i11, int i12) {
            this.f72742n = i11;
            this.f72739k = i12;
        }
    }

    /* renamed from: l4.c$c, reason: collision with other inner class name */
    private static final class C1214c {

        /* renamed from: a, reason: collision with root package name */
        public final int f72750a;

        /* renamed from: b, reason: collision with root package name */
        public final int f72751b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f72752c;

        /* renamed from: d, reason: collision with root package name */
        int f72753d = 0;

        public C1214c(int i11, int i12) {
            this.f72750a = i11;
            this.f72751b = i12;
            this.f72752c = new byte[(i12 * 2) - 1];
        }
    }

    public C7867c(int i11, List<byte[]> list) {
        this.f72709k = i11 == -1 ? 1 : i11;
        if (list != null) {
            int i12 = C8065g.f74319d;
            if (list.size() == 1 && list.get(0).length == 1) {
                byte b11 = list.get(0)[0];
            }
        }
        this.f72710l = new b[8];
        for (int i13 = 0; i13 < 8; i13++) {
            this.f72710l[i13] = new b();
        }
        this.f72711m = this.f72710l[0];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v104 */
    /* JADX WARN: Type inference failed for: r1v105 */
    /* JADX WARN: Type inference failed for: r1v106 */
    /* JADX WARN: Type inference failed for: r1v107 */
    /* JADX WARN: Type inference failed for: r1v108 */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r1v61, types: [int] */
    /* JADX WARN: Type inference failed for: r1v63 */
    /* JADX WARN: Type inference failed for: r1v64, types: [int] */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v67, types: [int] */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r1v70, types: [int] */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v73, types: [int] */
    private void n() {
        char c11;
        boolean z11;
        boolean z12;
        boolean z13;
        C1214c c1214c = this.f72714p;
        if (c1214c == null) {
            return;
        }
        boolean z14 = true;
        if (c1214c.f72753d != (c1214c.f72751b * 2) - 1) {
            s.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f72714p.f72751b * 2) - 1) + ", but current index is " + this.f72714p.f72753d + " (sequence number " + this.f72714p.f72750a + ");");
        }
        C1214c c1214c2 = this.f72714p;
        byte[] bArr = c1214c2.f72752c;
        int i11 = c1214c2.f72753d;
        C8049B c8049b = this.f72707i;
        c8049b.l(i11, bArr);
        boolean z15 = false;
        while (true) {
            if (c8049b.b() > 0) {
                int h11 = c8049b.h(3);
                int h12 = c8049b.h(5);
                if (h11 == 7) {
                    c8049b.p(2);
                    h11 = c8049b.h(6);
                    if (h11 < 7) {
                        C3261b.f(h11, "Invalid extended service number: ", "Cea708Decoder");
                    }
                }
                if (h12 == 0) {
                    if (h11 != 0) {
                        s.f("Cea708Decoder", "serviceNumber is non-zero (" + h11 + ") when blockSize is 0");
                    }
                } else if (h11 != this.f72709k) {
                    c8049b.q(h12);
                } else {
                    int e11 = (h12 * 8) + c8049b.e();
                    while (c8049b.e() < e11) {
                        int h13 = c8049b.h(8);
                        boolean z16 = z14;
                        if (h13 != 16) {
                            if (h13 <= 31) {
                                if (h13 != 0) {
                                    if (h13 == 3) {
                                        this.f72712n = o();
                                    } else if (h13 != 8) {
                                        switch (h13) {
                                            case 12:
                                                p();
                                                break;
                                            case 13:
                                                this.f72711m.a('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (h13 < 17 || h13 > 23) {
                                                    if (h13 < 24 || h13 > 31) {
                                                        C3261b.f(h13, "Invalid C0 command: ", "Cea708Decoder");
                                                        break;
                                                    } else {
                                                        s.f("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + h13);
                                                        c8049b.p(16);
                                                        break;
                                                    }
                                                } else {
                                                    s.f("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + h13);
                                                    c8049b.p(8);
                                                    break;
                                                }
                                        }
                                    } else {
                                        this.f72711m.b();
                                    }
                                }
                            } else if (h13 <= 127) {
                                if (h13 == 127) {
                                    this.f72711m.a((char) 9835);
                                } else {
                                    this.f72711m.a((char) (h13 & 255));
                                }
                                z15 = z16;
                            } else {
                                if (h13 <= 159) {
                                    b[] bVarArr = this.f72710l;
                                    switch (h13) {
                                        case UserVerificationMethods.USER_VERIFY_PATTERN /* 128 */:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            z11 = z16;
                                            z12 = false;
                                            int i12 = h13 - 128;
                                            if (this.f72715q != i12) {
                                                this.f72715q = i12;
                                                this.f72711m = bVarArr[i12];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            z11 = z16;
                                            z12 = false;
                                            for (?? r12 = z11; r12 <= 8; r12++) {
                                                if (c8049b.g()) {
                                                    bVarArr[8 - r12].e();
                                                }
                                            }
                                            break;
                                        case 137:
                                            z12 = false;
                                            for (?? r13 = z16; r13 <= 8; r13++) {
                                                if (c8049b.g()) {
                                                    z13 = z16;
                                                    bVarArr[8 - r13].o(z13);
                                                } else {
                                                    z13 = z16;
                                                }
                                                z16 = z13;
                                            }
                                            z11 = z16;
                                            break;
                                        case 138:
                                            for (?? r14 = z16; r14 <= 8; r14++) {
                                                if (c8049b.g()) {
                                                    bVarArr[8 - r14].o(false);
                                                }
                                            }
                                            z12 = false;
                                            z11 = z16;
                                            break;
                                        case 139:
                                            for (?? r15 = z16; r15 <= 8; r15++) {
                                                if (c8049b.g()) {
                                                    bVarArr[8 - r15].o(!r2.j());
                                                }
                                            }
                                            z11 = z16;
                                            z12 = false;
                                            break;
                                        case 140:
                                            for (?? r16 = z16; r16 <= 8; r16++) {
                                                if (c8049b.g()) {
                                                    bVarArr[8 - r16].k();
                                                }
                                            }
                                            z11 = z16;
                                            z12 = false;
                                            break;
                                        case 141:
                                            c8049b.p(8);
                                            z11 = z16;
                                            z12 = false;
                                            break;
                                        case 142:
                                            z11 = z16;
                                            z12 = false;
                                            break;
                                        case 143:
                                            p();
                                            z11 = z16;
                                            z12 = false;
                                            break;
                                        case 144:
                                            if (this.f72711m.h()) {
                                                c8049b.h(4);
                                                c8049b.h(2);
                                                c8049b.h(2);
                                                boolean g10 = c8049b.g();
                                                boolean g11 = c8049b.g();
                                                c8049b.h(3);
                                                c8049b.h(3);
                                                this.f72711m.l(g10, g11);
                                            } else {
                                                c8049b.p(16);
                                            }
                                            z11 = z16;
                                            z12 = false;
                                            break;
                                        case 145:
                                            if (this.f72711m.h()) {
                                                int g12 = b.g(c8049b.h(2), c8049b.h(2), c8049b.h(2), c8049b.h(2));
                                                int g13 = b.g(c8049b.h(2), c8049b.h(2), c8049b.h(2), c8049b.h(2));
                                                c8049b.p(2);
                                                b.g(c8049b.h(2), c8049b.h(2), c8049b.h(2), 0);
                                                this.f72711m.m(g12, g13);
                                            } else {
                                                c8049b.p(24);
                                            }
                                            z11 = z16;
                                            z12 = false;
                                            break;
                                        case 146:
                                            if (this.f72711m.h()) {
                                                c8049b.p(4);
                                                int h14 = c8049b.h(4);
                                                c8049b.p(2);
                                                c8049b.h(6);
                                                this.f72711m.n(h14);
                                            } else {
                                                c8049b.p(16);
                                            }
                                            z11 = z16;
                                            z12 = false;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            C3261b.f(h13, "Invalid C1 command: ", "Cea708Decoder");
                                            z11 = z16;
                                            z12 = false;
                                            break;
                                        case 151:
                                            if (this.f72711m.h()) {
                                                int g14 = b.g(c8049b.h(2), c8049b.h(2), c8049b.h(2), c8049b.h(2));
                                                c8049b.h(2);
                                                b.g(c8049b.h(2), c8049b.h(2), c8049b.h(2), 0);
                                                c8049b.g();
                                                c8049b.g();
                                                c8049b.h(2);
                                                c8049b.h(2);
                                                int h15 = c8049b.h(2);
                                                c8049b.p(8);
                                                this.f72711m.p(g14, h15);
                                            } else {
                                                c8049b.p(32);
                                            }
                                            z11 = z16;
                                            z12 = false;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i13 = h13 - 152;
                                            b bVar = bVarArr[i13];
                                            c8049b.p(2);
                                            boolean g15 = c8049b.g();
                                            c8049b.p(2);
                                            int h16 = c8049b.h(3);
                                            boolean g16 = c8049b.g();
                                            int h17 = c8049b.h(7);
                                            int h18 = c8049b.h(8);
                                            int h19 = c8049b.h(4);
                                            int h21 = c8049b.h(4);
                                            c8049b.p(2);
                                            c8049b.p(6);
                                            c8049b.p(2);
                                            bVar.f(g15, h16, g16, h17, h18, h21, h19, c8049b.h(3), c8049b.h(3));
                                            if (this.f72715q != i13) {
                                                this.f72715q = i13;
                                                this.f72711m = bVarArr[i13];
                                            }
                                            z11 = z16;
                                            z12 = false;
                                            break;
                                    }
                                } else {
                                    z11 = z16;
                                    z12 = false;
                                    if (h13 <= 255) {
                                        this.f72711m.a((char) (h13 & 255));
                                    } else {
                                        C3261b.f(h13, "Invalid base command: ", "Cea708Decoder");
                                        z16 = z11;
                                        c11 = 6;
                                    }
                                }
                                z15 = z11;
                                z16 = z15;
                                c11 = 6;
                            }
                            c11 = 6;
                        } else {
                            int h22 = c8049b.h(8);
                            if (h22 <= 31) {
                                if (h22 > 7) {
                                    if (h22 <= 15) {
                                        c8049b.p(8);
                                    } else if (h22 <= 23) {
                                        c8049b.p(16);
                                    } else if (h22 <= 31) {
                                        c8049b.p(24);
                                    }
                                }
                            } else if (h22 <= 127) {
                                if (h22 == 32) {
                                    this.f72711m.a(' ');
                                } else if (h22 == 33) {
                                    this.f72711m.a((char) 160);
                                } else if (h22 == 37) {
                                    this.f72711m.a((char) 8230);
                                } else if (h22 == 42) {
                                    this.f72711m.a((char) 352);
                                } else if (h22 == 44) {
                                    this.f72711m.a((char) 338);
                                } else if (h22 == 63) {
                                    this.f72711m.a((char) 376);
                                } else if (h22 == 57) {
                                    this.f72711m.a((char) 8482);
                                } else if (h22 == 58) {
                                    this.f72711m.a((char) 353);
                                } else if (h22 == 60) {
                                    this.f72711m.a((char) 339);
                                } else if (h22 != 61) {
                                    switch (h22) {
                                        case 48:
                                            this.f72711m.a((char) 9608);
                                            break;
                                        case 49:
                                            this.f72711m.a((char) 8216);
                                            break;
                                        case 50:
                                            this.f72711m.a((char) 8217);
                                            break;
                                        case 51:
                                            this.f72711m.a((char) 8220);
                                            break;
                                        case 52:
                                            this.f72711m.a((char) 8221);
                                            break;
                                        case 53:
                                            this.f72711m.a((char) 8226);
                                            break;
                                        default:
                                            switch (h22) {
                                                case 118:
                                                    this.f72711m.a((char) 8539);
                                                    break;
                                                case 119:
                                                    this.f72711m.a((char) 8540);
                                                    break;
                                                case 120:
                                                    this.f72711m.a((char) 8541);
                                                    break;
                                                case 121:
                                                    this.f72711m.a((char) 8542);
                                                    break;
                                                case 122:
                                                    this.f72711m.a((char) 9474);
                                                    break;
                                                case 123:
                                                    this.f72711m.a((char) 9488);
                                                    break;
                                                case 124:
                                                    this.f72711m.a((char) 9492);
                                                    break;
                                                case 125:
                                                    this.f72711m.a((char) 9472);
                                                    break;
                                                case 126:
                                                    this.f72711m.a((char) 9496);
                                                    break;
                                                case 127:
                                                    this.f72711m.a((char) 9484);
                                                    break;
                                                default:
                                                    C3261b.f(h22, "Invalid G2 character: ", "Cea708Decoder");
                                                    break;
                                            }
                                    }
                                } else {
                                    this.f72711m.a((char) 8480);
                                }
                                z15 = z16;
                            } else if (h22 > 159) {
                                c11 = 6;
                                if (h22 <= 255) {
                                    if (h22 == 160) {
                                        this.f72711m.a((char) 13252);
                                    } else {
                                        C3261b.f(h22, "Invalid G3 character: ", "Cea708Decoder");
                                        this.f72711m.a('_');
                                    }
                                    z15 = z16;
                                } else {
                                    C3261b.f(h22, "Invalid extended command: ", "Cea708Decoder");
                                }
                            } else if (h22 <= 135) {
                                c8049b.p(32);
                            } else if (h22 <= 143) {
                                c8049b.p(40);
                            } else if (h22 <= 159) {
                                c8049b.p(2);
                                c11 = 6;
                                c8049b.p(c8049b.h(6) * 8);
                            }
                            c11 = 6;
                        }
                        z14 = z16;
                    }
                }
            }
        }
        if (z15) {
            this.f72712n = o();
        }
        this.f72714p = null;
    }

    private List<C7855a> o() {
        a c11;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < 8; i11++) {
            b[] bVarArr = this.f72710l;
            if (!bVarArr[i11].i() && bVarArr[i11].j() && (c11 = bVarArr[i11].c()) != null) {
                arrayList.add(c11);
            }
        }
        Collections.sort(arrayList, a.f72716c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            arrayList2.add(((a) arrayList.get(i12)).f72717a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void p() {
        for (int i11 = 0; i11 < 8; i11++) {
            this.f72710l[i11].k();
        }
    }

    @Override // l4.AbstractC7869e, s3.d
    public final void flush() {
        super.flush();
        this.f72712n = null;
        this.f72713o = null;
        this.f72715q = 0;
        this.f72711m = this.f72710l[0];
        p();
        this.f72714p = null;
    }

    @Override // l4.AbstractC7869e
    protected final i g() {
        List<C7855a> list = this.f72712n;
        this.f72713o = list;
        list.getClass();
        return new C7870f(list);
    }

    @Override // l4.AbstractC7869e
    protected final void h(m mVar) {
        ByteBuffer byteBuffer = mVar.f98184d;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        C8050C c8050c = this.f72706h;
        c8050c.P(limit, array);
        while (c8050c.a() >= 3) {
            int E11 = c8050c.E();
            int i11 = E11 & 3;
            boolean z11 = (E11 & 4) == 4;
            byte E12 = (byte) c8050c.E();
            byte E13 = (byte) c8050c.E();
            if (i11 == 2 || i11 == 3) {
                if (z11) {
                    if (i11 == 3) {
                        n();
                        int i12 = (E12 & 192) >> 6;
                        int i13 = this.f72708j;
                        if (i13 != -1 && i12 != (i13 + 1) % 4) {
                            p();
                            s.f("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f72708j + " current=" + i12);
                        }
                        this.f72708j = i12;
                        int i14 = E12 & 63;
                        if (i14 == 0) {
                            i14 = 64;
                        }
                        C1214c c1214c = new C1214c(i12, i14);
                        this.f72714p = c1214c;
                        c1214c.f72753d = 1;
                        c1214c.f72752c[0] = E13;
                    } else {
                        G10.a.c(i11 == 2);
                        C1214c c1214c2 = this.f72714p;
                        if (c1214c2 == null) {
                            s.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr = c1214c2.f72752c;
                            int i15 = c1214c2.f72753d;
                            int i16 = i15 + 1;
                            c1214c2.f72753d = i16;
                            bArr[i15] = E12;
                            c1214c2.f72753d = i15 + 2;
                            bArr[i16] = E13;
                        }
                    }
                    C1214c c1214c3 = this.f72714p;
                    if (c1214c3.f72753d == (c1214c3.f72751b * 2) - 1) {
                        n();
                    }
                }
            }
        }
    }

    @Override // l4.AbstractC7869e
    protected final boolean l() {
        return this.f72712n != this.f72713o;
    }

    @Override // s3.d
    public final /* bridge */ /* synthetic */ void release() {
    }
}
