package f2;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import d1.C3985a;
import e1.AbstractC4134a;
import e1.AbstractC4144k;
import e1.AbstractC4156x;
import e1.I;
import e1.J;
import e2.InterfaceC4169k;
import e2.p;
import e2.q;
import f2.C4236c;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.text.Typography;

/* renamed from: f2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4236c extends AbstractC4238e {
    private final b[] cueInfoBuilders;

    /* renamed from: h, reason: collision with root package name */
    public final J f46323h = new J();

    /* renamed from: i, reason: collision with root package name */
    public final I f46324i = new I();

    /* renamed from: j, reason: collision with root package name */
    public int f46325j = -1;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f46326k;

    /* renamed from: l, reason: collision with root package name */
    public final int f46327l;

    /* renamed from: m, reason: collision with root package name */
    public b f46328m;

    /* renamed from: n, reason: collision with root package name */
    public List f46329n;

    /* renamed from: o, reason: collision with root package name */
    public List f46330o;

    /* renamed from: p, reason: collision with root package name */
    public C0673c f46331p;

    /* renamed from: q, reason: collision with root package name */
    public int f46332q;

    /* renamed from: f2.c$a */
    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        public static final Comparator f46333c = new Comparator() { // from class: f2.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int compare;
                compare = Integer.compare(((C4236c.a) obj2).f46335b, ((C4236c.a) obj).f46335b);
                return compare;
            }
        };

        /* renamed from: a, reason: collision with root package name */
        public final C3985a f46334a;

        /* renamed from: b, reason: collision with root package name */
        public final int f46335b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            C3985a.b n10 = new C3985a.b().o(charSequence).p(alignment).h(f10, i10).i(i11).k(f11).l(i12).n(f12);
            if (z10) {
                n10.s(i13);
            }
            this.f46334a = n10.a();
            this.f46335b = i14;
        }
    }

    /* renamed from: f2.c$b */
    public static final class b {
        private static final int[] PEN_STYLE_BACKGROUND;
        private static final int[] PEN_STYLE_EDGE_TYPE;
        private static final int[] PEN_STYLE_FONT_STYLE;
        private static final int[] WINDOW_STYLE_FILL;
        private static final int[] WINDOW_STYLE_JUSTIFICATION;
        private static final int[] WINDOW_STYLE_PRINT_DIRECTION;
        private static final int[] WINDOW_STYLE_SCROLL_DIRECTION;
        private static final boolean[] WINDOW_STYLE_WORD_WRAP;

        /* renamed from: v, reason: collision with root package name */
        public static final int f46336v = h(2, 2, 2, 0);

        /* renamed from: w, reason: collision with root package name */
        public static final int f46337w;

        /* renamed from: x, reason: collision with root package name */
        public static final int f46338x;

        /* renamed from: a, reason: collision with root package name */
        public final List f46339a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final SpannableStringBuilder f46340b = new SpannableStringBuilder();

        /* renamed from: c, reason: collision with root package name */
        public boolean f46341c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f46342d;

        /* renamed from: e, reason: collision with root package name */
        public int f46343e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f46344f;

        /* renamed from: g, reason: collision with root package name */
        public int f46345g;

        /* renamed from: h, reason: collision with root package name */
        public int f46346h;

        /* renamed from: i, reason: collision with root package name */
        public int f46347i;

        /* renamed from: j, reason: collision with root package name */
        public int f46348j;

        /* renamed from: k, reason: collision with root package name */
        public int f46349k;

        /* renamed from: l, reason: collision with root package name */
        public int f46350l;

        /* renamed from: m, reason: collision with root package name */
        public int f46351m;

        /* renamed from: n, reason: collision with root package name */
        public int f46352n;

        /* renamed from: o, reason: collision with root package name */
        public int f46353o;

        /* renamed from: p, reason: collision with root package name */
        public int f46354p;

        /* renamed from: q, reason: collision with root package name */
        public int f46355q;

        /* renamed from: r, reason: collision with root package name */
        public int f46356r;

        /* renamed from: s, reason: collision with root package name */
        public int f46357s;

        /* renamed from: t, reason: collision with root package name */
        public int f46358t;

        /* renamed from: u, reason: collision with root package name */
        public int f46359u;

        static {
            int h10 = h(0, 0, 0, 0);
            f46337w = h10;
            int h11 = h(0, 0, 0, 3);
            f46338x = h11;
            WINDOW_STYLE_JUSTIFICATION = new int[]{0, 0, 0, 0, 0, 2, 0};
            WINDOW_STYLE_PRINT_DIRECTION = new int[]{0, 0, 0, 0, 0, 0, 2};
            WINDOW_STYLE_SCROLL_DIRECTION = new int[]{3, 3, 3, 3, 3, 3, 1};
            WINDOW_STYLE_WORD_WRAP = new boolean[]{false, false, false, true, true, true, false};
            WINDOW_STYLE_FILL = new int[]{h10, h11, h10, h10, h11, h10, h10};
            PEN_STYLE_FONT_STYLE = new int[]{0, 1, 2, 3, 4, 3, 4};
            PEN_STYLE_EDGE_TYPE = new int[]{0, 0, 0, 0, 0, 3, 3};
            PEN_STYLE_BACKGROUND = new int[]{h10, h10, h10, h10, h10, h11, h11};
        }

        public b() {
            l();
        }

        public static int g(int i10, int i11, int i12) {
            return h(i10, i11, i12, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static int h(int i10, int i11, int i12, int i13) {
            int i14;
            AbstractC4134a.c(i10, 0, 4);
            AbstractC4134a.c(i11, 0, 4);
            AbstractC4134a.c(i12, 0, 4);
            AbstractC4134a.c(i13, 0, 4);
            if (i13 != 0 && i13 != 1) {
                if (i13 == 2) {
                    i14 = 127;
                } else if (i13 == 3) {
                    i14 = 0;
                }
                return Color.argb(i14, i10 <= 1 ? 255 : 0, i11 <= 1 ? 255 : 0, i12 > 1 ? 255 : 0);
            }
            i14 = 255;
            return Color.argb(i14, i10 <= 1 ? 255 : 0, i11 <= 1 ? 255 : 0, i12 > 1 ? 255 : 0);
        }

        public void a(char c10) {
            if (c10 != '\n') {
                this.f46340b.append(c10);
                return;
            }
            this.f46339a.add(d());
            this.f46340b.clear();
            if (this.f46353o != -1) {
                this.f46353o = 0;
            }
            if (this.f46354p != -1) {
                this.f46354p = 0;
            }
            if (this.f46355q != -1) {
                this.f46355q = 0;
            }
            if (this.f46357s != -1) {
                this.f46357s = 0;
            }
            while (true) {
                if (this.f46339a.size() < this.f46348j && this.f46339a.size() < 15) {
                    this.f46359u = this.f46339a.size();
                    return;
                }
                this.f46339a.remove(0);
            }
        }

        public void b() {
            int length = this.f46340b.length();
            if (length > 0) {
                this.f46340b.delete(length - 1, length);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a c() {
            Layout.Alignment alignment;
            float f10;
            float f11;
            int i10;
            int i11;
            float f12;
            int i12;
            if (j()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i13 = 0; i13 < this.f46339a.size(); i13++) {
                spannableStringBuilder.append((CharSequence) this.f46339a.get(i13));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) d());
            int i14 = this.f46349k;
            int i15 = 2;
            if (i14 != 0) {
                if (i14 == 1) {
                    alignment = Layout.Alignment.ALIGN_OPPOSITE;
                } else if (i14 == 2) {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                } else if (i14 != 3) {
                    throw new IllegalArgumentException("Unexpected justification value: " + this.f46349k);
                }
                if (this.f46344f) {
                    f10 = this.f46346h / 209.0f;
                    f11 = this.f46345g / 74.0f;
                } else {
                    f10 = this.f46346h / 99.0f;
                    f11 = this.f46345g / 99.0f;
                }
                float f13 = (f10 * 0.9f) + 0.05f;
                float f14 = (f11 * 0.9f) + 0.05f;
                i10 = this.f46347i;
                if (i10 / 3 != 0) {
                    i11 = i10;
                    f12 = f13;
                    i12 = 0;
                } else if (i10 / 3 == 1) {
                    i11 = i10;
                    f12 = f13;
                    i12 = 1;
                } else {
                    i11 = i10;
                    f12 = f13;
                    i12 = 2;
                }
                if (i11 % 3 != 0) {
                    i15 = 0;
                } else if (i11 % 3 == 1) {
                    i15 = 1;
                }
                return new a(spannableStringBuilder, alignment, f14, 0, i12, f12, i15, -3.4028235E38f, this.f46352n == f46337w, this.f46352n, this.f46343e);
            }
            alignment = Layout.Alignment.ALIGN_NORMAL;
            if (this.f46344f) {
            }
            float f132 = (f10 * 0.9f) + 0.05f;
            float f142 = (f11 * 0.9f) + 0.05f;
            i10 = this.f46347i;
            if (i10 / 3 != 0) {
            }
            if (i11 % 3 != 0) {
            }
            return new a(spannableStringBuilder, alignment, f142, 0, i12, f12, i15, -3.4028235E38f, this.f46352n == f46337w, this.f46352n, this.f46343e);
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f46340b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f46353o != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f46353o, length, 33);
                }
                if (this.f46354p != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f46354p, length, 33);
                }
                if (this.f46355q != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f46356r), this.f46355q, length, 33);
                }
                if (this.f46357s != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f46358t), this.f46357s, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f46339a.clear();
            this.f46340b.clear();
            this.f46353o = -1;
            this.f46354p = -1;
            this.f46355q = -1;
            this.f46357s = -1;
            this.f46359u = 0;
        }

        public void f(boolean z10, int i10, boolean z11, int i11, int i12, int i13, int i14, int i15, int i16) {
            this.f46341c = true;
            this.f46342d = z10;
            this.f46343e = i10;
            this.f46344f = z11;
            this.f46345g = i11;
            this.f46346h = i12;
            this.f46347i = i14;
            int i17 = i13 + 1;
            if (this.f46348j != i17) {
                this.f46348j = i17;
                while (true) {
                    if (this.f46339a.size() < this.f46348j && this.f46339a.size() < 15) {
                        break;
                    } else {
                        this.f46339a.remove(0);
                    }
                }
            }
            if (i15 != 0 && this.f46350l != i15) {
                this.f46350l = i15;
                int i18 = i15 - 1;
                q(WINDOW_STYLE_FILL[i18], f46338x, WINDOW_STYLE_WORD_WRAP[i18], 0, WINDOW_STYLE_PRINT_DIRECTION[i18], WINDOW_STYLE_SCROLL_DIRECTION[i18], WINDOW_STYLE_JUSTIFICATION[i18]);
            }
            if (i16 == 0 || this.f46351m == i16) {
                return;
            }
            this.f46351m = i16;
            int i19 = i16 - 1;
            m(0, 1, 1, false, false, PEN_STYLE_EDGE_TYPE[i19], PEN_STYLE_FONT_STYLE[i19]);
            n(f46336v, PEN_STYLE_BACKGROUND[i19], f46337w);
        }

        public boolean i() {
            return this.f46341c;
        }

        public boolean j() {
            if (i()) {
                return this.f46339a.isEmpty() && this.f46340b.length() == 0;
            }
            return true;
        }

        public boolean k() {
            return this.f46342d;
        }

        public void l() {
            e();
            this.f46341c = false;
            this.f46342d = false;
            this.f46343e = 4;
            this.f46344f = false;
            this.f46345g = 0;
            this.f46346h = 0;
            this.f46347i = 0;
            this.f46348j = 15;
            this.f46349k = 0;
            this.f46350l = 0;
            this.f46351m = 0;
            int i10 = f46337w;
            this.f46352n = i10;
            this.f46356r = f46336v;
            this.f46358t = i10;
        }

        public void m(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.f46353o != -1) {
                if (!z10) {
                    this.f46340b.setSpan(new StyleSpan(2), this.f46353o, this.f46340b.length(), 33);
                    this.f46353o = -1;
                }
            } else if (z10) {
                this.f46353o = this.f46340b.length();
            }
            if (this.f46354p == -1) {
                if (z11) {
                    this.f46354p = this.f46340b.length();
                }
            } else {
                if (z11) {
                    return;
                }
                this.f46340b.setSpan(new UnderlineSpan(), this.f46354p, this.f46340b.length(), 33);
                this.f46354p = -1;
            }
        }

        public void n(int i10, int i11, int i12) {
            if (this.f46355q != -1 && this.f46356r != i10) {
                this.f46340b.setSpan(new ForegroundColorSpan(this.f46356r), this.f46355q, this.f46340b.length(), 33);
            }
            if (i10 != f46336v) {
                this.f46355q = this.f46340b.length();
                this.f46356r = i10;
            }
            if (this.f46357s != -1 && this.f46358t != i11) {
                this.f46340b.setSpan(new BackgroundColorSpan(this.f46358t), this.f46357s, this.f46340b.length(), 33);
            }
            if (i11 != f46337w) {
                this.f46357s = this.f46340b.length();
                this.f46358t = i11;
            }
        }

        public void o(int i10, int i11) {
            if (this.f46359u != i10) {
                a('\n');
            }
            this.f46359u = i10;
        }

        public void p(boolean z10) {
            this.f46342d = z10;
        }

        public void q(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f46352n = i10;
            this.f46349k = i15;
        }
    }

    /* renamed from: f2.c$c, reason: collision with other inner class name */
    public static final class C0673c {

        /* renamed from: a, reason: collision with root package name */
        public final int f46360a;

        /* renamed from: b, reason: collision with root package name */
        public final int f46361b;

        /* renamed from: c, reason: collision with root package name */
        public int f46362c = 0;
        public final byte[] packetData;

        public C0673c(int i10, int i11) {
            this.f46360a = i10;
            this.f46361b = i11;
            this.packetData = new byte[(i11 * 2) - 1];
        }
    }

    public C4236c(int i10, List list) {
        this.f46327l = i10 == -1 ? 1 : i10;
        this.f46326k = list != null && AbstractC4144k.G(list);
        this.cueInfoBuilders = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.cueInfoBuilders[i11] = new b();
        }
        this.f46328m = this.cueInfoBuilders[0];
    }

    private void G() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.cueInfoBuilders[i10].l();
        }
    }

    private List r() {
        a c10;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.cueInfoBuilders[i10].j() && this.cueInfoBuilders[i10].k() && (c10 = this.cueInfoBuilders[i10].c()) != null) {
                arrayList.add(c10);
            }
        }
        Collections.sort(arrayList, a.f46333c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).f46334a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public final void A(int i10) {
        if (i10 == 160) {
            this.f46328m.a((char) 13252);
            return;
        }
        AbstractC4156x.i("Cea708Decoder", "Invalid G3 character: " + i10);
        this.f46328m.a('_');
    }

    public final void B() {
        this.f46328m.m(this.f46324i.h(4), this.f46324i.h(2), this.f46324i.h(2), this.f46324i.g(), this.f46324i.g(), this.f46324i.h(3), this.f46324i.h(3));
    }

    public final void C() {
        int h10 = b.h(this.f46324i.h(2), this.f46324i.h(2), this.f46324i.h(2), this.f46324i.h(2));
        int h11 = b.h(this.f46324i.h(2), this.f46324i.h(2), this.f46324i.h(2), this.f46324i.h(2));
        this.f46324i.r(2);
        this.f46328m.n(h10, h11, b.g(this.f46324i.h(2), this.f46324i.h(2), this.f46324i.h(2)));
    }

    public final void D() {
        this.f46324i.r(4);
        int h10 = this.f46324i.h(4);
        this.f46324i.r(2);
        this.f46328m.o(h10, this.f46324i.h(6));
    }

    public final void E() {
        int h10 = b.h(this.f46324i.h(2), this.f46324i.h(2), this.f46324i.h(2), this.f46324i.h(2));
        int h11 = this.f46324i.h(2);
        int g10 = b.g(this.f46324i.h(2), this.f46324i.h(2), this.f46324i.h(2));
        if (this.f46324i.g()) {
            h11 |= 4;
        }
        boolean g11 = this.f46324i.g();
        int h12 = this.f46324i.h(2);
        int h13 = this.f46324i.h(2);
        int h14 = this.f46324i.h(2);
        this.f46324i.r(8);
        this.f46328m.q(h10, g10, g11, h11, h12, h13, h14);
    }

    public final void F() {
        C0673c c0673c = this.f46331p;
        if (c0673c.f46362c != (c0673c.f46361b * 2) - 1) {
            AbstractC4156x.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f46331p.f46361b * 2) - 1) + ", but current index is " + this.f46331p.f46362c + " (sequence number " + this.f46331p.f46360a + ");");
        }
        I i10 = this.f46324i;
        C0673c c0673c2 = this.f46331p;
        i10.o(c0673c2.packetData, c0673c2.f46362c);
        boolean z10 = false;
        while (true) {
            if (this.f46324i.b() <= 0) {
                break;
            }
            int h10 = this.f46324i.h(3);
            int h11 = this.f46324i.h(5);
            if (h10 == 7) {
                this.f46324i.r(2);
                h10 = this.f46324i.h(6);
                if (h10 < 7) {
                    AbstractC4156x.i("Cea708Decoder", "Invalid extended service number: " + h10);
                }
            }
            if (h11 == 0) {
                if (h10 != 0) {
                    AbstractC4156x.i("Cea708Decoder", "serviceNumber is non-zero (" + h10 + ") when blockSize is 0");
                }
            } else if (h10 != this.f46327l) {
                this.f46324i.s(h11);
            } else {
                int e10 = this.f46324i.e() + (h11 * 8);
                while (this.f46324i.e() < e10) {
                    int h12 = this.f46324i.h(8);
                    if (h12 == 16) {
                        int h13 = this.f46324i.h(8);
                        if (h13 <= 31) {
                            u(h13);
                        } else {
                            if (h13 <= 127) {
                                z(h13);
                            } else if (h13 <= 159) {
                                v(h13);
                            } else if (h13 <= 255) {
                                A(h13);
                            } else {
                                AbstractC4156x.i("Cea708Decoder", "Invalid extended command: " + h13);
                            }
                            z10 = true;
                        }
                    } else if (h12 <= 31) {
                        s(h12);
                    } else {
                        if (h12 <= 127) {
                            x(h12);
                        } else if (h12 <= 159) {
                            t(h12);
                        } else if (h12 <= 255) {
                            y(h12);
                        } else {
                            AbstractC4156x.i("Cea708Decoder", "Invalid base command: " + h12);
                        }
                        z10 = true;
                    }
                }
            }
        }
        if (z10) {
            this.f46329n = r();
        }
    }

    @Override // f2.AbstractC4238e, e2.l
    public /* bridge */ /* synthetic */ void b(long j10) {
        super.b(j10);
    }

    @Override // f2.AbstractC4238e, k1.d
    public void flush() {
        super.flush();
        this.f46329n = null;
        this.f46330o = null;
        this.f46332q = 0;
        this.f46328m = this.cueInfoBuilders[0];
        G();
        this.f46331p = null;
    }

    @Override // f2.AbstractC4238e
    public InterfaceC4169k g() {
        List list = this.f46329n;
        this.f46330o = list;
        return new C4239f((List) AbstractC4134a.e(list));
    }

    @Override // f2.AbstractC4238e
    public void h(p pVar) {
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC4134a.e(pVar.f54108d);
        this.f46323h.Z(byteBuffer.array(), byteBuffer.limit());
        while (this.f46323h.a() >= 3) {
            int M10 = this.f46323h.M();
            int i10 = M10 & 3;
            boolean z10 = (M10 & 4) == 4;
            byte M11 = (byte) this.f46323h.M();
            byte M12 = (byte) this.f46323h.M();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        q();
                        int i11 = (M11 & 192) >> 6;
                        int i12 = this.f46325j;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            G();
                            AbstractC4156x.i("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f46325j + " current=" + i11);
                        }
                        this.f46325j = i11;
                        int i13 = M11 & 63;
                        if (i13 == 0) {
                            i13 = 64;
                        }
                        C0673c c0673c = new C0673c(i11, i13);
                        this.f46331p = c0673c;
                        byte[] bArr = c0673c.packetData;
                        int i14 = c0673c.f46362c;
                        c0673c.f46362c = i14 + 1;
                        bArr[i14] = M12;
                    } else {
                        AbstractC4134a.a(i10 == 2);
                        C0673c c0673c2 = this.f46331p;
                        if (c0673c2 == null) {
                            AbstractC4156x.d("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c0673c2.packetData;
                            int i15 = c0673c2.f46362c;
                            int i16 = i15 + 1;
                            c0673c2.f46362c = i16;
                            bArr2[i15] = M11;
                            c0673c2.f46362c = i15 + 2;
                            bArr2[i16] = M12;
                        }
                    }
                    C0673c c0673c3 = this.f46331p;
                    if (c0673c3.f46362c == (c0673c3.f46361b * 2) - 1) {
                        q();
                    }
                }
            }
        }
    }

    @Override // f2.AbstractC4238e
    /* renamed from: i */
    public /* bridge */ /* synthetic */ p f() {
        return super.f();
    }

    @Override // f2.AbstractC4238e
    /* renamed from: j */
    public /* bridge */ /* synthetic */ q a() {
        return super.a();
    }

    @Override // f2.AbstractC4238e
    public boolean m() {
        return this.f46329n != this.f46330o;
    }

    @Override // f2.AbstractC4238e
    /* renamed from: n */
    public /* bridge */ /* synthetic */ void d(p pVar) {
        super.d(pVar);
    }

    public final void q() {
        if (this.f46331p == null) {
            return;
        }
        F();
        this.f46331p = null;
    }

    @Override // f2.AbstractC4238e, k1.d
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }

    public final void s(int i10) {
        if (i10 != 0) {
            if (i10 == 3) {
                this.f46329n = r();
                return;
            }
            if (i10 == 8) {
                this.f46328m.b();
                return;
            }
            switch (i10) {
                case 12:
                    G();
                    break;
                case 13:
                    this.f46328m.a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i10 >= 17 && i10 <= 23) {
                        AbstractC4156x.i("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i10);
                        this.f46324i.r(8);
                        break;
                    } else if (i10 >= 24 && i10 <= 31) {
                        AbstractC4156x.i("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i10);
                        this.f46324i.r(16);
                        break;
                    } else {
                        AbstractC4156x.i("Cea708Decoder", "Invalid C0 command: " + i10);
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void t(int i10) {
        int i11 = 1;
        switch (i10) {
            case 128:
            case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
            case 130:
            case 131:
            case SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE:
            case SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE:
            case 134:
            case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE:
                int i12 = i10 - 128;
                if (this.f46332q != i12) {
                    this.f46332q = i12;
                    this.f46328m = this.cueInfoBuilders[i12];
                    break;
                }
                break;
            case 136:
                while (i11 <= 8) {
                    if (this.f46324i.g()) {
                        this.cueInfoBuilders[8 - i11].e();
                    }
                    i11++;
                }
                break;
            case SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE:
                for (int i13 = 1; i13 <= 8; i13++) {
                    if (this.f46324i.g()) {
                        this.cueInfoBuilders[8 - i13].p(true);
                    }
                }
                break;
            case SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE:
                while (i11 <= 8) {
                    if (this.f46324i.g()) {
                        this.cueInfoBuilders[8 - i11].p(false);
                    }
                    i11++;
                }
                break;
            case SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.f46324i.g()) {
                        this.cueInfoBuilders[8 - i14].p(!r0.k());
                    }
                }
                break;
            case SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE:
                while (i11 <= 8) {
                    if (this.f46324i.g()) {
                        this.cueInfoBuilders[8 - i11].l();
                    }
                    i11++;
                }
                break;
            case SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE:
                this.f46324i.r(8);
                break;
            case SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE:
                break;
            case SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE:
                G();
                break;
            case 144:
                if (this.f46328m.i()) {
                    B();
                    break;
                } else {
                    this.f46324i.r(16);
                    break;
                }
            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE:
                if (this.f46328m.i()) {
                    C();
                    break;
                } else {
                    this.f46324i.r(24);
                    break;
                }
            case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE:
                if (this.f46328m.i()) {
                    D();
                    break;
                } else {
                    this.f46324i.r(16);
                    break;
                }
            case 147:
            case SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE:
            case SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE:
            case SDK_ASSET_ILLUSTRATION_SDK_NAVBAR_PLAID_LOGO_VALUE:
            default:
                AbstractC4156x.i("Cea708Decoder", "Invalid C1 command: " + i10);
                break;
            case 151:
                if (this.f46328m.i()) {
                    E();
                    break;
                } else {
                    this.f46324i.r(32);
                    break;
                }
            case SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE:
            case SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE:
            case SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE:
            case 155:
            case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_CENTERED_VALUE:
            case 157:
            case SDK_ASSET_ILLUSTRATION_WALLET_VALUE:
            case SDK_ASSET_ILLUSTRATION_INCOME_VALUE:
                int i15 = i10 - 152;
                w(i15);
                if (this.f46332q != i15) {
                    this.f46332q = i15;
                    this.f46328m = this.cueInfoBuilders[i15];
                    break;
                }
                break;
        }
    }

    public final void u(int i10) {
        if (i10 <= 7) {
            return;
        }
        if (i10 <= 15) {
            this.f46324i.r(8);
        } else if (i10 <= 23) {
            this.f46324i.r(16);
        } else if (i10 <= 31) {
            this.f46324i.r(24);
        }
    }

    public final void v(int i10) {
        if (i10 <= 135) {
            this.f46324i.r(32);
            return;
        }
        if (i10 <= 143) {
            this.f46324i.r(40);
        } else if (i10 <= 159) {
            this.f46324i.r(2);
            this.f46324i.r(this.f46324i.h(6) * 8);
        }
    }

    public final void w(int i10) {
        b bVar = this.cueInfoBuilders[i10];
        this.f46324i.r(2);
        boolean g10 = this.f46324i.g();
        this.f46324i.r(2);
        int h10 = this.f46324i.h(3);
        boolean g11 = this.f46324i.g();
        int h11 = this.f46324i.h(7);
        int h12 = this.f46324i.h(8);
        int h13 = this.f46324i.h(4);
        int h14 = this.f46324i.h(4);
        this.f46324i.r(2);
        this.f46324i.r(6);
        this.f46324i.r(2);
        bVar.f(g10, h10, g11, h11, h12, h14, h13, this.f46324i.h(3), this.f46324i.h(3));
    }

    public final void x(int i10) {
        if (i10 == 127) {
            this.f46328m.a((char) 9835);
        } else {
            this.f46328m.a((char) (i10 & 255));
        }
    }

    public final void y(int i10) {
        this.f46328m.a((char) (i10 & 255));
    }

    public final void z(int i10) {
        if (i10 == 32) {
            this.f46328m.a(' ');
            return;
        }
        if (i10 == 33) {
            this.f46328m.a(Typography.nbsp);
            return;
        }
        if (i10 == 37) {
            this.f46328m.a(Typography.ellipsis);
            return;
        }
        if (i10 == 42) {
            this.f46328m.a((char) 352);
            return;
        }
        if (i10 == 44) {
            this.f46328m.a((char) 338);
            return;
        }
        if (i10 == 63) {
            this.f46328m.a((char) 376);
            return;
        }
        if (i10 == 57) {
            this.f46328m.a(Typography.tm);
            return;
        }
        if (i10 == 58) {
            this.f46328m.a((char) 353);
            return;
        }
        if (i10 == 60) {
            this.f46328m.a((char) 339);
            return;
        }
        if (i10 == 61) {
            this.f46328m.a((char) 8480);
            return;
        }
        switch (i10) {
            case 48:
                this.f46328m.a((char) 9608);
                break;
            case 49:
                this.f46328m.a(Typography.leftSingleQuote);
                break;
            case 50:
                this.f46328m.a(Typography.rightSingleQuote);
                break;
            case 51:
                this.f46328m.a(Typography.leftDoubleQuote);
                break;
            case 52:
                this.f46328m.a(Typography.rightDoubleQuote);
                break;
            case 53:
                this.f46328m.a(Typography.bullet);
                break;
            default:
                switch (i10) {
                    case 118:
                        this.f46328m.a((char) 8539);
                        break;
                    case 119:
                        this.f46328m.a((char) 8540);
                        break;
                    case 120:
                        this.f46328m.a((char) 8541);
                        break;
                    case 121:
                        this.f46328m.a((char) 8542);
                        break;
                    case 122:
                        this.f46328m.a((char) 9474);
                        break;
                    case 123:
                        this.f46328m.a((char) 9488);
                        break;
                    case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                        this.f46328m.a((char) 9492);
                        break;
                    case 125:
                        this.f46328m.a((char) 9472);
                        break;
                    case 126:
                        this.f46328m.a((char) 9496);
                        break;
                    case 127:
                        this.f46328m.a((char) 9484);
                        break;
                    default:
                        AbstractC4156x.i("Cea708Decoder", "Invalid G2 character: " + i10);
                        break;
                }
        }
    }
}
