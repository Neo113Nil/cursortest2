package defpackage;

import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.e;
import com.google.android.gms.cast.internal.zzap;
import com.google.android.gms.cast.internal.zzar;
import com.google.android.gms.cast.internal.zzat;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class sjn extends e {
    public final /* synthetic */ int r;
    public final /* synthetic */ double s;
    public final /* synthetic */ RemoteMediaClient t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sjn(RemoteMediaClient remoteMediaClient, double d, int i) {
        super(remoteMediaClient, false);
        this.r = i;
        switch (i) {
            case 1:
                this.s = d;
                Objects.requireNonNull(remoteMediaClient);
                this.t = remoteMediaClient;
                super(remoteMediaClient, false);
                break;
            default:
                this.s = d;
                Objects.requireNonNull(remoteMediaClient);
                this.t = remoteMediaClient;
                break;
        }
    }

    @Override // com.google.android.gms.cast.framework.media.e
    public final void n() {
        int i = this.r;
        double d = this.s;
        RemoteMediaClient remoteMediaClient = this.t;
        switch (i) {
            case 0:
                zzar zzarVar = remoteMediaClient.c;
                zzat o = o();
                zzarVar.getClass();
                if (Double.isInfinite(d) || Double.isNaN(d)) {
                    zzl.f(String.valueOf(d).length() + 17, "Volume cannot be ", d);
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                long b = zzarVar.b();
                try {
                    jSONObject.put("requestId", b);
                    jSONObject.put("type", "SET_VOLUME");
                    jSONObject.put("mediaSessionId", zzarVar.f());
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("level", d);
                    jSONObject.put("volume", jSONObject2);
                } catch (JSONException unused) {
                }
                zzarVar.a(b, jSONObject.toString());
                zzarVar.o.a(b, o);
                return;
            default:
                zzar zzarVar2 = remoteMediaClient.c;
                zzat o2 = o();
                if (zzarVar2.f == null) {
                    throw new zzap();
                }
                JSONObject jSONObject3 = new JSONObject();
                long b2 = zzarVar2.b();
                try {
                    jSONObject3.put("requestId", b2);
                    jSONObject3.put("type", "SET_PLAYBACK_RATE");
                    jSONObject3.put("playbackRate", d);
                    Preconditions.j(zzarVar2.f, "mediaStatus should not be null");
                    jSONObject3.put("mediaSessionId", zzarVar2.f.b);
                } catch (JSONException unused2) {
                }
                zzarVar2.a(b2, jSONObject3.toString());
                zzarVar2.x.a(b2, o2);
                return;
        }
    }
}
