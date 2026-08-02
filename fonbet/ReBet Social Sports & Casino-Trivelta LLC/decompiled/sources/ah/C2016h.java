package ah;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: ah.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2016h {

    /* renamed from: a, reason: collision with root package name */
    public final String f16053a;

    /* renamed from: b, reason: collision with root package name */
    public final String f16054b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f16055c;

    public C2016h(String name, String value, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f16053a = name;
        this.f16054b = value;
        this.f16055c = z10;
    }

    public final String a() {
        return this.f16053a;
    }

    public final String b() {
        return this.f16054b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2016h)) {
            return false;
        }
        C2016h c2016h = (C2016h) obj;
        return StringsKt.equals(c2016h.f16053a, this.f16053a, true) && StringsKt.equals(c2016h.f16054b, this.f16054b, true);
    }

    public int hashCode() {
        String str = this.f16053a;
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int hashCode = lowerCase.hashCode();
        String lowerCase2 = this.f16054b.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return hashCode + (hashCode * 31) + lowerCase2.hashCode();
    }

    public String toString() {
        return "HeaderValueParam(name=" + this.f16053a + ", value=" + this.f16054b + ", escapeValue=" + this.f16055c + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2016h(String name, String value) {
        this(name, value, false);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }
}
