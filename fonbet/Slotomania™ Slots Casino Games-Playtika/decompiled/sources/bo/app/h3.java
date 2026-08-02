package bo.app;

import com.braze.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lbo/app/h3;", "Lbo/app/o2;", "", "toString", "", "hashCode", "", "other", "", "equals", "errorMessage", "Ljava/lang/String;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Ljava/lang/String;", "Lbo/app/a2;", "originalRequest", "Lbo/app/a2;", "b", "()Lbo/app/a2;", "<init>", "(Ljava/lang/String;Lbo/app/a2;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final /* data */ class h3 implements o2 {
    private final String a;
    private final a2 b;

    public h3(String str, a2 originalRequest) {
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.a = str;
        this.b = originalRequest;
    }

    @Override // bo.app.o2
    /* renamed from: a, reason: from getter */
    public String getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public a2 getB() {
        return this.b;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof h3)) {
            return false;
        }
        h3 h3Var = (h3) other;
        return Intrinsics.areEqual(getA(), h3Var.getA()) && Intrinsics.areEqual(getB(), h3Var.getB());
    }

    public int hashCode() {
        return ((getA() == null ? 0 : getA().hashCode()) * 31) + getB().hashCode();
    }

    public String toString() {
        return "InvalidApiKeyError(errorMessage=" + ((Object) getA()) + ", originalRequest=" + getB() + ')';
    }
}
