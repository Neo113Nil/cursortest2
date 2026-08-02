package gh;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class b0 {

    /* renamed from: d, reason: collision with root package name */
    public static final Regex f10117d = new Regex("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e, reason: collision with root package name */
    public static final Regex f10118e = new Regex(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    public final String f10119a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10120b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f10121c;

    public b0(String mediaType, String type, String subtype, String[] parameterNamesAndValues) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        Intrinsics.checkNotNullParameter(parameterNamesAndValues, "parameterNamesAndValues");
        this.f10119a = mediaType;
        this.f10120b = type;
        this.f10121c = parameterNamesAndValues;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Charset a(Charset charset) {
        String str;
        Intrinsics.checkNotNullParameter("charset", "name");
        String[] strArr = this.f10121c;
        int i5 = 0;
        int a7 = of.c.a(0, strArr.length - 1, 2);
        if (a7 >= 0) {
            while (!kotlin.text.z.j(strArr[i5], "charset", true)) {
                if (i5 != a7) {
                    i5 += 2;
                }
            }
            str = strArr[i5 + 1];
            if (str != null) {
                return charset;
            }
            try {
                return Charset.forName(str);
            } catch (IllegalArgumentException unused) {
                return charset;
            }
        }
        str = null;
        if (str != null) {
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b0) && Intrinsics.areEqual(((b0) obj).f10119a, this.f10119a);
    }

    public final int hashCode() {
        return this.f10119a.hashCode();
    }

    public final String toString() {
        return this.f10119a;
    }
}
