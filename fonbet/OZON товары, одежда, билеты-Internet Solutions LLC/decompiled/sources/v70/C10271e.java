package v70;

import Jb.i;
import androidx.lifecycle.z0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v70.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10271e implements Jb.e<z0.b> {

    /* renamed from: a, reason: collision with root package name */
    private final i f102512a;

    public C10271e(i iVar) {
        this.f102512a = iVar;
    }

    @Override // Pc.a
    public final Object get() {
        Map creators = (Map) this.f102512a.get();
        Intrinsics.checkNotNullParameter(creators, "creators");
        return new C10270d(creators);
    }
}
