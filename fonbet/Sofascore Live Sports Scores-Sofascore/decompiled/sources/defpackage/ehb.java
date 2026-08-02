package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = ihb.class)
/* loaded from: classes7.dex */
public final class ehb implements Comparable<ehb>, Serializable {

    @NotNull
    public static final chb Companion = new chb();
    public final LocalDateTime a;

    static {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        localDateTime.getClass();
        new ehb(localDateTime);
        LocalDateTime localDateTime2 = LocalDateTime.MAX;
        localDateTime2.getClass();
        new ehb(localDateTime2);
    }

    public ehb(wgb wgbVar, whb whbVar) {
        LocalDateTime of = LocalDateTime.of(wgbVar.a, whbVar.a);
        of.getClass();
        this.a = of;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("kotlinx.datetime.LocalDateTime must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new k5h(4, this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(ehb ehbVar) {
        ehb ehbVar2 = ehbVar;
        ehbVar2.getClass();
        return this.a.compareTo((ChronoLocalDateTime<?>) ehbVar2.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ehb) {
            return Intrinsics.c(this.a, ((ehb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String localDateTime = this.a.toString();
        localDateTime.getClass();
        return localDateTime;
    }

    public ehb(LocalDateTime localDateTime) {
        localDateTime.getClass();
        this.a = localDateTime;
    }
}
