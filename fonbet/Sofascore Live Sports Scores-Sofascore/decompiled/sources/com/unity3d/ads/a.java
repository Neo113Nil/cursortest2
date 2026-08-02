package com.unity3d.ads;

import com.unity3d.ads.BannerAd$1$1;
import com.unity3d.ads.InterstitialAd$1$1;
import com.unity3d.ads.RewardedAd$1$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit emit$lambda$0;
        Unit emit$lambda$02;
        Unit emit$lambda$03;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                emit$lambda$0 = BannerAd$1$1.AnonymousClass2.emit$lambda$0((BannerAd) obj);
                return emit$lambda$0;
            case 1:
                emit$lambda$02 = InterstitialAd$1$1.AnonymousClass2.emit$lambda$0((InterstitialAd) obj);
                return emit$lambda$02;
            default:
                emit$lambda$03 = RewardedAd$1$1.AnonymousClass2.emit$lambda$0((RewardedAd) obj);
                return emit$lambda$03;
        }
    }
}
