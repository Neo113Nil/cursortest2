package defpackage;

import com.blaze.blazesdk.delegates.BlazePlayerSourceDelegate;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.style.shared.models.BlazePlayerCustomActionButtonParams;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class nri extends ot8 implements ct8 {
    public nri(BlazePlayerSourceDelegate blazePlayerSourceDelegate) {
        super(3, 0, BlazePlayerSourceDelegate.class, blazePlayerSourceDelegate, "onTriggerCustomActionButton", "onTriggerCustomActionButton(Lcom/blaze/blazesdk/delegates/models/BlazePlayerType;Ljava/lang/String;Lcom/blaze/blazesdk/style/shared/models/BlazePlayerCustomActionButtonParams;)V");
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BlazePlayerType blazePlayerType = (BlazePlayerType) obj;
        BlazePlayerCustomActionButtonParams blazePlayerCustomActionButtonParams = (BlazePlayerCustomActionButtonParams) obj3;
        blazePlayerType.getClass();
        blazePlayerCustomActionButtonParams.getClass();
        ((BlazePlayerSourceDelegate) this.receiver).onTriggerCustomActionButton(blazePlayerType, (String) obj2, blazePlayerCustomActionButtonParams);
        return Unit.a;
    }
}
