package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final /* synthetic */ class zzzs implements Comparator {
    static final /* synthetic */ zzzs zza = new zzzs();

    private /* synthetic */ zzzs() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((zzaag) ((List) obj).get(0)).compareTo((zzaag) ((List) obj2).get(0));
    }
}
