package ih;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f49149a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final ByteBuffer f49150b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ByteBuffer a() {
            return c.f49150b;
        }

        public a() {
        }
    }

    static {
        ByteBuffer order = ByteBuffer.allocate(0).order(ByteOrder.BIG_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(order, "allocate(0).order(ByteOrder.BIG_ENDIAN)");
        f49150b = b(order);
    }

    public static ByteBuffer b(ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        return buffer;
    }

    public static final void c(ByteBuffer byteBuffer, ByteBuffer destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (byteBuffer.hasArray() && destination.hasArray() && !byteBuffer.isReadOnly() && !destination.isReadOnly()) {
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + i10, destination.array(), destination.arrayOffset() + i12, i11);
            return;
        }
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(i10);
        duplicate.limit(i10 + i11);
        ByteBuffer duplicate2 = destination.duplicate();
        duplicate2.position(i12);
        duplicate2.put(duplicate);
    }

    public static final ByteBuffer d(ByteBuffer byteBuffer, int i10, int i11) {
        return b(d.d(byteBuffer, i10, i11));
    }
}
