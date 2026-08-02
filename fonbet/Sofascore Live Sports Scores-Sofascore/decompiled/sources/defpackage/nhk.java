package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.ZoneOffset;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = whk.class)
/* loaded from: classes7.dex */
public final class nhk implements Serializable {

    @NotNull
    public static final mhk Companion = new mhk();
    public final ZoneOffset a;

    static {
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        zoneOffset.getClass();
        new nhk(zoneOffset);
    }

    public nhk(ZoneOffset zoneOffset) {
        zoneOffset.getClass();
        this.a = zoneOffset;
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("kotlinx.datetime.UtcOffset must be deserialized via kotlinx.datetime.Ser");
    }

    private final Object writeReplace() {
        return new k5h(10, this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nhk) {
            return Intrinsics.c(this.a, ((nhk) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String zoneOffset = this.a.toString();
        zoneOffset.getClass();
        return zoneOffset;
    }
}
