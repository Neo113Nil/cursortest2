package f2;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.plaid.internal.EnumC3631g;
import d1.C3985a;
import e1.AbstractC4134a;
import e1.AbstractC4156x;
import e1.J;
import e2.InterfaceC4169k;
import e2.p;
import e2.q;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.LongCompanionObject;
import org.bouncycastle.math.ec.Tnaf;

/* renamed from: f2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4234a extends AbstractC4238e {

    /* renamed from: i, reason: collision with root package name */
    public final int f46295i;

    /* renamed from: j, reason: collision with root package name */
    public final int f46296j;

    /* renamed from: k, reason: collision with root package name */
    public final int f46297k;

    /* renamed from: l, reason: collision with root package name */
    public final long f46298l;

    /* renamed from: o, reason: collision with root package name */
    public List f46301o;

    /* renamed from: p, reason: collision with root package name */
    public List f46302p;

    /* renamed from: q, reason: collision with root package name */
    public int f46303q;

    /* renamed from: r, reason: collision with root package name */
    public int f46304r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f46305s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f46306t;

    /* renamed from: u, reason: collision with root package name */
    public byte f46307u;

    /* renamed from: v, reason: collision with root package name */
    public byte f46308v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f46310x;

    /* renamed from: y, reason: collision with root package name */
    public long f46311y;
    private static final int[] ROW_INDICES = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] COLUMN_INDICES = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] STYLE_COLORS = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] BASIC_CHARACTER_SET = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, EnumC3631g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 93, EnumC3631g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, EnumC3631g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, EnumC3631g.SDK_ASSET_ICON_INCOMPLETE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, 9632};
    private static final int[] SPECIAL_CHARACTER_SET = {EnumC3631g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, 8482, EnumC3631g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, 9834, EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_CONFIRMED_CIRCLE_VALUE, 32, EnumC3631g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, 251};
    private static final int[] SPECIAL_ES_FR_CHARACTER_SET = {EnumC3631g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE, 201, 211, 218, EnumC3631g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 252, 8216, EnumC3631g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE, 42, 39, 8212, EnumC3631g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, 8480, 8226, 8220, 8221, 192, EnumC3631g.SDK_ASSET_ICON_EXTERNAL_VALUE, EnumC3631g.SDK_ASSET_ICON_CANCEL_VALUE, 200, 202, 203, EnumC3631g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, 206, EnumC3631g.SDK_ASSET_ICON_COMMENT_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_03_VALUE, EnumC3631g.SDK_ASSET_ICON_OVERRIDE_VALUE, 217, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_CONFIRMED_VALUE, EnumC3631g.SDK_ASSET_ICON_REJECTED_REC_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE};
    private static final int[] SPECIAL_PT_DE_CHARACTER_SET = {EnumC3631g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, 205, 204, EnumC3631g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, EnumC3631g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE, EnumC3631g.SDK_ASSET_ICON_PAUSE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, 123, 125, 92, 94, 95, EnumC3631g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 126, EnumC3631g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, EnumC3631g.SDK_ASSET_ICON_PIN_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, 165, EnumC3631g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, 9474, EnumC3631g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, 216, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, 9484, 9488, 9492, 9496};
    private static final boolean[] ODD_PARITY_BYTE_TABLE = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: h, reason: collision with root package name */
    public final J f46294h = new J();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f46299m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public C0671a f46300n = new C0671a(0, 4);

    /* renamed from: w, reason: collision with root package name */
    public int f46309w = 0;

    /* renamed from: f2.a$a, reason: collision with other inner class name */
    public static final class C0671a {

        /* renamed from: a, reason: collision with root package name */
        public final List f46312a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final List f46313b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public final StringBuilder f46314c = new StringBuilder();

        /* renamed from: d, reason: collision with root package name */
        public int f46315d;

        /* renamed from: e, reason: collision with root package name */
        public int f46316e;

        /* renamed from: f, reason: collision with root package name */
        public int f46317f;

        /* renamed from: g, reason: collision with root package name */
        public int f46318g;

        /* renamed from: h, reason: collision with root package name */
        public int f46319h;

        /* renamed from: f2.a$a$a, reason: collision with other inner class name */
        public static class C0672a {

            /* renamed from: a, reason: collision with root package name */
            public final int f46320a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f46321b;

            /* renamed from: c, reason: collision with root package name */
            public int f46322c;

            public C0672a(int i10, boolean z10, int i11) {
                this.f46320a = i10;
                this.f46321b = z10;
                this.f46322c = i11;
            }
        }

        public C0671a(int i10, int i11) {
            j(i10);
            this.f46319h = i11;
        }

        public static void n(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
            if (i12 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
        }

        public static void o(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
        }

        public static void q(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }

        public void e(char c10) {
            if (this.f46314c.length() < 32) {
                this.f46314c.append(c10);
            }
        }

        public void f() {
            int length = this.f46314c.length();
            if (length > 0) {
                this.f46314c.delete(length - 1, length);
                for (int size = this.f46312a.size() - 1; size >= 0; size--) {
                    C0672a c0672a = (C0672a) this.f46312a.get(size);
                    int i10 = c0672a.f46322c;
                    if (i10 != length) {
                        return;
                    }
                    c0672a.f46322c = i10 - 1;
                }
            }
        }

        public C3985a g(int i10) {
            float f10;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i11 = 0; i11 < this.f46313b.size(); i11++) {
                spannableStringBuilder.append((CharSequence) this.f46313b.get(i11));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i12 = this.f46316e + this.f46317f;
            int length = (32 - i12) - spannableStringBuilder.length();
            int i13 = i12 - length;
            if (i10 == Integer.MIN_VALUE) {
                i10 = (this.f46318g != 2 || (Math.abs(i13) >= 3 && length >= 0)) ? (this.f46318g != 2 || i13 <= 0) ? 0 : 2 : 1;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i12 = 32 - length;
                }
                f10 = ((i12 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i14 = this.f46315d;
            if (i14 > 7) {
                i14 -= 17;
            } else if (this.f46318g == 1) {
                i14 -= this.f46319h - 1;
            }
            return new C3985a.b().o(spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(i14, 1).k(f10).l(i10).a();
        }

        public final SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f46314c);
            int length = spannableStringBuilder.length();
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = 0;
            int i15 = 0;
            boolean z10 = false;
            while (i14 < this.f46312a.size()) {
                C0672a c0672a = (C0672a) this.f46312a.get(i14);
                boolean z11 = c0672a.f46321b;
                int i16 = c0672a.f46320a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i13 = C4234a.STYLE_COLORS[i16];
                    }
                    z10 = z12;
                }
                int i17 = c0672a.f46322c;
                i14++;
                if (i17 != (i14 < this.f46312a.size() ? ((C0672a) this.f46312a.get(i14)).f46322c : length)) {
                    if (i10 != -1 && !z11) {
                        q(spannableStringBuilder, i10, i17);
                        i10 = -1;
                    } else if (i10 == -1 && z11) {
                        i10 = i17;
                    }
                    if (i11 != -1 && !z10) {
                        o(spannableStringBuilder, i11, i17);
                        i11 = -1;
                    } else if (i11 == -1 && z10) {
                        i11 = i17;
                    }
                    if (i13 != i12) {
                        n(spannableStringBuilder, i15, i17, i12);
                        i12 = i13;
                        i15 = i17;
                    }
                }
            }
            if (i10 != -1 && i10 != length) {
                q(spannableStringBuilder, i10, length);
            }
            if (i11 != -1 && i11 != length) {
                o(spannableStringBuilder, i11, length);
            }
            if (i15 != length) {
                n(spannableStringBuilder, i15, length, i12);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public boolean i() {
            return this.f46312a.isEmpty() && this.f46313b.isEmpty() && this.f46314c.length() == 0;
        }

        public void j(int i10) {
            this.f46318g = i10;
            this.f46312a.clear();
            this.f46313b.clear();
            this.f46314c.setLength(0);
            this.f46315d = 15;
            this.f46316e = 0;
            this.f46317f = 0;
        }

        public void k() {
            this.f46313b.add(h());
            this.f46314c.setLength(0);
            this.f46312a.clear();
            int min = Math.min(this.f46319h, this.f46315d);
            while (this.f46313b.size() >= min) {
                this.f46313b.remove(0);
            }
        }

        public void l(int i10) {
            this.f46318g = i10;
        }

        public void m(int i10) {
            this.f46319h = i10;
        }

        public void p(int i10, boolean z10) {
            this.f46312a.add(new C0672a(i10, z10, this.f46314c.length()));
        }
    }

    public C4234a(String str, int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            AbstractC4134a.a(j10 >= 16000);
            this.f46298l = j10 * 1000;
        } else {
            this.f46298l = -9223372036854775807L;
        }
        this.f46295i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f46297k = 0;
            this.f46296j = 0;
        } else if (i10 == 2) {
            this.f46297k = 1;
            this.f46296j = 0;
        } else if (i10 == 3) {
            this.f46297k = 0;
            this.f46296j = 1;
        } else if (i10 != 4) {
            AbstractC4156x.i("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f46297k = 0;
            this.f46296j = 0;
        } else {
            this.f46297k = 1;
            this.f46296j = 1;
        }
        O(0);
        N();
        this.f46310x = true;
        this.f46311y = -9223372036854775807L;
    }

    public static boolean B(byte b10) {
        return (b10 & 224) == 0;
    }

    public static boolean C(byte b10, byte b11) {
        return (b10 & 246) == 18 && (b11 & 224) == 32;
    }

    public static boolean D(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    public static boolean E(byte b10, byte b11) {
        return (b10 & 246) == 20 && (b11 & 240) == 32;
    }

    public static boolean F(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & 192) == 64;
    }

    public static boolean G(byte b10) {
        return (b10 & 240) == 16;
    }

    public static boolean I(byte b10) {
        return (b10 & 246) == 20;
    }

    public static boolean J(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 48;
    }

    public static boolean K(byte b10, byte b11) {
        return (b10 & 247) == 23 && b11 >= 33 && b11 <= 35;
    }

    public static boolean L(byte b10) {
        return 1 <= b10 && b10 <= 15;
    }

    public static char r(byte b10) {
        return (char) BASIC_CHARACTER_SET[(b10 & ByteCompanionObject.MAX_VALUE) - 32];
    }

    public static int s(byte b10) {
        return (b10 >> 3) & 1;
    }

    public static char u(byte b10) {
        return (char) SPECIAL_ES_FR_CHARACTER_SET[b10 & 31];
    }

    public static char v(byte b10) {
        return (char) SPECIAL_PT_DE_CHARACTER_SET[b10 & 31];
    }

    public static char w(byte b10, byte b11) {
        return (b10 & 1) == 0 ? u(b11) : v(b11);
    }

    public static char x(byte b10) {
        return (char) SPECIAL_CHARACTER_SET[b10 & 15];
    }

    public final void A(byte b10, byte b11) {
        int i10 = ROW_INDICES[b10 & 7];
        if ((b11 & 32) != 0) {
            i10++;
        }
        if (i10 != this.f46300n.f46315d) {
            if (this.f46303q != 1 && !this.f46300n.i()) {
                C0671a c0671a = new C0671a(this.f46303q, this.f46304r);
                this.f46300n = c0671a;
                this.f46299m.add(c0671a);
            }
            this.f46300n.f46315d = i10;
        }
        boolean z10 = (b11 & Tnaf.POW_2_WIDTH) == 16;
        boolean z11 = (b11 & 1) == 1;
        int i11 = (b11 >> 1) & 7;
        this.f46300n.p(z10 ? 8 : i11, z11);
        if (z10) {
            this.f46300n.f46316e = COLUMN_INDICES[i11];
        }
    }

    public final boolean H(boolean z10, byte b10, byte b11) {
        if (!z10 || !G(b10)) {
            this.f46306t = false;
        } else {
            if (this.f46306t && this.f46307u == b10 && this.f46308v == b11) {
                this.f46306t = false;
                return true;
            }
            this.f46306t = true;
            this.f46307u = b10;
            this.f46308v = b11;
        }
        return false;
    }

    public final void M(byte b10, byte b11) {
        if (L(b10)) {
            this.f46310x = false;
            return;
        }
        if (I(b10)) {
            if (b11 != 32 && b11 != 47) {
                switch (b11) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b11) {
                            case 42:
                            case 43:
                                this.f46310x = false;
                                break;
                        }
                        return;
                }
            }
            this.f46310x = true;
        }
    }

    public final void N() {
        this.f46300n.j(this.f46303q);
        this.f46299m.clear();
        this.f46299m.add(this.f46300n);
    }

    public final void O(int i10) {
        int i11 = this.f46303q;
        if (i11 == i10) {
            return;
        }
        this.f46303q = i10;
        if (i10 == 3) {
            for (int i12 = 0; i12 < this.f46299m.size(); i12++) {
                ((C0671a) this.f46299m.get(i12)).l(i10);
            }
            return;
        }
        N();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.f46301o = Collections.EMPTY_LIST;
        }
    }

    public final void P(int i10) {
        this.f46304r = i10;
        this.f46300n.m(i10);
    }

    public final boolean Q() {
        return (this.f46298l == -9223372036854775807L || this.f46311y == -9223372036854775807L || l() - this.f46311y < this.f46298l) ? false : true;
    }

    public final boolean R(byte b10) {
        if (B(b10)) {
            this.f46309w = s(b10);
        }
        return this.f46309w == this.f46297k;
    }

    @Override // f2.AbstractC4238e, e2.l
    public /* bridge */ /* synthetic */ void b(long j10) {
        super.b(j10);
    }

    @Override // f2.AbstractC4238e, k1.d
    public void flush() {
        super.flush();
        this.f46301o = null;
        this.f46302p = null;
        O(0);
        P(4);
        N();
        this.f46305s = false;
        this.f46306t = false;
        this.f46307u = (byte) 0;
        this.f46308v = (byte) 0;
        this.f46309w = 0;
        this.f46310x = true;
        this.f46311y = -9223372036854775807L;
    }

    @Override // f2.AbstractC4238e
    public InterfaceC4169k g() {
        List list = this.f46301o;
        this.f46302p = list;
        return new C4239f((List) AbstractC4134a.e(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0017 A[SYNTHETIC] */
    @Override // f2.AbstractC4238e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void h(p pVar) {
        boolean z10;
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC4134a.e(pVar.f54108d);
        this.f46294h.Z(byteBuffer.array(), byteBuffer.limit());
        boolean z11 = false;
        while (true) {
            int a10 = this.f46294h.a();
            int i10 = this.f46295i;
            if (a10 < i10) {
                break;
            }
            int M10 = i10 == 2 ? -4 : this.f46294h.M();
            int M11 = this.f46294h.M();
            int M12 = this.f46294h.M();
            if ((M10 & 2) == 0 && (M10 & 1) == this.f46296j) {
                byte b10 = (byte) (M11 & 127);
                byte b11 = (byte) (M12 & 127);
                if (b10 != 0 || b11 != 0) {
                    boolean z12 = this.f46305s;
                    if ((M10 & 4) == 4) {
                        boolean[] zArr = ODD_PARITY_BYTE_TABLE;
                        if (zArr[M11] && zArr[M12]) {
                            z10 = true;
                            this.f46305s = z10;
                            if (!H(z10, b10, b11)) {
                                if (this.f46305s) {
                                    M(b10, b11);
                                    if (this.f46310x && R(b10)) {
                                        if (!B(b10)) {
                                            this.f46300n.e(r(b10));
                                            if ((b11 & 224) != 0) {
                                                this.f46300n.e(r(b11));
                                            }
                                        } else if (J(b10, b11)) {
                                            this.f46300n.e(x(b11));
                                        } else if (C(b10, b11)) {
                                            this.f46300n.f();
                                            this.f46300n.e(w(b10, b11));
                                        } else if (D(b10, b11)) {
                                            y(b11);
                                        } else if (F(b10, b11)) {
                                            A(b10, b11);
                                        } else if (K(b10, b11)) {
                                            this.f46300n.f46317f = b11 - 32;
                                        } else if (E(b10, b11)) {
                                            z(b11);
                                        }
                                        z11 = true;
                                    }
                                } else if (z12) {
                                    N();
                                    z11 = true;
                                }
                            }
                        }
                    }
                    z10 = false;
                    this.f46305s = z10;
                    if (!H(z10, b10, b11)) {
                    }
                }
            }
        }
        if (z11) {
            int i11 = this.f46303q;
            if (i11 == 1 || i11 == 3) {
                this.f46301o = t();
                this.f46311y = l();
            }
        }
    }

    @Override // f2.AbstractC4238e
    /* renamed from: i */
    public /* bridge */ /* synthetic */ p f() {
        return super.f();
    }

    @Override // f2.AbstractC4238e, k1.d
    /* renamed from: j */
    public q a() {
        q k10;
        q a10 = super.a();
        if (a10 != null) {
            return a10;
        }
        if (!Q() || (k10 = k()) == null) {
            return null;
        }
        this.f46301o = Collections.EMPTY_LIST;
        this.f46311y = -9223372036854775807L;
        k10.p(l(), g(), LongCompanionObject.MAX_VALUE);
        return k10;
    }

    @Override // f2.AbstractC4238e
    public boolean m() {
        return this.f46301o != this.f46302p;
    }

    @Override // f2.AbstractC4238e
    /* renamed from: n */
    public /* bridge */ /* synthetic */ void d(p pVar) {
        super.d(pVar);
    }

    public final List t() {
        int size = this.f46299m.size();
        ArrayList arrayList = new ArrayList(size);
        int i10 = 2;
        for (int i11 = 0; i11 < size; i11++) {
            C3985a g10 = ((C0671a) this.f46299m.get(i11)).g(Integer.MIN_VALUE);
            arrayList.add(g10);
            if (g10 != null) {
                i10 = Math.min(i10, g10.f44865i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            C3985a c3985a = (C3985a) arrayList.get(i12);
            if (c3985a != null) {
                if (c3985a.f44865i != i10) {
                    c3985a = (C3985a) AbstractC4134a.e(((C0671a) this.f46299m.get(i12)).g(i10));
                }
                arrayList2.add(c3985a);
            }
        }
        return arrayList2;
    }

    public final void y(byte b10) {
        this.f46300n.e(' ');
        this.f46300n.p((b10 >> 1) & 7, (b10 & 1) == 1);
    }

    public final void z(byte b10) {
        if (b10 == 32) {
            O(2);
            return;
        }
        if (b10 == 41) {
            O(3);
            return;
        }
        switch (b10) {
            case 37:
                O(1);
                P(2);
                break;
            case 38:
                O(1);
                P(3);
                break;
            case 39:
                O(1);
                P(4);
                break;
            default:
                int i10 = this.f46303q;
                if (i10 != 0) {
                    if (b10 == 33) {
                        this.f46300n.f();
                        break;
                    } else {
                        switch (b10) {
                            case 44:
                                this.f46301o = Collections.EMPTY_LIST;
                                if (i10 == 1 || i10 == 3) {
                                    N();
                                    break;
                                }
                            case 45:
                                if (i10 == 1 && !this.f46300n.i()) {
                                    this.f46300n.k();
                                    break;
                                }
                                break;
                            case 46:
                                N();
                                break;
                            case 47:
                                this.f46301o = t();
                                N();
                                break;
                        }
                    }
                }
                break;
        }
    }

    @Override // f2.AbstractC4238e, k1.d
    public void release() {
    }
}
