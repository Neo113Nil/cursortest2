package androidx.credentials.provider;

import android.annotation.SuppressLint;
import android.app.slice.Slice;
import android.app.slice.SliceSpec;
import android.os.Build;
import android.os.Bundle;
import androidx.credentials.PasswordCredential;
import androidx.credentials.PublicKeyCredential;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.lhg;
import xsna.zcl;

/* compiled from: CredentialEntry.kt */
/* loaded from: classes12.dex */
public abstract class CredentialEntry {
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_CREDENTIAL_ENTRY_AFFILIATED_DOMAIN_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_ENTRY_AFFILIATED_DOMAIN_";
    public static final String EXTRA_CREDENTIAL_ENTRY_ENTRY_GROUP_ID_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_ENTRY_ENTRY_GROUP_ID_";
    public static final String EXTRA_CREDENTIAL_ENTRY_ENTRY_TYPE_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_ENTRY_TYPE_";
    public static final String EXTRA_CREDENTIAL_ENTRY_HAS_DEFAULT_ICON_PREFIX = "androidx.credentials.provider.extra.HAS_DEFAULT_ICON_";
    public static final String EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_FROM_OPTION_PREFIX = "androidx.credentials.provider.extra.IS_AUTO_SELECT_ALLOWED_FROM_OPTION_";
    public static final String EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_PREFIX = "androidx.credentials.provider.extra.IS_AUTO_SELECT_ALLOWED_";
    public static final String EXTRA_CREDENTIAL_ENTRY_IS_DEFAULT_ICON_PREFERRED_AS_SINGLE_PROV_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_ENTRY_IS_DEFAULT_ICON_PREFERRED_AS_SINGLE_PROV_";
    public static final String EXTRA_CREDENTIAL_ENTRY_LAST_USED_TIME_PREFIX = "androidx.credentials.provider.extra.LAST_USED_TIME_";
    public static final String EXTRA_CREDENTIAL_ENTRY_OPTION_DATA_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_DATA_";
    public static final String EXTRA_CREDENTIAL_ENTRY_OPTION_ID_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_ID_";
    public static final String EXTRA_CREDENTIAL_ENTRY_OPTION_TYPE_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_OPTION_TYPE_";
    public static final String EXTRA_CREDENTIAL_ENTRY_PENDING_INTENT_PREFIX = "androidx.credentials.provider.extra.PENDING_INTENT_";
    public static final String EXTRA_CREDENTIAL_ENTRY_SIZE = "androidx.credentials.provider.extra.CREDENTIAL_ENTRY_SIZE";
    public static final String EXTRA_CREDENTIAL_SUBTITLE_PREFIX = "androidx.credentials.provider.extra.SUBTITLE_";
    public static final String EXTRA_CREDENTIAL_TITLE_PREFIX = "androidx.credentials.provider.extra.TITLE_";
    public static final String EXTRA_CREDENTIAL_TYPE_DISPLAY_NAME_PREFIX = "androidx.credentials.provider.extra.TYPE_DISPLAY_NAME_";
    public static final String EXTRA_CREDENTIAL_TYPE_ICON_PREFIX = "androidx.credentials.provider.extra.ICON_";
    public static final String FALSE_STRING = "false";
    public static final int REVISION_ID = 1;
    public static final String SLICE_HINT_AFFILIATED_DOMAIN = "androidx.credentials.provider.credentialEntry.SLICE_HINT_AFFILIATED_DOMAIN";
    public static final String SLICE_HINT_ALLOWED_AUTHENTICATORS = "androidx.credentials.provider.credentialEntry.SLICE_HINT_ALLOWED_AUTHENTICATORS";
    public static final String SLICE_HINT_AUTO_ALLOWED = "androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_ALLOWED";
    public static final String SLICE_HINT_AUTO_SELECT_FROM_OPTION = "androidx.credentials.provider.credentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION";
    public static final String SLICE_HINT_BIOMETRIC_PROMPT_DATA = "androidx.credentials.provider.credentialEntry.SLICE_HINT_BIOMETRIC_PROMPT_DATA";
    public static final String SLICE_HINT_CRYPTO_OP_ID = "androidx.credentials.provider.credentialEntry.SLICE_HINT_CRYPTO_OP_ID";
    public static final String SLICE_HINT_DEDUPLICATION_ID = "androidx.credentials.provider.credentialEntry.SLICE_HINT_DEDUPLICATION_ID";
    public static final String SLICE_HINT_DEFAULT_ICON_RES_ID = "androidx.credentials.provider.credentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID";
    public static final String SLICE_HINT_ICON = "androidx.credentials.provider.credentialEntry.SLICE_HINT_PROFILE_ICON";
    public static final String SLICE_HINT_IS_DEFAULT_ICON_PREFERRED = "androidx.credentials.provider.credentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED";
    public static final String SLICE_HINT_LAST_USED_TIME_MILLIS = "androidx.credentials.provider.credentialEntry.SLICE_HINT_LAST_USED_TIME_MILLIS";
    public static final String SLICE_HINT_OPTION_ID = "androidx.credentials.provider.credentialEntry.SLICE_HINT_OPTION_ID";
    public static final String SLICE_HINT_PENDING_INTENT = "androidx.credentials.provider.credentialEntry.SLICE_HINT_PENDING_INTENT";
    public static final String SLICE_HINT_SUBTITLE = "androidx.credentials.provider.credentialEntry.SLICE_HINT_CREDENTIAL_TYPE_DISPLAY_NAME";
    public static final String SLICE_HINT_TITLE = "androidx.credentials.provider.credentialEntry.SLICE_HINT_USER_NAME";
    public static final String SLICE_HINT_TYPE_DISPLAY_NAME = "androidx.credentials.provider.credentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME";
    public static final String TRUE_STRING = "true";
    private final CharSequence affiliatedDomain;
    private final BeginGetCredentialOption beginGetCredentialOption;
    private final BiometricPromptData biometricPromptData;
    private final CharSequence entryGroupId;
    private final boolean isDefaultIconPreferredAsSingleProvider;
    private final String type;

    /* compiled from: CredentialEntry.kt */
    public static final class Api28Impl {
        public static final Api28Impl INSTANCE = new Api28Impl();

        private Api28Impl() {
        }

        @SuppressLint({"WrongConstant"})
        public static final CredentialEntry fromSlice(Slice slice) {
            try {
                SliceSpec spec = slice.getSpec();
                String type = spec != null ? spec.getType() : null;
                return epx.f(type, PasswordCredential.TYPE_PASSWORD_CREDENTIAL) ? PasswordCredentialEntry.Companion.fromSlice(slice) : epx.f(type, PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL) ? PublicKeyCredentialEntry.Companion.fromSlice(slice) : CustomCredentialEntry.Companion.fromSlice(slice);
            } catch (Exception unused) {
                return CustomCredentialEntry.Companion.fromSlice(slice);
            }
        }

        public static final Slice toSlice(CredentialEntry credentialEntry) {
            if (credentialEntry instanceof PasswordCredentialEntry) {
                return PasswordCredentialEntry.Companion.toSlice((PasswordCredentialEntry) credentialEntry);
            }
            if (credentialEntry instanceof PublicKeyCredentialEntry) {
                return PublicKeyCredentialEntry.Companion.toSlice((PublicKeyCredentialEntry) credentialEntry);
            }
            if (credentialEntry instanceof CustomCredentialEntry) {
                return CustomCredentialEntry.Companion.toSlice((CustomCredentialEntry) credentialEntry);
            }
            return null;
        }
    }

    /* compiled from: CredentialEntry.kt */
    public static final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        public static final CredentialEntry fromCredentialEntry(android.service.credentials.CredentialEntry credentialEntry) {
            return CredentialEntry.Companion.fromSlice$credentials_release(credentialEntry.getSlice());
        }
    }

    /* compiled from: CredentialEntry.kt */
    public static final class Api35Impl {
        public static final Api35Impl INSTANCE = new Api35Impl();

        private Api35Impl() {
        }

        @SuppressLint({"WrongConstant"})
        public static final CredentialEntry fromSlice(Slice slice) {
            try {
                SliceSpec spec = slice.getSpec();
                String type = spec != null ? spec.getType() : null;
                return epx.f(type, PasswordCredential.TYPE_PASSWORD_CREDENTIAL) ? PasswordCredentialEntry.Companion.fromSlice(slice) : epx.f(type, PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL) ? PublicKeyCredentialEntry.Companion.fromSlice(slice) : CustomCredentialEntry.Companion.fromSlice(slice);
            } catch (Exception unused) {
                return CustomCredentialEntry.Companion.fromSlice(slice);
            }
        }

        public static final Slice toSlice(CredentialEntry credentialEntry) {
            if (credentialEntry instanceof PasswordCredentialEntry) {
                return PasswordCredentialEntry.Companion.toSlice((PasswordCredentialEntry) credentialEntry);
            }
            if (credentialEntry instanceof PublicKeyCredentialEntry) {
                return PublicKeyCredentialEntry.Companion.toSlice((PublicKeyCredentialEntry) credentialEntry);
            }
            if (credentialEntry instanceof CustomCredentialEntry) {
                return CustomCredentialEntry.Companion.toSlice((CustomCredentialEntry) credentialEntry);
            }
            return null;
        }
    }

    /* compiled from: CredentialEntry.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final CredentialEntry fromCredentialEntry(android.service.credentials.CredentialEntry credentialEntry) {
            if (Build.VERSION.SDK_INT >= 34) {
                return Api34Impl.fromCredentialEntry(credentialEntry);
            }
            return null;
        }

        public final CredentialEntry fromSlice$credentials_release(Slice slice) {
            return Build.VERSION.SDK_INT >= 35 ? Api35Impl.fromSlice(slice) : Api28Impl.fromSlice(slice);
        }

        public final void marshall$credentials_release(List<? extends CredentialEntry> list, Bundle bundle) {
            bundle.putInt(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_SIZE, list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                CredentialEntry credentialEntry = list.get(i);
                if (credentialEntry instanceof PasswordCredentialEntry) {
                    PasswordCredentialEntry.Companion.marshall$credentials_release((PasswordCredentialEntry) credentialEntry, bundle, i);
                } else if (credentialEntry instanceof PublicKeyCredentialEntry) {
                    PublicKeyCredentialEntry.Companion.marshall$credentials_release((PublicKeyCredentialEntry) credentialEntry, bundle, i);
                } else if (credentialEntry instanceof CustomCredentialEntry) {
                    CustomCredentialEntry.Companion.marshall$credentials_release((CustomCredentialEntry) credentialEntry, bundle, i);
                }
            }
        }

        public final void marshallCommonProperties$credentials_release(CredentialEntry credentialEntry, Bundle bundle, int i) {
            bundle.putString(lhg.a(i, CredentialEntry.EXTRA_CREDENTIAL_ENTRY_ENTRY_TYPE_PREFIX), credentialEntry.getType());
            bundle.putString(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_OPTION_ID_PREFIX + i, credentialEntry.getBeginGetCredentialOption().getId());
            bundle.putString(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_OPTION_TYPE_PREFIX + i, credentialEntry.getBeginGetCredentialOption().getType());
            bundle.putBundle(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_OPTION_DATA_PREFIX + i, credentialEntry.getBeginGetCredentialOption().getCandidateQueryData());
            bundle.putCharSequence(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_ENTRY_GROUP_ID_PREFIX + i, credentialEntry.getEntryGroupId());
            bundle.putBoolean(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_IS_DEFAULT_ICON_PREFERRED_AS_SINGLE_PROV_PREFIX + i, credentialEntry.isDefaultIconPreferredAsSingleProvider());
            CharSequence affiliatedDomain = credentialEntry.getAffiliatedDomain();
            if (affiliatedDomain != null) {
                bundle.putCharSequence(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_AFFILIATED_DOMAIN_PREFIX + i, affiliatedDomain);
            }
        }

        public final Slice toSlice$credentials_release(CredentialEntry credentialEntry) {
            return Build.VERSION.SDK_INT >= 35 ? Api35Impl.toSlice(credentialEntry) : Api28Impl.toSlice(credentialEntry);
        }

        public final List<CredentialEntry> unmarshallCredentialEntries$credentials_release(Bundle bundle) {
            ArrayList arrayList = new ArrayList();
            int i = bundle.getInt(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_SIZE, 0);
            for (int i2 = 0; i2 < i; i2++) {
                String string = bundle.getString(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_ENTRY_TYPE_PREFIX + i2);
                if (string == null) {
                    return EmptyList.b;
                }
                Object unmarshall$credentials_release = string.equals(PasswordCredential.TYPE_PASSWORD_CREDENTIAL) ? PasswordCredentialEntry.Companion.unmarshall$credentials_release(bundle, i2) : string.equals(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL) ? PublicKeyCredentialEntry.Companion.unmarshall$credentials_release(bundle, i2) : CustomCredentialEntry.Companion.unmarshall$credentials_release(bundle, i2, string);
                if (unmarshall$credentials_release == null) {
                    return EmptyList.b;
                }
                arrayList.add(unmarshall$credentials_release);
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    public CredentialEntry(String str, BeginGetCredentialOption beginGetCredentialOption, CharSequence charSequence, boolean z, CharSequence charSequence2, BiometricPromptData biometricPromptData) {
        this.type = str;
        this.beginGetCredentialOption = beginGetCredentialOption;
        this.entryGroupId = charSequence;
        this.isDefaultIconPreferredAsSingleProvider = z;
        this.affiliatedDomain = charSequence2;
        this.biometricPromptData = biometricPromptData;
    }

    public static final CredentialEntry fromCredentialEntry(android.service.credentials.CredentialEntry credentialEntry) {
        return Companion.fromCredentialEntry(credentialEntry);
    }

    public final CharSequence getAffiliatedDomain() {
        return this.affiliatedDomain;
    }

    public final BeginGetCredentialOption getBeginGetCredentialOption() {
        return this.beginGetCredentialOption;
    }

    public final BiometricPromptData getBiometricPromptData() {
        return this.biometricPromptData;
    }

    public final CharSequence getEntryGroupId() {
        return this.entryGroupId;
    }

    public String getType() {
        return this.type;
    }

    public final boolean isDefaultIconPreferredAsSingleProvider() {
        return this.isDefaultIconPreferredAsSingleProvider;
    }

    public /* synthetic */ CredentialEntry(String str, BeginGetCredentialOption beginGetCredentialOption, CharSequence charSequence, boolean z, CharSequence charSequence2, BiometricPromptData biometricPromptData, int i, zcl zclVar) {
        this(str, beginGetCredentialOption, charSequence, z, (i & 16) != 0 ? null : charSequence2, (i & 32) != 0 ? null : biometricPromptData);
    }
}
