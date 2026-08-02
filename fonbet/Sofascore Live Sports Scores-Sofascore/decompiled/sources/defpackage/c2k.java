package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c2k {
    public final /* synthetic */ int a;
    public final String b;
    public final int c;
    public final int d;
    public int e;
    public String f;

    public c2k(int i, int i2, int i3, int i4) {
        this.a = i4;
        switch (i4) {
            case 1:
                this.b = i != Integer.MIN_VALUE ? mz1.i(i, "/") : "";
                this.c = i2;
                this.d = i3;
                this.e = Integer.MIN_VALUE;
                this.f = "";
                break;
            default:
                this.b = i != Integer.MIN_VALUE ? mz1.i(i, "/") : "";
                this.c = i2;
                this.d = i3;
                this.e = Integer.MIN_VALUE;
                this.f = "";
                break;
        }
    }

    public final void a() {
        int i = this.a;
        String str = this.b;
        int i2 = this.d;
        int i3 = this.c;
        switch (i) {
            case 0:
                int i4 = this.e;
                if (i4 != Integer.MIN_VALUE) {
                    i3 = i4 + i2;
                }
                this.e = i3;
                this.f = str + this.e;
                break;
            default:
                int i5 = this.e;
                if (i5 != Integer.MIN_VALUE) {
                    i3 = i5 + i2;
                }
                this.e = i3;
                this.f = str + this.e;
                break;
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                if (this.e == Integer.MIN_VALUE) {
                    a70.r("generateNewId() must be called before retrieving ids.");
                    break;
                }
                break;
            default:
                if (this.e == Integer.MIN_VALUE) {
                    a70.r("generateNewId() must be called before retrieving ids.");
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c2k(int i, int i2, int i3, byte b) {
        this(Integer.MIN_VALUE, i, i2, 0);
        this.a = i3;
        switch (i3) {
            case 1:
                this(Integer.MIN_VALUE, i, i2, 1);
                break;
            default:
                break;
        }
    }
}
