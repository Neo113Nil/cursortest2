package defpackage;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.YearMonth;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class k5h implements Externalizable {
    public int a;
    public Serializable b;

    public k5h(int i, Serializable serializable) {
        this.a = i;
        this.b = serializable;
    }

    private final Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Serializable wgbVar;
        objectInput.getClass();
        byte readByte = objectInput.readByte();
        this.a = readByte;
        if (readByte == 2) {
            LocalDate ofEpochDay = LocalDate.ofEpochDay(objectInput.readLong());
            ofEpochDay.getClass();
            wgbVar = new wgb(ofEpochDay);
        } else if (readByte == 3) {
            vhb vhbVar = whb.Companion;
            long readLong = objectInput.readLong();
            vhbVar.getClass();
            try {
                wgbVar = new whb(LocalTime.ofNanoOfDay(readLong));
            } catch (DateTimeException e) {
                ilg.k(e);
                return;
            }
        } else if (readByte == 4) {
            LocalDate ofEpochDay2 = LocalDate.ofEpochDay(objectInput.readLong());
            ofEpochDay2.getClass();
            wgb wgbVar2 = new wgb(ofEpochDay2);
            vhb vhbVar2 = whb.Companion;
            long readLong2 = objectInput.readLong();
            vhbVar2.getClass();
            try {
                wgbVar = new ehb(wgbVar2, new whb(LocalTime.ofNanoOfDay(readLong2)));
            } catch (DateTimeException e2) {
                ilg.k(e2);
                return;
            }
        } else if (readByte == 10) {
            wgbVar = thk.a(null, null, Integer.valueOf(objectInput.readInt()));
        } else {
            if (readByte != 11) {
                ilg.l(this.a, "Unknown type tag: ");
                return;
            }
            gnl gnlVar = hnl.Companion;
            long readLong3 = objectInput.readLong();
            mqi mqiVar = onl.a;
            gnlVar.getClass();
            long j = readLong3 / 12;
            if ((readLong3 ^ 12) < 0 && j * 12 != readLong3) {
                j--;
            }
            long j2 = readLong3 % 12;
            wgbVar = new hnl((int) (j + 1970), ((int) (j2 + (12 & (((j2 ^ 12) & ((-j2) | j2)) >> 63)))) + 1);
        }
        this.b = wgbVar;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.getClass();
        objectOutput.writeByte(this.a);
        Serializable serializable = this.b;
        int i = this.a;
        if (i == 2) {
            objectOutput.writeLong(((wgb) serializable).a.toEpochDay());
            return;
        }
        if (i == 3) {
            objectOutput.writeLong(((whb) serializable).a.toNanoOfDay());
            return;
        }
        if (i != 4) {
            if (i == 10) {
                objectOutput.writeInt(((nhk) serializable).a.getTotalSeconds());
                return;
            } else {
                if (i != 11) {
                    ilg.d(this.a, " for value: ", serializable, "Unknown type tag: ");
                    return;
                }
                YearMonth yearMonth = ((hnl) serializable).a;
                mqi mqiVar = onl.a;
                objectOutput.writeLong((((yearMonth.getYear() - 1970) * 12) + yearMonth.getMonthValue()) - 1);
                return;
            }
        }
        LocalDateTime localDateTime = ((ehb) serializable).a;
        LocalDate localDate = localDateTime.toLocalDate();
        localDate.getClass();
        new wgb(localDate);
        objectOutput.writeLong(localDate.toEpochDay());
        LocalTime localTime = localDateTime.toLocalTime();
        localTime.getClass();
        new whb(localTime);
        objectOutput.writeLong(localTime.toNanoOfDay());
    }
}
