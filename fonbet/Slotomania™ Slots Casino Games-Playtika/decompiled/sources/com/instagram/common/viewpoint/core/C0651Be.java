package com.instagram.common.viewpoint.core;

import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Be, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0651Be extends AbstractC2107ns {
    public C0651Be() {
        super(null);
    }

    private final AbstractC2107ns A00(int result) {
        AbstractC2107ns abstractC2107ns;
        AbstractC2107ns abstractC2107ns2;
        AbstractC2107ns abstractC2107ns3;
        if (result < 0) {
            abstractC2107ns3 = AbstractC2107ns.A02;
            return abstractC2107ns3;
        }
        if (result > 0) {
            abstractC2107ns2 = AbstractC2107ns.A01;
            return abstractC2107ns2;
        }
        abstractC2107ns = AbstractC2107ns.A00;
        return abstractC2107ns;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2107ns
    public final int A05() {
        return 0;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2107ns
    public final AbstractC2107ns A06(int left, int right) {
        return A00(Integer.compare(left, right));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2107ns
    public final AbstractC2107ns A07(long left, long right) {
        return A00(Long.compare(left, right));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2107ns
    public final <T> AbstractC2107ns A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator) {
        return A00(comparator.compare(left, right));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2107ns
    public final AbstractC2107ns A09(boolean left, boolean right) {
        return A00(Boolean.compare(left, right));
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2107ns
    public final AbstractC2107ns A0A(boolean left, boolean right) {
        return A00(Boolean.compare(right, left));
    }
}
