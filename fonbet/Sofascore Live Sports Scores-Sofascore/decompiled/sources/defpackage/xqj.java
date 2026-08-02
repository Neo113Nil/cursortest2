package defpackage;

import com.sofascore.model.mvvm.model.PinnedTournament;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class xqj extends sq3 {
    public irj r;
    public PinnedTournament s;
    public Iterator t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ irj w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqj(irj irjVar, sq3 sq3Var) {
        super(sq3Var);
        this.w = irjVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return irj.e(this.w, null, this);
    }
}
