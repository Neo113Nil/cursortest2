package defpackage;

import androidx.compose.ui.platform.ComposeView;
import com.sofascore.results.profile.UserProfileActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ufk extends hoi implements Function2 {
    public final /* synthetic */ ComposeView r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ UserProfileActivity v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ufk(ComposeView composeView, boolean z, boolean z2, boolean z3, UserProfileActivity userProfileActivity, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = composeView;
        this.s = z;
        this.t = z2;
        this.u = z3;
        this.v = userProfileActivity;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new ufk(this.r, this.s, this.t, this.u, this.v, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ufk) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        int i = (this.s || this.t || this.u) ? 0 : 8;
        ComposeView composeView = this.r;
        composeView.setVisibility(i);
        if (composeView.getVisibility() == 0) {
            nv.z0(this.v, kv.IMPRESSION, "referral", "user_profile");
        }
        return Unit.a;
    }
}
