package j$.time;

import j$.util.Objects;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* loaded from: classes2.dex */
public final class r implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* renamed from: a, reason: collision with root package name */
    public byte f17501a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17502b;

    public r() {
    }

    public r(byte b10, Object obj) {
        this.f17501a = b10;
        this.f17502b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b10 = this.f17501a;
        Object obj = this.f17502b;
        objectOutput.writeByte(b10);
        switch (b10) {
            case 1:
                Duration duration = (Duration) obj;
                objectOutput.writeLong(duration.f17280a);
                objectOutput.writeInt(duration.f17281b);
                return;
            case 2:
                Instant instant = (Instant) obj;
                objectOutput.writeLong(instant.f17283a);
                objectOutput.writeInt(instant.f17284b);
                return;
            case 3:
                g gVar = (g) obj;
                objectOutput.writeInt(gVar.f17472a);
                objectOutput.writeByte(gVar.f17473b);
                objectOutput.writeByte(gVar.f17474c);
                return;
            case 4:
                ((j) obj).f0(objectOutput);
                return;
            case 5:
                LocalDateTime localDateTime = (LocalDateTime) obj;
                g gVar2 = localDateTime.f17287a;
                objectOutput.writeInt(gVar2.f17472a);
                objectOutput.writeByte(gVar2.f17473b);
                objectOutput.writeByte(gVar2.f17474c);
                localDateTime.f17288b.f0(objectOutput);
                return;
            case 6:
                ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
                LocalDateTime localDateTime2 = zonedDateTime.f17299a;
                g gVar3 = localDateTime2.f17287a;
                objectOutput.writeInt(gVar3.f17472a);
                objectOutput.writeByte(gVar3.f17473b);
                objectOutput.writeByte(gVar3.f17474c);
                localDateTime2.f17288b.f0(objectOutput);
                zonedDateTime.f17300b.a0(objectOutput);
                zonedDateTime.f17301c.U(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((w) obj).f17564b);
                return;
            case 8:
                ((ZoneOffset) obj).a0(objectOutput);
                return;
            case 9:
                p pVar = (p) obj;
                pVar.f17495a.f0(objectOutput);
                pVar.f17496b.a0(objectOutput);
                return;
            case 10:
                OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
                LocalDateTime localDateTime3 = offsetDateTime.f17290a;
                g gVar4 = localDateTime3.f17287a;
                objectOutput.writeInt(gVar4.f17472a);
                objectOutput.writeByte(gVar4.f17473b);
                objectOutput.writeByte(gVar4.f17474c);
                localDateTime3.f17288b.f0(objectOutput);
                offsetDateTime.f17291b.a0(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((t) obj).f17506a);
                return;
            case 12:
                v vVar = (v) obj;
                objectOutput.writeInt(vVar.f17561a);
                objectOutput.writeByte(vVar.f17562b);
                return;
            case 13:
                n nVar = (n) obj;
                objectOutput.writeByte(nVar.f17491a);
                objectOutput.writeByte(nVar.f17492b);
                return;
            case 14:
                q qVar = (q) obj;
                objectOutput.writeInt(qVar.f17498a);
                objectOutput.writeInt(qVar.f17499b);
                objectOutput.writeInt(qVar.f17500c);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.f17501a = readByte;
        this.f17502b = a(readByte, objectInput);
    }

    public static Object a(byte b10, ObjectInput objectInput) {
        switch (b10) {
            case 1:
                Duration duration = Duration.f17279c;
                long readLong = objectInput.readLong();
                long readInt = objectInput.readInt();
                return Duration.j(j$.com.android.tools.r8.a.N(readLong, j$.com.android.tools.r8.a.S(readInt, 1000000000L)), (int) j$.com.android.tools.r8.a.R(readInt, 1000000000L));
            case 2:
                Instant instant = Instant.f17282c;
                return Instant.R(objectInput.readLong(), objectInput.readInt());
            case 3:
                g gVar = g.f17470d;
                return g.Z(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return j.a0(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.f17285c;
                g gVar2 = g.f17470d;
                return LocalDateTime.S(g.Z(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j.a0(objectInput));
            case 6:
                LocalDateTime localDateTime2 = LocalDateTime.f17285c;
                g gVar3 = g.f17470d;
                LocalDateTime S = LocalDateTime.S(g.Z(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j.a0(objectInput));
                ZoneOffset Z = ZoneOffset.Z(objectInput);
                ZoneId zoneId = (ZoneId) a(objectInput.readByte(), objectInput);
                Objects.requireNonNull(S, "localDateTime");
                Objects.requireNonNull(Z, "offset");
                Objects.requireNonNull(zoneId, "zone");
                if (!(zoneId instanceof ZoneOffset) || Z.equals(zoneId)) {
                    return new ZonedDateTime(S, zoneId, Z);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                int i5 = w.f17563d;
                return ZoneId.R(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.Z(objectInput);
            case 9:
                int i10 = p.f17494c;
                return new p(j.a0(objectInput), ZoneOffset.Z(objectInput));
            case 10:
                int i11 = OffsetDateTime.f17289c;
                g gVar4 = g.f17470d;
                return new OffsetDateTime(LocalDateTime.S(g.Z(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j.a0(objectInput)), ZoneOffset.Z(objectInput));
            case 11:
                int i12 = t.f17505b;
                return t.P(objectInput.readInt());
            case 12:
                int i13 = v.f17560c;
                int readInt2 = objectInput.readInt();
                byte readByte = objectInput.readByte();
                j$.time.temporal.a.YEAR.C(readInt2);
                j$.time.temporal.a.MONTH_OF_YEAR.C(readByte);
                return new v(readInt2, readByte);
            case 13:
                int i14 = n.f17490c;
                byte readByte2 = objectInput.readByte();
                byte readByte3 = objectInput.readByte();
                l S2 = l.S(readByte2);
                Objects.requireNonNull(S2, "month");
                j$.time.temporal.a.DAY_OF_MONTH.C(readByte3);
                if (readByte3 <= S2.R()) {
                    return new n(S2.getValue(), readByte3);
                }
                throw new b("Illegal value for DayOfMonth field, value " + ((int) readByte3) + " is not valid for month " + S2.name());
            case 14:
                q qVar = q.f17497d;
                return q.a(objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f17502b;
    }
}
