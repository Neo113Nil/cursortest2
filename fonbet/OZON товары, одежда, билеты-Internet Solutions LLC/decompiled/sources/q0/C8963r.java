package q0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: q0.r, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C8963r extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f81348b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC7737t f81349c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    C8963r(boolean z11, Function0<Unit> function0) {
        super(0);
        this.f81348b = z11;
        this.f81349c = (AbstractC7737t) function0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.t] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.f81348b) {
            this.f81349c.invoke();
        }
        return Unit.f71690a;
    }
}
