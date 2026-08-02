package io.ktor.utils.io;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class d {
    public static final f a(byte[] content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return e.c(content, 0, content.length);
    }
}
