package io.ktor.utils.io.jvm.javaio;

import Ph.L;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i extends L {

    /* renamed from: b, reason: collision with root package name */
    public static final i f49522b = new i();

    @Override // Ph.L
    public void Y1(CoroutineContext context, Runnable block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        block.run();
    }

    @Override // Ph.L
    public boolean a2(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return true;
    }
}
