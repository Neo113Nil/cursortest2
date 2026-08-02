package y50;

import androidx.lifecycle.z0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: y50.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10844f implements Jb.e<z0.b> {

    /* renamed from: a, reason: collision with root package name */
    private final Jb.i f106016a;

    public C10844f(Jb.i iVar) {
        this.f106016a = iVar;
    }

    @Override // Pc.a
    public final Object get() {
        Map creators = (Map) this.f106016a.get();
        Intrinsics.checkNotNullParameter(creators, "creators");
        return new C10842d(creators);
    }
}
