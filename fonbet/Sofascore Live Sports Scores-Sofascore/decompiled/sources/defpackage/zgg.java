package defpackage;

import android.os.Looper;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.widget.ExpandedControllerActivity;
import com.google.android.gms.internal.cast.zzfk;
import java.util.TimerTask;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zgg extends TimerTask {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public zgg(ExpandedControllerActivity expandedControllerActivity, RemoteMediaClient remoteMediaClient) {
        this.b = remoteMediaClient;
        this.c = expandedControllerActivity;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((TimerTask) obj).cancel();
                ((ahg) this.c).k = null;
                break;
            default:
                new zzfk(Looper.getMainLooper()).post(new wjn(this, (RemoteMediaClient) obj, false, 26));
                break;
        }
    }

    public zgg(scg scgVar, ahg ahgVar) {
        this.b = scgVar;
        this.c = ahgVar;
    }
}
