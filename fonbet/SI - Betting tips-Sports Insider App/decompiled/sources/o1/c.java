package o1;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.d0;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final c f21088c = new c(g0.f19206a, n0.c());

    /* renamed from: a, reason: collision with root package name */
    public final Set f21089a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f21090b;

    public c(g0 flags, f0 allowedViolations) {
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(allowedViolations, "allowedViolations");
        this.f21089a = flags;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        allowedViolations.getClass();
        g0.f19206a.getClass();
        d0.f19200a.getClass();
        this.f21090b = linkedHashMap;
    }
}
