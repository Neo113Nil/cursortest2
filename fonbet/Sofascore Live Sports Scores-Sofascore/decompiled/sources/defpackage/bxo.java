package defpackage;

import com.google.android.gms.cast.framework.media.RemoteMediaClient;
import com.google.android.gms.cast.framework.media.widget.ExpandedControllerActivity;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class bxo implements RemoteMediaClient.Listener {
    public final /* synthetic */ ExpandedControllerActivity a;

    public /* synthetic */ bxo(ExpandedControllerActivity expandedControllerActivity) {
        this.a = expandedControllerActivity;
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public final void b() {
        this.a.t();
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public final void g() {
        this.a.r();
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public final void i() {
        ExpandedControllerActivity expandedControllerActivity = this.a;
        expandedControllerActivity.C.setText(expandedControllerActivity.getResources().getString(R.string.cast_expanded_controller_loading));
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public final void l() {
        ExpandedControllerActivity expandedControllerActivity = this.a;
        RemoteMediaClient q = expandedControllerActivity.q();
        if (q == null || !q.k()) {
            if (expandedControllerActivity.T) {
                return;
            }
            expandedControllerActivity.finish();
        } else {
            expandedControllerActivity.T = false;
            expandedControllerActivity.s();
            expandedControllerActivity.t();
        }
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public final void h() {
    }

    @Override // com.google.android.gms.cast.framework.media.RemoteMediaClient.Listener
    public final void j() {
    }
}
