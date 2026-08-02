package y50;

import androidx.lifecycle.z0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l implements Jb.e<z0.b> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.i f106020a;

    public l(Jb.i iVar) {
        this.f106020a = iVar;
    }

    @Override // Pc.a
    public final Object get() {
        Map creators = (Map) this.f106020a.get();
        Intrinsics.checkNotNullParameter(creators, "creators");
        return new j(creators);
    }
}
