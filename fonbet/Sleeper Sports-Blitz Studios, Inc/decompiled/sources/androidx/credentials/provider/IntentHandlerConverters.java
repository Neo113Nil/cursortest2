package androidx.credentials.provider;

import android.content.Intent;
import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialResponse;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import androidx.credentials.provider.utils.BeginGetCredentialUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntentHandlerConverters.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u0002H\u0007\u001a\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u0006*\u00020\u0002H\u0007\u001a\u000e\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\u0002H\u0007\u001a\u000e\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u0002H\u0007¨\u0006\u000b"}, d2 = {"getBeginGetResponse", "Landroidx/credentials/provider/BeginGetCredentialResponse;", "Landroid/content/Intent;", "getCreateCredentialCredentialResponse", "Landroid/credentials/CreateCredentialResponse;", "getCreateCredentialException", "Landroid/credentials/CreateCredentialException;", "getGetCredentialException", "Landroid/credentials/GetCredentialException;", "getGetCredentialResponse", "Landroid/credentials/GetCredentialResponse;", "credentials_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IntentHandlerConverters {
    public static final CreateCredentialException getCreateCredentialException(Intent intent) {
        Object parcelableExtra;
        Intrinsics.checkNotNullParameter(intent, "<this>");
        if (!intent.hasExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION")) {
            return null;
        }
        parcelableExtra = intent.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION", Action$Companion$$ExternalSyntheticApiModelOutline0.m$2());
        return Action$Companion$$ExternalSyntheticApiModelOutline0.m9203m(parcelableExtra);
    }

    public static final GetCredentialException getGetCredentialException(Intent intent) {
        Object parcelableExtra;
        Intrinsics.checkNotNullParameter(intent, "<this>");
        if (!intent.hasExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION")) {
            return null;
        }
        parcelableExtra = intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION", Action$Companion$$ExternalSyntheticApiModelOutline0.m$3());
        return Action$Companion$$ExternalSyntheticApiModelOutline0.m9209m(parcelableExtra);
    }

    public static final BeginGetCredentialResponse getBeginGetResponse(Intent intent) {
        Object parcelableExtra;
        Intrinsics.checkNotNullParameter(intent, "<this>");
        if (!intent.hasExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_RESPONSE")) {
            return null;
        }
        parcelableExtra = intent.getParcelableExtra("android.service.credentials.extra.BEGIN_GET_CREDENTIAL_RESPONSE", Action$Companion$$ExternalSyntheticApiModelOutline0.m$1());
        android.service.credentials.BeginGetCredentialResponse m9215m = Action$Companion$$ExternalSyntheticApiModelOutline0.m9215m(parcelableExtra);
        if (m9215m == null) {
            return null;
        }
        return BeginGetCredentialUtil.INSTANCE.convertToJetpackResponse(m9215m);
    }

    public static final GetCredentialResponse getGetCredentialResponse(Intent intent) {
        Object parcelableExtra;
        Intrinsics.checkNotNullParameter(intent, "<this>");
        if (!intent.hasExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE")) {
            return null;
        }
        parcelableExtra = intent.getParcelableExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE", Action$Companion$$ExternalSyntheticApiModelOutline0.m9219m());
        return Action$Companion$$ExternalSyntheticApiModelOutline0.m9212m(parcelableExtra);
    }

    public static final CreateCredentialResponse getCreateCredentialCredentialResponse(Intent intent) {
        Object parcelableExtra;
        Intrinsics.checkNotNullParameter(intent, "<this>");
        if (!intent.hasExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE")) {
            return null;
        }
        parcelableExtra = intent.getParcelableExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE", Action$Companion$$ExternalSyntheticApiModelOutline0.m$4());
        return Action$Companion$$ExternalSyntheticApiModelOutline0.m9205m(parcelableExtra);
    }
}
