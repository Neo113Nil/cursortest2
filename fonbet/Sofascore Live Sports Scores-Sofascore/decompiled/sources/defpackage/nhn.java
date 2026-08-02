package defpackage;

import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaLoadRequestData;
import com.google.android.gms.cast.MediaQueueData;
import com.google.android.gms.cast.MediaSeekOptions;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.e;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.zzar;
import com.google.android.gms.cast.internal.zzat;
import com.ironsource.U3;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class nhn extends e {
    public final /* synthetic */ int r;
    public final /* synthetic */ RemoteMediaClient s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nhn(RemoteMediaClient remoteMediaClient, Object obj, int i) {
        super(remoteMediaClient, false);
        this.r = i;
        this.t = obj;
        this.s = remoteMediaClient;
    }

    @Override // com.google.android.gms.cast.framework.media.e
    public final void n() {
        int i = this.r;
        int i2 = 0;
        Object obj = this.t;
        RemoteMediaClient remoteMediaClient = this.s;
        switch (i) {
            case 0:
                zzar zzarVar = remoteMediaClient.c;
                zzat o = o();
                MediaLoadRequestData mediaLoadRequestData = (MediaLoadRequestData) obj;
                zzarVar.getClass();
                MediaInfo mediaInfo = mediaLoadRequestData.a;
                MediaQueueData mediaQueueData = mediaLoadRequestData.b;
                if (mediaInfo != null || mediaQueueData != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        MediaInfo mediaInfo2 = mediaLoadRequestData.a;
                        if (mediaInfo2 != null) {
                            jSONObject.put(U3.i.I0, mediaInfo2.Z0());
                        }
                        if (mediaQueueData != null) {
                            jSONObject.put("queueData", mediaQueueData.Y0());
                        }
                        jSONObject.putOpt("autoplay", mediaLoadRequestData.c);
                        long j = mediaLoadRequestData.d;
                        if (j != -1) {
                            Pattern pattern = CastUtils.a;
                            jSONObject.put("currentTime", j / 1000.0d);
                        }
                        jSONObject.put("playbackRate", mediaLoadRequestData.e);
                        jSONObject.putOpt("credentials", mediaLoadRequestData.i);
                        jSONObject.putOpt("credentialsType", mediaLoadRequestData.j);
                        jSONObject.putOpt("atvCredentials", mediaLoadRequestData.k);
                        jSONObject.putOpt("atvCredentialsType", mediaLoadRequestData.l);
                        long[] jArr = mediaLoadRequestData.f;
                        if (jArr != null) {
                            JSONArray jSONArray = new JSONArray();
                            while (i2 < jArr.length) {
                                jSONArray.put(i2, jArr[i2]);
                                i2++;
                            }
                            jSONObject.put("activeTrackIds", jSONArray);
                        }
                        jSONObject.putOpt("customData", mediaLoadRequestData.h);
                        jSONObject.put("requestId", mediaLoadRequestData.m);
                    } catch (JSONException e) {
                        MediaLoadRequestData.n.c("Error transforming MediaLoadRequestData into JSONObject", e);
                        jSONObject = new JSONObject();
                    }
                    long b = zzarVar.b();
                    try {
                        jSONObject.put("requestId", b);
                        jSONObject.put("type", "LOAD");
                    } catch (JSONException unused) {
                    }
                    zzarVar.a(b, jSONObject.toString());
                    zzarVar.j.a(b, o);
                    break;
                } else {
                    a70.p("MediaInfo and MediaQueueData should not be both null");
                    break;
                }
            case 1:
                zzar zzarVar2 = remoteMediaClient.c;
                zzat o2 = o();
                MediaSeekOptions mediaSeekOptions = (MediaSeekOptions) obj;
                zzarVar2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                long b2 = zzarVar2.b();
                long j2 = mediaSeekOptions.b ? 4294967296000L : mediaSeekOptions.a;
                try {
                    jSONObject2.put("requestId", b2);
                    jSONObject2.put("type", "SEEK");
                    jSONObject2.put("mediaSessionId", zzarVar2.f());
                    Pattern pattern2 = CastUtils.a;
                    jSONObject2.put("currentTime", j2 / 1000.0d);
                } catch (JSONException unused2) {
                }
                zzarVar2.a(b2, jSONObject2.toString());
                zzarVar2.g = Long.valueOf(j2);
                zzarVar2.n.a(b2, new bhn(zzarVar2, o2, 0));
                break;
            default:
                zzar zzarVar3 = remoteMediaClient.c;
                zzat o3 = o();
                long[] jArr2 = (long[]) obj;
                zzarVar3.getClass();
                if (jArr2 == null) {
                    a70.p("trackIds cannot be null");
                    break;
                } else {
                    JSONObject jSONObject3 = new JSONObject();
                    long b3 = zzarVar3.b();
                    try {
                        jSONObject3.put("requestId", b3);
                        jSONObject3.put("type", "EDIT_TRACKS_INFO");
                        jSONObject3.put("mediaSessionId", zzarVar3.f());
                        JSONArray jSONArray2 = new JSONArray();
                        while (i2 < jArr2.length) {
                            jSONArray2.put(i2, jArr2[i2]);
                            i2++;
                        }
                        jSONObject3.put("activeTrackIds", jSONArray2);
                    } catch (JSONException unused3) {
                    }
                    zzarVar3.a(b3, jSONObject3.toString());
                    zzarVar3.r.a(b3, o3);
                    break;
                }
        }
    }
}
