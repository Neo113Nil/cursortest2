package defpackage;

import com.blaze.blazesdk.delegates.BlazePlayerSourceDelegate;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class jjd extends ot8 implements ct8 {
    public jjd(BlazePlayerSourceDelegate blazePlayerSourceDelegate) {
        super(3, 0, BlazePlayerSourceDelegate.class, blazePlayerSourceDelegate, "onTriggerPlayerBodyTextLink", "onTriggerPlayerBodyTextLink(Lcom/blaze/blazesdk/delegates/models/BlazePlayerType;Ljava/lang/String;Ljava/lang/String;)Lcom/blaze/blazesdk/features/shared/models/ui_shared/BlazeLinkActionHandleType;");
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BlazePlayerType blazePlayerType = (BlazePlayerType) obj;
        String str = (String) obj3;
        blazePlayerType.getClass();
        str.getClass();
        return ((BlazePlayerSourceDelegate) this.receiver).onTriggerPlayerBodyTextLink(blazePlayerType, (String) obj2, str);
    }
}
