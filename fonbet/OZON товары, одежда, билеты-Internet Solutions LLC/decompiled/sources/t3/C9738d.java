package t3;

import android.text.TextUtils;
import j3.C7272n;

/* renamed from: t3.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9738d {

    /* renamed from: a, reason: collision with root package name */
    public final String f99023a;

    /* renamed from: b, reason: collision with root package name */
    public final C7272n f99024b;

    /* renamed from: c, reason: collision with root package name */
    public final C7272n f99025c;

    /* renamed from: d, reason: collision with root package name */
    public final int f99026d;

    /* renamed from: e, reason: collision with root package name */
    public final int f99027e;

    public C9738d(String str, C7272n c7272n, C7272n c7272n2, int i11, int i12) {
        G10.a.c(i11 == 0 || i12 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f99023a = str;
        c7272n.getClass();
        this.f99024b = c7272n;
        c7272n2.getClass();
        this.f99025c = c7272n2;
        this.f99026d = i11;
        this.f99027e = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9738d.class == obj.getClass()) {
            C9738d c9738d = (C9738d) obj;
            if (this.f99026d == c9738d.f99026d && this.f99027e == c9738d.f99027e && this.f99023a.equals(c9738d.f99023a) && this.f99024b.equals(c9738d.f99024b) && this.f99025c.equals(c9738d.f99025c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f99025c.hashCode() + ((this.f99024b.hashCode() + G.g.a((((527 + this.f99026d) * 31) + this.f99027e) * 31, 31, this.f99023a)) * 31);
    }
}
