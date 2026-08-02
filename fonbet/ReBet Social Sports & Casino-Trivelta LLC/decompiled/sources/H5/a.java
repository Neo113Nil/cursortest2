package H5;

import Q5.k;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4799a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static k f4800b = k.a.f9435b;

    public final String a() {
        k kVar = f4800b;
        if (Intrinsics.areEqual(kVar, k.a.f9435b)) {
            return "2.9.5";
        }
        if (!(kVar instanceof k.b)) {
            throw new NoWhenBranchMatchedException();
        }
        k kVar2 = f4800b;
        Intrinsics.checkNotNull(kVar2, "null cannot be cast to non-null type com.coralogix.android.sdk.model.Framework.HybridFramework");
        return ((k.b) kVar2).b();
    }

    public final k b() {
        return f4800b;
    }

    public final boolean c() {
        return !(f4800b instanceof k.b);
    }

    public final String d() {
        if (c()) {
            return null;
        }
        return "2.9.5";
    }

    public final void e(k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "<set-?>");
        f4800b = kVar;
    }
}
