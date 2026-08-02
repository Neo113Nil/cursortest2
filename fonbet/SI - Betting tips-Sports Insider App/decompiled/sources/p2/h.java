package p2;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.t;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f21476a;

    /* renamed from: b, reason: collision with root package name */
    public final String f21477b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f21478c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21479d;

    /* renamed from: e, reason: collision with root package name */
    public final String f21480e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21481f;

    /* renamed from: g, reason: collision with root package name */
    public final int f21482g;

    public h(String name, String type, boolean z5, int i5, String str, int i10) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f21476a = name;
        this.f21477b = type;
        this.f21478c = z5;
        this.f21479d = i5;
        this.f21480e = str;
        this.f21481f = i10;
        int i11 = 5;
        if (type != null) {
            String upperCase = type.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            if (StringsKt.A(upperCase, "INT", false)) {
                i11 = 3;
            } else if (StringsKt.A(upperCase, "CHAR", false) || StringsKt.A(upperCase, "CLOB", false) || StringsKt.A(upperCase, "TEXT", false)) {
                i11 = 2;
            } else if (!StringsKt.A(upperCase, "BLOB", false)) {
                i11 = (StringsKt.A(upperCase, "REAL", false) || StringsKt.A(upperCase, "FLOA", false) || StringsKt.A(upperCase, "DOUB", false)) ? 4 : 1;
            }
        }
        this.f21482g = i11;
    }

    public final boolean equals(Object obj) {
        Intrinsics.checkNotNullParameter(this, "<this>");
        if (this != obj) {
            if (obj instanceof h) {
                boolean z5 = this.f21479d > 0;
                h hVar = (h) obj;
                int i5 = hVar.f21481f;
                if (z5 == (hVar.f21479d > 0) && Intrinsics.areEqual(this.f21476a, hVar.f21476a) && this.f21478c == hVar.f21478c) {
                    String str = hVar.f21480e;
                    int i10 = this.f21481f;
                    String str2 = this.f21480e;
                    if ((i10 != 1 || i5 != 2 || str2 == null || l.a(str2, str)) && ((i10 != 2 || i5 != 1 || str == null || l.a(str, str2)) && ((i10 == 0 || i10 != i5 || (str2 == null ? str == null : l.a(str2, str))) && this.f21482g == hVar.f21482g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        return (((((this.f21476a.hashCode() * 31) + this.f21482g) * 31) + (this.f21478c ? 1231 : 1237)) * 31) + this.f21479d;
    }

    public final String toString() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        StringBuilder sb2 = new StringBuilder("\n            |Column {\n            |   name = '");
        sb2.append(this.f21476a);
        sb2.append("',\n            |   type = '");
        sb2.append(this.f21477b);
        sb2.append("',\n            |   affinity = '");
        sb2.append(this.f21482g);
        sb2.append("',\n            |   notNull = '");
        sb2.append(this.f21478c);
        sb2.append("',\n            |   primaryKeyPosition = '");
        sb2.append(this.f21479d);
        sb2.append("',\n            |   defaultValue = '");
        String str = this.f21480e;
        if (str == null) {
            str = StringUtils.UNDEFINED;
        }
        sb2.append(str);
        sb2.append("'\n            |}\n        ");
        return t.b(t.d(sb2.toString()));
    }
}
