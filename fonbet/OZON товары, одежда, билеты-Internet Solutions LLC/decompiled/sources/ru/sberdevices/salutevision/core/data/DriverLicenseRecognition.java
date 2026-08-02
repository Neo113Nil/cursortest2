package ru.sberdevices.salutevision.core.data;

import android.graphics.PointF;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.sberdevices.salutevision.core.data.SaluteVisionRecognition;
import ru.sberdevices.salutevision.core.utils.Matrix4d;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\""}, d2 = {"Lru/sberdevices/salutevision/core/data/DriverLicenseRecognition;", "Lru/sberdevices/salutevision/core/data/SaluteVisionRecognition;", "info", "Lru/sberdevices/salutevision/core/data/DriverLicenseRecognitionInfo;", "geometry", "", "Landroid/graphics/PointF;", "fieldsGeometry", "Lru/sberdevices/salutevision/core/data/DriverLicenseFieldsGeometry;", "(Lru/sberdevices/salutevision/core/data/DriverLicenseRecognitionInfo;Ljava/util/List;Lru/sberdevices/salutevision/core/data/DriverLicenseFieldsGeometry;)V", "getFieldsGeometry", "()Lru/sberdevices/salutevision/core/data/DriverLicenseFieldsGeometry;", "setFieldsGeometry", "(Lru/sberdevices/salutevision/core/data/DriverLicenseFieldsGeometry;)V", "getGeometry", "()Ljava/util/List;", "setGeometry", "(Ljava/util/List;)V", "getInfo", "()Lru/sberdevices/salutevision/core/data/DriverLicenseRecognitionInfo;", "setInfo", "(Lru/sberdevices/salutevision/core/data/DriverLicenseRecognitionInfo;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DriverLicenseRecognition implements SaluteVisionRecognition {
    private DriverLicenseFieldsGeometry fieldsGeometry;
    private List<? extends PointF> geometry;
    private DriverLicenseRecognitionInfo info;

    public DriverLicenseRecognition() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DriverLicenseRecognition copy$default(DriverLicenseRecognition driverLicenseRecognition, DriverLicenseRecognitionInfo driverLicenseRecognitionInfo, List list, DriverLicenseFieldsGeometry driverLicenseFieldsGeometry, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            driverLicenseRecognitionInfo = driverLicenseRecognition.getInfo();
        }
        if ((i11 & 2) != 0) {
            list = driverLicenseRecognition.getGeometry();
        }
        if ((i11 & 4) != 0) {
            driverLicenseFieldsGeometry = driverLicenseRecognition.fieldsGeometry;
        }
        return driverLicenseRecognition.copy(driverLicenseRecognitionInfo, list, driverLicenseFieldsGeometry);
    }

    public final DriverLicenseRecognitionInfo component1() {
        return getInfo();
    }

    public final List<PointF> component2() {
        return getGeometry();
    }

    /* renamed from: component3, reason: from getter */
    public final DriverLicenseFieldsGeometry getFieldsGeometry() {
        return this.fieldsGeometry;
    }

    @NotNull
    public final DriverLicenseRecognition copy(DriverLicenseRecognitionInfo info, List<? extends PointF> geometry, DriverLicenseFieldsGeometry fieldsGeometry) {
        return new DriverLicenseRecognition(info, geometry, fieldsGeometry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DriverLicenseRecognition)) {
            return false;
        }
        DriverLicenseRecognition driverLicenseRecognition = (DriverLicenseRecognition) other;
        return Intrinsics.d(getInfo(), driverLicenseRecognition.getInfo()) && Intrinsics.d(getGeometry(), driverLicenseRecognition.getGeometry()) && Intrinsics.d(this.fieldsGeometry, driverLicenseRecognition.fieldsGeometry);
    }

    public final DriverLicenseFieldsGeometry getFieldsGeometry() {
        return this.fieldsGeometry;
    }

    @Override // ru.sberdevices.salutevision.core.data.SaluteVisionRecognition
    public List<PointF> getGeometry() {
        return this.geometry;
    }

    public int hashCode() {
        int hashCode = (((getInfo() == null ? 0 : getInfo().hashCode()) * 31) + (getGeometry() == null ? 0 : getGeometry().hashCode())) * 31;
        DriverLicenseFieldsGeometry driverLicenseFieldsGeometry = this.fieldsGeometry;
        return hashCode + (driverLicenseFieldsGeometry != null ? driverLicenseFieldsGeometry.hashCode() : 0);
    }

    public final void setFieldsGeometry(DriverLicenseFieldsGeometry driverLicenseFieldsGeometry) {
        this.fieldsGeometry = driverLicenseFieldsGeometry;
    }

    public void setGeometry(List<? extends PointF> list) {
        this.geometry = list;
    }

    public void setInfo(DriverLicenseRecognitionInfo driverLicenseRecognitionInfo) {
        this.info = driverLicenseRecognitionInfo;
    }

    @NotNull
    public String toString() {
        return "DriverLicenseRecognition(info=" + getInfo() + ", geometry=" + getGeometry() + ", fieldsGeometry=" + this.fieldsGeometry + ')';
    }

    @Override // ru.sberdevices.salutevision.core.data.SaluteVisionRecognition
    public void transform(@NotNull Matrix4d matrix4d) {
        SaluteVisionRecognition.DefaultImpls.transform(this, matrix4d);
    }

    public DriverLicenseRecognition(DriverLicenseRecognitionInfo driverLicenseRecognitionInfo, List<? extends PointF> list, DriverLicenseFieldsGeometry driverLicenseFieldsGeometry) {
        this.info = driverLicenseRecognitionInfo;
        this.geometry = list;
        this.fieldsGeometry = driverLicenseFieldsGeometry;
    }

    @Override // ru.sberdevices.salutevision.core.data.SaluteVisionRecognition
    public DriverLicenseRecognitionInfo getInfo() {
        return this.info;
    }

    public /* synthetic */ DriverLicenseRecognition(DriverLicenseRecognitionInfo driverLicenseRecognitionInfo, List list, DriverLicenseFieldsGeometry driverLicenseFieldsGeometry, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : driverLicenseRecognitionInfo, (i11 & 2) != 0 ? null : list, (i11 & 4) != 0 ? null : driverLicenseFieldsGeometry);
    }
}
