package com.inmobi.media;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import defpackage.ad2;
import defpackage.ku3;
import defpackage.s9a;
import defpackage.te6;
import defpackage.ufl;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3327c extends B5 {
    public final long b;
    public final Function0 c;
    public final AtomicBoolean d;
    public final AtomicBoolean e;
    public final Handler f;
    public ku3 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3327c(long j, C5 c5) {
        super(c5);
        c5.getClass();
        this.b = j;
        this.c = new ufl(8, this, c5);
        this.d = new AtomicBoolean(false);
        this.e = new AtomicBoolean(false);
        this.f = new Handler(Looper.getMainLooper());
    }

    public static final Unit a(C3327c c3327c, A5 a5) {
        if (c3327c.d.get()) {
            if (c3327c.f.hasMessages(2023)) {
                c3327c.f.removeMessages(2023);
                if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger() && c3327c.e.get()) {
                    StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                    stackTrace.getClass();
                    ((C5) a5).a(new C3869wo(stackTrace));
                }
            }
            c3327c.e.getAndSet(true);
            c3327c.f.sendEmptyMessage(2023);
        }
        return Unit.a;
    }

    @Override // com.inmobi.media.B5
    public final void b() {
        if (this.d.getAndSet(false)) {
            this.d.set(false);
            this.e.set(false);
            N3.a(this.g);
        }
    }

    @Override // com.inmobi.media.B5
    public final void a() {
        if (this.d.getAndSet(true)) {
            return;
        }
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new M9("ANRWatchDog", false));
        newSingleThreadExecutor.getClass();
        ad2 c = s9a.c(new te6(newSingleThreadExecutor));
        this.g = c;
        N3.a(c, 0L, this.b, new C3301b(this.c));
    }
}
