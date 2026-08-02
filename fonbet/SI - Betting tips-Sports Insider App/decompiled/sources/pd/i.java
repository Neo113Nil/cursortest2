package pd;

import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements FunctionAdapter {
    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        return Intrinsics.areEqual(p.f21786a, ((FunctionAdapter) obj).getFunctionDelegate());
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return p.f21786a;
    }

    public final int hashCode() {
        return p.f21786a.hashCode();
    }
}
