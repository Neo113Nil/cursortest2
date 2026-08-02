package com.instagram.common.viewpoint.core;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.facebook.ads.redexgen.X.oQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2140oQ implements InterfaceC04653k {
    public boolean A04;
    public ByteBuffer A02 = InterfaceC04653k.A00;
    public ByteBuffer A03 = InterfaceC04653k.A00;
    public C04633i A00 = C04633i.A05;
    public C04633i A01 = C04633i.A05;
    public C04633i A05 = C04633i.A05;
    public C04633i A06 = C04633i.A05;

    public abstract C04633i A09(C04633i c04633i) throws C04643j;

    public final ByteBuffer A00(int i) {
        if (this.A02.capacity() < i) {
            this.A02 = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.A02.clear();
        }
        this.A03 = this.A02;
        return this.A02;
    }

    public final boolean A01() {
        return this.A03.hasRemaining();
    }

    public void A0A() {
    }

    public void A0B() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC04653k
    public final C04633i A57(C04633i c04633i) throws C04643j {
        this.A00 = c04633i;
        this.A01 = A09(c04633i);
        return AAL() ? this.A01 : C04633i.A05;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC04653k
    public ByteBuffer A8d() {
        ByteBuffer byteBuffer = this.A03;
        ByteBuffer outputBuffer = InterfaceC04653k.A00;
        this.A03 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC04653k
    public boolean AAL() {
        return this.A01 != C04633i.A05;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC04653k
    public boolean AAP() {
        return this.A04 && this.A03 == InterfaceC04653k.A00;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC04653k
    public final void AHG() {
        this.A04 = true;
        A0B();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC04653k
    public final void flush() {
        this.A03 = InterfaceC04653k.A00;
        this.A04 = false;
        this.A05 = this.A00;
        this.A06 = this.A01;
        A0A();
    }
}
