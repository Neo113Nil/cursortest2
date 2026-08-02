package k90;

import T7.P;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f71144a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Map<String, String> f71145b;

    public b(String str, @NotNull Map<String, String> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f71144a = str;
        this.f71145b = data;
    }

    @NotNull
    public final Map<String, String> a() {
        return this.f71145b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f71144a, bVar.f71144a) && Intrinsics.d(this.f71145b, bVar.f71145b);
    }

    public final int hashCode() {
        String str = this.f71144a;
        return this.f71145b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RemoteMessage(messageId=");
        sb2.append(this.f71144a);
        sb2.append(", data=");
        return P.f(sb2, this.f71145b, ")");
    }
}
