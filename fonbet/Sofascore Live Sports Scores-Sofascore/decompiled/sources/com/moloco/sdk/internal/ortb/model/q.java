package com.moloco.sdk.internal.ortb.model;

import com.moloco.sdk.internal.ortb.model.a;
import defpackage.oea;
import defpackage.r5h;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes4.dex */
public final class q {

    @NotNull
    public static final a.b Companion = new a.b();
    public final boolean a;
    public final String b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return s0.a;
        }
    }

    public q(int i, String str, boolean z) {
        if (3 != (i & 3)) {
            oea.z(i, 3, p.b);
            throw null;
        }
        this.a = z;
        this.b = str;
    }
}
