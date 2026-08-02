package ru.ozon.fintech.features.camera.domain;

import T7.E;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/fintech/features/camera/domain/CameraActions;", "", "<init>", "()V", "Init", "Flash", "ChangeCamera", "Lru/ozon/fintech/features/camera/domain/CameraActions$ChangeCamera;", "Lru/ozon/fintech/features/camera/domain/CameraActions$Flash;", "Lru/ozon/fintech/features/camera/domain/CameraActions$Init;", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class CameraActions {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/fintech/features/camera/domain/CameraActions$ChangeCamera;", "Lru/ozon/fintech/features/camera/domain/CameraActions;", "cameraLens", "", "<init>", "(I)V", "getCameraLens", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChangeCamera extends CameraActions {
        private final int cameraLens;

        public ChangeCamera(int i11) {
            super(null);
            this.cameraLens = i11;
        }

        public static /* synthetic */ ChangeCamera copy$default(ChangeCamera changeCamera, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = changeCamera.cameraLens;
            }
            return changeCamera.copy(i11);
        }

        /* renamed from: component1, reason: from getter */
        public final int getCameraLens() {
            return this.cameraLens;
        }

        @NotNull
        public final ChangeCamera copy(int cameraLens) {
            return new ChangeCamera(cameraLens);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChangeCamera) && this.cameraLens == ((ChangeCamera) other).cameraLens;
        }

        public final int getCameraLens() {
            return this.cameraLens;
        }

        public int hashCode() {
            return Integer.hashCode(this.cameraLens);
        }

        @NotNull
        public String toString() {
            return E.a(this.cameraLens, "ChangeCamera(cameraLens=", ")");
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lru/ozon/fintech/features/camera/domain/CameraActions$Flash;", "Lru/ozon/fintech/features/camera/domain/CameraActions;", "flashViewType", "Lru/ozon/fintech/features/camera/domain/CameraActions$Flash$FlashViewType;", "<init>", "(Lru/ozon/fintech/features/camera/domain/CameraActions$Flash$FlashViewType;)V", "getFlashViewType", "()Lru/ozon/fintech/features/camera/domain/CameraActions$Flash$FlashViewType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "FlashViewType", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Flash extends CameraActions {

        @NotNull
        private final FlashViewType flashViewType;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/fintech/features/camera/domain/CameraActions$Flash$FlashViewType;", "", "<init>", "(Ljava/lang/String;I)V", "FLASH_ON", "FLASH_OFF", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class FlashViewType {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ FlashViewType[] $VALUES;
            public static final FlashViewType FLASH_ON = new FlashViewType("FLASH_ON", 0);
            public static final FlashViewType FLASH_OFF = new FlashViewType("FLASH_OFF", 1);

            private static final /* synthetic */ FlashViewType[] $values() {
                return new FlashViewType[]{FLASH_ON, FLASH_OFF};
            }

            static {
                FlashViewType[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private FlashViewType(String str, int i11) {
            }

            @NotNull
            public static a<FlashViewType> getEntries() {
                return $ENTRIES;
            }

            public static FlashViewType valueOf(String str) {
                return (FlashViewType) Enum.valueOf(FlashViewType.class, str);
            }

            public static FlashViewType[] values() {
                return (FlashViewType[]) $VALUES.clone();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Flash(@NotNull FlashViewType flashViewType) {
            super(null);
            Intrinsics.checkNotNullParameter(flashViewType, "flashViewType");
            this.flashViewType = flashViewType;
        }

        public static /* synthetic */ Flash copy$default(Flash flash, FlashViewType flashViewType, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                flashViewType = flash.flashViewType;
            }
            return flash.copy(flashViewType);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final FlashViewType getFlashViewType() {
            return this.flashViewType;
        }

        @NotNull
        public final Flash copy(@NotNull FlashViewType flashViewType) {
            Intrinsics.checkNotNullParameter(flashViewType, "flashViewType");
            return new Flash(flashViewType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Flash) && this.flashViewType == ((Flash) other).flashViewType;
        }

        @NotNull
        public final FlashViewType getFlashViewType() {
            return this.flashViewType;
        }

        public int hashCode() {
            return this.flashViewType.hashCode();
        }

        @NotNull
        public String toString() {
            return "Flash(flashViewType=" + this.flashViewType + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/fintech/features/camera/domain/CameraActions$Init;", "Lru/ozon/fintech/features/camera/domain/CameraActions;", "<init>", "()V", "camera_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Init extends CameraActions {

        @NotNull
        public static final Init INSTANCE = new Init();

        private Init() {
            super(null);
        }
    }

    public /* synthetic */ CameraActions(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CameraActions() {
    }
}
