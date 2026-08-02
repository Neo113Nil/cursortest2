package c5;

import e5.k;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements k {

    /* renamed from: c, reason: collision with root package name */
    public static final String f3635c;

    /* renamed from: d, reason: collision with root package name */
    public static final Set f3636d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f3637e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f3638f;

    /* renamed from: a, reason: collision with root package name */
    public final String f3639a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3640b;

    static {
        String v5 = h8.b.v("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f3635c = v5;
        String v10 = h8.b.v("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String v11 = h8.b.v("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f3636d = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(new b5.c("proto"), new b5.c("json"))));
        f3637e = new a(v5, null);
        f3638f = new a(v10, v11);
    }

    public a(String str, String str2) {
        this.f3639a = str;
        this.f3640b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }
}
