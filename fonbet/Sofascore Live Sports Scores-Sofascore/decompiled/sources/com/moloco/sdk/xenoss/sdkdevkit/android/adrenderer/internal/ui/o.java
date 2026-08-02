package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import androidx.core.app.NotificationCompat;
import com.ironsource.L6;
import defpackage.av8;
import defpackage.bpf;
import defpackage.bsk;
import defpackage.eqf;
import defpackage.f7a;
import defpackage.hz8;
import defpackage.it9;
import defpackage.jaa;
import defpackage.ku9;
import defpackage.mh9;
import defpackage.nf3;
import defpackage.ns9;
import defpackage.nz;
import defpackage.of3;
import defpackage.op3;
import defpackage.xtc;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class o {
    public static final AtomicBoolean a = new AtomicBoolean(false);

    public static final void a(ImageView imageView, String str) {
        if (str != null) {
            Context context = imageView.getContext();
            context.getClass();
            bpf t = f7a.t(context);
            Context context2 = imageView.getContext();
            context2.getClass();
            it9 it9Var = new it9(context2);
            it9Var.c = str;
            t.a(it9Var.a());
        }
        WeakHashMap weakHashMap = bsk.a;
        if (!imageView.isAttachedToWindow()) {
            imageView.addOnAttachStateChangeListener(new com.moloco.sdk.internal.c(imageView, imageView, str));
            return;
        }
        boolean isHardwareAccelerated = imageView.isHardwareAccelerated();
        if (!isHardwareAccelerated) {
            c();
        }
        bpf t2 = f7a.t(imageView.getContext());
        it9 it9Var2 = new it9(imageView.getContext());
        it9Var2.c = str;
        it9Var2.d = new ku9(imageView);
        it9Var2.b();
        it9Var2.j = Boolean.valueOf(isHardwareAccelerated);
        t2.a(it9Var2.a());
    }

    public static final void b(String str, op3 op3Var, xtc xtcVar, of3 of3Var, int i) {
        int i2;
        xtcVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(481470006);
        if ((i & 6) == 0) {
            i2 = (av8Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= av8Var.g(op3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 147) == 146 && av8Var.D()) {
            av8Var.W();
        } else {
            boolean isHardwareAccelerated = ((View) av8Var.k(nz.f)).isHardwareAccelerated();
            av8Var.e0(313993790);
            boolean h = av8Var.h(isHardwareAccelerated);
            Object O = av8Var.O();
            if (h || O == nf3.a) {
                O = new mh9(isHardwareAccelerated, 4);
                av8Var.n0(O);
            }
            av8Var.s(false);
            hz8.t((Function0) O, av8Var);
            it9 it9Var = new it9((Context) av8Var.k(nz.b));
            it9Var.c = str;
            it9Var.j = Boolean.valueOf(isHardwareAccelerated);
            jaa.a(it9Var.a(), xtcVar, op3Var, av8Var, ((i2 << 15) & 3670016) | (i2 & 896) | 48);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ns9(str, op3Var, xtcVar, i, 1);
        }
    }

    public static final void c() {
        if (a.compareAndSet(false, true)) {
            com.moloco.sdk.internal.services.c0 a2 = com.moloco.sdk.service_locator.e.b().a();
            com.moloco.sdk.acm.recorder.b.Companion.getClass();
            com.moloco.sdk.acm.recorder.c b = com.moloco.sdk.acm.recorder.a.b();
            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.b;
            com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d("software_rendering_detected");
            dVar.a("manufacturer", a2.a);
            dVar.a(L6.B, a2.b);
            dVar.a("os_version", Build.VERSION.RELEASE);
            dVar.a("api_level", String.valueOf(a2.e));
            b.a(dVar);
        }
    }
}
