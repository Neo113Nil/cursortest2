package ng;

import com.google.protobuf.DescriptorProtos$Edition;
import ig.q;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/* renamed from: ng.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C8592a implements Externalizable {

    /* renamed from: a, reason: collision with root package name */
    private byte f77106a;

    /* renamed from: b, reason: collision with root package name */
    private Serializable f77107b;

    public C8592a() {
    }

    static Serializable a(DataInputStream dataInputStream) throws IOException, ClassNotFoundException {
        return d(dataInputStream.readByte(), dataInputStream);
    }

    static long b(DataInput dataInput) throws IOException {
        if ((dataInput.readByte() & 255) == 255) {
            return dataInput.readLong();
        }
        return ((((r0 << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255)) * 900) - 4575744000L;
    }

    private static Serializable d(byte b11, DataInput dataInput) throws IOException, ClassNotFoundException {
        if (b11 == 1) {
            return b.l(dataInput);
        }
        if (b11 != 2) {
            if (b11 == 3) {
                return e.b(dataInput);
            }
            throw new StreamCorruptedException("Unknown serialized type");
        }
        long b12 = b(dataInput);
        q e11 = e(dataInput);
        q e12 = e(dataInput);
        if (e11.equals(e12)) {
            throw new IllegalArgumentException("Offsets must not be equal");
        }
        return new d(b12, e11, e12);
    }

    static q e(DataInput dataInput) throws IOException {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? q.u(dataInput.readInt()) : q.u(readByte * 900);
    }

    static void f(long j11, ObjectOutput objectOutput) throws IOException {
        if (j11 < -4575744000L || j11 >= 10413792000L || j11 % 900 != 0) {
            objectOutput.writeByte(255);
            objectOutput.writeLong(j11);
        } else {
            int i11 = (int) ((j11 + 4575744000L) / 900);
            objectOutput.writeByte((i11 >>> 16) & 255);
            objectOutput.writeByte((i11 >>> 8) & 255);
            objectOutput.writeByte(i11 & 255);
        }
    }

    static void g(q qVar, ObjectOutput objectOutput) throws IOException {
        int i11 = qVar.i();
        int i12 = i11 % DescriptorProtos$Edition.EDITION_LEGACY_VALUE == 0 ? i11 / DescriptorProtos$Edition.EDITION_LEGACY_VALUE : 127;
        objectOutput.writeByte(i12);
        if (i12 == 127) {
            objectOutput.writeInt(i11);
        }
    }

    private Object readResolve() {
        return this.f77107b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        byte readByte = objectInput.readByte();
        this.f77106a = readByte;
        this.f77107b = d(readByte, objectInput);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b11 = this.f77106a;
        Serializable serializable = this.f77107b;
        objectOutput.writeByte(b11);
        if (b11 == 1) {
            ((b) serializable).writeExternal(objectOutput);
        } else if (b11 == 2) {
            ((d) serializable).writeExternal(objectOutput);
        } else {
            if (b11 != 3) {
                throw new InvalidClassException("Unknown serialized type");
            }
            ((e) serializable).writeExternal(objectOutput);
        }
    }

    C8592a(byte b11, Serializable serializable) {
        this.f77106a = b11;
        this.f77107b = serializable;
    }
}
