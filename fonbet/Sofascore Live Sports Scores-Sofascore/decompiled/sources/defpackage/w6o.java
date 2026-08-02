package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzfdg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class w6o implements zzfdg {
    public final String a;
    public final String b;
    public final Bundle c;

    public /* synthetic */ w6o(String str, String str2, Bundle bundle) {
        this.a = str;
        this.b = str2;
        this.c = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("consent_string", this.a);
        bundle.putString("fc_consent", this.b);
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putBundle("iab_consent_info", bundle2);
        }
    }
}
