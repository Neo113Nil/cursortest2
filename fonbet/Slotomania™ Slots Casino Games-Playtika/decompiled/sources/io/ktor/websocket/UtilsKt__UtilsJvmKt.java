package io.ktor.websocket;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UtilsJvm.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\b\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ljava/nio/ByteBuffer;", "other", "", "xor", "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;)V", "", "getOUTGOING_CHANNEL_CAPACITY", "()I", "OUTGOING_CHANNEL_CAPACITY", "ktor-websockets"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "io/ktor/websocket/UtilsKt")
/* loaded from: classes8.dex */
final /* synthetic */ class UtilsKt__UtilsJvmKt {
    public static final void xor(ByteBuffer byteBuffer, ByteBuffer other) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        ByteBuffer slice = byteBuffer.slice();
        ByteBuffer slice2 = other.slice();
        int remaining = slice2.remaining();
        int remaining2 = slice.remaining();
        for (int i = 0; i < remaining2; i++) {
            slice.put(i, (byte) (slice.get(i) ^ slice2.get(i % remaining)));
        }
    }

    public static final int getOUTGOING_CHANNEL_CAPACITY() {
        String property = System.getProperty("io.ktor.websocket.outgoingChannelCapacity");
        if (property != null) {
            return Integer.parseInt(property);
        }
        return 8;
    }
}
