package defpackage;

import java.util.Arrays;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class eqj {
    public static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String a;
    public final String b;
    public final String c;

    public eqj(String str, String str2) {
        String substring = (str2 == null || !str2.startsWith("/topics/")) ? str2 : str2.substring(8);
        if (substring == null || !d.matcher(substring).matches()) {
            a70.p(lnb.o("Invalid topic name: ", substring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
            throw null;
        }
        this.a = substring;
        this.b = str;
        this.c = wv8.i(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eqj)) {
            return false;
        }
        eqj eqjVar = (eqj) obj;
        return this.a.equals(eqjVar.a) && this.b.equals(eqjVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }
}
