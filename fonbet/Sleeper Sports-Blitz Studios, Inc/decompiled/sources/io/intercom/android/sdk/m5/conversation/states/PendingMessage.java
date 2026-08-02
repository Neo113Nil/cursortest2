package io.intercom.android.sdk.m5.conversation.states;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.models.Part;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationClientState.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0019B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÇ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0015\u001a\u00020\u0016H×\u0001J\t\u0010\u0017\u001a\u00020\u0018H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/PendingMessage;", "", "part", "Lio/intercom/android/sdk/models/Part;", "isFailed", "", "failedImageUploadData", "Lio/intercom/android/sdk/m5/conversation/states/PendingMessage$FailedImageUploadData;", "<init>", "(Lio/intercom/android/sdk/models/Part;ZLio/intercom/android/sdk/m5/conversation/states/PendingMessage$FailedImageUploadData;)V", "getPart", "()Lio/intercom/android/sdk/models/Part;", "()Z", "getFailedImageUploadData", "()Lio/intercom/android/sdk/m5/conversation/states/PendingMessage$FailedImageUploadData;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "FailedImageUploadData", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class PendingMessage {
    public static final int $stable = 8;
    private final FailedImageUploadData failedImageUploadData;
    private final boolean isFailed;
    private final Part part;

    public static /* synthetic */ PendingMessage copy$default(PendingMessage pendingMessage, Part part, boolean z, FailedImageUploadData failedImageUploadData, int i, Object obj) {
        if ((i & 1) != 0) {
            part = pendingMessage.part;
        }
        if ((i & 2) != 0) {
            z = pendingMessage.isFailed;
        }
        if ((i & 4) != 0) {
            failedImageUploadData = pendingMessage.failedImageUploadData;
        }
        return pendingMessage.copy(part, z, failedImageUploadData);
    }

    /* renamed from: component1, reason: from getter */
    public final Part getPart() {
        return this.part;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsFailed() {
        return this.isFailed;
    }

    /* renamed from: component3, reason: from getter */
    public final FailedImageUploadData getFailedImageUploadData() {
        return this.failedImageUploadData;
    }

    public final PendingMessage copy(Part part, boolean isFailed, FailedImageUploadData failedImageUploadData) {
        Intrinsics.checkNotNullParameter(part, "part");
        return new PendingMessage(part, isFailed, failedImageUploadData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PendingMessage)) {
            return false;
        }
        PendingMessage pendingMessage = (PendingMessage) other;
        return Intrinsics.areEqual(this.part, pendingMessage.part) && this.isFailed == pendingMessage.isFailed && Intrinsics.areEqual(this.failedImageUploadData, pendingMessage.failedImageUploadData);
    }

    public int hashCode() {
        int hashCode = ((this.part.hashCode() * 31) + Boolean.hashCode(this.isFailed)) * 31;
        FailedImageUploadData failedImageUploadData = this.failedImageUploadData;
        return hashCode + (failedImageUploadData == null ? 0 : failedImageUploadData.hashCode());
    }

    public String toString() {
        return "PendingMessage(part=" + this.part + ", isFailed=" + this.isFailed + ", failedImageUploadData=" + this.failedImageUploadData + ')';
    }

    public PendingMessage(Part part, boolean z, FailedImageUploadData failedImageUploadData) {
        Intrinsics.checkNotNullParameter(part, "part");
        this.part = part;
        this.isFailed = z;
        this.failedImageUploadData = failedImageUploadData;
    }

    public /* synthetic */ PendingMessage(Part part, boolean z, FailedImageUploadData failedImageUploadData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(part, z, (i & 4) != 0 ? null : failedImageUploadData);
    }

    public final Part getPart() {
        return this.part;
    }

    public final boolean isFailed() {
        return this.isFailed;
    }

    public final FailedImageUploadData getFailedImageUploadData() {
        return this.failedImageUploadData;
    }

    /* compiled from: ConversationClientState.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0012\u001a\u00020\u0013H×\u0001J\t\u0010\u0014\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/PendingMessage$FailedImageUploadData;", "", "clientAssignedUUID", "", "imageData", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "<init>", "(Ljava/lang/String;Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;)V", "getClientAssignedUUID", "()Ljava/lang/String;", "getImageData", "()Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FailedImageUploadData {
        public static final int $stable = 8;
        private final String clientAssignedUUID;
        private final MediaData.Media imageData;

        public static /* synthetic */ FailedImageUploadData copy$default(FailedImageUploadData failedImageUploadData, String str, MediaData.Media media, int i, Object obj) {
            if ((i & 1) != 0) {
                str = failedImageUploadData.clientAssignedUUID;
            }
            if ((i & 2) != 0) {
                media = failedImageUploadData.imageData;
            }
            return failedImageUploadData.copy(str, media);
        }

        /* renamed from: component1, reason: from getter */
        public final String getClientAssignedUUID() {
            return this.clientAssignedUUID;
        }

        /* renamed from: component2, reason: from getter */
        public final MediaData.Media getImageData() {
            return this.imageData;
        }

        public final FailedImageUploadData copy(String clientAssignedUUID, MediaData.Media imageData) {
            Intrinsics.checkNotNullParameter(clientAssignedUUID, "clientAssignedUUID");
            Intrinsics.checkNotNullParameter(imageData, "imageData");
            return new FailedImageUploadData(clientAssignedUUID, imageData);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FailedImageUploadData)) {
                return false;
            }
            FailedImageUploadData failedImageUploadData = (FailedImageUploadData) other;
            return Intrinsics.areEqual(this.clientAssignedUUID, failedImageUploadData.clientAssignedUUID) && Intrinsics.areEqual(this.imageData, failedImageUploadData.imageData);
        }

        public int hashCode() {
            return (this.clientAssignedUUID.hashCode() * 31) + this.imageData.hashCode();
        }

        public String toString() {
            return "FailedImageUploadData(clientAssignedUUID=" + this.clientAssignedUUID + ", imageData=" + this.imageData + ')';
        }

        public FailedImageUploadData(String clientAssignedUUID, MediaData.Media imageData) {
            Intrinsics.checkNotNullParameter(clientAssignedUUID, "clientAssignedUUID");
            Intrinsics.checkNotNullParameter(imageData, "imageData");
            this.clientAssignedUUID = clientAssignedUUID;
            this.imageData = imageData;
        }

        public final String getClientAssignedUUID() {
            return this.clientAssignedUUID;
        }

        public final MediaData.Media getImageData() {
            return this.imageData;
        }
    }
}
