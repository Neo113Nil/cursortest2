package rl0;

import Ve.C4740wn;
import android.content.Context;
import android.content.ServiceConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

/* renamed from: rl0.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9314z extends AbstractC7737t implements Function1<lm0.e<Unit>, ServiceConnection> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppUpdateInfo f83723b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y f83724c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9314z(Y y11, AppUpdateInfo appUpdateInfo) {
        super(1);
        this.f83723b = appUpdateInfo;
        this.f83724c = y11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final ServiceConnection invoke(lm0.e<Unit> eVar) {
        lm0.e<Unit> emitter = eVar;
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        this.f83723b.markIsUsed$sdk_public_appupdate_release();
        Context context = this.f83724c.f83656a;
        String packageName = context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        return new J(context, packageName, new C4740wn(emitter, 1), new C9311w(emitter));
    }
}
