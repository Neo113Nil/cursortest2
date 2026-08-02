package ru.ozon.fintech.features.camera.domain;

import B4.V;
import G.g;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.camera.presentation.camera.CameraFragment;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/fintech/features/camera/domain/State;", "", "<init>", "()V", "None", "CameraPreview", "NeedConfirm", "Lru/ozon/fintech/features/camera/domain/State$CameraPreview;", "Lru/ozon/fintech/features/camera/domain/State$NeedConfirm;", "Lru/ozon/fintech/features/camera/domain/State$None;", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class State {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/fintech/features/camera/domain/State$CameraPreview;", "Lru/ozon/fintech/features/camera/domain/State;", "workingMode", "Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment$WorkingMode;", "previewCameraTitle", "", "previewCameraTitleBias", "", "<init>", "(Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment$WorkingMode;Ljava/lang/String;F)V", "getWorkingMode", "()Lru/ozon/fintech/features/camera/presentation/camera/CameraFragment$WorkingMode;", "getPreviewCameraTitle", "()Ljava/lang/String;", "getPreviewCameraTitleBias", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CameraPreview extends State {

        @NotNull
        private final String previewCameraTitle;
        private final float previewCameraTitleBias;

        @NotNull
        private final CameraFragment.WorkingMode workingMode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CameraPreview(@NotNull CameraFragment.WorkingMode workingMode, @NotNull String previewCameraTitle, float f7) {
            super(null);
            Intrinsics.checkNotNullParameter(workingMode, "workingMode");
            Intrinsics.checkNotNullParameter(previewCameraTitle, "previewCameraTitle");
            this.workingMode = workingMode;
            this.previewCameraTitle = previewCameraTitle;
            this.previewCameraTitleBias = f7;
        }

        public static /* synthetic */ CameraPreview copy$default(CameraPreview cameraPreview, CameraFragment.WorkingMode workingMode, String str, float f7, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                workingMode = cameraPreview.workingMode;
            }
            if ((i11 & 2) != 0) {
                str = cameraPreview.previewCameraTitle;
            }
            if ((i11 & 4) != 0) {
                f7 = cameraPreview.previewCameraTitleBias;
            }
            return cameraPreview.copy(workingMode, str, f7);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CameraFragment.WorkingMode getWorkingMode() {
            return this.workingMode;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getPreviewCameraTitle() {
            return this.previewCameraTitle;
        }

        /* renamed from: component3, reason: from getter */
        public final float getPreviewCameraTitleBias() {
            return this.previewCameraTitleBias;
        }

        @NotNull
        public final CameraPreview copy(@NotNull CameraFragment.WorkingMode workingMode, @NotNull String previewCameraTitle, float previewCameraTitleBias) {
            Intrinsics.checkNotNullParameter(workingMode, "workingMode");
            Intrinsics.checkNotNullParameter(previewCameraTitle, "previewCameraTitle");
            return new CameraPreview(workingMode, previewCameraTitle, previewCameraTitleBias);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CameraPreview)) {
                return false;
            }
            CameraPreview cameraPreview = (CameraPreview) other;
            return this.workingMode == cameraPreview.workingMode && Intrinsics.d(this.previewCameraTitle, cameraPreview.previewCameraTitle) && Float.compare(this.previewCameraTitleBias, cameraPreview.previewCameraTitleBias) == 0;
        }

        @NotNull
        public final String getPreviewCameraTitle() {
            return this.previewCameraTitle;
        }

        public final float getPreviewCameraTitleBias() {
            return this.previewCameraTitleBias;
        }

        @NotNull
        public final CameraFragment.WorkingMode getWorkingMode() {
            return this.workingMode;
        }

        public int hashCode() {
            return Float.hashCode(this.previewCameraTitleBias) + g.a(this.workingMode.hashCode() * 31, 31, this.previewCameraTitle);
        }

        @NotNull
        public String toString() {
            CameraFragment.WorkingMode workingMode = this.workingMode;
            String str = this.previewCameraTitle;
            float f7 = this.previewCameraTitleBias;
            StringBuilder sb2 = new StringBuilder("CameraPreview(workingMode=");
            sb2.append(workingMode);
            sb2.append(", previewCameraTitle=");
            sb2.append(str);
            sb2.append(", previewCameraTitleBias=");
            return V.b(f7, ")", sb2);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/fintech/features/camera/domain/State$NeedConfirm;", "Lru/ozon/fintech/features/camera/domain/State;", "photoFileUri", "Landroid/net/Uri;", "titleText", "", "<init>", "(Landroid/net/Uri;Ljava/lang/String;)V", "getPhotoFileUri", "()Landroid/net/Uri;", "getTitleText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NeedConfirm extends State {

        @NotNull
        private final Uri photoFileUri;

        @NotNull
        private final String titleText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NeedConfirm(@NotNull Uri photoFileUri, @NotNull String titleText) {
            super(null);
            Intrinsics.checkNotNullParameter(photoFileUri, "photoFileUri");
            Intrinsics.checkNotNullParameter(titleText, "titleText");
            this.photoFileUri = photoFileUri;
            this.titleText = titleText;
        }

        public static /* synthetic */ NeedConfirm copy$default(NeedConfirm needConfirm, Uri uri, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                uri = needConfirm.photoFileUri;
            }
            if ((i11 & 2) != 0) {
                str = needConfirm.titleText;
            }
            return needConfirm.copy(uri, str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Uri getPhotoFileUri() {
            return this.photoFileUri;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTitleText() {
            return this.titleText;
        }

        @NotNull
        public final NeedConfirm copy(@NotNull Uri photoFileUri, @NotNull String titleText) {
            Intrinsics.checkNotNullParameter(photoFileUri, "photoFileUri");
            Intrinsics.checkNotNullParameter(titleText, "titleText");
            return new NeedConfirm(photoFileUri, titleText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NeedConfirm)) {
                return false;
            }
            NeedConfirm needConfirm = (NeedConfirm) other;
            return Intrinsics.d(this.photoFileUri, needConfirm.photoFileUri) && Intrinsics.d(this.titleText, needConfirm.titleText);
        }

        @NotNull
        public final Uri getPhotoFileUri() {
            return this.photoFileUri;
        }

        @NotNull
        public final String getTitleText() {
            return this.titleText;
        }

        public int hashCode() {
            return this.titleText.hashCode() + (this.photoFileUri.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "NeedConfirm(photoFileUri=" + this.photoFileUri + ", titleText=" + this.titleText + ")";
        }

        public /* synthetic */ NeedConfirm(Uri uri, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(uri, (i11 & 2) != 0 ? "" : str);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/fintech/features/camera/domain/State$None;", "Lru/ozon/fintech/features/camera/domain/State;", "<init>", "()V", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class None extends State {

        @NotNull
        public static final None INSTANCE = new None();

        private None() {
            super(null);
        }
    }

    public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private State() {
    }
}
