package ru.sberdevices.salutevision.core.data;

import android.graphics.PointF;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.sberdevices.salutevision.core.utils.Matrix4d;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u000fJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u001a\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u000b\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a¨\u0006\u001b"}, d2 = {"Lru/sberdevices/salutevision/core/data/SaluteVisionRecognition;", "", "geometry", "", "Landroid/graphics/PointF;", "getGeometry", "()Ljava/util/List;", "info", "Lru/sberdevices/salutevision/core/data/SaluteVisionRecognition$Info;", "getInfo", "()Lru/sberdevices/salutevision/core/data/SaluteVisionRecognition$Info;", "transform", "", "matrix", "Lru/sberdevices/salutevision/core/utils/Matrix4d;", "Info", "Lru/sberdevices/salutevision/core/data/BarcodeRecognition;", "Lru/sberdevices/salutevision/core/data/DocumentRecognition;", "Lru/sberdevices/salutevision/core/data/DriverLicenseRecognition;", "Lru/sberdevices/salutevision/core/data/LoyaltyCardRecognition;", "Lru/sberdevices/salutevision/core/data/MrzRecognition;", "Lru/sberdevices/salutevision/core/data/ObjectClassRecognition;", "Lru/sberdevices/salutevision/core/data/PassportRecognition;", "Lru/sberdevices/salutevision/core/data/PaycardRecognition;", "Lru/sberdevices/salutevision/core/data/PhoneRecognition;", "Lru/sberdevices/salutevision/core/data/SceneRecognition;", "Lru/sberdevices/salutevision/core/data/TextRecognition;", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SaluteVisionRecognition {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void transform(@NotNull SaluteVisionRecognition saluteVisionRecognition, @NotNull Matrix4d matrix) {
            Intrinsics.checkNotNullParameter(matrix, "matrix");
            List<PointF> geometry = saluteVisionRecognition.getGeometry();
            if (geometry != null) {
                for (PointF pointF : geometry) {
                    pointF.set(matrix.times(pointF));
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/sberdevices/salutevision/core/data/SaluteVisionRecognition$Info;", "", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Info {
    }

    List<PointF> getGeometry();

    Info getInfo();

    void transform(@NotNull Matrix4d matrix);
}
