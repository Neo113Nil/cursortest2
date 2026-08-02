package defpackage;

import com.blaze.blazesdk.delegates.BlazePlayerSourceDelegate;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.shared.results.BlazeResult;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class fif extends ot8 implements et8 {
    public fif(BlazePlayerSourceDelegate blazePlayerSourceDelegate) {
        super(4, 0, BlazePlayerSourceDelegate.class, blazePlayerSourceDelegate, "onDataLoadComplete", "onDataLoadComplete(Lcom/blaze/blazesdk/delegates/models/BlazePlayerType;Ljava/lang/String;ILcom/blaze/blazesdk/shared/results/BlazeResult;)V");
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        BlazePlayerType blazePlayerType = (BlazePlayerType) obj;
        int intValue = ((Number) obj3).intValue();
        BlazeResult<Unit> blazeResult = (BlazeResult) obj4;
        blazePlayerType.getClass();
        blazeResult.getClass();
        ((BlazePlayerSourceDelegate) this.receiver).onDataLoadComplete(blazePlayerType, (String) obj2, intValue, blazeResult);
        return Unit.a;
    }
}
