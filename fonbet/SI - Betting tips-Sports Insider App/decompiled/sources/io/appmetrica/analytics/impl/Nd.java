package io.appmetrica.analytics.impl;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class Nd extends FunctionReferenceImpl implements Function1 {
    public Nd(Object obj) {
        super(1, obj, Od.class, "markCrashCompletedAndDeleteCompletedCrashes", "markCrashCompletedAndDeleteCompletedCrashes(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Od od2 = (Od) this.receiver;
        od2.f12687a.markCrashCompleted((String) obj);
        od2.f12687a.deleteCompletedCrashes();
        return Unit.f19194a;
    }
}
