package com.facebook;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class r extends q {
    public final g0 b;

    public r(g0 g0Var, String str) {
        super(str);
        this.b = g0Var;
    }

    @Override // com.facebook.q, java.lang.Throwable
    public final String toString() {
        g0 g0Var = this.b;
        FacebookRequestError facebookRequestError = g0Var != null ? g0Var.c : null;
        StringBuilder sb = new StringBuilder("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(" ");
        }
        if (facebookRequestError != null) {
            sb.append("httpResponseCode: ");
            sb.append(facebookRequestError.a);
            sb.append(", facebookErrorCode: ");
            sb.append(facebookRequestError.b);
            sb.append(", facebookErrorType: ");
            sb.append(facebookRequestError.d);
            sb.append(", message: ");
            sb.append(facebookRequestError.a());
            sb.append("}");
        }
        return sb.toString();
    }
}
