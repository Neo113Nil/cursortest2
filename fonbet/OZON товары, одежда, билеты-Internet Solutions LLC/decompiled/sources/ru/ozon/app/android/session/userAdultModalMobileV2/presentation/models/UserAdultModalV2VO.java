package ru.ozon.app.android.session.userAdultModalMobileV2.presentation.models;

import Bl.C2639a;
import De.C2859b;
import Ns.b;
import TY.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.session.userAdultModalMobileV2.data.models.UserAdultModalV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b#\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b*\u0010)R%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lru/ozon/app/android/session/userAdultModalMobileV2/presentation/models/UserAdultModalV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/app/android/session/userAdultModalMobileV2/data/models/UserAdultModalV2DTO$Input;", "input", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "primaryButton", "secondaryButton", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/session/userAdultModalMobileV2/data/models/UserAdultModalV2DTO$Input;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/app/android/session/userAdultModalMobileV2/data/models/UserAdultModalV2DTO$Input;", "getInput", "()Lru/ozon/app/android/session/userAdultModalMobileV2/data/models/UserAdultModalV2DTO$Input;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getPrimaryButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSecondaryButton", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserAdultModalV2VO implements c {
    private final long id;
    private final UserAdultModalV2DTO.Input input;

    @NotNull
    private final ButtonV3DTO primaryButton;
    private final ButtonV3DTO secondaryButton;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public UserAdultModalV2VO(long j11, @NotNull TextDTO title, @NotNull TextDTO subtitle, UserAdultModalV2DTO.Input input, @NotNull ButtonV3DTO primaryButton, ButtonV3DTO buttonV3DTO, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        this.id = j11;
        this.title = title;
        this.subtitle = subtitle;
        this.input = input;
        this.primaryButton = primaryButton;
        this.secondaryButton = buttonV3DTO;
        this.trackingInfo = map;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserAdultModalV2VO)) {
            return false;
        }
        UserAdultModalV2VO userAdultModalV2VO = (UserAdultModalV2VO) other;
        return this.id == userAdultModalV2VO.id && Intrinsics.d(this.title, userAdultModalV2VO.title) && Intrinsics.d(this.subtitle, userAdultModalV2VO.subtitle) && Intrinsics.d(this.input, userAdultModalV2VO.input) && Intrinsics.d(this.primaryButton, userAdultModalV2VO.primaryButton) && Intrinsics.d(this.secondaryButton, userAdultModalV2VO.secondaryButton) && Intrinsics.d(this.trackingInfo, userAdultModalV2VO.trackingInfo);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final UserAdultModalV2DTO.Input getInput() {
        return this.input;
    }

    @NotNull
    public final ButtonV3DTO getPrimaryButton() {
        return this.primaryButton;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final ButtonV3DTO getSecondaryButton() {
        return this.secondaryButton;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = b.a(this.subtitle, b.a(this.title, Long.hashCode(this.id) * 31, 31), 31);
        UserAdultModalV2DTO.Input input = this.input;
        int c11 = C2859b.c(this.primaryButton, (a11 + (input == null ? 0 : input.hashCode())) * 31, 31);
        ButtonV3DTO buttonV3DTO = this.secondaryButton;
        int hashCode = (c11 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        UserAdultModalV2DTO.Input input = this.input;
        ButtonV3DTO buttonV3DTO = this.primaryButton;
        ButtonV3DTO buttonV3DTO2 = this.secondaryButton;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder b11 = a.b("UserAdultModalV2VO(id=", j11, ", title=", textDTO);
        b11.append(", subtitle=");
        b11.append(textDTO2);
        b11.append(", input=");
        b11.append(input);
        b11.append(", primaryButton=");
        b11.append(buttonV3DTO);
        b11.append(", secondaryButton=");
        b11.append(buttonV3DTO2);
        return C2639a.b(b11, ", trackingInfo=", map, ")");
    }
}
