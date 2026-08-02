package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.mediarouter.app.d;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jac implements IBinder.DeathRecipient {
    public final c4c a = new c4c(this);
    public mo4 b;
    public d4c c;
    public final /* synthetic */ int d;
    public final /* synthetic */ wb0 e;

    public jac(wb0 wb0Var, int i) {
        this.d = i;
        this.e = wb0Var;
    }

    public final void a(MediaMetadataCompat mediaMetadataCompat) {
        int i = this.d;
        wb0 wb0Var = this.e;
        switch (i) {
            case 0:
                d dVar = (d) wb0Var;
                dVar.X = mediaMetadataCompat != null ? mediaMetadataCompat.a() : null;
                dVar.r();
                dVar.q(false);
                break;
            default:
                bbc bbcVar = (bbc) wb0Var;
                bbcVar.M = mediaMetadataCompat != null ? mediaMetadataCompat.a() : null;
                bbcVar.g();
                bbcVar.k();
                break;
        }
    }

    public void b(PlaybackStateCompat playbackStateCompat) {
        switch (this.d) {
            case 0:
                d dVar = (d) this.e;
                dVar.W = playbackStateCompat;
                dVar.q(false);
                break;
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        e(8, null, null);
    }

    public final void d() {
        int i = this.d;
        wb0 wb0Var = this.e;
        switch (i) {
            case 0:
                d dVar = (d) wb0Var;
                wj9 wj9Var = dVar.U;
                if (wj9Var != null) {
                    wj9Var.M(dVar.V);
                    dVar.U = null;
                    break;
                }
                break;
            default:
                bbc bbcVar = (bbc) wb0Var;
                wj9 wj9Var2 = bbcVar.K;
                if (wj9Var2 != null) {
                    wj9Var2.M(bbcVar.L);
                    bbcVar.K = null;
                    break;
                }
                break;
        }
    }

    public final void e(int i, Object obj, Bundle bundle) {
        mo4 mo4Var = this.b;
        if (mo4Var != null) {
            Message obtainMessage = mo4Var.obtainMessage(i, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }

    public final void f(Handler handler) {
        if (handler != null) {
            mo4 mo4Var = new mo4(this, handler.getLooper());
            this.b = mo4Var;
            mo4Var.b = true;
        } else {
            mo4 mo4Var2 = this.b;
            if (mo4Var2 != null) {
                mo4Var2.b = false;
                mo4Var2.removeCallbacksAndMessages(null);
                this.b = null;
            }
        }
    }

    public final void c(PlaybackStateCompat playbackStateCompat) {
    }
}
