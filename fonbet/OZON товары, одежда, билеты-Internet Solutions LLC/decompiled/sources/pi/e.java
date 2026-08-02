package pi;

import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import oi.C8739c;
import oi.InterfaceC8742f;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class e implements l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f81097a = new e();

    @Override // pi.l
    public final InterfaceC8742f getById(String tokenId) {
        HashMap hashMap;
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        hashMap = f.f81098a;
        return (C8739c) hashMap.get(tokenId);
    }
}
