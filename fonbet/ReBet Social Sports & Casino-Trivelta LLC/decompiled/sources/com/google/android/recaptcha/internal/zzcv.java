package com.google.android.recaptcha.internal;

import Wh.a;
import Wh.g;
import android.app.Application;
import java.util.Map;
import java.util.UUID;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l0.AbstractC5338c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class zzcv {

    @NotNull
    private final Application zza;

    @Nullable
    private zzdc zzc;

    @NotNull
    private final zzl zze;

    @NotNull
    private final a zzb = g.b(false, 1, null);

    @NotNull
    private final String zzd = UUID.randomUUID().toString();

    @NotNull
    private zzbi zzf = new zzbi();

    /* JADX WARN: Multi-variable type inference failed */
    public zzcv(@NotNull Application application) {
        Map map;
        Map map2;
        this.zza = application;
        int i10 = 1;
        this.zze = new zzl(null, i10, 0 == true ? 1 : 0);
        int i11 = zzav.zza;
        zzaw[] zzawVarArr = {new zzaw(zzaz.class.getName().hashCode(), new zzaz(null, 1, null)), new zzaw(zzfu.class.getName().hashCode(), new zzfu()), new zzaw(zzbe.class.getName().hashCode(), new zzbe()), new zzaw(zzjd.class.getName().hashCode(), new zzjd()), new zzaw(zzbr.class.getName().hashCode(), new zzbr("https://www.recaptcha.net/recaptcha/api3")), new zzaw(zzex.class.getName().hashCode(), new zzex(0 == true ? 1 : 0, i10, 0 == true ? 1 : 0)), new zzaw(zzfk.class.getName().hashCode(), new zzfk(true)), new zzaw(Application.class.getName().hashCode(), application), new zzaw(zzbf.class.getName().hashCode(), new zzbf(application)), new zzaw(zzfj.class.getName().hashCode(), new zzfj()), new zzaw(zzaq.class.getName().hashCode(), new zzbm(application)), new zzaw(zzey.class.getName().hashCode(), new zzfa()), new zzaw(zzff.class.getName().hashCode(), new zzff())};
        for (int i12 = 0; i12 < 13; i12++) {
            zzaw zzawVar = zzawVarArr[i12];
            map = zzav.zzc;
            if (!map.containsKey(Integer.valueOf(zzawVar.zza()))) {
                map2 = zzav.zzc;
                map2.put(Integer.valueOf(zzawVar.zza()), zzawVar);
            }
        }
    }

    public static final /* synthetic */ zzdc zza(zzcv zzcvVar, String str) {
        zzdc zzdcVar = zzcvVar.zzc;
        if (zzdcVar == null) {
            return null;
        }
        if (Intrinsics.areEqual(zzdcVar.zzd(), str)) {
            return zzdcVar;
        }
        throw new zzbd(zzbb.zzd, zzba.zzam, null);
    }

    public static final /* synthetic */ void zzc(zzcv zzcvVar, long j10) {
        if (j10 < 5000) {
            throw new zzbd(zzbb.zzj, zzba.zzI, null);
        }
        if (AbstractC5338c.checkSelfPermission(zzcvVar.zza, "android.permission.INTERNET") != 0) {
            throw new zzbd(zzbb.zzc, zzba.zzao, null);
        }
    }

    public static final /* synthetic */ zzcn zze(zzcv zzcvVar, String str, zzbi zzbiVar, zzch zzchVar, zzek zzekVar) {
        zzdt zzdtVar = new zzdt(str, zzbiVar, zzekVar, zzcvVar.zze);
        return Intrinsics.areEqual(zzchVar, zzch.zza) ? new zzef(zzdtVar) : new zzec(zzdtVar, zzbiVar, zzekVar, new zzbo());
    }

    public static /* synthetic */ Object zzh(zzcv zzcvVar, String str, long j10, zzcn zzcnVar, zzbi zzbiVar, zzch zzchVar, Continuation continuation, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            zzbiVar = zzcvVar.zzf;
        }
        zzbi zzbiVar2 = zzbiVar;
        if ((i10 & 16) != 0) {
            zzchVar = zzch.zza;
        }
        zzch zzchVar2 = zzchVar;
        if ((i10 & 2) != 0) {
            j10 = 10000;
        }
        return zzcvVar.zzg(str, j10, null, zzbiVar2, zzchVar2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzj(String str, int i10, Function2 function2, Continuation continuation) {
        zzcu zzcuVar;
        int i11;
        Exception e10;
        zzen zzenVar;
        zzbd e11;
        if (continuation instanceof zzcu) {
            zzcuVar = (zzcu) continuation;
            int i12 = zzcuVar.zzc;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                zzcuVar.zzc = i12 - Integer.MIN_VALUE;
                Object obj = zzcuVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i11 = zzcuVar.zzc;
                if (i11 != 0) {
                    ResultKt.throwOnFailure(obj);
                    zzek zzk = zzk(str, this.zzf, i10);
                    zzen zzf = zzk.zzf(6);
                    try {
                        zzcuVar.zzd = zzf;
                        zzcuVar.zzc = 1;
                        obj = function2.invoke(zzk, zzcuVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        zzenVar = zzf;
                    } catch (zzbd e12) {
                        e11 = e12;
                        zzenVar = zzf;
                        zzenVar.zzb(e11);
                        throw e11.zzc();
                    } catch (Exception e13) {
                        e10 = e13;
                        zzenVar = zzf;
                        zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zza, e10.getMessage());
                        zzenVar.zzb(zzbdVar);
                        throw zzbdVar.zzc();
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzenVar = zzcuVar.zzd;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (zzbd e14) {
                        e11 = e14;
                        zzenVar.zzb(e11);
                        throw e11.zzc();
                    } catch (Exception e15) {
                        e10 = e15;
                        zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zza, e10.getMessage());
                        zzenVar.zzb(zzbdVar2);
                        throw zzbdVar2.zzc();
                    }
                }
                zzenVar.zza();
                return obj;
            }
        }
        zzcuVar = new zzcu(this, continuation);
        Object obj2 = zzcuVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i11 = zzcuVar.zzc;
        if (i11 != 0) {
        }
        zzenVar.zza();
        return obj2;
    }

    private final zzek zzk(String str, zzbi zzbiVar, int i10) {
        String uuid = UUID.randomUUID().toString();
        int i11 = zzav.zza;
        zzes zzesVar = new zzes(this.zza, new zzeu(((zzbr) LazyKt.lazy(zzcr.zza).getValue()).zzc()), zzbiVar.zza());
        zzek zzekVar = new zzek(str, this.zzd, uuid, i10, this.zza, zzesVar, null);
        zzekVar.zzc(uuid);
        return zzekVar;
    }

    @NotNull
    public final zzbi zzd() {
        return this.zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e A[Catch: all -> 0x00bc, TryCatch #1 {all -> 0x00bc, blocks: (B:25:0x0084, B:28:0x0099, B:33:0x008e), top: B:24:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzg(@NotNull String str, long j10, @Nullable zzcn zzcnVar, @NotNull zzbi zzbiVar, @NotNull zzch zzchVar, @NotNull Continuation continuation) {
        zzcs zzcsVar;
        Object obj;
        Object coroutine_suspended;
        int i10;
        zzbi zzbiVar2;
        zzch zzchVar2;
        long j11;
        zzcv zzcvVar;
        String str2;
        a aVar;
        a aVar2;
        try {
            if (continuation instanceof zzcs) {
                zzcsVar = (zzcs) continuation;
                int i11 = zzcsVar.zzg;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    zzcsVar.zzg = i11 - Integer.MIN_VALUE;
                    obj = zzcsVar.zze;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = zzcsVar.zzg;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        a aVar3 = this.zzb;
                        zzcsVar.zza = this;
                        zzcsVar.zzh = str;
                        zzcsVar.zzb = null;
                        zzcsVar.zzj = zzbiVar;
                        zzcsVar.zzi = zzchVar;
                        zzcsVar.zzc = aVar3;
                        zzcsVar.zzd = j10;
                        zzcsVar.zzg = 1;
                        if (aVar3.f(null, zzcsVar) != coroutine_suspended) {
                            zzbiVar2 = zzbiVar;
                            zzchVar2 = zzchVar;
                            j11 = j10;
                            zzcvVar = this;
                            str2 = str;
                            aVar = aVar3;
                        }
                        return coroutine_suspended;
                    }
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar2 = (a) zzcsVar.zza;
                        try {
                            ResultKt.throwOnFailure(obj);
                            zzdc zzdcVar = (zzdc) obj;
                            aVar2.g(null);
                            return zzdcVar;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar2.g(null);
                            throw th;
                        }
                    }
                    long j12 = zzcsVar.zzd;
                    a aVar4 = (a) zzcsVar.zzc;
                    zzch zzchVar3 = zzcsVar.zzi;
                    zzbi zzbiVar3 = zzcsVar.zzj;
                    String str3 = zzcsVar.zzh;
                    zzcv zzcvVar2 = (zzcv) zzcsVar.zza;
                    ResultKt.throwOnFailure(obj);
                    zzchVar2 = zzchVar3;
                    zzbiVar2 = zzbiVar3;
                    str2 = str3;
                    zzcvVar = zzcvVar2;
                    j11 = j12;
                    aVar = aVar4;
                    int i12 = !Intrinsics.areEqual(zzchVar2, zzch.zza) ? 3 : Intrinsics.areEqual(zzchVar2, zzch.zzb) ? 4 : 2;
                    zzct zzctVar = new zzct(zzcvVar, str2, j11, null, zzbiVar2, zzchVar2, null);
                    zzcsVar.zza = aVar;
                    zzcsVar.zzh = null;
                    zzcsVar.zzb = null;
                    zzcsVar.zzj = null;
                    zzcsVar.zzi = null;
                    zzcsVar.zzc = null;
                    zzcsVar.zzg = 2;
                    obj = zzcvVar.zzj(str2, i12, zzctVar, zzcsVar);
                    if (obj != coroutine_suspended) {
                        aVar2 = aVar;
                        zzdc zzdcVar2 = (zzdc) obj;
                        aVar2.g(null);
                        return zzdcVar2;
                    }
                    return coroutine_suspended;
                }
            }
            if (!Intrinsics.areEqual(zzchVar2, zzch.zza)) {
            }
            zzct zzctVar2 = new zzct(zzcvVar, str2, j11, null, zzbiVar2, zzchVar2, null);
            zzcsVar.zza = aVar;
            zzcsVar.zzh = null;
            zzcsVar.zzb = null;
            zzcsVar.zzj = null;
            zzcsVar.zzi = null;
            zzcsVar.zzc = null;
            zzcsVar.zzg = 2;
            obj = zzcvVar.zzj(str2, i12, zzctVar2, zzcsVar);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            th = th3;
            aVar2 = aVar;
            aVar2.g(null);
            throw th;
        }
        zzcsVar = new zzcs(this, continuation);
        obj = zzcsVar.zze;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = zzcsVar.zzg;
        if (i10 != 0) {
        }
    }
}
