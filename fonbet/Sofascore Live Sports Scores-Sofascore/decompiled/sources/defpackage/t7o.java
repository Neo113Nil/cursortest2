package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzeez;
import com.google.android.gms.internal.ads.zzfdi;
import com.google.android.gms.internal.ads.zzhdi;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class t7o implements zzfdi {
    public final zzhdi a;
    public final Context b;
    public final zzeez c;
    public final String d;

    public t7o(zzhdi zzhdiVar, Context context, zzeez zzeezVar, String str) {
        this.a = zzhdiVar;
        this.b = context;
        this.c = zzeezVar;
        this.d = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        return this.a.submit(new q7o(this, 5));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 38;
    }
}
