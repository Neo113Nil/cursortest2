package net.time4j;

import ai.verisoul.sdk.helpers.session.SessionData;
import com.plaid.internal.EnumC3631g;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.io.encoding.Base64;
import li.AbstractC5468b;
import li.AbstractC5469c;
import li.AbstractC5470d;
import li.InterfaceC5467a;
import li.InterfaceC5472f;
import net.time4j.EnumC5706f;
import oi.AbstractC5917m;
import oi.EnumC5900A;
import oi.H;
import oi.InterfaceC5902C;
import oi.InterfaceC5903D;
import oi.InterfaceC5908d;
import oi.InterfaceC5911g;
import oi.InterfaceC5915k;

/* loaded from: classes5.dex */
public final class F extends AbstractC5917m implements InterfaceC5467a, InterfaceC5903D, net.time4j.format.h {

    /* renamed from: l, reason: collision with root package name */
    public static final oi.p f57534l;

    /* renamed from: m, reason: collision with root package name */
    public static final InterfaceC5705e f57535m;

    /* renamed from: n, reason: collision with root package name */
    public static final InterfaceC5703c f57536n;

    /* renamed from: o, reason: collision with root package name */
    public static final InterfaceC5703c f57537o;

    /* renamed from: p, reason: collision with root package name */
    public static final C f57538p;

    /* renamed from: q, reason: collision with root package name */
    public static final C f57539q;

    /* renamed from: r, reason: collision with root package name */
    public static final K f57540r;

    /* renamed from: s, reason: collision with root package name */
    public static final K f57541s;
    private static final long serialVersionUID = -6698431452072325688L;

    /* renamed from: t, reason: collision with root package name */
    public static final C f57542t;

    /* renamed from: u, reason: collision with root package name */
    public static final K f57543u;

    /* renamed from: v, reason: collision with root package name */
    public static final K f57544v;

    /* renamed from: w, reason: collision with root package name */
    public static final D f57545w;

    /* renamed from: x, reason: collision with root package name */
    public static final Map f57546x;

    /* renamed from: y, reason: collision with root package name */
    public static final InterfaceC5915k f57547y;

    /* renamed from: z, reason: collision with root package name */
    public static final oi.H f57548z;

    /* renamed from: a, reason: collision with root package name */
    public final transient int f57549a;

    /* renamed from: b, reason: collision with root package name */
    public final transient byte f57550b;

    /* renamed from: c, reason: collision with root package name */
    public final transient byte f57551c;

    /* renamed from: d, reason: collision with root package name */
    public static final F f57526d = new F(-999999999, 1, 1);

    /* renamed from: e, reason: collision with root package name */
    public static final F f57527e = new F(999999999, 12, 31);

    /* renamed from: f, reason: collision with root package name */
    public static final Integer f57528f = -999999999;

    /* renamed from: g, reason: collision with root package name */
    public static final Integer f57529g = 999999999;

    /* renamed from: h, reason: collision with root package name */
    public static final Integer f57530h = 1;

    /* renamed from: i, reason: collision with root package name */
    public static final Integer f57531i = 12;

    /* renamed from: j, reason: collision with root package name */
    public static final Integer f57532j = 365;

    /* renamed from: k, reason: collision with root package name */
    public static final Integer f57533k = 366;
    private static final int[] DAY_OF_YEAR_PER_MONTH = {31, 59, 90, 120, 151, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE, EnumC3631g.SDK_ASSET_ICON_OVERRIDE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, 304, 334, 365};
    private static final int[] DAY_OF_LEAP_YEAR_PER_MONTH = {31, 60, 91, 121, EnumC3631g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE, EnumC3631g.SDK_ASSET_ICON_PAUSE_VALUE, EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, 274, 305, 335, 366};

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$net$time4j$CalendarUnit;
        static final /* synthetic */ int[] $SwitchMap$net$time4j$Quarter;

        static {
            int[] iArr = new int[M.values().length];
            $SwitchMap$net$time4j$Quarter = iArr;
            try {
                iArr[M.Q1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$time4j$Quarter[M.Q2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC5706f.values().length];
            $SwitchMap$net$time4j$CalendarUnit = iArr2;
            try {
                iArr2[EnumC5706f.f57791a.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$net$time4j$CalendarUnit[EnumC5706f.f57792b.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$net$time4j$CalendarUnit[EnumC5706f.f57793c.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$net$time4j$CalendarUnit[EnumC5706f.f57794d.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$net$time4j$CalendarUnit[EnumC5706f.f57795e.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$net$time4j$CalendarUnit[EnumC5706f.f57796f.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$net$time4j$CalendarUnit[EnumC5706f.f57797g.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$net$time4j$CalendarUnit[EnumC5706f.f57798h.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static class b implements oi.z {
        public b() {
        }

        @Override // oi.z
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public oi.p b(F f10) {
            return null;
        }

        @Override // oi.z
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public oi.p d(F f10) {
            return null;
        }

        @Override // oi.z
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public F e(F f10) {
            return F.f57527e;
        }

        @Override // oi.z
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public F i(F f10) {
            return F.f57526d;
        }

        @Override // oi.z
        public boolean isValid(F f10, F f11) {
            return f11 != null;
        }

        @Override // oi.z
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public F p(F f10) {
            return f10;
        }

        @Override // oi.z
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public F q(F f10, F f11, boolean z10) {
            if (f11 != null) {
                return f11;
            }
            throw new IllegalArgumentException("Missing date value.");
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public static class c implements oi.z {

        /* renamed from: a, reason: collision with root package name */
        public final String f57552a;

        /* renamed from: b, reason: collision with root package name */
        public final Class f57553b;

        /* renamed from: c, reason: collision with root package name */
        public final Enum f57554c;

        /* renamed from: d, reason: collision with root package name */
        public final Enum f57555d;

        /* renamed from: e, reason: collision with root package name */
        public final int f57556e;

        public c(String str, Class cls, Enum r32, Enum r42, int i10) {
            this.f57552a = str;
            this.f57553b = cls;
            this.f57554c = r32;
            this.f57555d = r42;
            this.f57556e = i10;
        }

        public static c l(oi.p pVar) {
            return new c(pVar.name(), pVar.getType(), (Enum) pVar.d0(), (Enum) pVar.c(), ((C5723p) pVar).B());
        }

        public final oi.p a() {
            switch (this.f57556e) {
                case 101:
                    return F.f57541s;
                case 102:
                    return null;
                case 103:
                    return F.f57544v;
                default:
                    throw new UnsupportedOperationException(this.f57552a);
            }
        }

        @Override // oi.z
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public oi.p b(F f10) {
            return a();
        }

        @Override // oi.z
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public oi.p d(F f10) {
            return a();
        }

        @Override // oi.z
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Enum e(F f10) {
            return (this.f57556e == 102 && f10.f57549a == 999999999 && f10.f57550b == 12 && f10.f57551c >= 27) ? (Enum) this.f57553b.cast(Y.FRIDAY) : this.f57555d;
        }

        @Override // oi.z
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Enum i(F f10) {
            return this.f57554c;
        }

        @Override // oi.z
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Enum p(F f10) {
            Object d10;
            switch (this.f57556e) {
                case 101:
                    d10 = B.d(f10.f57550b);
                    break;
                case 102:
                    d10 = f10.u0();
                    break;
                case 103:
                    d10 = M.d(((f10.f57550b - 1) / 3) + 1);
                    break;
                default:
                    throw new UnsupportedOperationException(this.f57552a);
            }
            return (Enum) this.f57553b.cast(d10);
        }

        @Override // oi.z
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public F q(F f10, Enum r32, boolean z10) {
            if (r32 == null) {
                throw new IllegalArgumentException("Missing element value.");
            }
            switch (this.f57556e) {
                case 101:
                    return f10.N0(((B) B.class.cast(r32)).b());
                case 102:
                    return f10.K0((Y) Y.class.cast(r32));
                case 103:
                    return (F) f10.E(((M) M.class.cast(r32)).b() - (((f10.f57550b - 1) / 3) + 1), EnumC5706f.f57795e);
                default:
                    throw new UnsupportedOperationException(this.f57552a);
            }
        }

        @Override // oi.z
        public boolean isValid(F f10, Enum<Object> r52) {
            if (r52 == null) {
                return false;
            }
            if (this.f57556e != 102 || f10.f57549a != 999999999) {
                return true;
            }
            try {
                o(f10, r52, false);
                return true;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
    }

    public static class d implements InterfaceC5902C {

        /* renamed from: a, reason: collision with root package name */
        public final oi.p f57557a;

        /* renamed from: b, reason: collision with root package name */
        public final String f57558b;

        /* renamed from: c, reason: collision with root package name */
        public final int f57559c;

        public d(oi.p pVar) {
            this(((C5725s) pVar).B(), pVar);
        }

        private oi.p a() {
            switch (this.f57559c) {
                case 14:
                    return F.f57540r;
                case 15:
                    return F.f57541s;
                case 16:
                case 17:
                case 18:
                case 19:
                    return null;
                default:
                    throw new UnsupportedOperationException(this.f57558b);
            }
        }

        public static int k(F f10) {
            int i10 = ((f10.f57550b - 1) / 3) + 1;
            return i10 == 1 ? AbstractC5468b.e(f10.f57549a) ? 91 : 90 : i10 == 2 ? 91 : 92;
        }

        @Override // oi.z
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public oi.p b(F f10) {
            return a();
        }

        @Override // oi.z
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public oi.p d(F f10) {
            return a();
        }

        @Override // oi.InterfaceC5902C
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public int n(F f10) {
            switch (this.f57559c) {
                case 14:
                    return f10.f57549a;
                case 15:
                    return f10.f57550b;
                case 16:
                    return f10.f57551c;
                case 17:
                    return f10.v0();
                case 18:
                    return f10.t0();
                case 19:
                    return ((f10.f57551c - 1) / 7) + 1;
                default:
                    throw new UnsupportedOperationException(this.f57558b);
            }
        }

        @Override // oi.z
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer e(F f10) {
            switch (this.f57559c) {
                case 14:
                    return F.f57529g;
                case 15:
                    return F.f57531i;
                case 16:
                    return Integer.valueOf(AbstractC5468b.d(f10.f57549a, f10.f57550b));
                case 17:
                    return AbstractC5468b.e(f10.f57549a) ? F.f57533k : F.f57532j;
                case 18:
                    return Integer.valueOf(k(f10));
                case 19:
                    return Integer.valueOf(l(f10));
                default:
                    throw new UnsupportedOperationException(this.f57558b);
            }
        }

        public final int l(F f10) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if ((i11 * 7) + f10.f57551c > AbstractC5468b.d(f10.f57549a, f10.f57550b)) {
                    return (((r5 + (i10 * 7)) - 1) / 7) + 1;
                }
                i10 = i11;
            }
        }

        @Override // oi.z
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Integer i(F f10) {
            switch (this.f57559c) {
                case 14:
                    return F.f57528f;
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    return F.f57530h;
                default:
                    throw new UnsupportedOperationException(this.f57558b);
            }
        }

        @Override // oi.z
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public Integer p(F f10) {
            return Integer.valueOf(n(f10));
        }

        @Override // oi.InterfaceC5902C
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public F h(F f10, int i10, boolean z10) {
            if (z10) {
                return (F) f10.E(AbstractC5469c.l(i10, n(f10)), (InterfaceC5727u) F.f57548z.G(this.f57557a));
            }
            switch (this.f57559c) {
                case 14:
                    return f10.O0(i10);
                case 15:
                    return f10.N0(i10);
                case 16:
                    return f10.J0(i10);
                case 17:
                    return f10.L0(i10);
                case 18:
                    if (i10 >= 1 && i10 <= k(f10)) {
                        return (F) f10.E(i10 - f10.t0(), EnumC5706f.f57798h);
                    }
                    throw new IllegalArgumentException("Out of range: " + i10);
                case 19:
                    if (z10 || (i10 >= 1 && i10 <= l(f10))) {
                        return (F) f10.E(i10 - (((f10.f57551c - 1) / 7) + 1), EnumC5706f.f57797g);
                    }
                    throw new IllegalArgumentException("Out of range: " + i10);
                default:
                    throw new UnsupportedOperationException(this.f57558b);
            }
        }

        @Override // oi.z
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public F q(F f10, Integer num, boolean z10) {
            if (num != null) {
                return h(f10, num.intValue(), z10);
            }
            throw new IllegalArgumentException("Missing element value.");
        }

        public d(int i10, oi.p pVar) {
            this.f57557a = pVar;
            this.f57558b = pVar.name();
            this.f57559c = i10;
        }

        @Override // oi.InterfaceC5902C, oi.z
        public boolean isValid(F f10, Integer num) {
            return num != null && isValid(f10, num.intValue());
        }

        @Override // oi.InterfaceC5902C
        public boolean isValid(F f10, int i10) {
            switch (this.f57559c) {
                case 14:
                    return i10 >= -999999999 && i10 <= 999999999;
                case 15:
                    return i10 >= 1 && i10 <= 12;
                case 16:
                    return i10 >= 1 && i10 <= AbstractC5468b.d(f10.f57549a, f10.f57550b);
                case 17:
                    if (i10 >= 1) {
                        if (i10 <= (AbstractC5468b.e(f10.f57549a) ? 366 : 365)) {
                            return true;
                        }
                    }
                    return false;
                case 18:
                    return i10 >= 1 && i10 <= k(f10);
                case 19:
                    return i10 >= 1 && i10 <= l(f10);
                default:
                    throw new UnsupportedOperationException(this.f57558b);
            }
        }
    }

    public static class e implements oi.u {

        /* renamed from: a, reason: collision with root package name */
        public static final int f57560a = AbstractC5468b.h(AbstractC5468b.k(EnumC5900A.MODIFIED_JULIAN_DATE.i(AbstractC5469c.b(System.currentTimeMillis(), SessionData.EXPIRATION_TIME), EnumC5900A.UNIX))) + 20;

        public e() {
        }

        public static void c(oi.q qVar, String str) {
            oi.N n10 = oi.N.ERROR_MESSAGE;
            if (qVar.isValid((oi.p) n10, (oi.N) str)) {
                qVar.y(n10, str);
            }
        }

        public static boolean g(oi.q qVar, int i10, int i11, int i12) {
            if (i12 >= 1 && (i12 <= 28 || i12 <= AbstractC5468b.d(i10, i11))) {
                return true;
            }
            c(qVar, "DAY_OF_MONTH out of range: " + i12);
            return false;
        }

        public static boolean j(oi.q qVar, boolean z10, M m10, int i10) {
            int i11 = a.$SwitchMap$net$time4j$Quarter[m10.ordinal()];
            int i12 = 91;
            if (i11 != 1) {
                if (i11 != 2) {
                    i12 = 92;
                }
            } else if (!z10) {
                i12 = 90;
            }
            if (i10 >= 1 && i10 <= i12) {
                return true;
            }
            c(qVar, "DAY_OF_QUARTER out of range: " + i10);
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
        
            if (r4 > (li.AbstractC5468b.e(r3) ? 366 : 365)) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static boolean k(oi.q qVar, int i10, int i11) {
            if (i11 >= 1) {
                if (i11 > 365) {
                }
                return true;
            }
            c(qVar, "DAY_OF_YEAR out of range: " + i11);
            return false;
        }

        public static boolean l(oi.q qVar, int i10) {
            if (i10 >= 1 && i10 <= 12) {
                return true;
            }
            c(qVar, "MONTH_OF_YEAR out of range: " + i10);
            return false;
        }

        public static boolean m(oi.q qVar, int i10) {
            if (i10 >= -999999999 && i10 <= 999999999) {
                return true;
            }
            c(qVar, "YEAR out of range: " + i10);
            return false;
        }

        @Override // oi.u
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public F e(oi.q qVar, InterfaceC5908d interfaceC5908d, boolean z10, boolean z11) {
            Y y10;
            K k10;
            int e10;
            oi.p pVar = F.f57534l;
            if (qVar.f(pVar)) {
                return (F) qVar.j(pVar);
            }
            int e11 = qVar.e(F.f57536n);
            if (e11 != Integer.MIN_VALUE) {
                K k11 = F.f57540r;
                int e12 = qVar.e(k11);
                if (e12 == Integer.MIN_VALUE) {
                    oi.p pVar2 = F.f57539q;
                    if (qVar.f(pVar2)) {
                        e12 = ((B) qVar.j(pVar2)).b();
                    }
                }
                if (e12 != Integer.MIN_VALUE && (e10 = qVar.e((k10 = F.f57541s))) != Integer.MIN_VALUE) {
                    if (z10) {
                        return (F) ((F) F.B0(e11, 1, 1).z(k11.m(Integer.valueOf(e12)))).z(k10.m(Integer.valueOf(e10)));
                    }
                    if (m(qVar, e11) && l(qVar, e12) && g(qVar, e11, e12, e10)) {
                        return F.C0(e11, e12, e10, false);
                    }
                    return null;
                }
                K k12 = F.f57543u;
                int e13 = qVar.e(k12);
                if (e13 != Integer.MIN_VALUE) {
                    if (z10) {
                        return (F) F.A0(e11, 1).z(k12.m(Integer.valueOf(e13)));
                    }
                    if (m(qVar, e11) && k(qVar, e11, e13)) {
                        return F.A0(e11, e13);
                    }
                    return null;
                }
                int e14 = qVar.e(F.f57544v);
                if (e14 != Integer.MIN_VALUE) {
                    oi.p pVar3 = F.f57538p;
                    if (qVar.f(pVar3)) {
                        M m10 = (M) qVar.j(pVar3);
                        boolean e15 = AbstractC5468b.e(e11);
                        int i10 = (e15 ? 91 : 90) + e14;
                        if (m10 == M.Q1) {
                            i10 = e14;
                        } else if (m10 == M.Q3) {
                            i10 += 91;
                        } else if (m10 == M.Q4) {
                            i10 += EnumC3631g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE;
                        }
                        if (z10) {
                            return (F) F.A0(e11, 1).z(k12.m(Integer.valueOf(i10)));
                        }
                        if (m(qVar, e11) && j(qVar, e15, m10, e14)) {
                            return F.A0(e11, i10);
                        }
                        return null;
                    }
                }
            }
            int e16 = qVar.e(F.f57537o);
            if (e16 != Integer.MIN_VALUE) {
                a0 a0Var = a0.f57689m;
                if (qVar.f(a0Var.n())) {
                    int intValue = ((Integer) qVar.j(a0Var.n())).intValue();
                    oi.p pVar4 = F.f57542t;
                    if (!qVar.f(pVar4)) {
                        if (qVar.f(a0Var.i())) {
                            y10 = (Y) qVar.j(a0Var.i());
                        }
                        return null;
                    }
                    y10 = (Y) qVar.j(pVar4);
                    if (e16 < -999999999 || e16 > 999999999) {
                        c(qVar, F.Q0(e16));
                        return null;
                    }
                    F E02 = F.E0(e16, intValue, y10, false);
                    if (E02 == null) {
                        c(qVar, F.P0(intValue));
                    }
                    return E02;
                }
            }
            EnumC5900A enumC5900A = EnumC5900A.MODIFIED_JULIAN_DATE;
            if (qVar.f(enumC5900A)) {
                return (F) F.f57547y.b(EnumC5900A.UTC.i(((Long) qVar.j(enumC5900A)).longValue(), enumC5900A));
            }
            if (qVar instanceof InterfaceC5472f) {
                return ((H) H.M().e(qVar, interfaceC5908d, z10, z11)).P();
            }
            return null;
        }

        @Override // oi.u
        public oi.F b() {
            return oi.F.f61255a;
        }

        @Override // oi.u
        public oi.x d() {
            return null;
        }

        @Override // oi.u
        public int h() {
            return f57560a;
        }

        @Override // oi.u
        public String n(oi.y yVar, Locale locale) {
            return net.time4j.format.b.r(net.time4j.format.e.b(yVar.a()), locale);
        }

        public /* synthetic */ e(a aVar) {
            this();
        }

        @Override // oi.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public oi.o i(F f10, InterfaceC5908d interfaceC5908d) {
            return f10;
        }
    }

    public static class f implements InterfaceC5915k {
        public f() {
        }

        @Override // oi.InterfaceC5915k
        public long a() {
            return 365241779741L;
        }

        @Override // oi.InterfaceC5915k
        public long d() {
            return -365243219892L;
        }

        @Override // oi.InterfaceC5915k
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public long c(F f10) {
            return EnumC5900A.UTC.i(AbstractC5468b.j(f10), EnumC5900A.MODIFIED_JULIAN_DATE);
        }

        @Override // oi.InterfaceC5915k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public F b(long j10) {
            if (j10 == -365243219892L) {
                return F.f57526d;
            }
            if (j10 == 365241779741L) {
                return F.f57527e;
            }
            long k10 = AbstractC5468b.k(EnumC5900A.MODIFIED_JULIAN_DATE.i(j10, EnumC5900A.UTC));
            return F.B0(AbstractC5468b.h(k10), AbstractC5468b.g(k10), AbstractC5468b.f(k10));
        }

        public /* synthetic */ f(a aVar) {
            this();
        }
    }

    static {
        C5715h c5715h = C5715h.f58149a;
        f57534l = c5715h;
        f57535m = c5715h;
        C5725s y10 = C5725s.y("YEAR", 14, -999999999, 999999999, 'u');
        f57536n = y10;
        b0 b0Var = b0.f57726g;
        f57537o = b0Var;
        C5723p c5723p = new C5723p("QUARTER_OF_YEAR", M.class, M.Q1, M.Q4, 103, 'Q');
        f57538p = c5723p;
        C5723p c5723p2 = new C5723p("MONTH_OF_YEAR", B.class, B.JANUARY, B.DECEMBER, 101, 'M');
        f57539q = c5723p2;
        C5725s y11 = C5725s.y("MONTH_AS_NUMBER", 15, 1, 12, 'M');
        f57540r = y11;
        C5725s y12 = C5725s.y("DAY_OF_MONTH", 16, 1, 31, 'd');
        f57541s = y12;
        C5723p c5723p3 = new C5723p("DAY_OF_WEEK", Y.class, Y.MONDAY, Y.SUNDAY, 102, 'E');
        f57542t = c5723p3;
        C5725s y13 = C5725s.y("DAY_OF_YEAR", 17, 1, 365, 'D');
        f57543u = y13;
        C5725s y14 = C5725s.y("DAY_OF_QUARTER", 18, 1, 92, (char) 0);
        f57544v = y14;
        Z z10 = Z.f57685d;
        f57545w = z10;
        HashMap hashMap = new HashMap();
        n0(hashMap, c5715h);
        n0(hashMap, y10);
        n0(hashMap, b0Var);
        n0(hashMap, c5723p);
        n0(hashMap, c5723p2);
        n0(hashMap, y11);
        n0(hashMap, y12);
        n0(hashMap, c5723p3);
        n0(hashMap, y13);
        n0(hashMap, y14);
        n0(hashMap, z10);
        f57546x = Collections.unmodifiableMap(hashMap);
        a aVar = null;
        f fVar = new f(aVar);
        f57547y = fVar;
        H.b j10 = H.b.j(InterfaceC5727u.class, F.class, new e(aVar), fVar);
        b bVar = new b(aVar);
        EnumC5706f enumC5706f = EnumC5706f.f57798h;
        H.b e10 = j10.e(c5715h, bVar, enumC5706f).e(y10, new d(y10), EnumC5706f.f57794d).e(b0Var, b0.C(F.class), X.f57677a).e(c5723p, c.l(c5723p), EnumC5706f.f57795e);
        c l10 = c.l(c5723p2);
        EnumC5706f enumC5706f2 = EnumC5706f.f57796f;
        H.b e11 = e10.e(c5723p2, l10, enumC5706f2).e(y11, new d(y11), enumC5706f2).e(y12, new d(y12), enumC5706f).e(c5723p3, c.l(c5723p3), enumC5706f).e(y13, new d(y13), enumC5706f).e(y14, new d(y14), enumC5706f).e(z10, new d(19, z10), EnumC5706f.f57797g);
        I0(e11);
        H0(e11);
        f57548z = e11.h();
    }

    public F(int i10, int i11, int i12) {
        this.f57549a = i10;
        this.f57550b = (byte) i11;
        this.f57551c = (byte) i12;
    }

    public static F A0(int i10, int i11) {
        if (i11 < 1) {
            throw new IllegalArgumentException("Day of year out of range: " + i11);
        }
        if (i11 <= 31) {
            return B0(i10, 1, i11);
        }
        int[] iArr = AbstractC5468b.e(i10) ? DAY_OF_LEAP_YEAR_PER_MONTH : DAY_OF_YEAR_PER_MONTH;
        for (int i12 = i11 > iArr[6] ? 7 : 1; i12 < 12; i12++) {
            if (i11 <= iArr[i12]) {
                return C0(i10, i12 + 1, i11 - iArr[i12 - 1], false);
            }
        }
        throw new IllegalArgumentException("Day of year out of range: " + i11);
    }

    public static F B0(int i10, int i11, int i12) {
        return C0(i10, i11, i12, true);
    }

    public static F C0(int i10, int i11, int i12, boolean z10) {
        if (z10) {
            AbstractC5468b.a(i10, i11, i12);
        }
        return new F(i10, i11, i12);
    }

    public static F D0(int i10, int i11, Y y10) {
        return E0(i10, i11, y10, true);
    }

    public static F E0(int i10, int i11, Y y10, boolean z10) {
        if (i11 < 1 || i11 > 53) {
            if (z10) {
                throw new IllegalArgumentException(P0(i11));
            }
            return null;
        }
        if (z10 && (i10 < f57528f.intValue() || i10 > f57529g.intValue())) {
            throw new IllegalArgumentException(Q0(i10));
        }
        int b10 = Y.f(AbstractC5468b.c(i10, 1, 1)).b();
        int b11 = (((b10 <= 4 ? 2 - b10 : 9 - b10) + ((i11 - 1) * 7)) + y10.b()) - 1;
        if (b11 <= 0) {
            i10--;
            b11 += AbstractC5468b.e(i10) ? 366 : 365;
        } else {
            int i12 = AbstractC5468b.e(i10) ? 366 : 365;
            if (b11 > i12) {
                b11 -= i12;
                i10++;
            }
        }
        F A02 = A0(i10, b11);
        if (i11 != 53 || A02.y0() == 53) {
            return A02;
        }
        if (z10) {
            throw new IllegalArgumentException(P0(i11));
        }
        return null;
    }

    public static F F0(int i10, B b10, int i11) {
        return C0(i10, b10.b(), i11, true);
    }

    public static F G0(long j10, EnumC5900A enumC5900A) {
        return (F) f57547y.b(EnumC5900A.UTC.i(j10, enumC5900A));
    }

    public static void H0(H.b bVar) {
        for (oi.s sVar : AbstractC5470d.c().g(oi.s.class)) {
            if (sVar.b(F.class)) {
                bVar.f(sVar);
            }
        }
        bVar.f(new W());
    }

    public static void I0(H.b bVar) {
        EnumSet range = EnumSet.range(EnumC5706f.f57791a, EnumC5706f.f57796f);
        EnumSet range2 = EnumSet.range(EnumC5706f.f57797g, EnumC5706f.f57798h);
        EnumC5706f[] values = EnumC5706f.values();
        int length = values.length;
        int i10 = 0;
        while (i10 < length) {
            EnumC5706f enumC5706f = values[i10];
            H.b bVar2 = bVar;
            bVar2.g(enumC5706f, new EnumC5706f.j(enumC5706f), enumC5706f.getLength(), enumC5706f.compareTo(EnumC5706f.f57797g) < 0 ? range : range2);
            i10++;
            bVar = bVar2;
        }
    }

    public static String P0(int i10) {
        return "WEEK_OF_YEAR (ISO) out of range: " + i10;
    }

    public static String Q0(int i10) {
        return "YEAR_OF_WEEKDATE (ISO) out of range: " + i10;
    }

    public static F h0(F f10, long j10) {
        long f11 = AbstractC5469c.f(f10.f57551c, j10);
        if (f11 >= 1 && f11 <= 28) {
            return B0(f10.f57549a, f10.f57550b, (int) f11);
        }
        long f12 = AbstractC5469c.f(f10.v0(), j10);
        if (f12 >= 1 && f12 <= 365) {
            return A0(f10.f57549a, (int) f12);
        }
        return (F) f57547y.b(AbstractC5469c.f(f10.w0(), j10));
    }

    public static boolean isValid(int i10, int i11, int i12) {
        return AbstractC5468b.isValid(i10, i11, i12);
    }

    public static oi.H l0() {
        return f57548z;
    }

    public static F m0(EnumC5706f enumC5706f, F f10, long j10, int i10) {
        switch (a.$SwitchMap$net$time4j$CalendarUnit[enumC5706f.ordinal()]) {
            case 1:
                return m0(EnumC5706f.f57796f, f10, AbstractC5469c.i(j10, 12000L), i10);
            case 2:
                return m0(EnumC5706f.f57796f, f10, AbstractC5469c.i(j10, 1200L), i10);
            case 3:
                return m0(EnumC5706f.f57796f, f10, AbstractC5469c.i(j10, 120L), i10);
            case 4:
                return m0(EnumC5706f.f57796f, f10, AbstractC5469c.i(j10, 12L), i10);
            case 5:
                return m0(EnumC5706f.f57796f, f10, AbstractC5469c.i(j10, 3L), i10);
            case 6:
                return r0(f10, AbstractC5469c.f(f10.x0(), j10), f10.f57551c, i10);
            case 7:
                return m0(EnumC5706f.f57798h, f10, AbstractC5469c.i(j10, 7L), i10);
            case 8:
                return h0(f10, j10);
            default:
                throw new UnsupportedOperationException(enumC5706f.name());
        }
    }

    public static void n0(Map map, oi.p pVar) {
        map.put(pVar.name(), pVar);
    }

    public static void o0(StringBuilder sb2, int i10) {
        sb2.append('-');
        if (i10 < 10) {
            sb2.append('0');
        }
        sb2.append(i10);
    }

    public static void p0(StringBuilder sb2, int i10) {
        int i11;
        if (i10 < 0) {
            sb2.append('-');
            i11 = AbstractC5469c.j(i10);
        } else {
            i11 = i10;
        }
        if (i11 >= 10000) {
            if (i10 > 0) {
                sb2.append('+');
            }
        } else if (i11 < 1000) {
            sb2.append('0');
            if (i11 < 100) {
                sb2.append('0');
                if (i11 < 10) {
                    sb2.append('0');
                }
            }
        }
        sb2.append(i11);
    }

    public static F q0(InterfaceC5467a interfaceC5467a) {
        return interfaceC5467a instanceof F ? (F) interfaceC5467a : B0(interfaceC5467a.n(), interfaceC5467a.o(), interfaceC5467a.p());
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
    
        if (r11 == 2) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static F r0(F f10, long j10, int i10, int i11) {
        if (i11 == 5 && f10.f57551c == f10.lengthOfMonth()) {
            i11 = 2;
        }
        int g10 = AbstractC5469c.g(AbstractC5469c.f(AbstractC5469c.b(j10, 12), 1970L));
        int d10 = AbstractC5469c.d(j10, 12) + 1;
        int d11 = AbstractC5468b.d(g10, d10);
        if (i10 <= d11) {
            if (i10 < d11) {
            }
            return B0(g10, d10, i10);
        }
        switch (i11) {
            case 0:
            case 2:
            case 5:
            case 6:
                break;
            case 1:
                return r0(f10, AbstractC5469c.f(j10, 1L), 1, i11);
            case 3:
                return r0(f10, AbstractC5469c.f(j10, 1L), i10 - d11, i11);
            case 4:
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Day of month out of range: ");
                p0(sb2, g10);
                o0(sb2, d10);
                o0(sb2, i10);
                throw new oi.r(sb2.toString());
            default:
                throw new UnsupportedOperationException("Overflow policy not implemented: " + i11);
        }
        return B0(g10, d10, i10);
        i10 = d11;
        return B0(g10, d10, i10);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 1);
    }

    public static Object z0(String str) {
        return f57546x.get(str);
    }

    @Override // oi.q
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public oi.H s() {
        return f57548z;
    }

    @Override // oi.AbstractC5917m
    public int G(InterfaceC5911g interfaceC5911g) {
        if (!(interfaceC5911g instanceof F)) {
            return super.G(interfaceC5911g);
        }
        F f10 = (F) interfaceC5911g;
        int i10 = this.f57549a - f10.f57549a;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f57550b - f10.f57550b;
        return i11 == 0 ? this.f57551c - f10.f57551c : i11;
    }

    public final F J0(int i10) {
        return this.f57551c == i10 ? this : B0(this.f57549a, this.f57550b, i10);
    }

    public final F K0(Y y10) {
        return u0() == y10 ? this : (F) f57547y.b(AbstractC5469c.f(w0(), y10.b() - r0.b()));
    }

    public final F L0(int i10) {
        return v0() == i10 ? this : A0(this.f57549a, i10);
    }

    public F M0(long j10) {
        return (F) f57547y.b(j10);
    }

    public final F N0(int i10) {
        if (this.f57550b == i10) {
            return this;
        }
        return B0(this.f57549a, i10, Math.min(AbstractC5468b.d(this.f57549a, i10), (int) this.f57551c));
    }

    public final F O0(int i10) {
        if (this.f57549a == i10) {
            return this;
        }
        return B0(i10, this.f57550b, Math.min(AbstractC5468b.d(i10, this.f57550b), (int) this.f57551c));
    }

    @Override // oi.AbstractC5917m
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof F) {
            F f10 = (F) obj;
            if (this.f57551c == f10.f57551c && this.f57550b == f10.f57550b && this.f57549a == f10.f57549a) {
                return true;
            }
        }
        return false;
    }

    @Override // oi.AbstractC5917m
    public int hashCode() {
        int i10 = this.f57549a;
        return (((i10 << 11) + (this.f57550b << 6)) + this.f57551c) ^ (i10 & (-2048));
    }

    public H i0(G g10) {
        return H.V(this, g10);
    }

    public H j0() {
        return i0(G.f57582l);
    }

    public H k0(int i10, int i11, int i12) {
        return i0(G.C0(i10, i11, i12));
    }

    public int lengthOfMonth() {
        return AbstractC5468b.d(this.f57549a, this.f57550b);
    }

    @Override // li.InterfaceC5467a
    public int n() {
        return this.f57549a;
    }

    @Override // li.InterfaceC5467a
    public int o() {
        return this.f57550b;
    }

    @Override // li.InterfaceC5467a
    public int p() {
        return this.f57551c;
    }

    @Override // oi.q
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public F t() {
        return this;
    }

    public final int t0() {
        switch (this.f57550b) {
            case 1:
            case 4:
            case 7:
            case 10:
                return this.f57551c;
            case 2:
            case 8:
            case 11:
                return this.f57551c + 31;
            case 3:
                return (AbstractC5468b.e(this.f57549a) ? (byte) 60 : (byte) 59) + this.f57551c;
            case 5:
                return this.f57551c + 30;
            case 6:
            case 12:
                return this.f57551c + Base64.padSymbol;
            case 9:
                return this.f57551c + 62;
            default:
                throw new AssertionError("Unknown month: " + ((int) this.f57550b));
        }
    }

    @Override // li.InterfaceC5467a
    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        p0(sb2, this.f57549a);
        o0(sb2, this.f57550b);
        o0(sb2, this.f57551c);
        return sb2.toString();
    }

    public Y u0() {
        return Y.f(AbstractC5468b.c(this.f57549a, this.f57550b, this.f57551c));
    }

    public int v0() {
        byte b10 = this.f57550b;
        return b10 != 1 ? b10 != 2 ? DAY_OF_YEAR_PER_MONTH[b10 - 2] + this.f57551c + (AbstractC5468b.e(this.f57549a) ? 1 : 0) : this.f57551c + 31 : this.f57551c;
    }

    public long w0() {
        return f57547y.c(this);
    }

    public long x0() {
        return (((this.f57549a - 1970) * 12) + this.f57550b) - 1;
    }

    public int y0() {
        return ((Integer) j(a0.f57689m.n())).intValue();
    }
}
