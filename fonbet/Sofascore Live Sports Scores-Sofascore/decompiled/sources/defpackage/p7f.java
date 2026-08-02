package defpackage;

import android.app.Activity;
import com.sofascore.results.base.BaseActivity;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class p7f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ p7f(Activity activity, int i) {
        this.a = i;
        this.b = activity;
    }

    public final void a() {
        BaseActivity baseActivity;
        int i = this.a;
        Activity activity = this.b;
        switch (i) {
            case 0:
                zic.f = false;
                baseActivity = activity instanceof BaseActivity ? (BaseActivity) activity : null;
                if (baseActivity != null) {
                    baseActivity.z().c(duf.a.getOrCreateKotlinClass(u0f.class));
                }
                zic.K(activity, true);
                break;
            default:
                zic.f = false;
                baseActivity = activity instanceof BaseActivity ? (BaseActivity) activity : null;
                if (baseActivity != null) {
                    baseActivity.z().c(duf.a.getOrCreateKotlinClass(u0f.class));
                }
                zic.K(activity, false);
                break;
        }
    }
}
