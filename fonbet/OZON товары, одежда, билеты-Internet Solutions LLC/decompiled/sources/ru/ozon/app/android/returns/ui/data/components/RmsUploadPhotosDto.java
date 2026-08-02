package ru.ozon.app.android.returns.ui.data.components;

import K1.G;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tHÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J^\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\b\b\u0003\u0010\f\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0007HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006&"}, d2 = {"Lru/ozon/app/android/returns/ui/data/components/RmsUploadPhotosDto;", "Lru/ozon/app/android/returns/ui/data/components/Component;", "isRequired", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "limit", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "imageLocations", "Lru/ozon/app/android/returns/ui/data/components/RmsImageLocation;", "subtext", "<init>", "(ZLjava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "()Z", "getName", "()Ljava/lang/String;", "getLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getValue", "()Ljava/util/List;", "getImageLocations", "getSubtext", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(ZLjava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Lru/ozon/app/android/returns/ui/data/components/RmsUploadPhotosDto;", "equals", "other", "", "hashCode", "toString", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class RmsUploadPhotosDto implements Component {
    private final List<RmsImageLocation> imageLocations;
    private final boolean isRequired;
    private final Integer limit;
    private final String name;

    @NotNull
    private final String subtext;
    private final List<String> value;

    public RmsUploadPhotosDto(boolean z11, String str, @i(name = "limit") Integer num, @i(name = "value") List<String> list, List<RmsImageLocation> list2, @i(name = "subtext") @NotNull String subtext) {
        Intrinsics.checkNotNullParameter(subtext, "subtext");
        this.isRequired = z11;
        this.name = str;
        this.limit = num;
        this.value = list;
        this.imageLocations = list2;
        this.subtext = subtext;
    }

    public static /* synthetic */ RmsUploadPhotosDto copy$default(RmsUploadPhotosDto rmsUploadPhotosDto, boolean z11, String str, Integer num, List list, List list2, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = rmsUploadPhotosDto.isRequired;
        }
        if ((i11 & 2) != 0) {
            str = rmsUploadPhotosDto.name;
        }
        if ((i11 & 4) != 0) {
            num = rmsUploadPhotosDto.limit;
        }
        if ((i11 & 8) != 0) {
            list = rmsUploadPhotosDto.value;
        }
        if ((i11 & 16) != 0) {
            list2 = rmsUploadPhotosDto.imageLocations;
        }
        if ((i11 & 32) != 0) {
            str2 = rmsUploadPhotosDto.subtext;
        }
        List list3 = list2;
        String str3 = str2;
        return rmsUploadPhotosDto.copy(z11, str, num, list, list3, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getLimit() {
        return this.limit;
    }

    public final List<String> component4() {
        return this.value;
    }

    public final List<RmsImageLocation> component5() {
        return this.imageLocations;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getSubtext() {
        return this.subtext;
    }

    @NotNull
    public final RmsUploadPhotosDto copy(boolean isRequired, String name, @i(name = "limit") Integer limit, @i(name = "value") List<String> value, List<RmsImageLocation> imageLocations, @i(name = "subtext") @NotNull String subtext) {
        Intrinsics.checkNotNullParameter(subtext, "subtext");
        return new RmsUploadPhotosDto(isRequired, name, limit, value, imageLocations, subtext);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RmsUploadPhotosDto)) {
            return false;
        }
        RmsUploadPhotosDto rmsUploadPhotosDto = (RmsUploadPhotosDto) other;
        return this.isRequired == rmsUploadPhotosDto.isRequired && Intrinsics.d(this.name, rmsUploadPhotosDto.name) && Intrinsics.d(this.limit, rmsUploadPhotosDto.limit) && Intrinsics.d(this.value, rmsUploadPhotosDto.value) && Intrinsics.d(this.imageLocations, rmsUploadPhotosDto.imageLocations) && Intrinsics.d(this.subtext, rmsUploadPhotosDto.subtext);
    }

    public final List<RmsImageLocation> getImageLocations() {
        return this.imageLocations;
    }

    public final Integer getLimit() {
        return this.limit;
    }

    @Override // ru.ozon.app.android.returns.ui.data.components.Component
    public String getName() {
        return this.name;
    }

    @NotNull
    public final String getSubtext() {
        return this.subtext;
    }

    public final List<String> getValue() {
        return this.value;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isRequired) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.limit;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list = this.value;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<RmsImageLocation> list2 = this.imageLocations;
        return this.subtext.hashCode() + ((hashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    @Override // ru.ozon.app.android.returns.ui.data.components.Component
    public boolean isRequired() {
        return this.isRequired;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.isRequired;
        String str = this.name;
        Integer num = this.limit;
        List<String> list = this.value;
        List<RmsImageLocation> list2 = this.imageLocations;
        String str2 = this.subtext;
        StringBuilder d11 = G.d("RmsUploadPhotosDto(isRequired=", ", name=", str, ", limit=", z11);
        d11.append(num);
        d11.append(", value=");
        d11.append(list);
        d11.append(", imageLocations=");
        d11.append(list2);
        d11.append(", subtext=");
        d11.append(str2);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ RmsUploadPhotosDto(boolean z11, String str, Integer num, List list, List list2, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, str, num, list, list2, str2);
    }
}
