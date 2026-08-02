package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class AQ implements InterfaceC3148pF {
    public static String[] A04 = {"fHQEiP1zlTMmcDhuRJvCUYhlqM3A1WdS", "0xjR5o24wRXCnK6P48nvJnLVp1A7yIdC", "SqWyKblZmsOi3mnFjBlOyIvINI4fuoz1", "GUT90kd8g0iIA", "yfLAFjbfQv", "f1jCtkpjn8LmH02gI7EE0X95Og8KENXi", "pIy67q2NMZ", "VUF0F4IbO37j7MJUWX75PYUeN7L9nYYd"};
    public int A00;
    public C14725i A01;
    public final ArrayList<InterfaceC14835t> A02 = new ArrayList<>(1);
    public final boolean A03;

    @Override // com.facebook.ads.redexgen.core.InterfaceC3148pF
    public /* synthetic */ Map A8t() {
        return C5X.A00(this);
    }

    public AQ(boolean z) {
        this.A03 = z;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    @MetaExoPlayerCustomization
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void A0D(C14725i c14725i, boolean z) {
        this.A01 = c14725i;
        for (int i = 0; i < i; i++) {
            this.A02.get(i).AGH(this, c14725i, this.A03, z);
        }
    }

    public final void A0E() {
        C14725i c14725i = (C14725i) C5C.A0f(this.A01);
        for (int i = 0; i < this.A00; i++) {
            this.A02.get(i).AGG(this, c14725i, this.A03);
        }
        this.A01 = null;
    }

    public final void A0F(int i) {
        C14725i c14725i = (C14725i) C5C.A0f(this.A01);
        for (int i2 = 0; i2 < this.A00; i2++) {
            this.A02.get(i2).ADK(this, c14725i, this.A03, i);
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0003 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0G(C14725i c14725i) {
        for (int i = 0; i < i; i++) {
            this.A02.get(i);
            if (A04[7].charAt(14) == 'P') {
                throw new RuntimeException();
            }
            A04[2] = "KcnUkvSyZAFqCmq9nk7LLPyjKQRUe1pa";
        }
    }

    public final void A0H(C14725i c14725i) {
        A0D(c14725i, false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3148pF
    public final void A43(InterfaceC14835t interfaceC14835t) {
        AbstractC14363y.A01(interfaceC14835t);
        if (!this.A02.contains(interfaceC14835t)) {
            this.A02.add(interfaceC14835t);
            this.A00++;
        }
    }
}
