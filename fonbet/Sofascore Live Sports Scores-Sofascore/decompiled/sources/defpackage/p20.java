package defpackage;

import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p20 extends xka implements Function1 {
    public final /* synthetic */ int i;
    public final /* synthetic */ b2f j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p20(b2f b2fVar, int i) {
        super(1);
        this.i = i;
        this.j = b2fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.i;
        b2f b2fVar = this.j;
        switch (i) {
            case 0:
                dma K = ((dma) obj).K();
                K.getClass();
                b2fVar.p(K);
                break;
            case 1:
                c7a c7aVar = (c7a) obj;
                long j = c7aVar.a;
                b2fVar.m15setPopupContentSizefhxjrPA(c7aVar);
                b2fVar.q();
                break;
            default:
                Function0 function0 = (Function0) obj;
                Handler handler = b2fVar.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = b2fVar.getHandler();
                    if (handler2 != null) {
                        handler2.post(new iy(7, function0));
                    }
                }
                break;
        }
        return Unit.a;
    }
}
