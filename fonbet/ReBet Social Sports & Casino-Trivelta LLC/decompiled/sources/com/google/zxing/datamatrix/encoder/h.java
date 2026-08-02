package com.google.zxing.datamatrix.encoder;

import java.nio.charset.StandardCharsets;
import kotlin.UByte;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f38396a;

    /* renamed from: b, reason: collision with root package name */
    public l f38397b;

    /* renamed from: c, reason: collision with root package name */
    public final StringBuilder f38398c;

    /* renamed from: d, reason: collision with root package name */
    public int f38399d;

    /* renamed from: e, reason: collision with root package name */
    public int f38400e;

    /* renamed from: f, reason: collision with root package name */
    public k f38401f;

    /* renamed from: g, reason: collision with root package name */
    public int f38402g;

    public h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb2 = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i10 = 0; i10 < length; i10++) {
            char c10 = (char) (bytes[i10] & UByte.MAX_VALUE);
            if (c10 == '?' && str.charAt(i10) != '?') {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
            sb2.append(c10);
        }
        this.f38396a = sb2.toString();
        this.f38397b = l.FORCE_NONE;
        this.f38398c = new StringBuilder(str.length());
        this.f38400e = -1;
    }

    public int a() {
        return this.f38398c.length();
    }

    public StringBuilder b() {
        return this.f38398c;
    }

    public char c() {
        return this.f38396a.charAt(this.f38399d);
    }

    public String d() {
        return this.f38396a;
    }

    public int e() {
        return this.f38400e;
    }

    public int f() {
        return h() - this.f38399d;
    }

    public k g() {
        return this.f38401f;
    }

    public final int h() {
        return this.f38396a.length() - this.f38402g;
    }

    public boolean i() {
        return this.f38399d < h();
    }

    public void j() {
        this.f38400e = -1;
    }

    public void k() {
        this.f38401f = null;
    }

    public void l(com.google.zxing.b bVar, com.google.zxing.b bVar2) {
    }

    public void m(int i10) {
        this.f38402g = i10;
    }

    public void n(l lVar) {
        this.f38397b = lVar;
    }

    public void o(int i10) {
        this.f38400e = i10;
    }

    public void p() {
        q(a());
    }

    public void q(int i10) {
        k kVar = this.f38401f;
        if (kVar == null || i10 > kVar.a()) {
            this.f38401f = k.l(i10, this.f38397b, null, null, true);
        }
    }

    public void r(char c10) {
        this.f38398c.append(c10);
    }

    public void s(String str) {
        this.f38398c.append(str);
    }
}
