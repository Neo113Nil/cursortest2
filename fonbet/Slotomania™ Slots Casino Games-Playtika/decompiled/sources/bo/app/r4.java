package bo.app;

import com.braze.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lbo/app/r4;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lbo/app/s4;", "pathType", "Lbo/app/s4;", Constants.BRAZE_PUSH_CONTENT_KEY, "()Lbo/app/s4;", "remoteUrl", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "<init>", "(Lbo/app/s4;Ljava/lang/String;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final /* data */ class r4 {
    private final s4 a;
    private final String b;

    public r4(s4 pathType, String remoteUrl) {
        Intrinsics.checkNotNullParameter(pathType, "pathType");
        Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
        this.a = pathType;
        this.b = remoteUrl;
    }

    /* renamed from: a, reason: from getter */
    public final s4 getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof r4)) {
            return false;
        }
        r4 r4Var = (r4) other;
        return this.a == r4Var.a && Intrinsics.areEqual(this.b, r4Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "RemotePath(pathType=" + this.a + ", remoteUrl=" + this.b + ')';
    }
}
