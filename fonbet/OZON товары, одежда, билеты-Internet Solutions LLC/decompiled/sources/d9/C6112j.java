package d9;

import android.graphics.Rect;
import c9.C5769a;
import com.google.android.gms.internal.mlkit_vision_text_common.zzbu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzl;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import com.google.android.gms.internal.mlkit_vision_text_common.zzv;
import com.google.android.gms.internal.mlkit_vision_text_common.zzy;
import java.util.Arrays;
import java.util.List;

/* renamed from: d9.j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C6112j implements zzu {
    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
    public final Object zza(Object obj) {
        zzl zzlVar = (zzl) obj;
        zzv zzvVar = l.f61357a;
        List b11 = C6106d.b(zzlVar.zzb);
        String str = zzy.zzb(zzlVar.zze) ? "" : zzlVar.zze;
        Rect a11 = C6106d.a(b11);
        String str2 = zzy.zzb(zzlVar.zzg) ? "und" : zzlVar.zzg;
        List zza = zzbu.zza(Arrays.asList(zzlVar.zza), new k());
        float f7 = zzlVar.zzb.zze;
        return new C5769a.b(str, a11, b11, str2, zza);
    }
}
