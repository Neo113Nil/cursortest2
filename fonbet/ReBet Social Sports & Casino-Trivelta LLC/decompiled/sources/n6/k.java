package n6;

import T7.C1678s;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import g6.C4331C;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f57063a = new k();

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f57064b = new AtomicBoolean(false);

    public static final void a() {
        if (Y7.a.d(k.class)) {
            return;
        }
        try {
            f57064b.set(true);
            b();
        } catch (Throwable th2) {
            Y7.a.b(th2, k.class);
        }
    }

    public static final void b() {
        if (Y7.a.d(k.class)) {
            return;
        }
        try {
            if (f57064b.get()) {
                if (f57063a.c()) {
                    C1678s c1678s = C1678s.f11164a;
                    if (C1678s.g(C1678s.b.IapLoggingLib2)) {
                        f fVar = f.f57022a;
                        f.d(C4331C.l());
                        return;
                    }
                }
                C5671a.g();
            }
        } catch (Throwable th2) {
            Y7.a.b(th2, k.class);
        }
    }

    public final boolean c() {
        if (Y7.a.d(this)) {
            return false;
        }
        try {
            Context l10 = C4331C.l();
            ApplicationInfo applicationInfo = l10.getPackageManager().getApplicationInfo(l10.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "context.packageManager.getApplicationInfo(\n              context.packageName, PackageManager.GET_META_DATA)");
            String string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version");
            if (string == null) {
                return false;
            }
            return Integer.parseInt((String) StringsKt.split$default((CharSequence) string, new String[]{"."}, false, 3, 2, (Object) null).get(0)) >= 2;
        } catch (Exception unused) {
            return false;
        } catch (Throwable th2) {
            Y7.a.b(th2, this);
            return false;
        }
    }
}
