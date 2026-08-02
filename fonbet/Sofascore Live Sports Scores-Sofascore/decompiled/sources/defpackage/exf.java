package defpackage;

import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class exf implements ResultCallback {
    public final /* synthetic */ hxf a;

    public exf(hxf hxfVar) {
        this.a = hxfVar;
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final void a(Result result) {
        int i = ((RemoteMediaClient.MediaChannelResult) result).getStatus().a;
        if (i != 0 && i != 2103) {
            StringBuilder t = lnb.t(i, "Seek failed. Error code ", ": ");
            t.append(s02.K(i));
            tgj.z(t.toString());
        }
        hxf hxfVar = this.a;
        int i2 = hxfVar.C - 1;
        hxfVar.C = i2;
        if (i2 == 0) {
            hxfVar.A = hxfVar.D;
            hxfVar.D = -1;
            hxfVar.E = C.TIME_UNSET;
        }
    }
}
