package ru.ozon.app.android.travel.feature.general.common.widgets.bannerWithAction.v1.data;

import B3.p;
import D3.g;
import GR.b;
import Nh.a;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import ed.InterfaceC6346b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.molecules.dto.themeImage.v2.ThemeImageV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u00049:;<Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\b)J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010/\u001a\u00020\u0010HÆ\u0003J\u0017\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003J\u0080\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0001¢\u0006\u0002\b2J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001f\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006="}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO;", "", "leftBlock", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO$LeftBlockDTO;", "rightBlock", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO$RightBlockDTO;", "closeButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "backgroundColor", "", "borderColor", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "margins", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO$Margins;", "viewTracking", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO$LeftBlockDTO;Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO$RightBlockDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/common/CornerRadius;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO$Margins;Ljava/util/Map;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLeftBlock", "()Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO$LeftBlockDTO;", "getRightBlock-FuAqtFE", "()Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO$RightBlockDTO;", "getCloseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getBackgroundColor", "()Ljava/lang/String;", "getBorderColor", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getMargins", "()Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO$Margins;", "getViewTracking", "()Ljava/util/Map;", "component1", "component2", "component2-FuAqtFE", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "copy-hif3j9g", "equals", "", "other", "hashCode", "", "toString", "LeftBlockDTO", "RightBlockDTO", "SettingsDTO", "Margins", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BannerWithActionDTO {
    public static final int $stable = 8;
    private final String backgroundColor;
    private final String borderColor;
    private final IconButtonV3DTO closeButton;
    private final CommonControlSettings common;

    @EnumNullFallback
    @NotNull
    private final CornerRadius cornerRadius;

    @NotNull
    private final LeftBlockDTO leftBlock;

    @NotNull
    private final Margins margins;
    private final RightBlockDTO rightBlock;
    private final Map<String, TokenizedTrackingInfo> viewTracking;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO$Margins;", "", "start", "Lru/ozon/uni/atoms/data/common/Paddings;", "end", "top", "bottom", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getStart", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getEnd", "getTop", "getBottom", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Margins {
        public static final int $stable = 0;

        @EnumNullFallback
        @NotNull
        private final Paddings bottom;

        @EnumNullFallback
        @NotNull
        private final Paddings end;

        @EnumNullFallback
        @NotNull
        private final Paddings start;

        @EnumNullFallback
        @NotNull
        private final Paddings top;

        public Margins() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ Margins copy$default(Margins margins, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = margins.start;
            }
            if ((i11 & 2) != 0) {
                paddings2 = margins.end;
            }
            if ((i11 & 4) != 0) {
                paddings3 = margins.top;
            }
            if ((i11 & 8) != 0) {
                paddings4 = margins.bottom;
            }
            return margins.copy(paddings, paddings2, paddings3, paddings4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Paddings getStart() {
            return this.start;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Paddings getEnd() {
            return this.end;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Paddings getTop() {
            return this.top;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        public final Margins copy(@NotNull Paddings start, @NotNull Paddings end, @NotNull Paddings top, @NotNull Paddings bottom) {
            Intrinsics.checkNotNullParameter(start, "start");
            Intrinsics.checkNotNullParameter(end, "end");
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            return new Margins(start, end, top, bottom);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Margins)) {
                return false;
            }
            Margins margins = (Margins) other;
            return this.start == margins.start && this.end == margins.end && this.top == margins.top && this.bottom == margins.bottom;
        }

        @NotNull
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        public final Paddings getEnd() {
            return this.end;
        }

        @NotNull
        public final Paddings getStart() {
            return this.start;
        }

        @NotNull
        public final Paddings getTop() {
            return this.top;
        }

        public int hashCode() {
            return this.bottom.hashCode() + b.b(this.top, b.b(this.end, this.start.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.start;
            Paddings paddings2 = this.end;
            return b.e(p.b("Margins(start=", paddings, ", end=", paddings2, ", top="), this.top, ", bottom=", this.bottom, ")");
        }

        public Margins(@NotNull Paddings start, @NotNull Paddings end, @NotNull Paddings top, @NotNull Paddings bottom) {
            Intrinsics.checkNotNullParameter(start, "start");
            Intrinsics.checkNotNullParameter(end, "end");
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            this.start = start;
            this.end = end;
            this.top = top;
            this.bottom = bottom;
        }

        public /* synthetic */ Margins(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Paddings.PADDING_500 : paddings, (i11 & 2) != 0 ? Paddings.PADDING_500 : paddings2, (i11 & 4) != 0 ? Paddings.NONE : paddings3, (i11 & 8) != 0 ? Paddings.NONE : paddings4);
        }
    }

    @InterfaceC6346b
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO$RightBlockDTO;", "", "image", "Lru/ozon/app/android/travel/molecules/dto/themeImage/v2/ThemeImageV2DTO;", "constructor-impl", "(Lru/ozon/app/android/travel/molecules/dto/themeImage/v2/ThemeImageV2DTO;)Lru/ozon/app/android/travel/molecules/dto/themeImage/v2/ThemeImageV2DTO;", "getImage", "()Lru/ozon/app/android/travel/molecules/dto/themeImage/v2/ThemeImageV2DTO;", "equals", "", "other", "equals-impl", "(Lru/ozon/app/android/travel/molecules/dto/themeImage/v2/ThemeImageV2DTO;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lru/ozon/app/android/travel/molecules/dto/themeImage/v2/ThemeImageV2DTO;)I", "toString", "", "toString-impl", "(Lru/ozon/app/android/travel/molecules/dto/themeImage/v2/ThemeImageV2DTO;)Ljava/lang/String;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final class RightBlockDTO {
        private final ThemeImageV2DTO image;

        private /* synthetic */ RightBlockDTO(ThemeImageV2DTO themeImageV2DTO) {
            this.image = themeImageV2DTO;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ RightBlockDTO m1188boximpl(ThemeImageV2DTO themeImageV2DTO) {
            return new RightBlockDTO(themeImageV2DTO);
        }

        @NotNull
        /* renamed from: constructor-impl, reason: not valid java name */
        public static ThemeImageV2DTO m1189constructorimpl(ThemeImageV2DTO themeImageV2DTO) {
            return themeImageV2DTO;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m1190equalsimpl(ThemeImageV2DTO themeImageV2DTO, Object obj) {
            return (obj instanceof RightBlockDTO) && Intrinsics.d(themeImageV2DTO, ((RightBlockDTO) obj).m1194unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m1191equalsimpl0(ThemeImageV2DTO themeImageV2DTO, ThemeImageV2DTO themeImageV2DTO2) {
            return Intrinsics.d(themeImageV2DTO, themeImageV2DTO2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m1192hashCodeimpl(ThemeImageV2DTO themeImageV2DTO) {
            if (themeImageV2DTO == null) {
                return 0;
            }
            return themeImageV2DTO.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m1193toStringimpl(ThemeImageV2DTO themeImageV2DTO) {
            return "RightBlockDTO(image=" + themeImageV2DTO + ")";
        }

        public boolean equals(Object obj) {
            return m1190equalsimpl(this.image, obj);
        }

        public final ThemeImageV2DTO getImage() {
            return this.image;
        }

        public int hashCode() {
            return m1192hashCodeimpl(this.image);
        }

        public String toString() {
            return m1193toStringimpl(this.image);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ ThemeImageV2DTO m1194unboximpl() {
            return this.image;
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO$SettingsDTO;", "", "topPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottomPadding", "leftPadding", "rightPadding", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottomPadding", "getLeftPadding", "getRightPadding", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SettingsDTO {
        public static final int $stable = 0;

        @EnumNullFallback
        @NotNull
        private final Paddings bottomPadding;

        @EnumNullFallback
        @NotNull
        private final Paddings leftPadding;

        @EnumNullFallback
        @NotNull
        private final Paddings rightPadding;

        @EnumNullFallback
        @NotNull
        private final Paddings topPadding;

        public SettingsDTO() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ SettingsDTO copy$default(SettingsDTO settingsDTO, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = settingsDTO.topPadding;
            }
            if ((i11 & 2) != 0) {
                paddings2 = settingsDTO.bottomPadding;
            }
            if ((i11 & 4) != 0) {
                paddings3 = settingsDTO.leftPadding;
            }
            if ((i11 & 8) != 0) {
                paddings4 = settingsDTO.rightPadding;
            }
            return settingsDTO.copy(paddings, paddings2, paddings3, paddings4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        @NotNull
        public final SettingsDTO copy(@NotNull Paddings topPadding, @NotNull Paddings bottomPadding, @NotNull Paddings leftPadding, @NotNull Paddings rightPadding) {
            Intrinsics.checkNotNullParameter(topPadding, "topPadding");
            Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
            Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
            Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
            return new SettingsDTO(topPadding, bottomPadding, leftPadding, rightPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SettingsDTO)) {
                return false;
            }
            SettingsDTO settingsDTO = (SettingsDTO) other;
            return this.topPadding == settingsDTO.topPadding && this.bottomPadding == settingsDTO.bottomPadding && this.leftPadding == settingsDTO.leftPadding && this.rightPadding == settingsDTO.rightPadding;
        }

        @NotNull
        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        @NotNull
        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        @NotNull
        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        @NotNull
        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            return this.rightPadding.hashCode() + b.b(this.leftPadding, b.b(this.bottomPadding, this.topPadding.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.topPadding;
            Paddings paddings2 = this.bottomPadding;
            return b.e(p.b("SettingsDTO(topPadding=", paddings, ", bottomPadding=", paddings2, ", leftPadding="), this.leftPadding, ", rightPadding=", this.rightPadding, ")");
        }

        public SettingsDTO(@NotNull Paddings topPadding, @NotNull Paddings bottomPadding, @NotNull Paddings leftPadding, @NotNull Paddings rightPadding) {
            Intrinsics.checkNotNullParameter(topPadding, "topPadding");
            Intrinsics.checkNotNullParameter(bottomPadding, "bottomPadding");
            Intrinsics.checkNotNullParameter(leftPadding, "leftPadding");
            Intrinsics.checkNotNullParameter(rightPadding, "rightPadding");
            this.topPadding = topPadding;
            this.bottomPadding = bottomPadding;
            this.leftPadding = leftPadding;
            this.rightPadding = rightPadding;
        }

        public /* synthetic */ SettingsDTO(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Paddings.PADDING_500 : paddings, (i11 & 2) != 0 ? Paddings.PADDING_500 : paddings2, (i11 & 4) != 0 ? Paddings.PADDING_500 : paddings3, (i11 & 8) != 0 ? Paddings.PADDING_500 : paddings4);
        }
    }

    public /* synthetic */ BannerWithActionDTO(LeftBlockDTO leftBlockDTO, RightBlockDTO rightBlockDTO, IconButtonV3DTO iconButtonV3DTO, CornerRadius cornerRadius, String str, String str2, CommonControlSettings commonControlSettings, Margins margins, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(leftBlockDTO, rightBlockDTO, iconButtonV3DTO, cornerRadius, str, str2, commonControlSettings, margins, map);
    }

    /* renamed from: copy-hif3j9g$default, reason: not valid java name */
    public static /* synthetic */ BannerWithActionDTO m1184copyhif3j9g$default(BannerWithActionDTO bannerWithActionDTO, LeftBlockDTO leftBlockDTO, RightBlockDTO rightBlockDTO, IconButtonV3DTO iconButtonV3DTO, CornerRadius cornerRadius, String str, String str2, CommonControlSettings commonControlSettings, Margins margins, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            leftBlockDTO = bannerWithActionDTO.leftBlock;
        }
        if ((i11 & 2) != 0) {
            rightBlockDTO = bannerWithActionDTO.rightBlock;
        }
        if ((i11 & 4) != 0) {
            iconButtonV3DTO = bannerWithActionDTO.closeButton;
        }
        if ((i11 & 8) != 0) {
            cornerRadius = bannerWithActionDTO.cornerRadius;
        }
        if ((i11 & 16) != 0) {
            str = bannerWithActionDTO.backgroundColor;
        }
        if ((i11 & 32) != 0) {
            str2 = bannerWithActionDTO.borderColor;
        }
        if ((i11 & 64) != 0) {
            commonControlSettings = bannerWithActionDTO.common;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            margins = bannerWithActionDTO.margins;
        }
        if ((i11 & 256) != 0) {
            map = bannerWithActionDTO.viewTracking;
        }
        Margins margins2 = margins;
        Map map2 = map;
        String str3 = str2;
        CommonControlSettings commonControlSettings2 = commonControlSettings;
        String str4 = str;
        IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
        return bannerWithActionDTO.m1186copyhif3j9g(leftBlockDTO, rightBlockDTO, iconButtonV3DTO2, cornerRadius, str4, str3, commonControlSettings2, margins2, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final LeftBlockDTO getLeftBlock() {
        return this.leftBlock;
    }

    /* renamed from: component2-FuAqtFE, reason: not valid java name and from getter */
    public final RightBlockDTO getRightBlock() {
        return this.rightBlock;
    }

    /* renamed from: component3, reason: from getter */
    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBorderColor() {
        return this.borderColor;
    }

    /* renamed from: component7, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final Margins getMargins() {
        return this.margins;
    }

    public final Map<String, TokenizedTrackingInfo> component9() {
        return this.viewTracking;
    }

    @NotNull
    /* renamed from: copy-hif3j9g, reason: not valid java name */
    public final BannerWithActionDTO m1186copyhif3j9g(@NotNull LeftBlockDTO leftBlock, RightBlockDTO rightBlock, IconButtonV3DTO closeButton, @NotNull CornerRadius cornerRadius, String backgroundColor, String borderColor, CommonControlSettings common, @NotNull Margins margins, Map<String, TokenizedTrackingInfo> viewTracking) {
        Intrinsics.checkNotNullParameter(leftBlock, "leftBlock");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        Intrinsics.checkNotNullParameter(margins, "margins");
        return new BannerWithActionDTO(leftBlock, rightBlock, closeButton, cornerRadius, backgroundColor, borderColor, common, margins, viewTracking, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerWithActionDTO)) {
            return false;
        }
        BannerWithActionDTO bannerWithActionDTO = (BannerWithActionDTO) other;
        return Intrinsics.d(this.leftBlock, bannerWithActionDTO.leftBlock) && Intrinsics.d(this.rightBlock, bannerWithActionDTO.rightBlock) && Intrinsics.d(this.closeButton, bannerWithActionDTO.closeButton) && this.cornerRadius == bannerWithActionDTO.cornerRadius && Intrinsics.d(this.backgroundColor, bannerWithActionDTO.backgroundColor) && Intrinsics.d(this.borderColor, bannerWithActionDTO.borderColor) && Intrinsics.d(this.common, bannerWithActionDTO.common) && Intrinsics.d(this.margins, bannerWithActionDTO.margins) && Intrinsics.d(this.viewTracking, bannerWithActionDTO.viewTracking);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBorderColor() {
        return this.borderColor;
    }

    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final LeftBlockDTO getLeftBlock() {
        return this.leftBlock;
    }

    @NotNull
    public final Margins getMargins() {
        return this.margins;
    }

    /* renamed from: getRightBlock-FuAqtFE, reason: not valid java name */
    public final RightBlockDTO m1187getRightBlockFuAqtFE() {
        return this.rightBlock;
    }

    public final Map<String, TokenizedTrackingInfo> getViewTracking() {
        return this.viewTracking;
    }

    public int hashCode() {
        int hashCode = this.leftBlock.hashCode() * 31;
        RightBlockDTO rightBlockDTO = this.rightBlock;
        int m1192hashCodeimpl = (hashCode + (rightBlockDTO == null ? 0 : RightBlockDTO.m1192hashCodeimpl(rightBlockDTO.m1194unboximpl()))) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        int b11 = Tl.b.b(this.cornerRadius, (m1192hashCodeimpl + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31, 31);
        String str = this.backgroundColor;
        int hashCode2 = (b11 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.borderColor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CommonControlSettings commonControlSettings = this.common;
        int hashCode4 = (this.margins.hashCode() + ((hashCode3 + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31)) * 31;
        Map<String, TokenizedTrackingInfo> map = this.viewTracking;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        LeftBlockDTO leftBlockDTO = this.leftBlock;
        RightBlockDTO rightBlockDTO = this.rightBlock;
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        CornerRadius cornerRadius = this.cornerRadius;
        String str = this.backgroundColor;
        String str2 = this.borderColor;
        CommonControlSettings commonControlSettings = this.common;
        Margins margins = this.margins;
        Map<String, TokenizedTrackingInfo> map = this.viewTracking;
        StringBuilder sb2 = new StringBuilder("BannerWithActionDTO(leftBlock=");
        sb2.append(leftBlockDTO);
        sb2.append(", rightBlock=");
        sb2.append(rightBlockDTO);
        sb2.append(", closeButton=");
        sb2.append(iconButtonV3DTO);
        sb2.append(", cornerRadius=");
        sb2.append(cornerRadius);
        sb2.append(", backgroundColor=");
        a.h(sb2, str, ", borderColor=", str2, ", common=");
        sb2.append(commonControlSettings);
        sb2.append(", margins=");
        sb2.append(margins);
        sb2.append(", viewTracking=");
        return P.f(sb2, map, ")");
    }

    private BannerWithActionDTO(LeftBlockDTO leftBlock, RightBlockDTO rightBlockDTO, IconButtonV3DTO iconButtonV3DTO, CornerRadius cornerRadius, String str, String str2, CommonControlSettings commonControlSettings, Margins margins, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(leftBlock, "leftBlock");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        Intrinsics.checkNotNullParameter(margins, "margins");
        this.leftBlock = leftBlock;
        this.rightBlock = rightBlockDTO;
        this.closeButton = iconButtonV3DTO;
        this.cornerRadius = cornerRadius;
        this.backgroundColor = str;
        this.borderColor = str2;
        this.common = commonControlSettings;
        this.margins = margins;
        this.viewTracking = map;
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO$LeftBlockDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "subtitle", "actionButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "settings", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO$SettingsDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO$SettingsDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "getActionButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSettings", "()Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO$SettingsDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LeftBlockDTO {
        public static final int $stable = 0;
        private final ButtonV3DTO actionButton;

        @NotNull
        private final SettingsDTO settings;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        public LeftBlockDTO(@NotNull TextDTO title, TextDTO textDTO, ButtonV3DTO buttonV3DTO, @NotNull SettingsDTO settings) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(settings, "settings");
            this.title = title;
            this.subtitle = textDTO;
            this.actionButton = buttonV3DTO;
            this.settings = settings;
        }

        public static /* synthetic */ LeftBlockDTO copy$default(LeftBlockDTO leftBlockDTO, TextDTO textDTO, TextDTO textDTO2, ButtonV3DTO buttonV3DTO, SettingsDTO settingsDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = leftBlockDTO.title;
            }
            if ((i11 & 2) != 0) {
                textDTO2 = leftBlockDTO.subtitle;
            }
            if ((i11 & 4) != 0) {
                buttonV3DTO = leftBlockDTO.actionButton;
            }
            if ((i11 & 8) != 0) {
                settingsDTO = leftBlockDTO.settings;
            }
            return leftBlockDTO.copy(textDTO, textDTO2, buttonV3DTO, settingsDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final ButtonV3DTO getActionButton() {
            return this.actionButton;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final SettingsDTO getSettings() {
            return this.settings;
        }

        @NotNull
        public final LeftBlockDTO copy(@NotNull TextDTO title, TextDTO subtitle, ButtonV3DTO actionButton, @NotNull SettingsDTO settings) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(settings, "settings");
            return new LeftBlockDTO(title, subtitle, actionButton, settings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LeftBlockDTO)) {
                return false;
            }
            LeftBlockDTO leftBlockDTO = (LeftBlockDTO) other;
            return Intrinsics.d(this.title, leftBlockDTO.title) && Intrinsics.d(this.subtitle, leftBlockDTO.subtitle) && Intrinsics.d(this.actionButton, leftBlockDTO.actionButton) && Intrinsics.d(this.settings, leftBlockDTO.settings);
        }

        public final ButtonV3DTO getActionButton() {
            return this.actionButton;
        }

        @NotNull
        public final SettingsDTO getSettings() {
            return this.settings;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            TextDTO textDTO = this.subtitle;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            ButtonV3DTO buttonV3DTO = this.actionButton;
            return this.settings.hashCode() + ((hashCode2 + (buttonV3DTO != null ? buttonV3DTO.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            ButtonV3DTO buttonV3DTO = this.actionButton;
            SettingsDTO settingsDTO = this.settings;
            StringBuilder g10 = g.g("LeftBlockDTO(title=", textDTO, ", subtitle=", textDTO2, ", actionButton=");
            g10.append(buttonV3DTO);
            g10.append(", settings=");
            g10.append(settingsDTO);
            g10.append(")");
            return g10.toString();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ LeftBlockDTO(TextDTO textDTO, TextDTO textDTO2, ButtonV3DTO buttonV3DTO, SettingsDTO settingsDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(textDTO, textDTO2, buttonV3DTO, settingsDTO);
            if ((i11 & 8) != 0) {
                settingsDTO = new SettingsDTO(null, null, null, null, 15, null);
            }
        }
    }

    public /* synthetic */ BannerWithActionDTO(LeftBlockDTO leftBlockDTO, RightBlockDTO rightBlockDTO, IconButtonV3DTO iconButtonV3DTO, CornerRadius cornerRadius, String str, String str2, CommonControlSettings commonControlSettings, Margins margins, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(leftBlockDTO, rightBlockDTO, iconButtonV3DTO, (i11 & 8) != 0 ? CornerRadius.RADIUS_400 : cornerRadius, str, str2, commonControlSettings, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? new Margins(null, null, null, null, 15, null) : margins, map, null);
    }
}
