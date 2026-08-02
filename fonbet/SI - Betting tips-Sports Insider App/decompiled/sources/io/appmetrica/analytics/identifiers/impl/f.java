package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final e f11812a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f11813b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11814c;

    /* renamed from: d, reason: collision with root package name */
    public final SafePackageManager f11815d;

    public f(e eVar, Function1 function1, String str, SafePackageManager safePackageManager) {
        this.f11812a = eVar;
        this.f11813b = function1;
        this.f11814c = str;
        this.f11815d = safePackageManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context) {
        IBinder iBinder;
        e eVar;
        if (this.f11815d.resolveService(context, this.f11812a.f11809a, 0) == null) {
            throw new l(d9.e.l(new StringBuilder("could not resolve "), this.f11814c, " services"));
        }
        try {
            eVar = this.f11812a;
        } catch (Throwable unused) {
        }
        if (context.bindService(eVar.f11809a, eVar, 1)) {
            e eVar2 = this.f11812a;
            if (eVar2.f11810b == null) {
                synchronized (eVar2.f11811c) {
                    if (eVar2.f11810b == null) {
                        try {
                            eVar2.f11811c.wait(3000L);
                        } catch (InterruptedException unused2) {
                        }
                    }
                }
            }
            iBinder = eVar2.f11810b;
            if (iBinder == null) {
                return this.f11813b.invoke(iBinder);
            }
            throw new g(d9.e.l(new StringBuilder("could not bind to "), this.f11814c, " services"));
        }
        iBinder = null;
        if (iBinder == null) {
        }
    }

    public final void b(Context context) {
        try {
            this.f11812a.a(context);
        } catch (Throwable unused) {
        }
    }

    public f(Intent intent, Function1 function1, String str) {
        this(new e(intent, str), function1, str, new SafePackageManager());
    }
}
