package com.inmobi.media;

import defpackage.fc6;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Vf {
    public static final /* synthetic */ int e = 0;
    public boolean a = true;
    public String b = "none";
    public String c = "right";
    public String d;

    public final String toString() {
        boolean z = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        StringBuilder sb = new StringBuilder("OrientationProperties(allowOrientationChange=");
        sb.append(z);
        sb.append(", forceOrientation='");
        sb.append(str);
        sb.append("', direction='");
        return fc6.o(sb, str2, "', creativeSuppliedProperties=", str3, ")");
    }
}
