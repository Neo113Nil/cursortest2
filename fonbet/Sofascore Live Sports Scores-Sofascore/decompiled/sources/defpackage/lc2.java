package defpackage;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class lc2 implements e1g {
    public final /* synthetic */ int a = 2;
    public final Object b;

    public lc2(byte[] bArr) {
        w1a.m(bArr, "Argument must not be null");
        this.b = bArr;
    }

    @Override // defpackage.e1g
    public final int a() {
        switch (this.a) {
            case 0:
                return ((byte[]) this.b).length;
            case 1:
                return 1;
            default:
                return kik.r((Bitmap) this.b);
        }
    }

    @Override // defpackage.e1g
    public final void c() {
        int i = this.a;
    }

    @Override // defpackage.e1g
    public final Class d() {
        switch (this.a) {
            case 0:
                return byte[].class;
            case 1:
                return this.b.getClass();
            default:
                return Bitmap.class;
        }
    }

    @Override // defpackage.e1g
    public final Object get() {
        switch (this.a) {
            case 0:
                return (byte[]) this.b;
            case 1:
                return this.b;
            default:
                return (Bitmap) this.b;
        }
    }

    public lc2(Object obj) {
        w1a.m(obj, "Argument must not be null");
        this.b = obj;
    }

    public lc2(Bitmap bitmap) {
        this.b = bitmap;
    }

    private final void b() {
    }

    private final void e() {
    }

    private final void f() {
    }
}
