package com.google.android.datatransport.cct;

import androidx.annotation.NonNull;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    static final String f57777c;

    /* renamed from: d, reason: collision with root package name */
    private static final Set<Q6.c> f57778d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f57779e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f57780f;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final String f57781a;

    /* renamed from: b, reason: collision with root package name */
    private final String f57782b;

    static {
        String a11 = c.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f57777c = a11;
        String a12 = c.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        String a13 = c.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f57778d = Collections.unmodifiableSet(new HashSet(Arrays.asList(Q6.c.b("proto"), Q6.c.b("json"))));
        f57779e = new a(a11, null);
        f57780f = new a(a12, a13);
    }

    public a(@NonNull String str, String str2) {
        this.f57781a = str;
        this.f57782b = str2;
    }

    @NonNull
    public static a a(@NonNull byte[] bArr) {
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

    public final String b() {
        return this.f57782b;
    }

    @NonNull
    public final String c() {
        return this.f57781a;
    }

    public final byte[] d() {
        String str = this.f57781a;
        String str2 = this.f57782b;
        if (str2 == null && str == null) {
            return null;
        }
        if (str2 == null) {
            str2 = "";
        }
        return Sh.b.c("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
    }

    public final Set<Q6.c> e() {
        return f57778d;
    }
}
