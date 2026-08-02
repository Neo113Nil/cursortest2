package defpackage;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes.dex */
public final class ie0 {

    @NotNull
    public static final he0 Companion = new he0();
    public final String a;
    public final boolean b;

    public /* synthetic */ ie0(int i, String str, boolean z) {
        if (3 != (i & 3)) {
            oea.z(i, 3, ge0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = z;
    }

    public ie0(String str) {
        this.a = str;
        this.b = true;
    }
}
