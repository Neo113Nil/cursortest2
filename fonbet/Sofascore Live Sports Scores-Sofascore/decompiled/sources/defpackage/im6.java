package defpackage;

import com.facebook.ads.AudienceNetworkAds;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class im6 implements AudienceNetworkAds.InitListener {
    public static im6 d;
    public boolean a = false;
    public boolean b = false;
    public final ArrayList c = new ArrayList();

    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
    public final void onInitialized(AudienceNetworkAds.InitResult initResult) {
        this.a = false;
        this.b = initResult.isSuccess();
        ArrayList arrayList = this.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            jm6 jm6Var = (jm6) it.next();
            if (initResult.isSuccess()) {
                jm6Var.a.onInitializationSucceeded();
            } else {
                jm6Var.a.onInitializationFailed(new AdError(104, initResult.getMessage(), FacebookMediationAdapter.ERROR_DOMAIN).getMessage());
            }
        }
        arrayList.clear();
    }
}
