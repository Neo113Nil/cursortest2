package rl0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import lm0.AbstractC7971a;

/* loaded from: classes4.dex */
public final class l0 extends AbstractC7737t implements Function1<Unit, AbstractC7971a<Unit>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y f83696b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f83697c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(Y y11, int i11) {
        super(1);
        this.f83696b = y11;
        this.f83697c = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final AbstractC7971a<Unit> invoke(Unit unit) {
        Unit it = unit;
        Intrinsics.checkNotNullParameter(it, "it");
        C9305p source = new C9305p(this.f83696b, this.f83697c);
        Intrinsics.checkNotNullParameter(source, "source");
        return new lm0.b(source);
    }
}
