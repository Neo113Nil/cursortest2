package defpackage;

import com.blaze.blazesdk.delegates.BlazePlayerSourceDelegate;
import com.blaze.blazesdk.delegates.models.BlazePlayerEvent;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class gag extends ot8 implements ct8 {
    public gag(BlazePlayerSourceDelegate blazePlayerSourceDelegate) {
        super(3, 0, BlazePlayerSourceDelegate.class, blazePlayerSourceDelegate, "onPlayerEventTriggered", "onPlayerEventTriggered(Lcom/blaze/blazesdk/delegates/models/BlazePlayerType;Ljava/lang/String;Lcom/blaze/blazesdk/delegates/models/BlazePlayerEvent;)V");
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BlazePlayerType blazePlayerType = (BlazePlayerType) obj;
        BlazePlayerEvent blazePlayerEvent = (BlazePlayerEvent) obj3;
        blazePlayerType.getClass();
        blazePlayerEvent.getClass();
        ((BlazePlayerSourceDelegate) this.receiver).onPlayerEventTriggered(blazePlayerType, (String) obj2, blazePlayerEvent);
        return Unit.a;
    }
}
