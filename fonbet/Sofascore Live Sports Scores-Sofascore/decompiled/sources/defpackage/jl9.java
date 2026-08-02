package defpackage;

import com.unity3d.services.core.network.model.HttpRequest;
import com.vungle.ads.internal.protos.Sdk;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class jl9 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final ArrayList f;
    public final List g;
    public final String h;
    public final String i;

    public jl9(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = str5;
        this.i = str6;
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return str.substring(StringsKt.O(str, ':', length, 4) + 1, StringsKt.O(str, '@', 0, 6));
    }

    public final String b() {
        int length = this.a.length() + 3;
        String str = this.i;
        int O = StringsKt.O(str, '/', length, 4);
        return str.substring(O, wol.e(O, str.length(), str, "?#"));
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.i;
        int O = StringsKt.O(str, '/', length, 4);
        int e = wol.e(O, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (O < e) {
            int i = O + 1;
            int f = wol.f(str, i, e, '/');
            arrayList.add(str.substring(i, f));
            O = f;
        }
        return arrayList;
    }

    public final String d() {
        if (this.g == null) {
            return null;
        }
        String str = this.i;
        int O = StringsKt.O(str, '?', 0, 6) + 1;
        return str.substring(O, wol.f(str, O, str.length(), '#'));
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        return str.substring(length, wol.e(length, str.length(), str, ":@"));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jl9) && ((jl9) obj).i.equals(this.i);
    }

    public final boolean f() {
        return Intrinsics.c(this.a, HttpRequest.DEFAULT_SCHEME);
    }

    public final il9 g() {
        il9 il9Var = new il9(0);
        ArrayList arrayList = (ArrayList) il9Var.h;
        String str = this.a;
        il9Var.c = str;
        il9Var.d = e();
        il9Var.e = a();
        il9Var.f = this.d;
        str.getClass();
        int i = str.equals("http") ? 80 : str.equals(HttpRequest.DEFAULT_SCHEME) ? 443 : -1;
        int i2 = this.e;
        il9Var.b = i2 != i ? i2 : -1;
        arrayList.clear();
        arrayList.addAll(c());
        String d = d();
        String str2 = null;
        il9Var.i = d != null ? il9.j(rz8.w(0, 0, d, " \"'<>#", 83)) : null;
        if (this.h != null) {
            String str3 = this.i;
            str2 = str3.substring(StringsKt.O(str3, '#', 0, 6) + 1);
        }
        il9Var.g = str2;
        return il9Var;
    }

    public final String h() {
        il9 il9Var;
        try {
            il9Var = new il9(0);
            il9Var.h(this, "/...");
        } catch (IllegalArgumentException unused) {
            il9Var = null;
        }
        il9Var.getClass();
        il9Var.d = rz8.w(0, 0, "", " \"':;<=>@[]^`{}|/\\?#", Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE);
        il9Var.e = rz8.w(0, 0, "", " \"':;<=>@[]^`{}|/\\?#", Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE);
        return il9Var.c().i;
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final URI i() {
        il9 g = g();
        ArrayList arrayList = (ArrayList) g.h;
        String str = (String) g.f;
        g.f = str != null ? me4.h("[\"<>^`{|}]", str, "") : null;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, rz8.w(0, 0, (String) arrayList.get(i), "[]", 99));
        }
        ArrayList arrayList2 = (ArrayList) g.i;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? rz8.w(0, 0, str2, "\\^`{|}", 67) : null);
            }
        }
        String str3 = (String) g.g;
        g.g = str3 != null ? rz8.w(0, 0, str3, " \"#<>\\^`{|}", 35) : null;
        String il9Var = g.toString();
        try {
            return new URI(il9Var);
        } catch (URISyntaxException e) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(il9Var, ""));
                create.getClass();
                return create;
            } catch (Exception unused) {
                is8.h(e);
                return null;
            }
        }
    }

    public final URL j() {
        try {
            return new URL(this.i);
        } catch (MalformedURLException e) {
            is8.h(e);
            return null;
        }
    }

    public final String toString() {
        return this.i;
    }
}
