package com.google.android.gms.internal.ads;

import androidx.datastore.core.DataStore;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes6.dex */
public final class zzgbo implements zzgae {
    private final CoroutineScope zza;
    private final zzgrz zzb;
    private final Mutex zzc;
    private final Mutex zzd;
    private final Mutex zze;
    private boolean zzf;
    private zzgac zzg;
    private boolean zzh;
    private final DataStore zzi;
    private final zzdwk zzj;

    public zzgbo(DataStore adQualityDataStore, zzgaq coroutineScopeProvider, zzdwk dataPinger, zzgan clock) {
        Intrinsics.checkNotNullParameter(adQualityDataStore, "adQualityDataStore");
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        Intrinsics.checkNotNullParameter(dataPinger, "dataPinger");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.zzj = dataPinger;
        this.zza = coroutineScopeProvider.zza();
        this.zzb = new zzgrz();
        this.zzc = MutexKt.Mutex$default(false, 1, null);
        this.zzd = MutexKt.Mutex$default(false, 1, null);
        this.zze = MutexKt.Mutex$default(false, 1, null);
        this.zzi = adQualityDataStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0051, code lost:
    
        if (r8.lock(null, r0) != r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzA(Continuation continuation) {
        zzgaw zzgawVar;
        Object coroutine_suspended;
        int i;
        Mutex mutex;
        Mutex mutex2;
        Throwable th;
        Object updateData;
        try {
            if (continuation instanceof zzgaw) {
                zzgawVar = (zzgaw) continuation;
                int i2 = zzgawVar.zzd;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgawVar.zzd = i2 - Integer.MIN_VALUE;
                    Object obj = zzgawVar.zzb;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgawVar.zzd;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zze;
                        zzgawVar.zza = mutex;
                        zzgawVar.zzd = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex2 = (Mutex) zzgawVar.zza;
                            try {
                                ResultKt.throwOnFailure(obj);
                                mutex2.unlock(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        Mutex mutex3 = (Mutex) zzgawVar.zza;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex3;
                    }
                    DataStore dataStore = this.zzi;
                    zzgax zzgaxVar = new zzgax(null);
                    zzgawVar.zza = mutex;
                    zzgawVar.zzd = 2;
                    updateData = dataStore.updateData(zzgaxVar, zzgawVar);
                    if (updateData != coroutine_suspended) {
                        mutex2 = mutex;
                        obj = updateData;
                        mutex2.unlock(null);
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
            }
            DataStore dataStore2 = this.zzi;
            zzgax zzgaxVar2 = new zzgax(null);
            zzgawVar.zza = mutex;
            zzgawVar.zzd = 2;
            updateData = dataStore2.updateData(zzgaxVar2, zzgawVar);
            if (updateData != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
        zzgawVar = new zzgaw(this, continuation);
        Object obj2 = zzgawVar.zzb;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgawVar.zzd;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[Catch: all -> 0x0077, TRY_ENTER, TryCatch #0 {all -> 0x0077, blocks: (B:11:0x004a, B:14:0x0050, B:15:0x0054, B:17:0x0058, B:18:0x005c, B:20:0x0065, B:21:0x0069), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[Catch: all -> 0x0077, TryCatch #0 {all -> 0x0077, blocks: (B:11:0x004a, B:14:0x0050, B:15:0x0054, B:17:0x0058, B:18:0x005c, B:20:0x0065, B:21:0x0069), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065 A[Catch: all -> 0x0077, TryCatch #0 {all -> 0x0077, blocks: (B:11:0x004a, B:14:0x0050, B:15:0x0054, B:17:0x0058, B:18:0x005c, B:20:0x0065, B:21:0x0069), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzB(long j, Continuation continuation) {
        zzgav zzgavVar;
        int i;
        Mutex mutex;
        zzgac zzgacVar;
        zzgac zzgacVar2;
        zzgac zzgacVar3;
        try {
            if (continuation instanceof zzgav) {
                zzgavVar = (zzgav) continuation;
                int i2 = zzgavVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgavVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzgavVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgavVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.zzc;
                        zzgavVar.zzb = mutex2;
                        zzgavVar.zza = j;
                        zzgavVar.zze = 1;
                        if (mutex2.lock(null, zzgavVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j = zzgavVar.zza;
                        mutex = (Mutex) zzgavVar.zzb;
                        ResultKt.throwOnFailure(obj);
                    }
                    zzgacVar = this.zzg;
                    if (zzgacVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgacVar = null;
                    }
                    zzgacVar2 = this.zzg;
                    if (zzgacVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgacVar2 = null;
                    }
                    long zzi = j - zzgacVar2.zzi();
                    zzgacVar3 = this.zzg;
                    if (zzgacVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgacVar3 = null;
                    }
                    zzgacVar.zzb(zzi - zzgacVar3.zzg());
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            zzgacVar = this.zzg;
            if (zzgacVar == null) {
            }
            zzgacVar2 = this.zzg;
            if (zzgacVar2 == null) {
            }
            long zzi2 = j - zzgacVar2.zzi();
            zzgacVar3 = this.zzg;
            if (zzgacVar3 == null) {
            }
            zzgacVar.zzb(zzi2 - zzgacVar3.zzg());
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        zzgavVar = new zzgav(this, continuation);
        Object obj2 = zzgavVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgavVar.zze;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0060, code lost:
    
        if (r2.lock(null, r0) != r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066 A[Catch: all -> 0x00ab, TryCatch #2 {all -> 0x00ab, blocks: (B:35:0x0062, B:37:0x0066, B:38:0x006c), top: B:34:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzC(Continuation continuation) {
        zzgba zzgbaVar;
        Object coroutine_suspended;
        int i;
        Mutex mutex;
        zzgac zzgacVar;
        Mutex mutex2;
        zzgad zzgadVar;
        Mutex mutex3;
        try {
            if (continuation instanceof zzgba) {
                zzgbaVar = (zzgba) continuation;
                int i2 = zzgbaVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgbaVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzgbaVar.zzc;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgbaVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zzc;
                        zzgbaVar.zza = mutex;
                        zzgbaVar.zze = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                mutex3 = (Mutex) zzgbaVar.zza;
                                try {
                                    ResultKt.throwOnFailure(obj);
                                    mutex3.unlock(null);
                                    return Unit.INSTANCE;
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                            mutex2 = (Mutex) zzgbaVar.zzb;
                            zzgadVar = (zzgad) zzgbaVar.zza;
                            ResultKt.throwOnFailure(obj);
                            try {
                                DataStore dataStore = this.zzi;
                                zzgbb zzgbbVar = new zzgbb(zzgadVar, null);
                                zzgbaVar.zza = mutex2;
                                zzgbaVar.zzb = null;
                                zzgbaVar.zze = 3;
                                obj = dataStore.updateData(zzgbbVar, zzgbaVar);
                                if (obj != coroutine_suspended) {
                                    mutex3 = mutex2;
                                    mutex3.unlock(null);
                                    return Unit.INSTANCE;
                                }
                                return coroutine_suspended;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex3 = mutex2;
                                throw th;
                            }
                        }
                        mutex = (Mutex) zzgbaVar.zza;
                        ResultKt.throwOnFailure(obj);
                    }
                    zzgacVar = this.zzg;
                    if (zzgacVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgacVar = null;
                    }
                    zzgad zzgadVar2 = (zzgad) zzgacVar.zzbu();
                    mutex.unlock(null);
                    Intrinsics.checkNotNull(zzgadVar2);
                    mutex2 = this.zze;
                    zzgbaVar.zza = zzgadVar2;
                    zzgbaVar.zzb = mutex2;
                    zzgbaVar.zze = 2;
                    if (mutex2.lock(null, zzgbaVar) != coroutine_suspended) {
                        zzgadVar = zzgadVar2;
                        DataStore dataStore2 = this.zzi;
                        zzgbb zzgbbVar2 = new zzgbb(zzgadVar, null);
                        zzgbaVar.zza = mutex2;
                        zzgbaVar.zzb = null;
                        zzgbaVar.zze = 3;
                        obj = dataStore2.updateData(zzgbbVar2, zzgbaVar);
                        if (obj != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
            }
            zzgacVar = this.zzg;
            if (zzgacVar == null) {
            }
            zzgad zzgadVar22 = (zzgad) zzgacVar.zzbu();
            mutex.unlock(null);
            Intrinsics.checkNotNull(zzgadVar22);
            mutex2 = this.zze;
            zzgbaVar.zza = zzgadVar22;
            zzgbaVar.zzb = mutex2;
            zzgbaVar.zze = 2;
            if (mutex2.lock(null, zzgbaVar) != coroutine_suspended) {
            }
            return coroutine_suspended;
        } finally {
            mutex.unlock(null);
        }
        zzgbaVar = new zzgba(this, continuation);
        Object obj2 = zzgbaVar.zzc;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgbaVar.zze;
        if (i != 0) {
        }
    }

    private static final boolean zzD(zzgad zzgadVar) {
        boolean z;
        List zzk = zzgadVar.zzk();
        Long l = zzk != null ? (Long) CollectionsKt.lastOrNull(zzk) : null;
        boolean z2 = zzgadVar.zzl() > zzgadVar.zzm() && !zzgadVar.zzd();
        if (l != null) {
            if (zzgadVar.zzi() - l.longValue() > 5000) {
                z = true;
                return !z2 || z;
            }
        }
        z = false;
        if (z2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d0, code lost:
    
        if (zzA(r0) == r1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006a, code lost:
    
        if (r9 == r1) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.android.gms.internal.ads.zzgbo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzs(Continuation continuation) {
        zzgbj zzgbjVar;
        ?? r2;
        Mutex mutex;
        try {
            if (continuation instanceof zzgbj) {
                zzgbjVar = (zzgbj) continuation;
                int i = zzgbjVar.zzd;
                if ((i & Integer.MIN_VALUE) != 0) {
                    zzgbjVar.zzd = i - Integer.MIN_VALUE;
                    Object obj = zzgbjVar.zzb;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r2 = zzgbjVar.zzd;
                    if (r2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.zze;
                        zzgbjVar.zza = mutex2;
                        zzgbjVar.zzd = 1;
                        if (mutex2.lock(null, zzgbjVar) != coroutine_suspended) {
                            mutex = mutex2;
                        }
                        return coroutine_suspended;
                    }
                    if (r2 == 1) {
                        Mutex mutex3 = (Mutex) zzgbjVar.zza;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex3;
                    } else {
                        if (r2 != 2) {
                            if (r2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        Mutex mutex4 = (Mutex) zzgbjVar.zza;
                        ResultKt.throwOnFailure(obj);
                        r2 = mutex4;
                        zzgah zzgahVar = (zzgah) obj;
                        if (zzgahVar == null || zzgahVar.zza() == 0) {
                            return Unit.INSTANCE;
                        }
                        for (Map.Entry entry : zzgahVar.zzb().entrySet()) {
                            zzidl zzcc = ((zzgad) entry.getValue()).zzcc();
                            Intrinsics.checkNotNullExpressionValue(zzcc, "toBuilder(...)");
                            zzgac zzgacVar = (zzgac) zzcc;
                            Object value = entry.getValue();
                            Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
                            if (zzD((zzgad) value)) {
                                zzgacVar.zzf(true);
                            }
                            zzdwk zzdwkVar = this.zzj;
                            zzidr zzbu = zzgacVar.zzbu();
                            Intrinsics.checkNotNullExpressionValue(zzbu, "build(...)");
                            zzdwkVar.zza((zzgad) zzbu);
                        }
                        zzgbjVar.zza = null;
                        zzgbjVar.zzd = 3;
                    }
                    Flow data = this.zzi.getData();
                    zzgbjVar.zza = mutex;
                    zzgbjVar.zzd = 2;
                    obj = FlowKt.firstOrNull(data, zzgbjVar);
                    r2 = mutex;
                }
            }
            if (r2 != 0) {
            }
            Flow data2 = this.zzi.getData();
            zzgbjVar.zza = mutex;
            zzgbjVar.zzd = 2;
            obj = FlowKt.firstOrNull(data2, zzgbjVar);
            r2 = mutex;
        } finally {
            r2.unlock(null);
        }
        zzgbjVar = new zzgbj(this, continuation);
        Object obj2 = zzgbjVar.zzb;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = zzgbjVar.zzd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005b A[Catch: all -> 0x0088, TRY_LEAVE, TryCatch #0 {all -> 0x0088, blocks: (B:11:0x0057, B:13:0x005b, B:17:0x0061, B:19:0x0076, B:20:0x007c), top: B:10:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061 A[Catch: all -> 0x0088, TRY_ENTER, TryCatch #0 {all -> 0x0088, blocks: (B:11:0x0057, B:13:0x005b, B:17:0x0061, B:19:0x0076, B:20:0x007c), top: B:10:0x0057 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzt(String str, Continuation continuation) {
        zzgbd zzgbdVar;
        int i;
        String str2;
        Mutex mutex;
        long j;
        try {
            if (continuation instanceof zzgbd) {
                zzgbdVar = (zzgbd) continuation;
                int i2 = zzgbdVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgbdVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzgbdVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgbdVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.zzc;
                        long currentTimeMillis = System.currentTimeMillis();
                        zzgbdVar.zzf = str;
                        zzgbdVar.zza = mutex2;
                        zzgbdVar.zzb = currentTimeMillis;
                        zzgbdVar.zze = 1;
                        if (mutex2.lock(null, zzgbdVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str2 = str;
                        mutex = mutex2;
                        j = currentTimeMillis;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j = zzgbdVar.zzb;
                        mutex = (Mutex) zzgbdVar.zza;
                        str2 = zzgbdVar.zzf;
                        ResultKt.throwOnFailure(obj);
                    }
                    if (!this.zzf) {
                        return Unit.INSTANCE;
                    }
                    this.zzf = true;
                    zzidl zzcc = zzgad.zzp().zzcc();
                    Intrinsics.checkNotNullExpressionValue(zzcc, "toBuilder(...)");
                    zzgac zzgacVar = (zzgac) zzcc;
                    this.zzg = zzgacVar;
                    if (zzgacVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgacVar = null;
                    }
                    zzgacVar.zza(str2);
                    zzgacVar.zzj(j);
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            if (!this.zzf) {
            }
        } finally {
            mutex.unlock(null);
        }
        zzgbdVar = new zzgbd(this, continuation);
        Object obj2 = zzgbdVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgbdVar.zze;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a6, code lost:
    
        if (zzC(r0) != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
    
        if (zzB(r5, r0) != r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x005f, code lost:
    
        if (r2.lock(null, r0) != r1) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089 A[Catch: all -> 0x00ab, TryCatch #1 {all -> 0x00ab, blocks: (B:24:0x0085, B:26:0x0089, B:27:0x008f), top: B:23:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065 A[Catch: all -> 0x00b0, TRY_LEAVE, TryCatch #0 {all -> 0x00b0, blocks: (B:36:0x0061, B:38:0x0065, B:41:0x006b), top: B:35:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b A[Catch: all -> 0x00b0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00b0, blocks: (B:36:0x0061, B:38:0x0065, B:41:0x006b), top: B:35:0x0061 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzu(Continuation continuation) {
        zzgaz zzgazVar;
        int i;
        Mutex mutex;
        Mutex mutex2;
        long j;
        zzgac zzgacVar;
        try {
            if (continuation instanceof zzgaz) {
                zzgazVar = (zzgaz) continuation;
                int i2 = zzgazVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgazVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzgazVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgazVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zzd;
                        zzgazVar.zza = mutex;
                        zzgazVar.zze = 1;
                    } else if (i == 1) {
                        mutex = (Mutex) zzgazVar.zza;
                        ResultKt.throwOnFailure(obj);
                    } else if (i == 2) {
                        j = zzgazVar.zzb;
                        mutex2 = (Mutex) zzgazVar.zza;
                        ResultKt.throwOnFailure(obj);
                        try {
                            zzgacVar = this.zzg;
                            if (zzgacVar == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                zzgacVar = null;
                            }
                            zzgacVar.zzo(j);
                            mutex.unlock(null);
                            zzgazVar.zza = null;
                            zzgazVar.zze = 3;
                        } finally {
                        }
                    } else {
                        if (i != 3) {
                            if (i != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        ResultKt.throwOnFailure(obj);
                        zzgazVar.zze = 4;
                    }
                    if (!this.zzh) {
                        return Unit.INSTANCE;
                    }
                    this.zzh = true;
                    Unit unit = Unit.INSTANCE;
                    mutex.unlock(null);
                    mutex2 = this.zzc;
                    long currentTimeMillis = System.currentTimeMillis();
                    zzgazVar.zza = mutex2;
                    zzgazVar.zzb = currentTimeMillis;
                    zzgazVar.zze = 2;
                    if (mutex2.lock(null, zzgazVar) != coroutine_suspended) {
                        j = currentTimeMillis;
                        zzgacVar = this.zzg;
                        if (zzgacVar == null) {
                        }
                        zzgacVar.zzo(j);
                        mutex.unlock(null);
                        zzgazVar.zza = null;
                        zzgazVar.zze = 3;
                    }
                    return coroutine_suspended;
                }
            }
            if (!this.zzh) {
            }
        } finally {
        }
        zzgazVar = new zzgaz(this, continuation);
        Object obj2 = zzgazVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgazVar.zze;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0050, code lost:
    
        if (r2.lock(null, r0) != r1) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007e A[Catch: all -> 0x011a, TRY_ENTER, TryCatch #0 {all -> 0x011a, blocks: (B:12:0x0078, B:15:0x007e, B:16:0x0082, B:19:0x008a, B:21:0x008e, B:22:0x0092, B:24:0x00ae, B:25:0x00b2, B:27:0x00bb, B:29:0x00bf, B:30:0x00c3, B:31:0x00cb, B:33:0x00cf, B:34:0x00d3, B:36:0x00d9, B:38:0x00dd, B:39:0x00e1, B:41:0x00fd, B:42:0x0101, B:43:0x0109, B:45:0x010d, B:46:0x0111), top: B:11:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008a A[Catch: all -> 0x011a, TRY_ENTER, TryCatch #0 {all -> 0x011a, blocks: (B:12:0x0078, B:15:0x007e, B:16:0x0082, B:19:0x008a, B:21:0x008e, B:22:0x0092, B:24:0x00ae, B:25:0x00b2, B:27:0x00bb, B:29:0x00bf, B:30:0x00c3, B:31:0x00cb, B:33:0x00cf, B:34:0x00d3, B:36:0x00d9, B:38:0x00dd, B:39:0x00e1, B:41:0x00fd, B:42:0x0101, B:43:0x0109, B:45:0x010d, B:46:0x0111), top: B:11:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cf A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:12:0x0078, B:15:0x007e, B:16:0x0082, B:19:0x008a, B:21:0x008e, B:22:0x0092, B:24:0x00ae, B:25:0x00b2, B:27:0x00bb, B:29:0x00bf, B:30:0x00c3, B:31:0x00cb, B:33:0x00cf, B:34:0x00d3, B:36:0x00d9, B:38:0x00dd, B:39:0x00e1, B:41:0x00fd, B:42:0x0101, B:43:0x0109, B:45:0x010d, B:46:0x0111), top: B:11:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9 A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:12:0x0078, B:15:0x007e, B:16:0x0082, B:19:0x008a, B:21:0x008e, B:22:0x0092, B:24:0x00ae, B:25:0x00b2, B:27:0x00bb, B:29:0x00bf, B:30:0x00c3, B:31:0x00cb, B:33:0x00cf, B:34:0x00d3, B:36:0x00d9, B:38:0x00dd, B:39:0x00e1, B:41:0x00fd, B:42:0x0101, B:43:0x0109, B:45:0x010d, B:46:0x0111), top: B:11:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010d A[Catch: all -> 0x011a, TryCatch #0 {all -> 0x011a, blocks: (B:12:0x0078, B:15:0x007e, B:16:0x0082, B:19:0x008a, B:21:0x008e, B:22:0x0092, B:24:0x00ae, B:25:0x00b2, B:27:0x00bb, B:29:0x00bf, B:30:0x00c3, B:31:0x00cb, B:33:0x00cf, B:34:0x00d3, B:36:0x00d9, B:38:0x00dd, B:39:0x00e1, B:41:0x00fd, B:42:0x0101, B:43:0x0109, B:45:0x010d, B:46:0x0111), top: B:11:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0056 A[Catch: all -> 0x011f, TRY_LEAVE, TryCatch #1 {all -> 0x011f, blocks: (B:58:0x0052, B:60:0x0056, B:64:0x005d), top: B:57:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzv(Continuation continuation) {
        zzgbn zzgbnVar;
        int i;
        Mutex mutex;
        Mutex mutex2;
        long j;
        zzgac zzgacVar;
        zzgac zzgacVar2;
        zzgac zzgacVar3;
        try {
            if (continuation instanceof zzgbn) {
                zzgbnVar = (zzgbn) continuation;
                int i2 = zzgbnVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgbnVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzgbnVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgbnVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zzd;
                        zzgbnVar.zza = mutex;
                        zzgbnVar.zze = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j = zzgbnVar.zzb;
                            mutex2 = (Mutex) zzgbnVar.zza;
                            ResultKt.throwOnFailure(obj);
                            try {
                                zzgacVar = this.zzg;
                                if (zzgacVar == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgacVar = null;
                                }
                                if (zzgacVar.zzr() > 0) {
                                    zzgac zzgacVar4 = this.zzg;
                                    if (zzgacVar4 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                        zzgacVar4 = null;
                                    }
                                    List zzq = zzgacVar4.zzq();
                                    Intrinsics.checkNotNullExpressionValue(zzq, "getAdClickTimestampsMsList(...)");
                                    Object last = CollectionsKt.last((List<? extends Object>) zzq);
                                    Intrinsics.checkNotNullExpressionValue(last, "last(...)");
                                    long longValue = j - ((Number) last).longValue();
                                    zzgac zzgacVar5 = this.zzg;
                                    if (zzgacVar5 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                        zzgacVar5 = null;
                                    }
                                    zzgacVar5.zzt();
                                    if (longValue < 5000) {
                                        zzgac zzgacVar6 = this.zzg;
                                        if (zzgacVar6 == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                            zzgacVar6 = null;
                                        }
                                        zzgacVar6.zzd(zzgacVar6.zzc() + 1);
                                    }
                                }
                                zzgacVar2 = this.zzg;
                                if (zzgacVar2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgacVar2 = null;
                                }
                                if (zzgacVar2.zzn() > 0) {
                                    zzgac zzgacVar7 = this.zzg;
                                    if (zzgacVar7 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                        zzgacVar7 = null;
                                    }
                                    List zzm = zzgacVar7.zzm();
                                    Intrinsics.checkNotNullExpressionValue(zzm, "getAppBackgroundTimestampsMsList(...)");
                                    Object last2 = CollectionsKt.last((List<? extends Object>) zzm);
                                    Intrinsics.checkNotNullExpressionValue(last2, "last(...)");
                                    long longValue2 = j - ((Number) last2).longValue();
                                    zzgac zzgacVar8 = this.zzg;
                                    if (zzgacVar8 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                        zzgacVar8 = null;
                                    }
                                    zzgacVar8.zzh(zzgacVar8.zzg() + longValue2);
                                }
                                zzgacVar3 = this.zzg;
                                if (zzgacVar3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgacVar3 = null;
                                }
                                zzgacVar3.zzp(j);
                                mutex2.unlock(null);
                                return Unit.INSTANCE;
                            } finally {
                            }
                        }
                        mutex = (Mutex) zzgbnVar.zza;
                        ResultKt.throwOnFailure(obj);
                    }
                    if (this.zzh) {
                        return Unit.INSTANCE;
                    }
                    this.zzh = false;
                    Unit unit = Unit.INSTANCE;
                    mutex2.unlock(null);
                    Mutex mutex3 = this.zzc;
                    long currentTimeMillis = System.currentTimeMillis();
                    zzgbnVar.zza = mutex3;
                    zzgbnVar.zzb = currentTimeMillis;
                    zzgbnVar.zze = 2;
                    if (mutex3.lock(null, zzgbnVar) != coroutine_suspended) {
                        mutex2 = mutex3;
                        j = currentTimeMillis;
                        zzgacVar = this.zzg;
                        if (zzgacVar == null) {
                        }
                        if (zzgacVar.zzr() > 0) {
                        }
                        zzgacVar2 = this.zzg;
                        if (zzgacVar2 == null) {
                        }
                        if (zzgacVar2.zzn() > 0) {
                        }
                        zzgacVar3 = this.zzg;
                        if (zzgacVar3 == null) {
                        }
                        zzgacVar3.zzp(j);
                        mutex2.unlock(null);
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
            }
            if (this.zzh) {
            }
        } finally {
        }
        zzgbnVar = new zzgbn(this, continuation);
        Object obj2 = zzgbnVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgbnVar.zze;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f6, code lost:
    
        if (zzz(r14, r0) == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0064, code lost:
    
        if (r2.lock(null, r0) != r1) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091 A[Catch: all -> 0x00fc, TRY_ENTER, TryCatch #1 {all -> 0x00fc, blocks: (B:26:0x008b, B:29:0x0091, B:30:0x0095, B:32:0x0099, B:33:0x009d, B:35:0x00a7, B:36:0x00ab, B:38:0x00b7, B:39:0x00bb, B:41:0x00c2, B:42:0x00c6), top: B:25:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:26:0x008b, B:29:0x0091, B:30:0x0095, B:32:0x0099, B:33:0x009d, B:35:0x00a7, B:36:0x00ab, B:38:0x00b7, B:39:0x00bb, B:41:0x00c2, B:42:0x00c6), top: B:25:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:26:0x008b, B:29:0x0091, B:30:0x0095, B:32:0x0099, B:33:0x009d, B:35:0x00a7, B:36:0x00ab, B:38:0x00b7, B:39:0x00bb, B:41:0x00c2, B:42:0x00c6), top: B:25:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:26:0x008b, B:29:0x0091, B:30:0x0095, B:32:0x0099, B:33:0x009d, B:35:0x00a7, B:36:0x00ab, B:38:0x00b7, B:39:0x00bb, B:41:0x00c2, B:42:0x00c6), top: B:25:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:26:0x008b, B:29:0x0091, B:30:0x0095, B:32:0x0099, B:33:0x009d, B:35:0x00a7, B:36:0x00ab, B:38:0x00b7, B:39:0x00bb, B:41:0x00c2, B:42:0x00c6), top: B:25:0x008b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006a A[Catch: all -> 0x0101, TRY_LEAVE, TryCatch #0 {all -> 0x0101, blocks: (B:52:0x0066, B:54:0x006a, B:58:0x0071), top: B:51:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzw(Continuation continuation) {
        zzgbh zzgbhVar;
        int i;
        Mutex mutex;
        Mutex mutex2;
        long j;
        zzgac zzgacVar;
        zzgac zzgacVar2;
        zzgac zzgacVar3;
        zzgac zzgacVar4;
        zzgac zzgacVar5;
        zzgad zzgadVar;
        try {
            if (continuation instanceof zzgbh) {
                zzgbhVar = (zzgbh) continuation;
                int i2 = zzgbhVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgbhVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzgbhVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgbhVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zzc;
                        zzgbhVar.zza = mutex;
                        zzgbhVar.zze = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                    return Unit.INSTANCE;
                                }
                                zzgadVar = (zzgad) zzgbhVar.zza;
                                ResultKt.throwOnFailure(obj);
                                if (this.zzj.zza(zzgadVar)) {
                                    String zza = zzgadVar.zza();
                                    Intrinsics.checkNotNullExpressionValue(zza, "getGwsQueryId(...)");
                                    zzgbhVar.zza = null;
                                    zzgbhVar.zze = 4;
                                }
                                return Unit.INSTANCE;
                            }
                            j = zzgbhVar.zzb;
                            mutex2 = (Mutex) zzgbhVar.zza;
                            ResultKt.throwOnFailure(obj);
                            try {
                                zzgacVar = this.zzg;
                                if (zzgacVar == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgacVar = null;
                                }
                                zzgacVar2 = this.zzg;
                                if (zzgacVar2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgacVar2 = null;
                                }
                                long zzi = j - zzgacVar2.zzi();
                                zzgacVar3 = this.zzg;
                                if (zzgacVar3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgacVar3 = null;
                                }
                                zzgacVar.zzb(zzi - zzgacVar3.zzg());
                                zzgacVar4 = this.zzg;
                                if (zzgacVar4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgacVar4 = null;
                                }
                                zzgacVar4.zzl(j);
                                zzgacVar5 = this.zzg;
                                if (zzgacVar5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgacVar5 = null;
                                }
                                zzgad zzgadVar2 = (zzgad) zzgacVar5.zzbu();
                                mutex.unlock(null);
                                Intrinsics.checkNotNull(zzgadVar2);
                                zzgbhVar.zza = zzgadVar2;
                                zzgbhVar.zze = 3;
                                if (zzC(zzgbhVar) != coroutine_suspended) {
                                    zzgadVar = zzgadVar2;
                                    if (this.zzj.zza(zzgadVar)) {
                                    }
                                    return Unit.INSTANCE;
                                }
                                return coroutine_suspended;
                            } finally {
                            }
                        }
                        mutex = (Mutex) zzgbhVar.zza;
                        ResultKt.throwOnFailure(obj);
                    }
                    if (this.zzf) {
                        return Unit.INSTANCE;
                    }
                    this.zzf = false;
                    Unit unit = Unit.INSTANCE;
                    mutex.unlock(null);
                    mutex2 = this.zzc;
                    long currentTimeMillis = System.currentTimeMillis();
                    zzgbhVar.zza = mutex2;
                    zzgbhVar.zzb = currentTimeMillis;
                    zzgbhVar.zze = 2;
                    if (mutex2.lock(null, zzgbhVar) != coroutine_suspended) {
                        j = currentTimeMillis;
                        zzgacVar = this.zzg;
                        if (zzgacVar == null) {
                        }
                        zzgacVar2 = this.zzg;
                        if (zzgacVar2 == null) {
                        }
                        long zzi2 = j - zzgacVar2.zzi();
                        zzgacVar3 = this.zzg;
                        if (zzgacVar3 == null) {
                        }
                        zzgacVar.zzb(zzi2 - zzgacVar3.zzg());
                        zzgacVar4 = this.zzg;
                        if (zzgacVar4 == null) {
                        }
                        zzgacVar4.zzl(j);
                        zzgacVar5 = this.zzg;
                        if (zzgacVar5 == null) {
                        }
                        zzgad zzgadVar22 = (zzgad) zzgacVar5.zzbu();
                        mutex.unlock(null);
                        Intrinsics.checkNotNull(zzgadVar22);
                        zzgbhVar.zza = zzgadVar22;
                        zzgbhVar.zze = 3;
                        if (zzC(zzgbhVar) != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
            }
            if (this.zzf) {
            }
        } finally {
        }
        zzgbhVar = new zzgbh(this, continuation);
        Object obj2 = zzgbhVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgbhVar.zze;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0100, code lost:
    
        if (zzz(r15, r0) == r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0088, code lost:
    
        if (r2.lock(null, r0) != r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0064, code lost:
    
        if (r2.lock(null, r0) != r1) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006a A[Catch: all -> 0x010b, TRY_LEAVE, TryCatch #1 {all -> 0x010b, blocks: (B:55:0x0066, B:57:0x006a, B:61:0x0071), top: B:54:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzx(Continuation continuation) {
        zzgbl zzgblVar;
        int i;
        Mutex mutex;
        Mutex mutex2;
        long currentTimeMillis;
        zzgad zzgadVar;
        try {
            if (continuation instanceof zzgbl) {
                zzgblVar = (zzgbl) continuation;
                int i2 = zzgblVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgblVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzgblVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgblVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zzc;
                        zzgblVar.zza = mutex;
                        zzgblVar.zze = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i != 4) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                    return Unit.INSTANCE;
                                }
                                zzgadVar = (zzgad) zzgblVar.zza;
                                ResultKt.throwOnFailure(obj);
                                if (this.zzj.zza(zzgadVar)) {
                                    String zza = zzgadVar.zza();
                                    Intrinsics.checkNotNullExpressionValue(zza, "getGwsQueryId(...)");
                                    zzgblVar.zza = null;
                                    zzgblVar.zze = 4;
                                }
                                return Unit.INSTANCE;
                            }
                            currentTimeMillis = zzgblVar.zzb;
                            mutex2 = (Mutex) zzgblVar.zza;
                            ResultKt.throwOnFailure(obj);
                            try {
                                zzgac zzgacVar = this.zzg;
                                if (zzgacVar == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgacVar = null;
                                }
                                zzgac zzgacVar2 = this.zzg;
                                if (zzgacVar2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgacVar2 = null;
                                }
                                long zzi = currentTimeMillis - zzgacVar2.zzi();
                                zzgac zzgacVar3 = this.zzg;
                                if (zzgacVar3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgacVar3 = null;
                                }
                                zzgacVar.zzb(zzi - zzgacVar3.zzg());
                                zzgac zzgacVar4 = this.zzg;
                                if (zzgacVar4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgacVar4 = null;
                                }
                                zzgacVar4.zzk(currentTimeMillis);
                                zzgac zzgacVar5 = this.zzg;
                                if (zzgacVar5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgacVar5 = null;
                                }
                                zzgacVar5.zze(true);
                                zzgac zzgacVar6 = this.zzg;
                                if (zzgacVar6 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                                    zzgacVar6 = null;
                                }
                                zzgad zzgadVar2 = (zzgad) zzgacVar6.zzbu();
                                mutex2.unlock(null);
                                Intrinsics.checkNotNull(zzgadVar2);
                                zzgblVar.zza = zzgadVar2;
                                zzgblVar.zze = 3;
                                if (zzC(zzgblVar) != coroutine_suspended) {
                                    zzgadVar = zzgadVar2;
                                    if (this.zzj.zza(zzgadVar)) {
                                    }
                                    return Unit.INSTANCE;
                                }
                                return coroutine_suspended;
                            } finally {
                            }
                        }
                        mutex = (Mutex) zzgblVar.zza;
                        ResultKt.throwOnFailure(obj);
                    }
                    if (this.zzf) {
                        return Unit.INSTANCE;
                    }
                    this.zzf = false;
                    Unit unit = Unit.INSTANCE;
                    mutex2.unlock(null);
                    mutex2 = this.zzc;
                    currentTimeMillis = System.currentTimeMillis();
                    zzgblVar.zza = mutex2;
                    zzgblVar.zzb = currentTimeMillis;
                    zzgblVar.zze = 2;
                }
            }
            if (this.zzf) {
            }
        } finally {
        }
        zzgblVar = new zzgbl(this, continuation);
        Object obj2 = zzgblVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgblVar.zze;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[Catch: all -> 0x0062, TryCatch #0 {all -> 0x0062, blocks: (B:11:0x004f, B:13:0x0053, B:14:0x0059), top: B:10:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzy(Continuation continuation) {
        zzgbf zzgbfVar;
        int i;
        Mutex mutex;
        long j;
        zzgac zzgacVar;
        try {
            if (continuation instanceof zzgbf) {
                zzgbfVar = (zzgbf) continuation;
                int i2 = zzgbfVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgbfVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzgbfVar.zzc;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgbfVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Mutex mutex2 = this.zzc;
                        long currentTimeMillis = System.currentTimeMillis();
                        zzgbfVar.zzb = mutex2;
                        zzgbfVar.zza = currentTimeMillis;
                        zzgbfVar.zze = 1;
                        if (mutex2.lock(null, zzgbfVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        mutex = mutex2;
                        j = currentTimeMillis;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        j = zzgbfVar.zza;
                        mutex = (Mutex) zzgbfVar.zzb;
                        ResultKt.throwOnFailure(obj);
                    }
                    zzgacVar = this.zzg;
                    if (zzgacVar == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adQualityDataBuilder");
                        zzgacVar = null;
                    }
                    zzgacVar.zzs(j);
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            zzgacVar = this.zzg;
            if (zzgacVar == null) {
            }
            zzgacVar.zzs(j);
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        zzgbfVar = new zzgbf(this, continuation);
        Object obj2 = zzgbfVar.zzc;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgbfVar.zze;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
    
        if (r9.lock(null, r0) != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzz(String str, Continuation continuation) {
        zzgat zzgatVar;
        Object coroutine_suspended;
        int i;
        Mutex mutex;
        Throwable th;
        Mutex mutex2;
        Object updateData;
        try {
            if (continuation instanceof zzgat) {
                zzgatVar = (zzgat) continuation;
                int i2 = zzgatVar.zze;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    zzgatVar.zze = i2 - Integer.MIN_VALUE;
                    Object obj = zzgatVar.zzc;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = zzgatVar.zze;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.zze;
                        zzgatVar.zza = str;
                        zzgatVar.zzb = mutex;
                        zzgatVar.zze = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex2 = (Mutex) zzgatVar.zza;
                            try {
                                ResultKt.throwOnFailure(obj);
                                mutex2.unlock(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        Mutex mutex3 = (Mutex) zzgatVar.zzb;
                        String str2 = (String) zzgatVar.zza;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex3;
                        str = str2;
                    }
                    DataStore dataStore = this.zzi;
                    zzgau zzgauVar = new zzgau(str, null);
                    zzgatVar.zza = mutex;
                    zzgatVar.zzb = null;
                    zzgatVar.zze = 2;
                    updateData = dataStore.updateData(zzgauVar, zzgatVar);
                    if (updateData != coroutine_suspended) {
                        Mutex mutex4 = mutex;
                        obj = updateData;
                        mutex2 = mutex4;
                        mutex2.unlock(null);
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
            }
            DataStore dataStore2 = this.zzi;
            zzgau zzgauVar2 = new zzgau(str, null);
            zzgatVar.zza = mutex;
            zzgatVar.zzb = null;
            zzgatVar.zze = 2;
            updateData = dataStore2.updateData(zzgauVar2, zzgatVar);
            if (updateData != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            Mutex mutex5 = mutex;
            th = th3;
            mutex2 = mutex5;
            mutex2.unlock(null);
            throw th;
        }
        zzgatVar = new zzgat(this, continuation);
        Object obj2 = zzgatVar.zzc;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = zzgatVar.zze;
        if (i != 0) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgae
    public final void zza() {
        BuildersKt__Builders_commonKt.launch$default(this.zza, null, null, new zzgbi(this, null), 3, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgae
    public final void zzb(String gwsQueryId) {
        Intrinsics.checkNotNullParameter(gwsQueryId, "gwsQueryId");
        zzgsc.zza(this.zza, this.zzb, new zzgbc(this, gwsQueryId, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgae
    public final void zzc() {
        zzgsc.zza(this.zza, this.zzb, new zzgay(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgae
    public final void zzd() {
        zzgsc.zza(this.zza, this.zzb, new zzgbm(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgae
    public final void zze() {
        zzgsc.zza(this.zza, this.zzb, new zzgbg(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgae
    public final void zzf() {
        zzgsc.zza(this.zza, this.zzb, new zzgbk(this, null));
    }

    @Override // com.google.android.gms.internal.ads.zzgae
    public final void zzg() {
        zzgsc.zza(this.zza, this.zzb, new zzgbe(this, null));
    }
}
