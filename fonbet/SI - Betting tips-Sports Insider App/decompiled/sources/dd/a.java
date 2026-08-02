package dd;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import m3.f;
import rc.b0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f8365d;

    public a() {
        super(6);
        this.f8365d = new WeakReference(new b0());
    }

    public final b0 w() {
        b0 b0Var = (b0) this.f8365d.get();
        if (b0Var != null) {
            return b0Var;
        }
        WeakReference weakReference = new WeakReference(new b0());
        this.f8365d = weakReference;
        Object obj = weakReference.get();
        Intrinsics.checkNotNull(obj);
        return (b0) obj;
    }
}
