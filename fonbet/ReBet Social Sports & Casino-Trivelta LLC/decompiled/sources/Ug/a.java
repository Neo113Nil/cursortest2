package Ug;

import io.ktor.utils.io.f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a extends Og.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Ng.a client, f content, Og.b originCall) {
        super(client);
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(originCall, "originCall");
        i(new c(this, originCall.e()));
        j(new d(this, content, originCall.f()));
    }
}
