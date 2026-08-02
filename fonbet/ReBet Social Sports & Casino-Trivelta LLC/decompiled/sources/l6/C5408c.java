package l6;

import com.facebook.react.devsupport.StackTraceHelper;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: l6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5408c {

    /* renamed from: i, reason: collision with root package name */
    public static final a f55625i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f55626a;

    /* renamed from: b, reason: collision with root package name */
    public final int f55627b;

    /* renamed from: c, reason: collision with root package name */
    public final int f55628c;

    /* renamed from: d, reason: collision with root package name */
    public final String f55629d;

    /* renamed from: e, reason: collision with root package name */
    public final String f55630e;

    /* renamed from: f, reason: collision with root package name */
    public final String f55631f;

    /* renamed from: g, reason: collision with root package name */
    public final String f55632g;

    /* renamed from: h, reason: collision with root package name */
    public final int f55633h;

    /* renamed from: l6.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: l6.c$b */
    public enum b {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);


        /* renamed from: a, reason: collision with root package name */
        public final int f55639a;

        b(int i10) {
            this.f55639a = i10;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            b[] valuesCustom = values();
            return (b[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        public final int b() {
            return this.f55639a;
        }
    }

    public C5408c(JSONObject component) {
        Intrinsics.checkNotNullParameter(component, "component");
        String string = component.getString("class_name");
        Intrinsics.checkNotNullExpressionValue(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.f55626a = string;
        this.f55627b = component.optInt("index", -1);
        this.f55628c = component.optInt(StackTraceHelper.ID_KEY);
        String optString = component.optString("text");
        Intrinsics.checkNotNullExpressionValue(optString, "component.optString(PATH_TEXT_KEY)");
        this.f55629d = optString;
        String optString2 = component.optString("tag");
        Intrinsics.checkNotNullExpressionValue(optString2, "component.optString(PATH_TAG_KEY)");
        this.f55630e = optString2;
        String optString3 = component.optString("description");
        Intrinsics.checkNotNullExpressionValue(optString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.f55631f = optString3;
        String optString4 = component.optString("hint");
        Intrinsics.checkNotNullExpressionValue(optString4, "component.optString(PATH_HINT_KEY)");
        this.f55632g = optString4;
        this.f55633h = component.optInt("match_bitmask");
    }

    public final String a() {
        return this.f55626a;
    }

    public final String b() {
        return this.f55631f;
    }

    public final String c() {
        return this.f55632g;
    }

    public final int d() {
        return this.f55628c;
    }

    public final int e() {
        return this.f55627b;
    }

    public final int f() {
        return this.f55633h;
    }

    public final String g() {
        return this.f55630e;
    }

    public final String h() {
        return this.f55629d;
    }
}
