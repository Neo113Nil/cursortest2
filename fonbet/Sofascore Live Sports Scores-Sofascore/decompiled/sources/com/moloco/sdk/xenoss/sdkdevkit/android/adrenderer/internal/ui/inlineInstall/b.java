package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import defpackage.dmi;
import defpackage.lnb;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class b {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;
    public final boolean e;

    public b(boolean z, boolean z2, String str, String str2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b && Intrinsics.c(this.c, bVar.c) && Intrinsics.c(this.d, bVar.d) && this.e == bVar.e;
    }

    public final int hashCode() {
        int e = dmi.e(Boolean.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return Boolean.hashCode(this.e) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidAutoInlineControllerData(enabled=");
        sb.append(this.a);
        sb.append(", onSkip=");
        sb.append(this.b);
        sb.append(", eventLink=");
        sb.append(this.c);
        sb.append(", clickthroughUrl=");
        sb.append(this.d);
        sb.append(", forceFullscreen=");
        return lnb.r(sb, this.e, ')');
    }
}
