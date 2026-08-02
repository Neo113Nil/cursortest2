package U4;

import G5.CoralogixStackTrace;
import G5.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    public static final C0246a f12031h = new C0246a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f12032a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12033b;

    /* renamed from: c, reason: collision with root package name */
    public final CoralogixStackTrace f12034c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12035d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12036e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12037f;

    /* renamed from: g, reason: collision with root package name */
    public final String f12038g;

    /* renamed from: U4.a$a, reason: collision with other inner class name */
    public static final class C0246a {
        public /* synthetic */ C0246a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0246a() {
        }
    }

    public a(String errorType, String errorMessage, CoralogixStackTrace errorStack, boolean z10, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(errorStack, "errorStack");
        this.f12032a = errorType;
        this.f12033b = errorMessage;
        this.f12034c = errorStack;
        this.f12035d = z10;
        this.f12036e = str;
        this.f12037f = str2;
        this.f12038g = str3;
    }

    public final String a() {
        return this.f12037f;
    }

    public final String b() {
        return this.f12038g;
    }

    public final String c() {
        return this.f12033b;
    }

    public final CoralogixStackTrace d() {
        return this.f12034c;
    }

    public final String e() {
        return this.f12032a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f12032a, aVar.f12032a) && Intrinsics.areEqual(this.f12033b, aVar.f12033b) && Intrinsics.areEqual(this.f12034c, aVar.f12034c) && this.f12035d == aVar.f12035d && Intrinsics.areEqual(this.f12036e, aVar.f12036e) && Intrinsics.areEqual(this.f12037f, aVar.f12037f) && Intrinsics.areEqual(this.f12038g, aVar.f12038g);
    }

    public final String f() {
        return this.f12036e;
    }

    public final boolean g() {
        return this.f12035d;
    }

    public int hashCode() {
        int hashCode = ((((((this.f12032a.hashCode() * 31) + this.f12033b.hashCode()) * 31) + this.f12034c.hashCode()) * 31) + Boolean.hashCode(this.f12035d)) * 31;
        String str = this.f12036e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f12037f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f12038g;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "CoralogixErrorDecorator(errorType=" + this.f12032a + ", errorMessage=" + this.f12033b + ", errorStack=" + this.f12034c + ", isCrash=" + this.f12035d + ", stackTraceType=" + this.f12036e + ", arch=" + this.f12037f + ", buildId=" + this.f12038g + ")";
    }

    public /* synthetic */ a(String str, String str2, CoralogixStackTrace coralogixStackTrace, boolean z10, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, coralogixStackTrace, z10, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : str5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(Throwable throwable, boolean z10) {
        this(r2, r3, r0.a(r12), z10, null, null, null, 112, null);
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        String simpleName = throwable.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        String a10 = P5.c.a(throwable.getMessage(), 102);
        f fVar = f.f3897a;
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
    }
}
