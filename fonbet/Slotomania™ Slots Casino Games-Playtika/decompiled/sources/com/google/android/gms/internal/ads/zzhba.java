package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
public class zzhba extends zzhbj {
    zzhba() {
    }

    public static zzhba zzw(ListenableFuture listenableFuture) {
        return listenableFuture instanceof zzhba ? (zzhba) listenableFuture : new zzhbb(listenableFuture);
    }
}
