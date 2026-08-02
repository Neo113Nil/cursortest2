package j$.time.zone;

import j$.time.ZoneOffset;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.TimeZone;
import kotlin.KotlinVersion;

/* loaded from: classes2.dex */
public final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* renamed from: a, reason: collision with root package name */
    public byte f17568a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17569b;

    public a() {
    }

    public a(byte b10, Object obj) {
        this.f17568a = b10;
        this.f17569b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b10 = this.f17568a;
        Object obj = this.f17569b;
        objectOutput.writeByte(b10);
        if (b10 != 1) {
            if (b10 == 2) {
                b bVar = (b) obj;
                c(bVar.f17571a, objectOutput);
                d(bVar.f17573c, objectOutput);
                d(bVar.f17574d, objectOutput);
                return;
            }
            if (b10 == 3) {
                ((e) obj).b(objectOutput);
                return;
            } else {
                if (b10 != 100) {
                    throw new InvalidClassException("Unknown serialized type");
                }
                objectOutput.writeUTF(((f) obj).f17595g.getID());
                return;
            }
        }
        f fVar = (f) obj;
        objectOutput.writeInt(fVar.f17589a.length);
        for (long j : fVar.f17589a) {
            c(j, objectOutput);
        }
        for (ZoneOffset zoneOffset : fVar.f17590b) {
            d(zoneOffset, objectOutput);
        }
        objectOutput.writeInt(fVar.f17591c.length);
        for (long j6 : fVar.f17591c) {
            c(j6, objectOutput);
        }
        for (ZoneOffset zoneOffset2 : fVar.f17593e) {
            d(zoneOffset2, objectOutput);
        }
        objectOutput.writeByte(fVar.f17594f.length);
        for (e eVar : fVar.f17594f) {
            eVar.b(objectOutput);
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Object fVar;
        byte readByte = objectInput.readByte();
        this.f17568a = readByte;
        if (readByte == 1) {
            long[] jArr = f.f17586i;
            int readInt = objectInput.readInt();
            long[] jArr2 = readInt == 0 ? jArr : new long[readInt];
            for (int i5 = 0; i5 < readInt; i5++) {
                jArr2[i5] = a(objectInput);
            }
            int i10 = readInt + 1;
            ZoneOffset[] zoneOffsetArr = new ZoneOffset[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                zoneOffsetArr[i11] = b(objectInput);
            }
            int readInt2 = objectInput.readInt();
            if (readInt2 != 0) {
                jArr = new long[readInt2];
            }
            long[] jArr3 = jArr;
            for (int i12 = 0; i12 < readInt2; i12++) {
                jArr3[i12] = a(objectInput);
            }
            int i13 = readInt2 + 1;
            ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i13];
            for (int i14 = 0; i14 < i13; i14++) {
                zoneOffsetArr2[i14] = b(objectInput);
            }
            int readByte2 = objectInput.readByte();
            e[] eVarArr = readByte2 == 0 ? f.j : new e[readByte2];
            for (int i15 = 0; i15 < readByte2; i15++) {
                eVarArr[i15] = e.a(objectInput);
            }
            fVar = new f(jArr2, zoneOffsetArr, jArr3, zoneOffsetArr2, eVarArr);
        } else if (readByte == 2) {
            int i16 = b.f17570e;
            long a7 = a(objectInput);
            ZoneOffset b10 = b(objectInput);
            ZoneOffset b11 = b(objectInput);
            if (b10.equals(b11)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            fVar = new b(a7, b10, b11);
        } else if (readByte == 3) {
            fVar = e.a(objectInput);
        } else {
            if (readByte != 100) {
                throw new StreamCorruptedException("Unknown serialized type");
            }
            fVar = new f(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.f17569b = fVar;
    }

    private Object readResolve() {
        return this.f17569b;
    }

    public static ZoneOffset b(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? ZoneOffset.X(dataInput.readInt()) : ZoneOffset.X(readByte * 900);
    }

    public static void c(long j, DataOutput dataOutput) {
        if (j >= -4575744000L && j < 10413792000L && j % 900 == 0) {
            int i5 = (int) ((j + 4575744000L) / 900);
            dataOutput.writeByte((i5 >>> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            dataOutput.writeByte((i5 >>> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            dataOutput.writeByte(i5 & KotlinVersion.MAX_COMPONENT_VALUE);
            return;
        }
        dataOutput.writeByte(KotlinVersion.MAX_COMPONENT_VALUE);
        dataOutput.writeLong(j);
    }

    public static long a(DataInput dataInput) {
        if ((dataInput.readByte() & 255) == 255) {
            return dataInput.readLong();
        }
        return ((((r0 << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255)) * 900) - 4575744000L;
    }

    public static void d(ZoneOffset zoneOffset, DataOutput dataOutput) {
        int i5 = zoneOffset.f17297b;
        int i10 = i5 % 900 == 0 ? i5 / 900 : 127;
        dataOutput.writeByte(i10);
        if (i10 == 127) {
            dataOutput.writeInt(i5);
        }
    }
}
