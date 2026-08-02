package defpackage;

import android.net.NetworkRequest;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nad {
    public static final /* synthetic */ int b = 0;
    public final Object a;

    static {
        rik.x("NetworkRequestCompat");
    }

    public nad(NetworkRequest networkRequest) {
        this.a = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nad) && Intrinsics.c(this.a, ((nad) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return lnb.p(new StringBuilder("NetworkRequestCompat(wrapped="), this.a, ')');
    }
}
