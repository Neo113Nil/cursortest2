package rl0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class E extends AbstractC7737t implements Function0<Al0.b> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f83611b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C9313y f83612c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(N n11, C9313y c9313y) {
        super(0);
        this.f83611b = n11;
        this.f83612c = c9313y;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Al0.b invoke() {
        this.f83611b.f83626a.getClass();
        C9313y model = this.f83612c;
        Intrinsics.checkNotNullParameter(model, "model");
        return new Al0.b(model.f83721b, model.f83722c);
    }
}
