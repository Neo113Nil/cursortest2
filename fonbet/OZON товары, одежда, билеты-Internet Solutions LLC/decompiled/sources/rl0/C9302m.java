package rl0;

import android.content.Intent;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

/* renamed from: rl0.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C9302m extends AbstractC7737t implements Function1<Intent, Unit> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppUpdateInfo f83698b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9302m(Y y11, AppUpdateInfo appUpdateInfo) {
        super(1);
        this.f83698b = appUpdateInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Intent intent) {
        Intent intent2 = intent;
        Intrinsics.checkNotNullParameter(intent2, "intent");
        AppUpdateInfo appUpdateInfo = this.f83698b;
        Intrinsics.checkNotNullParameter(appUpdateInfo, "appUpdateInfo");
        Bundle bundle = new Bundle();
        bundle.putLong("APPLICATION_ID", appUpdateInfo.getAppId());
        bundle.putString("PACKAGE_NAME", appUpdateInfo.getPackageName());
        bundle.putString("APP_NAME", appUpdateInfo.getAppName());
        bundle.putString("ICON_URL", appUpdateInfo.getIconUrl());
        bundle.putLong("FILE_SIZE", appUpdateInfo.getFileSize());
        bundle.putString("AVAILABLE_VERSION_NAME", appUpdateInfo.getAvailableVersionName());
        long availableVersionCode = appUpdateInfo.getAvailableVersionCode();
        bundle.putInt("AVAILABLE_VERSION_CODE", (-2147483648L > availableVersionCode || availableVersionCode > 2147483647L) ? 0 : (int) availableVersionCode);
        bundle.putLong("AVAILABLE_VERSION_CODE_LONG", appUpdateInfo.getAvailableVersionCode());
        bundle.putString("whatsNew", appUpdateInfo.getWhatsNew());
        bundle.putString("UPDATED_AT", appUpdateInfo.getUpdatedAt());
        intent2.putExtras(bundle);
        return Unit.f71690a;
    }
}
