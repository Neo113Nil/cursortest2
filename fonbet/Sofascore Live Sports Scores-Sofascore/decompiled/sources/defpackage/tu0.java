package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class tu0 {
    public String a;
    public int b;
    public String c;
    public String d;
    public long e;
    public long f;
    public String g;
    public byte h;

    public final uu0 a() {
        if (this.h == 3 && this.b != 0) {
            return new uu0(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == 0) {
            sb.append(" registrationStatus");
        }
        if ((this.h & 1) == 0) {
            sb.append(" expiresInSecs");
        }
        if ((this.h & 2) == 0) {
            sb.append(" tokenCreationEpochInSecs");
        }
        a70.r(bf3.m("Missing required properties:", sb));
        return null;
    }
}
