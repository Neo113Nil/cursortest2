package com.google.android.gms.internal.ads;

import android.os.Bundle;
import defpackage.omf;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdfj extends zzdjn implements zzbox {
    public final Bundle b;

    public zzdfj(Set set) {
        super(set);
        this.b = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbox
    public final synchronized void a0(Bundle bundle, String str) {
        this.b.putAll(bundle);
        p0(omf.f);
    }
}
