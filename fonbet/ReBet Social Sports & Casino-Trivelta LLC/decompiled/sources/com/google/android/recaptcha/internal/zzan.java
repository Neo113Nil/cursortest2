package com.google.android.recaptcha.internal;

import Ph.AbstractC1459k;
import Ph.AbstractC1488z;
import Ph.InterfaceC1484x;
import Ph.P;
import Ph.X;
import Wh.a;
import Wh.g;
import android.content.Context;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import java.util.Timer;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class zzan {
    public InterfaceC1484x zza;

    @NotNull
    private final P zzb;

    @NotNull
    private final zzek zzc;

    @NotNull
    private final StandardIntegrityManager zzd;
    private long zzf;
    private boolean zzh;

    @NotNull
    private zzao zze = zzao.zza;

    @NotNull
    private final a zzg = g.b(false, 1, null);

    public zzan(@NotNull Context context, @NotNull P p10, @NotNull zzek zzekVar, @NotNull StandardIntegrityManager standardIntegrityManager, long j10) {
        this.zzb = p10;
        this.zzc = zzekVar;
        this.zzd = standardIntegrityManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzi(Continuation continuation) {
        zzag zzagVar;
        int i10;
        if (continuation instanceof zzag) {
            zzagVar = (zzag) continuation;
            int i11 = zzagVar.zzc;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzagVar.zzc = i11 - Integer.MIN_VALUE;
                Object obj = zzagVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = zzagVar.zzc;
                if (i10 == 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                X zza = zzbx.zza(this.zzd.prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(this.zzf).build()));
                zzagVar.zzc = 1;
                Object await = zza.await(zzagVar);
                return await == coroutine_suspended ? coroutine_suspended : await;
            }
        }
        zzagVar = new zzag(this, continuation);
        Object obj2 = zzagVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = zzagVar.zzc;
        if (i10 == 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        if (r7 != r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r7 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzj(String str, Continuation continuation) {
        zzah zzahVar;
        int i10;
        if (continuation instanceof zzah) {
            zzahVar = (zzah) continuation;
            int i11 = zzahVar.zzc;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzahVar.zzc = i11 - Integer.MIN_VALUE;
                Object obj = zzahVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = zzahVar.zzc;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC1484x zzf = zzf();
                    zzahVar.zzd = str;
                    zzahVar.zzc = 1;
                    obj = zzf.await(zzahVar);
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ((StandardIntegrityManager.StandardIntegrityToken) obj).token();
                    }
                    str = zzahVar.zzd;
                    ResultKt.throwOnFailure(obj);
                }
                X zza = zzbx.zza(((StandardIntegrityManager.StandardIntegrityTokenProvider) obj).request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build()));
                zzahVar.zzd = null;
                zzahVar.zzc = 2;
                obj = zza.await(zzahVar);
            }
        }
        zzahVar = new zzah(this, continuation);
        Object obj2 = zzahVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = zzahVar.zzc;
        if (i10 != 0) {
        }
        X zza2 = zzbx.zza(((StandardIntegrityManager.StandardIntegrityTokenProvider) obj2).request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(str).build()));
        zzahVar.zzd = null;
        zzahVar.zzc = 2;
        obj2 = zza2.await(zzahVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (r8 != r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
    
        if (r2.zze(r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzc(@NotNull String str, @NotNull Continuation continuation) {
        zzaf zzafVar;
        int i10;
        zzan zzanVar;
        if (continuation instanceof zzaf) {
            zzafVar = (zzaf) continuation;
            int i11 = zzafVar.zzc;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzafVar.zzc = i11 - Integer.MIN_VALUE;
                Object obj = zzafVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = zzafVar.zzc;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        zzafVar.zzd = this;
                        zzafVar.zze = str;
                        zzafVar.zzc = 1;
                        obj = zzj(str, zzafVar);
                        if (obj != coroutine_suspended) {
                            zzanVar = this;
                        }
                    } catch (Exception unused) {
                        zzanVar = this;
                        zzafVar.zzd = zzanVar;
                        zzafVar.zze = str;
                        zzafVar.zzc = 2;
                    }
                    return coroutine_suspended;
                }
                if (i10 == 1) {
                    str = zzafVar.zze;
                    zzanVar = zzafVar.zzd;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception unused2) {
                        zzafVar.zzd = zzanVar;
                        zzafVar.zze = str;
                        zzafVar.zzc = 2;
                    }
                } else {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return (String) obj;
                    }
                    str = zzafVar.zze;
                    zzanVar = zzafVar.zzd;
                    ResultKt.throwOnFailure(obj);
                    zzafVar.zzd = null;
                    zzafVar.zze = null;
                    zzafVar.zzc = 3;
                    obj = zzanVar.zzj(str, zzafVar);
                }
                return (String) obj;
            }
        }
        zzafVar = new zzaf(this, continuation);
        Object obj2 = zzafVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = zzafVar.zzc;
        if (i10 != 0) {
        }
        return (String) obj2;
    }

    @Nullable
    public final Object zzd(long j10, @NotNull Continuation continuation) {
        this.zzf = j10;
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b3, code lost:
    
        if (kotlin.Unit.INSTANCE == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #0 {all -> 0x0062, blocks: (B:18:0x0052, B:20:0x005c, B:23:0x0065), top: B:17:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065 A[Catch: all -> 0x0062, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0062, blocks: (B:18:0x0052, B:20:0x005c, B:23:0x0065), top: B:17:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zze(@NotNull Continuation continuation) {
        zzak zzakVar;
        int i10;
        a aVar;
        zzan zzanVar;
        try {
            if (continuation instanceof zzak) {
                zzakVar = (zzak) continuation;
                int i11 = zzakVar.zzd;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    zzakVar.zzd = i11 - Integer.MIN_VALUE;
                    Object obj = zzakVar.zzb;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = zzakVar.zzd;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        aVar = this.zzg;
                        zzakVar.zze = this;
                        zzakVar.zza = aVar;
                        zzakVar.zzd = 1;
                        if (aVar.f(null, zzakVar) != coroutine_suspended) {
                            zzanVar = this;
                        }
                        return coroutine_suspended;
                    }
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    aVar = (a) zzakVar.zza;
                    zzanVar = zzakVar.zze;
                    ResultKt.throwOnFailure(obj);
                    if (Intrinsics.areEqual(zzanVar.zze, zzao.zza)) {
                        Unit unit = Unit.INSTANCE;
                        aVar.g(null);
                        return unit;
                    }
                    zzanVar.zze = zzao.zzb;
                    Unit unit2 = Unit.INSTANCE;
                    aVar.g(null);
                    zzek zzekVar = zzanVar.zzc;
                    zzekVar.zzc(zzekVar.zzd());
                    zzekVar.zzb(2);
                    zzen zzf = zzekVar.zzf(38);
                    zzanVar.zza = AbstractC1488z.b(null, 1, null);
                    AbstractC1459k.d(zzanVar.zzb, null, null, new zzam(zzanVar, zzf, null), 3, null);
                    zzakVar.zze = null;
                    zzakVar.zza = null;
                    zzakVar.zzd = 2;
                    if (!zzanVar.zzh) {
                        new Timer().schedule(new zzai(zzanVar), 28800000L, 28800000L);
                        zzanVar.zzh = true;
                    }
                }
            }
            if (Intrinsics.areEqual(zzanVar.zze, zzao.zza)) {
            }
        } catch (Throwable th2) {
            aVar.g(null);
            throw th2;
        }
        zzakVar = new zzak(this, continuation);
        Object obj2 = zzakVar.zzb;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = zzakVar.zzd;
        if (i10 != 0) {
        }
    }

    @NotNull
    public final InterfaceC1484x zzf() {
        InterfaceC1484x interfaceC1484x = this.zza;
        if (interfaceC1484x != null) {
            return interfaceC1484x;
        }
        return null;
    }
}
