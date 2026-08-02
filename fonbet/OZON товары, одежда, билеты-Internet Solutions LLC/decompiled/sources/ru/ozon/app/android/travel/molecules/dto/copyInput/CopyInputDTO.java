package ru.ozon.app.android.travel.molecules.dto.copyInput;

import Ak.b;
import N3.C3660k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/copyInput/CopyInputDTO;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "iconName", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getValue", "()Ljava/lang/String;", "getIconName", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CopyInputDTO {

    @NotNull
    private final CommonControlSettings common;
    private final String iconName;

    @NotNull
    private final String value;

    public CopyInputDTO(@NotNull String value, String str, @NotNull CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(common, "common");
        this.value = value;
        this.iconName = str;
        this.common = common;
    }

    public static /* synthetic */ CopyInputDTO copy$default(CopyInputDTO copyInputDTO, String str, String str2, CommonControlSettings commonControlSettings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = copyInputDTO.value;
        }
        if ((i11 & 2) != 0) {
            str2 = copyInputDTO.iconName;
        }
        if ((i11 & 4) != 0) {
            commonControlSettings = copyInputDTO.common;
        }
        return copyInputDTO.copy(str, str2, commonControlSettings);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIconName() {
        return this.iconName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final CopyInputDTO copy(@NotNull String value, String iconName, @NotNull CommonControlSettings common) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(common, "common");
        return new CopyInputDTO(value, iconName, common);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CopyInputDTO)) {
            return false;
        }
        CopyInputDTO copyInputDTO = (CopyInputDTO) other;
        return Intrinsics.d(this.value, copyInputDTO.value) && Intrinsics.d(this.iconName, copyInputDTO.iconName) && Intrinsics.d(this.common, copyInputDTO.common);
    }

    @NotNull
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    public final String getIconName() {
        return this.iconName;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = this.value.hashCode() * 31;
        String str = this.iconName;
        return this.common.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.value;
        String str2 = this.iconName;
        return b.g(C3660k.d("CopyInputDTO(value=", str, ", iconName=", str2, ", common="), this.common, ")");
    }
}
