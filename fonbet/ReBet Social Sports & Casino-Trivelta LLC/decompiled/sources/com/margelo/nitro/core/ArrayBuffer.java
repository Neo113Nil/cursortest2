package com.margelo.nitro.core;

import android.hardware.HardwareBuffer;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import com.facebook.jni.HybridData;
import com.margelo.nitro.utils.HardwareBufferUtils;
import dalvik.annotation.optimization.FastNative;
import h8.InterfaceC4488a;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC4488a
@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u000e\b\u0007\u0018\u0000 /2\u00020\u0001:\u00010B\u0011\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB\u0011\b\u0013\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0011\u001a\u00020\t2\n\u0010\u0010\u001a\u00060\u0001j\u0002`\u000fH\u0083 ¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0082 ¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0017\u001a\u00060\u0001j\u0002`\u000fH\u0082 ¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0013H\u0083 ¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013H\u0083 ¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0013H\u0083 ¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u001dH\u0083 ¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b \u0010\u0016J\u000f\u0010!\u001a\u00020\u0006H\u0007¢\u0006\u0004\b!\u0010\"J\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0000¢\u0006\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0011\u0010*\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b*\u0010\u001aR\u0011\u0010+\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b+\u0010\u001aR\u0011\u0010,\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b,\u0010\u001aR\u0011\u0010.\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b-\u0010\u001f¨\u00061"}, d2 = {"Lcom/margelo/nitro/core/ArrayBuffer;", "", "Ljava/nio/ByteBuffer;", "byteBuffer", "<init>", "(Ljava/nio/ByteBuffer;)V", "Landroid/hardware/HardwareBuffer;", "hardwareBuffer", "(Landroid/hardware/HardwareBuffer;)V", "Lcom/facebook/jni/HybridData;", "hybridData", "(Lcom/facebook/jni/HybridData;)V", "buffer", "initHybrid", "(Ljava/nio/ByteBuffer;)Lcom/facebook/jni/HybridData;", "Lcom/margelo/nitro/core/BoxedHardwareBuffer;", "hardwareBufferBoxed", "initHybridBoxedHardwareBuffer", "(Ljava/lang/Object;)Lcom/facebook/jni/HybridData;", "", "copyIfNeeded", "getByteBuffer", "(Z)Ljava/nio/ByteBuffer;", "getHardwareBufferBoxed", "()Ljava/lang/Object;", "getIsOwner", "()Z", "getIsByteBuffer", "getIsHardwareBuffer", "", "getBufferSize", "()I", "getBuffer", "getHardwareBuffer", "()Landroid/hardware/HardwareBuffer;", "", "toByteArray", "()[B", "asOwning", "()Lcom/margelo/nitro/core/ArrayBuffer;", "mHybridData", "Lcom/facebook/jni/HybridData;", "isOwner", "isByteBuffer", "isHardwareBuffer", "getSize", "size", "Companion", "a", "react-native-nitro-modules_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ArrayBuffer {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final HybridData mHybridData;

    /* renamed from: com.margelo.nitro.core.ArrayBuffer$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ArrayBuffer a(HardwareBuffer hardwareBuffer) {
            Intrinsics.checkNotNullParameter(hardwareBuffer, "hardwareBuffer");
            return new ArrayBuffer(HardwareBufferUtils.INSTANCE.a(hardwareBuffer));
        }

        public final ArrayBuffer b(ArrayBuffer other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (Build.VERSION.SDK_INT >= 26 && other.isHardwareBuffer()) {
                try {
                    return a(other.getHardwareBuffer());
                } catch (Throwable th2) {
                    Log.w("ArrayBuffer", "Failed to copy HardwareBuffer, falling back to ByteBuffer copy...", th2);
                }
            }
            return c(other.getBuffer(false));
        }

        public final ArrayBuffer c(ByteBuffer byteBuffer) {
            Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
            byteBuffer.rewind();
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteBuffer.remaining());
            allocateDirect.put(byteBuffer);
            allocateDirect.rewind();
            byteBuffer.rewind();
            Intrinsics.checkNotNull(allocateDirect);
            return new ArrayBuffer(allocateDirect);
        }

        public Companion() {
        }
    }

    public ArrayBuffer(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
        if (!byteBuffer.isDirect()) {
            throw new Error("ArrayBuffers can only be created from direct ByteBuffers, and the given ByteBuffer is not direct!");
        }
        this.mHybridData = initHybrid(byteBuffer);
    }

    @FastNative
    private final native int getBufferSize();

    private final native ByteBuffer getByteBuffer(boolean copyIfNeeded);

    private final native Object getHardwareBufferBoxed();

    @FastNative
    private final native boolean getIsByteBuffer();

    @FastNative
    private final native boolean getIsHardwareBuffer();

    @FastNative
    private final native boolean getIsOwner();

    private final native HybridData initHybrid(ByteBuffer buffer);

    private final native HybridData initHybridBoxedHardwareBuffer(Object hardwareBufferBoxed);

    @NotNull
    public final ArrayBuffer asOwning() {
        return !isOwner() ? INSTANCE.b(this) : this;
    }

    @NotNull
    public final ByteBuffer getBuffer(boolean copyIfNeeded) {
        return getByteBuffer(copyIfNeeded);
    }

    @NotNull
    public final HardwareBuffer getHardwareBuffer() {
        Object hardwareBufferBoxed = getHardwareBufferBoxed();
        Intrinsics.checkNotNull(hardwareBufferBoxed, "null cannot be cast to non-null type android.hardware.HardwareBuffer");
        return b.a(hardwareBufferBoxed);
    }

    public final int getSize() {
        return getBufferSize();
    }

    public final boolean isByteBuffer() {
        return getIsByteBuffer();
    }

    public final boolean isHardwareBuffer() {
        return getIsHardwareBuffer();
    }

    public final boolean isOwner() {
        return getIsOwner();
    }

    @NotNull
    public final byte[] toByteArray() {
        ByteBuffer buffer = getBuffer(false);
        if (buffer.hasArray()) {
            byte[] array = buffer.array();
            if (array.length == getSize()) {
                Intrinsics.checkNotNull(array);
                return array;
            }
        }
        ByteBuffer allocate = ByteBuffer.allocate(buffer.capacity());
        allocate.put(buffer);
        byte[] array2 = allocate.array();
        Intrinsics.checkNotNullExpressionValue(array2, "array(...)");
        return array2;
    }

    public ArrayBuffer(@NotNull HardwareBuffer hardwareBuffer) {
        boolean isClosed;
        Intrinsics.checkNotNullParameter(hardwareBuffer, "hardwareBuffer");
        isClosed = hardwareBuffer.isClosed();
        if (!isClosed) {
            this.mHybridData = initHybridBoxedHardwareBuffer(hardwareBuffer);
            return;
        }
        throw new Error("Cannot create ArrayBuffer from an already-closed HardwareBuffer!");
    }

    @InterfaceC4488a
    @Keep
    private ArrayBuffer(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
