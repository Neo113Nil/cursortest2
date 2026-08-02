package ru.ozon.app.android.fresh.main.widgets.curtainGoals.v2.data;

import Co.a;
import De.C2859b;
import Gl.C3124a;
import Ns.b;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J\u0017\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003J|\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\nHÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00064"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/data/CurtainGoalsV2DTO;", "", "image", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "description", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "progress", "", "progressText", DynamicElementDTO.LARGE_BUTTON, "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "termsButton", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;)V", "getImage", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDescription", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getProgress", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProgressText", "getLargeButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getTermsButton", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;)Lru/ozon/app/android/fresh/main/widgets/curtainGoals/v2/data/CurtainGoalsV2DTO;", "equals", "", "other", "hashCode", "toString", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CurtainGoalsV2DTO {

    @NotNull
    private final BadgeDTO badge;

    @NotNull
    private final TextDTO description;

    @NotNull
    private final String image;
    private final ButtonV3DTO largeButton;
    private final Integer progress;
    private final TextDTO progressText;

    @NotNull
    private final ButtonV3DTO termsButton;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public CurtainGoalsV2DTO(@NotNull String image, @NotNull TextDTO title, @NotNull TextDTO description, @NotNull BadgeDTO badge, Integer num, TextDTO textDTO, ButtonV3DTO buttonV3DTO, @NotNull ButtonV3DTO termsButton, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(termsButton, "termsButton");
        this.image = image;
        this.title = title;
        this.description = description;
        this.badge = badge;
        this.progress = num;
        this.progressText = textDTO;
        this.largeButton = buttonV3DTO;
        this.termsButton = termsButton;
        this.trackingInfo = map;
    }

    public static /* synthetic */ CurtainGoalsV2DTO copy$default(CurtainGoalsV2DTO curtainGoalsV2DTO, String str, TextDTO textDTO, TextDTO textDTO2, BadgeDTO badgeDTO, Integer num, TextDTO textDTO3, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = curtainGoalsV2DTO.image;
        }
        if ((i11 & 2) != 0) {
            textDTO = curtainGoalsV2DTO.title;
        }
        if ((i11 & 4) != 0) {
            textDTO2 = curtainGoalsV2DTO.description;
        }
        if ((i11 & 8) != 0) {
            badgeDTO = curtainGoalsV2DTO.badge;
        }
        if ((i11 & 16) != 0) {
            num = curtainGoalsV2DTO.progress;
        }
        if ((i11 & 32) != 0) {
            textDTO3 = curtainGoalsV2DTO.progressText;
        }
        if ((i11 & 64) != 0) {
            buttonV3DTO = curtainGoalsV2DTO.largeButton;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            buttonV3DTO2 = curtainGoalsV2DTO.termsButton;
        }
        if ((i11 & 256) != 0) {
            map = curtainGoalsV2DTO.trackingInfo;
        }
        ButtonV3DTO buttonV3DTO3 = buttonV3DTO2;
        Map map2 = map;
        TextDTO textDTO4 = textDTO3;
        ButtonV3DTO buttonV3DTO4 = buttonV3DTO;
        Integer num2 = num;
        TextDTO textDTO5 = textDTO2;
        return curtainGoalsV2DTO.copy(str, textDTO, textDTO5, badgeDTO, num2, textDTO4, buttonV3DTO4, buttonV3DTO3, map2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final TextDTO getDescription() {
        return this.description;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getProgress() {
        return this.progress;
    }

    /* renamed from: component6, reason: from getter */
    public final TextDTO getProgressText() {
        return this.progressText;
    }

    /* renamed from: component7, reason: from getter */
    public final ButtonV3DTO getLargeButton() {
        return this.largeButton;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final ButtonV3DTO getTermsButton() {
        return this.termsButton;
    }

    public final Map<String, TokenizedTrackingInfo> component9() {
        return this.trackingInfo;
    }

    @NotNull
    public final CurtainGoalsV2DTO copy(@NotNull String image, @NotNull TextDTO title, @NotNull TextDTO description, @NotNull BadgeDTO badge, Integer progress, TextDTO progressText, ButtonV3DTO largeButton, @NotNull ButtonV3DTO termsButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(termsButton, "termsButton");
        return new CurtainGoalsV2DTO(image, title, description, badge, progress, progressText, largeButton, termsButton, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurtainGoalsV2DTO)) {
            return false;
        }
        CurtainGoalsV2DTO curtainGoalsV2DTO = (CurtainGoalsV2DTO) other;
        return Intrinsics.d(this.image, curtainGoalsV2DTO.image) && Intrinsics.d(this.title, curtainGoalsV2DTO.title) && Intrinsics.d(this.description, curtainGoalsV2DTO.description) && Intrinsics.d(this.badge, curtainGoalsV2DTO.badge) && Intrinsics.d(this.progress, curtainGoalsV2DTO.progress) && Intrinsics.d(this.progressText, curtainGoalsV2DTO.progressText) && Intrinsics.d(this.largeButton, curtainGoalsV2DTO.largeButton) && Intrinsics.d(this.termsButton, curtainGoalsV2DTO.termsButton) && Intrinsics.d(this.trackingInfo, curtainGoalsV2DTO.trackingInfo);
    }

    @NotNull
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final TextDTO getDescription() {
        return this.description;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    public final ButtonV3DTO getLargeButton() {
        return this.largeButton;
    }

    public final Integer getProgress() {
        return this.progress;
    }

    public final TextDTO getProgressText() {
        return this.progressText;
    }

    @NotNull
    public final ButtonV3DTO getTermsButton() {
        return this.termsButton;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int c11 = C3124a.c(this.badge, b.a(this.description, b.a(this.title, this.image.hashCode() * 31, 31), 31), 31);
        Integer num = this.progress;
        int hashCode = (c11 + (num == null ? 0 : num.hashCode())) * 31;
        TextDTO textDTO = this.progressText;
        int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        ButtonV3DTO buttonV3DTO = this.largeButton;
        int c12 = C2859b.c(this.termsButton, (hashCode2 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31, 31);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return c12 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.image;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.description;
        BadgeDTO badgeDTO = this.badge;
        Integer num = this.progress;
        TextDTO textDTO3 = this.progressText;
        ButtonV3DTO buttonV3DTO = this.largeButton;
        ButtonV3DTO buttonV3DTO2 = this.termsButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder b11 = a.b("CurtainGoalsV2DTO(image=", textDTO, str, ", title=", ", description=");
        b11.append(textDTO2);
        b11.append(", badge=");
        b11.append(badgeDTO);
        b11.append(", progress=");
        b11.append(num);
        b11.append(", progressText=");
        b11.append(textDTO3);
        b11.append(", largeButton=");
        b11.append(buttonV3DTO);
        b11.append(", termsButton=");
        b11.append(buttonV3DTO2);
        b11.append(", trackingInfo=");
        return P.f(b11, map, ")");
    }
}
