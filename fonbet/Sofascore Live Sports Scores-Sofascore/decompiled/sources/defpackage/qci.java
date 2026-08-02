package defpackage;

import com.sofascore.model.network.response.UserRegionResponse;
import com.sofascore.results.service.StartWorker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qci extends sq3 {
    public int r;
    public long s;
    public long t;
    public String u;
    public x2g v;
    public UserRegionResponse w;
    public /* synthetic */ Object x;
    public final /* synthetic */ StartWorker y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qci(StartWorker startWorker, sq3 sq3Var) {
        super(sq3Var);
        this.y = startWorker;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.b(this);
    }
}
