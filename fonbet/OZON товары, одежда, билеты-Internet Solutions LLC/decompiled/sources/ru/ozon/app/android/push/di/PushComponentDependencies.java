package ru.ozon.app.android.push.di;

import eh0.d;
import hi.InterfaceC6958a;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H'¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/push/di/PushComponentDependencies;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/push/di/PushComponentConfig;", "getPushComponentConfig", "()Lru/ozon/app/android/push/di/PushComponentConfig;", "", "Leh0/d;", "getPreShowNotificationsHandler", "()Ljava/util/Set;", "push_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PushComponentDependencies extends InterfaceC6958a {
    @NotNull
    Set<d> getPreShowNotificationsHandler();

    @NotNull
    PushComponentConfig getPushComponentConfig();
}
