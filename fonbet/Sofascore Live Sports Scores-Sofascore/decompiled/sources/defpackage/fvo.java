package defpackage;

import com.google.android.gms.cast.framework.media.MediaQueue;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.zzfk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class fvo implements ResultCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaQueue b;

    public /* synthetic */ fvo(MediaQueue mediaQueue, int i) {
        this.a = i;
        this.b = mediaQueue;
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final void a(Result result) {
        int i = this.a;
        MediaQueue mediaQueue = this.b;
        RemoteMediaClient.MediaChannelResult mediaChannelResult = (RemoteMediaClient.MediaChannelResult) result;
        switch (i) {
            case 0:
                Status status = mediaChannelResult.getStatus();
                int i2 = status.a;
                if (i2 != 0) {
                    mediaQueue.a.c("Error fetching queue items, statusCode=" + i2 + ", statusMessage=" + status.b, new Object[0]);
                }
                mediaQueue.k = null;
                if (!mediaQueue.h.isEmpty()) {
                    zzfk zzfkVar = mediaQueue.i;
                    scg scgVar = mediaQueue.j;
                    zzfkVar.removeCallbacks(scgVar);
                    zzfkVar.postDelayed(scgVar, 500L);
                    break;
                }
                break;
            default:
                Status status2 = mediaChannelResult.getStatus();
                int i3 = status2.a;
                if (i3 != 0) {
                    mediaQueue.a.c("Error fetching queue item ids, statusCode=" + i3 + ", statusMessage=" + status2.b, new Object[0]);
                }
                mediaQueue.l = null;
                if (!mediaQueue.h.isEmpty()) {
                    zzfk zzfkVar2 = mediaQueue.i;
                    scg scgVar2 = mediaQueue.j;
                    zzfkVar2.removeCallbacks(scgVar2);
                    zzfkVar2.postDelayed(scgVar2, 500L);
                    break;
                }
                break;
        }
    }
}
