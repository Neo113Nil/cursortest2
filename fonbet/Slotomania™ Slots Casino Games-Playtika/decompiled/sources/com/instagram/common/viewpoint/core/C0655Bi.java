package com.instagram.common.viewpoint.core;

import com.google.common.collect.ParametricNullness;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.facebook.ads.redexgen.X.Bi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0655Bi<K, V> extends AbstractC1995lr<K, V> {
    public int A00;

    @ParametricNullness
    public final K A01;
    public final /* synthetic */ C2096nh A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.AbstractC1995lr, java.util.Map.Entry
    @ParametricNullness
    public final V getValue() {
        Object A0F;
        Map<K, V> A0h = this.A02.A0h();
        if (A0h != null) {
            return (V) AbstractC2252qF.A01(A0h.get(this.A01));
        }
        A00();
        if (this.A00 == -1) {
            return (V) AbstractC2252qF.A00();
        }
        A0F = this.A02.A0F(this.A00);
        return (V) A0F;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.AbstractC1995lr, java.util.Map.Entry
    @ParametricNullness
    public final V setValue(@ParametricNullness V v) {
        Object A0F;
        Map<K, V> A0h = this.A02.A0h();
        if (A0h != null) {
            return (V) AbstractC2252qF.A01(A0h.put(this.A01, v));
        }
        A00();
        if (this.A00 == -1) {
            this.A02.put(this.A01, v);
            return (V) AbstractC2252qF.A00();
        }
        A0F = this.A02.A0F(this.A00);
        V v2 = (V) A0F;
        this.A02.A0R(this.A00, v);
        return v2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bi != com.google.common.collect.CompactHashMap<K, V>$MapEntry */
    public C0655Bi(C2096nh c2096nh, int i) {
        Object A0E;
        this.A02 = c2096nh;
        A0E = c2096nh.A0E(i);
        this.A01 = (K) A0E;
        this.A00 = i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bi != com.google.common.collect.CompactHashMap<K, V>$MapEntry */
    private void A00() {
        int A07;
        Object A0E;
        if (this.A00 != -1 && this.A00 < this.A02.size()) {
            K k = this.A01;
            A0E = this.A02.A0E(this.A00);
            if (CB.A01(k, A0E)) {
                return;
            }
        }
        A07 = this.A02.A07(this.A01);
        this.A00 = A07;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bi != com.google.common.collect.CompactHashMap<K, V>$MapEntry */
    @Override // com.instagram.common.viewpoint.core.AbstractC1995lr, java.util.Map.Entry
    @ParametricNullness
    public final K getKey() {
        return this.A01;
    }
}
