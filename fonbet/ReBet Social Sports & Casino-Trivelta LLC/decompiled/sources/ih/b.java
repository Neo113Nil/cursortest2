package ih;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b implements InterfaceC4548a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f49148a = new b();

    @Override // ih.InterfaceC4548a
    public void a(ByteBuffer instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @Override // ih.InterfaceC4548a
    public ByteBuffer b(int i10) {
        ByteBuffer allocate = ByteBuffer.allocate(i10);
        Intrinsics.checkNotNullExpressionValue(allocate, "allocate(size)");
        return c.b(allocate);
    }
}
