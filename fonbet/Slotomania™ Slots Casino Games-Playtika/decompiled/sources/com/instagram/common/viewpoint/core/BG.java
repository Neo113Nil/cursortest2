package com.instagram.common.viewpoint.core;

import java.util.Collection;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public class BG extends AbstractC2241q4<Object> {
    public final /* synthetic */ int A00;

    public BG(final int val$expectedKeys) {
        this.A00 = val$expectedKeys;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractC2241q4
    public final <K, V> Map<K, Collection<V>> A04() {
        return AbstractC2258qN.A00(this.A00);
    }
}
