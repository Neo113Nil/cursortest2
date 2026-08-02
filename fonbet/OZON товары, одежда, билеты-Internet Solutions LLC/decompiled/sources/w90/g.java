package w90;

import Jb.i;
import androidx.lifecycle.z0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g implements Jb.e<z0.b> {

    /* renamed from: a, reason: collision with root package name */
    private final i f103692a;

    public g(i iVar) {
        this.f103692a = iVar;
    }

    @Override // Pc.a
    public final Object get() {
        Map creators = (Map) this.f103692a.get();
        Intrinsics.checkNotNullParameter(creators, "creators");
        return new e(creators);
    }
}
