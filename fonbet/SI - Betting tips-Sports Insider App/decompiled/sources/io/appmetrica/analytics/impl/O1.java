package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class O1 implements Thread.UncaughtExceptionHandler {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f12671e = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    public final Fa f12672a;

    /* renamed from: b, reason: collision with root package name */
    public final C0448r6 f12673b = C0040b4.l().n();

    /* renamed from: c, reason: collision with root package name */
    public final C0374o6 f12674c = new C0374o6();

    /* renamed from: d, reason: collision with root package name */
    public final Dn f12675d = new Dn();

    public O1(C0274k6 c0274k6) {
        this.f12672a = c0274k6;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th2) {
        StackTraceElement[] stackTraceElementArr;
        try {
            f12671e.set(true);
            Fa fa2 = this.f12672a;
            C0590wn apply = this.f12674c.apply(thread);
            Dn dn = this.f12675d;
            Thread a7 = dn.f12169a.a();
            ArrayList a10 = dn.a(a7, thread);
            if (thread != a7) {
                try {
                    stackTraceElementArr = dn.f12169a.b();
                    if (stackTraceElementArr == null) {
                        try {
                            stackTraceElementArr = a7.getStackTrace();
                        } catch (SecurityException unused) {
                        }
                    }
                } catch (SecurityException unused2) {
                    stackTraceElementArr = null;
                }
                a10.add(0, (C0590wn) dn.f12170b.apply(a7, stackTraceElementArr));
            }
            fa2.a(th2, new V(apply, a10, this.f12673b.f14546a.a()));
        } catch (Throwable th3) {
            LoggerStorage.getMainPublicOrAnonymousLogger().error(th3, th3.getMessage(), new Object[0]);
        }
    }
}
