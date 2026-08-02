package ig;

import Fm.C3051a;
import T7.E;
import com.google.protobuf.DescriptorProtos$Edition;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.util.concurrent.ConcurrentHashMap;
import mg.EnumC8145a;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes10.dex */
public final class q extends p implements mg.e, mg.f, Comparable<q> {

    /* renamed from: d, reason: collision with root package name */
    private static final ConcurrentHashMap f66453d = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: e, reason: collision with root package name */
    private static final ConcurrentHashMap f66454e = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: f, reason: collision with root package name */
    public static final q f66455f = u(0);

    /* renamed from: g, reason: collision with root package name */
    public static final q f66456g = u(-64800);

    /* renamed from: h, reason: collision with root package name */
    public static final q f66457h = u(64800);

    /* renamed from: b, reason: collision with root package name */
    private final int f66458b;

    /* renamed from: c, reason: collision with root package name */
    private final transient String f66459c;

    private q(int i11) {
        String sb2;
        this.f66458b = i11;
        if (i11 == 0) {
            sb2 = "Z";
        } else {
            int abs = Math.abs(i11);
            StringBuilder sb3 = new StringBuilder();
            int i12 = abs / 3600;
            int i13 = (abs / 60) % 60;
            sb3.append(i11 < 0 ? "-" : "+");
            sb3.append(i12 < 10 ? "0" : "");
            sb3.append(i12);
            String str = ProductContainerDTO.RATIO_DELIMITER;
            sb3.append(i13 < 10 ? ":0" : ProductContainerDTO.RATIO_DELIMITER);
            sb3.append(i13);
            int i14 = abs % 60;
            if (i14 != 0) {
                sb3.append(i14 < 10 ? ":0" : str);
                sb3.append(i14);
            }
            sb2 = sb3.toString();
        }
        this.f66459c = sb2;
    }

    static q A(ObjectInput objectInput) throws IOException {
        byte readByte = objectInput.readByte();
        return readByte == Byte.MAX_VALUE ? u(objectInput.readInt()) : u(readByte * 900);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static q l(String str) {
        int v11;
        int i11;
        int i12;
        char charAt;
        lg.c.e(str, "offsetId");
        q qVar = (q) f66454e.get(str);
        if (qVar != null) {
            return qVar;
        }
        int length = str.length();
        if (length == 2) {
            str = str.charAt(0) + "0" + str.charAt(1);
        } else if (length != 3) {
            if (length == 5) {
                v11 = v(1, str, false);
                i11 = v(3, str, false);
            } else {
                if (length != 6) {
                    if (length == 7) {
                        v11 = v(1, str, false);
                        i11 = v(3, str, false);
                        i12 = v(5, str, false);
                    } else {
                        if (length != 9) {
                            throw new C7073b("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                        }
                        v11 = v(1, str, false);
                        i11 = v(4, str, true);
                        i12 = v(7, str, true);
                    }
                    charAt = str.charAt(0);
                    if (charAt != '+' || charAt == '-') {
                        return charAt == '-' ? n(-v11, -i11, -i12) : n(v11, i11, i12);
                    }
                    throw new C7073b("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
                }
                v11 = v(1, str, false);
                i11 = v(4, str, true);
            }
            i12 = 0;
            charAt = str.charAt(0);
            if (charAt != '+') {
            }
            if (charAt == '-') {
            }
        }
        v11 = v(1, str, false);
        i11 = 0;
        i12 = 0;
        charAt = str.charAt(0);
        if (charAt != '+') {
        }
        if (charAt == '-') {
        }
    }

    public static q n(int i11, int i12, int i13) {
        if (i11 < -18 || i11 > 18) {
            throw new C7073b(E.a(i11, "Zone offset hours not in valid range: value ", " is not in the range -18 to 18"));
        }
        if (i11 > 0) {
            if (i12 < 0 || i13 < 0) {
                throw new C7073b("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i11 < 0) {
            if (i12 > 0 || i13 > 0) {
                throw new C7073b("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i12 > 0 && i13 < 0) || (i12 < 0 && i13 > 0)) {
            throw new C7073b("Zone offset minutes and seconds must have the same sign");
        }
        if (Math.abs(i12) > 59) {
            throw new C7073b("Zone offset minutes not in valid range: abs(value) " + Math.abs(i12) + " is not in the range 0 to 59");
        }
        if (Math.abs(i13) > 59) {
            throw new C7073b("Zone offset seconds not in valid range: abs(value) " + Math.abs(i13) + " is not in the range 0 to 59");
        }
        if (Math.abs(i11) == 18 && (Math.abs(i12) > 0 || Math.abs(i13) > 0)) {
            throw new C7073b("Zone offset not in valid range: -18:00 to +18:00");
        }
        return u((i12 * 60) + (i11 * 3600) + i13);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static q u(int i11) {
        if (Math.abs(i11) > 64800) {
            throw new C7073b("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i11 % DescriptorProtos$Edition.EDITION_LEGACY_VALUE != 0) {
            return new q(i11);
        }
        Integer valueOf = Integer.valueOf(i11);
        ConcurrentHashMap concurrentHashMap = f66453d;
        q qVar = (q) concurrentHashMap.get(valueOf);
        if (qVar != null) {
            return qVar;
        }
        concurrentHashMap.putIfAbsent(valueOf, new q(i11));
        q qVar2 = (q) concurrentHashMap.get(valueOf);
        f66454e.putIfAbsent(qVar2.f66459c, qVar2);
        return qVar2;
    }

    private static int v(int i11, String str, boolean z11) {
        if (z11 && str.charAt(i11 - 1) != ':') {
            throw new C7073b("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
        }
        char charAt = str.charAt(i11);
        char charAt2 = str.charAt(i11 + 1);
        if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
            return (charAt2 - '0') + ((charAt - '0') * 10);
        }
        throw new C7073b("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str));
    }

    private Object writeReplace() {
        return new m((byte) 8, this);
    }

    final void B(DataOutput dataOutput) throws IOException {
        int i11 = this.f66458b;
        int i12 = i11 % DescriptorProtos$Edition.EDITION_LEGACY_VALUE == 0 ? i11 / DescriptorProtos$Edition.EDITION_LEGACY_VALUE : 127;
        dataOutput.writeByte(i12);
        if (i12 == 127) {
            dataOutput.writeInt(i11);
        }
    }

    @Override // mg.e
    public final boolean L(mg.h hVar) {
        return hVar instanceof EnumC8145a ? hVar == EnumC8145a.OFFSET_SECONDS : hVar != null && hVar.a(this);
    }

    @Override // mg.e
    public final int Q(mg.h hVar) {
        if (hVar == EnumC8145a.OFFSET_SECONDS) {
            return this.f66458b;
        }
        if (hVar == null) {
            return p(hVar).a(m(hVar), hVar);
        }
        throw new mg.l(C3051a.c("Unsupported field: ", hVar));
    }

    @Override // mg.f
    public final mg.d R(mg.d dVar) {
        return dVar.j1(this.f66458b, EnumC8145a.OFFSET_SECONDS);
    }

    @Override // ig.p
    public final String a() {
        return this.f66459c;
    }

    @Override // ig.p
    public final ng.f b() {
        return ng.f.h(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mg.e
    public final <R> R d(mg.j<R> jVar) {
        if (jVar == mg.i.d() || jVar == mg.i.f()) {
            return this;
        }
        if (jVar == mg.i.b() || jVar == mg.i.c() || jVar == mg.i.e() || jVar == mg.i.a() || jVar == mg.i.g()) {
            return null;
        }
        return jVar.a(this);
    }

    @Override // ig.p
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            if (this.f66458b == ((q) obj).f66458b) {
                return true;
            }
        }
        return false;
    }

    @Override // ig.p
    final void g(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(8);
        B(objectOutput);
    }

    @Override // java.lang.Comparable
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final int compareTo(q qVar) {
        return qVar.f66458b - this.f66458b;
    }

    @Override // ig.p
    public final int hashCode() {
        return this.f66458b;
    }

    public final int i() {
        return this.f66458b;
    }

    @Override // mg.e
    public final long m(mg.h hVar) {
        if (hVar == EnumC8145a.OFFSET_SECONDS) {
            return this.f66458b;
        }
        if (hVar instanceof EnumC8145a) {
            throw new C7073b(C3051a.c("Unsupported field: ", hVar));
        }
        return hVar.f(this);
    }

    @Override // mg.e
    public final mg.m p(mg.h hVar) {
        if (hVar == EnumC8145a.OFFSET_SECONDS) {
            return hVar.d();
        }
        if (hVar instanceof EnumC8145a) {
            throw new mg.l(C3051a.c("Unsupported field: ", hVar));
        }
        return hVar.g(this);
    }

    @Override // ig.p
    public final String toString() {
        return this.f66459c;
    }
}
