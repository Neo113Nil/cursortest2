package defpackage;

import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class p5b implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Listeners b;
    public final /* synthetic */ String c;

    public /* synthetic */ p5b(Listeners listeners, String str, int i) {
        this.a = i;
        this.b = listeners;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit showClicked$lambda$7;
        Unit showStarted$lambda$6;
        Unit bannerLeftApplication$lambda$4;
        Unit showReceivedReward$lambda$3;
        switch (this.a) {
            case 0:
                showClicked$lambda$7 = LegacyShowUseCase.showClicked$lambda$7(this.b, this.c);
                return showClicked$lambda$7;
            case 1:
                showStarted$lambda$6 = LegacyShowUseCase.showStarted$lambda$6(this.b, this.c);
                return showStarted$lambda$6;
            case 2:
                bannerLeftApplication$lambda$4 = LegacyShowUseCase.bannerLeftApplication$lambda$4(this.b, this.c);
                return bannerLeftApplication$lambda$4;
            default:
                showReceivedReward$lambda$3 = LegacyShowUseCase.showReceivedReward$lambda$3(this.b, this.c);
                return showReceivedReward$lambda$3;
        }
    }
}
