package defpackage;

import android.view.View;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbxg;
import com.google.android.gms.internal.ads.zzemt;
import com.google.android.gms.internal.ads.zzenz;
import com.google.android.gms.internal.ads.zzeof;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class b5o extends zzbxg {
    public final zzemt a;
    public final /* synthetic */ zzenz b;

    public /* synthetic */ b5o(zzenz zzenzVar, zzemt zzemtVar) {
        this.b = zzenzVar;
        this.a = zzemtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxh
    public final void a(zze zzeVar) {
        ((zzeof) this.a.c).S(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbxh
    public final void s(IObjectWrapper iObjectWrapper) {
        this.b.c = (View) ObjectWrapper.Z1(iObjectWrapper);
        ((zzeof) this.a.c).zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbxh
    public final void zzf(String str) {
        ((zzeof) this.a.c).A4(0, str);
    }
}
