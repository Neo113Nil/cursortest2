package ru.ozon.app.android.ugc.core.widgets.illustrationButtons.data;

import B3.p;
import B90.C2616s;
import D40.a;
import Ns.b;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002#$BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JM\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/data/IllustrationButtonsDTO;", "", "leftButton", "Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/data/IllustrationButtonsDTO$IllustrationButton;", "rightButton", "backgroundColor", "", "paddings", "Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/data/IllustrationButtonsDTO$PaddingsDTO;", "tracking", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/data/IllustrationButtonsDTO$IllustrationButton;Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/data/IllustrationButtonsDTO$IllustrationButton;Ljava/lang/String;Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/data/IllustrationButtonsDTO$PaddingsDTO;Ljava/util/Map;)V", "getLeftButton", "()Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/data/IllustrationButtonsDTO$IllustrationButton;", "getRightButton", "getBackgroundColor", "()Ljava/lang/String;", "getPaddings", "()Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/data/IllustrationButtonsDTO$PaddingsDTO;", "getTracking", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "IllustrationButton", "PaddingsDTO", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class IllustrationButtonsDTO {
    public static final int $stable = 8;
    private final String backgroundColor;

    @NotNull
    private final IllustrationButton leftButton;
    private final PaddingsDTO paddings;

    @NotNull
    private final IllustrationButton rightButton;
    private final Map<String, TokenizedTrackingInfo> tracking;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003JY\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006*"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/data/IllustrationButtonsDTO$IllustrationButton;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "backgroundColor", "", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "tracking", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTracking", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class IllustrationButton {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final String backgroundColor;
        private final CornerRadius cornerRadius;

        @NotNull
        private final ImageDTO image;

        @NotNull
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> tracking;

        public IllustrationButton(@NotNull ImageDTO image, @NotNull TextDTO title, String str, CornerRadius cornerRadius, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            this.image = image;
            this.title = title;
            this.backgroundColor = str;
            this.cornerRadius = cornerRadius;
            this.action = atomActionDTO;
            this.tracking = map;
        }

        public static /* synthetic */ IllustrationButton copy$default(IllustrationButton illustrationButton, ImageDTO imageDTO, TextDTO textDTO, String str, CornerRadius cornerRadius, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageDTO = illustrationButton.image;
            }
            if ((i11 & 2) != 0) {
                textDTO = illustrationButton.title;
            }
            if ((i11 & 4) != 0) {
                str = illustrationButton.backgroundColor;
            }
            if ((i11 & 8) != 0) {
                cornerRadius = illustrationButton.cornerRadius;
            }
            if ((i11 & 16) != 0) {
                atomActionDTO = illustrationButton.action;
            }
            if ((i11 & 32) != 0) {
                map = illustrationButton.tracking;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            Map map2 = map;
            return illustrationButton.copy(imageDTO, textDTO, str, cornerRadius, atomActionDTO2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component4, reason: from getter */
        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        /* renamed from: component5, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.tracking;
        }

        @NotNull
        public final IllustrationButton copy(@NotNull ImageDTO image, @NotNull TextDTO title, String backgroundColor, CornerRadius cornerRadius, AtomActionDTO action, Map<String, TokenizedTrackingInfo> tracking) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            return new IllustrationButton(image, title, backgroundColor, cornerRadius, action, tracking);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IllustrationButton)) {
                return false;
            }
            IllustrationButton illustrationButton = (IllustrationButton) other;
            return Intrinsics.d(this.image, illustrationButton.image) && Intrinsics.d(this.title, illustrationButton.title) && Intrinsics.d(this.backgroundColor, illustrationButton.backgroundColor) && this.cornerRadius == illustrationButton.cornerRadius && Intrinsics.d(this.action, illustrationButton.action) && Intrinsics.d(this.tracking, illustrationButton.tracking);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final CornerRadius getCornerRadius() {
            return this.cornerRadius;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTracking() {
            return this.tracking;
        }

        public int hashCode() {
            int a11 = b.a(this.title, this.image.hashCode() * 31, 31);
            String str = this.backgroundColor;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            CornerRadius cornerRadius = this.cornerRadius;
            int hashCode2 = (hashCode + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.tracking;
            return hashCode3 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ImageDTO imageDTO = this.image;
            TextDTO textDTO = this.title;
            String str = this.backgroundColor;
            CornerRadius cornerRadius = this.cornerRadius;
            AtomActionDTO atomActionDTO = this.action;
            Map<String, TokenizedTrackingInfo> map = this.tracking;
            StringBuilder d11 = C2616s.d("IllustrationButton(image=", imageDTO, ", title=", textDTO, ", backgroundColor=");
            d11.append(str);
            d11.append(", cornerRadius=");
            d11.append(cornerRadius);
            d11.append(", action=");
            return a.d(d11, atomActionDTO, ", tracking=", map, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/illustrationButtons/data/IllustrationButtonsDTO$PaddingsDTO;", "", "topPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "bottomPadding", "leftPadding", "rightPadding", "buttonsPadding", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getTopPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getBottomPadding", "getLeftPadding", "getRightPadding", "getButtonsPadding", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaddingsDTO {
        public static final int $stable = 0;

        @EnumNullFallback
        private final Paddings bottomPadding;

        @EnumNullFallback
        private final Paddings buttonsPadding;

        @EnumNullFallback
        private final Paddings leftPadding;

        @EnumNullFallback
        private final Paddings rightPadding;

        @EnumNullFallback
        private final Paddings topPadding;

        public PaddingsDTO(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Paddings paddings5) {
            this.topPadding = paddings;
            this.bottomPadding = paddings2;
            this.leftPadding = paddings3;
            this.rightPadding = paddings4;
            this.buttonsPadding = paddings5;
        }

        public static /* synthetic */ PaddingsDTO copy$default(PaddingsDTO paddingsDTO, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Paddings paddings5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = paddingsDTO.topPadding;
            }
            if ((i11 & 2) != 0) {
                paddings2 = paddingsDTO.bottomPadding;
            }
            if ((i11 & 4) != 0) {
                paddings3 = paddingsDTO.leftPadding;
            }
            if ((i11 & 8) != 0) {
                paddings4 = paddingsDTO.rightPadding;
            }
            if ((i11 & 16) != 0) {
                paddings5 = paddingsDTO.buttonsPadding;
            }
            Paddings paddings6 = paddings5;
            Paddings paddings7 = paddings3;
            return paddingsDTO.copy(paddings, paddings2, paddings7, paddings4, paddings6);
        }

        /* renamed from: component1, reason: from getter */
        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        /* renamed from: component2, reason: from getter */
        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        /* renamed from: component3, reason: from getter */
        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        /* renamed from: component4, reason: from getter */
        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        /* renamed from: component5, reason: from getter */
        public final Paddings getButtonsPadding() {
            return this.buttonsPadding;
        }

        @NotNull
        public final PaddingsDTO copy(Paddings topPadding, Paddings bottomPadding, Paddings leftPadding, Paddings rightPadding, Paddings buttonsPadding) {
            return new PaddingsDTO(topPadding, bottomPadding, leftPadding, rightPadding, buttonsPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaddingsDTO)) {
                return false;
            }
            PaddingsDTO paddingsDTO = (PaddingsDTO) other;
            return this.topPadding == paddingsDTO.topPadding && this.bottomPadding == paddingsDTO.bottomPadding && this.leftPadding == paddingsDTO.leftPadding && this.rightPadding == paddingsDTO.rightPadding && this.buttonsPadding == paddingsDTO.buttonsPadding;
        }

        public final Paddings getBottomPadding() {
            return this.bottomPadding;
        }

        public final Paddings getButtonsPadding() {
            return this.buttonsPadding;
        }

        public final Paddings getLeftPadding() {
            return this.leftPadding;
        }

        public final Paddings getRightPadding() {
            return this.rightPadding;
        }

        public final Paddings getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            Paddings paddings = this.topPadding;
            int hashCode = (paddings == null ? 0 : paddings.hashCode()) * 31;
            Paddings paddings2 = this.bottomPadding;
            int hashCode2 = (hashCode + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
            Paddings paddings3 = this.leftPadding;
            int hashCode3 = (hashCode2 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
            Paddings paddings4 = this.rightPadding;
            int hashCode4 = (hashCode3 + (paddings4 == null ? 0 : paddings4.hashCode())) * 31;
            Paddings paddings5 = this.buttonsPadding;
            return hashCode4 + (paddings5 != null ? paddings5.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.topPadding;
            Paddings paddings2 = this.bottomPadding;
            Paddings paddings3 = this.leftPadding;
            Paddings paddings4 = this.rightPadding;
            Paddings paddings5 = this.buttonsPadding;
            StringBuilder b11 = p.b("PaddingsDTO(topPadding=", paddings, ", bottomPadding=", paddings2, ", leftPadding=");
            Lh.a.e(b11, paddings3, ", rightPadding=", paddings4, ", buttonsPadding=");
            return D40.b.b(b11, paddings5, ")");
        }
    }

    public IllustrationButtonsDTO(@NotNull IllustrationButton leftButton, @NotNull IllustrationButton rightButton, String str, PaddingsDTO paddingsDTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(leftButton, "leftButton");
        Intrinsics.checkNotNullParameter(rightButton, "rightButton");
        this.leftButton = leftButton;
        this.rightButton = rightButton;
        this.backgroundColor = str;
        this.paddings = paddingsDTO;
        this.tracking = map;
    }

    public static /* synthetic */ IllustrationButtonsDTO copy$default(IllustrationButtonsDTO illustrationButtonsDTO, IllustrationButton illustrationButton, IllustrationButton illustrationButton2, String str, PaddingsDTO paddingsDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            illustrationButton = illustrationButtonsDTO.leftButton;
        }
        if ((i11 & 2) != 0) {
            illustrationButton2 = illustrationButtonsDTO.rightButton;
        }
        if ((i11 & 4) != 0) {
            str = illustrationButtonsDTO.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            paddingsDTO = illustrationButtonsDTO.paddings;
        }
        if ((i11 & 16) != 0) {
            map = illustrationButtonsDTO.tracking;
        }
        Map map2 = map;
        String str2 = str;
        return illustrationButtonsDTO.copy(illustrationButton, illustrationButton2, str2, paddingsDTO, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final IllustrationButton getLeftButton() {
        return this.leftButton;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final IllustrationButton getRightButton() {
        return this.rightButton;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final PaddingsDTO getPaddings() {
        return this.paddings;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.tracking;
    }

    @NotNull
    public final IllustrationButtonsDTO copy(@NotNull IllustrationButton leftButton, @NotNull IllustrationButton rightButton, String backgroundColor, PaddingsDTO paddings, Map<String, TokenizedTrackingInfo> tracking) {
        Intrinsics.checkNotNullParameter(leftButton, "leftButton");
        Intrinsics.checkNotNullParameter(rightButton, "rightButton");
        return new IllustrationButtonsDTO(leftButton, rightButton, backgroundColor, paddings, tracking);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IllustrationButtonsDTO)) {
            return false;
        }
        IllustrationButtonsDTO illustrationButtonsDTO = (IllustrationButtonsDTO) other;
        return Intrinsics.d(this.leftButton, illustrationButtonsDTO.leftButton) && Intrinsics.d(this.rightButton, illustrationButtonsDTO.rightButton) && Intrinsics.d(this.backgroundColor, illustrationButtonsDTO.backgroundColor) && Intrinsics.d(this.paddings, illustrationButtonsDTO.paddings) && Intrinsics.d(this.tracking, illustrationButtonsDTO.tracking);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final IllustrationButton getLeftButton() {
        return this.leftButton;
    }

    public final PaddingsDTO getPaddings() {
        return this.paddings;
    }

    @NotNull
    public final IllustrationButton getRightButton() {
        return this.rightButton;
    }

    public final Map<String, TokenizedTrackingInfo> getTracking() {
        return this.tracking;
    }

    public int hashCode() {
        int hashCode = (this.rightButton.hashCode() + (this.leftButton.hashCode() * 31)) * 31;
        String str = this.backgroundColor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        PaddingsDTO paddingsDTO = this.paddings;
        int hashCode3 = (hashCode2 + (paddingsDTO == null ? 0 : paddingsDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.tracking;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        IllustrationButton illustrationButton = this.leftButton;
        IllustrationButton illustrationButton2 = this.rightButton;
        String str = this.backgroundColor;
        PaddingsDTO paddingsDTO = this.paddings;
        Map<String, TokenizedTrackingInfo> map = this.tracking;
        StringBuilder sb2 = new StringBuilder("IllustrationButtonsDTO(leftButton=");
        sb2.append(illustrationButton);
        sb2.append(", rightButton=");
        sb2.append(illustrationButton2);
        sb2.append(", backgroundColor=");
        sb2.append(str);
        sb2.append(", paddings=");
        sb2.append(paddingsDTO);
        sb2.append(", tracking=");
        return P.f(sb2, map, ")");
    }
}
