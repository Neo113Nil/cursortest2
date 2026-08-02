package defpackage;

import com.sofascore.local_persistance.UserAccount;
import com.sofascore.results.service.WeeklyChallengeWorker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class o4l extends sq3 {
    public UserAccount r;
    public jdb s;
    public int t;
    public int u;
    public int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ WeeklyChallengeWorker y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4l(WeeklyChallengeWorker weeklyChallengeWorker, sq3 sq3Var) {
        super(sq3Var);
        this.y = weeklyChallengeWorker;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.a(this);
    }
}
