package ru.ozon.app.android.inapppush.presentation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zd0.c;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/inapppush/presentation/InAppPushListener;", "Lzd0/c;", "<init>", "()V", "Lzd0/c$a;", "dismissReason", "", "", "Lzd0/c$c;", "trackingInfo", "", "onDismiss", "(Lzd0/c$a;Ljava/util/Map;)V", "in-app-push-host_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class InAppPushListener implements c {
    @Override // zd0.c
    public void onDismiss(@NotNull c.a dismissReason, @NotNull Map<String, c.C2348c> trackingInfo) {
        Intrinsics.checkNotNullParameter(dismissReason, "dismissReason");
        Intrinsics.checkNotNullParameter(trackingInfo, "trackingInfo");
    }
}
