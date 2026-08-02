package c;

import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: c.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2466s0 extends Lambda implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public static final C2466s0 f26672d = new C2466s0();

    public C2466s0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
        return format;
    }
}
