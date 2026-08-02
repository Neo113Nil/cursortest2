package ng;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.DescriptorProtos$Edition;
import ig.EnumC7074c;
import ig.q;
import java.io.DataInput;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.Serializable;
import jg.l;

/* loaded from: classes10.dex */
public final class e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final ig.i f77124a;

    /* renamed from: b, reason: collision with root package name */
    private final byte f77125b;

    /* renamed from: c, reason: collision with root package name */
    private final EnumC7074c f77126c;

    /* renamed from: d, reason: collision with root package name */
    private final ig.h f77127d;

    /* renamed from: e, reason: collision with root package name */
    private final int f77128e;

    /* renamed from: f, reason: collision with root package name */
    private final b f77129f;

    /* renamed from: g, reason: collision with root package name */
    private final q f77130g;

    /* renamed from: h, reason: collision with root package name */
    private final q f77131h;

    /* renamed from: i, reason: collision with root package name */
    private final q f77132i;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f77133a;

        static {
            int[] iArr = new int[b.values().length];
            f77133a = iArr;
            try {
                iArr[b.UTC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f77133a[b.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b STANDARD;
        public static final b UTC;
        public static final b WALL;

        static {
            b bVar = new b("UTC", 0);
            UTC = bVar;
            b bVar2 = new b("WALL", 1);
            WALL = bVar2;
            b bVar3 = new b("STANDARD", 2);
            STANDARD = bVar3;
            $VALUES = new b[]{bVar, bVar2, bVar3};
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    e(ig.i iVar, int i11, EnumC7074c enumC7074c, ig.h hVar, int i12, b bVar, q qVar, q qVar2, q qVar3) {
        this.f77124a = iVar;
        this.f77125b = (byte) i11;
        this.f77126c = enumC7074c;
        this.f77127d = hVar;
        this.f77128e = i12;
        this.f77129f = bVar;
        this.f77130g = qVar;
        this.f77131h = qVar2;
        this.f77132i = qVar3;
    }

    static e b(DataInput dataInput) throws IOException {
        int readInt = dataInput.readInt();
        ig.i g10 = ig.i.g(readInt >>> 28);
        int i11 = ((264241152 & readInt) >>> 22) - 32;
        int i12 = (3670016 & readInt) >>> 19;
        EnumC7074c b11 = i12 == 0 ? null : EnumC7074c.b(i12);
        int i13 = (507904 & readInt) >>> 14;
        b bVar = b.values()[(readInt & 12288) >>> 12];
        int i14 = (readInt & 4080) >>> 4;
        int i15 = (readInt & 12) >>> 2;
        int i16 = readInt & 3;
        int readInt2 = i13 == 31 ? dataInput.readInt() : i13 * 3600;
        q u11 = q.u(i14 == 255 ? dataInput.readInt() : (i14 - 128) * DescriptorProtos$Edition.EDITION_LEGACY_VALUE);
        q u12 = q.u(i15 == 3 ? dataInput.readInt() : (i15 * 1800) + u11.i());
        q u13 = i16 == 3 ? q.u(dataInput.readInt()) : q.u((i16 * 1800) + u11.i());
        if (i11 < -28 || i11 > 31 || i11 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        return new e(g10, i11, b11, ig.h.j1(lg.c.c(readInt2, 86400)), readInt2 >= 0 ? readInt2 / 86400 : ((readInt2 + 1) / 86400) - 1, bVar, u11, u12, u13);
    }

    private Object writeReplace() {
        return new C8592a((byte) 3, this);
    }

    public final d a(int i11) {
        ig.f F12;
        EnumC7074c enumC7074c = this.f77126c;
        ig.i iVar = this.f77124a;
        byte b11 = this.f77125b;
        if (b11 < 0) {
            l.f70047c.getClass();
            F12 = ig.f.F1(i11, iVar, iVar.e(l.n(i11)) + 1 + b11);
            if (enumC7074c != null) {
                F12 = F12.d1(mg.g.b(enumC7074c));
            }
        } else {
            F12 = ig.f.F1(i11, iVar, b11);
            if (enumC7074c != null) {
                F12 = F12.d1(mg.g.a(enumC7074c));
            }
        }
        ig.g v12 = ig.g.v1(F12.M1(this.f77128e), this.f77127d);
        b bVar = this.f77129f;
        bVar.getClass();
        int i12 = a.f77133a[bVar.ordinal()];
        q qVar = this.f77131h;
        if (i12 == 1) {
            v12 = v12.B1(qVar.i() - q.f66455f.i());
        } else if (i12 == 2) {
            v12 = v12.B1(qVar.i() - this.f77130g.i());
        }
        return new d(v12, qVar, this.f77132i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f77124a == eVar.f77124a && this.f77125b == eVar.f77125b && this.f77126c == eVar.f77126c && this.f77129f == eVar.f77129f && this.f77128e == eVar.f77128e && this.f77127d.equals(eVar.f77127d) && this.f77130g.equals(eVar.f77130g) && this.f77131h.equals(eVar.f77131h) && this.f77132i.equals(eVar.f77132i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int v12 = ((this.f77127d.v1() + this.f77128e) << 15) + (this.f77124a.ordinal() << 11) + ((this.f77125b + 32) << 5);
        EnumC7074c enumC7074c = this.f77126c;
        return ((this.f77130g.hashCode() ^ (this.f77129f.ordinal() + (v12 + ((enumC7074c == null ? 7 : enumC7074c.ordinal()) << 2)))) ^ this.f77131h.hashCode()) ^ this.f77132i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransitionRule[");
        q qVar = this.f77131h;
        q qVar2 = this.f77132i;
        sb2.append(qVar.compareTo(qVar2) > 0 ? "Gap " : "Overlap ");
        sb2.append(qVar);
        sb2.append(" to ");
        sb2.append(qVar2);
        sb2.append(", ");
        ig.i iVar = this.f77124a;
        byte b11 = this.f77125b;
        EnumC7074c enumC7074c = this.f77126c;
        if (enumC7074c == null) {
            sb2.append(iVar.name());
            sb2.append(' ');
            sb2.append((int) b11);
        } else if (b11 == -1) {
            sb2.append(enumC7074c.name());
            sb2.append(" on or before last day of ");
            sb2.append(iVar.name());
        } else if (b11 < 0) {
            sb2.append(enumC7074c.name());
            sb2.append(" on or before last day minus ");
            sb2.append((-b11) - 1);
            sb2.append(" of ");
            sb2.append(iVar.name());
        } else {
            sb2.append(enumC7074c.name());
            sb2.append(" on or after ");
            sb2.append(iVar.name());
            sb2.append(' ');
            sb2.append((int) b11);
        }
        sb2.append(" at ");
        ig.h hVar = this.f77127d;
        int i11 = this.f77128e;
        if (i11 == 0) {
            sb2.append(hVar);
        } else {
            long v12 = (i11 * 1440) + (hVar.v1() / 60);
            long b12 = lg.c.b(v12, 60L);
            if (b12 < 10) {
                sb2.append(0);
            }
            sb2.append(b12);
            sb2.append(':');
            long d11 = lg.c.d(60, v12);
            if (d11 < 10) {
                sb2.append(0);
            }
            sb2.append(d11);
        }
        sb2.append(" ");
        sb2.append(this.f77129f);
        sb2.append(", standard offset ");
        sb2.append(this.f77130g);
        sb2.append(']');
        return sb2.toString();
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        ig.h hVar = this.f77127d;
        int v12 = (this.f77128e * 86400) + hVar.v1();
        int i11 = this.f77130g.i();
        q qVar = this.f77131h;
        int i12 = qVar.i() - i11;
        q qVar2 = this.f77132i;
        int i13 = qVar2.i() - i11;
        int T02 = (v12 % 3600 != 0 || v12 > 86400) ? 31 : v12 == 86400 ? 24 : hVar.T0();
        int i14 = i11 % DescriptorProtos$Edition.EDITION_LEGACY_VALUE == 0 ? (i11 / DescriptorProtos$Edition.EDITION_LEGACY_VALUE) + UserVerificationMethods.USER_VERIFY_PATTERN : 255;
        int i15 = (i12 == 0 || i12 == 1800 || i12 == 3600) ? i12 / 1800 : 3;
        int i16 = (i13 == 0 || i13 == 1800 || i13 == 3600) ? i13 / 1800 : 3;
        EnumC7074c enumC7074c = this.f77126c;
        objectOutput.writeInt((this.f77124a.b() << 28) + ((this.f77125b + 32) << 22) + ((enumC7074c == null ? 0 : enumC7074c.a()) << 19) + (T02 << 14) + (this.f77129f.ordinal() << 12) + (i14 << 4) + (i15 << 2) + i16);
        if (T02 == 31) {
            objectOutput.writeInt(v12);
        }
        if (i14 == 255) {
            objectOutput.writeInt(i11);
        }
        if (i15 == 3) {
            objectOutput.writeInt(qVar.i());
        }
        if (i16 == 3) {
            objectOutput.writeInt(qVar2.i());
        }
    }
}
