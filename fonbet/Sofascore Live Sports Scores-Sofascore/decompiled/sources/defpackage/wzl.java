package defpackage;

import com.blaze.blazesdk.features.stories.players.ui.StoriesPlayerActivity;
import com.blaze.blazesdk.players.models.H;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wzl extends ppd {
    public final /* synthetic */ StoriesPlayerActivity d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wzl(StoriesPlayerActivity storiesPlayerActivity) {
        super(true);
        this.d = storiesPlayerActivity;
    }

    @Override // defpackage.ppd
    public final void b() {
        obm obmVar = this.d.m;
        if (obmVar != null) {
            obmVar.j(H.BACK_BUTTON);
        }
    }
}
