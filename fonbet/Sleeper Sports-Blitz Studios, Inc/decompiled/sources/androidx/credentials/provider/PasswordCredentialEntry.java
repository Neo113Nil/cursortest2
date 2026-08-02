package androidx.credentials.provider;

import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.app.slice.SliceSpec;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.credentials.PasswordCredential;
import androidx.credentials.R;
import androidx.credentials.provider.BeginGetPasswordOption;
import androidx.credentials.provider.utils.CryptoObjectUtils;
import com.google.android.gms.common.internal.BaseGmsClient;
import j$.time.Instant;
import java.util.Collections;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PasswordCredentialEntry.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0007\u0018\u0000 12\u00020\u0001:\u000523451B\u0097\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019Bk\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u001cBw\b\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0018\u0010\u001dBU\b\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010-\u001a\u0004\b\r\u0010.R\u0016\u0010\u0016\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010-R\u0016\u0010\u0017\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010-R\u0017\u0010/\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b/\u0010.R\u0011\u00100\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b0\u0010.¨\u00066"}, d2 = {"Landroidx/credentials/provider/PasswordCredentialEntry;", "Landroidx/credentials/provider/CredentialEntry;", "", "username", "displayName", "typeDisplayName", "Landroid/app/PendingIntent;", BaseGmsClient.KEY_PENDING_INTENT, "j$/time/Instant", "lastUsedTime", "Landroid/graphics/drawable/Icon;", "icon", "", "isAutoSelectAllowed", "Landroidx/credentials/provider/BeginGetPasswordOption;", "beginGetPasswordOption", "isDefaultIconPreferredAsSingleProvider", "entryGroupId", "affiliatedDomain", "Landroidx/credentials/provider/BiometricPromptData;", "biometricPromptData", "autoSelectAllowedFromOption", "isCreatedFromSlice", "isDefaultIconFromSlice", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Lj$/time/Instant;Landroid/graphics/drawable/Icon;ZLandroidx/credentials/provider/BeginGetPasswordOption;ZLjava/lang/CharSequence;Ljava/lang/CharSequence;Landroidx/credentials/provider/BiometricPromptData;ZZZ)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroidx/credentials/provider/BeginGetPasswordOption;Ljava/lang/CharSequence;Lj$/time/Instant;Landroid/graphics/drawable/Icon;ZLjava/lang/CharSequence;Z)V", "(Landroid/content/Context;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroidx/credentials/provider/BeginGetPasswordOption;Ljava/lang/CharSequence;Lj$/time/Instant;Landroid/graphics/drawable/Icon;ZLjava/lang/CharSequence;ZLandroidx/credentials/provider/BiometricPromptData;)V", "(Landroid/content/Context;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroidx/credentials/provider/BeginGetPasswordOption;Ljava/lang/CharSequence;Lj$/time/Instant;Landroid/graphics/drawable/Icon;Z)V", "Ljava/lang/CharSequence;", "getUsername", "()Ljava/lang/CharSequence;", "getDisplayName", "getTypeDisplayName", "Landroid/app/PendingIntent;", "getPendingIntent", "()Landroid/app/PendingIntent;", "Lj$/time/Instant;", "getLastUsedTime", "()Lj$/time/Instant;", "Landroid/graphics/drawable/Icon;", "getIcon", "()Landroid/graphics/drawable/Icon;", "Z", "()Z", "isAutoSelectAllowedFromOption", "hasDefaultIcon", "Companion", "Api28Impl", "Api34Impl", "Api35Impl", "Builder", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PasswordCredentialEntry extends CredentialEntry {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
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

    @JvmStatic
    public static final PasswordCredentialEntry fromCredentialEntry(android.service.credentials.CredentialEntry credentialEntry) {
        return INSTANCE.fromCredentialEntry(credentialEntry);
    }

    @JvmStatic
    public static final PasswordCredentialEntry fromSlice(Slice slice) {
        return INSTANCE.fromSlice(slice);
    }

    @JvmStatic
    public static final Slice toSlice(PasswordCredentialEntry passwordCredentialEntry) {
        return INSTANCE.toSlice(passwordCredentialEntry);
    }

    public final CharSequence getUsername() {
        return this.username;
    }

    public final CharSequence getDisplayName() {
        return this.displayName;
    }

    public final CharSequence getTypeDisplayName() {
        return this.typeDisplayName;
    }

    public final PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }

    public final Instant getLastUsedTime() {
        return this.lastUsedTime;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    /* renamed from: isAutoSelectAllowed, reason: from getter */
    public final boolean getIsAutoSelectAllowed() {
        return this.isAutoSelectAllowed;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ PasswordCredentialEntry(java.lang.CharSequence r19, java.lang.CharSequence r20, java.lang.CharSequence r21, android.app.PendingIntent r22, j$.time.Instant r23, android.graphics.drawable.Icon r24, boolean r25, androidx.credentials.provider.BeginGetPasswordOption r26, boolean r27, java.lang.CharSequence r28, java.lang.CharSequence r29, androidx.credentials.provider.BiometricPromptData r30, boolean r31, boolean r32, boolean r33, int r34, kotlin.jvm.internal.DefaultConstructorMarker r35) {
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
            androidx.credentials.CredentialOption$Companion r1 = androidx.credentials.CredentialOption.INSTANCE
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.credentials.provider.PasswordCredentialEntry.<init>(java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, android.app.PendingIntent, j$.time.Instant, android.graphics.drawable.Icon, boolean, androidx.credentials.provider.BeginGetPasswordOption, boolean, java.lang.CharSequence, java.lang.CharSequence, androidx.credentials.provider.BiometricPromptData, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasswordCredentialEntry(CharSequence username, CharSequence charSequence, CharSequence typeDisplayName, PendingIntent pendingIntent, Instant instant, Icon icon, boolean z, BeginGetPasswordOption beginGetPasswordOption, boolean z2, CharSequence charSequence2, CharSequence charSequence3, BiometricPromptData biometricPromptData, boolean z3, boolean z4, boolean z5) {
        super(PasswordCredential.TYPE_PASSWORD_CREDENTIAL, beginGetPasswordOption, charSequence2 == null ? username : charSequence2, z2, charSequence3, biometricPromptData);
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(typeDisplayName, "typeDisplayName");
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(beginGetPasswordOption, "beginGetPasswordOption");
        this.username = username;
        this.displayName = charSequence;
        this.typeDisplayName = typeDisplayName;
        this.pendingIntent = pendingIntent;
        this.lastUsedTime = instant;
        this.icon = icon;
        this.isAutoSelectAllowed = z;
        this.isCreatedFromSlice = z4;
        this.isDefaultIconFromSlice = z5;
        this.isAutoSelectAllowedFromOption = z3;
        if (username.length() <= 0) {
            throw new IllegalArgumentException("username must not be empty".toString());
        }
    }

    /* renamed from: isAutoSelectAllowedFromOption, reason: from getter */
    public final boolean getIsAutoSelectAllowedFromOption() {
        return this.isAutoSelectAllowedFromOption;
    }

    public final boolean hasDefaultIcon() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.isDefaultIcon(this);
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ PasswordCredentialEntry(Context context, CharSequence charSequence, PendingIntent pendingIntent, BeginGetPasswordOption beginGetPasswordOption, CharSequence charSequence2, Instant instant, Icon icon, boolean z, CharSequence charSequence3, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, charSequence, pendingIntent, beginGetPasswordOption, charSequence2, instant, icon, (i & 128) != 0 ? false : z, (i & 256) != 0 ? null : charSequence3, (i & 512) != 0 ? false : z2);
        charSequence2 = (i & 16) != 0 ? null : charSequence2;
        instant = (i & 32) != 0 ? null : instant;
        if ((i & 64) != 0) {
            icon = Icon.createWithResource(context, R.drawable.ic_password);
            Intrinsics.checkNotNullExpressionValue(icon, "createWithResource(conte…, R.drawable.ic_password)");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PasswordCredentialEntry(Context context, CharSequence username, PendingIntent pendingIntent, BeginGetPasswordOption beginGetPasswordOption, CharSequence charSequence, Instant instant, Icon icon, boolean z, CharSequence charSequence2, boolean z2) {
        this(username, charSequence, r0, pendingIntent, instant, icon, z, beginGetPasswordOption, z2, null, charSequence2, null, false, false, false, 31232, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        Intrinsics.checkNotNullParameter(beginGetPasswordOption, "beginGetPasswordOption");
        Intrinsics.checkNotNullParameter(icon, "icon");
        String string = context.getString(R.string.android_credentials_TYPE_PASSWORD_CREDENTIAL);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…TYPE_PASSWORD_CREDENTIAL)");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ PasswordCredentialEntry(Context context, CharSequence charSequence, PendingIntent pendingIntent, BeginGetPasswordOption beginGetPasswordOption, CharSequence charSequence2, Instant instant, Icon icon, boolean z, CharSequence charSequence3, boolean z2, BiometricPromptData biometricPromptData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, charSequence, pendingIntent, beginGetPasswordOption, charSequence2, instant, icon, (i & 128) != 0 ? false : z, (i & 256) != 0 ? null : charSequence3, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? null : biometricPromptData);
        charSequence2 = (i & 16) != 0 ? null : charSequence2;
        instant = (i & 32) != 0 ? null : instant;
        if ((i & 64) != 0) {
            icon = Icon.createWithResource(context, R.drawable.ic_password);
            Intrinsics.checkNotNullExpressionValue(icon, "createWithResource(conte…, R.drawable.ic_password)");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PasswordCredentialEntry(Context context, CharSequence username, PendingIntent pendingIntent, BeginGetPasswordOption beginGetPasswordOption, CharSequence charSequence, Instant instant, Icon icon, boolean z, CharSequence charSequence2, boolean z2, BiometricPromptData biometricPromptData) {
        this(username, charSequence, r0, pendingIntent, instant, icon, z, beginGetPasswordOption, z2, null, charSequence2, biometricPromptData, false, false, false, 29184, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        Intrinsics.checkNotNullParameter(beginGetPasswordOption, "beginGetPasswordOption");
        Intrinsics.checkNotNullParameter(icon, "icon");
        String string = context.getString(R.string.android_credentials_TYPE_PASSWORD_CREDENTIAL);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…TYPE_PASSWORD_CREDENTIAL)");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ PasswordCredentialEntry(Context context, CharSequence charSequence, PendingIntent pendingIntent, BeginGetPasswordOption beginGetPasswordOption, CharSequence charSequence2, Instant instant, Icon icon, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, charSequence, pendingIntent, beginGetPasswordOption, charSequence2, instant, icon, (i & 128) != 0 ? false : z);
        charSequence2 = (i & 16) != 0 ? null : charSequence2;
        instant = (i & 32) != 0 ? null : instant;
        if ((i & 64) != 0) {
            icon = Icon.createWithResource(context, R.drawable.ic_password);
            Intrinsics.checkNotNullExpressionValue(icon, "createWithResource(conte…, R.drawable.ic_password)");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the constructor that allows setting all parameters.", replaceWith = @ReplaceWith(expression = "PasswordCredentialEntry(context, username, pendingIntent, beginGetPasswordOption, displayName, lastUsedTime, icon, isAutoSelectAllowed, affiliatedDomain, isDefaultIconPreferredAsSingleProvider, biometricPromptData)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ PasswordCredentialEntry(Context context, CharSequence username, PendingIntent pendingIntent, BeginGetPasswordOption beginGetPasswordOption, CharSequence charSequence, Instant instant, Icon icon, boolean z) {
        this(username, charSequence, r0, pendingIntent, instant, icon, z, beginGetPasswordOption, false, null, null, null, false, false, false, 32256, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        Intrinsics.checkNotNullParameter(beginGetPasswordOption, "beginGetPasswordOption");
        Intrinsics.checkNotNullParameter(icon, "icon");
        String string = context.getString(R.string.android_credentials_TYPE_PASSWORD_CREDENTIAL);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…TYPE_PASSWORD_CREDENTIAL)");
    }

    /* compiled from: PasswordCredentialEntry.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/credentials/provider/PasswordCredentialEntry$Api34Impl;", "", "()V", "fromCredentialEntry", "Landroidx/credentials/provider/PasswordCredentialEntry;", "credentialEntry", "Landroid/service/credentials/CredentialEntry;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        @JvmStatic
        public static final PasswordCredentialEntry fromCredentialEntry(android.service.credentials.CredentialEntry credentialEntry) {
            Intrinsics.checkNotNullParameter(credentialEntry, "credentialEntry");
            Slice slice = credentialEntry.getSlice();
            Intrinsics.checkNotNullExpressionValue(slice, "credentialEntry.slice");
            return PasswordCredentialEntry.INSTANCE.fromSlice(slice);
        }
    }

    /* compiled from: PasswordCredentialEntry.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\r"}, d2 = {"Landroidx/credentials/provider/PasswordCredentialEntry$Api35Impl;", "", "()V", "addToSlice", "", "entry", "Landroidx/credentials/provider/PasswordCredentialEntry;", "sliceBuilder", "Landroid/app/slice/Slice$Builder;", "fromSlice", "slice", "Landroid/app/slice/Slice;", "toSlice", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Api35Impl {
        public static final Api35Impl INSTANCE = new Api35Impl();

        private Api35Impl() {
        }

        @JvmStatic
        public static final Slice toSlice(PasswordCredentialEntry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            Slice.Builder builder = new Slice.Builder(Uri.EMPTY, new SliceSpec(entry.getType(), 1));
            Api28Impl.INSTANCE.addToSlice(entry, builder);
            INSTANCE.addToSlice(entry, builder);
            Slice build = builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "sliceBuilder.build()");
            return build;
        }

        public final void addToSlice(PasswordCredentialEntry entry, Slice.Builder sliceBuilder) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            Intrinsics.checkNotNullParameter(sliceBuilder, "sliceBuilder");
            BiometricPromptData biometricPromptData = entry.getBiometricPromptData();
            if (biometricPromptData != null) {
                sliceBuilder.addInt(biometricPromptData.getAllowedAuthenticators(), null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_ALLOWED_AUTHENTICATORS));
                if (biometricPromptData.getCryptoObject() != null) {
                    sliceBuilder.addLong(CryptoObjectUtils.INSTANCE.getOperationHandle(biometricPromptData.getCryptoObject()), null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_CRYPTO_OP_ID));
                }
                sliceBuilder.addBundle(BiometricPromptData.INSTANCE.toBundle(biometricPromptData), null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_BIOMETRIC_PROMPT_DATA));
            }
        }

        @JvmStatic
        public static final PasswordCredentialEntry fromSlice(Slice slice) {
            Intrinsics.checkNotNullParameter(slice, "slice");
            PasswordCredentialEntry fromSlice = Api28Impl.fromSlice(slice);
            if (fromSlice == null) {
                return null;
            }
            List<SliceItem> items = slice.getItems();
            Intrinsics.checkNotNullExpressionValue(items, "slice.items");
            Bundle bundle = null;
            for (SliceItem sliceItem : items) {
                if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_BIOMETRIC_PROMPT_DATA)) {
                    bundle = sliceItem.getBundle();
                }
            }
            try {
                CharSequence username = fromSlice.getUsername();
                CharSequence displayName = fromSlice.getDisplayName();
                CharSequence typeDisplayName = fromSlice.getTypeDisplayName();
                PendingIntent pendingIntent = fromSlice.getPendingIntent();
                Instant lastUsedTime = fromSlice.getLastUsedTime();
                Icon icon = fromSlice.getIcon();
                boolean isAutoSelectAllowed = fromSlice.getIsAutoSelectAllowed();
                BeginGetCredentialOption beginGetCredentialOption = fromSlice.getBeginGetCredentialOption();
                Intrinsics.checkNotNull(beginGetCredentialOption, "null cannot be cast to non-null type androidx.credentials.provider.BeginGetPasswordOption");
                return new PasswordCredentialEntry(username, displayName, typeDisplayName, pendingIntent, lastUsedTime, icon, isAutoSelectAllowed, (BeginGetPasswordOption) beginGetCredentialOption, fromSlice.getIsDefaultIconPreferredAsSingleProvider(), fromSlice.getEntryGroupId(), fromSlice.getAffiliatedDomain(), bundle != null ? BiometricPromptData.INSTANCE.fromBundle(bundle) : null, fromSlice.getIsAutoSelectAllowedFromOption(), true, fromSlice.isDefaultIconFromSlice);
            } catch (Exception e) {
                Log.i(PasswordCredentialEntry.TAG, "fromSlice failed with: " + e.getMessage());
                return null;
            }
        }
    }

    /* compiled from: PasswordCredentialEntry.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000f"}, d2 = {"Landroidx/credentials/provider/PasswordCredentialEntry$Api28Impl;", "", "()V", "addToSlice", "", "entry", "Landroidx/credentials/provider/PasswordCredentialEntry;", "sliceBuilder", "Landroid/app/slice/Slice$Builder;", "fromSlice", "slice", "Landroid/app/slice/Slice;", "isDefaultIcon", "", "toSlice", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Api28Impl {
        public static final Api28Impl INSTANCE = new Api28Impl();

        private Api28Impl() {
        }

        @JvmStatic
        public static final boolean isDefaultIcon(PasswordCredentialEntry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            if (entry.isCreatedFromSlice) {
                return entry.isDefaultIconFromSlice;
            }
            return entry.getIcon().getType() == 2 && entry.getIcon().getResId() == R.drawable.ic_password;
        }

        @JvmStatic
        public static final Slice toSlice(PasswordCredentialEntry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            Slice.Builder builder = new Slice.Builder(Uri.EMPTY, new SliceSpec(entry.getType(), 1));
            INSTANCE.addToSlice(entry, builder);
            Slice build = builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "sliceBuilder.build()");
            return build;
        }

        public final void addToSlice(PasswordCredentialEntry entry, Slice.Builder sliceBuilder) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            Intrinsics.checkNotNullParameter(sliceBuilder, "sliceBuilder");
            BeginGetCredentialOption beginGetCredentialOption = entry.getBeginGetCredentialOption();
            sliceBuilder.addText(beginGetCredentialOption.getId(), null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_OPTION_ID)).addText(entry.getEntryGroupId(), null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_DEDUPLICATION_ID)).addText(entry.getIsDefaultIconPreferredAsSingleProvider() ? "true" : "false", null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED)).addText(entry.getAffiliatedDomain(), null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_AFFILIATED_DOMAIN));
            CharSequence username = entry.getUsername();
            CharSequence displayName = entry.getDisplayName();
            PendingIntent pendingIntent = entry.getPendingIntent();
            CharSequence typeDisplayName = entry.getTypeDisplayName();
            Instant lastUsedTime = entry.getLastUsedTime();
            sliceBuilder.addText(typeDisplayName, null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_TYPE_DISPLAY_NAME)).addText(username, null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_TITLE)).addText(displayName, null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_SUBTITLE)).addText(entry.getIsAutoSelectAllowed() ? "true" : "false", null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_AUTO_ALLOWED)).addIcon(entry.getIcon(), null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_ICON));
            try {
                if (entry.hasDefaultIcon()) {
                    sliceBuilder.addInt(1, null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID));
                }
            } catch (IllegalStateException unused) {
            }
            if (entry.getIsAutoSelectAllowedFromOption()) {
                sliceBuilder.addInt(1, null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION));
            }
            if (lastUsedTime != null) {
                sliceBuilder.addLong(lastUsedTime.toEpochMilli(), null, CollectionsKt.listOf(CredentialEntry.SLICE_HINT_LAST_USED_TIME_MILLIS));
            }
            sliceBuilder.addAction(pendingIntent, new Slice.Builder(sliceBuilder).addHints(Collections.singletonList(CredentialEntry.SLICE_HINT_PENDING_INTENT)).build(), null);
        }

        @JvmStatic
        public static final PasswordCredentialEntry fromSlice(Slice slice) {
            Intrinsics.checkNotNullParameter(slice, "slice");
            List<SliceItem> items = slice.getItems();
            Intrinsics.checkNotNullExpressionValue(items, "slice.items");
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
            for (SliceItem sliceItem : items) {
                if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_OPTION_ID)) {
                    charSequence6 = sliceItem.getText();
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_DEDUPLICATION_ID)) {
                    charSequence4 = sliceItem.getText();
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_IS_DEFAULT_ICON_PREFERRED)) {
                    if (Intrinsics.areEqual(sliceItem.getText(), "true")) {
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
                    if (Intrinsics.areEqual(sliceItem.getText(), "true")) {
                        z = true;
                    }
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_AUTO_SELECT_FROM_OPTION)) {
                    z3 = true;
                } else if (sliceItem.hasHint(CredentialEntry.SLICE_HINT_DEFAULT_ICON_RES_ID)) {
                    z4 = true;
                }
            }
            try {
                Intrinsics.checkNotNull(charSequence);
                Intrinsics.checkNotNull(charSequence3);
                Intrinsics.checkNotNull(pendingIntent);
                Intrinsics.checkNotNull(icon);
                BeginGetPasswordOption.Companion companion = BeginGetPasswordOption.INSTANCE;
                Bundle bundle = new Bundle();
                Intrinsics.checkNotNull(charSequence6);
                return new PasswordCredentialEntry(charSequence, charSequence2, charSequence3, pendingIntent, instant, icon, z, companion.createFrom$credentials_release(bundle, charSequence6.toString()), z2, charSequence4, charSequence5, null, z3, true, z4, 2048, null);
            } catch (Exception e) {
                Log.i(PasswordCredentialEntry.TAG, "fromSlice failed with: " + e.getMessage());
                return null;
            }
        }
    }

    /* compiled from: PasswordCredentialEntry.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0007J\u001f\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013J!\u0010\u0014\u001a\u00020\u0015*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/credentials/provider/PasswordCredentialEntry$Companion;", "", "()V", "TAG", "", "fromCredentialEntry", "Landroidx/credentials/provider/PasswordCredentialEntry;", "credentialEntry", "Landroid/service/credentials/CredentialEntry;", "fromSlice", "slice", "Landroid/app/slice/Slice;", "toSlice", "entry", "unmarshall", "bundle", "Landroid/os/Bundle;", "index", "", "unmarshall$credentials_release", "marshall", "", "marshall$credentials_release", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Slice toSlice(PasswordCredentialEntry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            if (Build.VERSION.SDK_INT >= 35) {
                return Api35Impl.toSlice(entry);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                return Api28Impl.toSlice(entry);
            }
            return null;
        }

        @JvmStatic
        public final PasswordCredentialEntry fromSlice(Slice slice) {
            Intrinsics.checkNotNullParameter(slice, "slice");
            if (Build.VERSION.SDK_INT >= 35) {
                return Api35Impl.fromSlice(slice);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                return Api28Impl.fromSlice(slice);
            }
            return null;
        }

        @JvmStatic
        public final PasswordCredentialEntry fromCredentialEntry(android.service.credentials.CredentialEntry credentialEntry) {
            Intrinsics.checkNotNullParameter(credentialEntry, "credentialEntry");
            if (Build.VERSION.SDK_INT >= 34) {
                return Api34Impl.fromCredentialEntry(credentialEntry);
            }
            return null;
        }

        public final void marshall$credentials_release(PasswordCredentialEntry passwordCredentialEntry, Bundle bundle, int i) {
            Instant lastUsedTime;
            Intrinsics.checkNotNullParameter(passwordCredentialEntry, "<this>");
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            CredentialEntry.INSTANCE.marshallCommonProperties$credentials_release(passwordCredentialEntry, bundle, i);
            bundle.putParcelable(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_PENDING_INTENT_PREFIX + i, passwordCredentialEntry.getPendingIntent());
            bundle.putBoolean(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_PREFIX + i, passwordCredentialEntry.getIsAutoSelectAllowed());
            bundle.putBoolean(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_FROM_OPTION_PREFIX + i, passwordCredentialEntry.getIsAutoSelectAllowedFromOption());
            bundle.putBoolean(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_HAS_DEFAULT_ICON_PREFIX + i, passwordCredentialEntry.hasDefaultIcon());
            bundle.putCharSequence(CredentialEntry.EXTRA_CREDENTIAL_TITLE_PREFIX + i, passwordCredentialEntry.getUsername());
            bundle.putCharSequence(CredentialEntry.EXTRA_CREDENTIAL_TYPE_DISPLAY_NAME_PREFIX + i, passwordCredentialEntry.getTypeDisplayName());
            bundle.putParcelable(CredentialEntry.EXTRA_CREDENTIAL_TYPE_ICON_PREFIX + i, passwordCredentialEntry.getIcon());
            CharSequence displayName = passwordCredentialEntry.getDisplayName();
            if (displayName != null) {
                bundle.putCharSequence(CredentialEntry.EXTRA_CREDENTIAL_SUBTITLE_PREFIX + i, displayName);
            }
            if (Build.VERSION.SDK_INT < 26 || (lastUsedTime = passwordCredentialEntry.getLastUsedTime()) == null) {
                return;
            }
            bundle.putSerializable(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_LAST_USED_TIME_PREFIX + i, lastUsedTime);
        }

        public final PasswordCredentialEntry unmarshall$credentials_release(Bundle bundle, int index) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            try {
                String string = bundle.getString(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_OPTION_ID_PREFIX + index);
                Intrinsics.checkNotNull(string);
                Bundle bundle2 = bundle.getBundle(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_OPTION_DATA_PREFIX + index);
                Intrinsics.checkNotNull(bundle2);
                CharSequence charSequence = bundle.getCharSequence(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_ENTRY_GROUP_ID_PREFIX + index);
                boolean z = bundle.getBoolean(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_IS_DEFAULT_ICON_PREFERRED_AS_SINGLE_PROV_PREFIX + index, false);
                CharSequence charSequence2 = bundle.getCharSequence(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_AFFILIATED_DOMAIN_PREFIX + index);
                Parcelable parcelable = bundle.getParcelable(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_PENDING_INTENT_PREFIX + index);
                Intrinsics.checkNotNull(parcelable);
                PendingIntent pendingIntent = (PendingIntent) parcelable;
                boolean z2 = bundle.getBoolean(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_PREFIX + index, false);
                boolean z3 = bundle.getBoolean(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_IS_AUTO_SELECT_ALLOWED_FROM_OPTION_PREFIX + index, false);
                boolean z4 = bundle.getBoolean(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_HAS_DEFAULT_ICON_PREFIX + index, false);
                CharSequence charSequence3 = bundle.getCharSequence(CredentialEntry.EXTRA_CREDENTIAL_TITLE_PREFIX + index);
                Intrinsics.checkNotNull(charSequence3);
                CharSequence charSequence4 = bundle.getCharSequence(CredentialEntry.EXTRA_CREDENTIAL_TYPE_DISPLAY_NAME_PREFIX + index);
                Intrinsics.checkNotNull(charSequence4);
                Parcelable parcelable2 = bundle.getParcelable(CredentialEntry.EXTRA_CREDENTIAL_TYPE_ICON_PREFIX + index);
                Intrinsics.checkNotNull(parcelable2);
                Icon icon = (Icon) parcelable2;
                CharSequence charSequence5 = bundle.getCharSequence(CredentialEntry.EXTRA_CREDENTIAL_SUBTITLE_PREFIX + index);
                if (Build.VERSION.SDK_INT >= 26) {
                    return new PasswordCredentialEntry(charSequence3, charSequence5, charSequence4, pendingIntent, (Instant) bundle.getSerializable(CredentialEntry.EXTRA_CREDENTIAL_ENTRY_LAST_USED_TIME_PREFIX + index), icon, z2, BeginGetPasswordOption.INSTANCE.createFrom$credentials_release(bundle2, string), z, charSequence, charSequence2, null, z3, true, z4, 2048, null);
                }
                return new PasswordCredentialEntry(charSequence3, charSequence5, charSequence4, pendingIntent, null, icon, z2, BeginGetPasswordOption.INSTANCE.createFrom$credentials_release(bundle2, string), z, charSequence, charSequence2, null, z3, true, z4, 2048, null);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* compiled from: PasswordCredentialEntry.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001c\u0010\u000eJ\u0017\u0010\u001f\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0017¢\u0006\u0004\b\"\u0010\u001aJ\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010'R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010*R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010+R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010,R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010'R\u0016\u0010!\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010,R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010-¨\u0006."}, d2 = {"Landroidx/credentials/provider/PasswordCredentialEntry$Builder;", "", "Landroid/content/Context;", "context", "", "username", "Landroid/app/PendingIntent;", BaseGmsClient.KEY_PENDING_INTENT, "Landroidx/credentials/provider/BeginGetPasswordOption;", "beginGetPasswordOption", "<init>", "(Landroid/content/Context;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroidx/credentials/provider/BeginGetPasswordOption;)V", "displayName", "setDisplayName", "(Ljava/lang/CharSequence;)Landroidx/credentials/provider/PasswordCredentialEntry$Builder;", "Landroid/graphics/drawable/Icon;", "icon", "setIcon", "(Landroid/graphics/drawable/Icon;)Landroidx/credentials/provider/PasswordCredentialEntry$Builder;", "Landroidx/credentials/provider/BiometricPromptData;", "biometricPromptData", "setBiometricPromptData", "(Landroidx/credentials/provider/BiometricPromptData;)Landroidx/credentials/provider/PasswordCredentialEntry$Builder;", "", "autoSelectAllowed", "setAutoSelectAllowed", "(Z)Landroidx/credentials/provider/PasswordCredentialEntry$Builder;", "affiliatedDomain", "setAffiliatedDomain", "j$/time/Instant", "lastUsedTime", "setLastUsedTime", "(Lj$/time/Instant;)Landroidx/credentials/provider/PasswordCredentialEntry$Builder;", "isDefaultIconPreferredAsSingleProvider", "setDefaultIconPreferredAsSingleProvider", "Landroidx/credentials/provider/PasswordCredentialEntry;", "build", "()Landroidx/credentials/provider/PasswordCredentialEntry;", "Landroid/content/Context;", "Ljava/lang/CharSequence;", "Landroid/app/PendingIntent;", "Landroidx/credentials/provider/BeginGetPasswordOption;", "Lj$/time/Instant;", "Landroid/graphics/drawable/Icon;", "Z", "Landroidx/credentials/provider/BiometricPromptData;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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

        public Builder(Context context, CharSequence username, PendingIntent pendingIntent, BeginGetPasswordOption beginGetPasswordOption) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(username, "username");
            Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
            Intrinsics.checkNotNullParameter(beginGetPasswordOption, "beginGetPasswordOption");
            this.context = context;
            this.username = username;
            this.pendingIntent = pendingIntent;
            this.beginGetPasswordOption = beginGetPasswordOption;
        }

        public final Builder setDisplayName(CharSequence displayName) {
            this.displayName = displayName;
            return this;
        }

        public final Builder setIcon(Icon icon) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.icon = icon;
            return this;
        }

        public final Builder setBiometricPromptData(BiometricPromptData biometricPromptData) {
            this.biometricPromptData = biometricPromptData;
            return this;
        }

        public final Builder setAutoSelectAllowed(boolean autoSelectAllowed) {
            this.autoSelectAllowed = autoSelectAllowed;
            return this;
        }

        public final Builder setAffiliatedDomain(CharSequence affiliatedDomain) {
            this.affiliatedDomain = affiliatedDomain;
            return this;
        }

        public final Builder setLastUsedTime(Instant lastUsedTime) {
            this.lastUsedTime = lastUsedTime;
            return this;
        }

        public final Builder setDefaultIconPreferredAsSingleProvider(boolean isDefaultIconPreferredAsSingleProvider) {
            this.isDefaultIconPreferredAsSingleProvider = isDefaultIconPreferredAsSingleProvider;
            return this;
        }

        public final PasswordCredentialEntry build() {
            if (this.icon == null) {
                this.icon = Icon.createWithResource(this.context, R.drawable.ic_password);
            }
            String string = this.context.getString(R.string.android_credentials_TYPE_PASSWORD_CREDENTIAL);
            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…TYPE_PASSWORD_CREDENTIAL)");
            PendingIntent pendingIntent = this.pendingIntent;
            Instant instant = this.lastUsedTime;
            Icon icon = this.icon;
            Intrinsics.checkNotNull(icon);
            return new PasswordCredentialEntry(this.username, this.displayName, string, pendingIntent, instant, icon, this.autoSelectAllowed, this.beginGetPasswordOption, this.isDefaultIconPreferredAsSingleProvider, null, this.affiliatedDomain, this.biometricPromptData, false, false, false, 29184, null);
        }
    }
}
