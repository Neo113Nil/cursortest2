package com.facebook;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class x extends q {
    public final FacebookRequestError b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(FacebookRequestError facebookRequestError, String str) {
        super(str);
        facebookRequestError.getClass();
        this.b = facebookRequestError;
    }

    @Override // com.facebook.q, java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder("{FacebookServiceException: httpResponseCode: ");
        FacebookRequestError facebookRequestError = this.b;
        sb.append(facebookRequestError.a);
        sb.append(", facebookErrorCode: ");
        sb.append(facebookRequestError.b);
        sb.append(", facebookErrorType: ");
        sb.append(facebookRequestError.d);
        sb.append(", message: ");
        sb.append(facebookRequestError.a());
        sb.append("}");
        return sb.toString();
    }
}
