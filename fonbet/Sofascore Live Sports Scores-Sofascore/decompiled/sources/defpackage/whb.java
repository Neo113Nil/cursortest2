package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.LocalTime;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = aib.class)
/* loaded from: classes7.dex */
public final class whb implements Comparable<whb>, Serializable {

    @NotNull
    public static final vhb Companion = new vhb();
    public final LocalTime a;

    static {
        LocalTime localTime = LocalTime.MIN;
        localTime.getClass();
        new whb(localTime);
        LocalTime localTime2 = LocalTime.MAX;
        localTime2.getClass();
        new whb(localTime2);
    }

    public whb(LocalTime localTime) {
        localTime.getClass();
        this.a = localTime;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("kotlinx.datetime.LocalTime must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new k5h(3, this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(whb whbVar) {
        whb whbVar2 = whbVar;
        whbVar2.getClass();
        return this.a.compareTo(whbVar2.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof whb) {
            return Intrinsics.c(this.a, ((whb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String localTime = this.a.toString();
        localTime.getClass();
        return localTime;
    }
}
