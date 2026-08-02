package defpackage;

import com.sofascore.model.profile.ProfileData;
import com.sofascore.results.weeklyChallenge.WeeklyChallengeViewModel;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class d4l extends sq3 {
    public int A;
    public ProfileData r;
    public b7 s;
    public oc t;
    public ArrayList u;
    public int v;
    public int w;
    public boolean x;
    public /* synthetic */ Object y;
    public final /* synthetic */ WeeklyChallengeViewModel z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4l(WeeklyChallengeViewModel weeklyChallengeViewModel, sq3 sq3Var) {
        super(sq3Var);
        this.z = weeklyChallengeViewModel;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.k(null, null, null, null, this);
    }
}
