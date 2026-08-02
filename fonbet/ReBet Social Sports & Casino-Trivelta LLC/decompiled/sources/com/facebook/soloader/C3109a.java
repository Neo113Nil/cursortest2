package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode;
import java.io.File;

/* renamed from: com.facebook.soloader.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3109a extends E implements w {

    /* renamed from: a, reason: collision with root package name */
    public final int f31581a;

    /* renamed from: b, reason: collision with root package name */
    public C3114f f31582b;

    public C3109a(Context context, int i10) {
        this.f31581a = i10;
        this.f31582b = new C3114f(f(context), i10);
    }

    public static File f(Context context) {
        return new File(context.getApplicationInfo().nativeLibraryDir);
    }

    @Override // com.facebook.soloader.w
    public E b(Context context) {
        this.f31582b = new C3114f(f(context), this.f31581a | 1);
        return this;
    }

    @Override // com.facebook.soloader.E
    public String c() {
        return "ApplicationSoSource";
    }

    @Override // com.facebook.soloader.E
    public int d(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return this.f31582b.d(str, i10, threadPolicy);
    }

    @Override // com.facebook.soloader.E
    public void e(int i10) {
        this.f31582b.e(i10);
    }

    @Override // com.facebook.soloader.E
    public String toString() {
        return c() + "[" + this.f31582b.toString() + "]";
    }
}
