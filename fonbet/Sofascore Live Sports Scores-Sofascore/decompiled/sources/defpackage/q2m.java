package defpackage;

import android.media.MediaPlayer;
import com.inmobi.media.C3497ie;
import com.inmobi.media.C3805uc;
import com.vungle.ads.internal.ui.view.d;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class q2m implements MediaPlayer.OnVideoSizeChangedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q2m(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                d.a((d) obj, mediaPlayer, i, i2);
                break;
            case 1:
                C3497ie.a((C3497ie) obj, mediaPlayer, i, i2);
                break;
            default:
                C3805uc.a((C3805uc) obj, mediaPlayer, i, i2);
                break;
        }
    }
}
