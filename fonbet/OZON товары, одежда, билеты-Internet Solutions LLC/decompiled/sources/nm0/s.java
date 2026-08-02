package nm0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s extends AbstractC7737t implements Function0<Al0.b> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f77420b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f77421c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, q qVar) {
        super(0);
        this.f77420b = uVar;
        this.f77421c = qVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Al0.b invoke() {
        this.f77420b.f77423a.getClass();
        q model = this.f77421c;
        Intrinsics.checkNotNullParameter(model, "model");
        model.getClass();
        return new Al0.b("sdkInfo", model.f77419a);
    }
}
