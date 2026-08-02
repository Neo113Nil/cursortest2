package io.intercom.android.sdk.m5.conversation.states;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.ui.component.MediaPickerButtonKt;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationUiState.kt */
@Deprecated(message = "Use BottomBarButton instead")
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÇ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001b\u001a\u00020\u001cH×\u0001J\t\u0010\u001d\u001a\u00020\tH×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/InputTypeState;", "", "mediaInputEnabled", "", "gifInputEnabled", "cameraInputEnabled", "fileInputEnabled", "trustedFileExtensions", "", "", "<init>", "(ZZZZLjava/util/Set;)V", "getMediaInputEnabled", "()Z", "getGifInputEnabled", "getCameraInputEnabled", "getFileInputEnabled", "getTrustedFileExtensions", "()Ljava/util/Set;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class InputTypeState {
    private final boolean cameraInputEnabled;
    private final boolean fileInputEnabled;
    private final boolean gifInputEnabled;
    private final boolean mediaInputEnabled;
    private final Set<String> trustedFileExtensions;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InputTypeState DEFAULT = new InputTypeState(true, true, true, true, MediaPickerButtonKt.getDefaultTrustedFileExtensions());

    public static /* synthetic */ InputTypeState copy$default(InputTypeState inputTypeState, boolean z, boolean z2, boolean z3, boolean z4, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            z = inputTypeState.mediaInputEnabled;
        }
        if ((i & 2) != 0) {
            z2 = inputTypeState.gifInputEnabled;
        }
        if ((i & 4) != 0) {
            z3 = inputTypeState.cameraInputEnabled;
        }
        if ((i & 8) != 0) {
            z4 = inputTypeState.fileInputEnabled;
        }
        if ((i & 16) != 0) {
            set = inputTypeState.trustedFileExtensions;
        }
        Set set2 = set;
        boolean z5 = z3;
        return inputTypeState.copy(z, z2, z5, z4, set2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getMediaInputEnabled() {
        return this.mediaInputEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getGifInputEnabled() {
        return this.gifInputEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCameraInputEnabled() {
        return this.cameraInputEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getFileInputEnabled() {
        return this.fileInputEnabled;
    }

    public final Set<String> component5() {
        return this.trustedFileExtensions;
    }

    public final InputTypeState copy(boolean mediaInputEnabled, boolean gifInputEnabled, boolean cameraInputEnabled, boolean fileInputEnabled, Set<String> trustedFileExtensions) {
        Intrinsics.checkNotNullParameter(trustedFileExtensions, "trustedFileExtensions");
        return new InputTypeState(mediaInputEnabled, gifInputEnabled, cameraInputEnabled, fileInputEnabled, trustedFileExtensions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputTypeState)) {
            return false;
        }
        InputTypeState inputTypeState = (InputTypeState) other;
        return this.mediaInputEnabled == inputTypeState.mediaInputEnabled && this.gifInputEnabled == inputTypeState.gifInputEnabled && this.cameraInputEnabled == inputTypeState.cameraInputEnabled && this.fileInputEnabled == inputTypeState.fileInputEnabled && Intrinsics.areEqual(this.trustedFileExtensions, inputTypeState.trustedFileExtensions);
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.mediaInputEnabled) * 31) + Boolean.hashCode(this.gifInputEnabled)) * 31) + Boolean.hashCode(this.cameraInputEnabled)) * 31) + Boolean.hashCode(this.fileInputEnabled)) * 31) + this.trustedFileExtensions.hashCode();
    }

    public String toString() {
        return "InputTypeState(mediaInputEnabled=" + this.mediaInputEnabled + ", gifInputEnabled=" + this.gifInputEnabled + ", cameraInputEnabled=" + this.cameraInputEnabled + ", fileInputEnabled=" + this.fileInputEnabled + ", trustedFileExtensions=" + this.trustedFileExtensions + ')';
    }

    public InputTypeState(boolean z, boolean z2, boolean z3, boolean z4, Set<String> trustedFileExtensions) {
        Intrinsics.checkNotNullParameter(trustedFileExtensions, "trustedFileExtensions");
        this.mediaInputEnabled = z;
        this.gifInputEnabled = z2;
        this.cameraInputEnabled = z3;
        this.fileInputEnabled = z4;
        this.trustedFileExtensions = trustedFileExtensions;
    }

    public final boolean getMediaInputEnabled() {
        return this.mediaInputEnabled;
    }

    public final boolean getGifInputEnabled() {
        return this.gifInputEnabled;
    }

    public final boolean getCameraInputEnabled() {
        return this.cameraInputEnabled;
    }

    public final boolean getFileInputEnabled() {
        return this.fileInputEnabled;
    }

    public final Set<String> getTrustedFileExtensions() {
        return this.trustedFileExtensions;
    }

    /* compiled from: ConversationUiState.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/states/InputTypeState$Companion;", "", "<init>", "()V", "DEFAULT", "Lio/intercom/android/sdk/m5/conversation/states/InputTypeState;", "getDEFAULT", "()Lio/intercom/android/sdk/m5/conversation/states/InputTypeState;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final InputTypeState getDEFAULT() {
            return InputTypeState.DEFAULT;
        }
    }
}
