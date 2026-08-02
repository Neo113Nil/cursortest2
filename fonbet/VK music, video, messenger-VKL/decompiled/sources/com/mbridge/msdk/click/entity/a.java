package com.mbridge.msdk.click.entity;

import androidx.annotation.NonNull;
import xsna.i5s;

/* compiled from: ClickResponseHeader.java */
/* loaded from: classes13.dex */
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
        return i5s.a(sb, this.h, "'}");
    }
}
