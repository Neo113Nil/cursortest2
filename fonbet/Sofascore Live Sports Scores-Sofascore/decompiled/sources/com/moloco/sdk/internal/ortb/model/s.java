package com.moloco.sdk.internal.ortb.model;

import com.moloco.sdk.internal.ortb.model.b;
import defpackage.oea;
import defpackage.r5h;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes4.dex */
public final class s {

    @NotNull
    public static final b.C1343b Companion = new b.C1343b();
    public final boolean a;
    public final String b;
    public final String c;
    public final Boolean d;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return w0.a;
        }
    }

    public s(int i, boolean z, String str, String str2, Boolean bool) {
        if (3 != (i & 3)) {
            oea.z(i, 3, r.b);
            throw null;
        }
        this.a = z;
        this.b = str;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = Boolean.FALSE;
        } else {
            this.d = bool;
        }
    }
}
