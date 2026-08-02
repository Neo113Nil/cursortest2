package jg;

import ig.C7073b;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import mg.EnumC8145a;

/* loaded from: classes10.dex */
final class t implements Externalizable {

    /* renamed from: a, reason: collision with root package name */
    private byte f70066a;

    /* renamed from: b, reason: collision with root package name */
    private Object f70067b;

    public t() {
    }

    private Object readResolve() {
        return this.f70067b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        Object oVar;
        Object M02;
        byte readByte = objectInput.readByte();
        this.f70066a = readByte;
        switch (readByte) {
            case 1:
                ig.f fVar = o.f70052e;
                int readInt = objectInput.readInt();
                byte readByte2 = objectInput.readByte();
                byte readByte3 = objectInput.readByte();
                n.f70050d.getClass();
                oVar = new o(ig.f.E1(readInt, readByte2, readByte3));
                M02 = oVar;
                this.f70067b = M02;
                return;
            case 2:
                p pVar = p.f70057e;
                M02 = p.M0(objectInput.readByte());
                this.f70067b = M02;
                return;
            case 3:
                int i11 = j.f70019F;
                int readInt2 = objectInput.readInt();
                byte readByte4 = objectInput.readByte();
                byte readByte5 = objectInput.readByte();
                i.f70013c.getClass();
                M02 = readInt2 >= 1 ? j.E1(k.f70046AH, readInt2, readByte4, readByte5) : j.E1(k.BEFORE_AH, 1 - readInt2, readByte4, readByte5);
                this.f70067b = M02;
                return;
            case 4:
                byte readByte6 = objectInput.readByte();
                if (readByte6 == 0) {
                    M02 = k.BEFORE_AH;
                } else {
                    if (readByte6 != 1) {
                        throw new C7073b("HijrahEra not valid");
                    }
                    M02 = k.f70046AH;
                }
                this.f70067b = M02;
                return;
            case 5:
                int readInt3 = objectInput.readInt();
                byte readByte7 = objectInput.readByte();
                byte readByte8 = objectInput.readByte();
                q.f70062c.getClass();
                oVar = new r(ig.f.E1(readInt3 + 1911, readByte7, readByte8));
                M02 = oVar;
                this.f70067b = M02;
                return;
            case 6:
                M02 = s.a(objectInput.readByte());
                this.f70067b = M02;
                return;
            case 7:
                int readInt4 = objectInput.readInt();
                byte readByte9 = objectInput.readByte();
                byte readByte10 = objectInput.readByte();
                u.f70068c.getClass();
                oVar = new v(ig.f.E1(readInt4 - 543, readByte9, readByte10));
                M02 = oVar;
                this.f70067b = M02;
                return;
            case 8:
                byte readByte11 = objectInput.readByte();
                if (readByte11 == 0) {
                    M02 = w.BEFORE_BE;
                } else {
                    if (readByte11 != 1) {
                        throw new C7073b("Era is not valid for ThaiBuddhistEra");
                    }
                    M02 = w.f70072BE;
                }
                this.f70067b = M02;
                return;
            case 9:
            case 10:
            default:
                throw new StreamCorruptedException("Unknown serialized type");
            case 11:
                M02 = g.l(objectInput);
                this.f70067b = M02;
                return;
            case 12:
                M02 = ((AbstractC7423b) objectInput.readObject()).E0((ig.h) objectInput.readObject());
                this.f70067b = M02;
                return;
            case 13:
                M02 = ((c) objectInput.readObject()).E0((ig.q) objectInput.readObject()).l1((ig.p) objectInput.readObject());
                this.f70067b = M02;
                return;
        }
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b11 = this.f70066a;
        Object obj = this.f70067b;
        objectOutput.writeByte(b11);
        switch (b11) {
            case 1:
                o oVar = (o) obj;
                oVar.getClass();
                objectOutput.writeInt(oVar.Q(EnumC8145a.YEAR));
                objectOutput.writeByte(oVar.Q(EnumC8145a.MONTH_OF_YEAR));
                objectOutput.writeByte(oVar.Q(EnumC8145a.DAY_OF_MONTH));
                return;
            case 2:
                ((p) obj).a1(objectOutput);
                return;
            case 3:
                j jVar = (j) obj;
                jVar.getClass();
                objectOutput.writeInt(jVar.Q(EnumC8145a.YEAR));
                objectOutput.writeByte(jVar.Q(EnumC8145a.MONTH_OF_YEAR));
                objectOutput.writeByte(jVar.Q(EnumC8145a.DAY_OF_MONTH));
                return;
            case 4:
                objectOutput.writeByte(((k) obj).ordinal());
                return;
            case 5:
                r rVar = (r) obj;
                rVar.getClass();
                objectOutput.writeInt(rVar.Q(EnumC8145a.YEAR));
                objectOutput.writeByte(rVar.Q(EnumC8145a.MONTH_OF_YEAR));
                objectOutput.writeByte(rVar.Q(EnumC8145a.DAY_OF_MONTH));
                return;
            case 6:
                objectOutput.writeByte(((s) obj).ordinal());
                return;
            case 7:
                v vVar = (v) obj;
                vVar.getClass();
                objectOutput.writeInt(vVar.Q(EnumC8145a.YEAR));
                objectOutput.writeByte(vVar.Q(EnumC8145a.MONTH_OF_YEAR));
                objectOutput.writeByte(vVar.Q(EnumC8145a.DAY_OF_MONTH));
                return;
            case 8:
                objectOutput.writeByte(((w) obj).ordinal());
                return;
            case 9:
            case 10:
            default:
                throw new InvalidClassException("Unknown serialized type");
            case 11:
                objectOutput.writeUTF(((g) obj).i());
                return;
            case 12:
                ((d) obj).writeExternal(objectOutput);
                return;
            case 13:
                ((f) obj).writeExternal(objectOutput);
                return;
        }
    }

    t(byte b11, Object obj) {
        this.f70066a = b11;
        this.f70067b = obj;
    }
}
