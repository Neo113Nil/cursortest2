package defpackage;

import androidx.recyclerview.widget.u;
import com.blaze.blazesdk.analytics.enums.EventActionName;
import com.blaze.blazesdk.delegates.BlazeFollowEntitiesDelegate;
import com.blaze.blazesdk.delegates.models.BlazeFollowEntityClickedParams;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.features.videos.players.ui.a;
import com.blaze.blazesdk.follow.models.BlazeFollowEntity;
import com.blaze.blazesdk.shared.BlazeSDK;
import defpackage.gim;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class vkm implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u b;

    public /* synthetic */ vkm(u uVar, int i) {
        this.a = i;
        this.b = uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        gim gimVar;
        int i = this.a;
        u uVar = this.b;
        switch (i) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                glm glmVar = (glm) obj2;
                int i2 = dlm.o;
                glmVar.getClass();
                syl sylVar = (syl) ((dlm) uVar).c;
                sylVar.getClass();
                sqm sqmVar = (sqm) sylVar.getViewModel();
                sqmVar.getClass();
                jsl followEntitiesInternal$blazesdk_release = BlazeSDK.INSTANCE.getFollowEntitiesInternal$blazesdk_release();
                if (followEntitiesInternal$blazesdk_release != null) {
                    BlazePlayerType blazePlayerType = BlazePlayerType.MOMENTS;
                    String H = sqmVar.H();
                    BlazeFollowEntity blazeFollowEntity = new BlazeFollowEntity(glmVar.c);
                    blazePlayerType.getClass();
                    if (booleanValue) {
                        followEntitiesInternal$blazesdk_release.insertFollowedEntities(w9h.b(blazeFollowEntity));
                    } else {
                        followEntitiesInternal$blazesdk_release.removeFollowedEntities(w9h.b(blazeFollowEntity));
                    }
                    BlazeFollowEntityClickedParams blazeFollowEntityClickedParams = new BlazeFollowEntityClickedParams(blazePlayerType, H, booleanValue, blazeFollowEntity);
                    BlazeFollowEntitiesDelegate blazeFollowEntitiesDelegate = followEntitiesInternal$blazesdk_release.a;
                    if (blazeFollowEntitiesDelegate != null) {
                        blazeFollowEntitiesDelegate.onFollowEntityClicked(blazeFollowEntityClickedParams);
                    }
                }
                if (booleanValue) {
                    n4m D = sqmVar.D();
                    gimVar = D != null ? D.b : null;
                    if (gimVar instanceof gim.b) {
                        ysm.d(sqmVar, EventActionName.FOLLOW, ysm.createMomentsPlayerProps$default(sqmVar, (gim.b) gimVar, null, null, null, null, null, null, true, null, false, null, null, null, null, null, null, null, null, null, null, 1048446, null));
                    }
                } else {
                    n4m D2 = sqmVar.D();
                    gimVar = D2 != null ? D2.b : null;
                    if (gimVar instanceof gim.b) {
                        ysm.d(sqmVar, EventActionName.UNFOLLOW, ysm.createMomentsPlayerProps$default(sqmVar, (gim.b) gimVar, null, null, null, null, null, null, true, null, false, null, null, null, null, null, null, null, null, null, null, 1048446, null));
                    }
                }
                break;
            default:
                ((a) ((e0n) uVar).c).E(new hdm(((Float) obj).floatValue(), ((Float) obj2).floatValue()));
                break;
        }
        return Unit.a;
    }
}
