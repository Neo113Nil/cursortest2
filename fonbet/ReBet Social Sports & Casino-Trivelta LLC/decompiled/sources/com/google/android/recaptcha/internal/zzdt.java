package com.google.android.recaptcha.internal;

import Ph.AbstractC1449f;
import Ph.AbstractC1455i;
import Ph.F0;
import Ph.G0;
import Ph.f1;
import Ph.h1;
import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.recaptcha.RecaptchaAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class zzdt {

    @NotNull
    private final String zza;

    @NotNull
    private final zzek zzb;

    @NotNull
    private final zzl zzc;

    @NotNull
    private final Lazy zzd;

    @NotNull
    private final Lazy zze;

    @NotNull
    private final Lazy zzf;

    @NotNull
    private final Lazy zzg;

    @NotNull
    private final Lazy zzh;

    @NotNull
    private final zzbi zzi;

    public zzdt(@NotNull String str, @NotNull zzbi zzbiVar, @NotNull zzek zzekVar, @NotNull zzl zzlVar) {
        this.zza = str;
        this.zzi = zzbiVar;
        this.zzb = zzekVar;
        this.zzc = zzlVar;
        int i10 = zzav.zza;
        this.zzd = LazyKt.lazy(zzdm.zza);
        this.zze = LazyKt.lazy(zzdn.zza);
        this.zzf = LazyKt.lazy(zzdo.zza);
        this.zzg = LazyKt.lazy(zzdp.zza);
        this.zzh = LazyKt.lazy(zzdq.zza);
    }

    public static final /* synthetic */ zzbr zzd(zzdt zzdtVar) {
        return (zzbr) zzdtVar.zze.getValue();
    }

    public static final /* synthetic */ zzff zzg(zzdt zzdtVar) {
        return (zzff) zzdtVar.zzd.getValue();
    }

    public static final /* synthetic */ zzfj zzh(zzdt zzdtVar) {
        return (zzfj) zzdtVar.zzg.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Application zzr() {
        return (Application) this.zzh.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbd zzs(Exception exc, zzbd zzbdVar) {
        return !zzx() ? new zzbd(zzbb.zzc, zzba.zzao, exc.getMessage()) : zzbdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbf zzt() {
        return (zzbf) this.zzf.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzek zzu(String str) {
        zzek zza = this.zzb.zza();
        zza.zzc(str);
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzv(zzsc zzscVar, long j10, Continuation continuation) {
        zzdj zzdjVar;
        int i10;
        Object zzc;
        zzdt zzdtVar;
        Throwable m150exceptionOrNullimpl;
        if (continuation instanceof zzdj) {
            zzdjVar = (zzdj) continuation;
            int i11 = zzdjVar.zzd;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzdjVar.zzd = i11 - Integer.MIN_VALUE;
                zzdj zzdjVar2 = zzdjVar;
                Object obj = zzdjVar2.zzb;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = zzdjVar2.zzd;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    zzy(zzscVar.zzO());
                    Iterator it = zzw().iterator();
                    while (it.hasNext()) {
                        this.zzc.zzf((zze) it.next());
                    }
                    zzl zzlVar = this.zzc;
                    zzek zzekVar = this.zzb;
                    zzdjVar2.zza = this;
                    zzdjVar2.zzd = 1;
                    zzc = zzlVar.zzc(j10, zzscVar, zzekVar, zzdjVar2);
                    if (zzc != coroutine_suspended) {
                        zzdtVar = this;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th2 = (Throwable) zzdjVar2.zza;
                    ResultKt.throwOnFailure(obj);
                    throw th2;
                }
                zzdtVar = (zzdt) zzdjVar2.zza;
                ResultKt.throwOnFailure(obj);
                zzc = ((Result) obj).getValue();
                m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(zzc);
                if (m150exceptionOrNullimpl != null) {
                    return Unit.INSTANCE;
                }
                G0.j(zzdtVar.zzi.zzd().getCoroutineContext(), null, 1, null);
                List list = SequencesKt.toList(F0.n(zzdtVar.zzi.zzd().getCoroutineContext()).getChildren());
                zzdjVar2.zza = m150exceptionOrNullimpl;
                zzdjVar2.zzd = 2;
                if (AbstractC1449f.b(list, zzdjVar2) != coroutine_suspended) {
                    throw m150exceptionOrNullimpl;
                }
                return coroutine_suspended;
            }
        }
        zzdjVar = new zzdj(this, continuation);
        zzdj zzdjVar22 = zzdjVar;
        Object obj2 = zzdjVar22.zzb;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = zzdjVar22.zzd;
        if (i10 != 0) {
        }
        m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(zzc);
        if (m150exceptionOrNullimpl != null) {
        }
    }

    private final List zzw() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzv(zzr(), this.zzb.zza(), this.zzi, null, 8, null));
        arrayList.add(new zzja(this.zzb, this.zzi));
        return CollectionsKt.toList(arrayList);
    }

    private final boolean zzx() {
        NetworkCapabilities networkCapabilities;
        int i10 = zzav.zza;
        try {
            Object systemService = zzr().getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
                return false;
            }
            return networkCapabilities.hasCapability(16);
        } catch (Exception unused) {
            return false;
        }
    }

    private static final void zzy(String str) {
        try {
            zzrv zzj = zzrv.zzj(zzbt.zza(str));
            int i10 = zzav.zza;
            ((zzfu) LazyKt.lazy(zzde.zza).getValue()).zza(zzj);
        } catch (Exception e10) {
            throw new zzbd(zzbb.zzl, zzba.zzan, e10.getMessage());
        }
    }

    @NotNull
    public final zzsp zzi(@NotNull RecaptchaAction recaptchaAction, @NotNull zzsi zzsiVar, @NotNull zzsc zzscVar) {
        zzso zzf = zzsp.zzf();
        zzf.zzs(this.zza);
        zzf.zze(recaptchaAction.getAction());
        zzf.zzf(zzscVar.zzN());
        zzf.zzq(zzscVar.zzM());
        zzf.zzr(zzsiVar);
        return (zzsp) zzf.zzk();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzl(@NotNull String str, long j10, @NotNull Continuation continuation) {
        zzdd zzddVar;
        int i10;
        Exception e10;
        zzen zzenVar;
        zzbd e11;
        f1 e12;
        if (continuation instanceof zzdd) {
            zzddVar = (zzdd) continuation;
            int i11 = zzddVar.zzc;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzddVar.zzc = i11 - Integer.MIN_VALUE;
                Object obj = zzddVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = zzddVar.zzc;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    zzen zzf = zzu(str).zzf(27);
                    try {
                        zzl zzlVar = this.zzc;
                        zzddVar.zzd = zzf;
                        zzddVar.zzc = 1;
                        Object zzb = zzlVar.zzb(str, j10, zzddVar);
                        if (zzb == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = zzb;
                        zzenVar = zzf;
                    } catch (f1 e13) {
                        e12 = e13;
                        zzenVar = zzf;
                        zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzb, e12.getMessage());
                        zzenVar.zzb(zzbdVar);
                        throw zzbdVar;
                    } catch (zzbd e14) {
                        e11 = e14;
                        zzenVar = zzf;
                        zzenVar.zzb(e11);
                        throw e11;
                    } catch (Exception e15) {
                        e10 = e15;
                        zzenVar = zzf;
                        zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zzaa, e10.getMessage());
                        zzenVar.zzb(zzbdVar2);
                        throw zzbdVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzenVar = zzddVar.zzd;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (f1 e16) {
                        e12 = e16;
                        zzbd zzbdVar3 = new zzbd(zzbb.zzb, zzba.zzb, e12.getMessage());
                        zzenVar.zzb(zzbdVar3);
                        throw zzbdVar3;
                    } catch (zzbd e17) {
                        e11 = e17;
                        zzenVar.zzb(e11);
                        throw e11;
                    } catch (Exception e18) {
                        e10 = e18;
                        zzbd zzbdVar22 = new zzbd(zzbb.zzb, zzba.zzaa, e10.getMessage());
                        zzenVar.zzb(zzbdVar22);
                        throw zzbdVar22;
                    }
                }
                zzsi zzsiVar = (zzsi) obj;
                zzenVar.zza();
                return zzsiVar;
            }
        }
        zzddVar = new zzdd(this, continuation);
        Object obj2 = zzddVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = zzddVar.zzc;
        if (i10 != 0) {
        }
        zzsi zzsiVar2 = (zzsi) obj2;
        zzenVar.zza();
        return zzsiVar2;
    }

    @Nullable
    public final Object zzm(@NotNull zzsp zzspVar, @NotNull String str, long j10, @NotNull Continuation continuation) {
        return AbstractC1455i.g(this.zzi.zza().getCoroutineContext(), new zzdg(this, str, j10, zzspVar, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzn(@NotNull zzsc zzscVar, long j10, @NotNull Continuation continuation) {
        zzdk zzdkVar;
        int i10;
        try {
            if (continuation instanceof zzdk) {
                zzdkVar = (zzdk) continuation;
                int i11 = zzdkVar.zzc;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    zzdkVar.zzc = i11 - Integer.MIN_VALUE;
                    Object obj = zzdkVar.zza;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = zzdkVar.zzc;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        zzdl zzdlVar = new zzdl(this, zzscVar, j10, null);
                        zzdkVar.zzc = 1;
                        if (h1.c(j10, zzdlVar, zzdkVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
            if (i10 != 0) {
            }
            return Unit.INSTANCE;
        } catch (f1 e10) {
            throw new zzbd(zzbb.zzb, zzba.zzb, e10.getMessage());
        } catch (zzbd e11) {
            throw e11;
        } catch (Exception e12) {
            throw new zzbd(zzbb.zzb, zzba.zzap, e12.getMessage());
        }
        zzdkVar = new zzdk(this, continuation);
        Object obj2 = zzdkVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = zzdkVar.zzc;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzo(long j10, @NotNull Continuation continuation) {
        zzdr zzdrVar;
        int i10;
        Exception e10;
        zzen zzenVar;
        zzdt zzdtVar;
        zzbd e11;
        f1 e12;
        if (continuation instanceof zzdr) {
            zzdrVar = (zzdr) continuation;
            int i11 = zzdrVar.zzc;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzdrVar.zzc = i11 - Integer.MIN_VALUE;
                Object obj = zzdrVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = zzdrVar.zzc;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    zzen zzf = this.zzb.zzf(22);
                    try {
                        zzds zzdsVar = new zzds(this, zzf, null);
                        zzdrVar.zzd = this;
                        zzdrVar.zze = zzf;
                        zzdrVar.zzc = 1;
                        Object c10 = h1.c(j10, zzdsVar, zzdrVar);
                        if (c10 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = c10;
                        zzenVar = zzf;
                        zzdtVar = this;
                    } catch (f1 e13) {
                        e12 = e13;
                        zzenVar = zzf;
                        zzdtVar = this;
                        zzbd zzs = zzdtVar.zzs(e12, new zzbd(zzbb.zzc, zzba.zzb, e12.getMessage()));
                        zzenVar.zzb(zzs);
                        throw zzs;
                    } catch (zzbd e14) {
                        e11 = e14;
                        zzenVar = zzf;
                        zzdtVar = this;
                        if (Intrinsics.areEqual(e11.zzb(), zzbb.zzc)) {
                        }
                        zzenVar.zzb(e11);
                        throw e11;
                    } catch (Exception e15) {
                        e10 = e15;
                        zzenVar = zzf;
                        zzdtVar = this;
                        zzbd zzs2 = zzdtVar.zzs(e10, new zzbd(zzbb.zzc, zzba.zzaw, e10.getMessage()));
                        zzenVar.zzb(zzs2);
                        throw zzs2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzenVar = zzdrVar.zze;
                    zzdtVar = zzdrVar.zzd;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (f1 e16) {
                        e12 = e16;
                        zzbd zzs3 = zzdtVar.zzs(e12, new zzbd(zzbb.zzc, zzba.zzb, e12.getMessage()));
                        zzenVar.zzb(zzs3);
                        throw zzs3;
                    } catch (zzbd e17) {
                        e11 = e17;
                        if (Intrinsics.areEqual(e11.zzb(), zzbb.zzc)) {
                            e11 = zzdtVar.zzs(e11, e11);
                        }
                        zzenVar.zzb(e11);
                        throw e11;
                    } catch (Exception e18) {
                        e10 = e18;
                        zzbd zzs22 = zzdtVar.zzs(e10, new zzbd(zzbb.zzc, zzba.zzaw, e10.getMessage()));
                        zzenVar.zzb(zzs22);
                        throw zzs22;
                    }
                }
                return (zzsc) obj;
            }
        }
        zzdrVar = new zzdr(this, continuation);
        Object obj2 = zzdrVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = zzdrVar.zzc;
        if (i10 != 0) {
        }
        return (zzsc) obj2;
    }

    public final void zzq(@NotNull String str, @NotNull zzsr zzsrVar) {
        zzen zzf = zzu(str).zzf(29);
        try {
            List<zzst> zzk = zzsrVar.zzk();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(zzk, 10)), 16));
            for (zzst zzstVar : zzk) {
                Pair pair = TuplesKt.to(zzstVar.zzg(), zzstVar.zzi());
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            zzt().zzb(linkedHashMap);
            this.zzc.zzg(zzsrVar);
            zzf.zza();
        } catch (zzbd e10) {
            zzf.zzb(e10);
        } catch (Exception e11) {
            zzf.zzb(new zzbd(zzbb.zzb, zzba.zzas, e11.getMessage()));
        }
    }
}
