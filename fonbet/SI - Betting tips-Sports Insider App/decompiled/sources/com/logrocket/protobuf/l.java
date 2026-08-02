package com.logrocket.protobuf;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class l extends k {
    public final ByteBuffer j;

    /* renamed from: k, reason: collision with root package name */
    public final int f6744k;

    public l(ByteBuffer byteBuffer) {
        super(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), byteBuffer.remaining());
        this.j = byteBuffer;
        this.f6744k = byteBuffer.position();
    }

    @Override // com.logrocket.protobuf.k, com.logrocket.protobuf.p
    public final void r() {
        this.j.position(s() + this.f6744k);
    }
}
