package defpackage;

import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;
import defpackage.aim;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class y9m {
    public static final aim a(BlazeMomentsPlayerStyle blazeMomentsPlayerStyle) {
        blazeMomentsPlayerStyle.getClass();
        return blazeMomentsPlayerStyle.getFollowEntity().isVisible() ? new aim.a(blazeMomentsPlayerStyle.getFollowEntity().getEntityType()) : yfm.a;
    }
}
