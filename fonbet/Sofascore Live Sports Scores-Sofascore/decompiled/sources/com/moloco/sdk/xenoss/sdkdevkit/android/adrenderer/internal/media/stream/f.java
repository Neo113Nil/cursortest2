package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class f extends h {
    public final File a;
    public final g b;

    public f(File file, g gVar) {
        file.getClass();
        gVar.getClass();
        this.a = file;
        this.b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.c(this.a, fVar.a) && Intrinsics.c(this.b, fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InProgress(file=" + this.a + ", progress=" + this.b + ')';
    }
}
