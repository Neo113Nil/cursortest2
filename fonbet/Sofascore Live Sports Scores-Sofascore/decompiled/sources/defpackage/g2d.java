package defpackage;

import com.sofascore.results.service.MuteStageWorker;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class g2d extends sq3 {
    public int r;
    public int s;
    public int t;
    public List u;
    public List v;
    public ArrayList w;
    public /* synthetic */ Object x;
    public final /* synthetic */ MuteStageWorker y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2d(MuteStageWorker muteStageWorker, sq3 sq3Var) {
        super(sq3Var);
        this.y = muteStageWorker;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.j(0, null, null, this);
    }
}
