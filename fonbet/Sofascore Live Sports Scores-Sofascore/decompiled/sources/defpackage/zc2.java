package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zc2 {
    public static final String c;
    public static final Set d;
    public static final zc2 e;
    public static final zc2 f;
    public final String a;
    public final String b;

    static {
        String D = bea.D("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        c = D;
        String D2 = bea.D("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String D3 = bea.D("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new kn5("proto"), new kn5("json"))));
        e = new zc2(D, null);
        f = new zc2(D2, D3);
    }

    public zc2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static zc2 a(byte[] bArr) {
        String str = new String(bArr, Charset.forName(C.UTF8_NAME));
        if (!str.startsWith("1$")) {
            a70.p("Version marker missing from extras");
            return null;
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            a70.p("Extra is not a valid encoded LegacyFlgDestination");
            return null;
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            a70.p("Missing endpoint in CCTDestination extras");
            return null;
        }
        String str3 = split[1];
        return new zc2(str2, str3.isEmpty() ? null : str3);
    }
}
