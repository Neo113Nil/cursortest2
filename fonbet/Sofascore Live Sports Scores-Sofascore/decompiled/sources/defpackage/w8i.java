package defpackage;

import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.results.service.StageWorker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class w8i extends sq3 {
    public int r;
    public int s;
    public boolean t;
    public Stage u;
    public /* synthetic */ Object v;
    public final /* synthetic */ StageWorker w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8i(StageWorker stageWorker, sq3 sq3Var) {
        super(sq3Var);
        this.w = stageWorker;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.f(0, false, this);
    }
}
