package defpackage;

import com.blaze.blazesdk.interactions.models.local.InteractionStatus;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hnm extends ap5 {
    public hnm(k6g k6gVar) {
        super(k6gVar, 1);
    }

    @Override // defpackage.y0
    public final String c() {
        return "INSERT OR REPLACE INTO `interactions_status` (`interaction_id`,`interacted_value`) VALUES (?,?)";
    }

    @Override // defpackage.ap5
    public final void v(mni mniVar, Object obj) {
        InteractionStatus interactionStatus = (InteractionStatus) obj;
        if (interactionStatus.getInteractionId() == null) {
            mniVar.s(1);
        } else {
            mniVar.m0(1, interactionStatus.getInteractionId());
        }
        if (interactionStatus.getInteractionValue() == null) {
            mniVar.s(2);
        } else {
            mniVar.m0(2, interactionStatus.getInteractionValue());
        }
    }
}
