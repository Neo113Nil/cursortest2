package defpackage;

import com.google.android.gms.cast.MediaSeekOptions;
import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.uicontroller.UIMediaController;
import com.google.android.gms.cast.framework.media.uicontroller.zza;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;
import com.google.android.gms.cast.framework.media.widget.zzd;
import com.google.android.gms.internal.cast.zzdr;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class bko extends zzd {
    public final /* synthetic */ UIMediaController a;

    public bko(UIMediaController uIMediaController) {
        Objects.requireNonNull(uIMediaController);
        this.a = uIMediaController;
    }

    public final void a(CastSeekBar castSeekBar) {
        UIMediaController uIMediaController = this.a;
        uIMediaController.getClass();
        int progress = castSeekBar.getProgress();
        Iterator it = uIMediaController.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else {
                ((zzdr) it.next()).g(true);
            }
        }
        RemoteMediaClient q = uIMediaController.q();
        if (q == null || !q.k()) {
            return;
        }
        zza zzaVar = uIMediaController.e;
        long g = zzaVar.g() + progress;
        MediaSeekOptions.Builder builder = new MediaSeekOptions.Builder();
        builder.a = g;
        boolean z = q.m() && zzaVar.d(g);
        builder.b = z;
        q.w(new MediaSeekOptions(builder.a, z));
    }

    public final void b(int i, boolean z) {
        UIMediaController uIMediaController = this.a;
        if (!z) {
            uIMediaController.getClass();
            return;
        }
        Iterator it = uIMediaController.d.iterator();
        while (it.hasNext()) {
            ((zzdr) it.next()).f(uIMediaController.e.g() + i);
        }
    }
}
