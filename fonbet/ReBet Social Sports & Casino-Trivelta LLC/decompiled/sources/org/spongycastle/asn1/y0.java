package org.spongycastle.asn1;

/* loaded from: classes5.dex */
public class y0 {

    /* renamed from: a, reason: collision with root package name */
    public String f62285a;

    /* renamed from: b, reason: collision with root package name */
    public int f62286b = 0;

    public y0(String str) {
        this.f62285a = str;
    }

    public boolean a() {
        return this.f62286b != -1;
    }

    public String b() {
        int i10 = this.f62286b;
        if (i10 == -1) {
            return null;
        }
        int indexOf = this.f62285a.indexOf(46, i10);
        if (indexOf == -1) {
            String substring = this.f62285a.substring(this.f62286b);
            this.f62286b = -1;
            return substring;
        }
        String substring2 = this.f62285a.substring(this.f62286b, indexOf);
        this.f62286b = indexOf + 1;
        return substring2;
    }
}
