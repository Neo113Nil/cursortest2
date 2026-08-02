package com.google.android.gms.internal.ads;

import java.util.function.Supplier;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzawk implements Supplier {
    public final /* synthetic */ int a;
    public static final /* synthetic */ zzawk c = new zzawk(1);
    public static final /* synthetic */ zzawk b = new zzawk(0);

    public /* synthetic */ zzawk(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final /* synthetic */ Object get() {
        return this.a != 0 ? zzaxa.a(null) : new zzawn();
    }
}
