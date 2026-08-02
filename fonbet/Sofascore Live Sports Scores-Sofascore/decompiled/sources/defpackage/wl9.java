package defpackage;

import com.blaze.blazesdk.delegates.BlazePlayerInInlineDelegate;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class wl9 extends ot8 implements Function2 {
    public wl9(BlazePlayerInInlineDelegate blazePlayerInInlineDelegate) {
        super(2, 0, BlazePlayerInInlineDelegate.class, blazePlayerInInlineDelegate, "onPlayerDidEnterFullScreen", "onPlayerDidEnterFullScreen(Lcom/blaze/blazesdk/delegates/models/BlazePlayerType;Ljava/lang/String;)V");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        BlazePlayerType blazePlayerType = (BlazePlayerType) obj;
        blazePlayerType.getClass();
        ((BlazePlayerInInlineDelegate) this.receiver).onPlayerDidEnterFullScreen(blazePlayerType, (String) obj2);
        return Unit.a;
    }
}
