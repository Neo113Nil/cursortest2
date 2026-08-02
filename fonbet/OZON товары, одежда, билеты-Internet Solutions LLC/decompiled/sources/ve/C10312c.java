package ve;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lve/c;", "T", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lkotlin/time/b;", "duration", "<init>", "(Ljava/lang/Object;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ve.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C10312c<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f102868a;

    /* renamed from: b, reason: collision with root package name */
    private final long f102869b;

    private C10312c() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10312c(Object obj, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this.f102868a = obj;
        this.f102869b = j11;
    }

    /* renamed from: a, reason: from getter */
    public final long getF102869b() {
        return this.f102869b;
    }

    public final T b() {
        return this.f102868a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10312c)) {
            return false;
        }
        C10312c c10312c = (C10312c) obj;
        return Intrinsics.d(this.f102868a, c10312c.f102868a) && kotlin.time.b.g(this.f102869b, c10312c.f102869b);
    }

    public final int hashCode() {
        T t2 = this.f102868a;
        int hashCode = t2 == null ? 0 : t2.hashCode();
        b.Companion companion = kotlin.time.b.INSTANCE;
        return Long.hashCode(this.f102869b) + (hashCode * 31);
    }

    @NotNull
    public final String toString() {
        return "TimedValue(value=" + this.f102868a + ", duration=" + ((Object) kotlin.time.b.p(this.f102869b)) + ')';
    }
}
