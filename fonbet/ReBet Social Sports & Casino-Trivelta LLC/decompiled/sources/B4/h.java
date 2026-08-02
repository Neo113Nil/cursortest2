package B4;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* loaded from: classes2.dex */
public class h implements com.bumptech.glide.load.g {

    /* renamed from: b, reason: collision with root package name */
    public final i f724b;

    /* renamed from: c, reason: collision with root package name */
    public final URL f725c;
    private volatile byte[] cacheKeyBytes;

    /* renamed from: d, reason: collision with root package name */
    public final String f726d;

    /* renamed from: e, reason: collision with root package name */
    public String f727e;

    /* renamed from: f, reason: collision with root package name */
    public URL f728f;

    /* renamed from: g, reason: collision with root package name */
    public int f729g;

    public h(URL url) {
        this(url, i.f731b);
    }

    @Override // com.bumptech.glide.load.g
    public void b(MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.f726d;
        return str != null ? str : ((URL) com.bumptech.glide.util.k.d(this.f725c)).toString();
    }

    public final byte[] d() {
        if (this.cacheKeyBytes == null) {
            this.cacheKeyBytes = c().getBytes(com.bumptech.glide.load.g.f29962a);
        }
        return this.cacheKeyBytes;
    }

    public Map e() {
        return this.f724b.a();
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (c().equals(hVar.c()) && this.f724b.equals(hVar.f724b)) {
                return true;
            }
        }
        return false;
    }

    public final String f() {
        if (TextUtils.isEmpty(this.f727e)) {
            String str = this.f726d;
            if (TextUtils.isEmpty(str)) {
                str = ((URL) com.bumptech.glide.util.k.d(this.f725c)).toString();
            }
            this.f727e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f727e;
    }

    public final URL g() {
        if (this.f728f == null) {
            this.f728f = new URL(f());
        }
        return this.f728f;
    }

    public String h() {
        return f();
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        if (this.f729g == 0) {
            int hashCode = c().hashCode();
            this.f729g = hashCode;
            this.f729g = (hashCode * 31) + this.f724b.hashCode();
        }
        return this.f729g;
    }

    public URL i() {
        return g();
    }

    public String toString() {
        return c();
    }

    public h(String str) {
        this(str, i.f731b);
    }

    public h(URL url, i iVar) {
        this.f725c = (URL) com.bumptech.glide.util.k.d(url);
        this.f726d = null;
        this.f724b = (i) com.bumptech.glide.util.k.d(iVar);
    }

    public h(String str, i iVar) {
        this.f725c = null;
        this.f726d = com.bumptech.glide.util.k.b(str);
        this.f724b = (i) com.bumptech.glide.util.k.d(iVar);
    }
}
