package j$.time;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class ZoneOffset extends ZoneId implements TemporalAccessor, j$.time.temporal.m, Comparable<ZoneOffset>, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;

    /* renamed from: b, reason: collision with root package name */
    public final int f17297b;

    /* renamed from: c, reason: collision with root package name */
    public final transient String f17298c;

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f17293d = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f17294e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = X(0);

    /* renamed from: f, reason: collision with root package name */
    public static final ZoneOffset f17295f = X(-64800);

    /* renamed from: g, reason: collision with root package name */
    public static final ZoneOffset f17296g = X(64800);

    @Override // java.lang.Comparable
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.f17297b - this.f17297b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ZoneOffset V(String str) {
        int Y;
        int i5;
        int i10;
        char charAt;
        Objects.requireNonNull(str, "offsetId");
        ZoneOffset zoneOffset = (ZoneOffset) f17294e.get(str);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        int length = str.length();
        if (length == 2) {
            str = str.charAt(0) + CommonUrlParts.Values.FALSE_INTEGER + str.charAt(1);
        } else if (length != 3) {
            if (length == 5) {
                Y = Y(str, 1, false);
                i5 = Y(str, 3, false);
            } else if (length == 6) {
                Y = Y(str, 1, false);
                i5 = Y(str, 4, true);
            } else {
                if (length == 7) {
                    Y = Y(str, 1, false);
                    i5 = Y(str, 3, false);
                    i10 = Y(str, 5, false);
                } else if (length == 9) {
                    Y = Y(str, 1, false);
                    i5 = Y(str, 4, true);
                    i10 = Y(str, 7, true);
                } else {
                    throw new b("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                }
                charAt = str.charAt(0);
                if (charAt == '+' && charAt != '-') {
                    throw new b("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
                }
                if (charAt == '-') {
                    return W(-Y, -i5, -i10);
                }
                return W(Y, i5, i10);
            }
            i10 = 0;
            charAt = str.charAt(0);
            if (charAt == '+') {
            }
            if (charAt == '-') {
            }
        }
        Y = Y(str, 1, false);
        i5 = 0;
        i10 = 0;
        charAt = str.charAt(0);
        if (charAt == '+') {
        }
        if (charAt == '-') {
        }
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.f Q() {
        Objects.requireNonNull(this, "offset");
        return new j$.time.zone.f(this);
    }

    public static int Y(CharSequence charSequence, int i5, boolean z5) {
        if (z5) {
            String str = (String) charSequence;
            if (str.charAt(i5 - 1) != ':') {
                throw new b("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
            }
        }
        String str2 = (String) charSequence;
        char charAt = str2.charAt(i5);
        char charAt2 = str2.charAt(i5 + 1);
        if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
            return (charAt2 - '0') + ((charAt - '0') * 10);
        }
        throw new b("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str2));
    }

    public static ZoneOffset ofHours(int i5) {
        return W(i5, 0, 0);
    }

    public static ZoneOffset W(int i5, int i10, int i11) {
        if (i5 < -18 || i5 > 18) {
            throw new b("Zone offset hours not in valid range: value " + i5 + " is not in the range -18 to 18");
        }
        if (i5 > 0) {
            if (i10 < 0 || i11 < 0) {
                throw new b("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i5 < 0) {
            if (i10 > 0 || i11 > 0) {
                throw new b("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i10 > 0 && i11 < 0) || (i10 < 0 && i11 > 0)) {
            throw new b("Zone offset minutes and seconds must have the same sign");
        }
        if (i10 < -59 || i10 > 59) {
            throw new b("Zone offset minutes not in valid range: value " + i10 + " is not in the range -59 to 59");
        }
        if (i11 < -59 || i11 > 59) {
            throw new b("Zone offset seconds not in valid range: value " + i11 + " is not in the range -59 to 59");
        }
        if (Math.abs(i5) == 18 && (i10 | i11) != 0) {
            throw new b("Zone offset not in valid range: -18:00 to +18:00");
        }
        return X((i10 * 60) + (i5 * 3600) + i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ZoneOffset X(int i5) {
        if (i5 < -64800 || i5 > 64800) {
            throw new b("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i5 % 900 == 0) {
            Integer valueOf = Integer.valueOf(i5);
            ConcurrentHashMap concurrentHashMap = f17293d;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(valueOf);
            if (zoneOffset != null) {
                return zoneOffset;
            }
            concurrentHashMap.putIfAbsent(valueOf, new ZoneOffset(i5));
            ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(valueOf);
            f17294e.putIfAbsent(zoneOffset2.f17298c, zoneOffset2);
            return zoneOffset2;
        }
        return new ZoneOffset(i5);
    }

    public ZoneOffset(int i5) {
        String sb2;
        this.f17297b = i5;
        if (i5 == 0) {
            sb2 = "Z";
        } else {
            int abs = Math.abs(i5);
            StringBuilder sb3 = new StringBuilder();
            int i10 = abs / 3600;
            int i11 = (abs / 60) % 60;
            sb3.append(i5 < 0 ? "-" : "+");
            sb3.append(i10 < 10 ? CommonUrlParts.Values.FALSE_INTEGER : "");
            sb3.append(i10);
            String str = StringUtils.PROCESS_POSTFIX_DELIMITER;
            sb3.append(i11 < 10 ? ":0" : StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb3.append(i11);
            int i12 = abs % 60;
            if (i12 != 0) {
                sb3.append(i12 < 10 ? ":0" : str);
                sb3.append(i12);
            }
            sb2 = sb3.toString();
        }
        this.f17298c = sb2;
    }

    @Override // j$.time.ZoneId
    public final String getId() {
        return this.f17298c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(j$.time.temporal.p pVar) {
        return pVar instanceof j$.time.temporal.a ? pVar == j$.time.temporal.a.OFFSET_SECONDS : pVar != null && pVar.i(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(j$.time.temporal.p pVar) {
        return j$.time.temporal.q.d(this, pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f17297b;
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.r(c.a("Unsupported field: ", pVar));
        }
        return j$.time.temporal.q.d(this, pVar).a(C(pVar), pVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long C(j$.time.temporal.p pVar) {
        if (pVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f17297b;
        }
        if (pVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.r(c.a("Unsupported field: ", pVar));
        }
        return pVar.x(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object z(x xVar) {
        return (xVar == j$.time.temporal.q.f17533d || xVar == j$.time.temporal.q.f17534e) ? this : j$.time.temporal.q.c(this, xVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l n(j$.time.temporal.l lVar) {
        return lVar.c(this.f17297b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // j$.time.ZoneId
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZoneOffset) && this.f17297b == ((ZoneOffset) obj).f17297b;
    }

    @Override // j$.time.ZoneId
    public final int hashCode() {
        return this.f17297b;
    }

    @Override // j$.time.ZoneId
    public final String toString() {
        return this.f17298c;
    }

    private Object writeReplace() {
        return new r((byte) 8, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.ZoneId
    public final void U(DataOutput dataOutput) {
        dataOutput.writeByte(8);
        a0(dataOutput);
    }

    public final void a0(DataOutput dataOutput) {
        int i5 = this.f17297b;
        int i10 = i5 % 900 == 0 ? i5 / 900 : 127;
        dataOutput.writeByte(i10);
        if (i10 == 127) {
            dataOutput.writeInt(i5);
        }
    }

    public static ZoneOffset Z(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? X(dataInput.readInt()) : X(readByte * 900);
    }
}
