package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wc {

    /* renamed from: a, reason: collision with root package name */
    public final xc f26201a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26202b;

    public wc(xc pathType, String remoteUrl) {
        Intrinsics.checkNotNullParameter(pathType, "pathType");
        Intrinsics.checkNotNullParameter(remoteUrl, "remoteUrl");
        this.f26201a = pathType;
        this.f26202b = remoteUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wc)) {
            return false;
        }
        wc wcVar = (wc) obj;
        return this.f26201a == wcVar.f26201a && Intrinsics.areEqual(this.f26202b, wcVar.f26202b);
    }

    public final int hashCode() {
        return this.f26202b.hashCode() + (this.f26201a.hashCode() * 31);
    }

    public final String toString() {
        return "RemotePath(pathType=" + this.f26201a + ", remoteUrl=" + this.f26202b + ")";
    }
}
