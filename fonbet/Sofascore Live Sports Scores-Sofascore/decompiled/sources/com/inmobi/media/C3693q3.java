package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import defpackage.fsf;
import defpackage.ndk;
import defpackage.wem;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.q3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3693q3 {
    public final InterfaceC3770t3 a;

    public C3693q3(InterfaceC3770t3 interfaceC3770t3) {
        interfaceC3770t3.getClass();
        this.a = interfaceC3770t3;
    }

    public static final void a(Z2 z2, C3693q3 c3693q3) {
        Xe xe = new Xe(z2.b, E3.a(z2), null, null, null, false, 60);
        int pingTimeout = E3.c().getPingTimeout();
        fsf fsfVar = new fsf();
        Lo lo = new Lo(xe, new C3667p3(new AtomicBoolean(false), fsfVar, c3693q3, z2), pingTimeout * 1000, new ndk(z2, 22));
        fsfVar.a = lo;
        lo.b();
    }

    public static final Unit b(Z2 z2) {
        E3 e3 = E3.a;
        String str = z2.b;
        return Unit.a;
    }

    public final void a(Z2 z2) {
        z2.getClass();
        new Handler(Looper.getMainLooper()).post(new wem(13, z2, this));
    }

    public static final void a(AtomicBoolean atomicBoolean, fsf fsfVar, C3693q3 c3693q3, Z2 z2, boolean z) {
        if (atomicBoolean.compareAndSet(false, true)) {
            Lo lo = (Lo) fsfVar.a;
            if (lo != null) {
                lo.a();
            }
            if (z) {
                c3693q3.a.a(z2);
            } else {
                c3693q3.a.a(z2, EnumC3489i6.d);
            }
        }
    }
}
