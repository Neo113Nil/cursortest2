package rl0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import lm0.AbstractC7971a;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

/* loaded from: classes4.dex */
public final class C extends AbstractC7737t implements Function1<Unit, AbstractC7971a<Integer>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y f83608b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppUpdateInfo f83609c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(Y y11, AppUpdateInfo appUpdateInfo) {
        super(1);
        this.f83608b = y11;
        this.f83609c = appUpdateInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final AbstractC7971a<Integer> invoke(Unit unit) {
        Unit it = unit;
        Intrinsics.checkNotNullParameter(it, "it");
        C9303n source = new C9303n(this.f83608b, this.f83609c);
        Intrinsics.checkNotNullParameter(source, "source");
        return new lm0.b(source);
    }
}
