package com.google.android.recaptcha.internal;

import Ph.Q;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.coroutines.Continuation;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class zzff {

    @NotNull
    private final Lazy zza;

    @NotNull
    private final Lazy zzb;

    @NotNull
    private final Lazy zzc;

    public zzff() {
        int i10 = zzav.zza;
        this.zza = LazyKt.lazy(zzfc.zza);
        this.zzb = LazyKt.lazy(zzfd.zza);
        this.zzc = LazyKt.lazy(zzfe.zza);
    }

    public static final /* synthetic */ zzfk zzb(zzff zzffVar) {
        return (zzfk) zzffVar.zza.getValue();
    }

    public static /* synthetic */ Object zze(zzff zzffVar, zzsc zzscVar, zzek zzekVar, Continuation continuation) {
        try {
            String zzl = zzscVar.zzl();
            String zzM = zzscVar.zzM();
            zzaq zzf = zzffVar.zzf();
            String str = null;
            if (zzf != null && zzf.zzd(zzM)) {
                zzen zzf2 = zzekVar.zzf(25);
                try {
                    String zza = zzffVar.zzf().zza(zzM);
                    if (zza != null) {
                        zzf2.zza();
                        str = zza;
                    }
                } catch (Exception e10) {
                    zzf2.zzb(new zzbd(zzbb.zzk, zzba.zzR, e10.getMessage()));
                }
                zzf2.zzb(new zzbd(zzbb.zzk, zzba.zzS, null));
            }
            if (str == null) {
                zzaq zzf3 = zzffVar.zzf();
                if (zzf3 != null) {
                    zzf3.zzb();
                }
                zzen zzf4 = zzekVar.zzf(23);
                try {
                    String zzb = zzffVar.zzg().zzb(zzl);
                    zzf4.zza();
                    zzen zzf5 = zzekVar.zzf(24);
                    try {
                        zzaq zzf6 = zzffVar.zzf();
                        if (zzf6 != null) {
                            zzf6.zzc(zzM, zzb);
                        }
                        zzf5.zza();
                    } catch (Exception e11) {
                        zzf5.zzb(new zzbd(zzbb.zzk, zzba.zzT, e11.getMessage()));
                    }
                    str = zzb;
                } catch (zzbd e12) {
                    zzf4.zzb(e12);
                    throw e12;
                }
            }
            return StringsKt.replace$default(zzscVar.zzk(), "JAVASCRIPT_TAG", str, false, 4, (Object) null);
        } catch (Exception e13) {
            if (e13 instanceof zzbd) {
                throw e13;
            }
            throw new zzbd(zzbb.zzb, zzba.zzL, e13.getMessage());
        }
    }

    private final zzaq zzf() {
        return (zzaq) this.zzb.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzey zzg() {
        return (zzey) this.zzc.getValue();
    }

    @Nullable
    public final Object zzc(@NotNull String str, @NotNull zzto zztoVar, @NotNull Continuation continuation) {
        return Q.g(new zzfb(this, str, zztoVar, null), continuation);
    }

    @Nullable
    public final Object zzd(@NotNull zzsc zzscVar, @NotNull zzek zzekVar, @NotNull Continuation continuation) {
        return zze(this, zzscVar, zzekVar, continuation);
    }
}
