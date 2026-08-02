package ru.ozon.app.android.fresh.main.widgets.fakeSearchButton.data;

import B3.p;
import Bk.C2638a;
import Bl.C2639a;
import El.C2971a;
import G.g;
import Ih.a;
import Tl.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002;<Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\t\u0010-\u001a\u00020\u0007HÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\t\u0010/\u001a\u00020\u000bHÆ\u0003J\t\u00100\u001a\u00020\rHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0017\u00102\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u00104\u001a\u00020\u0015HÆ\u0003J\u007f\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015HÆ\u0001J\u0013\u00106\u001a\u00020\u00152\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006="}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/data/FakeSearchDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "paddings", "Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/data/FakeSearchDTO$PaddingsDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "roundedCorners", "Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/data/FakeSearchDTO$CornersDTO;", "stickyRoundingColor", "", "tintColor", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "rightIconButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "shouldSkipStickyAnimation", "", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/data/FakeSearchDTO$PaddingsDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/data/FakeSearchDTO$CornersDTO;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Z)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getPaddings", "()Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/data/FakeSearchDTO$PaddingsDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getRoundedCorners", "()Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/data/FakeSearchDTO$CornersDTO;", "getStickyRoundingColor", "()Ljava/lang/String;", "getTintColor", "getTrackingInfo", "()Ljava/util/Map;", "getRightIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getShouldSkipStickyAnimation", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "PaddingsDTO", "CornersDTO", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FakeSearchDTO {

    @NotNull
    private final AtomActionDTO action;

    @NotNull
    private final IconDTO icon;

    @NotNull
    private final PaddingsDTO paddings;
    private final IconButtonV3DTO rightIconButton;

    @NotNull
    private final CornersDTO roundedCorners;
    private final boolean shouldSkipStickyAnimation;

    @NotNull
    private final String stickyRoundingColor;
    private final String tintColor;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/data/FakeSearchDTO$CornersDTO;", "", "top", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "bottom", "topSticky", "bottomSticky", "<init>", "(Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/common/CornerRadius;)V", "getTop", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getBottom", "getTopSticky", "getBottomSticky", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CornersDTO {

        @NotNull
        private final CornerRadius bottom;

        @NotNull
        private final CornerRadius bottomSticky;

        @NotNull
        private final CornerRadius top;

        @NotNull
        private final CornerRadius topSticky;

        public CornersDTO(@NotNull CornerRadius top, @NotNull CornerRadius bottom, @NotNull CornerRadius topSticky, @NotNull CornerRadius bottomSticky) {
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            Intrinsics.checkNotNullParameter(topSticky, "topSticky");
            Intrinsics.checkNotNullParameter(bottomSticky, "bottomSticky");
            this.top = top;
            this.bottom = bottom;
            this.topSticky = topSticky;
            this.bottomSticky = bottomSticky;
        }

        public static /* synthetic */ CornersDTO copy$default(CornersDTO cornersDTO, CornerRadius cornerRadius, CornerRadius cornerRadius2, CornerRadius cornerRadius3, CornerRadius cornerRadius4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                cornerRadius = cornersDTO.top;
            }
            if ((i11 & 2) != 0) {
                cornerRadius2 = cornersDTO.bottom;
            }
            if ((i11 & 4) != 0) {
                cornerRadius3 = cornersDTO.topSticky;
            }
            if ((i11 & 8) != 0) {
                cornerRadius4 = cornersDTO.bottomSticky;
            }
            return cornersDTO.copy(cornerRadius, cornerRadius2, cornerRadius3, cornerRadius4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CornerRadius getTop() {
            return this.top;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final CornerRadius getBottom() {
            return this.bottom;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final CornerRadius getTopSticky() {
            return this.topSticky;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final CornerRadius getBottomSticky() {
            return this.bottomSticky;
        }

        @NotNull
        public final CornersDTO copy(@NotNull CornerRadius top, @NotNull CornerRadius bottom, @NotNull CornerRadius topSticky, @NotNull CornerRadius bottomSticky) {
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            Intrinsics.checkNotNullParameter(topSticky, "topSticky");
            Intrinsics.checkNotNullParameter(bottomSticky, "bottomSticky");
            return new CornersDTO(top, bottom, topSticky, bottomSticky);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CornersDTO)) {
                return false;
            }
            CornersDTO cornersDTO = (CornersDTO) other;
            return this.top == cornersDTO.top && this.bottom == cornersDTO.bottom && this.topSticky == cornersDTO.topSticky && this.bottomSticky == cornersDTO.bottomSticky;
        }

        @NotNull
        public final CornerRadius getBottom() {
            return this.bottom;
        }

        @NotNull
        public final CornerRadius getBottomSticky() {
            return this.bottomSticky;
        }

        @NotNull
        public final CornerRadius getTop() {
            return this.top;
        }

        @NotNull
        public final CornerRadius getTopSticky() {
            return this.topSticky;
        }

        public int hashCode() {
            return this.bottomSticky.hashCode() + b.b(this.topSticky, b.b(this.bottom, this.top.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return "CornersDTO(top=" + this.top + ", bottom=" + this.bottom + ", topSticky=" + this.topSticky + ", bottomSticky=" + this.bottomSticky + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/fakeSearchButton/data/FakeSearchDTO$PaddingsDTO;", "", "top", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottom", "horizontal", "horizontalSticky", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTop", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottom", "getHorizontal", "getHorizontalSticky", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaddingsDTO {

        @NotNull
        private final Paddings bottom;

        @NotNull
        private final Paddings horizontal;

        @NotNull
        private final Paddings horizontalSticky;

        @NotNull
        private final Paddings top;

        public PaddingsDTO(@NotNull Paddings top, @NotNull Paddings bottom, @NotNull Paddings horizontal, @NotNull Paddings horizontalSticky) {
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            Intrinsics.checkNotNullParameter(horizontal, "horizontal");
            Intrinsics.checkNotNullParameter(horizontalSticky, "horizontalSticky");
            this.top = top;
            this.bottom = bottom;
            this.horizontal = horizontal;
            this.horizontalSticky = horizontalSticky;
        }

        public static /* synthetic */ PaddingsDTO copy$default(PaddingsDTO paddingsDTO, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = paddingsDTO.top;
            }
            if ((i11 & 2) != 0) {
                paddings2 = paddingsDTO.bottom;
            }
            if ((i11 & 4) != 0) {
                paddings3 = paddingsDTO.horizontal;
            }
            if ((i11 & 8) != 0) {
                paddings4 = paddingsDTO.horizontalSticky;
            }
            return paddingsDTO.copy(paddings, paddings2, paddings3, paddings4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Paddings getTop() {
            return this.top;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Paddings getHorizontal() {
            return this.horizontal;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Paddings getHorizontalSticky() {
            return this.horizontalSticky;
        }

        @NotNull
        public final PaddingsDTO copy(@NotNull Paddings top, @NotNull Paddings bottom, @NotNull Paddings horizontal, @NotNull Paddings horizontalSticky) {
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            Intrinsics.checkNotNullParameter(horizontal, "horizontal");
            Intrinsics.checkNotNullParameter(horizontalSticky, "horizontalSticky");
            return new PaddingsDTO(top, bottom, horizontal, horizontalSticky);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaddingsDTO)) {
                return false;
            }
            PaddingsDTO paddingsDTO = (PaddingsDTO) other;
            return this.top == paddingsDTO.top && this.bottom == paddingsDTO.bottom && this.horizontal == paddingsDTO.horizontal && this.horizontalSticky == paddingsDTO.horizontalSticky;
        }

        @NotNull
        public final Paddings getBottom() {
            return this.bottom;
        }

        @NotNull
        public final Paddings getHorizontal() {
            return this.horizontal;
        }

        @NotNull
        public final Paddings getHorizontalSticky() {
            return this.horizontalSticky;
        }

        @NotNull
        public final Paddings getTop() {
            return this.top;
        }

        public int hashCode() {
            return this.horizontalSticky.hashCode() + GR.b.b(this.horizontal, GR.b.b(this.bottom, this.top.hashCode() * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.top;
            Paddings paddings2 = this.bottom;
            return GR.b.e(p.b("PaddingsDTO(top=", paddings, ", bottom=", paddings2, ", horizontal="), this.horizontal, ", horizontalSticky=", this.horizontalSticky, ")");
        }
    }

    public FakeSearchDTO(@NotNull TextDTO title, @NotNull IconDTO icon, @NotNull PaddingsDTO paddings, @NotNull AtomActionDTO action, @NotNull CornersDTO roundedCorners, @NotNull String stickyRoundingColor, String str, Map<String, TokenizedTrackingInfo> map, IconButtonV3DTO iconButtonV3DTO, boolean z11) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(roundedCorners, "roundedCorners");
        Intrinsics.checkNotNullParameter(stickyRoundingColor, "stickyRoundingColor");
        this.title = title;
        this.icon = icon;
        this.paddings = paddings;
        this.action = action;
        this.roundedCorners = roundedCorners;
        this.stickyRoundingColor = stickyRoundingColor;
        this.tintColor = str;
        this.trackingInfo = map;
        this.rightIconButton = iconButtonV3DTO;
        this.shouldSkipStickyAnimation = z11;
    }

    public static /* synthetic */ FakeSearchDTO copy$default(FakeSearchDTO fakeSearchDTO, TextDTO textDTO, IconDTO iconDTO, PaddingsDTO paddingsDTO, AtomActionDTO atomActionDTO, CornersDTO cornersDTO, String str, String str2, Map map, IconButtonV3DTO iconButtonV3DTO, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = fakeSearchDTO.title;
        }
        if ((i11 & 2) != 0) {
            iconDTO = fakeSearchDTO.icon;
        }
        if ((i11 & 4) != 0) {
            paddingsDTO = fakeSearchDTO.paddings;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = fakeSearchDTO.action;
        }
        if ((i11 & 16) != 0) {
            cornersDTO = fakeSearchDTO.roundedCorners;
        }
        if ((i11 & 32) != 0) {
            str = fakeSearchDTO.stickyRoundingColor;
        }
        if ((i11 & 64) != 0) {
            str2 = fakeSearchDTO.tintColor;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            map = fakeSearchDTO.trackingInfo;
        }
        if ((i11 & 256) != 0) {
            iconButtonV3DTO = fakeSearchDTO.rightIconButton;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            z11 = fakeSearchDTO.shouldSkipStickyAnimation;
        }
        IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
        boolean z12 = z11;
        String str3 = str2;
        Map map2 = map;
        CornersDTO cornersDTO2 = cornersDTO;
        String str4 = str;
        return fakeSearchDTO.copy(textDTO, iconDTO, paddingsDTO, atomActionDTO, cornersDTO2, str4, str3, map2, iconButtonV3DTO2, z12);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getShouldSkipStickyAnimation() {
        return this.shouldSkipStickyAnimation;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final IconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final PaddingsDTO getPaddings() {
        return this.paddings;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final CornersDTO getRoundedCorners() {
        return this.roundedCorners;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getStickyRoundingColor() {
        return this.stickyRoundingColor;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTintColor() {
        return this.tintColor;
    }

    public final Map<String, TokenizedTrackingInfo> component8() {
        return this.trackingInfo;
    }

    /* renamed from: component9, reason: from getter */
    public final IconButtonV3DTO getRightIconButton() {
        return this.rightIconButton;
    }

    @NotNull
    public final FakeSearchDTO copy(@NotNull TextDTO title, @NotNull IconDTO icon, @NotNull PaddingsDTO paddings, @NotNull AtomActionDTO action, @NotNull CornersDTO roundedCorners, @NotNull String stickyRoundingColor, String tintColor, Map<String, TokenizedTrackingInfo> trackingInfo, IconButtonV3DTO rightIconButton, boolean shouldSkipStickyAnimation) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(roundedCorners, "roundedCorners");
        Intrinsics.checkNotNullParameter(stickyRoundingColor, "stickyRoundingColor");
        return new FakeSearchDTO(title, icon, paddings, action, roundedCorners, stickyRoundingColor, tintColor, trackingInfo, rightIconButton, shouldSkipStickyAnimation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FakeSearchDTO)) {
            return false;
        }
        FakeSearchDTO fakeSearchDTO = (FakeSearchDTO) other;
        return Intrinsics.d(this.title, fakeSearchDTO.title) && Intrinsics.d(this.icon, fakeSearchDTO.icon) && Intrinsics.d(this.paddings, fakeSearchDTO.paddings) && Intrinsics.d(this.action, fakeSearchDTO.action) && Intrinsics.d(this.roundedCorners, fakeSearchDTO.roundedCorners) && Intrinsics.d(this.stickyRoundingColor, fakeSearchDTO.stickyRoundingColor) && Intrinsics.d(this.tintColor, fakeSearchDTO.tintColor) && Intrinsics.d(this.trackingInfo, fakeSearchDTO.trackingInfo) && Intrinsics.d(this.rightIconButton, fakeSearchDTO.rightIconButton) && this.shouldSkipStickyAnimation == fakeSearchDTO.shouldSkipStickyAnimation;
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final IconDTO getIcon() {
        return this.icon;
    }

    @NotNull
    public final PaddingsDTO getPaddings() {
        return this.paddings;
    }

    public final IconButtonV3DTO getRightIconButton() {
        return this.rightIconButton;
    }

    @NotNull
    public final CornersDTO getRoundedCorners() {
        return this.roundedCorners;
    }

    public final boolean getShouldSkipStickyAnimation() {
        return this.shouldSkipStickyAnimation;
    }

    @NotNull
    public final String getStickyRoundingColor() {
        return this.stickyRoundingColor;
    }

    public final String getTintColor() {
        return this.tintColor;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = g.a((this.roundedCorners.hashCode() + a.b(this.action, (this.paddings.hashCode() + C2971a.a(this.icon, this.title.hashCode() * 31, 31)) * 31, 31)) * 31, 31, this.stickyRoundingColor);
        String str = this.tintColor;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.rightIconButton;
        return Boolean.hashCode(this.shouldSkipStickyAnimation) + ((hashCode2 + (iconButtonV3DTO != null ? iconButtonV3DTO.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        IconDTO iconDTO = this.icon;
        PaddingsDTO paddingsDTO = this.paddings;
        AtomActionDTO atomActionDTO = this.action;
        CornersDTO cornersDTO = this.roundedCorners;
        String str = this.stickyRoundingColor;
        String str2 = this.tintColor;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        IconButtonV3DTO iconButtonV3DTO = this.rightIconButton;
        boolean z11 = this.shouldSkipStickyAnimation;
        StringBuilder d11 = C2639a.d("FakeSearchDTO(title=", ", icon=", ", paddings=", iconDTO, textDTO);
        d11.append(paddingsDTO);
        d11.append(", action=");
        d11.append(atomActionDTO);
        d11.append(", roundedCorners=");
        d11.append(cornersDTO);
        d11.append(", stickyRoundingColor=");
        d11.append(str);
        d11.append(", tintColor=");
        C2638a.e(d11, str2, ", trackingInfo=", map, ", rightIconButton=");
        d11.append(iconButtonV3DTO);
        d11.append(", shouldSkipStickyAnimation=");
        d11.append(z11);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ FakeSearchDTO(TextDTO textDTO, IconDTO iconDTO, PaddingsDTO paddingsDTO, AtomActionDTO atomActionDTO, CornersDTO cornersDTO, String str, String str2, Map map, IconButtonV3DTO iconButtonV3DTO, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, iconDTO, paddingsDTO, atomActionDTO, cornersDTO, str, str2, map, iconButtonV3DTO, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : z11);
    }
}
