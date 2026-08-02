package defpackage;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbkl;
import java.util.Objects;
import org.json.JSONException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class qnn extends QueryInfoGenerationCallback {
    public final /* synthetic */ String a;
    public final /* synthetic */ zzbkl b;

    public qnn(zzbkl zzbklVar, String str) {
        this.a = str;
        Objects.requireNonNull(zzbklVar);
        this.b = zzbklVar;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        int i = zze.zza;
        zzo.zzi("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
        try {
            zzbkl zzbklVar = this.b;
            zzbklVar.g.c(zzbklVar.b(this.a, str).toString());
        } catch (JSONException e) {
            zzo.zzg("Error creating PACT Error Response JSON: ", e);
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        String query = queryInfo.getQuery();
        try {
            zzbkl zzbklVar = this.b;
            zzbklVar.g.c(zzbklVar.c(this.a, query).toString());
        } catch (JSONException e) {
            int i = zze.zza;
            zzo.zzg("Error creating PACT Signal Response JSON: ", e);
        }
    }
}
