package bo.app;

import com.braze.support.BrazeLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class vd extends FunctionReferenceImpl implements Function4 {
    public vd(xd xdVar) {
        super(4, xdVar, xd.class, "log", "log$android_sdk_base_release(Ljava/lang/String;Lcom/braze/support/BrazeLogger$Priority;Ljava/lang/String;Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String p02 = (String) obj;
        BrazeLogger.Priority p12 = (BrazeLogger.Priority) obj2;
        String p22 = (String) obj3;
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        Intrinsics.checkNotNullParameter(p22, "p2");
        ((xd) this.receiver).a(p02, p12, p22, (Throwable) obj4);
        return Unit.INSTANCE;
    }
}
