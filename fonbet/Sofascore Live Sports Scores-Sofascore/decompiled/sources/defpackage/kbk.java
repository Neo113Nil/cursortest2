package defpackage;

import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.metadata.MetaData;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class kbk implements IUnityAdsInitializationListener {
    public final /* synthetic */ String a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ lbk d;

    public kbk(lbk lbkVar, String str, Context context, String str2) {
        this.d = lbkVar;
        this.a = str;
        this.b = context;
        this.c = str2;
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public final void onInitializationComplete() {
        ebk.d(MobileAds.getRequestConfiguration(), new MetaData(this.b));
        String uuid = UUID.randomUUID().toString();
        lbk lbkVar = this.d;
        lbkVar.a = uuid;
        fbk fbkVar = lbkVar.d;
        fbkVar.getClass();
        UnityAdsLoadOptions unityAdsLoadOptions = new UnityAdsLoadOptions();
        unityAdsLoadOptions.setObjectId(uuid);
        String str = this.c;
        if (str != null) {
            unityAdsLoadOptions.setAdMarkup(str);
        }
        String str2 = lbkVar.f;
        fbkVar.getClass();
        UnityAds.load(str2, unityAdsLoadOptions, lbkVar);
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public final void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        AdError a = ebk.a(unityAdsInitializationError, "Unity Ads initialization failed for game ID '" + this.a + "' with error message: " + str);
        a.toString();
        this.d.b.onFailure(a);
    }
}
