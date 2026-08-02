package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzewq implements zzfdg {
    public final ArrayList a;

    public zzewq(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            bundle.putStringArrayList("android_permissions", new ArrayList<>(arrayList));
        }
    }
}
