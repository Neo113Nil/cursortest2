package androidx.credentials.provider;

import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import java.security.PublicKey;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import xsna.epx;
import xsna.fw3;
import xsna.qoy;
import xsna.rl3;
import xsna.s3j0;
import xsna.zcl;

/* compiled from: SigningInfoCompat.kt */
/* loaded from: classes12.dex */
public final class SigningInfoCompat {
    public static final Companion Companion = new Companion(null);
    private final List<Signature> apkContentsSigners;
    private final boolean hasMultipleSigners;
    private final boolean hasPastSigningCertificates;
    private final Collection<PublicKey> publicKeys;
    private final int schemeVersion;
    private final List<Signature> signingCertificateHistory;

    /* compiled from: SigningInfoCompat.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final SigningInfoCompat fromSignatures(List<? extends Signature> list) {
            throw new IllegalArgumentException("Use SigningInfoCompat.fromSigningInfo(SigningInfo) instead");
        }

        public final SigningInfoCompat fromSigningInfo(SigningInfo signingInfo) {
            Collection collection;
            Signature[] apkContentsSigners = signingInfo.getApkContentsSigners();
            List I = apkContentsSigners != null ? rl3.I(apkContentsSigners) : EmptyList.b;
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                collection = signingInfo.getPublicKeys();
                if (collection == null) {
                    collection = EmptySet.b;
                }
            } else {
                collection = EmptySet.b;
            }
            Collection collection2 = collection;
            int schemeVersion = i >= 35 ? signingInfo.getSchemeVersion() : 0;
            Signature[] signingCertificateHistory = signingInfo.getSigningCertificateHistory();
            return new SigningInfoCompat(signingCertificateHistory != null ? rl3.I(signingCertificateHistory) : EmptyList.b, I, collection2, schemeVersion, signingInfo.hasPastSigningCertificates(), signingInfo.hasMultipleSigners());
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SigningInfoCompat(List<? extends Signature> list, List<? extends Signature> list2, Collection<? extends PublicKey> collection, int i, boolean z, boolean z2) {
        this.signingCertificateHistory = list;
        this.apkContentsSigners = list2;
        this.publicKeys = collection;
        this.schemeVersion = i;
        this.hasPastSigningCertificates = z;
        this.hasMultipleSigners = z2;
    }

    public static final SigningInfoCompat fromSignatures(List<? extends Signature> list) {
        return Companion.fromSignatures(list);
    }

    public static final SigningInfoCompat fromSigningInfo(SigningInfo signingInfo) {
        return Companion.fromSigningInfo(signingInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SigningInfoCompat)) {
            return false;
        }
        SigningInfoCompat signingInfoCompat = (SigningInfoCompat) obj;
        return epx.f(this.signingCertificateHistory, signingInfoCompat.signingCertificateHistory) && epx.f(this.apkContentsSigners, signingInfoCompat.apkContentsSigners) && epx.f(this.publicKeys, signingInfoCompat.publicKeys) && this.schemeVersion == signingInfoCompat.schemeVersion && this.hasPastSigningCertificates == signingInfoCompat.hasPastSigningCertificates && this.hasMultipleSigners == signingInfoCompat.hasMultipleSigners;
    }

    public final List<Signature> getApkContentsSigners() {
        return this.apkContentsSigners;
    }

    public final Collection<PublicKey> getPublicKeys() {
        return this.publicKeys;
    }

    public final int getSchemeVersion() {
        return this.schemeVersion;
    }

    public final List<Signature> getSigningCertificateHistory() {
        return this.signingCertificateHistory;
    }

    public final boolean hasMultipleSigners() {
        return this.hasMultipleSigners;
    }

    public final boolean hasPastSigningCertificates() {
        return this.hasPastSigningCertificates;
    }

    public int hashCode() {
        return Boolean.hashCode(this.hasMultipleSigners) + qoy.b((s3j0.a(fw3.a(this.signingCertificateHistory.hashCode() * 31, 31, this.apkContentsSigners), this.publicKeys, 31) + this.schemeVersion) * 31, 31, this.hasPastSigningCertificates);
    }
}
