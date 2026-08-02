package com.vk.id.internal.auth;

import Ca.C2733a;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.vk.id.VKID;
import com.vk.id.internal.auth.AuthActivity;
import com.vk.id.internal.auth.AuthActivity$handleStartAuth$1;
import com.vk.id.tracking.core.CrashReporter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s.C9556d;
import s.C9557e;
import s.f;
import s.g;

@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/vk/id/internal/auth/AuthActivity$handleStartAuth$1", "Ls/f;", "Landroid/content/ComponentName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "Ls/d;", "client", "", "onCustomTabsServiceConnected", "(Landroid/content/ComponentName;Ls/d;)V", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AuthActivity$handleStartAuth$1 extends f {
    final /* synthetic */ AuthActivity this$0;

    AuthActivity$handleStartAuth$1(AuthActivity authActivity) {
        this.this$0 = authActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCustomTabsServiceConnected$lambda$0(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCustomTabsServiceConnected$lambda$2(AuthActivity authActivity, C9556d c9556d) {
        AuthActivity$callback$1 authActivity$callback$1;
        g gVar;
        Intent intent;
        authActivity$callback$1 = authActivity.callback;
        authActivity.customTabsSession = c9556d.c(authActivity$callback$1);
        c9556d.d();
        gVar = authActivity.customTabsSession;
        C9557e.a aVar = new C9557e.a(gVar);
        aVar.e();
        aVar.a();
        aVar.c();
        C9557e b11 = aVar.b();
        intent = authActivity.authIntent;
        Intrinsics.f(intent);
        Uri data = intent.getData();
        Intent intent2 = b11.f98031a;
        intent2.setData(data);
        Intrinsics.checkNotNullExpressionValue(intent2, "apply(...)");
        authActivity.launchAuth(intent2);
        return Unit.f71690a;
    }

    @Override // s.f
    public void onCustomTabsServiceConnected(ComponentName name, final C9556d client) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(client, "client");
        CrashReporter crashReporter = VKID.INSTANCE.getInstance().getCrashReporter();
        C2733a c2733a = new C2733a(1);
        final AuthActivity authActivity = this.this$0;
        crashReporter.runReportingCrashes(c2733a, new Function0() { // from class: na.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit onCustomTabsServiceConnected$lambda$2;
                onCustomTabsServiceConnected$lambda$2 = AuthActivity$handleStartAuth$1.onCustomTabsServiceConnected$lambda$2(AuthActivity.this, client);
                return onCustomTabsServiceConnected$lambda$2;
            }
        });
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName name) {
    }
}
