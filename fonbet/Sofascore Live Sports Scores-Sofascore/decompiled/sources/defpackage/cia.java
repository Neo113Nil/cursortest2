package defpackage;

import com.blaze.blazesdk.delegates.BlazePlayerSourceDelegate;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.delegates.models.BlazeShareParams;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class cia extends ot8 implements ct8 {
    public cia(BlazePlayerSourceDelegate blazePlayerSourceDelegate) {
        super(3, 0, BlazePlayerSourceDelegate.class, blazePlayerSourceDelegate, "onShareClicked", "onShareClicked(Lcom/blaze/blazesdk/delegates/models/BlazePlayerType;Ljava/lang/String;Lcom/blaze/blazesdk/delegates/models/BlazeShareParams;)Ljava/lang/String;");
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BlazePlayerType blazePlayerType = (BlazePlayerType) obj;
        BlazeShareParams blazeShareParams = (BlazeShareParams) obj3;
        blazePlayerType.getClass();
        blazeShareParams.getClass();
        return ((BlazePlayerSourceDelegate) this.receiver).onShareClicked(blazePlayerType, (String) obj2, blazeShareParams);
    }
}
