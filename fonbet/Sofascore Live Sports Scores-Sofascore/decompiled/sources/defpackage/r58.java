package defpackage;

import android.content.Context;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class r58 implements wff {
    public final /* synthetic */ int a = 0;
    public final wff b;
    public final wff c;
    public final wff d;

    public r58(wff wffVar, wff wffVar2, wff wffVar3) {
        this.b = wffVar;
        this.c = wffVar2;
        this.d = wffVar3;
    }

    @Override // defpackage.yff
    public final Object get() {
        int i = this.a;
        wff wffVar = this.d;
        wff wffVar2 = this.c;
        wff wffVar3 = this.b;
        switch (i) {
            case 0:
                Context context = (Context) ((u7h) wffVar).b;
                CoroutineContext coroutineContext = (CoroutineContext) wffVar3.get();
                t7h t7hVar = (t7h) wffVar2.get();
                context.getClass();
                coroutineContext.getClass();
                t7hVar.getClass();
                return ug5.a(t7hVar, new e3c(new yx7(t7hVar, 8), 10), s9a.c(coroutineContext), new c6(context, 26));
            default:
                return new gah((CoroutineContext) wffVar3.get(), (vhj) wffVar2.get(), (ye4) wffVar.get());
        }
    }

    public r58(u7h u7hVar, wff wffVar, wff wffVar2) {
        this.d = u7hVar;
        this.b = wffVar;
        this.c = wffVar2;
    }
}
