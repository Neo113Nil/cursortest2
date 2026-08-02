package Y2;

import Q2.AbstractC1508t;
import android.net.NetworkRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f13966b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final String f13967c;

    /* renamed from: a, reason: collision with root package name */
    public final Object f13968a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return y.f13967c;
        }

        public a() {
        }
    }

    static {
        String i10 = AbstractC1508t.i("NetworkRequestCompat");
        Intrinsics.checkNotNullExpressionValue(i10, "tagWithPrefix(\"NetworkRequestCompat\")");
        f13967c = i10;
    }

    public y(Object obj) {
        this.f13968a = obj;
    }

    public final NetworkRequest b() {
        return (NetworkRequest) this.f13968a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && Intrinsics.areEqual(this.f13968a, ((y) obj).f13968a);
    }

    public int hashCode() {
        Object obj = this.f13968a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "NetworkRequestCompat(wrapped=" + this.f13968a + ')';
    }

    public /* synthetic */ y(Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : obj);
    }
}
