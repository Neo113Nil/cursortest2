package com.mbridge.msdk.click.entity;

import androidx.annotation.NonNull;
import defpackage.mz1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a {
    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public int f;
    public String g;
    public String h;

    public String a() {
        return "statusCode=" + this.f + ", location=" + this.a + ", contentType=" + this.b + ", contentLength=" + this.e + ", contentEncoding=" + this.c + ", referer=" + this.d;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ClickResponseHeader{location='");
        sb.append(this.a);
        sb.append("', contentType='");
        sb.append(this.b);
        sb.append("', contentEncoding='");
        sb.append(this.c);
        sb.append("', referer='");
        sb.append(this.d);
        sb.append("', contentLength=");
        sb.append(this.e);
        sb.append(", statusCode=");
        sb.append(this.f);
        sb.append(", url='");
        sb.append(this.g);
        sb.append("', exception='");
        return mz1.o(sb, this.h, "'}");
    }
}
