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
public final class qbk implements IUnityAdsInitializationListener {
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final /* synthetic */ rbk e;

    public qbk(rbk rbkVar, Context context, String str, String str2, String str3) {
        this.e = rbkVar;
        this.a = context;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public final void onInitializationComplete() {
        ebk.d(MobileAds.getRequestConfiguration(), new MetaData(this.a));
        String uuid = UUID.randomUUID().toString();
        rbk rbkVar = this.e;
        rbkVar.f = uuid;
        fbk fbkVar = rbkVar.c;
        fbkVar.getClass();
        UnityAdsLoadOptions unityAdsLoadOptions = new UnityAdsLoadOptions();
        unityAdsLoadOptions.setObjectId(uuid);
        String str = this.d;
        if (str != null) {
            unityAdsLoadOptions.setAdMarkup(str);
        }
        obk obkVar = rbkVar.h;
        fbkVar.getClass();
        UnityAds.load(this.c, unityAdsLoadOptions, obkVar);
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public final void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        AdError a = ebk.a(unityAdsInitializationError, "Unity Ads initialization failed for game ID '" + this.b + "' with error message: " + str);
        a.toString();
        this.e.a.onFailure(a);
    }
}
