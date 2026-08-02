package c70;

import androidx.lifecycle.z0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j implements Jb.e<z0.b> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.i f56685a;

    public j(Jb.i iVar) {
        this.f56685a = iVar;
    }

    @Override // Pc.a
    public final Object get() {
        Map creators = (Map) this.f56685a.get();
        Intrinsics.checkNotNullParameter(creators, "creators");
        return new e(creators);
    }
}
