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
import androidx.credentials.R;
import androidx.credentials.provider.utils.CryptoObjectUtils;
import java.time.Instant;
import java.util.Collections;
import java.util.Iterator;
import xsna.epx;
import xsna.ozl;
import xsna.zcl;

/* compiled from: CustomCredentialEntry.kt */
/* loaded from: classes12.dex */
public final class CustomCredentialEntry extends CredentialEntry {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "CredentialEntry";
    private final Icon icon;
    private final boolean isAutoSelectAllowed;
    private final boolean isAutoSelectAllowedFromOption;
    private boolean isCreatedFromSlice;
    private boolean isDefaultIconFromSlice;
    private final Instant lastUsedTime;
    private final PendingIntent pendingIntent;
    private final CharSequence subtitle;
    private final CharSequence title;
    private final String type;
    private final CharSequence typeDisplayName;

    /* compiled from: CustomCredentialEntry.kt */
    public static final class Api28Impl {
        public static final Api28Impl INSTANCE = new Api28Impl();

        private Api28Impl() {
        }

        @SuppressLint({"WrongConstant"})
        public static final CustomCredentialEntry fromSlice(Slice slice) {
            Iterator it;
            String type = slice.getSpec().getType();
            Iterator it2 = slice.getItems().iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            CharSequence charSequence = null;
            CharSequence charSequence2 = null;
            PendingIntent pendingIntent = null;
            CharSequence charSequence3 = null;
            CharSequence charSequence4 = null;
            Icon icon = null;
            Instant instant = null;
            CharSequence charSequence5 = null;
            CharSequence charSequence6 = null;
            while (it2.hasNext()) {
                SliceItem sliceItem = (SliceItem) it2.next();
                if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_OPTION_ID)) {
                    charSequence = sliceItem.getText();
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_DEDUPLICATION_ID)) {
                    charSequence5 = sliceItem.getText();
                } else {
                    it = it2;
                    if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED)) {
                        if (epx.f(sliceItem.getText(), "true")) {
                            z2 = true;
                        }
                    } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_AFFILIATED_DOMAIN)) {
                        charSequence6 = sliceItem.getText();
                    } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME)) {
                        charSequence4 = sliceItem.getText();
                    } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_TITLE)) {
                        charSequence2 = sliceItem.getText();
                    } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_SUBTITLE)) {
                        charSequence3 = sliceItem.getText();
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
                    it2 = it;
                }
                it = it2;
                it2 = it;
            }
            try {
                return new CustomCredentialEntry(type, charSequence2, pendingIntent, z, charSequence3, charSequence4, icon, instant, new BeginGetCustomCredentialOption(charSequence.toString(), type, new Bundle()), z2, charSequence5, charSequence6, null, z3, true, z4, 4096, null);
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        public static final boolean isDefaultIcon(CustomCredentialEntry customCredentialEntry) {
            return customCredentialEntry.isCreatedFromSlice ? customCredentialEntry.isDefaultIconFromSlice : customCredentialEntry.getIcon().getType() == 2 && customCredentialEntry.getIcon().getResId() == R.drawable.ic_other_sign_in;
        }

        public static final Slice toSlice(CustomCredentialEntry customCredentialEntry) {
            Slice.Builder builder = new Slice.Builder(Uri.EMPTY, new SliceSpec(customCredentialEntry.getType(), 1));
            INSTANCE.addToSlice(customCredentialEntry, builder);
            return builder.build();
        }

        public final void addToSlice(CustomCredentialEntry customCredentialEntry, Slice.Builder builder) {
            BeginGetCredentialOption beginGetCredentialOption = customCredentialEntry.getBeginGetCredentialOption();
            CharSequence entryGroupId = customCredentialEntry.getEntryGroupId();
            boolean isDefaultIconPreferredAsSingleProvider = customCredentialEntry.isDefaultIconPreferredAsSingleProvider();
            CharSequence affiliatedDomain = customCredentialEntry.getAffiliatedDomain();
            String str = CredentialEntry.FALSE_STRING;
            builder.addText(beginGetCredentialOption.getId(), null, Collections.singletonList(CredentialEntry.SLICE_HINT_OPTION_ID)).addText(entryGroupId, null, Collections.singletonList(CredentialEntry.SLICE_HINT_DEDUPLICATION_ID)).addText(isDefaultIconPreferredAsSingleProvider ? "true" : CredentialEntry.FALSE_STRING, null, Collections.singletonList(CredentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED)).addText(affiliatedDomain, null, Collections.singletonList(CredentialEntry.SLICE_HINT_AFFILIATED_DOMAIN));
            CharSequence title = customCredentialEntry.getTitle();
            CharSequence subtitle = customCredentialEntry.getSubtitle();
            PendingIntent pendingIntent = customCredentialEntry.getPendingIntent();
            CharSequence typeDisplayName = customCredentialEntry.getTypeDisplayName();
            Instant lastUsedTime = customCredentialEntry.getLastUsedTime();
            Icon icon = customCredentialEntry.getIcon();
            if (customCredentialEntry.isAutoSelectAllowed()) {
                str = "true";
            }
            builder.addText(typeDisplayName, null, Collections.singletonList(CredentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME)).addText(title, null, Collections.singletonList(CredentialEntry.SLICE_HINT_TITLE)).addText(subtitle, null, Collections.singletonList(CredentialEntry.SLICE_HINT_SUBTITLE)).addText(str, null, Collections.singletonList(CredentialEntry.SLICE_HINT_AUTO_ALLOWED)).addIcon(icon, null, Collections.singletonList(CredentialEntry.SLICE_HINT_ICON));
            try {
                if (customCredentialEntry.hasDefaultIcon()) {
                    builder.addInt(1, null, Collections.singletonList(CredentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID));
                }
            } catch (IllegalStateException unused) {
            }
            if (customCredentialEntry.isAutoSelectAllowedFromOption()) {
                builder.addInt(1, null, Collections.singletonList(CredentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION));
            }
            if (lastUsedTime != null) {
                builder.addLong(lastUsedTime.toEpochMilli(), null, Collections.singletonList(CredentialEntry.SLICE_HINT_LAST_USED_TIME_MILLIS));
            }
            builder.addAction(pendingIntent, new Slice.Builder(builder).addHints(Collections.singletonList(CredentialEntry.SLICE_HINT_PENDING_INTENT)).build(), null);
        }
    }

    /* compiled from: CustomCredentialEntry.kt */
    public static final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        public static final CustomCredentialEntry fromCredentialEntry(android.service.credentials.CredentialEntry credentialEntry) {
            return CustomCredentialEntry.Companion.fromSlice(credentialEntry.getSlice());
        }
    }

    /* compiled from: CustomCredentialEntry.kt */
    public static final class Api35Impl {
        public static final Api35Impl INSTANCE = new Api35Impl();

        private Api35Impl() {
        }

        @SuppressLint({"WrongConstant"})
        public static final CustomCredentialEntry fromSlice(Slice slice) {
            CustomCredentialEntry fromSlice = Api28Impl.fromSlice(slice);
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
                return new CustomCredentialEntry(fromSlice.getType(), fromSlice.getTitle(), fromSlice.getPendingIntent(), fromSlice.isAutoSelectAllowed(), fromSlice.getSubtitle(), fromSlice.getTypeDisplayName(), fromSlice.getIcon(), fromSlice.getLastUsedTime(), fromSlice.getBeginGetCredentialOption(), fromSlice.isDefaultIconPreferredAsSingleProvider(), fromSlice.getEntryGroupId(), fromSlice.getAffiliatedDomain(), bundle != null ? BiometricPromptData.Companion.fromBundle(bundle) : null, fromSlice.isAutoSelectAllowedFromOption(), true, fromSlice.isDefaultIconFromSlice);
            } catch (Exception e) {
                e.getMessage();
                return null;
            }
        }

        public static final Slice toSlice(CustomCredentialEntry customCredentialEntry) {
            Slice.Builder builder = new Slice.Builder(Uri.EMPTY, new SliceSpec(customCredentialEntry.getType(), 1));
            Api28Impl.INSTANCE.addToSlice(customCredentialEntry, builder);
            INSTANCE.addToSlice(customCredentialEntry, builder);
            return builder.build();
        }

        public final void addToSlice(CustomCredentialEntry customCredentialEntry, Slice.Builder builder) {
            BiometricPromptData biometricPromptData = customCredentialEntry.getBiometricPromptData();
            if (biometricPromptData != null) {
                builder.addInt(biometricPromptData.getAllowedAuthenticators(), null, Collections.singletonList(CredentialEntry.SLICE_HINT_ALLOWED_AUTHENTICATORS));
                if (biometricPromptData.getCryptoObject() != null) {
                    builder.addLong(CryptoObjectUtils.INSTANCE.getOperationHandle(biometricPromptData.getCryptoObject()), null, Collections.singletonList(CredentialEntry.SLICE_HINT_CRYPTO_OP_ID));
                }
                builder.addBundle(BiometricPromptData.Companion.toBundle(biometricPromptData), null, Collections.singletonList(CredentialEntry.SLICE_HINT_BIOMETRIC_PROMPT_DATA));
            }
        }
    }

    /* compiled from: CustomCredentialEntry.kt */
    public static final class Builder {
        private boolean autoSelectAllowed;
        private final BeginGetCredentialOption beginGetCredentialOption;
        private BiometricPromptData biometricPromptData;
        private final Context context;
        private CharSequence entryGroupId;
        private Icon icon;
        private boolean isDefaultIconPreferredAsSingleProvider;
        private Instant lastUsedTime;
        private final PendingIntent pendingIntent;
        private CharSequence subtitle;
        private final CharSequence title;
        private final String type;
        private CharSequence typeDisplayName;

        public Builder(Context context, String str, CharSequence charSequence, PendingIntent pendingIntent, BeginGetCredentialOption beginGetCredentialOption) {
            this.context = context;
            this.type = str;
            this.title = charSequence;
            this.pendingIntent = pendingIntent;
            this.beginGetCredentialOption = beginGetCredentialOption;
            this.entryGroupId = charSequence;
        }

        public final CustomCredentialEntry build() {
            if (this.icon == null) {
                this.icon = Icon.createWithResource(this.context, R.drawable.ic_other_sign_in);
            }
            return new CustomCredentialEntry(this.type, this.title, this.pendingIntent, this.autoSelectAllowed, this.subtitle, this.typeDisplayName, this.icon, this.lastUsedTime, this.beginGetCredentialOption, this.isDefaultIconPreferredAsSingleProvider, this.entryGroupId, null, this.biometricPromptData, false, false, false, 59392, null);
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

        public final Builder setEntryGroupId(CharSequence charSequence) {
            if (charSequence.length() <= 0) {
                throw new IllegalArgumentException("entryGroupId must not be empty");
            }
            this.entryGroupId = charSequence;
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

        public final Builder setSubtitle(CharSequence charSequence) {
            this.subtitle = charSequence;
            return this;
        }

        public final Builder setTypeDisplayName(CharSequence charSequence) {
            this.typeDisplayName = charSequence;
            return this;
        }
    }

    /* compiled from: CustomCredentialEntry.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final CustomCredentialEntry fromCredentialEntry(android.service.credentials.CredentialEntry credentialEntry) {
            if (Build.VERSION.SDK_INT >= 34) {
                return Api34Impl.fromCredentialEntry(credentialEntry);
            }
            return null;
        }

        @SuppressLint({"WrongConstant"})
        public final CustomCredentialEntry fromSlice(Slice slice) {
            return Build.VERSION.SDK_INT >= 35 ? Api35Impl.fromSlice(slice) : Api28Impl.fromSlice(slice);
        }

        public final void marshall$credentials_release(CustomCredentialEntry customCredentialEntry, Bundle bundle, int i) {
            CredentialEntry.Companion.marshallCommonProperties$credentials_release(customCredentialEntry, bundle, i);
            bundle.putParcelable(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_PENDING_INTENT_PREFIX + i, customCredentialEntry.getPendingIntent());
            bundle.putBoolean(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_PREFIX + i, customCredentialEntry.isAutoSelectAllowed());
            bundle.putBoolean(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_FROM_OPTION_PREFIX + i, customCredentialEntry.isAutoSelectAllowedFromOption());
            bundle.putBoolean(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_HAS_DEFAULT_ICON_PREFIX + i, customCredentialEntry.hasDefaultIcon());
            bundle.putCharSequence(CredentialEntry.EXTRA_CREDENTIAL_TITLE_PREFIX + i, customCredentialEntry.getTitle());
            bundle.putCharSequence(CredentialEntry.EXTRA_CREDENTIAL_TYPE_DISPLAY_NAME_PREFIX + i, customCredentialEntry.getTypeDisplayName());
            bundle.putParcelable(CredentialEntry.EXTRA_CREDENTIAL_TYPE_ICON_PREFIX + i, customCredentialEntry.getIcon());
            CharSequence subtitle = customCredentialEntry.getSubtitle();
            if (subtitle != null) {
                bundle.putCharSequence(CredentialEntry.EXTRA_CREDENTIAL_SUBTITLE_PREFIX + i, subtitle);
            }
            Instant lastUsedTime = customCredentialEntry.getLastUsedTime();
            if (lastUsedTime != null) {
                bundle.putSerializable(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_LAST_USED_TIME_PREFIX + i, lastUsedTime);
            }
        }

        public final Slice toSlice(CustomCredentialEntry customCredentialEntry) {
            return Build.VERSION.SDK_INT >= 35 ? Api35Impl.toSlice(customCredentialEntry) : Api28Impl.toSlice(customCredentialEntry);
        }

        public final CustomCredentialEntry unmarshall$credentials_release(Bundle bundle, int i, String str) {
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
                return new CustomCredentialEntry(str, charSequence3, pendingIntent, z2, bundle.getCharSequence(CredentialEntry.EXTRA_CREDENTIAL_SUBTITLE_PREFIX + i), charSequence4, icon, (Instant) bundle.getSerializable(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_LAST_USED_TIME_PREFIX + i), new BeginGetCustomCredentialOption(string, str, bundle2), z, charSequence, charSequence2, null, z3, true, z4);
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
    public /* synthetic */ CustomCredentialEntry(java.lang.String r20, java.lang.CharSequence r21, android.app.PendingIntent r22, boolean r23, java.lang.CharSequence r24, java.lang.CharSequence r25, android.graphics.drawable.Icon r26, java.time.Instant r27, androidx.credentials.provider.BeginGetCredentialOption r28, boolean r29, java.lang.CharSequence r30, java.lang.CharSequence r31, androidx.credentials.provider.BiometricPromptData r32, boolean r33, boolean r34, boolean r35, int r36, xsna.zcl r37) {
        /*
            r19 = this;
            r0 = r36
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L9
            r13 = r21
            goto Lb
        L9:
            r13 = r30
        Lb:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            r2 = 0
            if (r1 == 0) goto L12
            r14 = r2
            goto L14
        L12:
            r14 = r31
        L14:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L1a
            r15 = r2
            goto L1c
        L1a:
            r15 = r32
        L1c:
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L2d
            androidx.credentials.CredentialOption$Companion r1 = androidx.credentials.CredentialOption.Companion
            android.os.Bundle r2 = r28.getCandidateQueryData()
            boolean r1 = r1.extractAutoSelectValue$credentials_release(r2)
            r16 = r1
            goto L2f
        L2d:
            r16 = r33
        L2f:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            r2 = 0
            if (r1 == 0) goto L37
            r17 = r2
            goto L39
        L37:
            r17 = r34
        L39:
            r1 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L58
            r18 = r2
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r28
            r12 = r29
            r2 = r19
            goto L70
        L58:
            r18 = r35
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r28
            r12 = r29
        L70:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.provider.CustomCredentialEntry.<init>(java.lang.String, java.lang.CharSequence, android.app.PendingIntent, boolean, java.lang.CharSequence, java.lang.CharSequence, android.graphics.drawable.Icon, java.time.Instant, androidx.credentials.provider.BeginGetCredentialOption, boolean, java.lang.CharSequence, java.lang.CharSequence, androidx.credentials.provider.BiometricPromptData, boolean, boolean, boolean, int, xsna.zcl):void");
    }

    public static final CustomCredentialEntry fromCredentialEntry(android.service.credentials.CredentialEntry credentialEntry) {
        return Companion.fromCredentialEntry(credentialEntry);
    }

    @SuppressLint({"WrongConstant"})
    public static final CustomCredentialEntry fromSlice(Slice slice) {
        return Companion.fromSlice(slice);
    }

    public static final Slice toSlice(CustomCredentialEntry customCredentialEntry) {
        return Companion.toSlice(customCredentialEntry);
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

    public final CharSequence getSubtitle() {
        return this.subtitle;
    }

    public final CharSequence getTitle() {
        return this.title;
    }

    @Override // androidx.credentials.provider.CredentialEntry
    public String getType() {
        return this.type;
    }

    public final CharSequence getTypeDisplayName() {
        return this.typeDisplayName;
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

    public CustomCredentialEntry(String str, CharSequence charSequence, PendingIntent pendingIntent, boolean z, CharSequence charSequence2, CharSequence charSequence3, Icon icon, Instant instant, BeginGetCredentialOption beginGetCredentialOption, boolean z2, CharSequence charSequence4, CharSequence charSequence5, BiometricPromptData biometricPromptData, boolean z3, boolean z4, boolean z5) {
        super(str, beginGetCredentialOption, charSequence4 == null ? charSequence : charSequence4, z2, charSequence5, biometricPromptData);
        this.type = str;
        this.title = charSequence;
        this.pendingIntent = pendingIntent;
        this.isAutoSelectAllowed = z;
        this.subtitle = charSequence2;
        this.typeDisplayName = charSequence3;
        this.icon = icon;
        this.lastUsedTime = instant;
        this.isCreatedFromSlice = z4;
        this.isDefaultIconFromSlice = z5;
        this.isAutoSelectAllowedFromOption = z3;
        if (getType().length() > 0) {
            if (charSequence.length() <= 0) {
                throw new IllegalArgumentException("title must not be empty");
            }
            return;
        }
        throw new IllegalArgumentException("type must not be empty");
    }

    public /* synthetic */ CustomCredentialEntry(Context context, CharSequence charSequence, PendingIntent pendingIntent, BeginGetCredentialOption beginGetCredentialOption, CharSequence charSequence2, CharSequence charSequence3, Instant instant, Icon icon, boolean z, int i, zcl zclVar) {
        this(context, charSequence, pendingIntent, beginGetCredentialOption, (i & 16) != 0 ? null : charSequence2, (i & 32) != 0 ? null : charSequence3, (i & 64) != 0 ? null : instant, (i & 128) != 0 ? Icon.createWithResource(context, R.drawable.ic_other_sign_in) : icon, (i & 256) != 0 ? false : z);
    }

    @ozl
    public /* synthetic */ CustomCredentialEntry(Context context, CharSequence charSequence, PendingIntent pendingIntent, BeginGetCredentialOption beginGetCredentialOption, CharSequence charSequence2, CharSequence charSequence3, Instant instant, Icon icon, boolean z) {
        this(beginGetCredentialOption.getType(), charSequence, pendingIntent, z, charSequence2, charSequence3, icon, instant, beginGetCredentialOption, false, null, null, null, false, false, false, 64512, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CustomCredentialEntry(Context context, CharSequence charSequence, PendingIntent pendingIntent, BeginGetCredentialOption beginGetCredentialOption, CharSequence charSequence2, CharSequence charSequence3, Instant instant, Icon icon, boolean z, CharSequence charSequence4, boolean z2, BiometricPromptData biometricPromptData, int i, zcl zclVar) {
        this(r4, charSequence, pendingIntent, beginGetCredentialOption, r8, r9, r10, r11, (i & 256) != 0 ? false : z, (i & 512) != 0 ? charSequence : charSequence4, (i & 1024) != 0 ? false : z2, (i & 2048) != 0 ? null : biometricPromptData);
        Context context2;
        Icon icon2;
        CharSequence charSequence5 = (i & 16) != 0 ? null : charSequence2;
        CharSequence charSequence6 = (i & 32) != 0 ? null : charSequence3;
        Instant instant2 = (i & 64) != 0 ? null : instant;
        if ((i & 128) != 0) {
            context2 = context;
            icon2 = Icon.createWithResource(context2, R.drawable.ic_other_sign_in);
        } else {
            context2 = context;
            icon2 = icon;
        }
    }

    public CustomCredentialEntry(Context context, CharSequence charSequence, PendingIntent pendingIntent, BeginGetCredentialOption beginGetCredentialOption, CharSequence charSequence2, CharSequence charSequence3, Instant instant, Icon icon, boolean z, CharSequence charSequence4, boolean z2, BiometricPromptData biometricPromptData) {
        this(beginGetCredentialOption.getType(), charSequence, pendingIntent, z, charSequence2, charSequence3, icon, instant, beginGetCredentialOption, z2, charSequence4.length() == 0 ? charSequence : charSequence4, null, biometricPromptData, false, false, false, 59392, null);
    }

    public /* synthetic */ CustomCredentialEntry(Context context, CharSequence charSequence, PendingIntent pendingIntent, BeginGetCredentialOption beginGetCredentialOption, CharSequence charSequence2, CharSequence charSequence3, Instant instant, Icon icon, boolean z, CharSequence charSequence4, boolean z2, int i, zcl zclVar) {
        this(context, charSequence, pendingIntent, beginGetCredentialOption, (i & 16) != 0 ? null : charSequence2, (i & 32) != 0 ? null : charSequence3, (i & 64) != 0 ? null : instant, (i & 128) != 0 ? Icon.createWithResource(context, R.drawable.ic_other_sign_in) : icon, (i & 256) != 0 ? false : z, (i & 512) != 0 ? charSequence : charSequence4, (i & 1024) != 0 ? false : z2);
    }

    public CustomCredentialEntry(Context context, CharSequence charSequence, PendingIntent pendingIntent, BeginGetCredentialOption beginGetCredentialOption, CharSequence charSequence2, CharSequence charSequence3, Instant instant, Icon icon, boolean z, CharSequence charSequence4, boolean z2) {
        this(beginGetCredentialOption.getType(), charSequence, pendingIntent, z, charSequence2, charSequence3, icon, instant, beginGetCredentialOption, z2, charSequence4.length() == 0 ? charSequence : charSequence4, null, null, false, false, false, 63488, null);
    }
}
