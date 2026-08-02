package defpackage;

import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzao;
import com.google.android.gms.internal.measurement.zzas;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.measurement.zzn;
import com.google.android.gms.measurement.internal.zzht;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class cxo extends zzai {
    public final /* synthetic */ f0o c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxo(zzn zznVar, f0o f0oVar) {
        super("getValue");
        this.c = f0oVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao d(zzg zzgVar, List list) {
        zzh.a(2, "getValue", list);
        zzao b = zzgVar.b.b(zzgVar, (zzao) list.get(0));
        zzao b2 = zzgVar.b.b(zzgVar, (zzao) list.get(1));
        String zzc = b.zzc();
        f0o f0oVar = this.c;
        Map map = (Map) ((zzht) f0oVar.c).e.get((String) f0oVar.b);
        String str = (map == null || !map.containsKey(zzc)) ? null : (String) map.get(zzc);
        return str != null ? new zzas(str) : b2;
    }
}
