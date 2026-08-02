package ih;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class d {
    public static final void a(ByteBuffer copyTo, ByteBuffer destination, int i10) {
        Intrinsics.checkNotNullParameter(copyTo, "$this$copyTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        int remaining = destination.remaining();
        if (copyTo.hasArray() && !copyTo.isReadOnly() && destination.hasArray() && !destination.isReadOnly()) {
            int position = destination.position();
            System.arraycopy(copyTo.array(), copyTo.arrayOffset() + i10, destination.array(), destination.arrayOffset() + position, remaining);
            destination.position(position + remaining);
        } else {
            ByteBuffer duplicate = copyTo.duplicate();
            duplicate.limit(remaining + i10);
            duplicate.position(i10);
            destination.put(duplicate);
        }
    }

    public static final void b(ByteBuffer copyTo, byte[] destination, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(copyTo, "$this$copyTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (!copyTo.hasArray() || copyTo.isReadOnly()) {
            copyTo.duplicate().get(destination, i12, i11);
        } else {
            System.arraycopy(copyTo.array(), copyTo.arrayOffset() + i10, destination, i12, i11);
        }
    }

    public static final void c(ByteBuffer copyTo, ByteBuffer destination, int i10) {
        Intrinsics.checkNotNullParameter(copyTo, "$this$copyTo");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (!copyTo.hasArray() || copyTo.isReadOnly()) {
            d(destination, i10, copyTo.remaining()).put(copyTo);
            return;
        }
        byte[] array = copyTo.array();
        Intrinsics.checkNotNullExpressionValue(array, "array()");
        int arrayOffset = copyTo.arrayOffset() + copyTo.position();
        int remaining = copyTo.remaining();
        ByteBuffer order = ByteBuffer.wrap(array, arrayOffset, remaining).slice().order(ByteOrder.BIG_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(order, "wrap(this, offset, lengt…der(ByteOrder.BIG_ENDIAN)");
        c.c(c.b(order), destination, 0, remaining, i10);
        copyTo.position(copyTo.limit());
    }

    public static final ByteBuffer d(ByteBuffer byteBuffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        ByteBuffer myDuplicate$lambda$1 = byteBuffer.duplicate();
        Intrinsics.checkNotNullExpressionValue(myDuplicate$lambda$1, "myDuplicate$lambda$1");
        myDuplicate$lambda$1.position(i10);
        myDuplicate$lambda$1.limit(i10 + i11);
        ByteBuffer mySlice$lambda$2 = myDuplicate$lambda$1.slice();
        Intrinsics.checkNotNullExpressionValue(mySlice$lambda$2, "mySlice$lambda$2");
        return mySlice$lambda$2;
    }
}
