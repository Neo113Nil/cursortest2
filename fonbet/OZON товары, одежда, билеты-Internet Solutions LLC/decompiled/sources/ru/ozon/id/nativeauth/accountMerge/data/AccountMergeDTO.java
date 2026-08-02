package ru.ozon.id.nativeauth.accountMerge.data;

import Cm.e;
import N3.C3660k;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.id.nativeauth.data.models.EntryDTO;
import ru.ozon.id.nativeauth.data.models.OtpDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\u0011\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003Ja\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lru/ozon/id/nativeauth/accountMerge/data/AccountMergeDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "description", "userInfo", "Lru/ozon/id/nativeauth/accountMerge/data/UserInfoDTO;", "submitButton", "Lru/ozon/id/nativeauth/data/models/EntryDTO$SubmitButtonDTO;", "hintButtons", "", "Lru/ozon/id/nativeauth/data/models/EntryDTO$EntryButtonDTO;", "termsOfUser", "accountRecoveryButton", "Lru/ozon/id/nativeauth/data/models/OtpDTO$AccountRecoveryButton;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/id/nativeauth/accountMerge/data/UserInfoDTO;Lru/ozon/id/nativeauth/data/models/EntryDTO$SubmitButtonDTO;Ljava/util/List;Ljava/lang/String;Lru/ozon/id/nativeauth/data/models/OtpDTO$AccountRecoveryButton;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getUserInfo", "()Lru/ozon/id/nativeauth/accountMerge/data/UserInfoDTO;", "getSubmitButton", "()Lru/ozon/id/nativeauth/data/models/EntryDTO$SubmitButtonDTO;", "getHintButtons", "()Ljava/util/List;", "getTermsOfUser", "getAccountRecoveryButton", "()Lru/ozon/id/nativeauth/data/models/OtpDTO$AccountRecoveryButton;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AccountMergeDTO {
    private final OtpDTO.AccountRecoveryButton accountRecoveryButton;
    private final String description;
    private final List<EntryDTO.EntryButtonDTO> hintButtons;
    private final EntryDTO.SubmitButtonDTO submitButton;
    private final String termsOfUser;

    @NotNull
    private final String title;
    private final UserInfoDTO userInfo;

    public AccountMergeDTO(@NotNull String title, String str, UserInfoDTO userInfoDTO, EntryDTO.SubmitButtonDTO submitButtonDTO, List<EntryDTO.EntryButtonDTO> list, String str2, OtpDTO.AccountRecoveryButton accountRecoveryButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.description = str;
        this.userInfo = userInfoDTO;
        this.submitButton = submitButtonDTO;
        this.hintButtons = list;
        this.termsOfUser = str2;
        this.accountRecoveryButton = accountRecoveryButton;
    }

    public static /* synthetic */ AccountMergeDTO copy$default(AccountMergeDTO accountMergeDTO, String str, String str2, UserInfoDTO userInfoDTO, EntryDTO.SubmitButtonDTO submitButtonDTO, List list, String str3, OtpDTO.AccountRecoveryButton accountRecoveryButton, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = accountMergeDTO.title;
        }
        if ((i11 & 2) != 0) {
            str2 = accountMergeDTO.description;
        }
        if ((i11 & 4) != 0) {
            userInfoDTO = accountMergeDTO.userInfo;
        }
        if ((i11 & 8) != 0) {
            submitButtonDTO = accountMergeDTO.submitButton;
        }
        if ((i11 & 16) != 0) {
            list = accountMergeDTO.hintButtons;
        }
        if ((i11 & 32) != 0) {
            str3 = accountMergeDTO.termsOfUser;
        }
        if ((i11 & 64) != 0) {
            accountRecoveryButton = accountMergeDTO.accountRecoveryButton;
        }
        String str4 = str3;
        OtpDTO.AccountRecoveryButton accountRecoveryButton2 = accountRecoveryButton;
        List list2 = list;
        UserInfoDTO userInfoDTO2 = userInfoDTO;
        return accountMergeDTO.copy(str, str2, userInfoDTO2, submitButtonDTO, list2, str4, accountRecoveryButton2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final UserInfoDTO getUserInfo() {
        return this.userInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final EntryDTO.SubmitButtonDTO getSubmitButton() {
        return this.submitButton;
    }

    public final List<EntryDTO.EntryButtonDTO> component5() {
        return this.hintButtons;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTermsOfUser() {
        return this.termsOfUser;
    }

    /* renamed from: component7, reason: from getter */
    public final OtpDTO.AccountRecoveryButton getAccountRecoveryButton() {
        return this.accountRecoveryButton;
    }

    @NotNull
    public final AccountMergeDTO copy(@NotNull String title, String description, UserInfoDTO userInfo, EntryDTO.SubmitButtonDTO submitButton, List<EntryDTO.EntryButtonDTO> hintButtons, String termsOfUser, OtpDTO.AccountRecoveryButton accountRecoveryButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new AccountMergeDTO(title, description, userInfo, submitButton, hintButtons, termsOfUser, accountRecoveryButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountMergeDTO)) {
            return false;
        }
        AccountMergeDTO accountMergeDTO = (AccountMergeDTO) other;
        return Intrinsics.d(this.title, accountMergeDTO.title) && Intrinsics.d(this.description, accountMergeDTO.description) && Intrinsics.d(this.userInfo, accountMergeDTO.userInfo) && Intrinsics.d(this.submitButton, accountMergeDTO.submitButton) && Intrinsics.d(this.hintButtons, accountMergeDTO.hintButtons) && Intrinsics.d(this.termsOfUser, accountMergeDTO.termsOfUser) && Intrinsics.d(this.accountRecoveryButton, accountMergeDTO.accountRecoveryButton);
    }

    public final OtpDTO.AccountRecoveryButton getAccountRecoveryButton() {
        return this.accountRecoveryButton;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<EntryDTO.EntryButtonDTO> getHintButtons() {
        return this.hintButtons;
    }

    public final EntryDTO.SubmitButtonDTO getSubmitButton() {
        return this.submitButton;
    }

    public final String getTermsOfUser() {
        return this.termsOfUser;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final UserInfoDTO getUserInfo() {
        return this.userInfo;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        UserInfoDTO userInfoDTO = this.userInfo;
        int hashCode3 = (hashCode2 + (userInfoDTO == null ? 0 : userInfoDTO.hashCode())) * 31;
        EntryDTO.SubmitButtonDTO submitButtonDTO = this.submitButton;
        int hashCode4 = (hashCode3 + (submitButtonDTO == null ? 0 : submitButtonDTO.hashCode())) * 31;
        List<EntryDTO.EntryButtonDTO> list = this.hintButtons;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.termsOfUser;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        OtpDTO.AccountRecoveryButton accountRecoveryButton = this.accountRecoveryButton;
        return hashCode6 + (accountRecoveryButton != null ? accountRecoveryButton.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.description;
        UserInfoDTO userInfoDTO = this.userInfo;
        EntryDTO.SubmitButtonDTO submitButtonDTO = this.submitButton;
        List<EntryDTO.EntryButtonDTO> list = this.hintButtons;
        String str3 = this.termsOfUser;
        OtpDTO.AccountRecoveryButton accountRecoveryButton = this.accountRecoveryButton;
        StringBuilder d11 = C3660k.d("AccountMergeDTO(title=", str, ", description=", str2, ", userInfo=");
        d11.append(userInfoDTO);
        d11.append(", submitButton=");
        d11.append(submitButtonDTO);
        d11.append(", hintButtons=");
        e.i(", termsOfUser=", str3, ", accountRecoveryButton=", d11, list);
        d11.append(accountRecoveryButton);
        d11.append(")");
        return d11.toString();
    }
}
