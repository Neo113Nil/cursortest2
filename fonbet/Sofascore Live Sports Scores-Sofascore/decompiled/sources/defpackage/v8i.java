package defpackage;

import com.sofascore.results.service.StageWorker;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v8i extends sq3 {
    public int r;
    public List s;
    public /* synthetic */ Object t;
    public final /* synthetic */ StageWorker u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8i(StageWorker stageWorker, sq3 sq3Var) {
        super(sq3Var);
        this.u = stageWorker;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.d(0, this);
    }
}
