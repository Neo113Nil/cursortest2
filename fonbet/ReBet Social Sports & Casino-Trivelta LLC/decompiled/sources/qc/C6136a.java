package qc;

import com.google.android.gms.auth.api.signin.GoogleSignInStatusCodes;
import com.google.android.gms.common.api.q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* renamed from: qc.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6136a {

    /* renamed from: a, reason: collision with root package name */
    public String f63451a;

    /* renamed from: b, reason: collision with root package name */
    public String f63452b;

    public C6136a(Exception e10, String str) {
        String statusCodeString;
        Intrinsics.checkNotNullParameter(e10, "e");
        String localizedMessage = e10.getLocalizedMessage();
        localizedMessage = localizedMessage == null ? e10.getMessage() : localizedMessage;
        if (!(e10 instanceof com.google.android.gms.common.api.b)) {
            if (!(e10 instanceof q)) {
                this.f63451a = str;
                this.f63452b = localizedMessage;
                return;
            }
            this.f63451a = str;
            this.f63452b = localizedMessage + " Make sure you have the latest version of Google Play Services installed.";
            return;
        }
        com.google.android.gms.common.api.b bVar = (com.google.android.gms.common.api.b) e10;
        int statusCode = bVar.getStatusCode();
        if (localizedMessage == null || localizedMessage.length() <= 10 || localizedMessage == null) {
            statusCodeString = GoogleSignInStatusCodes.getStatusCodeString(statusCode);
            Intrinsics.checkNotNullExpressionValue(statusCodeString, "getStatusCodeString(...)");
        } else {
            statusCodeString = new Regex(statusCode + ": ").replaceFirst(localizedMessage, "");
        }
        this.f63451a = String.valueOf((statusCode == 12501 || bVar.getStatus().isCanceled()) ? 12501 : statusCode);
        this.f63452b = statusCodeString;
    }

    public final String a() {
        return this.f63451a;
    }

    public final String b() {
        return this.f63452b;
    }
}
