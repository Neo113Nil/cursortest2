package nh;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class d0 extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final b f20937a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(b errorCode) {
        super("stream was reset: " + errorCode);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f20937a = errorCode;
    }
}
