package io.intercom.android.sdk.models;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AttachmentSettings.kt */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0001)BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003JU\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\fHÇ\u0001J\u0013\u0010$\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010&\u001a\u00020'H×\u0001J\t\u0010(\u001a\u00020\nH×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lio/intercom/android/sdk/models/AttachmentSettings;", "", "cameraEnabled", "", "mediaEnabled", "filesEnabled", "gifsEnabled", "voiceNotesEnabled", "trustedFileExtensions", "", "", "uploadSizeLimit", "", "<init>", "(ZZZZZLjava/util/Set;J)V", "getCameraEnabled", "()Z", "getMediaEnabled", "getFilesEnabled", "getGifsEnabled", "getVoiceNotesEnabled", "getTrustedFileExtensions", "()Ljava/util/Set;", "getUploadSizeLimit", "()J", "uploadSizeLimitMB", "getUploadSizeLimitMB", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AttachmentSettings {
    private static final long DEFAULT_UPLOAD_SIZE_LIMIT = 104857600;

    @SerializedName("conversation_camera_enabled")
    private final boolean cameraEnabled;

    @SerializedName("conversation_files_enabled")
    private final boolean filesEnabled;

    @SerializedName("conversation_gifs_enabled")
    private final boolean gifsEnabled;

    @SerializedName("conversation_media_enabled")
    private final boolean mediaEnabled;

    @SerializedName("file_upload_extension_trusted_list")
    private final Set<String> trustedFileExtensions;

    @SerializedName("upload_size_limit")
    private final long uploadSizeLimit;

    @SerializedName("conversation_voice_notes_enabled")
    private final boolean voiceNotesEnabled;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final AttachmentSettings DEFAULT = new AttachmentSettings(true, true, true, true, true, SetsKt.emptySet(), 104857600);

    public static /* synthetic */ AttachmentSettings copy$default(AttachmentSettings attachmentSettings, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Set set, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            z = attachmentSettings.cameraEnabled;
        }
        if ((i & 2) != 0) {
            z2 = attachmentSettings.mediaEnabled;
        }
        if ((i & 4) != 0) {
            z3 = attachmentSettings.filesEnabled;
        }
        if ((i & 8) != 0) {
            z4 = attachmentSettings.gifsEnabled;
        }
        if ((i & 16) != 0) {
            z5 = attachmentSettings.voiceNotesEnabled;
        }
        if ((i & 32) != 0) {
            set = attachmentSettings.trustedFileExtensions;
        }
        if ((i & 64) != 0) {
            j = attachmentSettings.uploadSizeLimit;
        }
        long j2 = j;
        boolean z6 = z5;
        Set set2 = set;
        return attachmentSettings.copy(z, z2, z3, z4, z6, set2, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getCameraEnabled() {
        return this.cameraEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getMediaEnabled() {
        return this.mediaEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getFilesEnabled() {
        return this.filesEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getGifsEnabled() {
        return this.gifsEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getVoiceNotesEnabled() {
        return this.voiceNotesEnabled;
    }

    public final Set<String> component6() {
        return this.trustedFileExtensions;
    }

    /* renamed from: component7, reason: from getter */
    public final long getUploadSizeLimit() {
        return this.uploadSizeLimit;
    }

    public final AttachmentSettings copy(boolean cameraEnabled, boolean mediaEnabled, boolean filesEnabled, boolean gifsEnabled, boolean voiceNotesEnabled, Set<String> trustedFileExtensions, long uploadSizeLimit) {
        Intrinsics.checkNotNullParameter(trustedFileExtensions, "trustedFileExtensions");
        return new AttachmentSettings(cameraEnabled, mediaEnabled, filesEnabled, gifsEnabled, voiceNotesEnabled, trustedFileExtensions, uploadSizeLimit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttachmentSettings)) {
            return false;
        }
        AttachmentSettings attachmentSettings = (AttachmentSettings) other;
        return this.cameraEnabled == attachmentSettings.cameraEnabled && this.mediaEnabled == attachmentSettings.mediaEnabled && this.filesEnabled == attachmentSettings.filesEnabled && this.gifsEnabled == attachmentSettings.gifsEnabled && this.voiceNotesEnabled == attachmentSettings.voiceNotesEnabled && Intrinsics.areEqual(this.trustedFileExtensions, attachmentSettings.trustedFileExtensions) && this.uploadSizeLimit == attachmentSettings.uploadSizeLimit;
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.cameraEnabled) * 31) + Boolean.hashCode(this.mediaEnabled)) * 31) + Boolean.hashCode(this.filesEnabled)) * 31) + Boolean.hashCode(this.gifsEnabled)) * 31) + Boolean.hashCode(this.voiceNotesEnabled)) * 31) + this.trustedFileExtensions.hashCode()) * 31) + Long.hashCode(this.uploadSizeLimit);
    }

    public String toString() {
        return "AttachmentSettings(cameraEnabled=" + this.cameraEnabled + ", mediaEnabled=" + this.mediaEnabled + ", filesEnabled=" + this.filesEnabled + ", gifsEnabled=" + this.gifsEnabled + ", voiceNotesEnabled=" + this.voiceNotesEnabled + ", trustedFileExtensions=" + this.trustedFileExtensions + ", uploadSizeLimit=" + this.uploadSizeLimit + ')';
    }

    public AttachmentSettings(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Set<String> trustedFileExtensions, long j) {
        Intrinsics.checkNotNullParameter(trustedFileExtensions, "trustedFileExtensions");
        this.cameraEnabled = z;
        this.mediaEnabled = z2;
        this.filesEnabled = z3;
        this.gifsEnabled = z4;
        this.voiceNotesEnabled = z5;
        this.trustedFileExtensions = trustedFileExtensions;
        this.uploadSizeLimit = j;
    }

    public final boolean getCameraEnabled() {
        return this.cameraEnabled;
    }

    public final boolean getMediaEnabled() {
        return this.mediaEnabled;
    }

    public final boolean getFilesEnabled() {
        return this.filesEnabled;
    }

    public final boolean getGifsEnabled() {
        return this.gifsEnabled;
    }

    public final boolean getVoiceNotesEnabled() {
        return this.voiceNotesEnabled;
    }

    public final Set<String> getTrustedFileExtensions() {
        return this.trustedFileExtensions;
    }

    public final long getUploadSizeLimit() {
        return this.uploadSizeLimit;
    }

    /* compiled from: AttachmentSettings.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/intercom/android/sdk/models/AttachmentSettings$Companion;", "", "<init>", "()V", "DEFAULT_UPLOAD_SIZE_LIMIT", "", "DEFAULT", "Lio/intercom/android/sdk/models/AttachmentSettings;", "getDEFAULT", "()Lio/intercom/android/sdk/models/AttachmentSettings;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AttachmentSettings getDEFAULT() {
            return AttachmentSettings.DEFAULT;
        }
    }

    public final String getUploadSizeLimitMB() {
        return String.valueOf(this.uploadSizeLimit / 1048576);
    }
}
