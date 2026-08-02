package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class yrf extends vid {
    public final gef c;
    public final int d;
    public final int e;
    public final int f;

    public yrf(gef gefVar, String str) {
        super(2, str);
        this.c = gefVar;
        int i = n4o.h[2];
        this.d = i;
        int i2 = 1970 % i;
        this.e = i2;
        this.f = 1970 - i2;
    }

    @Override // defpackage.vid
    public final xid a(Object obj, CharSequence charSequence, int i, int i2) {
        charSequence.getClass();
        int i3 = 0;
        while (i < i2) {
            i3 = (i3 * 10) + (charSequence.charAt(i) - '0');
            i++;
        }
        int i4 = this.e;
        int i5 = this.f;
        if (i3 < i4) {
            i5 += this.d;
        }
        Object i6 = this.c.i(obj, Integer.valueOf(i5 + i3));
        if (i6 == null) {
            return null;
        }
        return new wid(i6);
    }

    @Override // defpackage.vid
    public final Integer b() {
        return 2;
    }
}
