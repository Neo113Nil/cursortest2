package g6;

import com.facebook.FacebookRequestError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g6.E, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4333E extends C4357q {

    /* renamed from: c, reason: collision with root package name */
    public static final a f46946c = new a(null);
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final FacebookRequestError f46947b;

    /* renamed from: g6.E$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4333E(FacebookRequestError requestError, String str) {
        super(str);
        Intrinsics.checkNotNullParameter(requestError, "requestError");
        this.f46947b = requestError;
    }

    public final FacebookRequestError c() {
        return this.f46947b;
    }

    @Override // g6.C4357q, java.lang.Throwable
    public String toString() {
        String str = "{FacebookServiceException: httpResponseCode: " + this.f46947b.getRequestStatusCode() + ", facebookErrorCode: " + this.f46947b.getErrorCode() + ", facebookErrorType: " + this.f46947b.getErrorType() + ", message: " + this.f46947b.d() + "}";
        Intrinsics.checkNotNullExpressionValue(str, "StringBuilder()\n        .append(\"{FacebookServiceException: \")\n        .append(\"httpResponseCode: \")\n        .append(requestError.requestStatusCode)\n        .append(\", facebookErrorCode: \")\n        .append(requestError.errorCode)\n        .append(\", facebookErrorType: \")\n        .append(requestError.errorType)\n        .append(\", message: \")\n        .append(requestError.errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
