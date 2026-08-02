package defpackage;

import com.sofascore.local_persistance.UserAccount;
import com.sofascore.model.profile.ProfileData;
import com.sofascore.results.service.ProfileWorker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class zbf extends sq3 {
    public UserAccount r;
    public x2g s;
    public ProfileData t;
    public long u;
    public /* synthetic */ Object v;
    public final /* synthetic */ ProfileWorker w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbf(ProfileWorker profileWorker, sq3 sq3Var) {
        super(sq3Var);
        this.w = profileWorker;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.c(this);
    }
}
