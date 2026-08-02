package defpackage;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes6.dex */
public final class hsd implements r7d {

    @NotNull
    public static final hsd INSTANCE = new hsd();
    public static final /* synthetic */ joa a = ypa.a(ysa.b, new ild(8));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof hsd);
    }

    public final int hashCode() {
        return -1390291187;
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "Intro";
    }
}
