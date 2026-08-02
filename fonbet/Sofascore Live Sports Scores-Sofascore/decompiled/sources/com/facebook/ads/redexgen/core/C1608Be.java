package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Be, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1608Be extends AbstractC3064ns {
    public C1608Be() {
        super(null);
    }

    private final AbstractC3064ns A00(int result) {
        AbstractC3064ns abstractC3064ns;
        AbstractC3064ns abstractC3064ns2;
        AbstractC3064ns abstractC3064ns3;
        if (result < 0) {
            abstractC3064ns3 = AbstractC3064ns.A02;
            return abstractC3064ns3;
        }
        if (result > 0) {
            abstractC3064ns2 = AbstractC3064ns.A01;
            return abstractC3064ns2;
        }
        abstractC3064ns = AbstractC3064ns.A00;
        return abstractC3064ns;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3064ns
    public final int A05() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3064ns
    public final AbstractC3064ns A06(int left, int right) {
        return A00(Integer.compare(left, right));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3064ns
    public final AbstractC3064ns A07(long left, long right) {
        return A00(Long.compare(left, right));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3064ns
    public final <T> AbstractC3064ns A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator) {
        return A00(comparator.compare(left, right));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3064ns
    public final AbstractC3064ns A09(boolean left, boolean right) {
        return A00(Boolean.compare(left, right));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC3064ns
    public final AbstractC3064ns A0A(boolean left, boolean right) {
        return A00(Boolean.compare(right, left));
    }
}
