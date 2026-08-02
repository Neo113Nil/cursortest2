package defpackage;

import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.results.service.MuteStageWorker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class d2d extends sq3 {
    public int A;
    public int r;
    public int s;
    public int t;
    public int u;
    public Stage v;
    public Stage w;
    public Integer x;
    public /* synthetic */ Object y;
    public final /* synthetic */ MuteStageWorker z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2d(MuteStageWorker muteStageWorker, sq3 sq3Var) {
        super(sq3Var);
        this.z = muteStageWorker;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.f(0, this);
    }
}
