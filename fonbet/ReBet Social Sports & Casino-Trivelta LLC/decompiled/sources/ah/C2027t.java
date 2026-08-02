package ah;

import com.twilio.voice.VoiceURLConnection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ah.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2027t {

    /* renamed from: b, reason: collision with root package name */
    public static final a f16165b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final C2027t f16166c;

    /* renamed from: d, reason: collision with root package name */
    public static final C2027t f16167d;

    /* renamed from: e, reason: collision with root package name */
    public static final C2027t f16168e;

    /* renamed from: f, reason: collision with root package name */
    public static final C2027t f16169f;

    /* renamed from: g, reason: collision with root package name */
    public static final C2027t f16170g;

    /* renamed from: h, reason: collision with root package name */
    public static final C2027t f16171h;

    /* renamed from: i, reason: collision with root package name */
    public static final C2027t f16172i;

    /* renamed from: j, reason: collision with root package name */
    public static final List f16173j;

    /* renamed from: a, reason: collision with root package name */
    public final String f16174a;

    /* renamed from: ah.t$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2027t a() {
            return C2027t.f16166c;
        }

        public final C2027t b() {
            return C2027t.f16171h;
        }

        public final C2027t c() {
            return C2027t.f16167d;
        }

        public a() {
        }
    }

    static {
        C2027t c2027t = new C2027t("GET");
        f16166c = c2027t;
        C2027t c2027t2 = new C2027t(VoiceURLConnection.METHOD_TYPE_POST);
        f16167d = c2027t2;
        C2027t c2027t3 = new C2027t("PUT");
        f16168e = c2027t3;
        C2027t c2027t4 = new C2027t("PATCH");
        f16169f = c2027t4;
        C2027t c2027t5 = new C2027t(VoiceURLConnection.METHOD_TYPE_DELETE);
        f16170g = c2027t5;
        C2027t c2027t6 = new C2027t("HEAD");
        f16171h = c2027t6;
        C2027t c2027t7 = new C2027t("OPTIONS");
        f16172i = c2027t7;
        f16173j = CollectionsKt.listOf((Object[]) new C2027t[]{c2027t, c2027t2, c2027t3, c2027t4, c2027t5, c2027t6, c2027t7});
    }

    public C2027t(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f16174a = value;
    }

    public final String d() {
        return this.f16174a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2027t) && Intrinsics.areEqual(this.f16174a, ((C2027t) obj).f16174a);
    }

    public int hashCode() {
        return this.f16174a.hashCode();
    }

    public String toString() {
        return "HttpMethod(value=" + this.f16174a + ')';
    }
}
