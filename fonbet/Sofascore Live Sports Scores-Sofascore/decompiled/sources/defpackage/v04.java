package defpackage;

import com.appsflyer.internal.i;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class v04 {
    public final List a;

    public v04(xbb xbbVar) {
        xbbVar.getClass();
        this.a = xbbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v04) && Intrinsics.c(this.a, ((v04) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return i.i("RunsPerOverGraphData(innings=", ")", this.a);
    }
}
