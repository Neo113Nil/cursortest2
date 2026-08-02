package ru.ozon.android.inAppUpdate.internal.ui.blocking;

import android.content.pm.PackageManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import pj.C8938a;
import ru.ozon.android.inAppUpdate.internal.ui.blocking.c;

/* loaded from: classes10.dex */
final class f extends AbstractC7737t implements Function2<Boolean, Boolean, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ OzonInAppUpdateSdkBlockingActivity f83868b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(OzonInAppUpdateSdkBlockingActivity ozonInAppUpdateSdkBlockingActivity) {
        super(2);
        this.f83868b = ozonInAppUpdateSdkBlockingActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Boolean bool2) {
        j M11;
        boolean booleanValue = bool.booleanValue();
        bool2.getClass();
        int i11 = lj.c.f73376d;
        OzonInAppUpdateSdkBlockingActivity ozonInAppUpdateSdkBlockingActivity = this.f83868b;
        PackageManager packageManager = ozonInAppUpdateSdkBlockingActivity.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        try {
            if (packageManager.canRequestPackageInstalls()) {
                M11 = ozonInAppUpdateSdkBlockingActivity.M();
                M11.i0(new c.e(booleanValue));
            }
        } catch (Exception e11) {
            int i12 = C8938a.f81237c;
            C8938a.c(null, e11);
        }
        return Unit.f71690a;
    }
}
