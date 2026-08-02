package defpackage;

import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.e;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.cast.internal.zzar;
import com.google.android.gms.cast.internal.zzat;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class cbn extends e {
    public final /* synthetic */ int r;
    public final /* synthetic */ RemoteMediaClient s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbn(RemoteMediaClient remoteMediaClient, int i) {
        super(remoteMediaClient, true);
        this.r = i;
        switch (i) {
            case 4:
                Objects.requireNonNull(remoteMediaClient);
                this.s = remoteMediaClient;
                super(remoteMediaClient, false);
                break;
            case 7:
                Objects.requireNonNull(remoteMediaClient);
                this.s = remoteMediaClient;
                super(remoteMediaClient, false);
                break;
            default:
                Objects.requireNonNull(remoteMediaClient);
                this.s = remoteMediaClient;
                break;
        }
    }

    @Override // com.google.android.gms.cast.framework.media.e
    public final void n() {
        int i = this.r;
        RemoteMediaClient remoteMediaClient = this.s;
        switch (i) {
            case 0:
                remoteMediaClient.c.d(o(), 0, -1L, -1, null);
                break;
            case 1:
                remoteMediaClient.c.d(o(), 0, -1L, 1, null);
                break;
            case 2:
                zzar zzarVar = remoteMediaClient.c;
                zzat o = o();
                zzarVar.getClass();
                JSONObject jSONObject = new JSONObject();
                long b = zzarVar.b();
                try {
                    jSONObject.put("requestId", b);
                    jSONObject.put("type", "QUEUE_GET_ITEM_IDS");
                    jSONObject.put("mediaSessionId", zzarVar.f());
                } catch (JSONException unused) {
                }
                zzarVar.a(b, jSONObject.toString());
                zzarVar.u.a(b, o);
                break;
            case 3:
                zzar zzarVar2 = remoteMediaClient.c;
                zzat o2 = o();
                zzarVar2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                long b2 = zzarVar2.b();
                try {
                    jSONObject2.put("requestId", b2);
                    jSONObject2.put("type", "PAUSE");
                    jSONObject2.put("mediaSessionId", zzarVar2.f());
                } catch (JSONException unused2) {
                }
                zzarVar2.a(b2, jSONObject2.toString());
                zzarVar2.k.a(b2, o2);
                break;
            case 4:
                zzar zzarVar3 = remoteMediaClient.c;
                zzat o3 = o();
                zzarVar3.getClass();
                JSONObject jSONObject3 = new JSONObject();
                long b3 = zzarVar3.b();
                try {
                    jSONObject3.put("requestId", b3);
                    jSONObject3.put("type", "STOP");
                    jSONObject3.put("mediaSessionId", zzarVar3.f());
                } catch (JSONException unused3) {
                }
                zzarVar3.a(b3, jSONObject3.toString());
                zzarVar3.m.a(b3, o3);
                break;
            case 5:
                zzar zzarVar4 = remoteMediaClient.c;
                zzat o4 = o();
                zzarVar4.getClass();
                JSONObject jSONObject4 = new JSONObject();
                long b4 = zzarVar4.b();
                try {
                    jSONObject4.put("requestId", b4);
                    jSONObject4.put("type", "PLAY");
                    jSONObject4.put("mediaSessionId", zzarVar4.f());
                } catch (JSONException unused4) {
                }
                zzarVar4.a(b4, jSONObject4.toString());
                zzarVar4.l.a(b4, o4);
                break;
            case 6:
                zzar zzarVar5 = remoteMediaClient.c;
                zzat o5 = o();
                zzarVar5.getClass();
                JSONObject jSONObject5 = new JSONObject();
                long b5 = zzarVar5.b();
                try {
                    jSONObject5.put("requestId", b5);
                    jSONObject5.put("type", "SKIP_AD");
                    jSONObject5.put("mediaSessionId", zzarVar5.f());
                } catch (JSONException e) {
                    Logger logger = zzarVar5.a;
                    Locale locale = Locale.ROOT;
                    logger.c(dmi.q("Error creating SkipAd message: ", e.getMessage()), new Object[0]);
                }
                zzarVar5.a(b5, jSONObject5.toString());
                zzarVar5.y.a(b5, o5);
                break;
            default:
                zzar zzarVar6 = remoteMediaClient.c;
                zzat o6 = o();
                zzarVar6.getClass();
                JSONObject jSONObject6 = new JSONObject();
                long b6 = zzarVar6.b();
                try {
                    jSONObject6.put("requestId", b6);
                    jSONObject6.put("type", "GET_STATUS");
                    MediaStatus mediaStatus = zzarVar6.f;
                    if (mediaStatus != null) {
                        jSONObject6.put("mediaSessionId", mediaStatus.b);
                    }
                } catch (JSONException unused5) {
                }
                zzarVar6.a(b6, jSONObject6.toString());
                zzarVar6.q.a(b6, o6);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cbn(RemoteMediaClient remoteMediaClient, int i, boolean z) {
        super(remoteMediaClient, false);
        this.r = i;
        this.s = remoteMediaClient;
    }
}
