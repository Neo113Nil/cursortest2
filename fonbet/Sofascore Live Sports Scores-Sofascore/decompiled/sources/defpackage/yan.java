package defpackage;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbq;
import com.google.android.gms.internal.ads.zzbs;
import com.google.android.gms.internal.ads.zzbt;
import com.google.android.gms.internal.ads.zzbu;
import com.google.android.gms.internal.ads.zzi;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class yan implements zzbs {
    public final van a = new van();

    @Override // com.google.android.gms.internal.ads.zzbs
    public final zzbu a(Context context, zzi zziVar, zzbt zzbtVar, pan panVar) {
        try {
            return ((zzbs) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(zzbq.class).newInstance(this.a)).a(context, zziVar, zzbtVar, panVar);
        } catch (Exception e) {
            yhk.q(e);
            return null;
        }
    }
}
