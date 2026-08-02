package em0;

import com.vk.push.core.push.RegisterForPushesResult;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: em0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6382a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final RegisterForPushesResult f62393a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final Za.a f62394b;

    public C6382a(@NotNull RegisterForPushesResult innerResult, @NotNull Za.a host) {
        Intrinsics.checkNotNullParameter(innerResult, "innerResult");
        Intrinsics.checkNotNullParameter(host, "host");
        this.f62393a = innerResult;
        this.f62394b = host;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6382a)) {
            return false;
        }
        C6382a c6382a = (C6382a) obj;
        return this.f62393a == c6382a.f62393a && Intrinsics.d(this.f62394b, c6382a.f62394b);
    }

    public final int hashCode() {
        return this.f62394b.hashCode() + (this.f62393a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "RegisterResult(innerResult=" + this.f62393a + ", host=" + this.f62394b + ')';
    }
}
