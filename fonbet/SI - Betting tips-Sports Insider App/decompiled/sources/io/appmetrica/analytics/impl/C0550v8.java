package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.KotlinVersion;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.v8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0550v8 implements InterfaceC0270k2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f14771a = 5;

    /* renamed from: b, reason: collision with root package name */
    public final int f14772b = 100;

    /* renamed from: c, reason: collision with root package name */
    public final int f14773c = KotlinVersion.MAX_COMPONENT_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public final int f14774d = 2;

    /* renamed from: e, reason: collision with root package name */
    public final int f14775e = 63;

    /* renamed from: f, reason: collision with root package name */
    public final int f14776f = 1;

    /* renamed from: g, reason: collision with root package name */
    public final int f14777g = 2;

    /* renamed from: h, reason: collision with root package name */
    public final int f14778h = 1;

    /* renamed from: i, reason: collision with root package name */
    public final int f14779i = 64;
    public final Regex j = new Regex("^[a-zA-Z0-9'!#$%&*+-/=?^_`{|}~]+$");

    /* renamed from: k, reason: collision with root package name */
    public final Regex f14780k = new Regex("(?:^|\\.)(?:(ya\\.ru)|(?:yandex)\\.(\\w+|com?\\.\\w+))$");

    /* renamed from: l, reason: collision with root package name */
    public final List f14781l = kotlin.collections.u.f("ru", "by", "kz", "az", "kg", "lv", "md", "tj", "tm", "uz", "ee", "fr", "lt", "com", "co.il", "com.ge", "com.am", "com.tr", "com.ru");

    /* renamed from: m, reason: collision with root package name */
    public final String f14782m = "yandex.ru";

    /* renamed from: n, reason: collision with root package name */
    public final String f14783n = "gmail.com";

    /* renamed from: o, reason: collision with root package name */
    public final String f14784o = "googlemail.com";

    @Override // io.appmetrica.analytics.impl.InterfaceC0270k2
    @Nullable
    public final String a(@NotNull String str) {
        String str2;
        List split$default;
        String lowerCase = new Regex("^\\++").replace(StringsKt.Z(str).toString(), "").toLowerCase(Locale.ROOT);
        int J = StringsKt.J(lowerCase, '@', 0, 6);
        if (J != -1) {
            String substring = lowerCase.substring(0, J);
            String substring2 = lowerCase.substring(J + 1);
            int length = substring.length();
            if (length >= this.f14778h && length <= this.f14779i) {
                List R = StringsKt.R(substring, new char[]{'.'});
                if (R == null || !R.isEmpty()) {
                    Iterator it = R.iterator();
                    do {
                        if (it.hasNext()) {
                            str2 = (String) it.next();
                            int length2 = str2.length();
                            if (length2 >= this.f14778h) {
                                Character x10 = kotlin.text.d0.x(str2);
                                if (x10 != null && x10.charValue() == '\"') {
                                    Intrinsics.checkNotNullParameter(str2, "<this>");
                                    Character valueOf = str2.length() == 0 ? null : Character.valueOf(str2.charAt(str2.length() - 1));
                                    if (valueOf != null && valueOf.charValue() == '\"' && length2 > 2) {
                                        int i5 = 1;
                                        while (true) {
                                            int i10 = i5 + 2;
                                            if (i10 >= str2.length()) {
                                                break;
                                            }
                                            char charAt = str2.charAt(i5);
                                            if (charAt < ' ' || charAt == '\"' || charAt > '~') {
                                                return null;
                                            }
                                            if (charAt == '\\') {
                                                if (i10 == str2.length()) {
                                                    return null;
                                                }
                                                i5++;
                                                if (str2.charAt(i5) < ' ') {
                                                    return null;
                                                }
                                            }
                                            i5++;
                                        }
                                    }
                                }
                            }
                        }
                    } while (this.j.d(str2));
                    return null;
                }
                if (substring2.length() > this.f14773c) {
                    return null;
                }
                split$default = StringsKt__StringsKt.split$default(substring2, new String[]{"."}, false, 0, 6, null);
                if (split$default.size() < this.f14774d) {
                    return null;
                }
                List C = CollectionsKt.C(split$default);
                if (C == null || !C.isEmpty()) {
                    Iterator it2 = C.iterator();
                    while (it2.hasNext()) {
                        if (!b((String) it2.next())) {
                            return null;
                        }
                    }
                }
                String str3 = (String) CollectionsKt.K(split$default);
                if (str3.length() < this.f14777g || !b(str3)) {
                    return null;
                }
                for (int i11 = 0; i11 < str3.length(); i11++) {
                    if (!Character.isDigit(str3.charAt(i11))) {
                        String m6 = kotlin.text.z.m(substring2, this.f14784o, this.f14783n);
                        kotlin.text.n a7 = Regex.a(this.f14780k, m6);
                        if (a7 != null) {
                            kotlin.collections.t0 t0Var = (kotlin.collections.t0) a7.a();
                            String str4 = (String) t0Var.get(1);
                            String str5 = (String) t0Var.get(2);
                            if (str5.length() <= 0 ? str4.length() > 0 : this.f14781l.contains(str5)) {
                                m6 = this.f14782m;
                            }
                        }
                        if (Intrinsics.areEqual(m6, this.f14782m)) {
                            substring = kotlin.text.z.m(substring, ".", "-");
                        } else if (Intrinsics.areEqual(m6, this.f14783n)) {
                            substring = kotlin.text.z.m(substring, ".", "");
                        }
                        int length3 = substring.length();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= length3) {
                                break;
                            }
                            if (substring.charAt(i12) == '+') {
                                substring = substring.substring(0, i12);
                                break;
                            }
                            i12++;
                        }
                        String str6 = substring + '@' + m6;
                        if (str6.length() < this.f14771a || str6.length() > this.f14772b) {
                            return null;
                        }
                        return str6;
                    }
                }
                return null;
            }
        }
        return null;
    }

    public final boolean b(String str) {
        if (str.length() > this.f14775e || str.length() < this.f14776f) {
            return false;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (!Character.isLetterOrDigit(str.charAt(0)) || !Character.isLetterOrDigit(kotlin.text.d0.y(str))) {
            return false;
        }
        for (int i5 = 0; i5 < str.length(); i5++) {
            char charAt = str.charAt(i5);
            if (!Character.isLetterOrDigit(charAt) && charAt != '-') {
                return false;
            }
        }
        return true;
    }
}
