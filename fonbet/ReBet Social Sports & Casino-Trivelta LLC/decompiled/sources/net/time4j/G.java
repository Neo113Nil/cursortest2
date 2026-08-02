package net.time4j;

import ai.verisoul.sdk.helpers.session.SessionData;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.time.DurationKt;
import li.AbstractC5469c;
import li.AbstractC5470d;
import li.InterfaceC5472f;
import li.InterfaceC5473g;
import net.time4j.C5718k;
import oi.H;
import oi.InterfaceC5908d;
import org.bouncycastle.math.ec.Tnaf;

/* loaded from: classes5.dex */
public final class G extends oi.K implements InterfaceC5473g, net.time4j.format.h {

    /* renamed from: A, reason: collision with root package name */
    public static final K f57561A;

    /* renamed from: B, reason: collision with root package name */
    public static final K f57562B;

    /* renamed from: C, reason: collision with root package name */
    public static final K f57563C;

    /* renamed from: D, reason: collision with root package name */
    public static final K f57564D;

    /* renamed from: E, reason: collision with root package name */
    public static final K f57565E;

    /* renamed from: F, reason: collision with root package name */
    public static final d0 f57566F;

    /* renamed from: G, reason: collision with root package name */
    public static final d0 f57567G;

    /* renamed from: H, reason: collision with root package name */
    public static final d0 f57568H;
    private static final G[] HOURS;

    /* renamed from: I, reason: collision with root package name */
    public static final oi.p f57569I;

    /* renamed from: J, reason: collision with root package name */
    public static final Map f57570J;

    /* renamed from: K, reason: collision with root package name */
    public static final oi.z f57571K;

    /* renamed from: L, reason: collision with root package name */
    public static final oi.z f57572L;

    /* renamed from: O, reason: collision with root package name */
    public static final oi.z f57573O;

    /* renamed from: P, reason: collision with root package name */
    public static final oi.H f57574P;

    /* renamed from: e, reason: collision with root package name */
    public static final char f57575e;

    /* renamed from: f, reason: collision with root package name */
    public static final BigDecimal f57576f;

    /* renamed from: g, reason: collision with root package name */
    public static final BigDecimal f57577g;

    /* renamed from: h, reason: collision with root package name */
    public static final BigDecimal f57578h;

    /* renamed from: i, reason: collision with root package name */
    public static final BigDecimal f57579i;

    /* renamed from: j, reason: collision with root package name */
    public static final BigDecimal f57580j;

    /* renamed from: k, reason: collision with root package name */
    public static final BigDecimal f57581k;

    /* renamed from: l, reason: collision with root package name */
    public static final G f57582l;

    /* renamed from: m, reason: collision with root package name */
    public static final G f57583m;

    /* renamed from: n, reason: collision with root package name */
    public static final oi.p f57584n;

    /* renamed from: o, reason: collision with root package name */
    public static final V f57585o;

    /* renamed from: p, reason: collision with root package name */
    public static final d0 f57586p;

    /* renamed from: q, reason: collision with root package name */
    public static final InterfaceC5703c f57587q;

    /* renamed from: r, reason: collision with root package name */
    public static final InterfaceC5703c f57588r;

    /* renamed from: s, reason: collision with root package name */
    public static final K f57589s;
    private static final long serialVersionUID = 2780881537313863339L;

    /* renamed from: t, reason: collision with root package name */
    public static final K f57590t;

    /* renamed from: u, reason: collision with root package name */
    public static final K f57591u;

    /* renamed from: v, reason: collision with root package name */
    public static final K f57592v;

    /* renamed from: w, reason: collision with root package name */
    public static final K f57593w;

    /* renamed from: x, reason: collision with root package name */
    public static final K f57594x;

    /* renamed from: y, reason: collision with root package name */
    public static final K f57595y;

    /* renamed from: z, reason: collision with root package name */
    public static final K f57596z;

    /* renamed from: a, reason: collision with root package name */
    public final transient byte f57597a;

    /* renamed from: b, reason: collision with root package name */
    public final transient byte f57598b;

    /* renamed from: c, reason: collision with root package name */
    public final transient byte f57599c;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f57600d;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$net$time4j$ClockUnit;

        static {
            int[] iArr = new int[EnumC5714g.values().length];
            $SwitchMap$net$time4j$ClockUnit = iArr;
            try {
                iArr[EnumC5714g.f58143a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$time4j$ClockUnit[EnumC5714g.f58144b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$time4j$ClockUnit[EnumC5714g.f58145c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$net$time4j$ClockUnit[EnumC5714g.f58146d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$net$time4j$ClockUnit[EnumC5714g.f58147e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$net$time4j$ClockUnit[EnumC5714g.f58148f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static class b implements oi.z {

        /* renamed from: a, reason: collision with root package name */
        public final oi.p f57601a;

        /* renamed from: b, reason: collision with root package name */
        public final BigDecimal f57602b;

        public b(oi.p pVar, BigDecimal bigDecimal) {
            this.f57601a = pVar;
            this.f57602b = bigDecimal;
        }

        public static BigDecimal a(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            return bigDecimal.divide(bigDecimal2, 16, RoundingMode.FLOOR);
        }

        public static int l(BigDecimal bigDecimal) {
            return Math.min(999999999, bigDecimal.movePointRight(9).setScale(0, RoundingMode.HALF_UP).intValue());
        }

        @Override // oi.z
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public oi.p b(G g10) {
            return null;
        }

        @Override // oi.z
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public oi.p d(G g10) {
            return null;
        }

        @Override // oi.z
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public BigDecimal e(G g10) {
            oi.p pVar;
            return (g10.f57597a == 24 && ((pVar = this.f57601a) == G.f57567G || pVar == G.f57568H)) ? BigDecimal.ZERO : this.f57602b;
        }

        @Override // oi.z
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public BigDecimal i(G g10) {
            return BigDecimal.ZERO;
        }

        @Override // oi.z
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public BigDecimal p(G g10) {
            BigDecimal add;
            oi.p pVar = this.f57601a;
            if (pVar == G.f57566F) {
                if (g10.equals(G.f57582l)) {
                    return BigDecimal.ZERO;
                }
                if (g10.f57597a == 24) {
                    return G.f57579i;
                }
                add = BigDecimal.valueOf(g10.f57597a).add(a(BigDecimal.valueOf(g10.f57598b), G.f57576f)).add(a(BigDecimal.valueOf(g10.f57599c), G.f57577g)).add(a(BigDecimal.valueOf(g10.f57600d), G.f57577g.multiply(G.f57578h)));
            } else if (pVar == G.f57567G) {
                if (g10.t0()) {
                    return BigDecimal.ZERO;
                }
                add = BigDecimal.valueOf(g10.f57598b).add(a(BigDecimal.valueOf(g10.f57599c), G.f57576f)).add(a(BigDecimal.valueOf(g10.f57600d), G.f57576f.multiply(G.f57578h)));
            } else {
                if (pVar != G.f57568H) {
                    throw new UnsupportedOperationException(this.f57601a.name());
                }
                if (g10.u0()) {
                    return BigDecimal.ZERO;
                }
                add = BigDecimal.valueOf(g10.f57599c).add(a(BigDecimal.valueOf(g10.f57600d), G.f57578h));
            }
            return com.google.android.gms.internal.measurement.a.a(add.setScale(15, RoundingMode.FLOOR));
        }

        @Override // oi.z
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public G q(G g10, BigDecimal bigDecimal, boolean z10) {
            int i10;
            int i11;
            long j10;
            int i12;
            int i13;
            int i14;
            int i15;
            if (bigDecimal == null) {
                throw new IllegalArgumentException("Missing element value.");
            }
            oi.p pVar = this.f57601a;
            if (pVar == G.f57566F) {
                RoundingMode roundingMode = RoundingMode.FLOOR;
                BigDecimal scale = bigDecimal.setScale(0, roundingMode);
                BigDecimal multiply = bigDecimal.subtract(scale).multiply(G.f57576f);
                BigDecimal scale2 = multiply.setScale(0, roundingMode);
                BigDecimal multiply2 = multiply.subtract(scale2).multiply(G.f57576f);
                BigDecimal scale3 = multiply2.setScale(0, roundingMode);
                j10 = scale.longValueExact();
                i12 = scale2.intValue();
                i11 = scale3.intValue();
                i13 = l(multiply2.subtract(scale3));
            } else if (pVar == G.f57567G) {
                RoundingMode roundingMode2 = RoundingMode.FLOOR;
                BigDecimal scale4 = bigDecimal.setScale(0, roundingMode2);
                BigDecimal multiply3 = bigDecimal.subtract(scale4).multiply(G.f57576f);
                BigDecimal scale5 = multiply3.setScale(0, roundingMode2);
                i11 = scale5.intValue();
                int l10 = l(multiply3.subtract(scale5));
                long longValueExact = scale4.longValueExact();
                long j11 = g10.f57597a;
                if (z10) {
                    j11 += AbstractC5469c.b(longValueExact, 60);
                    i14 = AbstractC5469c.d(longValueExact, 60);
                } else {
                    G.e0(longValueExact);
                    i14 = (int) longValueExact;
                }
                j10 = j11;
                i12 = i14;
                i13 = l10;
            } else {
                if (pVar != G.f57568H) {
                    throw new UnsupportedOperationException(this.f57601a.name());
                }
                BigDecimal scale6 = bigDecimal.setScale(0, RoundingMode.FLOOR);
                int l11 = l(bigDecimal.subtract(scale6));
                long longValueExact2 = scale6.longValueExact();
                long j12 = g10.f57597a;
                int i16 = g10.f57598b;
                if (z10) {
                    i10 = AbstractC5469c.d(longValueExact2, 60);
                    long b10 = i16 + AbstractC5469c.b(longValueExact2, 60);
                    j12 += AbstractC5469c.b(b10, 60);
                    i16 = AbstractC5469c.d(b10, 60);
                } else {
                    G.g0(longValueExact2);
                    i10 = (int) longValueExact2;
                }
                i11 = i10;
                j10 = j12;
                i12 = i16;
                i13 = l11;
            }
            if (z10) {
                i15 = AbstractC5469c.d(j10, 24);
                if (j10 > 0 && (i15 | i12 | i11 | i13) == 0) {
                    return G.f57583m;
                }
            } else {
                if (j10 < 0 || j10 > 24) {
                    throw new IllegalArgumentException("Value out of range: " + bigDecimal);
                }
                i15 = (int) j10;
            }
            return G.D0(i15, i12, i11, i13);
        }

        @Override // oi.z
        public boolean isValid(G g10, BigDecimal bigDecimal) {
            oi.p pVar;
            if (bigDecimal == null) {
                return false;
            }
            return (g10.f57597a == 24 && ((pVar = this.f57601a) == G.f57567G || pVar == G.f57568H)) ? BigDecimal.ZERO.compareTo(bigDecimal) == 0 : BigDecimal.ZERO.compareTo(bigDecimal) <= 0 && this.f57602b.compareTo(bigDecimal) >= 0;
        }
    }

    public static class c implements oi.M {

        /* renamed from: a, reason: collision with root package name */
        public final EnumC5714g f57603a;

        public /* synthetic */ c(EnumC5714g enumC5714g, a aVar) {
            this(enumC5714g);
        }

        public static C5717j e(G g10, long j10, EnumC5714g enumC5714g) {
            return (j10 != 0 || g10.f57597a >= 24) ? (C5717j) g(C5717j.class, enumC5714g, g10, j10) : new C5717j(0L, g10);
        }

        public static Object g(Class cls, EnumC5714g enumC5714g, G g10, long j10) {
            long f10;
            int i10 = g10.f57598b;
            int i11 = g10.f57599c;
            int i12 = g10.f57600d;
            switch (a.$SwitchMap$net$time4j$ClockUnit[enumC5714g.ordinal()]) {
                case 1:
                    f10 = AbstractC5469c.f(g10.f57597a, j10);
                    break;
                case 2:
                    long f11 = AbstractC5469c.f(g10.f57598b, j10);
                    f10 = AbstractC5469c.f(g10.f57597a, AbstractC5469c.b(f11, 60));
                    i10 = AbstractC5469c.d(f11, 60);
                    break;
                case 3:
                    long f12 = AbstractC5469c.f(g10.f57599c, j10);
                    long f13 = AbstractC5469c.f(g10.f57598b, AbstractC5469c.b(f12, 60));
                    f10 = AbstractC5469c.f(g10.f57597a, AbstractC5469c.b(f13, 60));
                    int d10 = AbstractC5469c.d(f13, 60);
                    i11 = AbstractC5469c.d(f12, 60);
                    i10 = d10;
                    break;
                case 4:
                    return g(cls, EnumC5714g.f58148f, g10, AbstractC5469c.i(j10, 1000000L));
                case 5:
                    return g(cls, EnumC5714g.f58148f, g10, AbstractC5469c.i(j10, 1000L));
                case 6:
                    long f14 = AbstractC5469c.f(g10.f57600d, j10);
                    long f15 = AbstractC5469c.f(g10.f57599c, AbstractC5469c.b(f14, 1000000000));
                    long f16 = AbstractC5469c.f(g10.f57598b, AbstractC5469c.b(f15, 60));
                    f10 = AbstractC5469c.f(g10.f57597a, AbstractC5469c.b(f16, 60));
                    int d11 = AbstractC5469c.d(f16, 60);
                    int d12 = AbstractC5469c.d(f15, 60);
                    int d13 = AbstractC5469c.d(f14, 1000000000);
                    i10 = d11;
                    i11 = d12;
                    i12 = d13;
                    break;
                default:
                    throw new UnsupportedOperationException(enumC5714g.name());
            }
            int d14 = AbstractC5469c.d(f10, 24);
            G D02 = (((d14 | i10) | i11) | i12) == 0 ? (j10 <= 0 || cls != G.class) ? G.f57582l : G.f57583m : G.D0(d14, i10, i11, i12);
            return cls == G.class ? cls.cast(D02) : cls.cast(new C5717j(AbstractC5469c.b(f10, 24), D02));
        }

        @Override // oi.M
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public G b(G g10, long j10) {
            return j10 == 0 ? g10 : (G) g(G.class, this.f57603a, g10, j10);
        }

        @Override // oi.M
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public long a(G g10, G g11) {
            long j10;
            long p02 = g11.p0() - g10.p0();
            switch (a.$SwitchMap$net$time4j$ClockUnit[this.f57603a.ordinal()]) {
                case 1:
                    j10 = 3600000000000L;
                    break;
                case 2:
                    j10 = 60000000000L;
                    break;
                case 3:
                    j10 = 1000000000;
                    break;
                case 4:
                    j10 = 1000000;
                    break;
                case 5:
                    j10 = 1000;
                    break;
                case 6:
                    j10 = 1;
                    break;
                default:
                    throw new UnsupportedOperationException(this.f57603a.name());
            }
            return p02 / j10;
        }

        public c(EnumC5714g enumC5714g) {
            this.f57603a = enumC5714g;
        }
    }

    public static class d implements oi.z {

        /* renamed from: a, reason: collision with root package name */
        public final oi.p f57604a;

        /* renamed from: b, reason: collision with root package name */
        public final int f57605b;

        /* renamed from: c, reason: collision with root package name */
        public final int f57606c;

        /* renamed from: d, reason: collision with root package name */
        public final int f57607d;

        public d(oi.p pVar, int i10, int i11) {
            this.f57604a = pVar;
            if (pVar instanceof C5726t) {
                this.f57605b = ((C5726t) pVar).C();
            } else {
                this.f57605b = -1;
            }
            this.f57606c = i10;
            this.f57607d = i11;
        }

        public static boolean l(G g10) {
            return g10.f57597a < 12 || g10.f57597a == 24;
        }

        public final oi.p a(G g10) {
            switch (this.f57605b) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    return G.f57592v;
                case 6:
                case 7:
                    return G.f57594x;
                case 8:
                case 9:
                    return G.f57562B;
                default:
                    return null;
            }
        }

        @Override // oi.z
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public oi.p b(G g10) {
            return a(g10);
        }

        @Override // oi.z
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public oi.p d(G g10) {
            return a(g10);
        }

        @Override // oi.z
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer e(G g10) {
            if (g10.f57597a == 24) {
                switch (this.f57605b) {
                    case 6:
                    case 8:
                    case 10:
                    case 11:
                    case 12:
                        return 0;
                }
            }
            return g10.q0(this.f57604a) ? Integer.valueOf(this.f57607d - 1) : Integer.valueOf(this.f57607d);
        }

        @Override // oi.z
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer i(G g10) {
            return Integer.valueOf(this.f57606c);
        }

        @Override // oi.z
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer p(G g10) {
            int i10;
            byte b10;
            int i11 = 12;
            switch (this.f57605b) {
                case 1:
                    int i12 = g10.f57597a % 12;
                    if (i12 != 0) {
                        i11 = i12;
                    }
                    return Integer.valueOf(i11);
                case 2:
                    i11 = g10.f57597a % 24;
                    if (i11 == 0) {
                        i11 = 24;
                    }
                    return Integer.valueOf(i11);
                case 3:
                    i11 = g10.f57597a % 12;
                    return Integer.valueOf(i11);
                case 4:
                    i11 = g10.f57597a % 24;
                    return Integer.valueOf(i11);
                case 5:
                    i11 = g10.f57597a;
                    return Integer.valueOf(i11);
                case 6:
                    i11 = g10.f57598b;
                    return Integer.valueOf(i11);
                case 7:
                    i10 = g10.f57597a * 60;
                    b10 = g10.f57598b;
                    i11 = i10 + b10;
                    return Integer.valueOf(i11);
                case 8:
                    i11 = g10.f57599c;
                    return Integer.valueOf(i11);
                case 9:
                    i10 = (g10.f57597a * Tnaf.POW_2_WIDTH) + (g10.f57598b * 60);
                    b10 = g10.f57599c;
                    i11 = i10 + b10;
                    return Integer.valueOf(i11);
                case 10:
                    i11 = g10.f57600d / DurationKt.NANOS_IN_MILLIS;
                    return Integer.valueOf(i11);
                case 11:
                    i11 = g10.f57600d / 1000;
                    return Integer.valueOf(i11);
                case 12:
                    i11 = g10.f57600d;
                    return Integer.valueOf(i11);
                case 13:
                    i11 = (int) (g10.p0() / 1000000);
                    return Integer.valueOf(i11);
                default:
                    throw new UnsupportedOperationException(this.f57604a.name());
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
        
            if (l(r7) != false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
        
            r8 = r8 + 12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
        
            if (l(r7) != false) goto L22;
         */
        @Override // oi.z
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public G q(G g10, Integer num, boolean z10) {
            int i10;
            int i11;
            if (num == null) {
                throw new IllegalArgumentException("Missing element value.");
            }
            if (z10) {
                return q(g10, num.intValue());
            }
            if (!isValid(g10, num)) {
                throw new IllegalArgumentException("Value out of range: " + num);
            }
            int i12 = g10.f57597a;
            int i13 = g10.f57598b;
            int i14 = g10.f57599c;
            int i15 = g10.f57600d;
            int intValue = num.intValue();
            switch (this.f57605b) {
                case 1:
                    if (intValue == 12) {
                        intValue = 0;
                    }
                    break;
                case 2:
                    if (intValue == 24) {
                        i12 = 0;
                        return G.D0(i12, i13, i14, i15);
                    }
                    i12 = intValue;
                    return G.D0(i12, i13, i14, i15);
                case 3:
                    break;
                case 4:
                case 5:
                    i12 = intValue;
                    return G.D0(i12, i13, i14, i15);
                case 6:
                    i13 = intValue;
                    return G.D0(i12, i13, i14, i15);
                case 7:
                    i12 = intValue / 60;
                    i13 = intValue % 60;
                    return G.D0(i12, i13, i14, i15);
                case 8:
                    i14 = intValue;
                    return G.D0(i12, i13, i14, i15);
                case 9:
                    i12 = intValue / 3600;
                    int i16 = intValue % 3600;
                    i13 = i16 / 60;
                    i14 = i16 % 60;
                    return G.D0(i12, i13, i14, i15);
                case 10:
                    i10 = intValue * DurationKt.NANOS_IN_MILLIS;
                    i11 = g10.f57600d % DurationKt.NANOS_IN_MILLIS;
                    i15 = i10 + i11;
                    return G.D0(i12, i13, i14, i15);
                case 11:
                    i10 = intValue * 1000;
                    i11 = g10.f57600d % 1000;
                    i15 = i10 + i11;
                    return G.D0(i12, i13, i14, i15);
                case 12:
                    i15 = intValue;
                    return G.D0(i12, i13, i14, i15);
                case 13:
                    return G.j0(intValue, g10.f57600d % DurationKt.NANOS_IN_MILLIS);
                default:
                    throw new UnsupportedOperationException(this.f57604a.name());
            }
        }

        public final G q(G g10, int i10) {
            oi.p pVar = this.f57604a;
            if (pVar == G.f57591u || pVar == G.f57590t || pVar == G.f57589s) {
                return (G) g10.E(AbstractC5469c.l(i10, ((Integer) g10.j(pVar)).intValue()), EnumC5714g.f58143a);
            }
            if (pVar == G.f57592v) {
                return (G) g10.E(AbstractC5469c.l(i10, g10.f57598b), EnumC5714g.f58144b);
            }
            if (pVar == G.f57594x) {
                return (G) g10.E(AbstractC5469c.l(i10, g10.f57599c), EnumC5714g.f58145c);
            }
            if (pVar == G.f57596z) {
                return (G) g10.E(AbstractC5469c.l(i10, ((Integer) g10.j(r1)).intValue()), EnumC5714g.f58146d);
            }
            if (pVar == G.f57561A) {
                return (G) g10.E(AbstractC5469c.l(i10, ((Integer) g10.j(r1)).intValue()), EnumC5714g.f58147e);
            }
            if (pVar == G.f57562B) {
                return (G) g10.E(AbstractC5469c.l(i10, g10.f57600d), EnumC5714g.f58148f);
            }
            if (pVar == G.f57563C) {
                int c10 = AbstractC5469c.c(i10, SessionData.EXPIRATION_TIME);
                int i11 = g10.f57600d % DurationKt.NANOS_IN_MILLIS;
                return (c10 == 0 && i11 == 0) ? i10 > 0 ? G.f57583m : G.f57582l : G.j0(c10, i11);
            }
            if (pVar == G.f57593w) {
                int c11 = AbstractC5469c.c(i10, 1440);
                return (c11 == 0 && g10.u0()) ? i10 > 0 ? G.f57583m : G.f57582l : o(g10, Integer.valueOf(c11), false);
            }
            if (pVar != G.f57595y) {
                throw new UnsupportedOperationException(this.f57604a.name());
            }
            int c12 = AbstractC5469c.c(i10, 86400);
            return (c12 == 0 && g10.f57600d == 0) ? i10 > 0 ? G.f57583m : G.f57582l : o(g10, Integer.valueOf(c12), false);
        }

        @Override // oi.z
        public boolean isValid(G g10, Integer num) {
            int intValue;
            int i10;
            if (num == null || (intValue = num.intValue()) < this.f57606c || intValue > (i10 = this.f57607d)) {
                return false;
            }
            if (intValue == i10) {
                int i11 = this.f57605b;
                if (i11 == 5) {
                    return g10.t0();
                }
                if (i11 == 7) {
                    return g10.u0();
                }
                if (i11 == 9) {
                    return g10.f57600d == 0;
                }
                if (i11 == 13) {
                    return g10.f57600d % DurationKt.NANOS_IN_MILLIS == 0;
                }
            }
            if (g10.f57597a == 24) {
                switch (this.f57605b) {
                    case 6:
                    case 8:
                    case 10:
                    case 11:
                    case 12:
                        return intValue == 0;
                }
            }
            return true;
        }
    }

    public static class e implements oi.z {

        /* renamed from: a, reason: collision with root package name */
        public final oi.p f57608a;

        /* renamed from: b, reason: collision with root package name */
        public final long f57609b;

        /* renamed from: c, reason: collision with root package name */
        public final long f57610c;

        public e(oi.p pVar, long j10, long j11) {
            this.f57608a = pVar;
            this.f57609b = j10;
            this.f57610c = j11;
        }

        @Override // oi.z
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public oi.p b(G g10) {
            return null;
        }

        @Override // oi.z
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public oi.p d(G g10) {
            return null;
        }

        @Override // oi.z
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Long e(G g10) {
            return (this.f57608a != G.f57564D || g10.f57600d % 1000 == 0) ? Long.valueOf(this.f57610c) : Long.valueOf(this.f57610c - 1);
        }

        @Override // oi.z
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Long i(G g10) {
            return Long.valueOf(this.f57609b);
        }

        @Override // oi.z
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Long p(G g10) {
            return Long.valueOf(this.f57608a == G.f57564D ? g10.p0() / 1000 : g10.p0());
        }

        @Override // oi.z
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public G q(G g10, Long l10, boolean z10) {
            if (l10 == null) {
                throw new IllegalArgumentException("Missing element value.");
            }
            if (z10) {
                return l(g10, l10.longValue());
            }
            if (isValid(g10, l10)) {
                long longValue = l10.longValue();
                return this.f57608a == G.f57564D ? G.i0(longValue, g10.f57600d % 1000) : G.k0(longValue);
            }
            throw new IllegalArgumentException("Value out of range: " + l10);
        }

        public final G l(G g10, long j10) {
            if (this.f57608a != G.f57564D) {
                long n02 = G.n0(j10, 86400000000000L);
                return (n02 != 0 || j10 <= 0) ? G.k0(n02) : G.f57583m;
            }
            long n03 = G.n0(j10, 86400000000L);
            int i10 = g10.f57600d % 1000;
            return (n03 == 0 && i10 == 0 && j10 > 0) ? G.f57583m : G.i0(n03, i10);
        }

        @Override // oi.z
        public boolean isValid(G g10, Long l10) {
            if (l10 == null) {
                return false;
            }
            return (this.f57608a == G.f57564D && l10.longValue() == this.f57610c) ? g10.f57600d % 1000 == 0 : this.f57609b <= l10.longValue() && l10.longValue() <= this.f57610c;
        }
    }

    public static class f implements oi.u {
        public f() {
        }

        private static void c(oi.q qVar, String str) {
            oi.N n10 = oi.N.ERROR_MESSAGE;
            if (qVar.isValid((oi.p) n10, (oi.N) str)) {
                qVar.y(n10, str);
            }
        }

        public static int g(oi.q qVar) {
            int e10 = qVar.e(G.f57590t);
            if (e10 != Integer.MIN_VALUE) {
                return e10;
            }
            int e11 = qVar.e(G.f57588r);
            if (e11 == 0) {
                return -1;
            }
            if (e11 == 24) {
                return 0;
            }
            if (e11 != Integer.MIN_VALUE) {
                return e11;
            }
            d0 d0Var = G.f57586p;
            if (qVar.f(d0Var)) {
                EnumC5732z enumC5732z = (EnumC5732z) qVar.j(d0Var);
                int e12 = qVar.e(G.f57587q);
                if (e12 != Integer.MIN_VALUE) {
                    if (e12 == 0) {
                        return enumC5732z == EnumC5732z.AM ? -1 : -2;
                    }
                    int i10 = e12 != 12 ? e12 : 0;
                    return enumC5732z == EnumC5732z.AM ? i10 : i10 + 12;
                }
                int e13 = qVar.e(G.f57589s);
                if (e13 != Integer.MIN_VALUE) {
                    return enumC5732z == EnumC5732z.AM ? e13 : e13 + 12;
                }
            }
            return Integer.MIN_VALUE;
        }

        public static G j(oi.q qVar) {
            int intValue;
            int intValue2;
            K k10 = G.f57565E;
            if (qVar.f(k10)) {
                long longValue = ((Long) qVar.j(k10)).longValue();
                if (longValue >= 0 && longValue <= 86400000000000L) {
                    return G.k0(longValue);
                }
                c(qVar, "NANO_OF_DAY out of range: " + longValue);
                return null;
            }
            K k11 = G.f57564D;
            if (qVar.f(k11)) {
                K k12 = G.f57562B;
                return G.i0(((Long) qVar.j(k11)).longValue(), qVar.f(k12) ? ((Integer) qVar.j(k12)).intValue() % 1000 : 0);
            }
            K k13 = G.f57563C;
            if (!qVar.f(k13)) {
                K k14 = G.f57595y;
                if (qVar.f(k14)) {
                    K k15 = G.f57562B;
                    if (qVar.f(k15)) {
                        intValue2 = ((Integer) qVar.j(k15)).intValue();
                    } else {
                        K k16 = G.f57561A;
                        if (qVar.f(k16)) {
                            intValue2 = ((Integer) qVar.j(k16)).intValue() * 1000;
                        } else {
                            K k17 = G.f57596z;
                            intValue2 = qVar.f(k17) ? ((Integer) qVar.j(k17)).intValue() * DurationKt.NANOS_IN_MILLIS : 0;
                        }
                    }
                    return (G) G.D0(0, 0, 0, intValue2).y(k14, qVar.j(k14));
                }
                K k18 = G.f57593w;
                if (!qVar.f(k18)) {
                    return null;
                }
                K k19 = G.f57562B;
                if (qVar.f(k19)) {
                    intValue = ((Integer) qVar.j(k19)).intValue();
                } else {
                    K k20 = G.f57561A;
                    if (qVar.f(k20)) {
                        intValue = ((Integer) qVar.j(k20)).intValue() * 1000;
                    } else {
                        K k21 = G.f57596z;
                        intValue = qVar.f(k21) ? ((Integer) qVar.j(k21)).intValue() * DurationKt.NANOS_IN_MILLIS : 0;
                    }
                }
                K k22 = G.f57594x;
                return (G) G.D0(0, 0, qVar.f(k22) ? ((Integer) qVar.j(k22)).intValue() : 0, intValue).y(k18, qVar.j(k18));
            }
            K k23 = G.f57562B;
            if (qVar.f(k23)) {
                int intValue3 = ((Integer) qVar.j(k23)).intValue();
                if (intValue3 < 0 || intValue3 >= 1000000000) {
                    c(qVar, "NANO_OF_SECOND out of range: " + intValue3);
                    return null;
                }
                r3 = intValue3 % DurationKt.NANOS_IN_MILLIS;
            } else {
                K k24 = G.f57561A;
                if (qVar.f(k24)) {
                    int intValue4 = ((Integer) qVar.j(k24)).intValue();
                    if (intValue4 < 0 || intValue4 >= 1000000) {
                        c(qVar, "MICRO_OF_SECOND out of range: " + intValue4);
                        return null;
                    }
                    r3 = intValue4 % 1000;
                }
            }
            int intValue5 = ((Integer) qVar.j(k13)).intValue();
            if (intValue5 >= 0 && intValue5 <= 86400000) {
                return G.j0(intValue5, r3);
            }
            c(qVar, "MILLI_OF_DAY out of range: " + intValue5);
            return null;
        }

        @Override // oi.u
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public G e(oi.q qVar, InterfaceC5908d interfaceC5908d, boolean z10, boolean z11) {
            if (qVar instanceof InterfaceC5472f) {
                return ((H) H.M().e(qVar, interfaceC5908d, z10, z11)).R();
            }
            oi.p pVar = G.f57584n;
            if (qVar.f(pVar)) {
                return (G) qVar.j(pVar);
            }
            d0 d0Var = G.f57566F;
            if (qVar.f(d0Var)) {
                return G.F0((BigDecimal) qVar.j(d0Var));
            }
            int e10 = qVar.e(G.f57591u);
            if (e10 == Integer.MIN_VALUE) {
                e10 = g(qVar);
                if (e10 == Integer.MIN_VALUE) {
                    return j(qVar);
                }
                if (e10 == -1 || e10 == -2) {
                    if (!z10) {
                        c(qVar, "Clock hour cannot be zero.");
                        return null;
                    }
                    e10 = e10 == -1 ? 0 : 12;
                } else if (e10 == 24 && !z10) {
                    c(qVar, "Time 24:00 not allowed, use lax mode or element HOUR_FROM_0_TO_24 instead.");
                    return null;
                }
            }
            d0 d0Var2 = G.f57567G;
            if (qVar.f(d0Var2)) {
                return (G) G.f57572L.q(G.A0(e10), qVar.j(d0Var2), false);
            }
            int e11 = qVar.e(G.f57592v);
            if (e11 == Integer.MIN_VALUE) {
                e11 = 0;
            }
            d0 d0Var3 = G.f57568H;
            if (qVar.f(d0Var3)) {
                return (G) G.f57573O.q(G.B0(e10, e11), qVar.j(d0Var3), false);
            }
            int e12 = qVar.e(G.f57594x);
            if (e12 == Integer.MIN_VALUE) {
                e12 = 0;
            }
            int e13 = qVar.e(G.f57562B);
            if (e13 == Integer.MIN_VALUE) {
                int e14 = qVar.e(G.f57561A);
                if (e14 == Integer.MIN_VALUE) {
                    int e15 = qVar.e(G.f57596z);
                    e13 = e15 == Integer.MIN_VALUE ? 0 : AbstractC5469c.h(e15, DurationKt.NANOS_IN_MILLIS);
                } else {
                    e13 = AbstractC5469c.h(e14, 1000);
                }
            }
            if (z10) {
                long f10 = AbstractC5469c.f(AbstractC5469c.i(AbstractC5469c.f(AbstractC5469c.f(AbstractC5469c.i(e10, 3600L), AbstractC5469c.i(e11, 60L)), e12), 1000000000L), e13);
                long n02 = G.n0(f10, 86400000000000L);
                long m02 = G.m0(f10, 86400000000000L);
                if (m02 != 0) {
                    oi.p pVar2 = C5730x.f58414g;
                    if (qVar.isValid(pVar2, m02)) {
                        qVar.x(pVar2, m02);
                    }
                }
                return (n02 != 0 || m02 <= 0) ? G.k0(n02) : G.f57583m;
            }
            if ((e10 >= 0 && e11 >= 0 && e12 >= 0 && e13 >= 0 && e10 == 24 && (e11 | e12 | e13) == 0) || (e10 < 24 && e11 <= 59 && e12 <= 59 && e13 <= 1000000000)) {
                return G.E0(e10, e11, e12, e13, false);
            }
            c(qVar, "Time component out of range.");
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
            return F.l0().h();
        }

        @Override // oi.u
        public String n(oi.y yVar, Locale locale) {
            return net.time4j.format.b.t(net.time4j.format.e.b(yVar.a()), locale);
        }

        public /* synthetic */ f(a aVar) {
            this();
        }

        @Override // oi.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public oi.o i(G g10, InterfaceC5908d interfaceC5908d) {
            return g10;
        }
    }

    public static class g implements oi.z {
        public g() {
        }

        @Override // oi.z
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public oi.p b(G g10) {
            return G.f57589s;
        }

        @Override // oi.z
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public oi.p d(G g10) {
            return G.f57589s;
        }

        @Override // oi.z
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public EnumC5732z e(G g10) {
            return EnumC5732z.PM;
        }

        @Override // oi.z
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public EnumC5732z i(G g10) {
            return EnumC5732z.AM;
        }

        @Override // oi.z
        public boolean isValid(G g10, EnumC5732z enumC5732z) {
            return enumC5732z != null;
        }

        @Override // oi.z
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public EnumC5732z p(G g10) {
            return EnumC5732z.c(g10.f57597a);
        }

        @Override // oi.z
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public G q(G g10, EnumC5732z enumC5732z, boolean z10) {
            int i10 = g10.f57597a == 24 ? 0 : g10.f57597a;
            if (enumC5732z == null) {
                throw new IllegalArgumentException("Missing am/pm-value.");
            }
            if (enumC5732z == EnumC5732z.AM) {
                if (i10 >= 12) {
                    i10 -= 12;
                }
            } else if (enumC5732z == EnumC5732z.PM && i10 < 12) {
                i10 += 12;
            }
            return G.D0(i10, g10.f57598b, g10.f57599c, g10.f57600d);
        }

        public /* synthetic */ g(a aVar) {
            this();
        }
    }

    public static class h implements oi.z {
        public h() {
        }

        @Override // oi.z
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public oi.p b(G g10) {
            return null;
        }

        @Override // oi.z
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public oi.p d(G g10) {
            return null;
        }

        @Override // oi.z
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public EnumC5714g e(G g10) {
            return EnumC5714g.f58148f;
        }

        @Override // oi.z
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public EnumC5714g i(G g10) {
            return EnumC5714g.f58143a;
        }

        @Override // oi.z
        public boolean isValid(G g10, EnumC5714g enumC5714g) {
            return enumC5714g != null;
        }

        @Override // oi.z
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public EnumC5714g p(G g10) {
            return g10.f57600d != 0 ? g10.f57600d % DurationKt.NANOS_IN_MILLIS == 0 ? EnumC5714g.f58146d : g10.f57600d % 1000 == 0 ? EnumC5714g.f58147e : EnumC5714g.f58148f : g10.f57599c != 0 ? EnumC5714g.f58145c : g10.f57598b != 0 ? EnumC5714g.f58144b : EnumC5714g.f58143a;
        }

        @Override // oi.z
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public G q(G g10, EnumC5714g enumC5714g, boolean z10) {
            if (enumC5714g == null) {
                throw new IllegalArgumentException("Missing precision value.");
            }
            if (enumC5714g.ordinal() < p(g10).ordinal()) {
                switch (a.$SwitchMap$net$time4j$ClockUnit[enumC5714g.ordinal()]) {
                    case 1:
                        return G.A0(g10.f57597a);
                    case 2:
                        return G.B0(g10.f57597a, g10.f57598b);
                    case 3:
                        return G.C0(g10.f57597a, g10.f57598b, g10.f57599c);
                    case 4:
                        return G.D0(g10.f57597a, g10.f57598b, g10.f57599c, (g10.f57600d / DurationKt.NANOS_IN_MILLIS) * DurationKt.NANOS_IN_MILLIS);
                    case 5:
                        return G.D0(g10.f57597a, g10.f57598b, g10.f57599c, (g10.f57600d / 1000) * 1000);
                    case 6:
                        break;
                    default:
                        throw new UnsupportedOperationException(enumC5714g.name());
                }
            }
            return g10;
        }

        public /* synthetic */ h(a aVar) {
            this();
        }
    }

    public static class i implements oi.z {
        public i() {
        }

        @Override // oi.z
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public oi.p b(G g10) {
            return null;
        }

        @Override // oi.z
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public oi.p d(G g10) {
            return null;
        }

        @Override // oi.z
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public G e(G g10) {
            return G.f57583m;
        }

        @Override // oi.z
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public G i(G g10) {
            return G.f57582l;
        }

        @Override // oi.z
        public boolean isValid(G g10, G g11) {
            return g11 != null;
        }

        @Override // oi.z
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public G p(G g10) {
            return g10;
        }

        @Override // oi.z
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public G q(G g10, G g11, boolean z10) {
            if (g11 != null) {
                return g11;
            }
            throw new IllegalArgumentException("Missing time value.");
        }

        public /* synthetic */ i(a aVar) {
            this();
        }
    }

    static {
        f57575e = Boolean.getBoolean("net.time4j.format.iso.decimal.dot") ? '.' : ',';
        f57576f = new BigDecimal(60);
        f57577g = new BigDecimal(3600);
        f57578h = new BigDecimal(1000000000);
        f57579i = new BigDecimal("24");
        f57580j = new BigDecimal("23.999999999999999");
        f57581k = new BigDecimal("59.999999999999999");
        HOURS = new G[25];
        for (int i10 = 0; i10 <= 24; i10++) {
            HOURS[i10] = new G(i10, 0, 0, 0, false);
        }
        G[] gArr = HOURS;
        G g10 = gArr[0];
        f57582l = g10;
        G g11 = gArr[24];
        f57583m = g11;
        Q q10 = Q.f57655a;
        f57584n = q10;
        f57585o = q10;
        EnumC5704d enumC5704d = EnumC5704d.AM_PM_OF_DAY;
        f57586p = enumC5704d;
        C5726t y10 = C5726t.y("CLOCK_HOUR_OF_AMPM", false);
        f57587q = y10;
        C5726t y11 = C5726t.y("CLOCK_HOUR_OF_DAY", true);
        f57588r = y11;
        C5726t z10 = C5726t.z("DIGITAL_HOUR_OF_AMPM", 3, 0, 11, 'K');
        f57589s = z10;
        C5726t z11 = C5726t.z("DIGITAL_HOUR_OF_DAY", 4, 0, 23, 'H');
        f57590t = z11;
        C5726t z12 = C5726t.z("HOUR_FROM_0_TO_24", 5, 0, 23, 'H');
        f57591u = z12;
        C5726t z13 = C5726t.z("MINUTE_OF_HOUR", 6, 0, 59, 'm');
        f57592v = z13;
        C5726t z14 = C5726t.z("MINUTE_OF_DAY", 7, 0, 1439, (char) 0);
        f57593w = z14;
        C5726t z15 = C5726t.z("SECOND_OF_MINUTE", 8, 0, 59, 's');
        f57594x = z15;
        C5726t z16 = C5726t.z("SECOND_OF_DAY", 9, 0, 86399, (char) 0);
        f57595y = z16;
        C5726t z17 = C5726t.z("MILLI_OF_SECOND", 10, 0, androidx.room.w.MAX_BIND_PARAMETER_CNT, (char) 0);
        f57596z = z17;
        C5726t z18 = C5726t.z("MICRO_OF_SECOND", 11, 0, 999999, (char) 0);
        f57561A = z18;
        C5726t z19 = C5726t.z("NANO_OF_SECOND", 12, 0, 999999999, 'S');
        f57562B = z19;
        C5726t z20 = C5726t.z("MILLI_OF_DAY", 13, 0, 86399999, 'A');
        f57563C = z20;
        C5730x y12 = C5730x.y("MICRO_OF_DAY", 0L, 86399999999L);
        f57564D = y12;
        C5730x y13 = C5730x.y("NANO_OF_DAY", 0L, 86399999999999L);
        f57565E = y13;
        C5719l c5719l = new C5719l("DECIMAL_HOUR", f57580j);
        f57566F = c5719l;
        BigDecimal bigDecimal = f57581k;
        C5719l c5719l2 = new C5719l("DECIMAL_MINUTE", bigDecimal);
        f57567G = c5719l2;
        C5719l c5719l3 = new C5719l("DECIMAL_SECOND", bigDecimal);
        f57568H = c5719l3;
        oi.p pVar = I.f57621d;
        f57569I = pVar;
        HashMap hashMap = new HashMap();
        l0(hashMap, q10);
        l0(hashMap, enumC5704d);
        l0(hashMap, y10);
        l0(hashMap, y11);
        l0(hashMap, z10);
        l0(hashMap, z11);
        l0(hashMap, z12);
        l0(hashMap, z13);
        l0(hashMap, z14);
        l0(hashMap, z15);
        l0(hashMap, z16);
        l0(hashMap, z17);
        l0(hashMap, z18);
        l0(hashMap, z19);
        l0(hashMap, z20);
        l0(hashMap, y12);
        l0(hashMap, y13);
        l0(hashMap, c5719l);
        l0(hashMap, c5719l2);
        l0(hashMap, c5719l3);
        f57570J = Collections.unmodifiableMap(hashMap);
        b bVar = new b(c5719l, f57579i);
        f57571K = bVar;
        b bVar2 = new b(c5719l2, bigDecimal);
        f57572L = bVar2;
        b bVar3 = new b(c5719l3, bigDecimal);
        f57573O = bVar3;
        H.b k10 = H.b.k(InterfaceC5728v.class, G.class, new f(null), g10, g11);
        a aVar = null;
        H.b d10 = k10.d(q10, new i(aVar)).d(enumC5704d, new g(aVar));
        d dVar = new d(y10, 1, 12);
        EnumC5714g enumC5714g = EnumC5714g.f58143a;
        H.b e10 = d10.e(y10, dVar, enumC5714g).e(y11, new d(y11, 1, 24), enumC5714g).e(z10, new d(z10, 0, 11), enumC5714g).e(z11, new d(z11, 0, 23), enumC5714g).e(z12, new d(z12, 0, 24), enumC5714g);
        d dVar2 = new d(z13, 0, 59);
        EnumC5714g enumC5714g2 = EnumC5714g.f58144b;
        H.b e11 = e10.e(z13, dVar2, enumC5714g2).e(z14, new d(z14, 0, 1440), enumC5714g2);
        d dVar3 = new d(z15, 0, 59);
        EnumC5714g enumC5714g3 = EnumC5714g.f58145c;
        H.b e12 = e11.e(z15, dVar3, enumC5714g3).e(z16, new d(z16, 0, 86400), enumC5714g3);
        d dVar4 = new d(z17, 0, androidx.room.w.MAX_BIND_PARAMETER_CNT);
        EnumC5714g enumC5714g4 = EnumC5714g.f58146d;
        H.b e13 = e12.e(z17, dVar4, enumC5714g4);
        d dVar5 = new d(z18, 0, 999999);
        EnumC5714g enumC5714g5 = EnumC5714g.f58147e;
        H.b e14 = e13.e(z18, dVar5, enumC5714g5);
        d dVar6 = new d(z19, 0, 999999999);
        EnumC5714g enumC5714g6 = EnumC5714g.f58148f;
        H.b d11 = e14.e(z19, dVar6, enumC5714g6).e(z20, new d(z20, 0, SessionData.EXPIRATION_TIME), enumC5714g4).e(y12, new e(y12, 0L, 86400000000L), enumC5714g5).e(y13, new e(y13, 0L, 86400000000000L), enumC5714g6).d(c5719l, bVar).d(c5719l2, bVar2).d(c5719l3, bVar3).d(pVar, new h(null));
        H0(d11);
        I0(d11);
        f57574P = d11.h();
    }

    public G(int i10, int i11, int i12, int i13, boolean z10) {
        if (z10) {
            d0(i10);
            e0(i11);
            g0(i12);
            f0(i13);
            if (i10 == 24 && (i11 | i12 | i13) != 0) {
                throw new IllegalArgumentException("T24:00:00 exceeded.");
            }
        }
        this.f57597a = (byte) i10;
        this.f57598b = (byte) i11;
        this.f57599c = (byte) i12;
        this.f57600d = i13;
    }

    public static G A0(int i10) {
        d0(i10);
        return HOURS[i10];
    }

    public static G B0(int i10, int i11) {
        return i11 == 0 ? A0(i10) : new G(i10, i11, 0, 0, true);
    }

    public static G C0(int i10, int i11, int i12) {
        return (i11 | i12) == 0 ? A0(i10) : new G(i10, i11, i12, 0, true);
    }

    public static G D0(int i10, int i11, int i12, int i13) {
        return E0(i10, i11, i12, i13, true);
    }

    public static G E0(int i10, int i11, int i12, int i13, boolean z10) {
        return ((i11 | i12) | i13) == 0 ? z10 ? A0(i10) : HOURS[i10] : new G(i10, i11, i12, i13, z10);
    }

    public static G F0(BigDecimal bigDecimal) {
        return (G) f57571K.q(null, bigDecimal, false);
    }

    public static void G0(StringBuilder sb2, int i10) {
        sb2.append(f57575e);
        String num = Integer.toString(i10);
        int i11 = i10 % DurationKt.NANOS_IN_MILLIS == 0 ? 3 : i10 % 1000 == 0 ? 6 : 9;
        for (int length = num.length(); length < 9; length++) {
            sb2.append('0');
        }
        int length2 = (i11 + num.length()) - 9;
        for (int i12 = 0; i12 < length2; i12++) {
            sb2.append(num.charAt(i12));
        }
    }

    private static void H0(H.b bVar) {
        for (oi.s sVar : AbstractC5470d.c().g(oi.s.class)) {
            if (sVar.b(G.class)) {
                bVar.f(sVar);
            }
        }
        bVar.f(new C5718k.c());
    }

    private static void I0(H.b bVar) {
        Set allOf = EnumSet.allOf(EnumC5714g.class);
        for (EnumC5714g enumC5714g : EnumC5714g.values()) {
            bVar.g(enumC5714g, new c(enumC5714g, null), enumC5714g.getLength(), allOf);
        }
    }

    public static void b0(int i10, StringBuilder sb2) {
        if (i10 < 10) {
            sb2.append('0');
        }
        sb2.append(i10);
    }

    public static oi.H c0() {
        return f57574P;
    }

    public static void d0(long j10) {
        if (j10 < 0 || j10 > 24) {
            throw new IllegalArgumentException("HOUR_OF_DAY out of range: " + j10);
        }
    }

    public static void e0(long j10) {
        if (j10 < 0 || j10 > 59) {
            throw new IllegalArgumentException("MINUTE_OF_HOUR out of range: " + j10);
        }
    }

    public static void f0(int i10) {
        if (i10 < 0 || i10 >= 1000000000) {
            throw new IllegalArgumentException("NANO_OF_SECOND out of range: " + i10);
        }
    }

    public static void g0(long j10) {
        if (j10 < 0 || j10 > 59) {
            throw new IllegalArgumentException("SECOND_OF_MINUTE out of range: " + j10);
        }
    }

    public static G i0(long j10, int i10) {
        int i11 = (((int) (j10 % 1000000)) * 1000) + i10;
        int i12 = (int) (j10 / 1000000);
        int i13 = i12 % 60;
        int i14 = i12 / 60;
        return D0(i14 / 60, i14 % 60, i13, i11);
    }

    public static G j0(int i10, int i11) {
        int i12 = ((i10 % 1000) * DurationKt.NANOS_IN_MILLIS) + i11;
        int i13 = i10 / 1000;
        int i14 = i13 % 60;
        int i15 = i13 / 60;
        return D0(i15 / 60, i15 % 60, i14, i12);
    }

    public static G k0(long j10) {
        int i10 = (int) (j10 % 1000000000);
        int i11 = (int) (j10 / 1000000000);
        int i12 = i11 % 60;
        int i13 = i11 / 60;
        return D0(i13 / 60, i13 % 60, i12, i10);
    }

    private static void l0(Map map, oi.p pVar) {
        map.put(pVar.name(), pVar);
    }

    public static long m0(long j10, long j11) {
        return j10 >= 0 ? j10 / j11 : ((j10 + 1) / j11) - 1;
    }

    public static long n0(long j10, long j11) {
        return j10 - (j11 * (j10 >= 0 ? j10 / j11 : ((j10 + 1) / j11) - 1));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 2);
    }

    public static Object x0(String str) {
        return f57570J.get(str);
    }

    public static G y0() {
        return f57583m;
    }

    public static G z0() {
        return f57582l;
    }

    @Override // oi.q
    /* renamed from: B */
    public oi.H s() {
        return f57574P;
    }

    public C5717j J0(long j10, EnumC5714g enumC5714g) {
        return c.e(this, j10, enumC5714g);
    }

    @Override // li.InterfaceC5473g
    public int a() {
        return this.f57600d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof G) {
            G g10 = (G) obj;
            if (this.f57597a == g10.f57597a && this.f57598b == g10.f57598b && this.f57599c == g10.f57599c && this.f57600d == g10.f57600d) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: h0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public int compareTo(G g10) {
        int i10 = this.f57597a - g10.f57597a;
        if (i10 == 0 && (i10 = this.f57598b - g10.f57598b) == 0 && (i10 = this.f57599c - g10.f57599c) == 0) {
            i10 = this.f57600d - g10.f57600d;
        }
        if (i10 < 0) {
            return -1;
        }
        return i10 == 0 ? 0 : 1;
    }

    public int hashCode() {
        return this.f57597a + (this.f57598b * 60) + (this.f57599c * Tnaf.POW_2_WIDTH) + (this.f57600d * 37);
    }

    @Override // li.InterfaceC5473g
    public int i() {
        return this.f57599c;
    }

    @Override // li.InterfaceC5473g
    public int l() {
        return this.f57598b;
    }

    @Override // oi.q
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public G t() {
        return this;
    }

    public final long p0() {
        return this.f57600d + (this.f57599c * 1000000000) + (this.f57598b * 60000000000L) + (this.f57597a * 3600000000000L);
    }

    @Override // li.InterfaceC5473g
    public int q() {
        return this.f57597a;
    }

    public boolean q0(oi.p pVar) {
        if (pVar == f57563C && this.f57600d % DurationKt.NANOS_IN_MILLIS != 0) {
            return true;
        }
        if (pVar == f57591u && !t0()) {
            return true;
        }
        if (pVar == f57593w && !u0()) {
            return true;
        }
        if (pVar != f57595y || this.f57600d == 0) {
            return pVar == f57564D && this.f57600d % 1000 != 0;
        }
        return true;
    }

    public boolean r0(G g10) {
        return A(g10) > 0;
    }

    public boolean s0(G g10) {
        return A(g10) < 0;
    }

    public final boolean t0() {
        return ((this.f57598b | this.f57599c) | this.f57600d) == 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(19);
        sb2.append('T');
        b0(this.f57597a, sb2);
        if ((this.f57598b | this.f57599c | this.f57600d) != 0) {
            sb2.append(':');
            b0(this.f57598b, sb2);
            if ((this.f57599c | this.f57600d) != 0) {
                sb2.append(':');
                b0(this.f57599c, sb2);
                int i10 = this.f57600d;
                if (i10 != 0) {
                    G0(sb2, i10);
                }
            }
        }
        return sb2.toString();
    }

    public final boolean u0() {
        return (this.f57599c | this.f57600d) == 0;
    }

    public boolean v0() {
        return t0() && this.f57597a % 24 == 0;
    }

    public boolean w0(G g10) {
        return A(g10) == 0;
    }
}
