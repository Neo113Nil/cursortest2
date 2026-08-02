package ru.ozon.app.android.ugc.widgets.profileInputs.presentation;

import De.C2859b;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.profileInputs.data.ProfileInputsDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\u001f\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lru/ozon/app/android/ugc/widgets/profileInputs/presentation/ProfileInputsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/ugc/widgets/profileInputs/data/ProfileInputsDTO$InputField;", "inputField", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "submitButton", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "defaultNotification", "<init>", "(JLru/ozon/app/android/ugc/widgets/profileInputs/data/ProfileInputsDTO$InputField;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;LWZ/t;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/ugc/widgets/profileInputs/data/ProfileInputsDTO$InputField;", "getInputField", "()Lru/ozon/app/android/ugc/widgets/profileInputs/data/ProfileInputsDTO$InputField;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSubmitButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "getDefaultNotification", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ProfileInputsVO implements c {

    @NotNull
    private final NotificationDTO defaultNotification;
    private final long id;

    @NotNull
    private final ProfileInputsDTO.InputField inputField;

    @NotNull
    private final ButtonV3DTO submitButton;
    private final t tokenizedEvent;

    public ProfileInputsVO(long j11, @NotNull ProfileInputsDTO.InputField inputField, @NotNull ButtonV3DTO submitButton, t tVar, @NotNull NotificationDTO defaultNotification) {
        Intrinsics.checkNotNullParameter(inputField, "inputField");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        Intrinsics.checkNotNullParameter(defaultNotification, "defaultNotification");
        this.id = j11;
        this.inputField = inputField;
        this.submitButton = submitButton;
        this.tokenizedEvent = tVar;
        this.defaultNotification = defaultNotification;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileInputsVO)) {
            return false;
        }
        ProfileInputsVO profileInputsVO = (ProfileInputsVO) other;
        return this.id == profileInputsVO.id && Intrinsics.d(this.inputField, profileInputsVO.inputField) && Intrinsics.d(this.submitButton, profileInputsVO.submitButton) && Intrinsics.d(this.tokenizedEvent, profileInputsVO.tokenizedEvent) && Intrinsics.d(this.defaultNotification, profileInputsVO.defaultNotification);
    }

    @NotNull
    public final NotificationDTO getDefaultNotification() {
        return this.defaultNotification;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final ProfileInputsDTO.InputField getInputField() {
        return this.inputField;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final ButtonV3DTO getSubmitButton() {
        return this.submitButton;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int c11 = C2859b.c(this.submitButton, (this.inputField.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31);
        t tVar = this.tokenizedEvent;
        return this.defaultNotification.hashCode() + ((c11 + (tVar == null ? 0 : tVar.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "ProfileInputsVO(id=" + this.id + ", inputField=" + this.inputField + ", submitButton=" + this.submitButton + ", tokenizedEvent=" + this.tokenizedEvent + ", defaultNotification=" + this.defaultNotification + ")";
    }
}
