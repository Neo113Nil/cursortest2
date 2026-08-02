package defpackage;

import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.results.service.SyncWorker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wpi extends sq3 {
    public Stage r;
    public /* synthetic */ Object s;
    public final /* synthetic */ SyncWorker t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wpi(SyncWorker syncWorker, sq3 sq3Var) {
        super(sq3Var);
        this.t = syncWorker;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.f(null, this);
    }
}
