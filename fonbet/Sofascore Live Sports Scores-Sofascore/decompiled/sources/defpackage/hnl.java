package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.DateTimeException;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = pnl.class)
/* loaded from: classes7.dex */
public final class hnl implements Comparable<hnl>, Serializable {

    @NotNull
    public static final gnl Companion = new gnl();
    public final YearMonth a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public hnl(int i, int i2) {
        this(r1);
        try {
            YearMonth of = YearMonth.of(i, i2);
            of.getClass();
        } catch (DateTimeException e) {
            ilg.k(e);
            throw null;
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("kotlinx.datetime.YearMonth must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new k5h(11, this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(hnl hnlVar) {
        hnl hnlVar2 = hnlVar;
        hnlVar2.getClass();
        return this.a.compareTo(hnlVar2.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hnl) {
            return Intrinsics.c(this.a, ((hnl) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String format = ((DateTimeFormatter) onl.a.getValue()).format(this.a);
        format.getClass();
        return format;
    }

    public hnl(YearMonth yearMonth) {
        yearMonth.getClass();
        this.a = yearMonth;
    }
}
