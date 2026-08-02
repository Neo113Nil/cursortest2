package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes.dex */
public final class wf5 {

    @NotNull
    public static final vf5 Companion = new vf5();
    public static final joa[] c = {null, ypa.a(ysa.b, zg3.n)};
    public final String a;
    public final Set b;

    public /* synthetic */ wf5(int i, String str, Set set) {
        if (3 != (i & 3)) {
            oea.z(i, 3, uf5.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof wf5) && Intrinsics.c(((wf5) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
