package defpackage;

import com.google.android.gms.internal.ads.zzbgg;
import com.ironsource.U3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class uif {
    public static final uif d;
    public final /* synthetic */ int a;
    public int b;
    public int c;

    static {
        int i = 0;
        d = new uif(i, i, 0);
    }

    public uif(int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 17:
                this.b = 2;
                this.c = i;
                break;
            default:
                this.b = i;
                break;
        }
    }

    public x05 a() {
        z1a.s(this.c >= 0);
        return new x05(this);
    }

    public int b() {
        switch (this.a) {
            case 6:
                int i = this.c;
                if (i != 2) {
                    if (i != 5) {
                        if (i != 29) {
                            if (i != 42) {
                                if (i != 22) {
                                    if (i != 23) {
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            default:
                int i2 = this.c;
                if (i2 != 2) {
                    if (i2 != 5) {
                        if (i2 != 29) {
                            if (i2 != 42) {
                                if (i2 != 22) {
                                    if (i2 != 23) {
                                    }
                                }
                            }
                        }
                    }
                }
                break;
        }
        return 10;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder(uif.class.getSimpleName());
                sb.append("[position = ");
                sb.append(this.b);
                sb.append(", length = ");
                return fc6.h(this.c, U3.j.e, sb);
            case 8:
                StringBuilder sb2 = new StringBuilder("MutableRange(start=");
                sb2.append(this.b);
                sb2.append(", end=");
                return wv8.j(sb2, this.c, ')');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ uif(int i, int i2, int i3) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }

    public uif(zzbgg zzbggVar, int i, int i2) {
        this.a = 16;
        this.b = i;
        this.c = i2;
    }

    public /* synthetic */ uif(byte b, int i) {
        this.a = i;
    }
}
