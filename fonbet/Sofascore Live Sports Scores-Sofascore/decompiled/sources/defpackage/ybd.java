package defpackage;

import com.sofascore.model.network.response.EventBasicInfo;
import com.sofascore.results.service.NewlyAddedEventsWorker;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ybd extends sq3 {
    public int A;
    public List r;
    public HashSet s;
    public HashSet t;
    public asf u;
    public Iterator v;
    public EventBasicInfo w;
    public boolean x;
    public /* synthetic */ Object y;
    public final /* synthetic */ NewlyAddedEventsWorker z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybd(NewlyAddedEventsWorker newlyAddedEventsWorker, sq3 sq3Var) {
        super(sq3Var);
        this.z = newlyAddedEventsWorker;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.doWork(this);
    }
}
