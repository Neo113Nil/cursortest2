package ig;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/* loaded from: classes10.dex */
final class m implements Externalizable {

    /* renamed from: a, reason: collision with root package name */
    private byte f66441a;

    /* renamed from: b, reason: collision with root package name */
    private Object f66442b;

    public m() {
    }

    static Serializable a(ObjectInput objectInput) throws IOException {
        return b(objectInput.readByte(), objectInput);
    }

    private static Serializable b(byte b11, ObjectInput objectInput) throws IOException {
        if (b11 == 64) {
            int i11 = j.f66432d;
            return j.E0(objectInput.readByte(), objectInput.readByte());
        }
        switch (b11) {
            case 1:
                d dVar = d.f66402c;
                return d.f(objectInput.readLong(), objectInput.readInt());
            case 2:
                e eVar = e.f66405d;
                return e.a1(objectInput.readLong(), objectInput.readInt());
            case 3:
                f fVar = f.f66410e;
                return f.E1(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                g gVar = g.f66417d;
                f fVar2 = f.f66410e;
                return g.v1(f.E1(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), h.t1(objectInput));
            case 5:
                return h.t1(objectInput);
            case 6:
                return s.v1(objectInput);
            case 7:
                int i12 = r.f66461e;
                String readUTF = objectInput.readUTF();
                if (readUTF.equals("Z") || readUTF.startsWith("+") || readUTF.startsWith("-")) {
                    throw new C7073b("Invalid ID for region-based ZoneId, invalid format: ".concat(readUTF));
                }
                if (readUTF.equals("UTC") || readUTF.equals("GMT") || readUTF.equals("UT")) {
                    q qVar = q.f66455f;
                    qVar.getClass();
                    return new r(readUTF, ng.f.h(qVar));
                }
                if (readUTF.startsWith("UTC+") || readUTF.startsWith("GMT+") || readUTF.startsWith("UTC-") || readUTF.startsWith("GMT-")) {
                    q l11 = q.l(readUTF.substring(3));
                    if (l11.i() == 0) {
                        return new r(readUTF.substring(0, 3), ng.f.h(l11));
                    }
                    return new r(readUTF.substring(0, 3) + l11.a(), ng.f.h(l11));
                }
                if (!readUTF.startsWith("UT+") && !readUTF.startsWith("UT-")) {
                    return r.h(readUTF, false);
                }
                q l12 = q.l(readUTF.substring(2));
                if (l12.i() == 0) {
                    return new r("UT", ng.f.h(l12));
                }
                return new r("UT" + l12.a(), ng.f.h(l12));
            case 8:
                return q.A(objectInput);
            default:
                switch (b11) {
                    case 66:
                        return l.L0(objectInput);
                    case 67:
                        int i13 = n.f66443c;
                        return n.H0(objectInput.readInt());
                    case 68:
                        int i14 = o.f66447d;
                        return o.E0(objectInput.readInt(), objectInput.readByte());
                    case 69:
                        return k.L0(objectInput);
                    default:
                        throw new StreamCorruptedException("Unknown serialized type");
                }
        }
    }

    private Object readResolve() {
        return this.f66442b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        byte readByte = objectInput.readByte();
        this.f66441a = readByte;
        this.f66442b = b(readByte, objectInput);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b11 = this.f66441a;
        Object obj = this.f66442b;
        objectOutput.writeByte(b11);
        if (b11 == 64) {
            ((j) obj).H0(objectOutput);
            return;
        }
        switch (b11) {
            case 1:
                ((d) obj).writeExternal(objectOutput);
                return;
            case 2:
                ((e) obj).j1(objectOutput);
                return;
            case 3:
                ((f) obj).e2(objectOutput);
                return;
            case 4:
                ((g) obj).R1(objectOutput);
                return;
            case 5:
                ((h) obj).B1(objectOutput);
                return;
            case 6:
                ((s) obj).F1(objectOutput);
                return;
            case 7:
                ((r) obj).i(objectOutput);
                return;
            case 8:
                ((q) obj).B(objectOutput);
                return;
            default:
                switch (b11) {
                    case 66:
                        ((l) obj).T0(objectOutput);
                        return;
                    case 67:
                        ((n) obj).W0(objectOutput);
                        return;
                    case 68:
                        ((o) obj).a1(objectOutput);
                        return;
                    case 69:
                        ((k) obj).W0(objectOutput);
                        return;
                    default:
                        throw new InvalidClassException("Unknown serialized type");
                }
        }
    }

    m(byte b11, Object obj) {
        this.f66441a = b11;
        this.f66442b = obj;
    }
}
