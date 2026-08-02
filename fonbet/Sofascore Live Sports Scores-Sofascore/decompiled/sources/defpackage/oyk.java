package defpackage;

import android.content.Context;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AgeRestrictedTreatment;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.VungleAds;
import com.vungle.ads.VungleError;
import com.vungle.ads.VunglePrivacySettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class oyk implements InitializationListener {
    public static final oyk c = new oyk();
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final ArrayList b = new ArrayList();

    public oyk() {
        VungleAds.setIntegrationName(InneractiveMediationNameConsts.ADMOB, "7.7.4.2".replace('.', '_'));
    }

    public static void b(RequestConfiguration requestConfiguration) {
        boolean z = n9e.I() && requestConfiguration.getAgeRestrictedTreatment() == AgeRestrictedTreatment.CHILD;
        if (requestConfiguration.getTagForChildDirectedTreatment() == 1 || requestConfiguration.getTagForUnderAgeOfConsent() == 1 || z) {
            VunglePrivacySettings.setCOPPAStatus(true);
        } else if (requestConfiguration.getTagForChildDirectedTreatment() == 0 || requestConfiguration.getTagForUnderAgeOfConsent() == 0) {
            VunglePrivacySettings.setCOPPAStatus(false);
        }
    }

    public final void a(String str, Context context, nyk nykVar) {
        VungleAds.Companion companion = VungleAds.INSTANCE;
        if (companion.isInitialized()) {
            nykVar.b();
            return;
        }
        boolean andSet = this.a.getAndSet(true);
        ArrayList arrayList = this.b;
        if (andSet) {
            arrayList.add(nykVar);
            return;
        }
        b(MobileAds.getRequestConfiguration());
        context.getClass();
        str.getClass();
        companion.init(context, str, this);
        arrayList.add(nykVar);
    }

    @Override // com.vungle.ads.InitializationListener
    public final void onError(VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        ArrayList arrayList = this.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((nyk) it.next()).a(adError);
        }
        arrayList.clear();
        this.a.set(false);
    }

    @Override // com.vungle.ads.InitializationListener
    public final void onSuccess() {
        ArrayList arrayList = this.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((nyk) it.next()).b();
        }
        arrayList.clear();
        this.a.set(false);
    }
}
