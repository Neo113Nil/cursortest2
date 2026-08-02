package defpackage;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bqn implements mr9 {
    public String a;
    public String b;
    public boolean c = false;
    public transient String d = "en";

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.d;
        int length = String.valueOf(4).length();
        int length2 = String.valueOf(str).length();
        int length3 = String.valueOf(str2).length();
        int length4 = String.valueOf(str3).length();
        StringBuilder sb = new StringBuilder(length + 53 + length2 + 16 + length3 + 11 + length4 + 19 + String.valueOf(false).length() + 19 + String.valueOf(true).length() + 17);
        bf3.v(sb, "ImaSdkSettings [ppid=null, numRedirects=4, playerType=", str, ", playerVersion=", str2);
        return wt3.m(", language=", str3, sb, ", restrictToCustom=false, autoPlayAdBreaks=true, sessionId=null]");
    }
}
