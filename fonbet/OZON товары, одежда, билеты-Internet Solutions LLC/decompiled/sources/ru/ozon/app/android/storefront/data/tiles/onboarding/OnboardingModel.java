package ru.ozon.app.android.storefront.data.tiles.onboarding;

import C.J;
import De.C2859b;
import Ns.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.cell.ImageTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001cHÖ\u0001J\t\u0010\"\u001a\u00020\bHÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006("}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/onboarding/OnboardingModel;", "Landroid/os/Parcelable;", "banner", "Lru/ozon/uni/atoms/data/cell/ImageTitleSubtitleCellDTO;", "closeButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "<init>", "(Lru/ozon/uni/atoms/data/cell/ImageTitleSubtitleCellDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;)V", "getBanner", "()Lru/ozon/uni/atoms/data/cell/ImageTitleSubtitleCellDTO;", "getCloseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class OnboardingModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OnboardingModel> CREATOR = new Creator();

    @NotNull
    private final ImageTitleSubtitleCellDTO banner;

    @NotNull
    private final IconButtonDTO closeButton;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<OnboardingModel> {
        @Override // android.os.Parcelable.Creator
        public final OnboardingModel createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ImageTitleSubtitleCellDTO imageTitleSubtitleCellDTO = (ImageTitleSubtitleCellDTO) parcel.readParcelable(OnboardingModel.class.getClassLoader());
            IconButtonDTO iconButtonDTO = (IconButtonDTO) parcel.readParcelable(OnboardingModel.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(OnboardingModel.class, parcel, linkedHashMap, parcel.readString(), i11, 1);
                }
            }
            return new OnboardingModel(imageTitleSubtitleCellDTO, iconButtonDTO, linkedHashMap, (TestInfo) parcel.readParcelable(OnboardingModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingModel[] newArray(int i11) {
            return new OnboardingModel[i11];
        }
    }

    public OnboardingModel(@NotNull ImageTitleSubtitleCellDTO banner, @NotNull IconButtonDTO closeButton, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        this.banner = banner;
        this.closeButton = closeButton;
        this.trackingInfo = map;
        this.testInfo = testInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OnboardingModel copy$default(OnboardingModel onboardingModel, ImageTitleSubtitleCellDTO imageTitleSubtitleCellDTO, IconButtonDTO iconButtonDTO, Map map, TestInfo testInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageTitleSubtitleCellDTO = onboardingModel.banner;
        }
        if ((i11 & 2) != 0) {
            iconButtonDTO = onboardingModel.closeButton;
        }
        if ((i11 & 4) != 0) {
            map = onboardingModel.trackingInfo;
        }
        if ((i11 & 8) != 0) {
            testInfo = onboardingModel.testInfo;
        }
        return onboardingModel.copy(imageTitleSubtitleCellDTO, iconButtonDTO, map, testInfo);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ImageTitleSubtitleCellDTO getBanner() {
        return this.banner;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final IconButtonDTO getCloseButton() {
        return this.closeButton;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    @NotNull
    public final OnboardingModel copy(@NotNull ImageTitleSubtitleCellDTO banner, @NotNull IconButtonDTO closeButton, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        return new OnboardingModel(banner, closeButton, trackingInfo, testInfo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnboardingModel)) {
            return false;
        }
        OnboardingModel onboardingModel = (OnboardingModel) other;
        return Intrinsics.d(this.banner, onboardingModel.banner) && Intrinsics.d(this.closeButton, onboardingModel.closeButton) && Intrinsics.d(this.trackingInfo, onboardingModel.trackingInfo) && Intrinsics.d(this.testInfo, onboardingModel.testInfo);
    }

    @NotNull
    public final ImageTitleSubtitleCellDTO getBanner() {
        return this.banner;
    }

    @NotNull
    public final IconButtonDTO getCloseButton() {
        return this.closeButton;
    }

    public final TestInfo getTestInfo() {
        return this.testInfo;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = (this.closeButton.hashCode() + (this.banner.hashCode() * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        TestInfo testInfo = this.testInfo;
        return hashCode2 + (testInfo != null ? testInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ImageTitleSubtitleCellDTO imageTitleSubtitleCellDTO = this.banner;
        IconButtonDTO iconButtonDTO = this.closeButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        StringBuilder sb2 = new StringBuilder("OnboardingModel(banner=");
        sb2.append(imageTitleSubtitleCellDTO);
        sb2.append(", closeButton=");
        sb2.append(iconButtonDTO);
        sb2.append(", trackingInfo=");
        return b.b(", testInfo=", ")", sb2, map, testInfo);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.banner, flags);
        dest.writeParcelable(this.closeButton, flags);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator e11 = J.e(map, dest, 1);
            while (e11.hasNext()) {
                Map.Entry entry = (Map.Entry) e11.next();
                dest.writeString((String) entry.getKey());
                dest.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }
        dest.writeParcelable(this.testInfo, flags);
    }
}
