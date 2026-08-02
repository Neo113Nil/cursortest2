package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final /* synthetic */ class zzzq implements Comparator {
    static final /* synthetic */ zzzq zza = new zzzq();

    private /* synthetic */ zzzq() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((zzzp) Collections.max((List) obj)).compareTo((zzzp) Collections.max((List) obj2));
    }
}
