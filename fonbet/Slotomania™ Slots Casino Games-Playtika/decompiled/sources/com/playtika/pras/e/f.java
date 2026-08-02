package com.playtika.pras.e;

import androidx.fragment.app.FragmentActivity;
import com.playtika.pras.sdk.views.BaseWebViewContainer;
import java.util.TimerTask;

/* loaded from: classes4.dex */
public final class f extends TimerTask {
    public final /* synthetic */ BaseWebViewContainer a;

    public f(BaseWebViewContainer baseWebViewContainer) {
        this.a = baseWebViewContainer;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        FragmentActivity activity = this.a.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new com.playtika.pras.sdk.views.e(this));
        }
    }
}
