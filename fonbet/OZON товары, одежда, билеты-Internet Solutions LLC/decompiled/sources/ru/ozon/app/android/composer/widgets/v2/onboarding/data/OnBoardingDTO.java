package ru.ozon.app.android.composer.widgets.v2.onboarding.data;

import C.J;
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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00011BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u0017\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003JY\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010$\u001a\u00020%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020%HÖ\u0001J\t\u0010+\u001a\u00020\bHÖ\u0001J\u0016\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020%R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00062"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO;", "Landroid/os/Parcelable;", "banner", "Lru/ozon/uni/atoms/data/cell/ImageTitleSubtitleCellDTO;", "closeButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "options", "Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO$Options;", "onboardingKey", "<init>", "(Lru/ozon/uni/atoms/data/cell/ImageTitleSubtitleCellDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO$Options;Ljava/lang/String;)V", "getBanner", "()Lru/ozon/uni/atoms/data/cell/ImageTitleSubtitleCellDTO;", "getCloseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getOptions", "()Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO$Options;", "getOnboardingKey", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Options", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class OnBoardingDTO implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<OnBoardingDTO> CREATOR = new Creator();

    @NotNull
    private final ImageTitleSubtitleCellDTO banner;

    @NotNull
    private final IconButtonDTO closeButton;
    private final String onboardingKey;
    private final Options options;
    private final TestInfo testInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
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
            return new OnBoardingDTO(imageTitleSubtitleCellDTO, iconButtonDTO, linkedHashMap, (TestInfo) parcel.readParcelable(OnBoardingDTO.class.getClassLoader()), parcel.readInt() != 0 ? Options.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OnBoardingDTO[] newArray(int i11) {
            return new OnBoardingDTO[i11];
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO$Options;", "Landroid/os/Parcelable;", "hideTimer", "", "<init>", "(Ljava/lang/Long;)V", "getHideTimer", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "copy", "(Ljava/lang/Long;)Lru/ozon/app/android/composer/widgets/v2/onboarding/data/OnBoardingDTO$Options;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Options implements Parcelable {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<Options> CREATOR = new Creator();
        private final Long hideTimer;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes11.dex */
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

    public OnBoardingDTO(@NotNull ImageTitleSubtitleCellDTO banner, @NotNull IconButtonDTO closeButton, Map<String, TokenizedTrackingInfo> map, TestInfo testInfo, Options options, String str) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        this.banner = banner;
        this.closeButton = closeButton;
        this.trackingInfo = map;
        this.testInfo = testInfo;
        this.options = options;
        this.onboardingKey = str;
    }

    public static /* synthetic */ OnBoardingDTO copy$default(OnBoardingDTO onBoardingDTO, ImageTitleSubtitleCellDTO imageTitleSubtitleCellDTO, IconButtonDTO iconButtonDTO, Map map, TestInfo testInfo, Options options, String str, int i11, Object obj) {
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
            options = onBoardingDTO.options;
        }
        if ((i11 & 32) != 0) {
            str = onBoardingDTO.onboardingKey;
        }
        Options options2 = options;
        String str2 = str;
        return onBoardingDTO.copy(imageTitleSubtitleCellDTO, iconButtonDTO, map, testInfo, options2, str2);
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
    public final Options getOptions() {
        return this.options;
    }

    /* renamed from: component6, reason: from getter */
    public final String getOnboardingKey() {
        return this.onboardingKey;
    }

    @NotNull
    public final OnBoardingDTO copy(@NotNull ImageTitleSubtitleCellDTO banner, @NotNull IconButtonDTO closeButton, Map<String, TokenizedTrackingInfo> trackingInfo, TestInfo testInfo, Options options, String onboardingKey) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        return new OnBoardingDTO(banner, closeButton, trackingInfo, testInfo, options, onboardingKey);
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
        return Intrinsics.d(this.banner, onBoardingDTO.banner) && Intrinsics.d(this.closeButton, onBoardingDTO.closeButton) && Intrinsics.d(this.trackingInfo, onBoardingDTO.trackingInfo) && Intrinsics.d(this.testInfo, onBoardingDTO.testInfo) && Intrinsics.d(this.options, onBoardingDTO.options) && Intrinsics.d(this.onboardingKey, onBoardingDTO.onboardingKey);
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
        Options options = this.options;
        int hashCode4 = (hashCode3 + (options == null ? 0 : options.hashCode())) * 31;
        String str = this.onboardingKey;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OnBoardingDTO(banner=" + this.banner + ", closeButton=" + this.closeButton + ", trackingInfo=" + this.trackingInfo + ", testInfo=" + this.testInfo + ", options=" + this.options + ", onboardingKey=" + this.onboardingKey + ")";
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
        Options options = this.options;
        if (options == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            options.writeToParcel(dest, flags);
        }
        dest.writeString(this.onboardingKey);
    }

    public /* synthetic */ OnBoardingDTO(ImageTitleSubtitleCellDTO imageTitleSubtitleCellDTO, IconButtonDTO iconButtonDTO, Map map, TestInfo testInfo, Options options, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(imageTitleSubtitleCellDTO, iconButtonDTO, map, testInfo, options, (i11 & 32) != 0 ? null : str);
    }
}
