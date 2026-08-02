package cg;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class h extends IllegalArgumentException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String msg, int i5) {
        super(msg);
        switch (i5) {
            case 1:
                Intrinsics.checkNotNullParameter(msg, "msg");
                super(msg);
                break;
            default:
                Intrinsics.checkNotNullParameter(msg, "message");
                break;
        }
    }
}
