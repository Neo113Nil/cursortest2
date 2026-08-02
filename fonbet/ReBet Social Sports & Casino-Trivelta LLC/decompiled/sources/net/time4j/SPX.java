package net.time4j;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.UByte;
import net.time4j.C5718k;
import oi.L;
import qi.EnumC6185f;

/* loaded from: classes5.dex */
final class SPX implements Externalizable {
    private static final long serialVersionUID = 1;

    /* renamed from: a, reason: collision with root package name */
    public transient Object f57657a;

    /* renamed from: b, reason: collision with root package name */
    public transient int f57658b;

    public SPX() {
    }

    public static void j(F f10, int i10, DataOutput dataOutput) {
        int n10 = f10.n();
        int i11 = (n10 < 1850 || n10 > 2100) ? Math.abs(n10) < 10000 ? 2 : 3 : 1;
        dataOutput.writeByte((i10 << 4) | f10.o());
        dataOutput.writeByte(f10.p() | (i11 << 5));
        if (i11 == 1) {
            dataOutput.writeByte(n10 - 1978);
        } else if (i11 == 2) {
            dataOutput.writeShort(n10);
        } else {
            dataOutput.writeInt(n10);
        }
    }

    public static void p(G g10, DataOutput dataOutput) {
        if (g10.a() != 0) {
            dataOutput.writeByte(g10.q());
            dataOutput.writeByte(g10.l());
            dataOutput.writeByte(g10.i());
            dataOutput.writeInt(g10.a());
            return;
        }
        if (g10.i() != 0) {
            dataOutput.writeByte(g10.q());
            dataOutput.writeByte(g10.l());
            dataOutput.writeByte(~g10.i());
        } else if (g10.l() == 0) {
            dataOutput.writeByte(~g10.q());
        } else {
            dataOutput.writeByte(g10.q());
            dataOutput.writeByte(~g10.l());
        }
    }

    private Object readResolve() {
        return this.f57657a;
    }

    public final F a(DataInput dataInput, byte b10) {
        int readByte;
        int i10 = b10 & 15;
        byte readByte2 = dataInput.readByte();
        int i11 = (readByte2 >> 5) & 3;
        int i12 = readByte2 & 31;
        if (i11 == 1) {
            readByte = dataInput.readByte() + 1978;
        } else if (i11 == 2) {
            readByte = dataInput.readShort();
        } else {
            if (i11 != 3) {
                throw new StreamCorruptedException("Unknown year range.");
            }
            readByte = dataInput.readInt();
        }
        return F.F0(readByte, B.d(i10), i12);
    }

    public final Object b(ObjectInput objectInput, byte b10) {
        boolean z10 = (b10 & 1) == 1;
        if ((b10 & 2) == 2) {
            return new C5718k.b(z10, C5718k.s((Map) objectInput.readObject()));
        }
        String readUTF = objectInput.readUTF();
        String readUTF2 = objectInput.readUTF();
        int indexOf = readUTF.indexOf("-");
        return new C5718k.b(z10, indexOf == -1 ? new Locale(readUTF) : new Locale(readUTF.substring(0, indexOf), readUTF.substring(indexOf + 1)), readUTF2);
    }

    public final Object c(ObjectInput objectInput, byte b10) {
        boolean z10 = (b10 & 15) == 1;
        int readInt = objectInput.readInt();
        if (readInt == 0) {
            return C5721n.j();
        }
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(L.a.c(z10 ? objectInput.readLong() : objectInput.readInt(), (InterfaceC5729w) objectInput.readObject()));
        }
        return new C5721n(arrayList, objectInput.readBoolean());
    }

    public final Object d(ObjectInput objectInput, byte b10) {
        EnumC6185f enumC6185f = (b10 & 1) == 1 ? EnumC6185f.UTC : EnumC6185f.POSIX;
        long readLong = objectInput.readLong();
        int readInt = (b10 & 2) == 2 ? objectInput.readInt() : 0;
        return enumC6185f == EnumC6185f.UTC ? C5731y.i(readLong, readInt) : C5731y.h(readLong, readInt);
    }

    public final Object e(DataInput dataInput, byte b10) {
        return A.i0(dataInput, (b10 & 1) != 0, ((b10 & 2) >>> 1) != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    public final G f(DataInput dataInput) {
        int readInt;
        byte readByte = dataInput.readByte();
        if (readByte < 0) {
            return G.A0(~readByte);
        }
        int readByte2 = dataInput.readByte();
        byte b10 = 0;
        if (readByte2 < 0) {
            readByte2 = ~readByte2;
            readInt = 0;
        } else {
            byte readByte3 = dataInput.readByte();
            if (readByte3 < 0) {
                b10 = ~readByte3;
                readInt = 0;
            } else {
                readInt = dataInput.readInt();
                b10 = readByte3;
            }
        }
        return G.D0(readByte, readByte2, b10, readInt);
    }

    public final Object g(DataInput dataInput, byte b10) {
        return H.V(a(dataInput, b10), f(dataInput));
    }

    public final Object h(DataInput dataInput, byte b10) {
        byte readByte = dataInput.readByte();
        Y f10 = Y.f(readByte >> 4);
        int i10 = readByte & 15;
        Y y10 = Y.SATURDAY;
        Y y11 = Y.SUNDAY;
        if ((b10 & 15) == 1) {
            byte readByte2 = dataInput.readByte();
            y10 = Y.f(readByte2 >> 4);
            y11 = Y.f(readByte2 & 15);
        }
        return a0.l(f10, i10, y10, y11);
    }

    public final void i(DataOutput dataOutput) {
        j((F) this.f57657a, 1, dataOutput);
    }

    public final void k(ObjectOutput objectOutput) {
        C5718k.b bVar = (C5718k.b) C5718k.b.class.cast(this.f57657a);
        Locale E10 = bVar.E();
        int i10 = bVar.I() ? 113 : 112;
        if (E10 == null) {
            i10 |= 2;
        }
        objectOutput.writeByte(i10);
        if (E10 == null) {
            objectOutput.writeObject(bVar.B());
            return;
        }
        String language = E10.getLanguage();
        if (!E10.getCountry().isEmpty()) {
            language = language + "-" + E10.getCountry();
        }
        objectOutput.writeUTF(language);
        objectOutput.writeUTF(bVar.y());
    }

    public final void l(ObjectOutput objectOutput) {
        boolean z10;
        C5721n c5721n = (C5721n) C5721n.class.cast(this.f57657a);
        int size = c5721n.a().size();
        int min = Math.min(size, 6);
        int i10 = 0;
        while (true) {
            if (i10 >= min) {
                z10 = false;
                break;
            } else {
                if (((L.a) c5721n.a().get(i10)).a() >= 1000) {
                    z10 = true;
                    break;
                }
                i10++;
            }
        }
        objectOutput.writeByte(z10 ? 97 : 96);
        objectOutput.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            L.a aVar = (L.a) c5721n.a().get(i11);
            if (z10) {
                objectOutput.writeLong(aVar.a());
            } else {
                objectOutput.writeInt((int) aVar.a());
            }
            objectOutput.writeObject(aVar.b());
        }
        if (size > 0) {
            objectOutput.writeBoolean(c5721n.i());
        }
    }

    public final void m(ObjectOutput objectOutput) {
        C5731y c5731y = (C5731y) C5731y.class.cast(this.f57657a);
        int i10 = c5731y.e() == EnumC6185f.UTC ? 81 : 80;
        if (c5731y.d() == 0) {
            objectOutput.writeByte(i10);
            objectOutput.writeLong(c5731y.f());
        } else {
            objectOutput.writeByte(i10 | 2);
            objectOutput.writeLong(c5731y.f());
            objectOutput.writeInt(c5731y.d());
        }
    }

    public final void n(DataOutput dataOutput) {
        ((A) this.f57657a).q0(dataOutput);
    }

    public final void o(DataOutput dataOutput) {
        G g10 = (G) this.f57657a;
        dataOutput.writeByte(32);
        p(g10, dataOutput);
    }

    public final void q(DataOutput dataOutput) {
        H h10 = (H) this.f57657a;
        j(h10.P(), 8, dataOutput);
        p(h10.R(), dataOutput);
    }

    public final void r(DataOutput dataOutput) {
        a0 a0Var = (a0) this.f57657a;
        boolean z10 = a0Var.h() == Y.SATURDAY && a0Var.e() == Y.SUNDAY;
        dataOutput.writeByte(!z10 ? 49 : 48);
        dataOutput.writeByte((a0Var.f().b() << 4) | a0Var.g());
        if (z10) {
            return;
        }
        dataOutput.writeByte(a0Var.e().b() | (a0Var.h().b() << 4));
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        switch ((readByte & UByte.MAX_VALUE) >> 4) {
            case 1:
                this.f57657a = a(objectInput, readByte);
                return;
            case 2:
                this.f57657a = f(objectInput);
                return;
            case 3:
                this.f57657a = h(objectInput, readByte);
                return;
            case 4:
                this.f57657a = e(objectInput, readByte);
                return;
            case 5:
                this.f57657a = d(objectInput, readByte);
                return;
            case 6:
                this.f57657a = c(objectInput, readByte);
                return;
            case 7:
                this.f57657a = b(objectInput, readByte);
                return;
            case 8:
                this.f57657a = g(objectInput, readByte);
                return;
            default:
                throw new StreamCorruptedException("Unknown serialized type.");
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        switch (this.f57658b) {
            case 1:
                i(objectOutput);
                return;
            case 2:
                o(objectOutput);
                return;
            case 3:
                r(objectOutput);
                return;
            case 4:
                n(objectOutput);
                return;
            case 5:
                m(objectOutput);
                return;
            case 6:
                l(objectOutput);
                return;
            case 7:
                k(objectOutput);
                return;
            case 8:
                q(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type.");
        }
    }

    public SPX(Object obj, int i10) {
        this.f57657a = obj;
        this.f57658b = i10;
    }
}
