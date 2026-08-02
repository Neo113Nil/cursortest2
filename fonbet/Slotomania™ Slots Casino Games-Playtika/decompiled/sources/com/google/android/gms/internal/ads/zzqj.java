package com.google.android.gms.internal.ads;

import java.util.function.Function;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final /* synthetic */ class zzqj implements Function {
    static final /* synthetic */ zzqj zza = new zzqj();

    private /* synthetic */ zzqj() {
    }

    @Override // java.util.function.Function
    public final /* synthetic */ Object apply(Object obj) {
        return new Integer(Integer.bitCount(((Integer) obj).intValue()));
    }
}
