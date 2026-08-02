package defpackage;

import com.google.android.gms.internal.ads.zzhfj;
import com.google.android.gms.internal.ads.zzhfm;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class fno extends zzhfj {
    public final String a;
    public final zzhfm b;

    public /* synthetic */ fno(String str, zzhfm zzhfmVar) {
        this.a = str;
        this.b = zzhfmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean a() {
        return this.b != zzhfm.e;
    }

    public final String toString() {
        return bf3.k("(typeUrl=", this.a, ", outputPrefixType=", this.b.a, ")");
    }
}
