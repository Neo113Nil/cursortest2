package com.google.android.recaptcha.internal;

import Ph.AbstractC1455i;
import Ph.AbstractC1459k;
import Ph.AbstractC1488z;
import Ph.InterfaceC1484x;
import Ph.f1;
import android.app.Application;
import android.webkit.WebView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class zzja extends zze {
    public InterfaceC1484x zza;
    public zzfo zzb;

    @NotNull
    private final zzek zzc;
    private zzsc zzf;

    @NotNull
    private final zzek zzj;

    @NotNull
    private final Lazy zzk;

    @NotNull
    private final Lazy zzl;

    @NotNull
    private final Lazy zzm;

    @NotNull
    private final Lazy zzn;

    @NotNull
    private final Lazy zzo;

    @Nullable
    private zzen zzp;

    @NotNull
    private final zzbi zzq;

    @NotNull
    private final Map zzd = zzjb.zza();

    @NotNull
    private final Map zze = new LinkedHashMap();

    @NotNull
    private final zzcb zzg = new zzcb(zzje.zza);

    @NotNull
    private final zzjh zzh = zzjh.zzc();

    @NotNull
    private final zzij zzi = new zzij(this);

    public zzja(@NotNull zzek zzekVar, @NotNull zzbi zzbiVar) {
        this.zzc = zzekVar;
        this.zzq = zzbiVar;
        zzek zza = zzekVar.zza();
        zza.zzc(zzekVar.zzd());
        this.zzj = zza;
        int i10 = zzav.zza;
        this.zzk = LazyKt.lazy(zzis.zza);
        this.zzl = LazyKt.lazy(zzit.zza);
        this.zzm = LazyKt.lazy(zziu.zza);
        this.zzn = LazyKt.lazy(zziv.zza);
        this.zzo = LazyKt.lazy(zziw.zza);
    }

    private final Application zzD() {
        return (Application) this.zzo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzE(zzsc zzscVar, Continuation continuation) {
        zzim zzimVar;
        int i10;
        zzbd zzbdVar;
        zzja zzjaVar;
        if (continuation instanceof zzim) {
            zzimVar = (zzim) continuation;
            int i11 = zzimVar.zzc;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzimVar.zzc = i11 - Integer.MIN_VALUE;
                Object obj = zzimVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = zzimVar.zzc;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        zzff zzffVar = (zzff) this.zzn.getValue();
                        zzek zzekVar = this.zzj;
                        zzimVar.zzd = this;
                        zzimVar.zzc = 1;
                        obj = zzffVar.zzd(zzscVar, zzekVar, zzimVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        zzjaVar = this;
                    } catch (zzbd e10) {
                        zzbdVar = e10;
                        zzjaVar = this;
                        zzjaVar.zzA().k(zzbdVar);
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zzjaVar = zzimVar.zzd;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (zzbd e11) {
                        zzbdVar = e11;
                        zzjaVar.zzA().k(zzbdVar);
                        return Unit.INSTANCE;
                    }
                }
                AbstractC1459k.d(zzjaVar.zzq.zzb(), null, null, new zzin(zzjaVar, (String) obj, null), 3, null);
                return Unit.INSTANCE;
            }
        }
        zzimVar = new zzim(this, continuation);
        Object obj2 = zzimVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = zzimVar.zzc;
        if (i10 != 0) {
        }
        AbstractC1459k.d(zzjaVar.zzq.zzb(), null, null, new zzin(zzjaVar, (String) obj2, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|(1:(4:9|10|11|12)(2:28|29))(4:30|31|32|(1:34)(1:35))|13|14|15|16))|39|6|(0)(0)|13|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        r2 = r9;
        r9 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzF(String str, Continuation continuation) {
        zzio zzioVar;
        int i10;
        Exception exc;
        zzja zzjaVar;
        String str2;
        String str3;
        zzja zzjaVar2;
        zzen zzenVar;
        if (continuation instanceof zzio) {
            zzioVar = (zzio) continuation;
            int i11 = zzioVar.zzc;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzioVar.zzc = i11 - Integer.MIN_VALUE;
                Object obj = zzioVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = zzioVar.zzc;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    this.zzp = this.zzj.zzf(26);
                    try {
                        String zza = ((zzbr) this.zzl.getValue()).zza();
                        zzioVar.zzd = this;
                        zzioVar.zze = str;
                        zzioVar.zzf = zza;
                        zzioVar.zzc = 1;
                        Object zzw = zzw(zzioVar);
                        if (zzw == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str2 = str;
                        str3 = zza;
                        obj = zzw;
                        zzjaVar2 = this;
                    } catch (Exception e10) {
                        exc = e10;
                        zzjaVar = this;
                        zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzU, exc.getMessage());
                        zzenVar = zzjaVar.zzp;
                        if (zzenVar != null) {
                            zzenVar.zzb(zzbdVar);
                        }
                        zzjaVar.zzp = null;
                        zzjaVar.zzA().k(zzbdVar);
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str4 = zzioVar.zzf;
                    String str5 = zzioVar.zze;
                    zzjaVar = zzioVar.zzd;
                    try {
                        ResultKt.throwOnFailure(obj);
                        str3 = str4;
                        str2 = str5;
                        zzjaVar2 = zzjaVar;
                    } catch (Exception e11) {
                        exc = e11;
                        zzbd zzbdVar2 = new zzbd(zzbb.zzb, zzba.zzU, exc.getMessage());
                        zzenVar = zzjaVar.zzp;
                        if (zzenVar != null) {
                        }
                        zzjaVar.zzp = null;
                        zzjaVar.zzA().k(zzbdVar2);
                        return Unit.INSTANCE;
                    }
                }
                ((WebView) obj).loadDataWithBaseURL(str3, str2, "text/html", "utf-8", null);
                return Unit.INSTANCE;
            }
        }
        zzioVar = new zzio(this, continuation);
        Object obj2 = zzioVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = zzioVar.zzc;
        if (i10 != 0) {
        }
        ((WebView) obj2).loadDataWithBaseURL(str3, str2, "text/html", "utf-8", null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzG(String str, Continuation continuation) {
        zzix zzixVar;
        Object obj;
        int i10;
        zzja zzjaVar;
        zzja zzjaVar2;
        if (continuation instanceof zzix) {
            zzixVar = (zzix) continuation;
            int i11 = zzixVar.zzc;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzixVar.zzc = i11 - Integer.MIN_VALUE;
                obj = zzixVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = zzixVar.zzc;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    zzcb zzcbVar = this.zzg;
                    zzje[] zzjeVarArr = {zzje.zzd, zzje.zzc, zzje.zzb};
                    zzixVar.zzd = this;
                    zzixVar.zze = str;
                    zzixVar.zzc = 1;
                    obj = zzcbVar.zzb(zzjeVarArr, zzixVar);
                    if (obj != coroutine_suspended) {
                        zzjaVar = this;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = zzixVar.zze;
                    zzjaVar2 = zzixVar.zzd;
                    ResultKt.throwOnFailure(obj);
                    zzjaVar2.zza = AbstractC1488z.b(null, 1, null);
                    zzek zzekVar = zzjaVar2.zzj;
                    zzekVar.zzc(str);
                    AbstractC1459k.d(zzjaVar2.zzq.zza(), null, null, new zziz(zzjaVar2, zzekVar.zzf(42), null), 3, null);
                    return Unit.INSTANCE;
                }
                str = zzixVar.zze;
                zzjaVar = zzixVar.zzd;
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) obj).booleanValue()) {
                    return Unit.INSTANCE;
                }
                zzcb zzcbVar2 = zzjaVar.zzg;
                zzje zzjeVar = zzje.zzb;
                zzixVar.zzd = zzjaVar;
                zzixVar.zze = str;
                zzixVar.zzc = 2;
                if (zzcbVar2.zzc(zzjeVar, zzixVar) != coroutine_suspended) {
                    zzjaVar2 = zzjaVar;
                    zzjaVar2.zza = AbstractC1488z.b(null, 1, null);
                    zzek zzekVar2 = zzjaVar2.zzj;
                    zzekVar2.zzc(str);
                    AbstractC1459k.d(zzjaVar2.zzq.zza(), null, null, new zziz(zzjaVar2, zzekVar2.zzf(42), null), 3, null);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
        }
        zzixVar = new zzix(this, continuation);
        obj = zzixVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = zzixVar.zzc;
        if (i10 != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    public static final /* synthetic */ zzfk zzp(zzja zzjaVar) {
        return (zzfk) zzjaVar.zzm.getValue();
    }

    @NotNull
    public final InterfaceC1484x zzA() {
        InterfaceC1484x interfaceC1484x = this.zza;
        if (interfaceC1484x != null) {
            return interfaceC1484x;
        }
        return null;
    }

    @NotNull
    public final zzft zzC(@NotNull zzsc zzscVar, @NotNull zzcg zzcgVar, @NotNull WebView webView) {
        zzfw zzfwVar = new zzfw(webView, this.zzq.zzb());
        zzhy zzhyVar = new zzhy();
        zzhyVar.zzb(CollectionsKt.toLongArray(zzscVar.zzP()));
        zzgf zzgfVar = new zzgf(zzfwVar, zzcgVar, new zzbo());
        zzhz zzhzVar = new zzhz(zzhyVar, new zzhw());
        zzgfVar.zze(3, zzD());
        zzgfVar.zze(5, zzig.zza());
        zzgfVar.zze(6, new zzia(zzD()));
        zzgfVar.zze(7, new zzic());
        zzgfVar.zze(8, new zzii(zzD()));
        zzgfVar.zze(9, new zzid(zzD()));
        zzgfVar.zze(10, new zzib(zzD()));
        return new zzft(this.zzq.zzd(), zzgfVar, zzhzVar, zzfn.zza());
    }

    @Override // com.google.android.recaptcha.internal.zze
    @NotNull
    public final zzen zza(@NotNull String str) {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(str);
        return zzekVar.zzf(33);
    }

    @Override // com.google.android.recaptcha.internal.zze
    @NotNull
    public final zzen zzb() {
        zzek zzekVar = this.zzc;
        zzekVar.zzc(zzekVar.zzd());
        return zzekVar.zzf(32);
    }

    @Override // com.google.android.recaptcha.internal.zze
    @Nullable
    public final Object zzd(@NotNull String str, @NotNull Continuation continuation) {
        zzsh zzf = zzsi.zzf();
        zzf.zze(str);
        return zzf.zzk();
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c6, code lost:
    
        if (r8.zzG(r4, r2) != r3) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // com.google.android.recaptcha.internal.zze
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzf(@NotNull String str, @NotNull Continuation continuation) {
        zzip zzipVar;
        Object obj;
        int i10;
        String str2;
        zzja zzjaVar;
        zzja zzjaVar2;
        zzja zzjaVar3;
        String str3;
        zzja zzjaVar4;
        InterfaceC1484x zzA;
        zzja zzjaVar5;
        InterfaceC1484x interfaceC1484x;
        if (continuation instanceof zzip) {
            zzipVar = (zzip) continuation;
            int i11 = zzipVar.zzc;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzipVar.zzc = i11 - Integer.MIN_VALUE;
                obj = zzipVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = zzipVar.zzc;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    zzcb zzcbVar = this.zzg;
                    zzje zzjeVar = zzje.zzd;
                    zzipVar.zzd = this;
                    zzipVar.zze = str;
                    zzipVar.zzc = 1;
                    obj = zzcbVar.zza(zzjeVar, zzipVar);
                    if (obj != coroutine_suspended) {
                        str2 = str;
                        zzjaVar = this;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 == 2) {
                        str2 = zzipVar.zze;
                        zzjaVar2 = zzipVar.zzd;
                        ResultKt.throwOnFailure(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            zzipVar.zzd = zzjaVar2;
                            zzipVar.zze = str2;
                            zzipVar.zzc = 3;
                        }
                        zzjaVar3 = zzjaVar2;
                        zzA = zzjaVar3.zzA();
                        zzipVar.zzd = zzjaVar3;
                        zzipVar.zze = str2;
                        zzipVar.zzc = 4;
                        if (zzA.await(zzipVar) != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (i10 == 3) {
                        str2 = zzipVar.zze;
                        zzjaVar3 = zzipVar.zzd;
                        ResultKt.throwOnFailure(obj);
                        try {
                            zzA = zzjaVar3.zzA();
                            zzipVar.zzd = zzjaVar3;
                            zzipVar.zze = str2;
                            zzipVar.zzc = 4;
                            if (zzA.await(zzipVar) != coroutine_suspended) {
                                zzjaVar5 = zzjaVar3;
                                InterfaceC1484x b10 = AbstractC1488z.b(null, 1, null);
                                zzjaVar5.zze.put(str2, b10);
                                zztp zzf = zztq.zzf();
                                zzf.zze(str2);
                                byte[] zzd = ((zztq) zzf.zzk()).zzd();
                                AbstractC1459k.d(zzjaVar5.zzq.zzb(), null, null, new zziq(zzjaVar5, zzkh.zzh().zzi(zzd, 0, zzd.length), null), 3, null);
                                zzipVar.zzd = zzjaVar5;
                                zzipVar.zze = str2;
                                zzipVar.zzc = 5;
                                obj = b10.await(zzipVar);
                                if (obj != coroutine_suspended) {
                                }
                            }
                            return coroutine_suspended;
                        } catch (Exception e10) {
                            e = e10;
                            str3 = str2;
                            zzjaVar4 = zzjaVar3;
                            zzbd zza = zzf.zza(e, new zzbd(zzbb.zzb, zzba.zzW, e.getMessage()));
                            interfaceC1484x = (InterfaceC1484x) zzjaVar4.zze.remove(str3);
                            if (interfaceC1484x != null) {
                            }
                            Result.Companion companion = Result.INSTANCE;
                            return Result.m147constructorimpl(ResultKt.createFailure(zza));
                        }
                    }
                    if (i10 != 4) {
                        if (i10 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str3 = zzipVar.zze;
                        zzjaVar4 = zzipVar.zzd;
                        try {
                            ResultKt.throwOnFailure(obj);
                            zzsi zzsiVar = (zzsi) obj;
                            zzsh zzf2 = zzsi.zzf();
                            zzf2.zze(str3);
                            zzsl zzf3 = zzsm.zzf();
                            zzf3.zze(zzsiVar.zzl());
                            zzf2.zzq(zzf3);
                            zzsj zzf4 = zzsk.zzf();
                            zzf4.zze(zzsiVar.zzj());
                            zzf4.zzf(zzsiVar.zzM());
                            zzf2.zzr(zzf4);
                            Result.Companion companion2 = Result.INSTANCE;
                            return Result.m147constructorimpl(zzf2.zzk());
                        } catch (Exception e11) {
                            e = e11;
                            zzbd zza2 = zzf.zza(e, new zzbd(zzbb.zzb, zzba.zzW, e.getMessage()));
                            interfaceC1484x = (InterfaceC1484x) zzjaVar4.zze.remove(str3);
                            if (interfaceC1484x != null) {
                                Boxing.boxBoolean(interfaceC1484x.k(zza2));
                            }
                            Result.Companion companion3 = Result.INSTANCE;
                            return Result.m147constructorimpl(ResultKt.createFailure(zza2));
                        }
                    }
                    str2 = zzipVar.zze;
                    zzjaVar5 = zzipVar.zzd;
                    try {
                        ResultKt.throwOnFailure(obj);
                        InterfaceC1484x b102 = AbstractC1488z.b(null, 1, null);
                        zzjaVar5.zze.put(str2, b102);
                        zztp zzf5 = zztq.zzf();
                        zzf5.zze(str2);
                        byte[] zzd2 = ((zztq) zzf5.zzk()).zzd();
                        AbstractC1459k.d(zzjaVar5.zzq.zzb(), null, null, new zziq(zzjaVar5, zzkh.zzh().zzi(zzd2, 0, zzd2.length), null), 3, null);
                        zzipVar.zzd = zzjaVar5;
                        zzipVar.zze = str2;
                        zzipVar.zzc = 5;
                        obj = b102.await(zzipVar);
                        if (obj != coroutine_suspended) {
                            str3 = str2;
                            zzjaVar4 = zzjaVar5;
                            zzsi zzsiVar2 = (zzsi) obj;
                            zzsh zzf22 = zzsi.zzf();
                            zzf22.zze(str3);
                            zzsl zzf32 = zzsm.zzf();
                            zzf32.zze(zzsiVar2.zzl());
                            zzf22.zzq(zzf32);
                            zzsj zzf42 = zzsk.zzf();
                            zzf42.zze(zzsiVar2.zzj());
                            zzf42.zzf(zzsiVar2.zzM());
                            zzf22.zzr(zzf42);
                            Result.Companion companion22 = Result.INSTANCE;
                            return Result.m147constructorimpl(zzf22.zzk());
                        }
                        return coroutine_suspended;
                    } catch (Exception e12) {
                        e = e12;
                        str3 = str2;
                        zzjaVar4 = zzjaVar5;
                        zzbd zza22 = zzf.zza(e, new zzbd(zzbb.zzb, zzba.zzW, e.getMessage()));
                        interfaceC1484x = (InterfaceC1484x) zzjaVar4.zze.remove(str3);
                        if (interfaceC1484x != null) {
                        }
                        Result.Companion companion32 = Result.INSTANCE;
                        return Result.m147constructorimpl(ResultKt.createFailure(zza22));
                    }
                }
                str2 = zzipVar.zze;
                zzjaVar = zzipVar.zzd;
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) obj).booleanValue()) {
                    zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzav, null);
                    Result.Companion companion4 = Result.INSTANCE;
                    return Result.m147constructorimpl(ResultKt.createFailure(zzbdVar));
                }
                zzcb zzcbVar2 = zzjaVar.zzg;
                zzje zzjeVar2 = zzje.zzc;
                zzipVar.zzd = zzjaVar;
                zzipVar.zze = str2;
                zzipVar.zzc = 2;
                obj = zzcbVar2.zza(zzjeVar2, zzipVar);
                if (obj != coroutine_suspended) {
                    zzjaVar2 = zzjaVar;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                    zzjaVar3 = zzjaVar2;
                    zzA = zzjaVar3.zzA();
                    zzipVar.zzd = zzjaVar3;
                    zzipVar.zze = str2;
                    zzipVar.zzc = 4;
                    if (zzA.await(zzipVar) != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
        }
        zzipVar = new zzip(this, continuation);
        obj = zzipVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = zzipVar.zzc;
        if (i10 != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    @Override // com.google.android.recaptcha.internal.zze
    @Nullable
    public final Object zzg(@NotNull zzbd zzbdVar, @NotNull Continuation continuation) {
        if (Intrinsics.areEqual(zzbdVar.zza(), zzba.zzb)) {
            zzen zzenVar = this.zzp;
            if (zzenVar != null) {
                zzenVar.zzb(zzbdVar);
            }
            this.zzp = null;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (zzG(r6, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        if (r6.zzc(r7, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.google.android.recaptcha.internal.zze
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object zzh(@NotNull zzsc zzscVar, @NotNull Continuation continuation) {
        zzir zzirVar;
        int i10;
        if (continuation instanceof zzir) {
            zzirVar = (zzir) continuation;
            int i11 = zzirVar.zzc;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                zzirVar.zzc = i11 - Integer.MIN_VALUE;
                Object obj = zzirVar.zza;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = zzirVar.zzc;
                if (i10 == 0) {
                    if (i10 == 1) {
                        ResultKt.throwOnFailure(obj);
                        Result.Companion companion = Result.INSTANCE;
                        return Result.m147constructorimpl(ResultKt.createFailure(new zzbd(zzbb.zzb, zzba.zzav, null)));
                    }
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    Result.Companion companion2 = Result.INSTANCE;
                    return Result.m147constructorimpl(Unit.INSTANCE);
                }
                ResultKt.throwOnFailure(obj);
                if (zzscVar.zzT() && zzscVar.zzR() && zzscVar.zzQ()) {
                    this.zzf = zzscVar;
                    String zzd = this.zzc.zzd();
                    zzirVar.zzc = 2;
                } else {
                    zzcb zzcbVar = this.zzg;
                    zzje zzjeVar = zzje.zzd;
                    zzirVar.zzc = 1;
                }
                return coroutine_suspended;
            }
        }
        zzirVar = new zzir(this, continuation);
        Object obj2 = zzirVar.zza;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = zzirVar.zzc;
        if (i10 == 0) {
        }
    }

    @Override // com.google.android.recaptcha.internal.zze
    @Nullable
    public final Object zzi(@NotNull String str, long j10, @NotNull Exception exc, @NotNull Continuation continuation) {
        exc.getMessage();
        InterfaceC1484x interfaceC1484x = (InterfaceC1484x) this.zze.remove(str);
        if (interfaceC1484x != null) {
            Boxing.boxBoolean(interfaceC1484x.k(exc));
        }
        return Unit.INSTANCE;
    }

    @Override // com.google.android.recaptcha.internal.zze
    @Nullable
    public final Object zzj(@NotNull Exception exc, @NotNull Continuation continuation) {
        return ((exc instanceof f1) && this.zzi.zza() == null) ? new zzbd(zzbb.zzc, zzba.zzH, null) : zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzV, exc.getMessage()));
    }

    @NotNull
    public final zzcb zzm() {
        return this.zzg;
    }

    @NotNull
    public final zzij zzq() {
        return this.zzi;
    }

    @Nullable
    public final Object zzw(@NotNull Continuation continuation) {
        return AbstractC1455i.g(this.zzq.zzb().getCoroutineContext(), new zzjc((zzjd) this.zzk.getValue(), zzD(), null), continuation);
    }

    @Nullable
    public final Object zzx(@NotNull Continuation continuation) {
        Object g10 = AbstractC1455i.g(this.zzq.zzb().getCoroutineContext(), new zzil(this, null), continuation);
        return g10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? g10 : Unit.INSTANCE;
    }
}
