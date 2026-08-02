package defpackage;

import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ayf implements wff {
    public final /* synthetic */ int a = 1;
    public final wff b;
    public final wff c;
    public final wff d;
    public final wff e;
    public final wff f;

    public ayf(wff wffVar, wff wffVar2, wff wffVar3, wff wffVar4, wff wffVar5) {
        this.b = wffVar;
        this.c = wffVar2;
        this.d = wffVar3;
        this.e = wffVar4;
        this.f = wffVar5;
    }

    @Override // defpackage.yff
    public final Object get() {
        int i = this.a;
        wff wffVar = this.e;
        wff wffVar2 = this.d;
        wff wffVar3 = this.c;
        wff wffVar4 = this.b;
        wff wffVar5 = this.f;
        switch (i) {
            case 0:
                return new yxf((vhj) wffVar4.get(), (l48) wffVar3.get(), (kf0) wffVar2.get(), (zxf) wffVar.get(), (gah) wffVar5.get());
            default:
                return new b8h((r38) ((u7h) wffVar5).b, (l48) wffVar4.get(), (a9h) wffVar3.get(), (q06) wffVar2.get(), (CoroutineContext) wffVar.get());
        }
    }

    public ayf(u7h u7hVar, wff wffVar, wff wffVar2, wff wffVar3, wff wffVar4) {
        this.f = u7hVar;
        this.b = wffVar;
        this.c = wffVar2;
        this.d = wffVar3;
        this.e = wffVar4;
    }
}
