package nm0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zl0.C11150a;
import zl0.C11151b;

/* renamed from: nm0.D, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C8609D {

    /* renamed from: a, reason: collision with root package name */
    public final Context f77384a;

    /* renamed from: b, reason: collision with root package name */
    public final String f77385b;

    public C8609D(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f77384a = context;
        this.f77385b = context.getPackageName();
    }

    public static final void a(Context context, Function1 function1, ServiceConnection serviceConnection) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!C11151b.a(context, "ru.vk.store.qa") && !C11151b.a(context, "ru.vk.store")) {
            function1.invoke(new wl0.d());
            return;
        }
        Intent intent = new Intent("ru.vk.store.provider.review.RemoteReviewFlowProvider");
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        Intrinsics.checkNotNullExpressionValue(queryIntentServices, "packageManager.queryIntentServices(intent, 0)");
        ComponentName a11 = C11150a.a(queryIntentServices);
        if (a11 == null) {
            function1.invoke(new wl0.e());
        } else {
            intent.setComponent(a11);
            context.bindService(intent, serviceConnection, 1);
        }
    }
}
