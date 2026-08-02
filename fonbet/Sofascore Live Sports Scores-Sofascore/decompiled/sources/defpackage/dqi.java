package defpackage;

import com.sofascore.results.service.SyncWorker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class dqi extends sq3 {
    public ArrayList r;
    public Set s;
    public Set t;
    public Iterator u;
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ SyncWorker x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqi(SyncWorker syncWorker, sq3 sq3Var) {
        super(sq3Var);
        this.x = syncWorker;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.m(null, this);
    }
}
