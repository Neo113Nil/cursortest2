package com.inmobi.media;

import android.view.OrientationEventListener;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.ironsource.U3;
import defpackage.duf;
import defpackage.t0d;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class X8 extends OrientationEventListener {
    public static final /* synthetic */ KProperty[] d = {duf.a.mutableProperty1(new t0d(X8.class, "currentOrientation", "getCurrentOrientation()Lcom/inmobi/ads/rendering/orientation/Orientation;", 0))};
    public final InMobiAdActivity a;
    public final HashSet b;
    public final W8 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X8(InMobiAdActivity inMobiAdActivity) {
        super(inMobiAdActivity);
        inMobiAdActivity.getClass();
        this.a = inMobiAdActivity;
        this.b = new HashSet();
        this.c = new W8(Uf.a(R5.g()), this);
    }

    public final void a(Vf vf) {
        vf.getClass();
        try {
            if (vf.a) {
                this.a.setRequestedOrientation(13);
                return;
            }
            String str = vf.b;
            if (Intrinsics.c(str, U3.i.C)) {
                this.a.setRequestedOrientation(6);
                return;
            }
            boolean c = Intrinsics.c(str, U3.i.D);
            InMobiAdActivity inMobiAdActivity = this.a;
            if (c) {
                inMobiAdActivity.setRequestedOrientation(7);
            } else {
                inMobiAdActivity.setRequestedOrientation(13);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public final void b() {
        int i = this.a.getResources().getConfiguration().orientation;
        byte g = R5.g();
        int i2 = 1;
        if (g != 1 && g != 2 && (g == 3 || g == 4)) {
            i2 = 2;
        }
        if (i == i2) {
            this.c.setValue(this, d[0], Uf.a(R5.g()));
        }
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        b();
    }

    public final void a() {
        if (this.b.isEmpty()) {
            disable();
        } else {
            enable();
        }
    }
}
