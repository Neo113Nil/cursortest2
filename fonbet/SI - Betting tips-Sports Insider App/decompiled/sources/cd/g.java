package cd;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import rc.b0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g extends m3.f {

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f3769d;

    public final b0 w() {
        b0 b0Var = (b0) this.f3769d.get();
        if (b0Var != null) {
            return b0Var;
        }
        WeakReference weakReference = new WeakReference(new b0());
        this.f3769d = weakReference;
        Object obj = weakReference.get();
        Intrinsics.checkNotNull(obj);
        return (b0) obj;
    }
}
