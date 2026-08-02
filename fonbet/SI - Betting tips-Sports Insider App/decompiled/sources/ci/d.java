package ci;

import a2.l;
import androidx.appcompat.widget.a0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class d extends b {

    /* renamed from: b, reason: collision with root package name */
    public Object f3947b;

    @Override // ci.b
    public final Object a(a0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object obj = this.f3947b;
        if (obj == null) {
            return super.a(context);
        }
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Single instance created couldn't return value");
    }

    @Override // ci.b
    public final Object b(a0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        l block = new l(2, this, context);
        Intrinsics.checkNotNullParameter(this, "lock");
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (this) {
            block.invoke();
        }
        Object obj = this.f3947b;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Single instance created couldn't return value");
    }
}
