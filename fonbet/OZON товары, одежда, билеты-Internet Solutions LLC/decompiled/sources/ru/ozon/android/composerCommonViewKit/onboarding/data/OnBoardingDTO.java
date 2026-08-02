package ru.ozon.android.composerCommonViewKit.onboarding.data;

import C.J;
import C.o0;
import De.C2859b;
import De.C2860c;
import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.j;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.cell.ImageTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00014BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u0017\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003Je\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010'\u001a\u00020(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020(HÖ\u0001J\t\u0010.\u001a\u00020\bHÖ\u0001J\u0016\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020(R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001b¨\u00065"}, d2 = {"Lru/ozon/android/composerCommonViewKit/onboarding/data/OnBoardingDTO;", "Landroid/os/Parcelable;", "banner", "Lru/ozon/uni/atoms/data/cell/ImageTitleSubtitleCellDTO;", "closeButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "backgroundColor", "options", "Lru/ozon/android/composerCommonViewKit/onboarding/data/OnBoardingDTO$Options;", "onboardingKey", "<init>", "(Lru/ozon/uni/atoms/data/cell/ImageTitleSubtitleCellDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;Ljava/lang/String;Lru/ozon/android/composerCommonViewKit/onboarding/data/OnBoardingDTO$Options;Ljava/lang/String;)V", "getBanner", "()Lru/ozon/uni/atoms/data/cell/ImageTitleSubtitleCellDTO;", "getCloseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getBackgroundColor", "()Ljava/lang/String;", "getOptions", "()Lru/ozon/android/composerCommonViewKit/onboarding/data/OnBoardingDTO$Options;", "getOnboardingKey", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Options", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class OnBoardingDTO implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<OnBoardingDTO> CREATOR = new Creator();
    private final String backgroundColor;

    @NotNull
    private final ImageTitleSubtitleCellDTO banner;

    @NotNull
    private final IconButtonDTO closeButton;
    private final String onboardingKey;
    private final Options options;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OnBoardingDTO> {
        @Override // android.os.Parcelable.Creator
        public final OnBoardingDTO createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ImageTitleSubtitleCellDTO imageTitleSubtitleCellDTO = (ImageTitleSubtitleCellDTO) parcel.readParcelable(OnBoardingDTO.class.getClassLoader());
            IconButtonDTO iconButtonDTO = (IconButtonDTO) parcel.readParcelable(OnBoardingDTO.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                int i11 = 0;
                while (i11 != readInt) {
                    i11 = C2859b.a(OnBoardingDTO.class, parcel, linkedHashMap2, parcel.readString(), i11, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new OnBoardingDTO(imageTitleSubtitleCellDTO, iconButtonDTO, linkedHashMap, (TestInfo) parcel.readParcelable(OnBoardingDTO.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0 ? Options.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OnBoardingDTO[] newArray(int i11) {
            return new OnBoardingDTO[i11];
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, d2 = {"Lru/ozon/android/composerCommonViewKit/onboarding/data/OnBoardingDTO$Options;", "Landroid/os/Parcelable;", "hideTimer", "", "<init>", "(Ljava/lang/Long;)V", "getHideTimer", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "copy", "(Ljava/lang/Long;)Lru/ozon/android/composerCommonViewKit/onboarding/data/OnBoardingDTO$Options;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Options implements Parcelable {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<Options> CREATOR = new Creator();
        private final Long hideTimer;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Options> {
            @Override // android.os.Parcelable.Creator
            public final Options createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Options(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            }

            @Override // android.os.Parcelable.Creator
            public final Options[] newArray(int i11) {
                return new Options[i11];
            }
        }

        public Options(Long l11) {
            this.hideTimer = l11;
        }

        public static /* synthetic */ Options copy$default(Options options, Long l11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                l11 = options.hideTimer;
            }
            return options.copy(l11);
        }

        /* renamed from: component1, reason: from getter */
        public final Long getHideTimer() {
            return this.hideTimer;
        }

        @NotNull
        public final Options copy(Long hideTimer) {
            return new Options(hideTimer);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Options) && Intrinsics.d(this.hideTimer, ((Options) other).hideTimer);
        }

        public final Long getHideTimer() {
            return this.hideTimer;
        }

        public int hashCode() {
            Long l11 = this.hideTimer;
            if (l11 == null) {
                return 0;
            }
            return l11.hashCode();
        }

        @NotNull
        public String toString() {
            return "Options(hideTimer=" + this.hideTimer + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Long l11 = this.hideTimer;
            if (l11 == null) {
                dest.writeInt(0);
            } else {
                C2860c.e(dest, 1, l11);
            }
        }
    }

    public OnBoardingDTO(@NotNull ImageTitleSubtitleCellDTO banner, @NotNull IconButtonDTO closeButton, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo, String str, Options options, String str2) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        this.banner = banner;
        this.closeButton = closeButton;
        this.trackingInfo = map;
        this.testInfo = testInfo;
        this.backgroundColor = str;
        this.options = options;
        this.onboardingKey = str2;
    }

    public static /* synthetic */ OnBoardingDTO copy$default(OnBoardingDTO onBoardingDTO, ImageTitleSubtitleCellDTO imageTitleSubtitleCellDTO, IconButtonDTO iconButtonDTO, Map map, TestInfo testInfo, String str, Options options, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageTitleSubtitleCellDTO = onBoardingDTO.banner;
        }
        if ((i11 & 2) != 0) {
            iconButtonDTO = onBoardingDTO.closeButton;
        }
        if ((i11 & 4) != 0) {
            map = onBoardingDTO.trackingInfo;
        }
        if ((i11 & 8) != 0) {
            testInfo = onBoardingDTO.testInfo;
        }
        if ((i11 & 16) != 0) {
            str = onBoardingDTO.backgroundColor;
        }
        if ((i11 & 32) != 0) {
            options = onBoardingDTO.options;
        }
        if ((i11 & 64) != 0) {
            str2 = onBoardingDTO.onboardingKey;
        }
        Options options2 = options;
        String str3 = str2;
        String str4 = str;
        Map map2 = map;
        return onBoardingDTO.copy(imageTitleSubtitleCellDTO, iconButtonDTO, map2, testInfo, str4, options2, str3);
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

    /* renamed from: component5, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component6, reason: from getter */
    public final Options getOptions() {
        return this.options;
    }

    /* renamed from: component7, reason: from getter */
    public final String getOnboardingKey() {
        return this.onboardingKey;
    }

    @NotNull
    public final OnBoardingDTO copy(@NotNull ImageTitleSubtitleCellDTO banner, @NotNull IconButtonDTO closeButton, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo, String backgroundColor, Options options, String onboardingKey) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        return new OnBoardingDTO(banner, closeButton, trackingInfo, testInfo, backgroundColor, options, onboardingKey);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnBoardingDTO)) {
            return false;
        }
        OnBoardingDTO onBoardingDTO = (OnBoardingDTO) other;
        return Intrinsics.d(this.banner, onBoardingDTO.banner) && Intrinsics.d(this.closeButton, onBoardingDTO.closeButton) && Intrinsics.d(this.trackingInfo, onBoardingDTO.trackingInfo) && Intrinsics.d(this.testInfo, onBoardingDTO.testInfo) && Intrinsics.d(this.backgroundColor, onBoardingDTO.backgroundColor) && Intrinsics.d(this.options, onBoardingDTO.options) && Intrinsics.d(this.onboardingKey, onBoardingDTO.onboardingKey);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final ImageTitleSubtitleCellDTO getBanner() {
        return this.banner;
    }

    @NotNull
    public final IconButtonDTO getCloseButton() {
        return this.closeButton;
    }

    public final String getOnboardingKey() {
        return this.onboardingKey;
    }

    public final Options getOptions() {
        return this.options;
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
        int hashCode3 = (hashCode2 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Options options = this.options;
        int hashCode5 = (hashCode4 + (options == null ? 0 : options.hashCode())) * 31;
        String str2 = this.onboardingKey;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ImageTitleSubtitleCellDTO imageTitleSubtitleCellDTO = this.banner;
        IconButtonDTO iconButtonDTO = this.closeButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        TestInfo testInfo = this.testInfo;
        String str = this.backgroundColor;
        Options options = this.options;
        String str2 = this.onboardingKey;
        StringBuilder sb2 = new StringBuilder("OnBoardingDTO(banner=");
        sb2.append(imageTitleSubtitleCellDTO);
        sb2.append(", closeButton=");
        sb2.append(iconButtonDTO);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(", testInfo=");
        sb2.append(testInfo);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", options=");
        sb2.append(options);
        sb2.append(", onboardingKey=");
        return o0.c(sb2, str2, ")");
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
        dest.writeString(this.backgroundColor);
        Options options = this.options;
        if (options == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            options.writeToParcel(dest, flags);
        }
        dest.writeString(this.onboardingKey);
    }

    public /* synthetic */ OnBoardingDTO(ImageTitleSubtitleCellDTO imageTitleSubtitleCellDTO, IconButtonDTO iconButtonDTO, Map map, TestInfo testInfo, String str, Options options, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageTitleSubtitleCellDTO, iconButtonDTO, map, testInfo, str, options, (i11 & 64) != 0 ? null : str2);
    }
}
