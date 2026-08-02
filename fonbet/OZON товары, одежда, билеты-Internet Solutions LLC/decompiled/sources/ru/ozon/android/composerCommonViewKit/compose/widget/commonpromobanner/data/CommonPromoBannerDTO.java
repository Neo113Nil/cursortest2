package ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.data;

import D3.g;
import K1.G;
import Xc.a;
import Xc.b;
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
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniGradient;
import ru.ozon.uni.core.models.UniPaddingToken;
import ru.ozon.uni.core.models.UniRadiusToken;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0004KLMNB\u0093\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0006HÆ\u0003J\t\u0010:\u001a\u00020\bHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0017\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u00ad\u0001\u0010D\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÆ\u0001J\u0013\u0010E\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010H\u001a\u00020IHÖ\u0001J\t\u0010J\u001a\u00020\fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u001f\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b5\u00106¨\u0006O"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "description", "theme", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO$ThemeType;", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "backgroundColor", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO$Background;", "backgroundImage", "", "actionButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "closeButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "cornerRadius", "Lru/ozon/uni/core/models/UniRadiusToken;", "margins", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO$Margins;", "paddings", "Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO$Paddings;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO$ThemeType;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO$Background;Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/core/models/UniRadiusToken;Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO$Margins;Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO$Paddings;Ljava/util/Map;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDescription", "getTheme", "()Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO$ThemeType;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getBackgroundColor", "()Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO$Background;", "getBackgroundImage", "()Ljava/lang/String;", "getActionButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getCloseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getCornerRadius", "()Lru/ozon/uni/core/models/UniRadiusToken;", "getMargins", "()Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO$Margins;", "getPaddings", "()Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO$Paddings;", "getTrackingInfo", "()Ljava/util/Map;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "", "toString", "ThemeType", "Background", "Paddings", "Margins", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class CommonPromoBannerDTO {
    public static final int $stable = 0;
    private final AtomActionDTO action;
    private final ButtonV3DTO actionButton;
    private final Background backgroundColor;
    private final String backgroundImage;
    private final IconButtonV3DTO closeButton;
    private final UniRadiusToken cornerRadius;
    private final TextDTO description;

    @NotNull
    private final ImageDTO image;
    private final Margins margins;
    private final Paddings paddings;

    @NotNull
    private final ThemeType theme;
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO$Background;", "", "color", "", "gradient", "Lru/ozon/uni/core/UniGradient;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/core/UniGradient;)V", "getColor", "()Ljava/lang/String;", "getGradient", "()Lru/ozon/uni/core/UniGradient;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Background {
        public static final int $stable = UniGradient.$stable;
        private final String color;
        private final UniGradient gradient;

        public Background(String str, UniGradient uniGradient) {
            this.color = str;
            this.gradient = uniGradient;
        }

        public static /* synthetic */ Background copy$default(Background background, String str, UniGradient uniGradient, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = background.color;
            }
            if ((i11 & 2) != 0) {
                uniGradient = background.gradient;
            }
            return background.copy(str, uniGradient);
        }

        /* renamed from: component1, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        /* renamed from: component2, reason: from getter */
        public final UniGradient getGradient() {
            return this.gradient;
        }

        @NotNull
        public final Background copy(String color, UniGradient gradient) {
            return new Background(color, gradient);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Background)) {
                return false;
            }
            Background background = (Background) other;
            return Intrinsics.d(this.color, background.color) && Intrinsics.d(this.gradient, background.gradient);
        }

        public final String getColor() {
            return this.color;
        }

        public final UniGradient getGradient() {
            return this.gradient;
        }

        public int hashCode() {
            String str = this.color;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            UniGradient uniGradient = this.gradient;
            return hashCode + (uniGradient != null ? uniGradient.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Background(color=" + this.color + ", gradient=" + this.gradient + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO$Margins;", "", "leftMargin", "Lru/ozon/uni/core/models/UniPaddingToken;", "rightMargin", "topMargin", "bottomMargin", "<init>", "(Lru/ozon/uni/core/models/UniPaddingToken;Lru/ozon/uni/core/models/UniPaddingToken;Lru/ozon/uni/core/models/UniPaddingToken;Lru/ozon/uni/core/models/UniPaddingToken;)V", "getLeftMargin", "()Lru/ozon/uni/core/models/UniPaddingToken;", "getRightMargin", "getTopMargin", "getBottomMargin", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Margins {
        public static final int $stable = UniPaddingToken.$stable;
        private final UniPaddingToken bottomMargin;
        private final UniPaddingToken leftMargin;
        private final UniPaddingToken rightMargin;
        private final UniPaddingToken topMargin;

        public Margins(UniPaddingToken uniPaddingToken, UniPaddingToken uniPaddingToken2, UniPaddingToken uniPaddingToken3, UniPaddingToken uniPaddingToken4) {
            this.leftMargin = uniPaddingToken;
            this.rightMargin = uniPaddingToken2;
            this.topMargin = uniPaddingToken3;
            this.bottomMargin = uniPaddingToken4;
        }

        public static /* synthetic */ Margins copy$default(Margins margins, UniPaddingToken uniPaddingToken, UniPaddingToken uniPaddingToken2, UniPaddingToken uniPaddingToken3, UniPaddingToken uniPaddingToken4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                uniPaddingToken = margins.leftMargin;
            }
            if ((i11 & 2) != 0) {
                uniPaddingToken2 = margins.rightMargin;
            }
            if ((i11 & 4) != 0) {
                uniPaddingToken3 = margins.topMargin;
            }
            if ((i11 & 8) != 0) {
                uniPaddingToken4 = margins.bottomMargin;
            }
            return margins.copy(uniPaddingToken, uniPaddingToken2, uniPaddingToken3, uniPaddingToken4);
        }

        /* renamed from: component1, reason: from getter */
        public final UniPaddingToken getLeftMargin() {
            return this.leftMargin;
        }

        /* renamed from: component2, reason: from getter */
        public final UniPaddingToken getRightMargin() {
            return this.rightMargin;
        }

        /* renamed from: component3, reason: from getter */
        public final UniPaddingToken getTopMargin() {
            return this.topMargin;
        }

        /* renamed from: component4, reason: from getter */
        public final UniPaddingToken getBottomMargin() {
            return this.bottomMargin;
        }

        @NotNull
        public final Margins copy(UniPaddingToken leftMargin, UniPaddingToken rightMargin, UniPaddingToken topMargin, UniPaddingToken bottomMargin) {
            return new Margins(leftMargin, rightMargin, topMargin, bottomMargin);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Margins)) {
                return false;
            }
            Margins margins = (Margins) other;
            return Intrinsics.d(this.leftMargin, margins.leftMargin) && Intrinsics.d(this.rightMargin, margins.rightMargin) && Intrinsics.d(this.topMargin, margins.topMargin) && Intrinsics.d(this.bottomMargin, margins.bottomMargin);
        }

        public final UniPaddingToken getBottomMargin() {
            return this.bottomMargin;
        }

        public final UniPaddingToken getLeftMargin() {
            return this.leftMargin;
        }

        public final UniPaddingToken getRightMargin() {
            return this.rightMargin;
        }

        public final UniPaddingToken getTopMargin() {
            return this.topMargin;
        }

        public int hashCode() {
            UniPaddingToken uniPaddingToken = this.leftMargin;
            int hashCode = (uniPaddingToken == null ? 0 : uniPaddingToken.hashCode()) * 31;
            UniPaddingToken uniPaddingToken2 = this.rightMargin;
            int hashCode2 = (hashCode + (uniPaddingToken2 == null ? 0 : uniPaddingToken2.hashCode())) * 31;
            UniPaddingToken uniPaddingToken3 = this.topMargin;
            int hashCode3 = (hashCode2 + (uniPaddingToken3 == null ? 0 : uniPaddingToken3.hashCode())) * 31;
            UniPaddingToken uniPaddingToken4 = this.bottomMargin;
            return hashCode3 + (uniPaddingToken4 != null ? uniPaddingToken4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Margins(leftMargin=" + this.leftMargin + ", rightMargin=" + this.rightMargin + ", topMargin=" + this.topMargin + ", bottomMargin=" + this.bottomMargin + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO$Paddings;", "", "leftPadding", "Lru/ozon/uni/core/models/UniPaddingToken;", "rightPadding", "topPadding", "bottomPadding", "<init>", "(Lru/ozon/uni/core/models/UniPaddingToken;Lru/ozon/uni/core/models/UniPaddingToken;Lru/ozon/uni/core/models/UniPaddingToken;Lru/ozon/uni/core/models/UniPaddingToken;)V", "getLeftPadding", "()Lru/ozon/uni/core/models/UniPaddingToken;", "getRightPadding", "getTopPadding", "getBottomPadding", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Paddings {
        public static final int $stable = UniPaddingToken.$stable;
        private final UniPaddingToken bottomPadding;
        private final UniPaddingToken leftPadding;
        private final UniPaddingToken rightPadding;
        private final UniPaddingToken topPadding;

        public Paddings(UniPaddingToken uniPaddingToken, UniPaddingToken uniPaddingToken2, UniPaddingToken uniPaddingToken3, UniPaddingToken uniPaddingToken4) {
            this.leftPadding = uniPaddingToken;
            this.rightPadding = uniPaddingToken2;
            this.topPadding = uniPaddingToken3;
            this.bottomPadding = uniPaddingToken4;
        }

        public static /* synthetic */ Paddings copy$default(Paddings paddings, UniPaddingToken uniPaddingToken, UniPaddingToken uniPaddingToken2, UniPaddingToken uniPaddingToken3, UniPaddingToken uniPaddingToken4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                uniPaddingToken = paddings.leftPadding;
            }
            if ((i11 & 2) != 0) {
                uniPaddingToken2 = paddings.rightPadding;
            }
            if ((i11 & 4) != 0) {
                uniPaddingToken3 = paddings.topPadding;
            }
            if ((i11 & 8) != 0) {
                uniPaddingToken4 = paddings.bottomPadding;
            }
            return paddings.copy(uniPaddingToken, uniPaddingToken2, uniPaddingToken3, uniPaddingToken4);
        }

        /* renamed from: component1, reason: from getter */
        public final UniPaddingToken getLeftPadding() {
            return this.leftPadding;
        }

        /* renamed from: component2, reason: from getter */
        public final UniPaddingToken getRightPadding() {
            return this.rightPadding;
        }

        /* renamed from: component3, reason: from getter */
        public final UniPaddingToken getTopPadding() {
            return this.topPadding;
        }

        /* renamed from: component4, reason: from getter */
        public final UniPaddingToken getBottomPadding() {
            return this.bottomPadding;
        }

        @NotNull
        public final Paddings copy(UniPaddingToken leftPadding, UniPaddingToken rightPadding, UniPaddingToken topPadding, UniPaddingToken bottomPadding) {
            return new Paddings(leftPadding, rightPadding, topPadding, bottomPadding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Paddings)) {
                return false;
            }
            Paddings paddings = (Paddings) other;
            return Intrinsics.d(this.leftPadding, paddings.leftPadding) && Intrinsics.d(this.rightPadding, paddings.rightPadding) && Intrinsics.d(this.topPadding, paddings.topPadding) && Intrinsics.d(this.bottomPadding, paddings.bottomPadding);
        }

        public final UniPaddingToken getBottomPadding() {
            return this.bottomPadding;
        }

        public final UniPaddingToken getLeftPadding() {
            return this.leftPadding;
        }

        public final UniPaddingToken getRightPadding() {
            return this.rightPadding;
        }

        public final UniPaddingToken getTopPadding() {
            return this.topPadding;
        }

        public int hashCode() {
            UniPaddingToken uniPaddingToken = this.leftPadding;
            int hashCode = (uniPaddingToken == null ? 0 : uniPaddingToken.hashCode()) * 31;
            UniPaddingToken uniPaddingToken2 = this.rightPadding;
            int hashCode2 = (hashCode + (uniPaddingToken2 == null ? 0 : uniPaddingToken2.hashCode())) * 31;
            UniPaddingToken uniPaddingToken3 = this.topPadding;
            int hashCode3 = (hashCode2 + (uniPaddingToken3 == null ? 0 : uniPaddingToken3.hashCode())) * 31;
            UniPaddingToken uniPaddingToken4 = this.bottomPadding;
            return hashCode3 + (uniPaddingToken4 != null ? uniPaddingToken4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Paddings(leftPadding=" + this.leftPadding + ", rightPadding=" + this.rightPadding + ", topPadding=" + this.topPadding + ", bottomPadding=" + this.bottomPadding + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/android/composerCommonViewKit/compose/widget/commonpromobanner/data/CommonPromoBannerDTO$ThemeType;", "", "<init>", "(Ljava/lang/String;I)V", "THEME_TYPE_INVALID", "THEME_TYPE_RIGHT_WHOLE_IMAGE", "THEME_TYPE_RIGHT_CROPPED_IMAGE", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ThemeType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ThemeType[] $VALUES;
        public static final ThemeType THEME_TYPE_INVALID = new ThemeType("THEME_TYPE_INVALID", 0);
        public static final ThemeType THEME_TYPE_RIGHT_WHOLE_IMAGE = new ThemeType("THEME_TYPE_RIGHT_WHOLE_IMAGE", 1);
        public static final ThemeType THEME_TYPE_RIGHT_CROPPED_IMAGE = new ThemeType("THEME_TYPE_RIGHT_CROPPED_IMAGE", 2);

        private static final /* synthetic */ ThemeType[] $values() {
            return new ThemeType[]{THEME_TYPE_INVALID, THEME_TYPE_RIGHT_WHOLE_IMAGE, THEME_TYPE_RIGHT_CROPPED_IMAGE};
        }

        static {
            ThemeType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ThemeType(String str, int i11) {
        }

        public static ThemeType valueOf(String str) {
            return (ThemeType) Enum.valueOf(ThemeType.class, str);
        }

        public static ThemeType[] values() {
            return (ThemeType[]) $VALUES.clone();
        }
    }

    public CommonPromoBannerDTO(TextDTO textDTO, TextDTO textDTO2, @NotNull ThemeType theme, @NotNull ImageDTO image, Background background, String str, ButtonV3DTO buttonV3DTO, IconButtonV3DTO iconButtonV3DTO, UniRadiusToken uniRadiusToken, Margins margins, Paddings paddings, Map<String, TokenizedTrackingInfo> map, AtomActionDTO atomActionDTO) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(image, "image");
        this.title = textDTO;
        this.description = textDTO2;
        this.theme = theme;
        this.image = image;
        this.backgroundColor = background;
        this.backgroundImage = str;
        this.actionButton = buttonV3DTO;
        this.closeButton = iconButtonV3DTO;
        this.cornerRadius = uniRadiusToken;
        this.margins = margins;
        this.paddings = paddings;
        this.trackingInfo = map;
        this.action = atomActionDTO;
    }

    public static /* synthetic */ CommonPromoBannerDTO copy$default(CommonPromoBannerDTO commonPromoBannerDTO, TextDTO textDTO, TextDTO textDTO2, ThemeType themeType, ImageDTO imageDTO, Background background, String str, ButtonV3DTO buttonV3DTO, IconButtonV3DTO iconButtonV3DTO, UniRadiusToken uniRadiusToken, Margins margins, Paddings paddings, Map map, AtomActionDTO atomActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = commonPromoBannerDTO.title;
        }
        return commonPromoBannerDTO.copy(textDTO, (i11 & 2) != 0 ? commonPromoBannerDTO.description : textDTO2, (i11 & 4) != 0 ? commonPromoBannerDTO.theme : themeType, (i11 & 8) != 0 ? commonPromoBannerDTO.image : imageDTO, (i11 & 16) != 0 ? commonPromoBannerDTO.backgroundColor : background, (i11 & 32) != 0 ? commonPromoBannerDTO.backgroundImage : str, (i11 & 64) != 0 ? commonPromoBannerDTO.actionButton : buttonV3DTO, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? commonPromoBannerDTO.closeButton : iconButtonV3DTO, (i11 & 256) != 0 ? commonPromoBannerDTO.cornerRadius : uniRadiusToken, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? commonPromoBannerDTO.margins : margins, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? commonPromoBannerDTO.paddings : paddings, (i11 & 2048) != 0 ? commonPromoBannerDTO.trackingInfo : map, (i11 & 4096) != 0 ? commonPromoBannerDTO.action : atomActionDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    /* renamed from: component10, reason: from getter */
    public final Margins getMargins() {
        return this.margins;
    }

    /* renamed from: component11, reason: from getter */
    public final Paddings getPaddings() {
        return this.paddings;
    }

    public final Map<String, TokenizedTrackingInfo> component12() {
        return this.trackingInfo;
    }

    /* renamed from: component13, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final TextDTO getDescription() {
        return this.description;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ThemeType getTheme() {
        return this.theme;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    /* renamed from: component5, reason: from getter */
    public final Background getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    /* renamed from: component7, reason: from getter */
    public final ButtonV3DTO getActionButton() {
        return this.actionButton;
    }

    /* renamed from: component8, reason: from getter */
    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    /* renamed from: component9, reason: from getter */
    public final UniRadiusToken getCornerRadius() {
        return this.cornerRadius;
    }

    @NotNull
    public final CommonPromoBannerDTO copy(TextDTO title, TextDTO description, @NotNull ThemeType theme, @NotNull ImageDTO image, Background backgroundColor, String backgroundImage, ButtonV3DTO actionButton, IconButtonV3DTO closeButton, UniRadiusToken cornerRadius, Margins margins, Paddings paddings, Map<String, TokenizedTrackingInfo> trackingInfo, AtomActionDTO action) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Intrinsics.checkNotNullParameter(image, "image");
        return new CommonPromoBannerDTO(title, description, theme, image, backgroundColor, backgroundImage, actionButton, closeButton, cornerRadius, margins, paddings, trackingInfo, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonPromoBannerDTO)) {
            return false;
        }
        CommonPromoBannerDTO commonPromoBannerDTO = (CommonPromoBannerDTO) other;
        return Intrinsics.d(this.title, commonPromoBannerDTO.title) && Intrinsics.d(this.description, commonPromoBannerDTO.description) && this.theme == commonPromoBannerDTO.theme && Intrinsics.d(this.image, commonPromoBannerDTO.image) && Intrinsics.d(this.backgroundColor, commonPromoBannerDTO.backgroundColor) && Intrinsics.d(this.backgroundImage, commonPromoBannerDTO.backgroundImage) && Intrinsics.d(this.actionButton, commonPromoBannerDTO.actionButton) && Intrinsics.d(this.closeButton, commonPromoBannerDTO.closeButton) && Intrinsics.d(this.cornerRadius, commonPromoBannerDTO.cornerRadius) && Intrinsics.d(this.margins, commonPromoBannerDTO.margins) && Intrinsics.d(this.paddings, commonPromoBannerDTO.paddings) && Intrinsics.d(this.trackingInfo, commonPromoBannerDTO.trackingInfo) && Intrinsics.d(this.action, commonPromoBannerDTO.action);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final ButtonV3DTO getActionButton() {
        return this.actionButton;
    }

    public final Background getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    public final UniRadiusToken getCornerRadius() {
        return this.cornerRadius;
    }

    public final TextDTO getDescription() {
        return this.description;
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
    }

    public final Margins getMargins() {
        return this.margins;
    }

    public final Paddings getPaddings() {
        return this.paddings;
    }

    @NotNull
    public final ThemeType getTheme() {
        return this.theme;
    }

    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        TextDTO textDTO = this.title;
        int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
        TextDTO textDTO2 = this.description;
        int b11 = Nh.a.b(this.image, (this.theme.hashCode() + ((hashCode + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31)) * 31, 31);
        Background background = this.backgroundColor;
        int hashCode2 = (b11 + (background == null ? 0 : background.hashCode())) * 31;
        String str = this.backgroundImage;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.actionButton;
        int hashCode4 = (hashCode3 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        int hashCode5 = (hashCode4 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        UniRadiusToken uniRadiusToken = this.cornerRadius;
        int hashCode6 = (hashCode5 + (uniRadiusToken == null ? 0 : uniRadiusToken.hashCode())) * 31;
        Margins margins = this.margins;
        int hashCode7 = (hashCode6 + (margins == null ? 0 : margins.hashCode())) * 31;
        Paddings paddings = this.paddings;
        int hashCode8 = (hashCode7 + (paddings == null ? 0 : paddings.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode9 = (hashCode8 + (map == null ? 0 : map.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        return hashCode9 + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.description;
        ThemeType themeType = this.theme;
        ImageDTO imageDTO = this.image;
        Background background = this.backgroundColor;
        String str = this.backgroundImage;
        ButtonV3DTO buttonV3DTO = this.actionButton;
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        UniRadiusToken uniRadiusToken = this.cornerRadius;
        Margins margins = this.margins;
        Paddings paddings = this.paddings;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        AtomActionDTO atomActionDTO = this.action;
        StringBuilder g10 = g.g("CommonPromoBannerDTO(title=", textDTO, ", description=", textDTO2, ", theme=");
        g10.append(themeType);
        g10.append(", image=");
        g10.append(imageDTO);
        g10.append(", backgroundColor=");
        g10.append(background);
        g10.append(", backgroundImage=");
        g10.append(str);
        g10.append(", actionButton=");
        g10.append(buttonV3DTO);
        g10.append(", closeButton=");
        g10.append(iconButtonV3DTO);
        g10.append(", cornerRadius=");
        g10.append(uniRadiusToken);
        g10.append(", margins=");
        g10.append(margins);
        g10.append(", paddings=");
        g10.append(paddings);
        g10.append(", trackingInfo=");
        g10.append(map);
        g10.append(", action=");
        return G.c(g10, atomActionDTO, ")");
    }

    public /* synthetic */ CommonPromoBannerDTO(TextDTO textDTO, TextDTO textDTO2, ThemeType themeType, ImageDTO imageDTO, Background background, String str, ButtonV3DTO buttonV3DTO, IconButtonV3DTO iconButtonV3DTO, UniRadiusToken uniRadiusToken, Margins margins, Paddings paddings, Map map, AtomActionDTO atomActionDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textDTO, textDTO2, themeType, imageDTO, background, str, buttonV3DTO, iconButtonV3DTO, uniRadiusToken, margins, paddings, (i11 & 2048) != 0 ? null : map, atomActionDTO);
    }
}
