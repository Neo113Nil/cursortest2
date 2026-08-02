package defpackage;

import com.blaze.blazesdk.features.moments.players.ui.MomentsPlayerActivity;
import com.blaze.blazesdk.players.models.H;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kzl extends ppd {
    public final /* synthetic */ MomentsPlayerActivity d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kzl(MomentsPlayerActivity momentsPlayerActivity) {
        super(true);
        this.d = momentsPlayerActivity;
    }

    @Override // defpackage.ppd
    public final void b() {
        syl sylVar = this.d.m;
        if (sylVar != null) {
            sylVar.j(H.BACK_BUTTON);
        }
    }
}
