package defpackage;

import com.sofascore.model.database.DbNatsEvent;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class r5d extends sq3 {
    public Integer r;
    public DbNatsEvent s;
    public Object t;
    public /* synthetic */ Object u;
    public final /* synthetic */ s5d v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5d(s5d s5dVar, sq3 sq3Var) {
        super(sq3Var);
        this.v = s5dVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.b(null, null, null, this);
    }
}
