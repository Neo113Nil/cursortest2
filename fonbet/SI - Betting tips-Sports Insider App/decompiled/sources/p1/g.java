package p1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final List f21416a;

    public g(List cubics) {
        Intrinsics.checkNotNullParameter(cubics, "cubics");
        this.f21416a = cubics;
    }

    public abstract g a(io.sentry.util.network.b bVar);
}
