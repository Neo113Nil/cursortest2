package U8;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f12117a = new a();

    /* renamed from: U8.a$a, reason: collision with other inner class name */
    public enum EnumC0251a {
        Small("36h"),
        Medium("80h"),
        Big("200h");


        /* renamed from: a, reason: collision with root package name */
        public final String f12121a;

        EnumC0251a(String str) {
            this.f12121a = str;
        }

        public final String b() {
            return this.f12121a;
        }
    }

    public final String a(String str, EnumC0251a size) {
        String str2;
        Intrinsics.checkNotNullParameter(size, "size");
        if (str == null || str.length() == 0) {
            return null;
        }
        int lastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) str, ".", 0, false, 6, (Object) null);
        if (lastIndexOf$default >= 0) {
            str2 = str.substring(lastIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(str2, "substring(...)");
        } else {
            str2 = "";
        }
        StringBuilder sb2 = new StringBuilder();
        if (lastIndexOf$default < 0) {
            lastIndexOf$default = str.length();
        }
        String substring = str.substring(0, lastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        sb2.append(substring);
        sb2.append('/');
        sb2.append(size.b());
        sb2.append(str2);
        return sb2.toString();
    }
}
