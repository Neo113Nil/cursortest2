package androidx.credentials.provider;

import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Bundle;
import androidx.credentials.provider.utils.PrivilegedApp;
import androidx.credentials.provider.utils.RequestValidationUtil;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.epx;
import xsna.izs;
import xsna.j5g;
import xsna.rl3;
import xsna.zcl;

/* compiled from: CallingAppInfo.kt */
/* loaded from: classes12.dex */
public final class CallingAppInfo {
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_CREDENTIAL_REQUEST_ORIGIN = "androidx.credentials.provider.extra.CREDENTIAL_REQUEST_ORIGIN";
    private static final String EXTRA_CREDENTIAL_REQUEST_PACKAGE_NAME = "androidx.credentials.provider.extra.CREDENTIAL_REQUEST_PACKAGE_NAME";
    private static final String EXTRA_CREDENTIAL_REQUEST_SIGNATURES = "androidx.credentials.provider.extra.CREDENTIAL_REQUEST_SIGNATURES";
    private static final String EXTRA_CREDENTIAL_REQUEST_SIGNING_INFO = "androidx.credentials.provider.extra.CREDENTIAL_REQUEST_SIGNING_INFO";
    private final String origin;
    private final String packageName;
    private SigningInfo signingInfo;
    private final SigningInfoCompat signingInfoCompat;

    /* compiled from: CallingAppInfo.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public static /* synthetic */ CallingAppInfo create$default(Companion companion, String str, SigningInfo signingInfo, String str2, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            return companion.create(str, signingInfo, str2);
        }

        public final CallingAppInfo create(String str, SigningInfo signingInfo, String str2) {
            return new CallingAppInfo(str, signingInfo, str2);
        }

        public final CallingAppInfo extractCallingAppInfo$credentials_release(Bundle bundle) {
            SigningInfo signingInfo;
            String string = bundle.getString(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_ORIGIN);
            String string2 = bundle.getString(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_PACKAGE_NAME);
            if (string2 == null || (signingInfo = (SigningInfo) bundle.getParcelable(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_SIGNING_INFO)) == null) {
                return null;
            }
            return create(string2, signingInfo, string);
        }

        public final void setCallingAppInfo$credentials_release(Bundle bundle, CallingAppInfo callingAppInfo) {
            bundle.putString(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_ORIGIN, callingAppInfo.getOrigin$credentials_release());
            bundle.putString(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_PACKAGE_NAME, callingAppInfo.getPackageName());
            bundle.putParcelable(CallingAppInfo.EXTRA_CREDENTIAL_REQUEST_SIGNING_INFO, callingAppInfo.getSigningInfo());
        }

        private Companion() {
        }

        public static /* synthetic */ CallingAppInfo create$default(Companion companion, String str, List list, String str2, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            return companion.create(str, (List<? extends Signature>) list, str2);
        }

        public final CallingAppInfo create(String str, List<? extends Signature> list, String str2) {
            return new CallingAppInfo(str, list, str2);
        }
    }

    /* compiled from: CallingAppInfo.kt */
    public static final class SignatureVerifier {
        private final SigningInfoCompat signingInfoCompat;

        public SignatureVerifier(SigningInfoCompat signingInfoCompat) {
            this.signingInfoCompat = signingInfoCompat;
        }

        private final Set<String> convertToFingerprints(List<? extends Signature> list) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<? extends Signature> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(rl3.Y(MessageDigest.getInstance("SHA-256").digest(it.next().toByteArray()), StringUtils.PROCESS_POSTFIX_DELIMITER, new izs<Byte, CharSequence>() { // from class: androidx.credentials.provider.CallingAppInfo$SignatureVerifier$convertToFingerprints$1
                    public final CharSequence invoke(byte b) {
                        return String.format("%02X", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
                    }

                    @Override // xsna.izs
                    public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
                        return invoke(b.byteValue());
                    }
                }, 30));
            }
            return linkedHashSet;
        }

        private final Set<String> getSignatureFingerprints() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            List<Signature> apkContentsSigners = this.signingInfoCompat.getApkContentsSigners();
            if (this.signingInfoCompat.hasMultipleSigners() && !apkContentsSigners.isEmpty()) {
                linkedHashSet.addAll(convertToFingerprints(apkContentsSigners));
                return linkedHashSet;
            }
            if (!this.signingInfoCompat.getSigningCertificateHistory().isEmpty()) {
                linkedHashSet.addAll(convertToFingerprints(Collections.singletonList(this.signingInfoCompat.getSigningCertificateHistory().get(0))));
            }
            return linkedHashSet;
        }

        public final boolean verifySignatureFingerprints(Set<String> set) {
            Set<String> signatureFingerprints = getSignatureFingerprints();
            return this.signingInfoCompat.hasMultipleSigners() ? set.containsAll(signatureFingerprints) : !j5g.d0(set, signatureFingerprints).isEmpty();
        }
    }

    public CallingAppInfo(String str, SigningInfo signingInfo) {
        this(str, signingInfo, (String) null, 4, (zcl) null);
    }

    private final boolean isAppPrivileged(List<PrivilegedApp> list) {
        for (PrivilegedApp privilegedApp : list) {
            if (epx.f(privilegedApp.getPackageName(), this.packageName)) {
                return isAppPrivileged(privilegedApp.getFingerprints());
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CallingAppInfo)) {
            return false;
        }
        CallingAppInfo callingAppInfo = (CallingAppInfo) obj;
        return epx.f(this.packageName, callingAppInfo.packageName) && epx.f(this.origin, callingAppInfo.origin) && epx.f(this.signingInfoCompat, callingAppInfo.signingInfoCompat);
    }

    public final String getOrigin(String str) {
        if (!RequestValidationUtil.Companion.isValidJSON(str)) {
            throw new IllegalArgumentException("privilegedAllowlist must not be empty, and must be a valid JSON");
        }
        String str2 = this.origin;
        if (str2 == null) {
            return str2;
        }
        try {
            if (isAppPrivileged(PrivilegedApp.Companion.extractPrivilegedApps$credentials_release(new JSONObject(str)))) {
                return this.origin;
            }
            throw new IllegalStateException("Origin is not being returned as the calling app did notmatch the privileged allowlist");
        } catch (JSONException unused) {
            throw new IllegalArgumentException("privilegedAllowlist must be formatted properly");
        }
    }

    public final String getOrigin$credentials_release() {
        return this.origin;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final SigningInfo getSigningInfo() {
        SigningInfo signingInfo = this.signingInfo;
        if (signingInfo != null) {
            return signingInfo;
        }
        return null;
    }

    public final SigningInfoCompat getSigningInfoCompat() {
        return this.signingInfoCompat;
    }

    public int hashCode() {
        int hashCode = this.packageName.hashCode() * 31;
        String str = this.origin;
        return this.signingInfoCompat.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final boolean isOriginPopulated() {
        return this.origin != null;
    }

    public CallingAppInfo(String str, List<? extends Signature> list) {
        this(str, list, (String) null, 4, (zcl) null);
    }

    private CallingAppInfo(String str, String str2, SigningInfoCompat signingInfoCompat, SigningInfo signingInfo) {
        this.packageName = str;
        this.origin = str2;
        this.signingInfoCompat = signingInfoCompat;
        this.signingInfo = signingInfo;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("packageName must not be empty");
        }
    }

    private final boolean isAppPrivileged(Set<String> set) {
        return new SignatureVerifier(this.signingInfoCompat).verifySignatureFingerprints(set);
    }

    public /* synthetic */ CallingAppInfo(String str, SigningInfo signingInfo, String str2, int i, zcl zclVar) {
        this(str, signingInfo, (i & 4) != 0 ? null : str2);
    }

    public CallingAppInfo(String str, SigningInfo signingInfo, String str2) {
        this(str, str2, SigningInfoCompat.Companion.fromSigningInfo(signingInfo), signingInfo);
    }

    public /* synthetic */ CallingAppInfo(String str, List list, String str2, int i, zcl zclVar) {
        this(str, (List<? extends Signature>) list, (i & 4) != 0 ? null : str2);
    }

    public CallingAppInfo(String str, List<? extends Signature> list, String str2) {
        this(str, str2, SigningInfoCompat.Companion.fromSignatures(list), null);
    }
}
