package com.facebook.soloader;

import android.os.StrictMode;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.soloader.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3114f extends E {

    /* renamed from: a, reason: collision with root package name */
    public final File f31592a;

    /* renamed from: b, reason: collision with root package name */
    public int f31593b;

    /* renamed from: c, reason: collision with root package name */
    public final List f31594c;

    public C3114f(File file, int i10) {
        this(file, i10, new String[0]);
    }

    @Override // com.facebook.soloader.E
    public String c() {
        return "DirectorySoSource";
    }

    @Override // com.facebook.soloader.E
    public int d(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        return g(str, i10, this.f31592a, threadPolicy);
    }

    public File f(String str) {
        File file = new File(this.f31592a, str);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public int g(String str, int i10, File file, StrictMode.ThreadPolicy threadPolicy) {
        if (SoLoader.f31568b == null) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
        if (this.f31594c.contains(str)) {
            p.a("SoLoader", str + " is on the denyList, skip loading from " + file.getCanonicalPath());
            return 0;
        }
        File f10 = f(str);
        if (f10 == null) {
            p.f("SoLoader", str + " file not found on " + file.getCanonicalPath());
            return 0;
        }
        String canonicalPath = f10.getCanonicalPath();
        p.a("SoLoader", str + " file found at " + canonicalPath);
        if ((i10 & 1) != 0 && (this.f31593b & 2) != 0) {
            p.a("SoLoader", str + " loaded implicitly");
            return 2;
        }
        if ((this.f31593b & 1) != 0) {
            i iVar = new i(f10);
            try {
                t.h(str, iVar, i10, threadPolicy);
                iVar.close();
            } catch (Throwable th2) {
                try {
                    iVar.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } else {
            p.a("SoLoader", "Not resolving dependencies for " + str);
        }
        try {
            SoLoader.f31568b.a(canonicalPath, i10);
            return 1;
        } catch (UnsatisfiedLinkError e10) {
            throw D.b(str, e10);
        }
    }

    public void h() {
        this.f31593b |= 1;
    }

    @Override // com.facebook.soloader.E
    public String toString() {
        String name;
        try {
            name = String.valueOf(this.f31592a.getCanonicalPath());
        } catch (IOException unused) {
            name = this.f31592a.getName();
        }
        return c() + "[root = " + name + " flags = " + this.f31593b + ']';
    }

    public C3114f(File file, int i10, String[] strArr) {
        this.f31592a = file;
        this.f31593b = i10;
        this.f31594c = Arrays.asList(strArr);
    }
}
