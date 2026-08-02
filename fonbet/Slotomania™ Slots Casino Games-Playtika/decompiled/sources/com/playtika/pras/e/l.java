package com.playtika.pras.e;

import android.view.View;
import com.playtika.pras.sdk.views.RedirectionWebViewActivity;

/* loaded from: classes4.dex */
public final class l implements View.OnClickListener {
    public final /* synthetic */ RedirectionWebViewActivity a;

    public l(RedirectionWebViewActivity redirectionWebViewActivity) {
        this.a = redirectionWebViewActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RedirectionWebViewActivity redirectionWebViewActivity = this.a;
        int i = RedirectionWebViewActivity.b;
        redirectionWebViewActivity.setResult(-1);
        redirectionWebViewActivity.finish();
    }
}
