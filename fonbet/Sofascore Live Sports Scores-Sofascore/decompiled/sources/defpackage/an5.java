package defpackage;

import android.media.MediaPlayer;
import com.inmobi.media.En;
import com.vungle.ads.internal.ui.view.d;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class an5 implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ an5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                En.a((En) obj, mediaPlayer);
                break;
            default:
                d.b((d) obj, mediaPlayer);
                break;
        }
    }
}
