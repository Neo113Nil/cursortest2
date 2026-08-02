package e40;

import B90.C2618u;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<String> f61998a;

    public b(@NotNull List<String> phones) {
        Intrinsics.checkNotNullParameter(phones, "phones");
        this.f61998a = phones;
    }

    @NotNull
    public final List<String> a() {
        return this.f61998a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && Intrinsics.d(this.f61998a, ((b) obj).f61998a);
    }

    public final int hashCode() {
        return this.f61998a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C2618u.h(new StringBuilder("PhoneScannerResult(phones="), this.f61998a, ")");
    }
}
