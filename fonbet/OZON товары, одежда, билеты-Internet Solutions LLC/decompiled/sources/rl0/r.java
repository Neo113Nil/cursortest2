package rl0;

import Sc.r;
import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import nl0.C8604d;
import ru.rustore.sdk.activitylauncher.a;
import ru.rustore.sdk.appupdate.errors.RuStoreInstallException;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

/* loaded from: classes4.dex */
public final class r extends AbstractC7737t implements Function1<lm0.e<Integer>, Unit> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y f83713b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppUpdateInfo f83714c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Y y11, AppUpdateInfo appUpdateInfo) {
        super(1);
        this.f83713b = y11;
        this.f83714c = appUpdateInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(lm0.e<Integer> eVar) {
        Object a11;
        lm0.e<Integer> emitter = eVar;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        Y y11 = this.f83713b;
        AppUpdateInfo appUpdateInfo = this.f83714c;
        try {
            r.Companion companion = Sc.r.INSTANCE;
            Intent a12 = y11.a("ru.vk.store.AnyAppForceUpdateActivity", null);
            if (a12 != null) {
                C8604d.a(y11.f83656a, a12, new B90.a0(emitter, 5));
                appUpdateInfo.markIsUsed$sdk_public_appupdate_release();
            } else {
                emitter.a(new RuStoreInstallException(a.C2157a.f97948b.a()));
            }
            a11 = Unit.f71690a;
        } catch (Throwable th2) {
            r.Companion companion2 = Sc.r.INSTANCE;
            a11 = Sc.s.a(th2);
        }
        Throwable b11 = Sc.r.b(a11);
        if (b11 != null) {
            emitter.a(b11);
        }
        return Unit.f71690a;
    }
}
