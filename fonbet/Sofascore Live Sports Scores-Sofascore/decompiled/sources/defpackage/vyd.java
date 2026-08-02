package defpackage;

import com.blaze.blazesdk.analytics.enums.SeekDirection;
import com.blaze.blazesdk.analytics.enums.SeekType;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vyd {
    public final ku3 a;
    public final Function1 b;
    public long c;
    public long d;
    public Long e;
    public SeekType f;
    public SeekDirection g;
    public g9i h;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public final SeekType a;
        public final SeekDirection b;
        public final long c;
        public final long d;
        public final long e;

        public a(@NotNull SeekType seekType, @NotNull SeekDirection seekDirection, long j, long j2, long j3) {
            seekType.getClass();
            seekDirection.getClass();
            this.a = seekType;
            this.b = seekDirection;
            this.c = j;
            this.d = j2;
            this.e = j3;
        }

        public static a copy$default(a aVar, SeekType seekType, SeekDirection seekDirection, long j, long j2, long j3, int i, Object obj) {
            if ((i & 1) != 0) {
                seekType = aVar.a;
            }
            if ((i & 2) != 0) {
                seekDirection = aVar.b;
            }
            if ((i & 4) != 0) {
                j = aVar.c;
            }
            if ((i & 8) != 0) {
                j2 = aVar.d;
            }
            if ((i & 16) != 0) {
                j3 = aVar.e;
            }
            long j4 = j3;
            aVar.getClass();
            seekType.getClass();
            seekDirection.getClass();
            long j5 = j2;
            long j6 = j;
            return new a(seekType, seekDirection, j6, j5, j4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e;
        }

        public final int hashCode() {
            return Long.hashCode(this.e) + ljg.c(ljg.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SeekSessionResult(seekType=");
            sb.append(this.a);
            sb.append(", direction=");
            sb.append(this.b);
            sb.append(", startMs=");
            sb.append(this.c);
            sb.append(", endMs=");
            sb.append(this.d);
            sb.append(", totalSeekMs=");
            return fn0.n(sb, this.e, ')');
        }
    }

    public vyd(@NotNull ku3 ku3Var, @NotNull Function1<? super a, Unit> function1) {
        ku3Var.getClass();
        function1.getClass();
        this.a = ku3Var;
        this.b = function1;
    }

    public final void a() {
        Long l;
        long j;
        long j2;
        SeekDirection seekDirection = this.g;
        if (seekDirection == null || (l = this.e) == null) {
            return;
        }
        long longValue = l.longValue();
        SeekType seekType = this.f;
        if (seekType == null) {
            return;
        }
        int[] iArr = gif.a;
        int i = iArr[seekDirection.ordinal()];
        if (i == 1) {
            j = this.c;
        } else {
            if (i != 2) {
                zzl.b();
                return;
            }
            j = this.d;
        }
        if (j > 0) {
            int i2 = iArr[seekDirection.ordinal()];
            if (i2 == 1) {
                j2 = longValue + j;
            } else {
                if (i2 != 2) {
                    zzl.b();
                    return;
                }
                j2 = Math.max(longValue - j, 0L);
            }
            this.b.invoke(new a(seekType, seekDirection, longValue, j2, j));
        }
        g9i g9iVar = this.h;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        this.h = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.c = 0L;
        this.d = 0L;
    }

    public final void b(SeekType seekType, SeekDirection seekDirection, long j, long j2) {
        seekType.getClass();
        seekDirection.getClass();
        SeekDirection seekDirection2 = this.g;
        if (seekDirection2 != null && seekDirection2 != seekDirection) {
            a();
        }
        if (this.g != seekDirection) {
            this.e = Long.valueOf(j2);
            this.f = seekType;
            this.g = seekDirection;
        }
        int i = gif.a[seekDirection.ordinal()];
        if (i == 1) {
            this.c += j;
        } else {
            if (i != 2) {
                zzl.b();
                return;
            }
            this.d += j;
        }
        g9i g9iVar = this.h;
        if (g9iVar != null) {
            g9iVar.e(null);
        }
        this.h = xw3.L(this.a, null, null, new iag(this, null), 3);
    }
}
