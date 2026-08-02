package defpackage;

import android.content.Context;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class q58 implements wff {
    public final /* synthetic */ int a;
    public final u7h b;
    public final wff c;

    public q58(wff wffVar, u7h u7hVar) {
        this.a = 2;
        this.c = wffVar;
        this.b = u7hVar;
    }

    @Override // defpackage.yff
    public final Object get() {
        int i = this.a;
        u7h u7hVar = this.b;
        wff wffVar = this.c;
        switch (i) {
            case 0:
                Context context = (Context) u7hVar.b;
                CoroutineContext coroutineContext = (CoroutineContext) wffVar.get();
                context.getClass();
                coroutineContext.getClass();
                return ug5.a(mx9.g, new e3c(new gl7(14), 10), s9a.c(coroutineContext), new c6(context, 25));
            case 1:
                return new x7f((Context) u7hVar.b, (kjk) wffVar.get());
            default:
                return new zxf((kf0) wffVar.get(), (CoroutineContext) u7hVar.b);
        }
    }

    public /* synthetic */ q58(u7h u7hVar, wff wffVar, int i) {
        this.a = i;
        this.b = u7hVar;
        this.c = wffVar;
    }
}
