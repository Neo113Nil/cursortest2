package com.moloco.sdk.internal.ortb.model;

import com.moloco.sdk.internal.ortb.model.c;
import defpackage.oea;
import defpackage.r5h;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes4.dex */
public final class u {

    @NotNull
    public static final c.b Companion = new c.b();
    public final boolean a;
    public final boolean b;
    public final String c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return a1.a;
        }
    }

    public u(int i, String str, boolean z, boolean z2) {
        if (1 != (i & 1)) {
            oea.z(i, 1, t.b);
            throw null;
        }
        this.a = z;
        if ((i & 2) == 0) {
            this.b = true;
        } else {
            this.b = z2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }

    public u() {
        this.a = false;
        this.b = true;
        this.c = null;
    }
}
