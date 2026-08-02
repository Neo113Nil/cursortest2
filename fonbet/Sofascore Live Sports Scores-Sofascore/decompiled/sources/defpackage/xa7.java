package defpackage;

import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes5.dex */
public final class xa7 {

    @NotNull
    public static final xa7 INSTANCE = new xa7();
    public static final /* synthetic */ joa a = ypa.a(ysa.b, new m97(2));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof xa7);
    }

    public final int hashCode() {
        return 82633605;
    }

    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }

    public final String toString() {
        return "Onboarding";
    }
}
