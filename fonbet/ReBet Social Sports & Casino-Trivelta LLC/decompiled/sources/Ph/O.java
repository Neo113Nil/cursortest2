package Ph;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class O extends AbstractCoroutineContextElement {

    /* renamed from: b, reason: collision with root package name */
    public static final a f9043b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f9044a;

    public static final class a implements CoroutineContext.Key {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public O(String str) {
        super(f9043b);
        this.f9044a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof O) && Intrinsics.areEqual(this.f9044a, ((O) obj).f9044a);
    }

    public int hashCode() {
        return this.f9044a.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f9044a + ')';
    }
}
