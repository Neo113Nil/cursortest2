package v80;

import Jb.i;
import androidx.lifecycle.z0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f implements Jb.e<z0.b> {

    /* renamed from: a, reason: collision with root package name */
    private final i f102564a;

    public f(i iVar) {
        this.f102564a = iVar;
    }

    @Override // Pc.a
    public final Object get() {
        Map creators = (Map) this.f102564a.get();
        Intrinsics.checkNotNullParameter(creators, "creators");
        return new C10277d(creators);
    }
}
