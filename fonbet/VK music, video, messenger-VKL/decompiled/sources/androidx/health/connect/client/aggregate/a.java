package androidx.health.connect.client.aggregate;

import androidx.health.connect.client.aggregate.AggregateMetric;
import java.time.Duration;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.epx;
import xsna.g0t;
import xsna.xzs;

/* compiled from: AggregateMetric.kt */
/* loaded from: classes12.dex */
public final /* synthetic */ class a implements AggregateMetric.b.InterfaceC0035b, g0t {
    public static final a b = new a();

    public final boolean equals(Object obj) {
        if ((obj instanceof AggregateMetric.b.InterfaceC0035b) && (obj instanceof g0t)) {
            return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // xsna.g0t
    public final xzs<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, Duration.class, "ofMillis", "ofMillis(J)Ljava/time/Duration;", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        return Duration.ofMillis(((Number) obj).longValue());
    }
}
