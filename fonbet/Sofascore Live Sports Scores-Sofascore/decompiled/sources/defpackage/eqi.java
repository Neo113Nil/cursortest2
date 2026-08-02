package defpackage;

import com.sofascore.results.service.SyncWorker;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class eqi extends sq3 {
    public List r;
    public HashSet s;
    public HashSet t;
    public /* synthetic */ Object u;
    public final /* synthetic */ SyncWorker v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqi(SyncWorker syncWorker, sq3 sq3Var) {
        super(sq3Var);
        this.v = syncWorker;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.n(null, this);
    }
}
