package defpackage;

import com.adsbynimbus.google.DynamicPriceRenderer;
import com.adsbynimbus.google.GoogleAuctionData;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class df5 implements OnPaidEventListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ GoogleAuctionData b;

    public /* synthetic */ df5(GoogleAuctionData googleAuctionData, int i) {
        this.a = i;
        this.b = googleAuctionData;
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public final void onPaidEvent(AdValue adValue) {
        int i = this.a;
        GoogleAuctionData googleAuctionData = this.b;
        switch (i) {
            case 0:
                DynamicPriceRenderer.showAd$lambda$6(googleAuctionData, adValue);
                break;
            default:
                DynamicPriceRenderer.showAd$lambda$8(googleAuctionData, adValue);
                break;
        }
    }
}
