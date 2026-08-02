package e9;

import d9.C4040c;
import g9.g;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: e9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4186a implements g {

    /* renamed from: c, reason: collision with root package name */
    public static final String f45820c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f45821d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f45822e;

    /* renamed from: f, reason: collision with root package name */
    public static final Set f45823f;

    /* renamed from: g, reason: collision with root package name */
    public static final C4186a f45824g;

    /* renamed from: h, reason: collision with root package name */
    public static final C4186a f45825h;

    /* renamed from: a, reason: collision with root package name */
    public final String f45826a;

    /* renamed from: b, reason: collision with root package name */
    public final String f45827b;

    static {
        String a10 = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f45820c = a10;
        String a11 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f45821d = a11;
        String a12 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f45822e = a12;
        f45823f = Collections.unmodifiableSet(new HashSet(Arrays.asList(C4040c.b("proto"), C4040c.b("json"))));
        f45824g = new C4186a(a10, null);
        f45825h = new C4186a(a11, a12);
    }

    public C4186a(String str, String str2) {
        this.f45826a = str;
        this.f45827b = str2;
    }

    public static C4186a c(byte[] bArr) {
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
        return new C4186a(str2, str3);
    }

    @Override // g9.g
    public Set a() {
        return f45823f;
    }

    public byte[] b() {
        String str = this.f45827b;
        if (str == null && this.f45826a == null) {
            return null;
        }
        String str2 = this.f45826a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.f45827b;
    }

    public String e() {
        return this.f45826a;
    }

    @Override // g9.f
    public byte[] getExtras() {
        return b();
    }

    @Override // g9.f
    public String getName() {
        return "cct";
    }
}
