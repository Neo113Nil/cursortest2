package defpackage;

import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class zl6 extends ot8 implements ct8 {
    public zl6(yql yqlVar) {
        super(3, 0, yql.class, yqlVar, "onPlayerMinimizedMaximizeChange", "onPlayerMinimizedMaximizeChange(Lcom/blaze/blazesdk/delegates/models/BlazePlayerType;Ljava/lang/String;Z)V");
    }

    @Override // defpackage.ct8
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BlazePlayerType blazePlayerType = (BlazePlayerType) obj;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        blazePlayerType.getClass();
        ((yql) this.receiver).a(blazePlayerType, (String) obj2, booleanValue);
        return Unit.a;
    }
}
