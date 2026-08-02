package ah;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: ah.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2015g {

    /* renamed from: a, reason: collision with root package name */
    public final String f16050a;

    /* renamed from: b, reason: collision with root package name */
    public final List f16051b;

    /* renamed from: c, reason: collision with root package name */
    public final double f16052c;

    public C2015g(String value, List params) {
        Double d10;
        Object obj;
        String b10;
        Double doubleOrNull;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f16050a = value;
        this.f16051b = params;
        Iterator it = params.iterator();
        while (true) {
            d10 = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.areEqual(((C2016h) obj).a(), "q")) {
                    break;
                }
            }
        }
        C2016h c2016h = (C2016h) obj;
        double d11 = 1.0d;
        if (c2016h != null && (b10 = c2016h.b()) != null && (doubleOrNull = StringsKt.toDoubleOrNull(b10)) != null) {
            double doubleValue = doubleOrNull.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                d10 = doubleOrNull;
            }
            if (d10 != null) {
                d11 = d10.doubleValue();
            }
        }
        this.f16052c = d11;
    }

    public final List a() {
        return this.f16051b;
    }

    public final String b() {
        return this.f16050a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2015g)) {
            return false;
        }
        C2015g c2015g = (C2015g) obj;
        return Intrinsics.areEqual(this.f16050a, c2015g.f16050a) && Intrinsics.areEqual(this.f16051b, c2015g.f16051b);
    }

    public int hashCode() {
        return (this.f16050a.hashCode() * 31) + this.f16051b.hashCode();
    }

    public String toString() {
        return "HeaderValue(value=" + this.f16050a + ", params=" + this.f16051b + ')';
    }
}
