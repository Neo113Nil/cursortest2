package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yul implements s5m {
    public final String a;

    public yul(@Nullable String str) {
        this.a = str;
    }

    public static yul copy$default(yul yulVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = yulVar.a;
        }
        yulVar.getClass();
        return new yul(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yul) && Intrinsics.c(this.a, ((yul) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return lnb.q(new StringBuilder("Connecting(deviceName="), this.a, ')');
    }
}
