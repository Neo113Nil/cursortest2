package e3;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class k0 {
    public abstract l a(String str);

    public abstract l b(String str, h0 h0Var);

    public final l c(String uniqueWorkName, o existingWorkPolicy, a0 request) {
        Intrinsics.checkNotNullParameter(uniqueWorkName, "uniqueWorkName");
        Intrinsics.checkNotNullParameter(existingWorkPolicy, "existingWorkPolicy");
        Intrinsics.checkNotNullParameter(request, "request");
        return new f3.p((f3.v) this, uniqueWorkName, existingWorkPolicy, kotlin.collections.t.c(request), 0).q0();
    }
}
