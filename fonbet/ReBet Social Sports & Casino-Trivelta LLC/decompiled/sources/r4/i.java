package r4;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.twilio.voice.EventKeys;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import t4.C6441a;
import t4.C6442b;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: r, reason: collision with root package name */
    public static final a f63991r = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public String f63992a;

    /* renamed from: b, reason: collision with root package name */
    public Uri f63993b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f63994c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f63995d;

    /* renamed from: i, reason: collision with root package name */
    public String f64000i;

    /* renamed from: j, reason: collision with root package name */
    public b f64001j;

    /* renamed from: m, reason: collision with root package name */
    public f f64004m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f64005n;

    /* renamed from: o, reason: collision with root package name */
    public d f64006o;

    /* renamed from: q, reason: collision with root package name */
    public h f64008q;

    /* renamed from: e, reason: collision with root package name */
    public int f63996e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f63997f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f63998g = -1;

    /* renamed from: h, reason: collision with root package name */
    public int f63999h = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f64002k = 3;

    /* renamed from: l, reason: collision with root package name */
    public final Map f64003l = new HashMap();

    /* renamed from: p, reason: collision with root package name */
    public C6206b f64007p = new C6206b();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Uri a(Context context, String str) {
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
            int identifier = resources.getIdentifier(str, "drawable", packageName);
            if (identifier == 0) {
                identifier = resources.getIdentifier(str, "raw", packageName);
            }
            if (identifier > 0) {
                return new Uri.Builder().scheme("android.resource").path(String.valueOf(identifier)).build();
            }
            C6441a.a("Source", "cannot find identifier");
            return null;
        }

        public final boolean b(String str) {
            if (str == null) {
                return false;
            }
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
            String lowerCase = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return Intrinsics.areEqual(lowerCase, "http") || Intrinsics.areEqual(lowerCase, "https") || Intrinsics.areEqual(lowerCase, "content") || Intrinsics.areEqual(lowerCase, "file") || Intrinsics.areEqual(lowerCase, "rtsp") || Intrinsics.areEqual(lowerCase, "asset");
        }

        public final i c(ReadableMap readableMap, Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            i iVar = new i();
            if (readableMap != null) {
                String h10 = C6442b.h(readableMap, "uri", null);
                if (h10 != null) {
                    if (StringsKt.isBlank(h10)) {
                        h10 = null;
                    }
                    if (h10 != null) {
                        Uri parse = Uri.parse(h10);
                        a aVar = i.f63991r;
                        if (aVar.b(parse.getScheme()) || (parse = aVar.a(context, h10)) != null) {
                            iVar.f63992a = h10;
                            iVar.H(parse);
                        }
                    }
                }
                iVar.B(C6442b.b(readableMap, "isLocalAssetFile", false));
                iVar.t(C6442b.b(readableMap, "isAsset", false));
                iVar.F(C6442b.e(readableMap, "startPosition", -1));
                iVar.y(C6442b.e(readableMap, "cropStart", -1));
                iVar.x(C6442b.e(readableMap, "cropEnd", -1));
                iVar.w(C6442b.e(readableMap, "contentStartTime", -1));
                iVar.A(C6442b.h(readableMap, "type", null));
                iVar.z(f.f63976d.a(C6442b.f(readableMap, "drm")));
                iVar.v(d.f63955f.a(C6442b.f(readableMap, "cmcd")));
                iVar.G(C6442b.b(readableMap, "textTracksAllowChunklessPreparation", true));
                iVar.E(h.f63989b.a(C6442b.a(readableMap, "textTracks")));
                iVar.D(C6442b.e(readableMap, "minLoadRetryCount", 3));
                iVar.u(C6206b.f63930l.c(C6442b.f(readableMap, "bufferConfig")));
                ReadableArray a10 = C6442b.a(readableMap, "requestHeaders");
                if (a10 != null && a10.size() > 0) {
                    int size = a10.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ReadableMap map = a10.getMap(i10);
                        String string = map != null ? map.getString("key") : null;
                        String string2 = map != null ? map.getString(EventKeys.VALUE_KEY) : null;
                        if (string != null && string2 != null) {
                            iVar.j().put(string, string2);
                        }
                    }
                }
                iVar.C(b.f64009f.a(C6442b.f(readableMap, "metadata")));
                return iVar;
            }
            return iVar;
        }

        public a() {
        }
    }

    public static final class b {

        /* renamed from: f, reason: collision with root package name */
        public static final a f64009f = new a(null);

        /* renamed from: a, reason: collision with root package name */
        public String f64010a;

        /* renamed from: b, reason: collision with root package name */
        public String f64011b;

        /* renamed from: c, reason: collision with root package name */
        public String f64012c;

        /* renamed from: d, reason: collision with root package name */
        public String f64013d;

        /* renamed from: e, reason: collision with root package name */
        public Uri f64014e;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a(ReadableMap readableMap) {
                if (readableMap == null) {
                    return null;
                }
                b bVar = new b();
                bVar.j(C6442b.g(readableMap, "title"));
                bVar.i(C6442b.g(readableMap, "subtitle"));
                bVar.g(C6442b.g(readableMap, "description"));
                bVar.f(C6442b.g(readableMap, "artist"));
                try {
                    bVar.h(Uri.parse(C6442b.g(readableMap, "imageUri")));
                    return bVar;
                } catch (Exception unused) {
                    C6441a.b("Source", "Could not parse imageUri in metadata");
                    return bVar;
                }
            }

            public a() {
            }
        }

        public final String a() {
            return this.f64013d;
        }

        public final String b() {
            return this.f64012c;
        }

        public final Uri c() {
            return this.f64014e;
        }

        public final String d() {
            return this.f64011b;
        }

        public final String e() {
            return this.f64010a;
        }

        public final void f(String str) {
            this.f64013d = str;
        }

        public final void g(String str) {
            this.f64012c = str;
        }

        public final void h(Uri uri) {
            this.f64014e = uri;
        }

        public final void i(String str) {
            this.f64011b = str;
        }

        public final void j(String str) {
            this.f64010a = str;
        }
    }

    public final void A(String str) {
        this.f64000i = str;
    }

    public final void B(boolean z10) {
        this.f63994c = z10;
    }

    public final void C(b bVar) {
        this.f64001j = bVar;
    }

    public final void D(int i10) {
        this.f64002k = i10;
    }

    public final void E(h hVar) {
        this.f64008q = hVar;
    }

    public final void F(int i10) {
        this.f63996e = i10;
    }

    public final void G(boolean z10) {
        this.f64005n = z10;
    }

    public final void H(Uri uri) {
        this.f63993b = uri;
    }

    public final AbstractC6205a b() {
        return null;
    }

    public final C6206b c() {
        return this.f64007p;
    }

    public final d d() {
        return this.f64006o;
    }

    public final int e() {
        return this.f63999h;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof i)) {
            i iVar = (i) obj;
            if (Intrinsics.areEqual(this.f63993b, iVar.f63993b) && this.f63997f == iVar.f63997f && this.f63998g == iVar.f63998g && this.f63996e == iVar.f63996e && Intrinsics.areEqual(this.f64000i, iVar.f64000i) && Intrinsics.areEqual(this.f64004m, iVar.f64004m) && this.f63999h == iVar.f63999h && Intrinsics.areEqual(this.f64006o, iVar.f64006o) && Intrinsics.areEqual(this.f64008q, iVar.f64008q) && Intrinsics.areEqual((Object) null, (Object) null) && this.f64002k == iVar.f64002k && this.f63994c == iVar.f63994c && this.f63995d == iVar.f63995d && Intrinsics.areEqual(this.f64007p, iVar.f64007p)) {
                return true;
            }
        }
        return false;
    }

    public final int f() {
        return this.f63998g;
    }

    public final int g() {
        return this.f63997f;
    }

    public final f h() {
        return this.f64004m;
    }

    public int hashCode() {
        return Objects.hash(this.f63992a, this.f63993b, Integer.valueOf(this.f63996e), Integer.valueOf(this.f63997f), Integer.valueOf(this.f63998g), this.f64000i, this.f64001j, this.f64003l, null);
    }

    public final String i() {
        return this.f64000i;
    }

    public final Map j() {
        return this.f64003l;
    }

    public final b k() {
        return this.f64001j;
    }

    public final int l() {
        return this.f64002k;
    }

    public final h m() {
        return this.f64008q;
    }

    public final int n() {
        return this.f63996e;
    }

    public final boolean o() {
        return this.f64005n;
    }

    public final Uri p() {
        return this.f63993b;
    }

    public final boolean q() {
        return this.f63995d;
    }

    public final boolean r(i source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return Intrinsics.areEqual(this, source);
    }

    public final boolean s() {
        return this.f63994c;
    }

    public final void t(boolean z10) {
        this.f63995d = z10;
    }

    public final void u(C6206b c6206b) {
        Intrinsics.checkNotNullParameter(c6206b, "<set-?>");
        this.f64007p = c6206b;
    }

    public final void v(d dVar) {
        this.f64006o = dVar;
    }

    public final void w(int i10) {
        this.f63999h = i10;
    }

    public final void x(int i10) {
        this.f63998g = i10;
    }

    public final void y(int i10) {
        this.f63997f = i10;
    }

    public final void z(f fVar) {
        this.f64004m = fVar;
    }
}
