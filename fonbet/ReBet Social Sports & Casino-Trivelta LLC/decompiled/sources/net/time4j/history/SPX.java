package net.time4j.history;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import kotlin.UByte;
import net.time4j.F;
import oi.EnumC5900A;

/* loaded from: classes5.dex */
final class SPX implements Externalizable {
    private static final int[] EMPTY_INT_ARRAY = new int[0];
    private static final long serialVersionUID = 1;

    /* renamed from: a, reason: collision with root package name */
    public transient Object f58150a;

    /* renamed from: b, reason: collision with root package name */
    public transient int f58151b;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$net$time4j$history$internal$HistoricVariant;

        static {
            int[] iArr = new int[net.time4j.history.internal.b.values().length];
            $SwitchMap$net$time4j$history$internal$HistoricVariant = iArr;
            try {
                iArr[net.time4j.history.internal.b.PROLEPTIC_GREGORIAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$time4j$history$internal$HistoricVariant[net.time4j.history.internal.b.PROLEPTIC_JULIAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$net$time4j$history$internal$HistoricVariant[net.time4j.history.internal.b.PROLEPTIC_BYZANTINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$net$time4j$history$internal$HistoricVariant[net.time4j.history.internal.b.SWEDEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$net$time4j$history$internal$HistoricVariant[net.time4j.history.internal.b.INTRODUCTION_ON_1582_10_15.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public SPX() {
    }

    public static net.time4j.history.internal.b a(int i10) {
        for (net.time4j.history.internal.b bVar : net.time4j.history.internal.b.values()) {
            if (bVar.a() == i10) {
                return bVar;
            }
        }
        throw new StreamCorruptedException("Unknown variant of chronological history.");
    }

    public static net.time4j.history.a c(DataInput dataInput) {
        int readInt = dataInput.readInt();
        if (readInt <= 0) {
            return null;
        }
        int[] iArr = new int[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            iArr[i10] = 1 - dataInput.readInt();
        }
        return net.time4j.history.a.f(iArr);
    }

    private Object readResolve() {
        return this.f58150a;
    }

    public final d b(DataInput dataInput, byte b10) {
        int i10 = a.$SwitchMap$net$time4j$history$internal$HistoricVariant[a(b10 & 15).ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? d.F(F.G0(dataInput.readLong(), EnumC5900A.MODIFIED_JULIAN_DATE)) : d.D() : d.G() : d.f58163s : d.f58162r : d.f58161q;
    }

    public final void d(DataOutput dataOutput) {
        d dVar = (d) this.f58150a;
        dataOutput.writeByte(dVar.s().a() | (this.f58151b << 4));
        if (dVar.s() == net.time4j.history.internal.b.SINGLE_CUTOVER_DATE) {
            dataOutput.writeLong(((f) dVar.p().get(0)).f58185a);
        }
        int[] e10 = dVar.x() ? dVar.l().e() : EMPTY_INT_ARRAY;
        dataOutput.writeInt(e10.length);
        for (int i10 : e10) {
            dataOutput.writeInt(i10);
        }
        dVar.v().g(dataOutput);
        dVar.o().h(dataOutput);
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        d b10;
        byte readByte = objectInput.readByte();
        int i10 = (readByte & UByte.MAX_VALUE) >> 4;
        if (i10 == 1) {
            b10 = b(objectInput, readByte);
        } else if (i10 == 2) {
            d b11 = b(objectInput, readByte);
            net.time4j.history.a c10 = c(objectInput);
            b10 = c10 != null ? b11.H(c10) : b11;
        } else {
            if (i10 != 3) {
                throw new StreamCorruptedException("Unknown serialized type.");
            }
            d b12 = b(objectInput, readByte);
            net.time4j.history.a c11 = c(objectInput);
            if (c11 != null) {
                b12 = b12.H(c11);
            }
            b10 = b12.J(o.e(objectInput)).I(g.g(objectInput));
        }
        this.f58150a = b10;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        int i10 = this.f58151b;
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            throw new InvalidClassException("Unknown serialized type.");
        }
        d(objectOutput);
    }

    public SPX(Object obj, int i10) {
        this.f58150a = obj;
        this.f58151b = i10;
    }
}
