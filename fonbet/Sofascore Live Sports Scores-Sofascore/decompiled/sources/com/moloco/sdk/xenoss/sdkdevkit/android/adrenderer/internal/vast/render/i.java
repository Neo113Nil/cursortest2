package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y;
import defpackage.dmi;
import defpackage.vdf;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class i {
    public final y a;
    public final File b;
    public final Integer c;
    public final String d;
    public final String e;
    public final vdf f;
    public final h g;

    public i(y yVar, File file, Integer num, String str, String str2, vdf vdfVar, h hVar) {
        str.getClass();
        this.a = yVar;
        this.b = file;
        this.c = num;
        this.d = str;
        this.e = str2;
        this.f = vdfVar;
        this.g = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (Intrinsics.c(this.a, iVar.a) && this.b.equals(iVar.b) && Intrinsics.c(this.c, iVar.c) && Intrinsics.c(this.d, iVar.d) && Intrinsics.c(this.e, iVar.e) && this.f == iVar.f && Intrinsics.c(this.g, iVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        y yVar = this.a;
        int hashCode = (this.b.hashCode() + ((yVar == null ? 0 : yVar.hashCode()) * 31)) * 31;
        Integer num = this.c;
        int c = dmi.c((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.d);
        String str = this.e;
        int hashCode2 = (this.f.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        h hVar = this.g;
        return hashCode2 + (hVar != null ? hVar.hashCode() : 0);
    }

    public final String toString() {
        return "Linear(skipOffset=" + this.a + ", localMediaResource=" + this.b + ", localMediaResourceBitrate=" + this.c + ", networkMediaResource=" + this.d + ", clickThroughUrl=" + this.e + ", tracking=" + this.f + ", icon=" + this.g + ')';
    }
}
