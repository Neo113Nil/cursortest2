package io.ktor.utils.io;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class e {
    public static final c a(boolean z10) {
        return new a(z10, null, 0, 6, null);
    }

    public static /* synthetic */ c b(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return a(z10);
    }

    public static final f c(byte[] content, int i10, int i11) {
        Intrinsics.checkNotNullParameter(content, "content");
        ByteBuffer wrap = ByteBuffer.wrap(content, i10, i11);
        Intrinsics.checkNotNullExpressionValue(wrap, "wrap(content, offset, length)");
        return new a(wrap);
    }
}
