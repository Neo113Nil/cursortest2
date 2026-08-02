package nm0;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, String> f77419a;

    public q(Map eventData) {
        Intrinsics.checkNotNullParameter("sdkInfo", "eventName");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        this.f77419a = eventData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        qVar.getClass();
        return Intrinsics.d(this.f77419a, qVar.f77419a);
    }

    public final int hashCode() {
        return this.f77419a.hashCode() + 249895160;
    }

    public final String toString() {
        return "ReviewAnalyticsEvent(eventName=sdkInfo, eventData=" + this.f77419a + ')';
    }
}
