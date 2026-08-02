package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = bhb.class)
/* loaded from: classes7.dex */
public final class wgb implements Comparable<wgb>, Serializable {

    @NotNull
    public static final ugb Companion = new ugb();
    public final LocalDate a;

    static {
        LocalDate localDate = LocalDate.MIN;
        localDate.getClass();
        new wgb(localDate);
        LocalDate localDate2 = LocalDate.MAX;
        localDate2.getClass();
        new wgb(localDate2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wgb(int i, int i2, int i3) {
        this(r1);
        try {
            LocalDate of = LocalDate.of(i, i2, i3);
            of.getClass();
        } catch (DateTimeException e) {
            ilg.k(e);
            throw null;
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("kotlinx.datetime.LocalDate must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new k5h(2, this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(wgb wgbVar) {
        wgb wgbVar2 = wgbVar;
        wgbVar2.getClass();
        return this.a.compareTo((ChronoLocalDate) wgbVar2.a);
    }

    public final yuc d() {
        this.a.getMonth().getClass();
        return (yuc) yuc.b.get(r1.getValue() - 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wgb) {
            return Intrinsics.c(this.a, ((wgb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String localDate = this.a.toString();
        localDate.getClass();
        return localDate;
    }

    public wgb(LocalDate localDate) {
        localDate.getClass();
        this.a = localDate;
    }
}
