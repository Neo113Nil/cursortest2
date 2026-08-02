package rl0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

/* renamed from: rl0.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9290a extends AbstractC7737t implements Function1<AppUpdateInfo, Unit> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lm0.e<AppUpdateInfo> f83664b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9290a(lm0.e<AppUpdateInfo> eVar) {
        super(1);
        this.f83664b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AppUpdateInfo appUpdateInfo) {
        AppUpdateInfo appUpdateInfo2 = appUpdateInfo;
        Intrinsics.checkNotNullParameter(appUpdateInfo2, "appUpdateInfo");
        this.f83664b.b(appUpdateInfo2);
        return Unit.f71690a;
    }
}
