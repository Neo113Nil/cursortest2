package ru.sberdevices.salutevision.core.data;

import android.graphics.PointF;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.sberdevices.salutevision.core.data.SaluteVisionRecognition;
import ru.sberdevices.salutevision.core.utils.Matrix4d;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/sberdevices/salutevision/core/data/MrzRecognition;", "Lru/sberdevices/salutevision/core/data/SaluteVisionRecognition;", "info", "Lru/sberdevices/salutevision/core/data/MrzRecognitionInfo;", "geometry", "", "Landroid/graphics/PointF;", "(Lru/sberdevices/salutevision/core/data/MrzRecognitionInfo;Ljava/util/List;)V", "getGeometry", "()Ljava/util/List;", "setGeometry", "(Ljava/util/List;)V", "getInfo", "()Lru/sberdevices/salutevision/core/data/MrzRecognitionInfo;", "setInfo", "(Lru/sberdevices/salutevision/core/data/MrzRecognitionInfo;)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MrzRecognition implements SaluteVisionRecognition {
    private List<? extends PointF> geometry;
    private MrzRecognitionInfo info;

    /* JADX WARN: Multi-variable type inference failed */
    public MrzRecognition() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MrzRecognition copy$default(MrzRecognition mrzRecognition, MrzRecognitionInfo mrzRecognitionInfo, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            mrzRecognitionInfo = mrzRecognition.getInfo();
        }
        if ((i11 & 2) != 0) {
            list = mrzRecognition.getGeometry();
        }
        return mrzRecognition.copy(mrzRecognitionInfo, list);
    }

    public final MrzRecognitionInfo component1() {
        return getInfo();
    }

    public final List<PointF> component2() {
        return getGeometry();
    }

    @NotNull
    public final MrzRecognition copy(MrzRecognitionInfo info, List<? extends PointF> geometry) {
        return new MrzRecognition(info, geometry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MrzRecognition)) {
            return false;
        }
        MrzRecognition mrzRecognition = (MrzRecognition) other;
        return Intrinsics.d(getInfo(), mrzRecognition.getInfo()) && Intrinsics.d(getGeometry(), mrzRecognition.getGeometry());
    }

    @Override // ru.sberdevices.salutevision.core.data.SaluteVisionRecognition
    public List<PointF> getGeometry() {
        return this.geometry;
    }

    public int hashCode() {
        return ((getInfo() == null ? 0 : getInfo().hashCode()) * 31) + (getGeometry() != null ? getGeometry().hashCode() : 0);
    }

    public void setGeometry(List<? extends PointF> list) {
        this.geometry = list;
    }

    public void setInfo(MrzRecognitionInfo mrzRecognitionInfo) {
        this.info = mrzRecognitionInfo;
    }

    @NotNull
    public String toString() {
        return "MrzRecognition(info=" + getInfo() + ", geometry=" + getGeometry() + ')';
    }

    @Override // ru.sberdevices.salutevision.core.data.SaluteVisionRecognition
    public void transform(@NotNull Matrix4d matrix4d) {
        SaluteVisionRecognition.DefaultImpls.transform(this, matrix4d);
    }

    public MrzRecognition(MrzRecognitionInfo mrzRecognitionInfo, List<? extends PointF> list) {
        this.info = mrzRecognitionInfo;
        this.geometry = list;
    }

    @Override // ru.sberdevices.salutevision.core.data.SaluteVisionRecognition
    public MrzRecognitionInfo getInfo() {
        return this.info;
    }

    public /* synthetic */ MrzRecognition(MrzRecognitionInfo mrzRecognitionInfo, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : mrzRecognitionInfo, (i11 & 2) != 0 ? null : list);
    }
}
