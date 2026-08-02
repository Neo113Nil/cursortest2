package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model;

import defpackage.wv8;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class a {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public a(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + wv8.a(this.e, wv8.a(this.d, wv8.a(this.c, wv8.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdTouch(viewPositionX=");
        sb.append(this.a);
        sb.append(", viewPositionY=");
        sb.append(this.b);
        sb.append(", viewSizeHeight=");
        sb.append(this.c);
        sb.append(", viewSizeWidth=");
        sb.append(this.d);
        sb.append(", touchX=");
        sb.append(this.e);
        sb.append(", touchY=");
        return wv8.j(sb, this.f, ')');
    }
}
