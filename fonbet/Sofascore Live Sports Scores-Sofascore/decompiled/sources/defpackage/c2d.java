package defpackage;

import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.results.service.MuteStageWorker;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c2d extends sq3 {
    public int r;
    public int s;
    public List t;
    public Stage u;
    public Stage v;
    public /* synthetic */ Object w;
    public final /* synthetic */ MuteStageWorker x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2d(MuteStageWorker muteStageWorker, sq3 sq3Var) {
        super(sq3Var);
        this.x = muteStageWorker;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.e(0, null, this);
    }
}
