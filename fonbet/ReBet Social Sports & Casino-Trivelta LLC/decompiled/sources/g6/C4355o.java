package g6;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g6.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4355o extends C4357q {

    /* renamed from: d, reason: collision with root package name */
    public static final a f47104d = new a(null);
    public static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final int f47105b;

    /* renamed from: c, reason: collision with root package name */
    public final String f47106c;

    /* renamed from: g6.o$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public C4355o(String str, int i10, String str2) {
        super(str);
        this.f47105b = i10;
        this.f47106c = str2;
    }

    @Override // g6.C4357q, java.lang.Throwable
    public String toString() {
        String str = "{FacebookDialogException: errorCode: " + this.f47105b + ", message: " + getMessage() + ", url: " + this.f47106c + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder()\n        .append(\"{FacebookDialogException: \")\n        .append(\"errorCode: \")\n        .append(errorCode)\n        .append(\", message: \")\n        .append(message)\n        .append(\", url: \")\n        .append(failingUrl)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
