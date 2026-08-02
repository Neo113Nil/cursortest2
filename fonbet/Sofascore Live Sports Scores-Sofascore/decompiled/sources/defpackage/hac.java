package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.a;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.mediarouter.app.d;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hac implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;

    public /* synthetic */ hac(d dVar, int i) {
        this.a = i;
        this.b = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        PlaybackStateCompat playbackStateCompat;
        PendingIntent sessionActivity;
        int i2 = this.a;
        int i3 = 0;
        d dVar = this.b;
        switch (i2) {
            case 0:
                Context context = dVar.k;
                AccessibilityManager accessibilityManager = dVar.p0;
                int id = view.getId();
                if (id != 16908313 && id != 16908314) {
                    if (id != R.id.mr_control_playback_ctrl) {
                        if (id == R.id.mr_close) {
                            dVar.dismiss();
                            break;
                        }
                    } else {
                        wj9 wj9Var = dVar.U;
                        if (wj9Var != null && (playbackStateCompat = dVar.W) != null) {
                            i = playbackStateCompat.a != 3 ? 0 : 1;
                            if (i != 0 && (playbackStateCompat.e & 514) != 0) {
                                wj9Var.y().a.pause();
                                i3 = R.string.mr_controller_pause;
                            } else if (i != 0 && (playbackStateCompat.e & 1) != 0) {
                                wj9Var.y().a.stop();
                                i3 = R.string.mr_controller_stop;
                            } else if (i == 0 && (playbackStateCompat.e & 516) != 0) {
                                wj9Var.y().a.play();
                                i3 = R.string.mr_controller_play;
                            }
                            if (accessibilityManager != null && accessibilityManager.isEnabled() && i3 != 0) {
                                AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                                obtain.setPackageName(context.getPackageName());
                                obtain.setClassName(hac.class.getName());
                                obtain.getText().add(context.getString(i3));
                                accessibilityManager.sendAccessibilityEvent(obtain);
                                break;
                            }
                        }
                    }
                } else {
                    if (dVar.j.g()) {
                        pbc pbcVar = dVar.h;
                        i = id == 16908313 ? 2 : 1;
                        pbcVar.getClass();
                        pbc.j(i);
                    }
                    dVar.dismiss();
                    break;
                }
                break;
            case 1:
                dVar.dismiss();
                break;
            case 2:
                wj9 wj9Var2 = dVar.U;
                if (wj9Var2 != null && (sessionActivity = ((a) wj9Var2.b).a.getSessionActivity()) != null) {
                    try {
                        sessionActivity.send();
                        dVar.dismiss();
                        break;
                    } catch (PendingIntent.CanceledException unused) {
                        sessionActivity.toString();
                        return;
                    }
                }
                break;
            default:
                boolean z = dVar.g0;
                dVar.g0 = !z;
                if (!z) {
                    dVar.G.setVisibility(0);
                }
                dVar.m0 = dVar.g0 ? dVar.n0 : dVar.o0;
                dVar.t(true);
                break;
        }
    }
}
