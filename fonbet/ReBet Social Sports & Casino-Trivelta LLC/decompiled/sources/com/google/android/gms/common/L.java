package com.google.android.gms.common;

import android.util.Log;

/* loaded from: classes2.dex */
public class L {

    /* renamed from: e, reason: collision with root package name */
    public static final L f32249e = new L(true, 3, 1, null, null, -1);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f32250a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32251b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f32252c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32253d;

    public L(boolean z10, int i10, int i11, String str, Throwable th2, long j10) {
        this.f32250a = z10;
        this.f32253d = i10;
        this.f32251b = str;
        this.f32252c = th2;
    }

    public static L b() {
        return f32249e;
    }

    public static L c(String str) {
        return new L(false, 1, 5, str, null, -1L);
    }

    public static L d(String str, Throwable th2) {
        return new L(false, 1, 5, str, th2, -1L);
    }

    public static L f(int i10, long j10) {
        return new L(true, i10, 1, null, null, j10);
    }

    public static L g(int i10, int i11, String str, Throwable th2) {
        return new L(false, i10, i11, str, th2, -1L);
    }

    public String a() {
        return this.f32251b;
    }

    public final void e() {
        if (this.f32250a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f32252c != null) {
            a();
        } else {
            a();
        }
    }

    public /* synthetic */ L(boolean z10, int i10, int i11, String str, Throwable th2, long j10, byte[] bArr) {
        this(false, 1, 5, null, null, -1L);
    }
}
