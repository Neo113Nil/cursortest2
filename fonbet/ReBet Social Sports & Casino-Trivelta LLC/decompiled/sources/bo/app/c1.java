package bo.app;

import com.braze.models.IPutIntoJson;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c1 implements IPutIntoJson {

    /* renamed from: a, reason: collision with root package name */
    public final String f25307a;

    public c1(String apiKey) {
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        this.f25307a = apiKey;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1) && Intrinsics.areEqual(this.f25307a, ((c1) obj).f25307a);
    }

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        return this.f25307a;
    }

    public final int hashCode() {
        return this.f25307a.hashCode();
    }

    public final String toString() {
        return this.f25307a;
    }
}
