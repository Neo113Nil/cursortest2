package defpackage;

import android.graphics.Rect;
import com.google.android.gms.internal.ads.zzbff;
import com.google.android.gms.internal.ads.zzbfg;
import com.google.android.gms.internal.ads.zzclm;
import com.ironsource.C4018c8;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1o implements zzbfg {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzclm b;

    public /* synthetic */ a1o(zzclm zzclmVar, int i) {
        this.a = i;
        this.b = zzclmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfg
    public final /* synthetic */ void A(zzbff zzbffVar) {
        int i = this.a;
        zzclm zzclmVar = this.b;
        switch (i) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put(C4018c8.k, true != zzbffVar.j ? "0" : "1");
                zzclmVar.n("onAdVisibilityChanged", hashMap);
                break;
            case 1:
                Rect rect = zzbffVar.d;
                zzclmVar.zzP().I(rect.left, rect.top);
                break;
            default:
                Rect rect2 = zzbffVar.d;
                zzclmVar.zzP().I(rect2.left, rect2.top);
                break;
        }
    }
}
