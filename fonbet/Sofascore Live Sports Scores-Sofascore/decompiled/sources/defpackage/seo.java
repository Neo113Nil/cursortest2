package defpackage;

import com.google.android.gms.internal.ads.zzavp;
import com.google.android.gms.internal.ads.zzgub;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class seo implements zzgub {
    public final /* synthetic */ int a;
    public final /* synthetic */ veo b;

    public /* synthetic */ seo(veo veoVar, int i) {
        this.a = i;
        this.b = veoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final Object apply(Object obj) {
        int i = this.a;
        veo veoVar = this.b;
        byte[] bArr = (byte[]) obj;
        switch (i) {
            case 0:
                veoVar.f(new zzavp(), bArr, false);
                break;
            default:
                veoVar.f(new zzavp(), bArr, true);
                break;
        }
        return null;
    }
}
