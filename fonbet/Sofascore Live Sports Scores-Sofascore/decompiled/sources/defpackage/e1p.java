package defpackage;

import com.google.android.gms.internal.measurement.zzah;
import com.google.android.gms.internal.measurement.zzai;
import com.google.android.gms.internal.measurement.zzao;
import com.google.android.gms.internal.measurement.zzg;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class e1p extends zzai {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1p(String str, int i) {
        super(str);
        this.c = i;
    }

    @Override // com.google.android.gms.internal.measurement.zzai
    public final zzao d(zzg zzgVar, List list) {
        switch (this.c) {
            case 0:
            case 1:
                return this;
            default:
                return new zzah(Double.valueOf(0.0d));
        }
    }
}
