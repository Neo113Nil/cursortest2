package g;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: g.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6596h extends AbstractC7737t implements Function0<Integer> {

    /* renamed from: b, reason: collision with root package name */
    public static final C6596h f63668b = new C6596h(0);

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(kotlin.random.c.INSTANCE.e(2147418112) + 65536);
    }
}
