package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.out.MBSplashHandler;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class gkc extends ckc {
    public String f;

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public final void showAd(Context context) {
        Activity activity = (Activity) context;
        if (this.d != null) {
            RelativeLayout relativeLayout = new RelativeLayout(activity);
            ((ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content)).addView(relativeLayout);
            by9 by9Var = this.d;
            String str = this.f;
            by9Var.getClass();
            str.getClass();
            MBSplashHandler mBSplashHandler = (MBSplashHandler) by9Var.a;
            if (mBSplashHandler != null) {
                mBSplashHandler.show(relativeLayout, str);
            }
        }
    }
}
