package com.google.android.gms.internal.measurement;

import com.unity3d.services.core.fid.Constants;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.2 */
/* loaded from: classes6.dex */
final class zzma implements zzmu {
    private static final zzmg zza = new zzly();
    private final zzmg zzb;

    public zzma() {
        zzmg zzmgVar;
        zzmg[] zzmgVarArr = new zzmg[2];
        zzmgVarArr[0] = zzkw.zza();
        try {
            zzmgVar = (zzmg) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzmgVar = zza;
        }
        zzmgVarArr[1] = zzmgVar;
        zzlz zzlzVar = new zzlz(zzmgVarArr);
        byte[] bArr = zzlj.zzd;
        this.zzb = zzlzVar;
    }

    private static boolean zzb(zzmf zzmfVar) {
        return zzmfVar.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzmu
    public final zzmt zza(Class cls) {
        zzmv.zzD(cls);
        zzmf zzb = this.zzb.zzb(cls);
        return zzb.zzb() ? zzlb.class.isAssignableFrom(cls) ? zzmm.zzc(zzmv.zzA(), zzkq.zzb(), zzb.zza()) : zzmm.zzc(zzmv.zzy(), zzkq.zza(), zzb.zza()) : zzlb.class.isAssignableFrom(cls) ? zzb(zzb) ? zzml.zzl(cls, zzb, zzmo.zzb(), zzlw.zzd(), zzmv.zzA(), zzkq.zzb(), zzme.zzb()) : zzml.zzl(cls, zzb, zzmo.zzb(), zzlw.zzd(), zzmv.zzA(), null, zzme.zzb()) : zzb(zzb) ? zzml.zzl(cls, zzb, zzmo.zza(), zzlw.zzc(), zzmv.zzy(), zzkq.zza(), zzme.zza()) : zzml.zzl(cls, zzb, zzmo.zza(), zzlw.zzc(), zzmv.zzz(), null, zzme.zza());
    }
}
