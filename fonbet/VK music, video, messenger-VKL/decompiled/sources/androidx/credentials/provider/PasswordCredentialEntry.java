package androidx.credentials.provider;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.app.slice.SliceSpec;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.credentials.PasswordCredential;
import androidx.credentials.R;
import androidx.credentials.provider.utils.CryptoObjectUtils;
import java.time.Instant;
import java.util.Collections;
import xsna.epx;
import xsna.ozl;
import xsna.zcl;

/* compiled from: PasswordCredentialEntry.kt */
/* loaded from: classes12.dex */
public final class PasswordCredentialEntry extends CredentialEntry {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "PasswordCredentialEntry";
    private final CharSequence displayName;
    private final Icon icon;
    private final boolean isAutoSelectAllowed;
    private final boolean isAutoSelectAllowedFromOption;
    private boolean isCreatedFromSlice;
    private boolean isDefaultIconFromSlice;
    private final Instant lastUsedTime;
    private final PendingIntent pendingIntent;
    private final CharSequence typeDisplayName;
    private final CharSequence username;

    /* compiled from: PasswordCredentialEntry.kt */
    public static final class Api28Impl {
        public static final Api28Impl INSTANCE = new Api28Impl();

        private Api28Impl() {
        }

        @SuppressLint({"WrongConstant"})
        public static final PasswordCredentialEntry fromSlice(Slice slice) {
            CharSequence charSequence = null;
            CharSequence charSequence2 = null;
            CharSequence charSequence3 = null;
            PendingIntent pendingIntent = null;
            Instant instant = null;
            Icon icon = null;
            CharSequence charSequence4 = null;
            CharSequence charSequence5 = null;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            CharSequence charSequence6 = null;
            for (SliceItem sliceItem : slice.getItems()) {
                if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_OPTION_ID)) {
                    charSequence6 = sliceItem.getText();
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_DEDUPLICATION_ID)) {
                    charSequence4 = sliceItem.getText();
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED)) {
                    if (epx.f(sliceItem.getText(), "true")) {
                        z2 = true;
                    }
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_AFFILIATED_DOMAIN)) {
                    charSequence5 = sliceItem.getText();
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME)) {
                    charSequence3 = sliceItem.getText();
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_TITLE)) {
                    charSequence = sliceItem.getText();
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_SUBTITLE)) {
                    charSequence2 = sliceItem.getText();
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_ICON)) {
                    icon = sliceItem.getIcon();
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_PENDING_INTENT)) {
                    pendingIntent = sliceItem.getAction();
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_LAST_USED_TIME_MILLIS)) {
                    instant = Instant.ofEpochMilli(sliceItem.getLong());
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_AUTO_ALLOWED)) {
                    if (epx.f(sliceItem.getText(), "true")) {
                        z = true;
                    }
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION)) {
                    z3 = true;
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID)) {
                    z4 = true;
                }
            }
            try {
                return new PasswordCredentialEntry(charSequence, charSequence2, charSequence3, pendingIntent, instant, icon, z, BeginGetPasswordOption.Companion.createFrom$credentials_release(new Bundle(), charSequence6.toString()), z2, charSequence4, charSequence5, null, z3, true, z4, 2048, null);
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        public static final boolean isDefaultIcon(PasswordCredentialEntry passwordCredentialEntry) {
            return passwordCredentialEntry.isCreatedFromSlice ? passwordCredentialEntry.isDefaultIconFromSlice : passwordCredentialEntry.getIcon().getType() == 2 && passwordCredentialEntry.getIcon().getResId() == R.drawable.ic_password;
        }

        public static final Slice toSlice(PasswordCredentialEntry passwordCredentialEntry) {
            Slice.Builder builder = new Slice.Builder(Uri.EMPTY, new SliceSpec(passwordCredentialEntry.getType(), 1));
            INSTANCE.addToSlice(passwordCredentialEntry, builder);
            return builder.build();
        }

        public final void addToSlice(PasswordCredentialEntry passwordCredentialEntry, Slice.Builder builder) {
            BeginGetCredentialOption beginGetCredentialOption = passwordCredentialEntry.getBeginGetCredentialOption();
            CharSequence entryGroupId = passwordCredentialEntry.getEntryGroupId();
            boolean isDefaultIconPreferredAsSingleProvider = passwordCredentialEntry.isDefaultIconPreferredAsSingleProvider();
            CharSequence affiliatedDomain = passwordCredentialEntry.getAffiliatedDomain();
            String str = CredentialEntry.FALSE_STRING;
            builder.addText(beginGetCredentialOption.getId(), null, Collections.singletonList(CredentialEntry.SLICE_HINT_OPTION_ID)).addText(entryGroupId, null, Collections.singletonList(CredentialEntry.SLICE_HINT_DEDUPLICATION_ID)).addText(isDefaultIconPreferredAsSingleProvider ? "true" : CredentialEntry.FALSE_STRING, null, Collections.singletonList(CredentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED)).addText(affiliatedDomain, null, Collections.singletonList(CredentialEntry.SLICE_HINT_AFFILIATED_DOMAIN));
            CharSequence username = passwordCredentialEntry.getUsername();
            CharSequence displayName = passwordCredentialEntry.getDisplayName();
            PendingIntent pendingIntent = passwordCredentialEntry.getPendingIntent();
            CharSequence typeDisplayName = passwordCredentialEntry.getTypeDisplayName();
            Instant lastUsedTime = passwordCredentialEntry.getLastUsedTime();
            Icon icon = passwordCredentialEntry.getIcon();
            if (passwordCredentialEntry.isAutoSelectAllowed()) {
                str = "true";
            }
            builder.addText(typeDisplayName, null, Collections.singletonList(CredentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME)).addText(username, null, Collections.singletonList(CredentialEntry.SLICE_HINT_TITLE)).addText(displayName, null, Collections.singletonList(CredentialEntry.SLICE_HINT_SUBTITLE)).addText(str, null, Collections.singletonList(CredentialEntry.SLICE_HINT_AUTO_ALLOWED)).addIcon(icon, null, Collections.singletonList(CredentialEntry.SLICE_HINT_ICON));
            try {
                if (passwordCredentialEntry.hasDefaultIcon()) {
                    builder.addInt(1, null, Collections.singletonList(CredentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID));
                }
            } catch (IllegalStateException unused) {
            }
            if (passwordCredentialEntry.isAutoSelectAllowedFromOption()) {
                builder.addInt(1, null, Collections.singletonList(CredentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION));
            }
            if (lastUsedTime != null) {
                builder.addLong(lastUsedTime.toEpochMilli(), null, Collections.singletonList(CredentialEntry.SLICE_HINT_LAST_USED_TIME_MILLIS));
            }
            builder.addAction(pendingIntent, new Slice.Builder(builder).addHints(Collections.singletonList(CredentialEntry.SLICE_HINT_PENDING_INTENT)).build(), null);
        }
    }

    /* compiled from: PasswordCredentialEntry.kt */
    public static final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        public static final PasswordCredentialEntry fromCredentialEntry(android.service.credentials.CredentialEntry credentialEntry) {
            return PasswordCredentialEntry.Companion.fromSlice(credentialEntry.getSlice());
        }
    }

    /* compiled from: PasswordCredentialEntry.kt */
    public static final class Api35Impl {
        public static final Api35Impl INSTANCE = new Api35Impl();

        private Api35Impl() {
        }

        @SuppressLint({"WrongConstant"})
        public static final PasswordCredentialEntry fromSlice(Slice slice) {
            PasswordCredentialEntry fromSlice = Api28Impl.fromSlice(slice);
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
                return new PasswordCredentialEntry(fromSlice.getUsername(), fromSlice.getDisplayName(), fromSlice.getTypeDisplayName(), fromSlice.getPendingIntent(), fromSlice.getLastUsedTime(), fromSlice.getIcon(), fromSlice.isAutoSelectAllowed(), (BeginGetPasswordOption) fromSlice.getBeginGetCredentialOption(), fromSlice.isDefaultIconPreferredAsSingleProvider(), fromSlice.getEntryGroupId(), fromSlice.getAffiliatedDomain(), bundle != null ? BiometricPromptData.Companion.fromBundle(bundle) : null, fromSlice.isAutoSelectAllowedFromOption(), true, fromSlice.isDefaultIconFromSlice);
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        public static final Slice toSlice(PasswordCredentialEntry passwordCredentialEntry) {
            Slice.Builder builder = new Slice.Builder(Uri.EMPTY, new SliceSpec(passwordCredentialEntry.getType(), 1));
            Api28Impl.INSTANCE.addToSlice(passwordCredentialEntry, builder);
            INSTANCE.addToSlice(passwordCredentialEntry, builder);
            return builder.build();
        }

        public final void addToSlice(PasswordCredentialEntry passwordCredentialEntry, Slice.Builder builder) {
            BiometricPromptData biometricPromptData = passwordCredentialEntry.getBiometricPromptData();
            if (biometricPromptData != null) {
                builder.addInt(biometricPromptData.getAllowedAuthenticators(), null, Collections.singletonList(CredentialEntry.SLICE_HINT_ALLOWED_AUTHENTICATORS));
                if (biometricPromptData.getCryptoObject() != null) {
                    builder.addLong(CryptoObjectUtils.INSTANCE.getOperationHandle(biometricPromptData.getCryptoObject()), null, Collections.singletonList(CredentialEntry.SLICE_HINT_CRYPTO_OP_ID));
                }
                builder.addBundle(BiometricPromptData.Companion.toBundle(biometricPromptData), null, Collections.singletonList(CredentialEntry.SLICE_HINT_BIOMETRIC_PROMPT_DATA));
            }
        }
    }

    /* compiled from: PasswordCredentialEntry.kt */
    public static final class Builder {
        private CharSequence affiliatedDomain;
        private boolean autoSelectAllowed;
        private final BeginGetPasswordOption beginGetPasswordOption;
        private BiometricPromptData biometricPromptData;
        private final Context context;
        private CharSequence displayName;
        private Icon icon;
        private boolean isDefaultIconPreferredAsSingleProvider;
        private Instant lastUsedTime;
        private final PendingIntent pendingIntent;
        private final CharSequence username;

        public Builder(Context context, CharSequence charSequence, PendingIntent pendingIntent, BeginGetPasswordOption beginGetPasswordOption) {
            this.context = context;
            this.username = charSequence;
            this.pendingIntent = pendingIntent;
            this.beginGetPasswordOption = beginGetPasswordOption;
        }

        public final PasswordCredentialEntry build() {
            if (this.icon == null) {
                this.icon = Icon.createWithResource(this.context, R.drawable.ic_password);
            }
            return new PasswordCredentialEntry(this.username, this.displayName, this.context.getString(R.string.android_credentials_TYPE_PASSWORD_CREDENTIAL), this.pendingIntent, this.lastUsedTime, this.icon, this.autoSelectAllowed, this.beginGetPasswordOption, this.isDefaultIconPreferredAsSingleProvider, null, this.affiliatedDomain, this.biometricPromptData, false, false, false, 29184, null);
        }

        public final Builder setAffiliatedDomain(CharSequence charSequence) {
            this.affiliatedDomain = charSequence;
            return this;
        }

        public final Builder setAutoSelectAllowed(boolean z) {
            this.autoSelectAllowed = z;
            return this;
        }

        public final Builder setBiometricPromptData(BiometricPromptData biometricPromptData) {
            this.biometricPromptData = biometricPromptData;
            return this;
        }

        public final Builder setDefaultIconPreferredAsSingleProvider(boolean z) {
            this.isDefaultIconPreferredAsSingleProvider = z;
            return this;
        }

        public final Builder setDisplayName(CharSequence charSequence) {
            this.displayName = charSequence;
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
    }

    /* compiled from: PasswordCredentialEntry.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final PasswordCredentialEntry fromCredentialEntry(android.service.credentials.CredentialEntry credentialEntry) {
            if (Build.VERSION.SDK_INT >= 34) {
                return Api34Impl.fromCredentialEntry(credentialEntry);
            }
            return null;
        }

        public final PasswordCredentialEntry fromSlice(Slice slice) {
            return Build.VERSION.SDK_INT >= 35 ? Api35Impl.fromSlice(slice) : Api28Impl.fromSlice(slice);
        }

        public final void marshall$credentials_release(PasswordCredentialEntry passwordCredentialEntry, Bundle bundle, int i) {
            CredentialEntry.Companion.marshallCommonProperties$credentials_release(passwordCredentialEntry, bundle, i);
            bundle.putParcelable(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_PENDING_INTENT_PREFIX + i, passwordCredentialEntry.getPendingIntent());
            bundle.putBoolean(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_PREFIX + i, passwordCredentialEntry.isAutoSelectAllowed());
            bundle.putBoolean(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_FROM_OPTION_PREFIX + i, passwordCredentialEntry.isAutoSelectAllowedFromOption());
            bundle.putBoolean(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_HAS_DEFAULT_ICON_PREFIX + i, passwordCredentialEntry.hasDefaultIcon());
            bundle.putCharSequence(CredentialEntry.EXTRA_CREDENTIAL_TITLE_PREFIX + i, passwordCredentialEntry.getUsername());
            bundle.putCharSequence(CredentialEntry.EXTRA_CREDENTIAL_TYPE_DISPLAY_NAME_PREFIX + i, passwordCredentialEntry.getTypeDisplayName());
            bundle.putParcelable(CredentialEntry.EXTRA_CREDENTIAL_TYPE_ICON_PREFIX + i, passwordCredentialEntry.getIcon());
            CharSequence displayName = passwordCredentialEntry.getDisplayName();
            if (displayName != null) {
                bundle.putCharSequence(CredentialEntry.EXTRA_CREDENTIAL_SUBTITLE_PREFIX + i, displayName);
            }
            Instant lastUsedTime = passwordCredentialEntry.getLastUsedTime();
            if (lastUsedTime != null) {
                bundle.putSerializable(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_LAST_USED_TIME_PREFIX + i, lastUsedTime);
            }
        }

        public final Slice toSlice(PasswordCredentialEntry passwordCredentialEntry) {
            return Build.VERSION.SDK_INT >= 35 ? Api35Impl.toSlice(passwordCredentialEntry) : Api28Impl.toSlice(passwordCredentialEntry);
        }

        public final PasswordCredentialEntry unmarshall$credentials_release(Bundle bundle, int i) {
            try {
                String string = bundle.getString(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_OPTION_ID_PREFIX + i);
                Bundle bundle2 = bundle.getBundle(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_OPTION_DATA_PREFIX + i);
                CharSequence charSequence = bundle.getCharSequence(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_ENTRY_GROUP_ID_PREFIX + i);
                boolean z = bundle.getBoolean(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_IS_DEFAULT_ICON_PREFERRED_AS_SINGLE_PROV_PREFIX + i, false);
                CharSequence charSequence2 = bundle.getCharSequence(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_AFFILIATED_DOMAIN_PREFIX + i);
                PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_PENDING_INTENT_PREFIX + i);
                boolean z2 = bundle.getBoolean(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_PREFIX + i, false);
                boolean z3 = bundle.getBoolean(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_FROM_OPTION_PREFIX + i, false);
                boolean z4 = bundle.getBoolean(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_HAS_DEFAULT_ICON_PREFIX + i, false);
                CharSequence charSequence3 = bundle.getCharSequence(CredentialEntry.EXTRA_CREDENTIAL_TITLE_PREFIX + i);
                CharSequence charSequence4 = bundle.getCharSequence(CredentialEntry.EXTRA_CREDENTIAL_TYPE_DISPLAY_NAME_PREFIX + i);
                Icon icon = (Icon) bundle.getParcelable(CredentialEntry.EXTRA_CREDENTIAL_TYPE_ICON_PREFIX + i);
                return new PasswordCredentialEntry(charSequence3, bundle.getCharSequence(CredentialEntry.EXTRA_CREDENTIAL_SUBTITLE_PREFIX + i), charSequence4, pendingIntent, (Instant) bundle.getSerializable(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_LAST_USED_TIME_PREFIX + i), icon, z2, BeginGetPasswordOption.Companion.createFrom$credentials_release(bundle2, string), z, charSequence, charSequence2, null, z3, true, z4, 2048, null);
            } catch (Exception unused) {
                return null;
            }
        }

        private Companion() {
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ PasswordCredentialEntry(java.lang.CharSequence r19, java.lang.CharSequence r20, java.lang.CharSequence r21, android.app.PendingIntent r22, java.time.Instant r23, android.graphics.drawable.Icon r24, boolean r25, androidx.credentials.provider.BeginGetPasswordOption r26, boolean r27, java.lang.CharSequence r28, java.lang.CharSequence r29, androidx.credentials.provider.BiometricPromptData r30, boolean r31, boolean r32, boolean r33, int r34, xsna.zcl r35) {
        /*
            r18 = this;
            r0 = r34
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L9
            r12 = r19
            goto Lb
        L9:
            r12 = r28
        Lb:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r2 = 0
            if (r1 == 0) goto L12
            r13 = r2
            goto L14
        L12:
            r13 = r29
        L14:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L1a
            r14 = r2
            goto L1c
        L1a:
            r14 = r30
        L1c:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L2c
            androidx.credentials.CredentialOption$Companion r1 = androidx.credentials.CredentialOption.Companion
            android.os.Bundle r2 = r26.getCandidateQueryData()
            boolean r1 = r1.extractAutoSelectValue$credentials_release(r2)
            r15 = r1
            goto L2e
        L2c:
            r15 = r31
        L2e:
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            r2 = 0
            if (r1 == 0) goto L36
            r16 = r2
            goto L38
        L36:
            r16 = r32
        L38:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L53
            r17 = r2
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r2 = r18
            goto L69
        L53:
            r17 = r33
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
        L69:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.provider.PasswordCredentialEntry.<init>(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, android.app.PendingIntent, java.time.Instant, android.graphics.drawable.Icon, boolean, androidx.credentials.provider.BeginGetPasswordOption, boolean, java.lang.CharSequence, java.lang.CharSequence, androidx.credentials.provider.BiometricPromptData, boolean, boolean, boolean, int, xsna.zcl):void");
    }

    public static final PasswordCredentialEntry fromCredentialEntry(android.service.credentials.CredentialEntry credentialEntry) {
        return Companion.fromCredentialEntry(credentialEntry);
    }

    public static final PasswordCredentialEntry fromSlice(Slice slice) {
        return Companion.fromSlice(slice);
    }

    public static final Slice toSlice(PasswordCredentialEntry passwordCredentialEntry) {
        return Companion.toSlice(passwordCredentialEntry);
    }

    public final CharSequence getDisplayName() {
        return this.displayName;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final Instant getLastUsedTime() {
        return this.lastUsedTime;
    }

    public final PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }

    public final CharSequence getTypeDisplayName() {
        return this.typeDisplayName;
    }

    public final CharSequence getUsername() {
        return this.username;
    }

    public final boolean hasDefaultIcon() {
        return Api28Impl.isDefaultIcon(this);
    }

    public final boolean isAutoSelectAllowed() {
        return this.isAutoSelectAllowed;
    }

    public final boolean isAutoSelectAllowedFromOption() {
        return this.isAutoSelectAllowedFromOption;
    }

    public PasswordCredentialEntry(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, PendingIntent pendingIntent, Instant instant, Icon icon, boolean z, BeginGetPasswordOption beginGetPasswordOption, boolean z2, CharSequence charSequence4, CharSequence charSequence5, BiometricPromptData biometricPromptData, boolean z3, boolean z4, boolean z5) {
        super(PasswordCredential.TYPE_PASSWORD_CREDENTIAL, beginGetPasswordOption, charSequence4 == null ? charSequence : charSequence4, z2, charSequence5, biometricPromptData);
        this.username = charSequence;
        this.displayName = charSequence2;
        this.typeDisplayName = charSequence3;
        this.pendingIntent = pendingIntent;
        this.lastUsedTime = instant;
        this.icon = icon;
        this.isAutoSelectAllowed = z;
        this.isCreatedFromSlice = z4;
        this.isDefaultIconFromSlice = z5;
        this.isAutoSelectAllowedFromOption = z3;
        if (charSequence.length() <= 0) {
            throw new IllegalArgumentException("username must not be empty");
        }
    }

    public /* synthetic */ PasswordCredentialEntry(Context context, CharSequence charSequence, PendingIntent pendingIntent, BeginGetPasswordOption beginGetPasswordOption, CharSequence charSequence2, Instant instant, Icon icon, boolean z, CharSequence charSequence3, boolean z2, int i, zcl zclVar) {
        this(context, charSequence, pendingIntent, beginGetPasswordOption, (i & 16) != 0 ? null : charSequence2, (i & 32) != 0 ? null : instant, (i & 64) != 0 ? Icon.createWithResource(context, R.drawable.ic_password) : icon, (i & 128) != 0 ? false : z, (i & 256) != 0 ? null : charSequence3, (i & 512) != 0 ? false : z2);
    }

    public PasswordCredentialEntry(Context context, CharSequence charSequence, PendingIntent pendingIntent, BeginGetPasswordOption beginGetPasswordOption, CharSequence charSequence2, Instant instant, Icon icon, boolean z, CharSequence charSequence3, boolean z2) {
        this(charSequence, charSequence2, context.getString(R.string.android_credentials_TYPE_PASSWORD_CREDENTIAL), pendingIntent, instant, icon, z, beginGetPasswordOption, z2, null, charSequence3, null, false, false, false, 31232, null);
    }

    public /* synthetic */ PasswordCredentialEntry(Context context, CharSequence charSequence, PendingIntent pendingIntent, BeginGetPasswordOption beginGetPasswordOption, CharSequence charSequence2, Instant instant, Icon icon, boolean z, CharSequence charSequence3, boolean z2, BiometricPromptData biometricPromptData, int i, zcl zclVar) {
        this(context, charSequence, pendingIntent, beginGetPasswordOption, (i & 16) != 0 ? null : charSequence2, (i & 32) != 0 ? null : instant, (i & 64) != 0 ? Icon.createWithResource(context, R.drawable.ic_password) : icon, (i & 128) != 0 ? false : z, (i & 256) != 0 ? null : charSequence3, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? null : biometricPromptData);
    }

    public PasswordCredentialEntry(Context context, CharSequence charSequence, PendingIntent pendingIntent, BeginGetPasswordOption beginGetPasswordOption, CharSequence charSequence2, Instant instant, Icon icon, boolean z, CharSequence charSequence3, boolean z2, BiometricPromptData biometricPromptData) {
        this(charSequence, charSequence2, context.getString(R.string.android_credentials_TYPE_PASSWORD_CREDENTIAL), pendingIntent, instant, icon, z, beginGetPasswordOption, z2, null, charSequence3, biometricPromptData, false, false, false, 29184, null);
    }

    public /* synthetic */ PasswordCredentialEntry(Context context, CharSequence charSequence, PendingIntent pendingIntent, BeginGetPasswordOption beginGetPasswordOption, CharSequence charSequence2, Instant instant, Icon icon, boolean z, int i, zcl zclVar) {
        this(context, charSequence, pendingIntent, beginGetPasswordOption, (i & 16) != 0 ? null : charSequence2, (i & 32) != 0 ? null : instant, (i & 64) != 0 ? Icon.createWithResource(context, R.drawable.ic_password) : icon, (i & 128) != 0 ? false : z);
    }

    @ozl
    public /* synthetic */ PasswordCredentialEntry(Context context, CharSequence charSequence, PendingIntent pendingIntent, BeginGetPasswordOption beginGetPasswordOption, CharSequence charSequence2, Instant instant, Icon icon, boolean z) {
        this(charSequence, charSequence2, context.getString(R.string.android_credentials_TYPE_PASSWORD_CREDENTIAL), pendingIntent, instant, icon, z, beginGetPasswordOption, false, null, null, null, false, false, false, 32256, null);
    }
}
