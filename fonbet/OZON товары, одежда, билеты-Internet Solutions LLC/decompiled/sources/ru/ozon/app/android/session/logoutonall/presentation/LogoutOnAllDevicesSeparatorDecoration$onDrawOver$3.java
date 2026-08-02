package ru.ozon.app.android.session.logoutonall.presentation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.session.logoutonall.data.LogoutOnAllDevicesVO;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/ozon/app/android/session/logoutonall/presentation/LogoutOnAllDevicesViewHolder;", "it", "", "invoke", "(Lru/ozon/app/android/session/logoutonall/presentation/LogoutOnAllDevicesViewHolder;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class LogoutOnAllDevicesSeparatorDecoration$onDrawOver$3 extends AbstractC7737t implements Function1<LogoutOnAllDevicesViewHolder, Boolean> {
    public static final LogoutOnAllDevicesSeparatorDecoration$onDrawOver$3 INSTANCE = new LogoutOnAllDevicesSeparatorDecoration$onDrawOver$3();

    LogoutOnAllDevicesSeparatorDecoration$onDrawOver$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(LogoutOnAllDevicesViewHolder it) {
        Intrinsics.checkNotNullParameter(it, "it");
        LogoutOnAllDevicesVO boundedData = it.getBoundedData();
        boolean z11 = false;
        if (boundedData != null && boundedData.getShowSeparator()) {
            z11 = true;
        }
        return Boolean.valueOf(z11);
    }
}
