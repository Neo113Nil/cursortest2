package T7;

import android.net.Uri;
import com.twilio.voice.EventKeys;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: T7.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1682w {

    /* renamed from: w, reason: collision with root package name */
    public static final a f11214w = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11215a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11216b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11217c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11218d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumSet f11219e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f11220f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11221g;

    /* renamed from: h, reason: collision with root package name */
    public final C1675o f11222h;

    /* renamed from: i, reason: collision with root package name */
    public final String f11223i;

    /* renamed from: j, reason: collision with root package name */
    public final String f11224j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f11225k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f11226l;

    /* renamed from: m, reason: collision with root package name */
    public final JSONArray f11227m;

    /* renamed from: n, reason: collision with root package name */
    public final String f11228n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f11229o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f11230p;

    /* renamed from: q, reason: collision with root package name */
    public final String f11231q;

    /* renamed from: r, reason: collision with root package name */
    public final String f11232r;

    /* renamed from: s, reason: collision with root package name */
    public final String f11233s;

    /* renamed from: t, reason: collision with root package name */
    public final JSONArray f11234t;

    /* renamed from: u, reason: collision with root package name */
    public final JSONArray f11235u;

    /* renamed from: v, reason: collision with root package name */
    public final Map f11236v;

    /* renamed from: T7.w$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(String applicationId, String actionName, String featureName) {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(actionName, "actionName");
            Intrinsics.checkNotNullParameter(featureName, "featureName");
            if (actionName.length() == 0 || featureName.length() == 0) {
                return null;
            }
            C1682w f10 = A.f(applicationId);
            Map map = f10 == null ? null : (Map) f10.c().get(actionName);
            if (map != null) {
                return (b) map.get(featureName);
            }
            return null;
        }

        public a() {
        }
    }

    /* renamed from: T7.w$b */
    public static final class b {

        /* renamed from: d, reason: collision with root package name */
        public static final a f11237d = new a(null);

        /* renamed from: a, reason: collision with root package name */
        public final String f11238a;

        /* renamed from: b, reason: collision with root package name */
        public final String f11239b;

        /* renamed from: c, reason: collision with root package name */
        public final Uri f11240c;

        @Nullable
        private final int[] versionSpec;

        /* renamed from: T7.w$b$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a(JSONObject dialogConfigJSON) {
                Intrinsics.checkNotNullParameter(dialogConfigJSON, "dialogConfigJSON");
                String dialogNameWithFeature = dialogConfigJSON.optString("name");
                if (Y.d0(dialogNameWithFeature)) {
                    return null;
                }
                Intrinsics.checkNotNullExpressionValue(dialogNameWithFeature, "dialogNameWithFeature");
                List split$default = StringsKt.split$default((CharSequence) dialogNameWithFeature, new String[]{"|"}, false, 0, 6, (Object) null);
                if (split$default.size() != 2) {
                    return null;
                }
                String str = (String) CollectionsKt.first(split$default);
                String str2 = (String) CollectionsKt.last(split$default);
                if (Y.d0(str) || Y.d0(str2)) {
                    return null;
                }
                String optString = dialogConfigJSON.optString(EventKeys.URL);
                return new b(str, str2, Y.d0(optString) ? null : Uri.parse(optString), b(dialogConfigJSON.optJSONArray("versions")), null);
            }

            public final int[] b(JSONArray jSONArray) {
                if (jSONArray == null) {
                    return null;
                }
                int length = jSONArray.length();
                int[] iArr = new int[length];
                if (length > 0) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        int i12 = -1;
                        int optInt = jSONArray.optInt(i10, -1);
                        if (optInt == -1) {
                            String versionString = jSONArray.optString(i10);
                            if (!Y.d0(versionString)) {
                                try {
                                    Intrinsics.checkNotNullExpressionValue(versionString, "versionString");
                                    i12 = Integer.parseInt(versionString);
                                } catch (NumberFormatException e10) {
                                    Y.j0("FacebookSDK", e10);
                                }
                                optInt = i12;
                            }
                        }
                        iArr[i10] = optInt;
                        if (i11 >= length) {
                            break;
                        }
                        i10 = i11;
                    }
                }
                return iArr;
            }

            public a() {
            }
        }

        public /* synthetic */ b(String str, String str2, Uri uri, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, uri, iArr);
        }

        public final String a() {
            return this.f11238a;
        }

        public final String b() {
            return this.f11239b;
        }

        public final int[] c() {
            return this.versionSpec;
        }

        public b(String str, String str2, Uri uri, int[] iArr) {
            this.f11238a = str;
            this.f11239b = str2;
            this.f11240c = uri;
            this.versionSpec = iArr;
        }
    }

    public C1682w(boolean z10, String nuxContent, boolean z11, int i10, EnumSet smartLoginOptions, Map dialogConfigurations, boolean z12, C1675o errorClassification, String smartLoginBookmarkIconURL, String smartLoginMenuIconURL, boolean z13, boolean z14, JSONArray jSONArray, String sdkUpdateMessage, boolean z15, boolean z16, String str, String str2, String str3, JSONArray jSONArray2, JSONArray jSONArray3, Map map) {
        Intrinsics.checkNotNullParameter(nuxContent, "nuxContent");
        Intrinsics.checkNotNullParameter(smartLoginOptions, "smartLoginOptions");
        Intrinsics.checkNotNullParameter(dialogConfigurations, "dialogConfigurations");
        Intrinsics.checkNotNullParameter(errorClassification, "errorClassification");
        Intrinsics.checkNotNullParameter(smartLoginBookmarkIconURL, "smartLoginBookmarkIconURL");
        Intrinsics.checkNotNullParameter(smartLoginMenuIconURL, "smartLoginMenuIconURL");
        Intrinsics.checkNotNullParameter(sdkUpdateMessage, "sdkUpdateMessage");
        this.f11215a = z10;
        this.f11216b = nuxContent;
        this.f11217c = z11;
        this.f11218d = i10;
        this.f11219e = smartLoginOptions;
        this.f11220f = dialogConfigurations;
        this.f11221g = z12;
        this.f11222h = errorClassification;
        this.f11223i = smartLoginBookmarkIconURL;
        this.f11224j = smartLoginMenuIconURL;
        this.f11225k = z13;
        this.f11226l = z14;
        this.f11227m = jSONArray;
        this.f11228n = sdkUpdateMessage;
        this.f11229o = z15;
        this.f11230p = z16;
        this.f11231q = str;
        this.f11232r = str2;
        this.f11233s = str3;
        this.f11234t = jSONArray2;
        this.f11235u = jSONArray3;
        this.f11236v = map;
    }

    public final boolean a() {
        return this.f11221g;
    }

    public final boolean b() {
        return this.f11226l;
    }

    public final Map c() {
        return this.f11220f;
    }

    public final C1675o d() {
        return this.f11222h;
    }

    public final JSONArray e() {
        return this.f11227m;
    }

    public final boolean f() {
        return this.f11225k;
    }

    public final JSONArray g() {
        return this.f11235u;
    }

    public final String h() {
        return this.f11216b;
    }

    public final boolean i() {
        return this.f11217c;
    }

    public final JSONArray j() {
        return this.f11234t;
    }

    public final String k() {
        return this.f11231q;
    }

    public final String l() {
        return this.f11233s;
    }

    public final String m() {
        return this.f11228n;
    }

    public final int n() {
        return this.f11218d;
    }

    public final EnumSet o() {
        return this.f11219e;
    }

    public final String p() {
        return this.f11232r;
    }

    public final boolean q() {
        return this.f11215a;
    }
}
