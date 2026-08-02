package com.facebook.soloader;

import android.os.StrictMode;
import com.facebook.hermes.intl.Constants;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.facebook.soloader.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3113e extends E {

    /* renamed from: a, reason: collision with root package name */
    public final String f31589a;

    /* renamed from: b, reason: collision with root package name */
    public q f31590b = null;

    /* renamed from: c, reason: collision with root package name */
    public Set f31591c = null;

    public C3113e(String str) {
        this.f31589a = str;
    }

    public static String g(String str) {
        if (Constants.SENSITIVITY_BASE.equals(str)) {
            return SoLoader.f31570d.getApplicationInfo().sourceDir;
        }
        String[] strArr = SoLoader.f31570d.getApplicationInfo().splitSourceDirs;
        if (strArr == null) {
            throw new IllegalStateException("No splits avaiable");
        }
        String str2 = "split_" + str + ".apk";
        for (String str3 : strArr) {
            if (str3.endsWith(str2)) {
                return str3;
            }
        }
        throw new IllegalStateException("Could not find " + str + " split");
    }

    @Override // com.facebook.soloader.E
    public String c() {
        return "DirectSplitSoSource";
    }

    @Override // com.facebook.soloader.E
    public int d(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        Set set = this.f31591c;
        if (set == null) {
            throw new IllegalStateException("prepare not called");
        }
        if (set.contains(str)) {
            return h(str, i10);
        }
        return 0;
    }

    @Override // com.facebook.soloader.E
    public void e(int i10) {
        InputStream open = SoLoader.f31570d.getAssets().open(this.f31589a + ".soloader-manifest");
        try {
            this.f31590b = q.b(open);
            if (open != null) {
                open.close();
            }
            this.f31591c = new HashSet(this.f31590b.f31617b);
        } catch (Throwable th2) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public String f(String str) {
        Set set = this.f31591c;
        if (set == null || this.f31590b == null) {
            throw new IllegalStateException("prepare not called");
        }
        if (!set.contains(str)) {
            return null;
        }
        return g(this.f31589a) + "!/lib/" + this.f31590b.f31616a + "/" + str;
    }

    public int h(String str, int i10) {
        String f10 = f(str);
        f10.getClass();
        System.load(f10);
        return 1;
    }
}
