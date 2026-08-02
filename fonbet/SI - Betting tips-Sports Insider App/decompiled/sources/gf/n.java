package gf;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n extends Error {
    public n() {
        this(null, 1, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n(String message, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        super(message);
        message = (i5 & 1) != 0 ? "An operation is not implemented." : message;
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
