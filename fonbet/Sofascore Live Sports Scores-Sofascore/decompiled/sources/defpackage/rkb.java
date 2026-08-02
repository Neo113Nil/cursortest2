package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rkb extends xka implements Function0 {
    public final /* synthetic */ tkb i;
    public final /* synthetic */ long j;
    public final /* synthetic */ long k;
    public final /* synthetic */ she l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rkb(tkb tkbVar, long j, long j2, she sheVar) {
        super(0);
        this.i = tkbVar;
        this.j = j;
        this.k = j2;
        this.l = sheVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        tkb tkbVar = this.i;
        tkbVar.I0().a = false;
        tkbVar.I0().b = this.j;
        tkbVar.I0().c = this.k;
        Function1 c = this.l.a.c();
        if (c != null) {
            c.invoke(tkbVar.I0());
        }
        return Unit.a;
    }
}
