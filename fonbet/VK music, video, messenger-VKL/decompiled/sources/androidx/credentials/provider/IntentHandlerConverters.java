package androidx.credentials.provider;

import android.content.Intent;
import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import androidx.credentials.provider.utils.BeginGetCredentialUtil;
import xsna.e92;
import xsna.f92;
import xsna.h92;
import xsna.i92;
import xsna.ia1;
import xsna.la1;
import xsna.na1;
import xsna.oa1;
import xsna.v92;
import xsna.w92;

/* compiled from: IntentHandlerConverters.kt */
/* loaded from: classes12.dex */
public final class IntentHandlerConverters {
    public static final BeginGetCredentialResponse getBeginGetResponse(Intent intent) {
        Object parcelableExtra;
        if (!intent.hasExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_RESPONSE")) {
            return null;
        }
        parcelableExtra = intent.getParcelableExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_RESPONSE", la1.j());
        android.service.credentials.BeginGetCredentialResponse d = na1.d(parcelableExtra);
        if (d == null) {
            return null;
        }
        return BeginGetCredentialUtil.Companion.convertToJetpackResponse(d);
    }

    public static final CreateCredentialResponse getCreateCredentialCredentialResponse(Intent intent) {
        Object parcelableExtra;
        if (!intent.hasExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE")) {
            return null;
        }
        parcelableExtra = intent.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE", ia1.e());
        return v92.b(parcelableExtra);
    }

    public static final CreateCredentialException getCreateCredentialException(Intent intent) {
        Object parcelableExtra;
        if (!intent.hasExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION")) {
            return null;
        }
        parcelableExtra = intent.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION", oa1.d());
        return h92.a(parcelableExtra);
    }

    public static final GetCredentialException getGetCredentialException(Intent intent) {
        Object parcelableExtra;
        if (!intent.hasExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION")) {
            return null;
        }
        parcelableExtra = intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", i92.g());
        return f92.c(parcelableExtra);
    }

    public static final GetCredentialResponse getGetCredentialResponse(Intent intent) {
        Object parcelableExtra;
        if (!intent.hasExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE")) {
            return null;
        }
        parcelableExtra = intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", e92.d());
        return w92.a(parcelableExtra);
    }
}
