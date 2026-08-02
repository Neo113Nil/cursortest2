package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class q1m extends sq3 {
    public int r;
    public int s;
    public long t;
    public Function1 u;
    public Throwable v;
    public /* synthetic */ Object w;
    public final /* synthetic */ pgm x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1m(pgm pgmVar, sq3 sq3Var) {
        super(sq3Var);
        this.x = pgmVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= Integer.MIN_VALUE;
        return this.x.a(0, 0L, null, this);
    }
}
