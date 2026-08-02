package ol0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;
import pl0.AbstractC8941a;
import zl0.C11150a;
import zl0.C11151b;

/* renamed from: ol0.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8751c {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C8751c f78428a = new C8751c();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, android.content.ServiceConnection, ol0.d] */
    public static void a(@NotNull Context context, @NotNull AbstractC8941a analyticsEvent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(analyticsEvent, "analyticsEvent");
        String eventName = analyticsEvent.b();
        Map<String, String> eventData = analyticsEvent.a();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        Intrinsics.checkNotNullParameter(context, "context");
        if (C11151b.a(context, "ru.vk.store.qa") || C11151b.a(context, "ru.vk.store")) {
            Intent intent = new Intent("ru.vk.store.provider.analytics.RemoteAnalyticsProvider");
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
            Intrinsics.checkNotNullExpressionValue(queryIntentServices, "context.packageManager.q…IntentServices(intent, 0)");
            ComponentName a11 = C11150a.a(queryIntentServices);
            if (a11 == null) {
                return;
            }
            intent.setComponent(a11);
            M m11 = new M();
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            ?? serviceConnectionC8752d = new ServiceConnectionC8752d(packageName, eventName, eventData, new C8749a(context, m11), new C8750b(context, m11));
            m11.f71787a = serviceConnectionC8752d;
            try {
                context.bindService(intent, (ServiceConnection) serviceConnectionC8752d, 1);
            } catch (SecurityException e11) {
                Log.e("AnalyticsEventProvider", "postAnalyticsEvent", e11);
            }
        }
    }
}
