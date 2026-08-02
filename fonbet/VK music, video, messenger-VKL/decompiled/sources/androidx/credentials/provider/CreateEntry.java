package androidx.credentials.provider;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.app.slice.SliceSpec;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.credentials.PasswordCredential;
import androidx.credentials.PublicKeyCredential;
import androidx.credentials.provider.utils.CryptoObjectUtils;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.e43;
import xsna.epx;
import xsna.lhg;
import xsna.pn00;
import xsna.ttp0;
import xsna.zcl;

/* compiled from: CreateEntry.kt */
/* loaded from: classes12.dex */
public final class CreateEntry {
    private static final String AUTO_SELECT_FALSE_STRING = "false";
    private static final String AUTO_SELECT_TRUE_STRING = "true";
    public static final Companion Companion = new Companion(null);
    private static final int DESCRIPTION_MAX_CHAR_LIMIT = 300;
    private static final String EXTRA_CREATE_ACCOUNT_NAME_PREFIX = "androidx.credentials.provider.extra.ACCOUNT_NAME_";
    private static final String EXTRA_CREATE_CREDENTIAL_COUNT_INFO_PREFIX = "androidx.credentials.provider.extra.CREDENTIAL_COUNT_INFO_";
    private static final String EXTRA_CREATE_DESCRIPTION_PREFIX = "androidx.credentials.provider.extra.DESCRIPTION_";
    private static final String EXTRA_CREATE_ENTRY_IS_AUTO_SELECT_ALLOWED_PREFIX = "androidx.credentials.provider.extra.IS_AUTO_SELECT_ALLOWED_";
    private static final String EXTRA_CREATE_ENTRY_LAST_USED_TIME_PREFIX = "androidx.credentials.provider.extra.LAST_USED_TIME_";
    private static final String EXTRA_CREATE_ENTRY_PENDING_INTENT_PREFIX = "androidx.credentials.provider.extra.PENDING_INTENT_";
    private static final String EXTRA_CREATE_ENTRY_SIZE = "androidx.credentials.provider.extra.CREATE_ENTRY_SIZE";
    private static final String EXTRA_CREATE_TYPE_ICON_PREFIX = "androidx.credentials.provider.extra.ICON_";
    private static final int REVISION_ID = 1;
    private static final String SLICE_HINT_ACCOUNT_NAME = "androidx.credentials.provider.createEntry.SLICE_HINT_USER_PROVIDER_ACCOUNT_NAME";
    private static final String SLICE_HINT_ALLOWED_AUTHENTICATORS = "androidx.credentials.provider.createEntry.SLICE_HINT_ALLOWED_AUTHENTICATORS";
    private static final String SLICE_HINT_AUTO_SELECT_ALLOWED = "androidx.credentials.provider.createEntry.SLICE_HINT_AUTO_SELECT_ALLOWED";
    private static final String SLICE_HINT_BIOMETRIC_PROMPT_DATA = "androidx.credentials.provider.createEntry.SLICE_HINT_BIOMETRIC_PROMPT_DATA";
    private static final String SLICE_HINT_CREDENTIAL_COUNT_INFORMATION = "androidx.credentials.provider.createEntry.SLICE_HINT_CREDENTIAL_COUNT_INFORMATION";
    private static final String SLICE_HINT_CRYPTO_OP_ID = "androidx.credentials.provider.createEntry.SLICE_HINT_CRYPTO_OP_ID";
    private static final String SLICE_HINT_ICON = "androidx.credentials.provider.createEntry.SLICE_HINT_PROFILE_ICON";
    private static final String SLICE_HINT_LAST_USED_TIME_MILLIS = "androidx.credentials.provider.createEntry.SLICE_HINT_LAST_USED_TIME_MILLIS";
    private static final String SLICE_HINT_NOTE = "androidx.credentials.provider.createEntry.SLICE_HINT_NOTE";
    private static final String SLICE_HINT_PENDING_INTENT = "androidx.credentials.provider.createEntry.SLICE_HINT_PENDING_INTENT";
    private static final String SLICE_SPEC_TYPE = "CreateEntry";
    private static final String TAG = "CreateEntry";
    public static final String TYPE_TOTAL_CREDENTIAL = "TOTAL_CREDENTIAL_COUNT_TYPE";
    private final CharSequence accountName;
    private final BiometricPromptData biometricPromptData;
    private final Map<String, Integer> credentialCountInformationMap;
    private final CharSequence description;
    private final Icon icon;
    private final boolean isAutoSelectAllowed;
    private final Instant lastUsedTime;
    private final PendingIntent pendingIntent;

    /* compiled from: CreateEntry.kt */
    public static final class Api28Impl {
        public static final Api28Impl INSTANCE = new Api28Impl();

        private Api28Impl() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v7, types: [java.util.Map] */
        @SuppressLint({"WrongConstant"})
        public static final CreateEntry fromSlice(Slice slice) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            CharSequence charSequence = null;
            PendingIntent pendingIntent = null;
            Icon icon = null;
            CharSequence charSequence2 = null;
            Instant instant = null;
            boolean z = false;
            for (SliceItem sliceItem : slice.getItems()) {
                if (sliceItem.hasHint(CreateEntry.SLICE_HINT_ACCOUNT_NAME)) {
                    charSequence = sliceItem.getText();
                } else if (sliceItem.hasHint(CreateEntry.SLICE_HINT_ICON)) {
                    icon = sliceItem.getIcon();
                } else if (sliceItem.hasHint(CreateEntry.SLICE_HINT_PENDING_INTENT)) {
                    pendingIntent = sliceItem.getAction();
                } else if (sliceItem.hasHint(CreateEntry.SLICE_HINT_CREDENTIAL_COUNT_INFORMATION)) {
                    linkedHashMap2 = ttp0.c(CreateEntry.Companion.convertBundleToCredentialCountInfo$credentials_release(sliceItem.getBundle()));
                } else if (sliceItem.hasHint(CreateEntry.SLICE_HINT_LAST_USED_TIME_MILLIS)) {
                    instant = Instant.ofEpochMilli(sliceItem.getLong());
                } else if (sliceItem.hasHint(CreateEntry.SLICE_HINT_NOTE)) {
                    charSequence2 = sliceItem.getText();
                } else if (sliceItem.hasHint(CreateEntry.SLICE_HINT_LAST_USED_TIME_MILLIS)) {
                    instant = Instant.ofEpochMilli(sliceItem.getLong());
                } else if (sliceItem.hasHint(CreateEntry.SLICE_HINT_AUTO_SELECT_ALLOWED) && epx.f(sliceItem.getText(), "true")) {
                    z = true;
                }
            }
            try {
                return new CreateEntry(charSequence, pendingIntent, icon, charSequence2, instant, linkedHashMap2, z, (BiometricPromptData) null, 128, (zcl) null);
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        public static final Slice toSlice(CreateEntry createEntry) {
            return INSTANCE.addToSlice(createEntry).build();
        }

        public final Slice.Builder addToSlice(CreateEntry createEntry) {
            CharSequence accountName = createEntry.getAccountName();
            Icon icon = createEntry.getIcon();
            CharSequence description = createEntry.getDescription();
            Instant lastUsedTime = createEntry.getLastUsedTime();
            Map<String, Integer> map = createEntry.credentialCountInformationMap;
            PendingIntent pendingIntent = createEntry.getPendingIntent();
            Slice.Builder builder = new Slice.Builder(Uri.EMPTY, new SliceSpec("CreateEntry", 1));
            String str = createEntry.isAutoSelectAllowed() ? "true" : "false";
            builder.addText(accountName, null, Collections.singletonList(CreateEntry.SLICE_HINT_ACCOUNT_NAME));
            if (lastUsedTime != null) {
                builder.addLong(lastUsedTime.toEpochMilli(), null, Collections.singletonList(CreateEntry.SLICE_HINT_LAST_USED_TIME_MILLIS));
            }
            if (description != null) {
                builder.addText(description, null, Collections.singletonList(CreateEntry.SLICE_HINT_NOTE));
            }
            if (icon != null) {
                builder.addIcon(icon, null, Collections.singletonList(CreateEntry.SLICE_HINT_ICON));
            }
            Companion companion = CreateEntry.Companion;
            if (companion.convertCredentialCountInfoToBundle$credentials_release(map) != null) {
                builder.addBundle(companion.convertCredentialCountInfoToBundle$credentials_release(map), null, Collections.singletonList(CreateEntry.SLICE_HINT_CREDENTIAL_COUNT_INFORMATION));
            }
            builder.addAction(pendingIntent, new Slice.Builder(builder).addHints(Collections.singletonList(CreateEntry.SLICE_HINT_PENDING_INTENT)).build(), null).addText(str, null, Collections.singletonList(CreateEntry.SLICE_HINT_AUTO_SELECT_ALLOWED));
            return builder;
        }
    }

    /* compiled from: CreateEntry.kt */
    public static final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        public static final CreateEntry fromCreateEntry(android.service.credentials.CreateEntry createEntry) {
            return CreateEntry.Companion.fromSlice(createEntry.getSlice());
        }
    }

    /* compiled from: CreateEntry.kt */
    public static final class Api35Impl {
        public static final Api35Impl INSTANCE = new Api35Impl();

        private Api35Impl() {
        }

        private final void addToSlice(CreateEntry createEntry, Slice.Builder builder) {
            BiometricPromptData biometricPromptData = createEntry.getBiometricPromptData();
            if (biometricPromptData != null) {
                builder.addInt(biometricPromptData.getAllowedAuthenticators(), null, Collections.singletonList(CreateEntry.SLICE_HINT_ALLOWED_AUTHENTICATORS));
                if (biometricPromptData.getCryptoObject() != null) {
                    builder.addLong(CryptoObjectUtils.INSTANCE.getOperationHandle(biometricPromptData.getCryptoObject()), null, Collections.singletonList(CreateEntry.SLICE_HINT_CRYPTO_OP_ID));
                }
                builder.addBundle(BiometricPromptData.Companion.toBundle(biometricPromptData), null, Collections.singletonList(CreateEntry.SLICE_HINT_BIOMETRIC_PROMPT_DATA));
            }
        }

        @SuppressLint({"WrongConstant"})
        public static final CreateEntry fromSlice(Slice slice) {
            CreateEntry fromSlice = Api28Impl.fromSlice(slice);
            if (fromSlice == null) {
                return null;
            }
            Bundle bundle = null;
            for (SliceItem sliceItem : slice.getItems()) {
                if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_BIOMETRIC_PROMPT_DATA)) {
                    bundle = sliceItem.getBundle();
                }
            }
            try {
                return new CreateEntry(fromSlice.getAccountName(), fromSlice.getPendingIntent(), fromSlice.getIcon(), fromSlice.getDescription(), fromSlice.getLastUsedTime(), fromSlice.credentialCountInformationMap, fromSlice.isAutoSelectAllowed(), bundle != null ? BiometricPromptData.Companion.fromBundle(bundle) : null);
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        public static final Slice toSlice(CreateEntry createEntry) {
            Slice.Builder addToSlice = Api28Impl.INSTANCE.addToSlice(createEntry);
            INSTANCE.addToSlice(createEntry, addToSlice);
            return addToSlice.build();
        }
    }

    /* compiled from: CreateEntry.kt */
    public static final class Builder {
        private final CharSequence accountName;
        private boolean autoSelectAllowed;
        private BiometricPromptData biometricPromptData;
        private Map<String, Integer> credentialCountInformationMap = new LinkedHashMap();
        private CharSequence description;
        private Icon icon;
        private Instant lastUsedTime;
        private Integer passwordCredentialCount;
        private final PendingIntent pendingIntent;
        private Integer publicKeyCredentialCount;
        private Integer totalCredentialCount;

        public Builder(CharSequence charSequence, PendingIntent pendingIntent) {
            this.accountName = charSequence;
            this.pendingIntent = pendingIntent;
        }

        public final CreateEntry build() {
            return new CreateEntry(this.accountName, this.pendingIntent, this.icon, this.description, this.lastUsedTime, this.credentialCountInformationMap, this.autoSelectAllowed, this.biometricPromptData);
        }

        public final Builder setAutoSelectAllowed(boolean z) {
            this.autoSelectAllowed = z;
            return this;
        }

        public final Builder setBiometricPromptData(BiometricPromptData biometricPromptData) {
            this.biometricPromptData = biometricPromptData;
            return this;
        }

        public final Builder setDescription(CharSequence charSequence) {
            if ((charSequence != null ? Integer.valueOf(charSequence.length()) : null) != null && charSequence.length() > 300) {
                throw new IllegalArgumentException("Description must follow a limit of 300 characters.");
            }
            this.description = charSequence;
            return this;
        }

        public final Builder setIcon(Icon icon) {
            this.icon = icon;
            return this;
        }

        public final Builder setLastUsedTime(Instant instant) {
            this.lastUsedTime = instant;
            return this;
        }

        public final Builder setPasswordCredentialCount(int i) {
            this.passwordCredentialCount = Integer.valueOf(i);
            this.credentialCountInformationMap.put(PasswordCredential.TYPE_PASSWORD_CREDENTIAL, Integer.valueOf(i));
            return this;
        }

        public final Builder setPublicKeyCredentialCount(int i) {
            this.publicKeyCredentialCount = Integer.valueOf(i);
            this.credentialCountInformationMap.put(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL, Integer.valueOf(i));
            return this;
        }

        public final Builder setTotalCredentialCount(int i) {
            this.totalCredentialCount = Integer.valueOf(i);
            this.credentialCountInformationMap.put(CreateEntry.TYPE_TOTAL_CREDENTIAL, Integer.valueOf(i));
            return this;
        }
    }

    /* compiled from: CreateEntry.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final Map<String, Integer> convertBundleToCredentialCountInfo$credentials_release(Bundle bundle) {
            HashMap hashMap = new HashMap();
            if (bundle != null) {
                for (String str : bundle.keySet()) {
                    try {
                        hashMap.put(str, Integer.valueOf(bundle.getInt(str)));
                    } catch (Exception e) {
                        e.getMessage();
                    }
                }
            }
            return hashMap;
        }

        public final Bundle convertCredentialCountInfoToBundle$credentials_release(Map<String, Integer> map) {
            Bundle bundle = new Bundle();
            boolean z = false;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    bundle.putInt(entry.getKey(), entry.getValue().intValue());
                    z = true;
                }
            }
            if (z) {
                return bundle;
            }
            return null;
        }

        public final CreateEntry fromCreateEntry(android.service.credentials.CreateEntry createEntry) {
            if (Build.VERSION.SDK_INT >= 34) {
                return Api34Impl.fromCreateEntry(createEntry);
            }
            return null;
        }

        public final CreateEntry fromSlice(Slice slice) {
            return Build.VERSION.SDK_INT >= 35 ? Api35Impl.fromSlice(slice) : Api28Impl.fromSlice(slice);
        }

        public final void marshall$credentials_release(List<CreateEntry> list, Bundle bundle) {
            bundle.putInt(CreateEntry.EXTRA_CREATE_ENTRY_SIZE, list.size());
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                CreateEntry createEntry = (CreateEntry) obj;
                bundle.putCharSequence(lhg.a(i, CreateEntry.EXTRA_CREATE_ACCOUNT_NAME_PREFIX), createEntry.getAccountName());
                bundle.putParcelable("androidx.credentials.provider.extra.PENDING_INTENT_" + i, createEntry.getPendingIntent());
                Icon icon = createEntry.getIcon();
                if (icon != null) {
                    bundle.putParcelable("androidx.credentials.provider.extra.ICON_" + i, icon);
                }
                CharSequence description = createEntry.getDescription();
                if (description != null) {
                    bundle.putCharSequence(CreateEntry.EXTRA_CREATE_DESCRIPTION_PREFIX + i, description);
                }
                Instant lastUsedTime = createEntry.getLastUsedTime();
                if (lastUsedTime != null) {
                    bundle.putSerializable("androidx.credentials.provider.extra.LAST_USED_TIME_" + i, lastUsedTime);
                }
                Bundle convertCredentialCountInfoToBundle$credentials_release = CreateEntry.Companion.convertCredentialCountInfoToBundle$credentials_release(createEntry.credentialCountInformationMap);
                if (convertCredentialCountInfoToBundle$credentials_release != null) {
                    bundle.putBundle(CreateEntry.EXTRA_CREATE_CREDENTIAL_COUNT_INFO_PREFIX + i, convertCredentialCountInfoToBundle$credentials_release);
                }
                bundle.putBoolean(lhg.a(i, "androidx.credentials.provider.extra.IS_AUTO_SELECT_ALLOWED_"), createEntry.isAutoSelectAllowed());
                i = i2;
            }
        }

        public final Slice toSlice(CreateEntry createEntry) {
            return Build.VERSION.SDK_INT >= 35 ? Api35Impl.toSlice(createEntry) : Api28Impl.toSlice(createEntry);
        }

        public final List<CreateEntry> unmarshallCreateEntries$credentials_release(Bundle bundle) {
            try {
                ArrayList arrayList = new ArrayList();
                int i = bundle.getInt(CreateEntry.EXTRA_CREATE_ENTRY_SIZE, 0);
                for (int i2 = 0; i2 < i; i2++) {
                    CharSequence charSequence = bundle.getCharSequence(CreateEntry.EXTRA_CREATE_ACCOUNT_NAME_PREFIX + i2);
                    if (charSequence == null) {
                        return EmptyList.b;
                    }
                    PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("androidx.credentials.provider.extra.PENDING_INTENT_" + i2);
                    if (pendingIntent == null) {
                        return EmptyList.b;
                    }
                    arrayList.add(new CreateEntry(charSequence, pendingIntent, (Icon) bundle.getParcelable("androidx.credentials.provider.extra.ICON_" + i2), bundle.getCharSequence(CreateEntry.EXTRA_CREATE_DESCRIPTION_PREFIX + i2), (Instant) bundle.getSerializable("androidx.credentials.provider.extra.LAST_USED_TIME_" + i2), new LinkedHashMap(convertBundleToCredentialCountInfo$credentials_release(bundle.getBundle(CreateEntry.EXTRA_CREATE_CREDENTIAL_COUNT_INFO_PREFIX + i2))), bundle.getBoolean("androidx.credentials.provider.extra.IS_AUTO_SELECT_ALLOWED_" + i2, false), (BiometricPromptData) null, 128, (zcl) null));
                }
                return arrayList;
            } catch (Exception unused) {
                return EmptyList.b;
            }
        }

        private Companion() {
        }
    }

    public CreateEntry(CharSequence charSequence, PendingIntent pendingIntent, CharSequence charSequence2, Instant instant, Icon icon, Integer num, Integer num2, Integer num3, boolean z) {
        this(charSequence, pendingIntent, icon, charSequence2, instant, pn00.m(new Pair(PasswordCredential.TYPE_PASSWORD_CREDENTIAL, num), new Pair(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL, num2), new Pair(TYPE_TOTAL_CREDENTIAL, num3)), z, (BiometricPromptData) null, 128, (zcl) null);
    }

    public static final CreateEntry fromCreateEntry(android.service.credentials.CreateEntry createEntry) {
        return Companion.fromCreateEntry(createEntry);
    }

    public static final CreateEntry fromSlice(Slice slice) {
        return Companion.fromSlice(slice);
    }

    public static final Slice toSlice(CreateEntry createEntry) {
        return Companion.toSlice(createEntry);
    }

    public final CharSequence getAccountName() {
        return this.accountName;
    }

    public final BiometricPromptData getBiometricPromptData() {
        return this.biometricPromptData;
    }

    public final CharSequence getDescription() {
        return this.description;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final Instant getLastUsedTime() {
        return this.lastUsedTime;
    }

    public final Integer getPasswordCredentialCount() {
        return this.credentialCountInformationMap.get(PasswordCredential.TYPE_PASSWORD_CREDENTIAL);
    }

    public final PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }

    public final Integer getPublicKeyCredentialCount() {
        return this.credentialCountInformationMap.get(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL);
    }

    public final Integer getTotalCredentialCount() {
        return this.credentialCountInformationMap.get(TYPE_TOTAL_CREDENTIAL);
    }

    public final boolean isAutoSelectAllowed() {
        return this.isAutoSelectAllowed;
    }

    public CreateEntry(CharSequence charSequence, PendingIntent pendingIntent, CharSequence charSequence2, Instant instant, Icon icon, Integer num, Integer num2, Integer num3, boolean z, BiometricPromptData biometricPromptData) {
        this(charSequence, pendingIntent, icon, charSequence2, instant, pn00.m(new Pair(PasswordCredential.TYPE_PASSWORD_CREDENTIAL, num), new Pair(PublicKeyCredential.TYPE_PUBLIC_KEY_CREDENTIAL, num2), new Pair(TYPE_TOTAL_CREDENTIAL, num3)), z, biometricPromptData);
    }

    public CreateEntry(CharSequence charSequence, PendingIntent pendingIntent, Icon icon, CharSequence charSequence2, Instant instant, Map<String, Integer> map, boolean z, BiometricPromptData biometricPromptData) {
        this.accountName = charSequence;
        this.pendingIntent = pendingIntent;
        this.icon = icon;
        this.description = charSequence2;
        this.lastUsedTime = instant;
        this.credentialCountInformationMap = map;
        this.isAutoSelectAllowed = z;
        this.biometricPromptData = biometricPromptData;
        if (charSequence.length() > 0) {
            if (charSequence2 != null && charSequence2.length() > 300) {
                throw new IllegalArgumentException("Description must follow a limit of 300 characters.");
            }
            return;
        }
        throw new IllegalArgumentException("accountName must not be empty");
    }

    public /* synthetic */ CreateEntry(CharSequence charSequence, PendingIntent pendingIntent, Icon icon, CharSequence charSequence2, Instant instant, Map map, boolean z, BiometricPromptData biometricPromptData, int i, zcl zclVar) {
        this(charSequence, pendingIntent, icon, charSequence2, instant, map, z, (i & 128) != 0 ? null : biometricPromptData);
    }

    public /* synthetic */ CreateEntry(CharSequence charSequence, PendingIntent pendingIntent, CharSequence charSequence2, Instant instant, Icon icon, Integer num, Integer num2, Integer num3, boolean z, int i, zcl zclVar) {
        this(charSequence, pendingIntent, (i & 4) != 0 ? null : charSequence2, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? null : icon, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? false : z);
    }

    public /* synthetic */ CreateEntry(CharSequence charSequence, PendingIntent pendingIntent, CharSequence charSequence2, Instant instant, Icon icon, Integer num, Integer num2, Integer num3, boolean z, BiometricPromptData biometricPromptData, int i, zcl zclVar) {
        this(charSequence, pendingIntent, (i & 4) != 0 ? null : charSequence2, (i & 8) != 0 ? null : instant, (i & 16) != 0 ? null : icon, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : num3, (i & 256) != 0 ? false : z, (i & 512) != 0 ? null : biometricPromptData);
    }
}
