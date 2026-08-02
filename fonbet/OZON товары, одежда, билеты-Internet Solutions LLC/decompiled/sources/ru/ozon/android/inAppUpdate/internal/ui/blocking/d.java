package ru.ozon.android.inAppUpdate.internal.ui.blocking;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.android.inAppUpdate.internal.ui.blocking.c;

/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function1<Boolean, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ OzonInAppUpdateSdkBlockingActivity f83866b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(OzonInAppUpdateSdkBlockingActivity ozonInAppUpdateSdkBlockingActivity) {
        super(1);
        this.f83866b = ozonInAppUpdateSdkBlockingActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        j M11;
        boolean booleanValue = bool.booleanValue();
        M11 = this.f83866b.M();
        M11.i0(new c.C1448c(booleanValue));
        return Unit.f71690a;
    }
}
