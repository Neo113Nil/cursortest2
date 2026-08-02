package ru.sberdevices.salutevision.core.data;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.camera.TakePhotoRequest;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lru/sberdevices/salutevision/core/data/RoiDetectorType;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "(Ljava/lang/String;II)V", "getValue", "()I", "BARCODE_ROI", TakePhotoRequest.BARCODE_SCANNER_TYPE, "PAYCARD_PHONENUMBER", "ONLY_DEFAULT", "Companion", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum RoiDetectorType {
    BARCODE_ROI(0),
    BARCODE(1),
    PAYCARD_PHONENUMBER(2),
    ONLY_DEFAULT(3);


    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lru/sberdevices/salutevision/core/data/RoiDetectorType$Companion;", "", "()V", "fromInt", "Lru/sberdevices/salutevision/core/data/RoiDetectorType;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RoiDetectorType fromInt(int value) {
            for (RoiDetectorType roiDetectorType : RoiDetectorType.values()) {
                if (roiDetectorType.getValue() == value) {
                    return roiDetectorType;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        private Companion() {
        }
    }

    RoiDetectorType(int i11) {
        this.value = i11;
    }

    public final int getValue() {
        return this.value;
    }
}
