package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.ironsource.Aa;
import com.ironsource.C4352v2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class o extends FrameLayout {
    private ISBannerSize a;
    private String b;
    private boolean c;
    private a d;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface a {
        void onWindowFocusChanged(boolean z);
    }

    public o(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.c = false;
        this.a = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    public void a() {
        this.c = true;
        this.a = null;
        this.b = null;
        this.d = null;
        C4352v2.a().a((Aa) null);
    }

    public boolean b() {
        return this.c;
    }

    public o c() {
        o oVar = new o(getContext(), this.a);
        oVar.b = this.b;
        return oVar;
    }

    public ISBannerSize getSize() {
        return this.a;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        a aVar = this.d;
        if (aVar != null) {
            aVar.onWindowFocusChanged(z);
        }
    }

    public void setBannerSize(ISBannerSize iSBannerSize) {
        this.a = iSBannerSize;
    }

    public o(Context context, ISBannerSize iSBannerSize) {
        super(context);
        this.c = false;
        this.a = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    public o(Context context) {
        super(context);
        this.c = false;
    }
}
