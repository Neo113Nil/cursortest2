package oi;

import androidx.appcompat.widget.c1;
import java.util.ArrayList;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.Headers;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class p0 {

    /* renamed from: l, reason: collision with root package name */
    public static final char[] f21285l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f21286m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a, reason: collision with root package name */
    public final String f21287a;

    /* renamed from: b, reason: collision with root package name */
    public final gh.y f21288b;

    /* renamed from: c, reason: collision with root package name */
    public String f21289c;

    /* renamed from: d, reason: collision with root package name */
    public gh.x f21290d;

    /* renamed from: e, reason: collision with root package name */
    public final c4.d f21291e = new c4.d(5);

    /* renamed from: f, reason: collision with root package name */
    public final gh.v f21292f;

    /* renamed from: g, reason: collision with root package name */
    public gh.b0 f21293g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f21294h;

    /* renamed from: i, reason: collision with root package name */
    public final gh.c0 f21295i;
    public final d7.e j;

    /* renamed from: k, reason: collision with root package name */
    public gh.m0 f21296k;

    public p0(String str, gh.y yVar, String str2, Headers headers, gh.b0 b0Var, boolean z5, boolean z7, boolean z10) {
        this.f21287a = str;
        this.f21288b = yVar;
        this.f21289c = str2;
        this.f21293g = b0Var;
        this.f21294h = z5;
        if (headers != null) {
            this.f21292f = headers.newBuilder();
        } else {
            this.f21292f = new gh.v();
        }
        if (z7) {
            this.j = new d7.e(8);
            return;
        }
        if (z10) {
            gh.c0 c0Var = new gh.c0();
            this.f21295i = c0Var;
            gh.b0 type = gh.e0.f10141g;
            Intrinsics.checkNotNullParameter(type, "type");
            if (Intrinsics.areEqual(type.f10120b, "multipart")) {
                c0Var.f10136b = type;
            } else {
                throw new IllegalArgumentException(("multipart != " + type).toString());
            }
        }
    }

    public final void a(String name, String value, boolean z5) {
        d7.e eVar = this.j;
        if (z5) {
            eVar.getClass();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            ((ArrayList) eVar.f8268b).add(vh.a.b(name, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            ((ArrayList) eVar.f8269c).add(vh.a.b(value, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true, false, true, false, 83));
            return;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        ((ArrayList) eVar.f8268b).add(vh.a.b(name, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
        ((ArrayList) eVar.f8269c).add(vh.a.b(value, 0, 0, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false, false, false, false, 91));
    }

    public final void b(String str, String str2, boolean z5) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                Regex regex = gh.b0.f10117d;
                this.f21293g = gh.a0.a(str2);
                return;
            } catch (IllegalArgumentException e7) {
                throw new IllegalArgumentException(c1.m("Malformed content type: ", str2), e7);
            }
        }
        gh.v vVar = this.f21292f;
        if (z5) {
            vVar.c(str, str2);
        } else {
            vVar.a(str, str2);
        }
    }

    public final void c(Headers headers, gh.m0 body) {
        gh.c0 c0Var = this.f21295i;
        c0Var.getClass();
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(body, "body");
        if ((headers != null ? headers.get("Content-Type") : null) != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if ((headers != null ? headers.get("Content-Length") : null) != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        gh.d0 part = new gh.d0(headers, body);
        Intrinsics.checkNotNullParameter(part, "part");
        c0Var.f10137c.add(part);
    }

    public final void d(String name, String str, boolean z5) {
        String str2 = this.f21289c;
        if (str2 != null) {
            gh.y yVar = this.f21288b;
            gh.x f6 = yVar.f(str2);
            this.f21290d = f6;
            if (f6 == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + yVar + ", Relative: " + this.f21289c);
            }
            this.f21289c = null;
        }
        if (z5) {
            gh.x xVar = this.f21290d;
            xVar.getClass();
            Intrinsics.checkNotNullParameter(name, "encodedName");
            if (xVar.f10327g == null) {
                xVar.f10327g = new ArrayList();
            }
            ArrayList arrayList = xVar.f10327g;
            Intrinsics.checkNotNull(arrayList);
            arrayList.add(vh.a.a(name, 0, 0, " \"'<>#&=", 83));
            ArrayList arrayList2 = xVar.f10327g;
            Intrinsics.checkNotNull(arrayList2);
            arrayList2.add(str != null ? vh.a.a(str, 0, 0, " \"'<>#&=", 83) : null);
            return;
        }
        gh.x xVar2 = this.f21290d;
        xVar2.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        if (xVar2.f10327g == null) {
            xVar2.f10327g = new ArrayList();
        }
        ArrayList arrayList3 = xVar2.f10327g;
        Intrinsics.checkNotNull(arrayList3);
        arrayList3.add(vh.a.a(name, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91));
        ArrayList arrayList4 = xVar2.f10327g;
        Intrinsics.checkNotNull(arrayList4);
        arrayList4.add(str != null ? vh.a.a(str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", 91) : null);
    }
}
