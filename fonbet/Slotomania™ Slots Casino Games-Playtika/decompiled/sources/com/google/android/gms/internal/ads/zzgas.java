package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzgas {
    public static final zzgaq zza(final ExecutorService executorService) {
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        return new zzgaq() { // from class: com.google.android.gms.internal.ads.zzgar
            @Override // com.google.android.gms.internal.ads.zzgaq
            public final /* synthetic */ CoroutineScope zza() {
                return CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(executorService));
            }
        };
    }
}
