package com.moloco.sdk.internal.ortb.model;

import com.moloco.sdk.internal.ortb.model.l;
import defpackage.r5h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes4.dex */
public final class j0 {

    @NotNull
    public static final l.b Companion = new l.b();
    public final Float a;

    public /* synthetic */ j0(int i, Float f) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && Intrinsics.c(this.a, ((j0) obj).a);
    }

    public final int hashCode() {
        Float f = this.a;
        if (f == null) {
            return 0;
        }
        return f.hashCode();
    }

    public final String toString() {
        return "CreativeRenderingCheckConfig(opacityRate=" + this.a + ')';
    }
}
