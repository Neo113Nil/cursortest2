package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class n6g {
    public final /* synthetic */ int a;
    public final boolean b;
    public final String c;

    public n6g(String str, boolean z) {
        this.a = 2;
        this.c = str;
        this.b = z;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                String str = this.b ? "Applink" : "Unclassified";
                String str2 = this.c;
                if (str2 == null) {
                    return str;
                }
                return str + '(' + str2 + ')';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ n6g(int i, String str, boolean z) {
        this.a = i;
        this.b = z;
        this.c = str;
    }
}
