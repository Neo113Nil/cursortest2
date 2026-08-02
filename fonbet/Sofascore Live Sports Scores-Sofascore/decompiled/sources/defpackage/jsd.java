package defpackage;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes6.dex */
public final class jsd implements r7d {

    @NotNull
    public static final jsd INSTANCE = new jsd();
    public static final /* synthetic */ joa a = ypa.a(ysa.b, new ild(10));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jsd);
    }

    public final int hashCode() {
        return -1763767268;
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "SelectFavorites";
    }
}
