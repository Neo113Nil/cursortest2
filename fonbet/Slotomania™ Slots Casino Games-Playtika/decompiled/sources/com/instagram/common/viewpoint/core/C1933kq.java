package com.instagram.common.viewpoint.core;

import java.io.ByteArrayInputStream;

/* renamed from: com.facebook.ads.redexgen.X.kq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1933kq implements InterfaceC0913Ll {
    public ByteArrayInputStream A00;
    public final byte[] A01;

    public C1933kq(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0913Ll
    public final void AGj(int i) throws C1930kn {
        this.A00 = new ByteArrayInputStream(this.A01);
        this.A00.skip(i);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0913Ll
    public final void close() throws C1930kn {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0913Ll
    public final int length() throws C1930kn {
        return this.A01.length;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0913Ll
    public final int read(byte[] bArr) throws C1930kn {
        return this.A00.read(bArr, 0, bArr.length);
    }
}
