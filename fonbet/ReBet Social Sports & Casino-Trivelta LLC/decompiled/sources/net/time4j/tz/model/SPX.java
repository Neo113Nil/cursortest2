package net.time4j.tz.model;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.UByte;
import li.AbstractC5469c;
import net.time4j.B;
import net.time4j.G;
import net.time4j.Y;
import net.time4j.tz.p;
import net.time4j.tz.q;

/* loaded from: classes5.dex */
final class SPX implements Externalizable {
    private static final long serialVersionUID = 6526945678752534989L;

    /* renamed from: a, reason: collision with root package name */
    public transient Object f58369a;

    /* renamed from: b, reason: collision with root package name */
    public transient int f58370b;

    public SPX() {
    }

    public static Object a(ObjectInput objectInput) {
        return new a(j(objectInput), false, false);
    }

    public static Object b(ObjectInput objectInput) {
        List j10 = j(objectInput);
        return l.g(p.p(((q) j10.get(0)).f()), j10, h(objectInput), false, false);
    }

    public static d c(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        B d10 = B.d((readByte & UByte.MAX_VALUE) >>> 4);
        int i10 = readByte & 15;
        i iVar = i.VALUES[i10 % 3];
        int i11 = i(i10);
        byte readByte2 = dataInput.readByte();
        int i12 = (readByte2 & UByte.MAX_VALUE) >>> 3;
        Y f10 = Y.f(readByte2 & 7);
        byte readByte3 = dataInput.readByte();
        boolean z10 = ((readByte3 & UByte.MAX_VALUE) >>> 7) == 1;
        int i13 = readByte3 & 63;
        if (i11 == -1) {
            i11 = f(dataInput);
        }
        return new c(d10, i12, f10, i13 == 63 ? dataInput.readInt() : i13 * 1800, iVar, i11, z10);
    }

    public static d d(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        int i10 = (readByte & UByte.MAX_VALUE) >>> 4;
        int i11 = readByte & 15;
        i iVar = i.VALUES[i11 % 3];
        int i12 = i(i11);
        byte readByte2 = dataInput.readByte();
        int i13 = (readByte2 & UByte.MAX_VALUE) >>> 3;
        int n10 = n(readByte2 & 7);
        if (i12 == -1) {
            i12 = f(dataInput);
        }
        int i14 = i12;
        if (n10 == -1) {
            n10 = dataInput.readInt();
        }
        return new f(B.d(i10), i13, n10, iVar, i14);
    }

    public static d e(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        B d10 = B.d((readByte & UByte.MAX_VALUE) >>> 4);
        int i10 = readByte & 15;
        i iVar = i.VALUES[i10 % 3];
        int i11 = i(i10);
        byte readByte2 = dataInput.readByte();
        Y f10 = Y.f((readByte2 & UByte.MAX_VALUE) >>> 5);
        int i12 = readByte2 & 31;
        if (i11 == -1) {
            i11 = f(dataInput);
        }
        return new h(d10, f10, i12 == 31 ? dataInput.readInt() : i12 * 3600, iVar, i11);
    }

    public static int f(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? dataInput.readInt() : readByte * 900;
    }

    public static Object g(ObjectInput objectInput) {
        long readByte;
        if ((objectInput.readByte() & UByte.MAX_VALUE) == 255) {
            readByte = objectInput.readLong();
        } else {
            readByte = ((((r0 << 16) + ((objectInput.readByte() & UByte.MAX_VALUE) << 8)) + (255 & objectInput.readByte())) * 900) - 4575744000L;
        }
        return new j(new q(readByte, f(objectInput), f(objectInput), f(objectInput)), h(objectInput), false);
    }

    public static List h(ObjectInput objectInput) {
        d d10;
        byte readByte = objectInput.readByte();
        if (readByte == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(readByte);
        d dVar = null;
        int i10 = 0;
        while (i10 < readByte) {
            switch (objectInput.readByte()) {
                case 120:
                    d10 = d(objectInput);
                    break;
                case 121:
                    d10 = c(objectInput);
                    break;
                case 122:
                    d10 = e(objectInput);
                    break;
                default:
                    d10 = (d) objectInput.readObject();
                    break;
            }
            if (dVar != null && k.INSTANCE.compare(dVar, d10) >= 0) {
                throw new InvalidObjectException("Order of daylight saving rules is not ascending.");
            }
            arrayList.add(d10);
            i10++;
            dVar = d10;
        }
        return arrayList;
    }

    public static int i(int i10) {
        int i11 = i10 / 3;
        if (i11 == 0) {
            return 0;
        }
        if (i11 == 1) {
            return 1800;
        }
        if (i11 != 2) {
            return i11 != 3 ? -1 : 7200;
        }
        return 3600;
    }

    public static List j(ObjectInput objectInput) {
        long j10;
        long readByte;
        int readInt = objectInput.readInt();
        if (readInt == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(readInt);
        int f10 = f(objectInput);
        long j11 = Long.MIN_VALUE;
        int i10 = f10;
        int i11 = 0;
        while (i11 < readInt) {
            byte readByte2 = objectInput.readByte();
            boolean z10 = readByte2 < 0;
            int i12 = (readByte2 >>> 5) & 3;
            int o10 = o((readByte2 >>> 2) & 7);
            if (o10 == -1) {
                readByte = objectInput.readLong();
                j10 = j11;
            } else {
                j10 = j11;
                readByte = ((((((((readByte2 & 3) << 16) | ((objectInput.readByte() & UByte.MAX_VALUE) << 8)) | (objectInput.readByte() & UByte.MAX_VALUE)) * 86400) - 4575744000L) + o10) - 7200) - f10;
            }
            long j12 = readByte;
            if (j12 <= j10) {
                throw new StreamCorruptedException("Wrong order of transitions.");
            }
            int f11 = i12 != 1 ? i12 != 2 ? i12 != 3 ? f(objectInput) : 7200 : 3600 : 0;
            if (z10) {
                f10 = f(objectInput);
            }
            int i13 = f10 + (f11 == Integer.MAX_VALUE ? 0 : f11);
            arrayList.add(new q(j12, i10, i13, f11));
            i11++;
            j11 = j12;
            i10 = i13;
        }
        return arrayList;
    }

    public static int k(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 3600) {
            return 2;
        }
        if (i10 == 7200) {
            return 3;
        }
        if (i10 == 10800) {
            return 4;
        }
        if (i10 == 79200) {
            return 5;
        }
        if (i10 != 82800) {
            return i10 != 86400 ? 0 : 7;
        }
        return 6;
    }

    public static int l(int i10) {
        if (i10 == 0) {
            return 1;
        }
        if (i10 == 60) {
            return 2;
        }
        if (i10 == 3600) {
            return 3;
        }
        if (i10 == 7200) {
            return 4;
        }
        if (i10 == 10800) {
            return 5;
        }
        if (i10 != 14400) {
            return i10 != 18000 ? 0 : 7;
        }
        return 6;
    }

    public static int m(g gVar) {
        return gVar.f().e(G.f57595y) + AbstractC5469c.g(gVar.c() * 86400);
    }

    public static int n(int i10) {
        switch (i10) {
            case 1:
                return 0;
            case 2:
                return 3600;
            case 3:
                return 7200;
            case 4:
                return 10800;
            case 5:
                return 79200;
            case 6:
                return 82800;
            case 7:
                return 86400;
            default:
                return -1;
        }
    }

    public static int o(int i10) {
        switch (i10) {
            case 1:
                return 0;
            case 2:
                return 60;
            case 3:
                return 3600;
            case 4:
                return 7200;
            case 5:
                return 10800;
            case 6:
                return 14400;
            case 7:
                return 18000;
            default:
                return -1;
        }
    }

    public static void p(Object obj, ObjectOutput objectOutput) {
        ((a) obj).u(objectOutput);
    }

    public static void q(Object obj, ObjectOutput objectOutput) {
        b bVar = (b) obj;
        bVar.l(objectOutput);
        x(bVar.k(), objectOutput);
    }

    public static void r(Object obj, DataOutput dataOutput) {
        int i10;
        c cVar = (c) obj;
        boolean u10 = u(cVar, dataOutput);
        dataOutput.writeByte(((cVar.m() << 3) | cVar.n()) & 255);
        boolean z10 = false;
        int i11 = cVar.o() ? 128 : 0;
        int m10 = m(cVar);
        if (m10 % 1800 == 0) {
            i10 = i11 | (m10 / 1800);
            z10 = true;
        } else {
            i10 = i11 | 63;
        }
        dataOutput.writeByte(i10 & 255);
        if (!u10) {
            v(dataOutput, cVar.e());
        }
        if (z10) {
            return;
        }
        dataOutput.writeInt(m10);
    }

    private Object readResolve() {
        return this.f58369a;
    }

    public static void s(Object obj, DataOutput dataOutput) {
        f fVar = (f) obj;
        boolean u10 = u(fVar, dataOutput);
        int m10 = fVar.m() << 3;
        int m11 = m(fVar);
        int k10 = k(m11);
        dataOutput.writeByte((m10 | k10) & 255);
        if (!u10) {
            v(dataOutput, fVar.e());
        }
        if (k10 == 0) {
            dataOutput.writeInt(m11);
        }
    }

    public static void t(Object obj, DataOutput dataOutput) {
        int i10;
        boolean z10;
        h hVar = (h) obj;
        boolean u10 = u(hVar, dataOutput);
        int m10 = hVar.m() << 5;
        int m11 = m(hVar);
        if (m11 % 3600 == 0) {
            i10 = m10 | (m11 / 3600);
            z10 = true;
        } else {
            i10 = m10 | 31;
            z10 = false;
        }
        dataOutput.writeByte(i10 & 255);
        if (!u10) {
            v(dataOutput, hVar.e());
        }
        if (z10) {
            return;
        }
        dataOutput.writeInt(m11);
    }

    public static boolean u(g gVar, DataOutput dataOutput) {
        int i10;
        int k10 = gVar.k() << 4;
        int ordinal = gVar.d().ordinal();
        int e10 = gVar.e();
        boolean z10 = true;
        if (e10 != 0) {
            if (e10 == 1800) {
                ordinal += 3;
            } else if (e10 == 3600) {
                ordinal += 6;
            } else {
                if (e10 != 7200) {
                    i10 = k10 | (ordinal + 12);
                    z10 = false;
                    dataOutput.writeByte(i10 & 255);
                    return z10;
                }
                ordinal += 9;
            }
        }
        i10 = k10 | ordinal;
        dataOutput.writeByte(i10 & 255);
        return z10;
    }

    public static void v(DataOutput dataOutput, int i10) {
        if (i10 % 900 == 0) {
            dataOutput.writeByte(i10 / 900);
        } else {
            dataOutput.writeByte(127);
            dataOutput.writeInt(i10);
        }
    }

    public static void w(Object obj, ObjectOutput objectOutput) {
        j jVar = (j) obj;
        q l10 = jVar.l();
        long e10 = l10.e();
        if (e10 < -4575744000L || e10 >= 10464767099L || e10 % 900 != 0) {
            objectOutput.writeByte(255);
            objectOutput.writeLong(l10.e());
        } else {
            int i10 = (int) ((e10 - (-4575744000L)) / 900);
            objectOutput.writeByte((i10 >>> 16) & 255);
            objectOutput.writeByte((i10 >>> 8) & 255);
            objectOutput.writeByte(i10 & 255);
        }
        v(objectOutput, l10.f());
        v(objectOutput, l10.i());
        v(objectOutput, l10.d());
        x(jVar.n(), objectOutput);
    }

    public static void x(List list, ObjectOutput objectOutput) {
        objectOutput.writeByte(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            objectOutput.writeByte(dVar.g());
            switch (dVar.g()) {
                case 120:
                    s(dVar, objectOutput);
                    break;
                case 121:
                    r(dVar, objectOutput);
                    break;
                case 122:
                    t(dVar, objectOutput);
                    break;
                default:
                    objectOutput.writeObject(dVar);
                    break;
            }
        }
    }

    public static int y(q qVar, int i10, DataOutput dataOutput) {
        int h10 = qVar.h();
        int i11 = 0;
        boolean z10 = h10 != i10;
        byte b10 = z10 ? (byte) 128 : (byte) 0;
        int d10 = qVar.d();
        int i12 = d10 != 0 ? d10 != 3600 ? d10 != 7200 ? 0 : 3 : 2 : 1;
        byte b11 = (byte) (b10 | (i12 << 5));
        long e10 = qVar.e() + i10;
        long j10 = 7200 + e10;
        if (j10 >= -4575744000L && j10 < 18067104000L) {
            i11 = l(AbstractC5469c.d(j10, 86400));
        }
        byte b12 = (byte) ((i11 << 2) | b11);
        if (i11 == 0) {
            dataOutput.writeByte(b12);
            dataOutput.writeLong(qVar.e());
        } else {
            int i13 = (int) ((e10 + 4575751200L) / 86400);
            dataOutput.writeByte((byte) (b12 | ((byte) ((i13 >>> 16) & 3))));
            dataOutput.writeByte((i13 >>> 8) & 255);
            dataOutput.writeByte(i13 & 255);
        }
        if (i12 == 0) {
            v(dataOutput, d10);
        }
        if (z10) {
            v(dataOutput, h10);
        }
        return h10;
    }

    public static void z(q[] qVarArr, int i10, DataOutput dataOutput) {
        int min = Math.min(i10, qVarArr.length);
        dataOutput.writeInt(min);
        if (min > 0) {
            int f10 = qVarArr[0].f();
            v(dataOutput, f10);
            for (int i11 = 0; i11 < min; i11++) {
                f10 = y(qVarArr[i11], f10, dataOutput);
            }
        }
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        switch (objectInput.readByte()) {
            case 120:
                this.f58369a = d(objectInput);
                return;
            case 121:
                this.f58369a = c(objectInput);
                return;
            case 122:
                this.f58369a = e(objectInput);
                return;
            case 123:
            case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
            default:
                throw new StreamCorruptedException("Unknown serialized type.");
            case 125:
                this.f58369a = g(objectInput);
                return;
            case 126:
                this.f58369a = a(objectInput);
                return;
            case Byte.MAX_VALUE:
                this.f58369a = b(objectInput);
                return;
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeByte(this.f58370b);
        switch (this.f58370b) {
            case 120:
                s(this.f58369a, objectOutput);
                return;
            case 121:
                r(this.f58369a, objectOutput);
                return;
            case 122:
                t(this.f58369a, objectOutput);
                return;
            case 123:
            case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
            default:
                throw new InvalidClassException("Unknown serialized type.");
            case 125:
                w(this.f58369a, objectOutput);
                return;
            case 126:
                p(this.f58369a, objectOutput);
                return;
            case 127:
                q(this.f58369a, objectOutput);
                return;
        }
    }

    public SPX(Object obj, int i10) {
        this.f58369a = obj;
        this.f58370b = i10;
    }
}
