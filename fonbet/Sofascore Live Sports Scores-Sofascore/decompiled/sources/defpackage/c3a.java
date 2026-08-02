package defpackage;

import com.sofascore.results.service.InfoWorker;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c3a extends sq3 {
    public Collection r;
    public Iterator s;
    public String t;
    public int u;
    public int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ InfoWorker y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3a(InfoWorker infoWorker, sq3 sq3Var) {
        super(sq3Var);
        this.y = infoWorker;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.doWork(this);
    }
}
