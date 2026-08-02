package defpackage;

import com.blaze.blazesdk.logger.models.BlazeLog;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qsl extends sq3 {
    public BlazeLog[] r;
    public int s;
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ g4m v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qsl(g4m g4mVar, sq3 sq3Var) {
        super(sq3Var);
        this.v = g4mVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.c(null, this);
    }
}
