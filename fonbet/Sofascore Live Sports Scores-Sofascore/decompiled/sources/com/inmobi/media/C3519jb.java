package com.inmobi.media;

import java.util.LinkedHashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.jb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3519jb {
    public final C3571lb a;
    public final C3334c6 b;
    public final LinkedHashSet c;
    public String d;
    public boolean e;

    public C3519jb(C3571lb c3571lb, C3334c6 c3334c6) {
        c3334c6.getClass();
        this.a = c3571lb;
        this.b = c3334c6;
        this.c = new LinkedHashSet();
    }

    public final void a(int i, boolean z, String str, Integer num) {
        try {
            if (this.e) {
                return;
            }
            C3571lb c3571lb = this.a;
            if (c3571lb != null) {
                c3571lb.f = "IN_CUSTOM";
            }
            switch (i) {
                case 1:
                    if (z) {
                        this.d = str;
                        C3334c6 c3334c6 = this.b;
                        Za za = Za.LPPageStart;
                        c3334c6.getClass();
                        za.getClass();
                        AbstractC3339cb.a(za, c3571lb, (Integer) null, c3334c6.i);
                        break;
                    }
                    break;
                case 2:
                    if (z) {
                        this.d = str;
                        this.e = true;
                        if (!this.c.contains(1)) {
                            C3334c6 c3334c62 = this.b;
                            Za za2 = Za.LPPageStart;
                            C3571lb c3571lb2 = this.a;
                            c3334c62.getClass();
                            za2.getClass();
                            AbstractC3339cb.a(za2, c3571lb2, (Integer) 8006, c3334c62.i);
                        }
                        this.b.g.invoke();
                        C3334c6 c3334c63 = this.b;
                        Za za3 = Za.LPCompleteSuccess;
                        C3571lb c3571lb3 = this.a;
                        c3334c63.getClass();
                        za3.getClass();
                        AbstractC3339cb.a(za3, c3571lb3, (Integer) null, c3334c63.i);
                        break;
                    }
                    break;
                case 3:
                    if (z || (str != null && str.equals(this.d))) {
                        this.e = true;
                        if (!this.c.contains(1)) {
                            C3334c6 c3334c64 = this.b;
                            Za za4 = Za.LPPageStart;
                            C3571lb c3571lb4 = this.a;
                            c3334c64.getClass();
                            za4.getClass();
                            AbstractC3339cb.a(za4, c3571lb4, (Integer) 8006, c3334c64.i);
                        }
                        C3334c6 c3334c65 = this.b;
                        Za za5 = Za.LPCompleteFailed;
                        C3571lb c3571lb5 = this.a;
                        Integer valueOf = Integer.valueOf(num != null ? num.intValue() : 8100);
                        c3334c65.getClass();
                        za5.getClass();
                        AbstractC3339cb.a(za5, c3571lb5, valueOf, c3334c65.i);
                        break;
                    }
                case 4:
                    if (z) {
                        this.d = str;
                        break;
                    }
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    this.e = true;
                    switch (i) {
                        case 5:
                            r5 = 8200;
                            break;
                        case 6:
                            r5 = 8300;
                            break;
                        case 7:
                            r5 = 8400;
                            break;
                        case 8:
                            r5 = 8600;
                            break;
                        case 9:
                            r5 = 8500;
                            break;
                    }
                    int i2 = 4;
                    if (!this.c.contains(4)) {
                        i2 = 0;
                    }
                    int i3 = r5 + i2;
                    C3334c6 c3334c66 = this.b;
                    Za za6 = Za.LPCompleteFailed;
                    C3571lb c3571lb6 = this.a;
                    Integer valueOf2 = Integer.valueOf(i3);
                    c3334c66.getClass();
                    za6.getClass();
                    AbstractC3339cb.a(za6, c3571lb6, valueOf2, c3334c66.i);
                    break;
            }
            this.c.add(Integer.valueOf(i));
        } catch (Exception e) {
            e.toString();
        }
    }
}
