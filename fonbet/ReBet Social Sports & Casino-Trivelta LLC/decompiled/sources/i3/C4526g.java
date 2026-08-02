package i3;

import k3.C5151c;

/* renamed from: i3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4526g {

    /* renamed from: a, reason: collision with root package name */
    public String f48085a;

    /* renamed from: b, reason: collision with root package name */
    public String f48086b;

    public String a() {
        return this.f48085a;
    }

    public String b() {
        return this.f48086b;
    }

    public boolean c() {
        return (this.f48086b == null || this.f48085a == null) ? false : true;
    }

    public void d(C5151c c5151c) {
        if (c5151c.d()) {
            this.f48086b = c5151c.reference;
            this.f48085a = c5151c.trans;
        }
    }
}
