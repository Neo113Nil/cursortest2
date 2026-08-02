package ru.ozon.android.inAppUpdate.internal.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes10.dex */
final class f extends AbstractC7737t implements Function2<Boolean, Boolean, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ OzonInAppUpdateSdkActivity f83900b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f83901c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(OzonInAppUpdateSdkActivity ozonInAppUpdateSdkActivity, g gVar) {
        super(2);
        this.f83900b = ozonInAppUpdateSdkActivity;
        this.f83901c = gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Boolean bool2) {
        boolean booleanValue = bool.booleanValue();
        boolean booleanValue2 = bool2.booleanValue();
        if (booleanValue) {
            OzonInAppUpdateSdkActivity ozonInAppUpdateSdkActivity = this.f83900b;
            ozonInAppUpdateSdkActivity.J(this.f83901c);
            if (booleanValue2) {
                ozonInAppUpdateSdkActivity.finish();
            }
        }
        return Unit.f71690a;
    }
}
