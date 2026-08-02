package mh;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: mh.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5588d extends AbstractC5587c {

    /* renamed from: g, reason: collision with root package name */
    public final int f56613g;

    public C5588d(int i10, int i11) {
        super(i10);
        this.f56613g = i11;
    }

    @Override // mh.AbstractC5587c
    /* renamed from: m1, reason: merged with bridge method [inline-methods] */
    public ByteBuffer r(ByteBuffer instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        instance.clear();
        instance.order(ByteOrder.BIG_ENDIAN);
        return instance;
    }

    @Override // mh.AbstractC5587c
    /* renamed from: n1, reason: merged with bridge method [inline-methods] */
    public ByteBuffer U() {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.f56613g);
        Intrinsics.checkNotNull(allocateDirect);
        return allocateDirect;
    }

    @Override // mh.AbstractC5587c
    /* renamed from: y1, reason: merged with bridge method [inline-methods] */
    public void D0(ByteBuffer instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (instance.capacity() != this.f56613g) {
            throw new IllegalStateException("Check failed.");
        }
        if (!instance.isDirect()) {
            throw new IllegalStateException("Check failed.");
        }
    }
}
