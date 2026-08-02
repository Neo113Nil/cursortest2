package com.inmobi.media;

import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.media.core.config.models.AdConfig;
import defpackage.ok3;
import defpackage.xw3;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class B0 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final HashMap c = new HashMap();
    public final A0 d = new A0(this);

    public B0() {
        AbstractC3424fj.g.submit(new defpackage.y2(this, 19));
    }

    public static void a(AdQualityResult adQualityResult) {
        adQualityResult.getClass();
        try {
            ok3.J(new C3897y0(adQualityResult, null));
            if (adQualityResult.getImageLocation().length() == 0) {
                return;
            }
            new File(adQualityResult.getImageLocation()).delete();
        } catch (Exception unused) {
        }
    }

    public static final Unit b(B0 b0) {
        b0.a.set(true);
        xw3.L(L9.c, null, null, new C3923z0(b0, (AdConfig) AbstractC3435g4.a.a(AdConfig.class), null), 3);
        return Unit.a;
    }

    public final void a() {
        AbstractC3353d.a(new defpackage.z0(this, 17));
    }

    public static final void a(B0 b0) {
        I0 i0 = (I0) F0.a.getValue();
        A0 a0 = b0.d;
        i0.getClass();
        a0.getClass();
        i0.b = new WeakReference(a0);
    }
}
