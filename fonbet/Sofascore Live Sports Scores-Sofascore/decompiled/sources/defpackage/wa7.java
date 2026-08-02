package defpackage;

import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes5.dex */
public final class wa7 {

    @NotNull
    public static final va7 Companion = new va7();
    public final int a;

    public /* synthetic */ wa7(int i, int i2) {
        if (1 == (i & 1)) {
            this.a = i2;
        } else {
            oea.z(i, 1, ua7.a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wa7) && this.a == ((wa7) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return lnb.k(this.a, "NotificationPermission(competitionId=", ")");
    }

    public wa7(int i) {
        this.a = i;
    }
}
