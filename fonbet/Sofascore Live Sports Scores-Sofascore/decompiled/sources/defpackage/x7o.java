package defpackage;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcbr;
import com.google.android.gms.internal.ads.zzfdi;
import com.google.android.gms.internal.ads.zzhcy;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class x7o implements zzfdi {
    public final JSONObject a;

    public x7o(Context context) {
        this.a = zzcbr.b(context, VersionInfoParcel.forPackage());
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ddb zza() {
        return ((Boolean) zzba.zzc().a(zzbjg.Fd)).booleanValue() ? zzhcy.a(w7o.a) : zzhcy.a(new k6o(this, 3));
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 46;
    }
}
