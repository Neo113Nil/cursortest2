package defpackage;

import com.blaze.blazesdk.delegates.BlazePlayerSourceDelegate;
import com.blaze.blazesdk.delegates.models.BlazeCTAActionType;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class r2d extends ot8 implements et8 {
    public r2d(BlazePlayerSourceDelegate blazePlayerSourceDelegate) {
        super(4, 0, BlazePlayerSourceDelegate.class, blazePlayerSourceDelegate, "onTriggerCTA", "onTriggerCTA(Lcom/blaze/blazesdk/delegates/models/BlazePlayerType;Ljava/lang/String;Lcom/blaze/blazesdk/delegates/models/BlazeCTAActionType;Ljava/lang/String;)Z");
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        BlazePlayerType blazePlayerType = (BlazePlayerType) obj;
        BlazeCTAActionType blazeCTAActionType = (BlazeCTAActionType) obj3;
        String str = (String) obj4;
        blazePlayerType.getClass();
        blazeCTAActionType.getClass();
        str.getClass();
        return Boolean.valueOf(((BlazePlayerSourceDelegate) this.receiver).onTriggerCTA(blazePlayerType, (String) obj2, blazeCTAActionType, str));
    }
}
