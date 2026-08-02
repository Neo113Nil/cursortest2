package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class pt0 {
    public String a;
    public int b;
    public int c;
    public boolean d;
    public byte e;

    public final qt0 a() {
        String str;
        if (this.e == 7 && (str = this.a) != null) {
            return new qt0(this.b, this.c, str, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" processName");
        }
        if ((this.e & 1) == 0) {
            sb.append(" pid");
        }
        if ((this.e & 2) == 0) {
            sb.append(" importance");
        }
        if ((this.e & 4) == 0) {
            sb.append(" defaultProcess");
        }
        a70.r(bf3.m("Missing required properties:", sb));
        return null;
    }
}
