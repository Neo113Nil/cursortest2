package c;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public static final Ac.g f26450a = new Ac.g(null);

    /* renamed from: b, reason: collision with root package name */
    public static final K f26451b = new K();

    public K() {
        Intrinsics.checkNotNullParameter("dd30c492-0643-4b4b-9113-13928dbad6ec", "projectId");
        Intrinsics.checkNotNullParameter("vg97bIXlFtRTp00yz18yvXuRAV0C4MSVfIXh5cX4", "apiKey");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof K) && Intrinsics.areEqual("dd30c492-0643-4b4b-9113-13928dbad6ec", "dd30c492-0643-4b4b-9113-13928dbad6ec") && Intrinsics.areEqual("vg97bIXlFtRTp00yz18yvXuRAV0C4MSVfIXh5cX4", "vg97bIXlFtRTp00yz18yvXuRAV0C4MSVfIXh5cX4");
    }

    public final int hashCode() {
        return 1476921473;
    }

    public final String toString() {
        return "VerisoulCredentials(projectId=dd30c492-0643-4b4b-9113-13928dbad6ec, apiKey=vg97bIXlFtRTp00yz18yvXuRAV0C4MSVfIXh5cX4)";
    }
}
