package defpackage;

import com.sofascore.results.service.MuteStageWorker;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class e2d extends sq3 {
    public int r;
    public int s;
    public List t;
    public List u;
    public ArrayList v;
    public /* synthetic */ Object w;
    public final /* synthetic */ MuteStageWorker x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2d(MuteStageWorker muteStageWorker, sq3 sq3Var) {
        super(sq3Var);
        this.x = muteStageWorker;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.h(0, this);
    }
}
