package bo.app;

import com.braze.models.IPutIntoJson;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ye implements IPutIntoJson {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f26326a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26327b;

    public ye(UUID sessionIdUuid) {
        Intrinsics.checkNotNullParameter(sessionIdUuid, "sessionIdUuid");
        this.f26326a = sessionIdUuid;
        String uuid = sessionIdUuid.toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        this.f26327b = uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ye) && Intrinsics.areEqual(this.f26326a, ((ye) obj).f26326a);
    }

    @Override // com.braze.models.IPutIntoJson
    public final Object forJsonPut() {
        return this.f26327b;
    }

    public final int hashCode() {
        return this.f26326a.hashCode();
    }

    public final String toString() {
        return this.f26327b;
    }
}
