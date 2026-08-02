package t1;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends c {
    public e(c initialExtras) {
        Intrinsics.checkNotNullParameter(initialExtras, "initialExtras");
        LinkedHashMap initialExtras2 = initialExtras.f23740a;
        Intrinsics.checkNotNullParameter(initialExtras2, "initialExtras");
        this.f23740a.putAll(initialExtras2);
    }

    @Override // t1.c
    public final Object a(b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f23740a.get(key);
    }

    public final void b(b key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f23740a.put(key, obj);
    }

    public /* synthetic */ e(int i5) {
        this(a.f23739b);
    }
}
