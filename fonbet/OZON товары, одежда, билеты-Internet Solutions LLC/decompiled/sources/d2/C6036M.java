package d2;

import B90.f0;
import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: d2.M, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C6036M extends AbstractC7737t implements Function1<Function0<? extends Unit>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6034K f61028b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6036M(C6034K c6034k) {
        super(1);
        this.f61028b = c6034k;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Function0<? extends Unit> function0) {
        Function0<? extends Unit> function02 = function0;
        C6034K c6034k = this.f61028b;
        Handler handler = c6034k.getHandler();
        if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
            function02.invoke();
        } else {
            Handler handler2 = c6034k.getHandler();
            if (handler2 != null) {
                handler2.post(new f0(function02, 5));
            }
        }
        return Unit.f71690a;
    }
}
