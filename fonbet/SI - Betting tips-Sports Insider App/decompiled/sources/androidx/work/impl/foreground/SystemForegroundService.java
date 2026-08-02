package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.h0;
import e3.l;
import e3.x;
import f3.v;
import g8.a;
import java.util.UUID;
import k2.a0;
import kotlin.jvm.internal.Intrinsics;
import l3.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class SystemForegroundService extends h0 {

    /* renamed from: e, reason: collision with root package name */
    public static final String f2937e = x.g("SystemFgService");

    /* renamed from: b, reason: collision with root package name */
    public boolean f2938b;

    /* renamed from: c, reason: collision with root package name */
    public b f2939c;

    /* renamed from: d, reason: collision with root package name */
    public NotificationManager f2940d;

    public final void a() {
        this.f2940d = (NotificationManager) getApplicationContext().getSystemService("notification");
        b bVar = new b(getApplicationContext());
        this.f2939c = bVar;
        if (bVar.f19348i != null) {
            x.e().c(b.j, "A callback already exists.");
        } else {
            bVar.f19348i = this;
        }
    }

    @Override // androidx.lifecycle.h0, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.h0, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f2939c.e();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i5, int i10) {
        super.onStartCommand(intent, i5, i10);
        boolean z5 = this.f2938b;
        String str = f2937e;
        if (z5) {
            x.e().f(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f2939c.e();
            a();
            this.f2938b = false;
        }
        if (intent == null) {
            return 3;
        }
        b bVar = this.f2939c;
        bVar.getClass();
        String str2 = b.j;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            x.e().f(str2, "Started foreground service " + intent);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            ((a0) bVar.f19341b.f6182a).execute(new a(23, bVar, stringExtra, false));
            bVar.d(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            bVar.d(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            x.e().f(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = bVar.f19348i;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.f2938b = true;
            x.e().a(str, "Shutting down.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf(i10);
            return 3;
        }
        x.e().f(str2, "Stopping foreground work for " + intent);
        String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
            return 3;
        }
        v workManagerImpl = bVar.f19340a;
        UUID id2 = UUID.fromString(stringExtra2);
        workManagerImpl.getClass();
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(workManagerImpl, "workManagerImpl");
        l lVar = workManagerImpl.f9427b.f8489p;
        a0 a0Var = (a0) workManagerImpl.f9429d.f6182a;
        Intrinsics.checkNotNullExpressionValue(a0Var, "getSerialTaskExecutor(...)");
        a.a.t(lVar, "CancelWorkById", a0Var, new a2.l(8, workManagerImpl, id2));
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i5) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.f2939c.f(i5, 2048);
    }

    public final void onTimeout(int i5, int i10) {
        this.f2939c.f(i5, i10);
    }
}
