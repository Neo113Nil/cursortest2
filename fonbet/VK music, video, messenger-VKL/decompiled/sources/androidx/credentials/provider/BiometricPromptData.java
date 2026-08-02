package androidx.credentials.provider;

import android.os.Build;
import android.os.Bundle;
import androidx.credentials.provider.utils.CryptoObjectUtils;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.Set;
import xsna.e57;
import xsna.rl3;
import xsna.zcl;

/* compiled from: BiometricPromptData.kt */
/* loaded from: classes12.dex */
public final class BiometricPromptData {
    public static final String BUNDLE_HINT_ALLOWED_AUTHENTICATORS = "androidx.credentials.provider.BUNDLE_HINT_ALLOWED_AUTHENTICATORS";
    public static final String BUNDLE_HINT_CRYPTO_OP_ID = "androidx.credentials.provider.BUNDLE_HINT_CRYPTO_OP_ID";
    private static final String TAG = "BiometricPromptData";
    private final int allowedAuthenticators;
    private final e57.c cryptoObject;
    private boolean isCreatedFromBundle;
    public static final Companion Companion = new Companion(null);
    private static final Set<Integer> ALLOWED_AUTHENTICATOR_VALUES = rl3.y0(new Integer[]{15, 255, 32768, 32783, 33023});

    /* compiled from: BiometricPromptData.kt */
    public static final class Api35Impl {
        public static final Api35Impl INSTANCE = new Api35Impl();

        private Api35Impl() {
        }

        public static final BiometricPromptData fromBundle(Bundle bundle) {
            return new BiometricPromptData(null, bundle.getInt(BiometricPromptData.BUNDLE_HINT_ALLOWED_AUTHENTICATORS), true);
        }

        public static final Bundle toBundle(BiometricPromptData biometricPromptData) {
            Bundle bundle = new Bundle();
            bundle.putInt(BiometricPromptData.BUNDLE_HINT_ALLOWED_AUTHENTICATORS, biometricPromptData.getAllowedAuthenticators());
            if (biometricPromptData.getCryptoObject() != null) {
                bundle.putLong(BiometricPromptData.BUNDLE_HINT_CRYPTO_OP_ID, CryptoObjectUtils.INSTANCE.getOperationHandle(biometricPromptData.getCryptoObject()));
            }
            return bundle;
        }
    }

    /* compiled from: BiometricPromptData.kt */
    public static final class ApiMinImpl {
        public static final ApiMinImpl INSTANCE = new ApiMinImpl();

        private ApiMinImpl() {
        }

        public static final BiometricPromptData fromBundle(Bundle bundle) {
            return new BiometricPromptData(null, bundle.getInt(BiometricPromptData.BUNDLE_HINT_ALLOWED_AUTHENTICATORS), true, 1, null);
        }

        public static final Bundle toBundle(BiometricPromptData biometricPromptData) {
            Bundle bundle = new Bundle();
            bundle.putInt(BiometricPromptData.BUNDLE_HINT_ALLOWED_AUTHENTICATORS, biometricPromptData.getAllowedAuthenticators());
            return bundle;
        }
    }

    /* compiled from: BiometricPromptData.kt */
    public static final class Builder {
        private Integer allowedAuthenticators;
        private e57.c cryptoObject;

        public final BiometricPromptData build() {
            Integer num = this.allowedAuthenticators;
            return new BiometricPromptData(this.cryptoObject, num != null ? num.intValue() : 255);
        }

        public final Builder setAllowedAuthenticators(int i) {
            this.allowedAuthenticators = Integer.valueOf(i);
            return this;
        }

        public final Builder setCryptoObject(e57.c cVar) {
            this.cryptoObject = cVar;
            return this;
        }
    }

    /* compiled from: BiometricPromptData.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isStrongAuthenticationType(Integer num) {
            return num != null && (num.intValue() & PsExtractor.VIDEO_STREAM_MASK) == 0;
        }

        public final BiometricPromptData fromBundle(Bundle bundle) {
            try {
                if (bundle.containsKey(BiometricPromptData.BUNDLE_HINT_ALLOWED_AUTHENTICATORS)) {
                    return Build.VERSION.SDK_INT >= 35 ? Api35Impl.fromBundle(bundle) : ApiMinImpl.fromBundle(bundle);
                }
                throw new IllegalArgumentException("Bundle lacks allowed authenticator key.");
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        public final Bundle toBundle(BiometricPromptData biometricPromptData) {
            return Build.VERSION.SDK_INT >= 35 ? Api35Impl.toBundle(biometricPromptData) : ApiMinImpl.toBundle(biometricPromptData);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BiometricPromptData() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public static final BiometricPromptData fromBundle(Bundle bundle) {
        return Companion.fromBundle(bundle);
    }

    public static final Bundle toBundle(BiometricPromptData biometricPromptData) {
        return Companion.toBundle(biometricPromptData);
    }

    public final int getAllowedAuthenticators() {
        return this.allowedAuthenticators;
    }

    public final e57.c getCryptoObject() {
        return this.cryptoObject;
    }

    public BiometricPromptData(e57.c cVar) {
        this(cVar, 0, 2, null);
    }

    public BiometricPromptData(e57.c cVar, int i, boolean z) {
        this.cryptoObject = cVar;
        this.allowedAuthenticators = i;
        this.isCreatedFromBundle = z;
        if (!z && !ALLOWED_AUTHENTICATOR_VALUES.contains(Integer.valueOf(i))) {
            throw new IllegalArgumentException("The allowed authenticator must be specified according to the BiometricPrompt spec.");
        }
        if (cVar != null && !Companion.isStrongAuthenticationType(Integer.valueOf(i))) {
            throw new IllegalArgumentException("If the cryptoObject is non-null, the allowedAuthenticator value must be Authenticators.BIOMETRIC_STRONG.");
        }
    }

    public /* synthetic */ BiometricPromptData(e57.c cVar, int i, boolean z, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? null : cVar, (i2 & 2) != 0 ? 255 : i, (i2 & 4) != 0 ? false : z);
    }

    public /* synthetic */ BiometricPromptData(e57.c cVar, int i, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? null : cVar, (i2 & 2) != 0 ? 255 : i);
    }

    public BiometricPromptData(e57.c cVar, int i) {
        this(cVar, i, false);
    }
}
