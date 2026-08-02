package defpackage;

import com.blaze.blazesdk.ads.ima.BlazeIMAHandlerEventType;
import com.blaze.blazesdk.ads.ima.BlazeImaHandler;
import com.blaze.blazesdk.ads.ima.exo_player.ImaPresenterActivity;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ncm implements b98 {
    public final /* synthetic */ ImaPresenterActivity a;

    public ncm(ImaPresenterActivity imaPresenterActivity) {
        this.a = imaPresenterActivity;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        int i = v9m.a[((BlazeIMAHandlerEventType) obj).ordinal()];
        ImaPresenterActivity imaPresenterActivity = this.a;
        if (i == 1) {
            ((wql) imaPresenterActivity.p()).b.setShutterBackgroundColor(0);
        } else if (i == 2) {
            imaPresenterActivity.finish();
        }
        BlazeImaHandler blazeImaHandler = ((x8m) imaPresenterActivity.m.getValue()).c;
        if (blazeImaHandler != null) {
            blazeImaHandler.clearImaAdEventBuffer();
        }
        return Unit.a;
    }
}
