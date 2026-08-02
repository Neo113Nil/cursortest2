package d9;

import android.graphics.Rect;
import c9.C5769a;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbk;
import com.google.android.gms.internal.mlkit_vision_text_common.zzr;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzv;
import com.google.android.gms.internal.mlkit_vision_text_common.zzy;
import java.util.List;

/* loaded from: classes9.dex */
public final /* synthetic */ class k implements zzu {
    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
    public final Object zza(Object obj) {
        zzr zzrVar = (zzr) obj;
        zzv zzvVar = l.f61357a;
        List b11 = C6106d.b(zzrVar.zzb);
        String str = zzy.zzb(zzrVar.zzd) ? "" : zzrVar.zzd;
        Rect a11 = C6106d.a(b11);
        String str2 = zzy.zzb(zzrVar.zzf) ? "und" : zzrVar.zzf;
        float f7 = zzrVar.zzb.zze;
        return new C5769a.C0859a(str, a11, b11, str2, zzbk.zzh());
    }
}
