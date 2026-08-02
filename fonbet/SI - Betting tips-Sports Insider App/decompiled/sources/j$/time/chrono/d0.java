package j$.time.chrono;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* loaded from: classes2.dex */
public final class d0 implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* renamed from: a, reason: collision with root package name */
    public byte f17310a;

    /* renamed from: b, reason: collision with root package name */
    public Object f17311b;

    public d0() {
    }

    public d0(byte b10, Object obj) {
        this.f17310a = b10;
        this.f17311b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b10 = this.f17310a;
        Object obj = this.f17311b;
        objectOutput.writeByte(b10);
        switch (b10) {
            case 1:
                objectOutput.writeUTF(((a) obj).getId());
                return;
            case 2:
                f fVar = (f) obj;
                objectOutput.writeObject(fVar.f17314a);
                objectOutput.writeObject(fVar.f17315b);
                return;
            case 3:
                j jVar = (j) obj;
                objectOutput.writeObject(jVar.f17327a);
                objectOutput.writeObject(jVar.f17328b);
                objectOutput.writeObject(jVar.f17329c);
                return;
            case 4:
                w wVar = (w) obj;
                wVar.getClass();
                objectOutput.writeInt(j$.time.temporal.q.a(wVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.q.a(wVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.q.a(wVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((x) obj).f17357a);
                return;
            case 6:
                p pVar = (p) obj;
                objectOutput.writeObject(pVar.f17341a);
                objectOutput.writeInt(j$.time.temporal.q.a(pVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.q.a(pVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.q.a(pVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 7:
                b0 b0Var = (b0) obj;
                b0Var.getClass();
                objectOutput.writeInt(j$.time.temporal.q.a(b0Var, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.q.a(b0Var, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.q.a(b0Var, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                h0 h0Var = (h0) obj;
                h0Var.getClass();
                objectOutput.writeInt(j$.time.temporal.q.a(h0Var, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.q.a(h0Var, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.q.a(h0Var, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                g gVar = (g) obj;
                objectOutput.writeUTF(gVar.f17318a.getId());
                objectOutput.writeInt(gVar.f17319b);
                objectOutput.writeInt(gVar.f17320c);
                objectOutput.writeInt(gVar.f17321d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Object W;
        byte readByte = objectInput.readByte();
        this.f17310a = readByte;
        switch (readByte) {
            case 1:
                ConcurrentHashMap concurrentHashMap = a.f17304a;
                W = j$.com.android.tools.r8.a.W(objectInput.readUTF());
                break;
            case 2:
                W = ((b) objectInput.readObject()).E((j$.time.j) objectInput.readObject());
                break;
            case 3:
                W = ((ChronoLocalDateTime) objectInput.readObject()).y((ZoneOffset) objectInput.readObject()).v((ZoneId) objectInput.readObject());
                break;
            case 4:
                j$.time.g gVar = w.f17351d;
                int readInt = objectInput.readInt();
                byte readByte2 = objectInput.readByte();
                byte readByte3 = objectInput.readByte();
                u.f17349c.getClass();
                W = new w(j$.time.g.Z(readInt, readByte2, readByte3));
                break;
            case 5:
                x xVar = x.f17355d;
                W = x.m(objectInput.readByte());
                break;
            case 6:
                n nVar = (n) objectInput.readObject();
                int readInt2 = objectInput.readInt();
                byte readByte4 = objectInput.readByte();
                byte readByte5 = objectInput.readByte();
                nVar.getClass();
                W = new p(nVar, readInt2, readByte4, readByte5);
                break;
            case 7:
                int readInt3 = objectInput.readInt();
                byte readByte6 = objectInput.readByte();
                byte readByte7 = objectInput.readByte();
                z.f17361c.getClass();
                W = new b0(j$.time.g.Z(readInt3 + 1911, readByte6, readByte7));
                break;
            case 8:
                int readInt4 = objectInput.readInt();
                byte readByte8 = objectInput.readByte();
                byte readByte9 = objectInput.readByte();
                f0.f17316c.getClass();
                W = new h0(j$.time.g.Z(readInt4 - 543, readByte8, readByte9));
                break;
            case 9:
                int i5 = g.f17317e;
                W = new g(j$.com.android.tools.r8.a.W(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f17311b = W;
    }

    private Object readResolve() {
        return this.f17311b;
    }
}
