package net.time4j;

import com.plaid.internal.EnumC3631g;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import li.AbstractC5469c;
import qi.EnumC6185f;

/* renamed from: net.time4j.y, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5731y implements oi.L, Comparable, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final C5731y f58418d;

    /* renamed from: e, reason: collision with root package name */
    public static final C5731y f58419e;

    /* renamed from: f, reason: collision with root package name */
    public static final oi.J f58420f;

    /* renamed from: g, reason: collision with root package name */
    public static final oi.J f58421g;
    private static final long serialVersionUID = -4150291820807606229L;

    /* renamed from: a, reason: collision with root package name */
    public final transient long f58422a;

    /* renamed from: b, reason: collision with root package name */
    public final transient int f58423b;

    /* renamed from: c, reason: collision with root package name */
    public final transient EnumC6185f f58424c;

    /* renamed from: net.time4j.y$a */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$java$util$concurrent$TimeUnit;
        static final /* synthetic */ int[] $SwitchMap$net$time4j$SI;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            $SwitchMap$java$util$concurrent$TimeUnit = iArr;
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.MINUTES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$util$concurrent$TimeUnit[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[N.values().length];
            $SwitchMap$net$time4j$SI = iArr2;
            try {
                iArr2[N.SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$net$time4j$SI[N.NANOSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: net.time4j.y$b */
    public static class b implements oi.J {

        /* renamed from: a, reason: collision with root package name */
        public final EnumC6185f f58425a;

        public /* synthetic */ b(EnumC6185f enumC6185f, a aVar) {
            this(enumC6185f);
        }

        public b(EnumC6185f enumC6185f) {
            this.f58425a = enumC6185f;
        }
    }

    static {
        EnumC6185f enumC6185f = EnumC6185f.POSIX;
        f58418d = new C5731y(0L, 0, enumC6185f);
        EnumC6185f enumC6185f2 = EnumC6185f.UTC;
        f58419e = new C5731y(0L, 0, enumC6185f2);
        a aVar = null;
        f58420f = new b(enumC6185f, aVar);
        f58421g = new b(enumC6185f2, aVar);
    }

    public C5731y(long j10, int i10, EnumC6185f enumC6185f) {
        while (i10 < 0) {
            i10 += 1000000000;
            j10 = AbstractC5469c.m(j10, 1L);
        }
        while (i10 >= 1000000000) {
            i10 -= 1000000000;
            j10 = AbstractC5469c.f(j10, 1L);
        }
        if (j10 < 0 && i10 > 0) {
            j10++;
            i10 -= 1000000000;
        }
        this.f58422a = j10;
        this.f58423b = i10;
        this.f58424c = enumC6185f;
    }

    public static C5731y h(long j10, int i10) {
        return (j10 == 0 && i10 == 0) ? f58418d : new C5731y(j10, i10, EnumC6185f.POSIX);
    }

    public static C5731y i(long j10, int i10) {
        return (j10 == 0 && i10 == 0) ? f58419e : new C5731y(j10, i10, EnumC6185f.UTC);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Serialization proxy required.");
    }

    private Object writeReplace() {
        return new SPX(this, 5);
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(C5731y c5731y) {
        if (this.f58424c != c5731y.f58424c) {
            throw new ClassCastException("Different time scales.");
        }
        long j10 = this.f58422a;
        long j11 = c5731y.f58422a;
        if (j10 < j11) {
            return -1;
        }
        if (j10 > j11) {
            return 1;
        }
        return this.f58423b - c5731y.f58423b;
    }

    public final void c(StringBuilder sb2) {
        if (g()) {
            sb2.append('-');
            sb2.append(Math.abs(this.f58422a));
        } else {
            sb2.append(this.f58422a);
        }
        if (this.f58423b != 0) {
            sb2.append('.');
            String valueOf = String.valueOf(Math.abs(this.f58423b));
            for (int length = 9 - valueOf.length(); length > 0; length--) {
                sb2.append('0');
            }
            sb2.append(valueOf);
        }
    }

    public int d() {
        int i10 = this.f58423b;
        return i10 < 0 ? i10 + 1000000000 : i10;
    }

    public EnumC6185f e() {
        return this.f58424c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5731y) {
            C5731y c5731y = (C5731y) obj;
            if (this.f58422a == c5731y.f58422a && this.f58423b == c5731y.f58423b && this.f58424c == c5731y.f58424c) {
                return true;
            }
        }
        return false;
    }

    public long f() {
        long j10 = this.f58422a;
        return this.f58423b < 0 ? j10 - 1 : j10;
    }

    public boolean g() {
        return this.f58422a < 0 || this.f58423b < 0;
    }

    public int hashCode() {
        long j10 = this.f58422a;
        return ((((EnumC3631g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE + ((int) (j10 ^ (j10 >>> 32)))) * 23) + this.f58423b) * 23) + this.f58424c.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        c(sb2);
        sb2.append("s [");
        sb2.append(this.f58424c.name());
        sb2.append(']');
        return sb2.toString();
    }
}
