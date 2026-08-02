package defpackage;

import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.e;
import com.google.android.gms.cast.internal.zzar;
import com.google.android.gms.cast.internal.zzat;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class i6n extends e {
    public final /* synthetic */ int r;
    public final /* synthetic */ int[] s;
    public final /* synthetic */ RemoteMediaClient t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6n(RemoteMediaClient remoteMediaClient, int[] iArr, int i) {
        super(remoteMediaClient, false);
        this.r = i;
        switch (i) {
            case 1:
                this.s = iArr;
                Objects.requireNonNull(remoteMediaClient);
                this.t = remoteMediaClient;
                super(remoteMediaClient, true);
                break;
            default:
                this.s = iArr;
                Objects.requireNonNull(remoteMediaClient);
                this.t = remoteMediaClient;
                break;
        }
    }

    @Override // com.google.android.gms.cast.framework.media.e
    public final void n() {
        int i = this.r;
        int[] iArr = this.s;
        RemoteMediaClient remoteMediaClient = this.t;
        switch (i) {
            case 0:
                zzar zzarVar = remoteMediaClient.c;
                zzat o = o();
                zzarVar.getClass();
                if (iArr.length != 0) {
                    JSONObject jSONObject = new JSONObject();
                    long b = zzarVar.b();
                    try {
                        jSONObject.put("requestId", b);
                        jSONObject.put("type", "QUEUE_REMOVE");
                        jSONObject.put("mediaSessionId", zzarVar.f());
                        JSONArray jSONArray = new JSONArray();
                        for (int i2 = 0; i2 < iArr.length; i2++) {
                            jSONArray.put(i2, iArr[i2]);
                        }
                        jSONObject.put("itemIds", jSONArray);
                        int i3 = zzarVar.i;
                        if ((i3 != -1 ? 1 : 0) != 0) {
                            jSONObject.put("sequenceNumber", i3);
                        }
                    } catch (JSONException unused) {
                    }
                    zzarVar.a(b, jSONObject.toString());
                    zzarVar.t.a(b, new bhn(zzarVar, o, 1));
                    break;
                } else {
                    a70.p("itemIdsToRemove must not be null or empty.");
                    break;
                }
            default:
                zzar zzarVar2 = remoteMediaClient.c;
                zzat o2 = o();
                zzarVar2.getClass();
                JSONObject jSONObject2 = new JSONObject();
                long b2 = zzarVar2.b();
                try {
                    jSONObject2.put("requestId", b2);
                    jSONObject2.put("type", "QUEUE_GET_ITEMS");
                    jSONObject2.put("mediaSessionId", zzarVar2.f());
                    JSONArray jSONArray2 = new JSONArray();
                    int length = iArr.length;
                    while (r2 < length) {
                        jSONArray2.put(iArr[r2]);
                        r2++;
                    }
                    jSONObject2.put("itemIds", jSONArray2);
                } catch (JSONException unused2) {
                }
                zzarVar2.a(b2, jSONObject2.toString());
                zzarVar2.v.a(b2, o2);
                break;
        }
    }
}
