package io.ktor.utils.io.internal;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f49480a;

    /* renamed from: b, reason: collision with root package name */
    public static final h f49481b;

    static {
        ByteBuffer allocate = ByteBuffer.allocate(0);
        Intrinsics.checkNotNullExpressionValue(allocate, "allocate(0)");
        f49480a = allocate;
        f49481b = new h(0);
    }

    public static final ByteBuffer a() {
        return f49480a;
    }

    public static final h b() {
        return f49481b;
    }
}
