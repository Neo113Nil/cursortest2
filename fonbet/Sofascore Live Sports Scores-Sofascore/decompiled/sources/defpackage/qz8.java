package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class qz8 implements pia {
    public final s89 b;
    public final URL c;
    public final String d;
    public String e;
    public URL f;
    public volatile byte[] g;
    public int h;

    public qz8(String str, s89 s89Var) {
        this.c = null;
        if (TextUtils.isEmpty(str)) {
            a70.p("Must not be null or empty");
            throw null;
        }
        this.d = str;
        w1a.m(s89Var, "Argument must not be null");
        this.b = s89Var;
    }

    @Override // defpackage.pia
    public final void b(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = c().getBytes(pia.a);
        }
        messageDigest.update(this.g);
    }

    public final String c() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.c;
        w1a.m(url, "Argument must not be null");
        return url.toString();
    }

    public final String d() {
        if (TextUtils.isEmpty(this.e)) {
            String str = this.d;
            if (TextUtils.isEmpty(str)) {
                URL url = this.c;
                w1a.m(url, "Argument must not be null");
                str = url.toString();
            }
            this.e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$[]");
        }
        return this.e;
    }

    @Override // defpackage.pia
    public final boolean equals(Object obj) {
        if (obj instanceof qz8) {
            qz8 qz8Var = (qz8) obj;
            if (c().equals(qz8Var.c()) && this.b.equals(qz8Var.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.pia
    public final int hashCode() {
        int i = this.h;
        if (i != 0) {
            return i;
        }
        int hashCode = c().hashCode();
        this.h = hashCode;
        int hashCode2 = this.b.hashCode() + (hashCode * 31);
        this.h = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        return c();
    }

    public qz8(URL url) {
        wpa wpaVar = s89.a;
        w1a.m(url, "Argument must not be null");
        this.c = url;
        this.d = null;
        w1a.m(wpaVar, "Argument must not be null");
        this.b = wpaVar;
    }
}
