package g6;

import com.facebook.FacebookRequestError;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class r extends C4357q {

    /* renamed from: b, reason: collision with root package name */
    public final C4339K f47109b;

    public r(C4339K c4339k, String str) {
        super(str);
        this.f47109b = c4339k;
    }

    @Override // g6.C4357q, java.lang.Throwable
    public String toString() {
        C4339K c4339k = this.f47109b;
        FacebookRequestError b10 = c4339k == null ? null : c4339k.b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb2.append(message);
            sb2.append(" ");
        }
        if (b10 != null) {
            sb2.append("httpResponseCode: ");
            sb2.append(b10.getRequestStatusCode());
            sb2.append(", facebookErrorCode: ");
            sb2.append(b10.getErrorCode());
            sb2.append(", facebookErrorType: ");
            sb2.append(b10.getErrorType());
            sb2.append(", message: ");
            sb2.append(b10.d());
            sb2.append("}");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "errorStringBuilder.toString()");
        return sb3;
    }
}
