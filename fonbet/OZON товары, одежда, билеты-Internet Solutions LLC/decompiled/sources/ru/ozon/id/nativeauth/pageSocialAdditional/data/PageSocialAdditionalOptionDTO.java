package ru.ozon.id.nativeauth.pageSocialAdditional.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.id.nativeauth.data.models.EntryDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003JC\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006!"}, d2 = {"Lru/ozon/id/nativeauth/pageSocialAdditional/data/PageSocialAdditionalOptionDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "subtitle", "socialLoginButton", "Lru/ozon/id/nativeauth/data/models/EntryDTO$SocialButtonDTO;", "submitButton", "Lru/ozon/id/nativeauth/data/models/EntryDTO$EntryButtonDTO;", "cancelButton", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/id/nativeauth/data/models/EntryDTO$SocialButtonDTO;Lru/ozon/id/nativeauth/data/models/EntryDTO$EntryButtonDTO;Lru/ozon/id/nativeauth/data/models/EntryDTO$EntryButtonDTO;)V", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getSubtitle", "getSocialLoginButton", "()Lru/ozon/id/nativeauth/data/models/EntryDTO$SocialButtonDTO;", "getSubmitButton", "()Lru/ozon/id/nativeauth/data/models/EntryDTO$EntryButtonDTO;", "getCancelButton", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PageSocialAdditionalOptionDTO {
    private final EntryDTO.EntryButtonDTO cancelButton;
    private final EntryDTO.SocialButtonDTO socialLoginButton;
    private final EntryDTO.EntryButtonDTO submitButton;
    private final OzonSpannableString subtitle;

    @NotNull
    private final OzonSpannableString title;

    public PageSocialAdditionalOptionDTO(@NotNull OzonSpannableString title, OzonSpannableString ozonSpannableString, EntryDTO.SocialButtonDTO socialButtonDTO, EntryDTO.EntryButtonDTO entryButtonDTO, EntryDTO.EntryButtonDTO entryButtonDTO2) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.subtitle = ozonSpannableString;
        this.socialLoginButton = socialButtonDTO;
        this.submitButton = entryButtonDTO;
        this.cancelButton = entryButtonDTO2;
    }

    public static /* synthetic */ PageSocialAdditionalOptionDTO copy$default(PageSocialAdditionalOptionDTO pageSocialAdditionalOptionDTO, OzonSpannableString ozonSpannableString, OzonSpannableString ozonSpannableString2, EntryDTO.SocialButtonDTO socialButtonDTO, EntryDTO.EntryButtonDTO entryButtonDTO, EntryDTO.EntryButtonDTO entryButtonDTO2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            ozonSpannableString = pageSocialAdditionalOptionDTO.title;
        }
        if ((i11 & 2) != 0) {
            ozonSpannableString2 = pageSocialAdditionalOptionDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            socialButtonDTO = pageSocialAdditionalOptionDTO.socialLoginButton;
        }
        if ((i11 & 8) != 0) {
            entryButtonDTO = pageSocialAdditionalOptionDTO.submitButton;
        }
        if ((i11 & 16) != 0) {
            entryButtonDTO2 = pageSocialAdditionalOptionDTO.cancelButton;
        }
        EntryDTO.EntryButtonDTO entryButtonDTO3 = entryButtonDTO2;
        EntryDTO.SocialButtonDTO socialButtonDTO2 = socialButtonDTO;
        return pageSocialAdditionalOptionDTO.copy(ozonSpannableString, ozonSpannableString2, socialButtonDTO2, entryButtonDTO, entryButtonDTO3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final OzonSpannableString getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final OzonSpannableString getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final EntryDTO.SocialButtonDTO getSocialLoginButton() {
        return this.socialLoginButton;
    }

    /* renamed from: component4, reason: from getter */
    public final EntryDTO.EntryButtonDTO getSubmitButton() {
        return this.submitButton;
    }

    /* renamed from: component5, reason: from getter */
    public final EntryDTO.EntryButtonDTO getCancelButton() {
        return this.cancelButton;
    }

    @NotNull
    public final PageSocialAdditionalOptionDTO copy(@NotNull OzonSpannableString title, OzonSpannableString subtitle, EntryDTO.SocialButtonDTO socialLoginButton, EntryDTO.EntryButtonDTO submitButton, EntryDTO.EntryButtonDTO cancelButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new PageSocialAdditionalOptionDTO(title, subtitle, socialLoginButton, submitButton, cancelButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PageSocialAdditionalOptionDTO)) {
            return false;
        }
        PageSocialAdditionalOptionDTO pageSocialAdditionalOptionDTO = (PageSocialAdditionalOptionDTO) other;
        return Intrinsics.d(this.title, pageSocialAdditionalOptionDTO.title) && Intrinsics.d(this.subtitle, pageSocialAdditionalOptionDTO.subtitle) && Intrinsics.d(this.socialLoginButton, pageSocialAdditionalOptionDTO.socialLoginButton) && Intrinsics.d(this.submitButton, pageSocialAdditionalOptionDTO.submitButton) && Intrinsics.d(this.cancelButton, pageSocialAdditionalOptionDTO.cancelButton);
    }

    public final EntryDTO.EntryButtonDTO getCancelButton() {
        return this.cancelButton;
    }

    public final EntryDTO.SocialButtonDTO getSocialLoginButton() {
        return this.socialLoginButton;
    }

    public final EntryDTO.EntryButtonDTO getSubmitButton() {
        return this.submitButton;
    }

    public final OzonSpannableString getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final OzonSpannableString getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        OzonSpannableString ozonSpannableString = this.subtitle;
        int hashCode2 = (hashCode + (ozonSpannableString == null ? 0 : ozonSpannableString.hashCode())) * 31;
        EntryDTO.SocialButtonDTO socialButtonDTO = this.socialLoginButton;
        int hashCode3 = (hashCode2 + (socialButtonDTO == null ? 0 : socialButtonDTO.hashCode())) * 31;
        EntryDTO.EntryButtonDTO entryButtonDTO = this.submitButton;
        int hashCode4 = (hashCode3 + (entryButtonDTO == null ? 0 : entryButtonDTO.hashCode())) * 31;
        EntryDTO.EntryButtonDTO entryButtonDTO2 = this.cancelButton;
        return hashCode4 + (entryButtonDTO2 != null ? entryButtonDTO2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        OzonSpannableString ozonSpannableString = this.title;
        OzonSpannableString ozonSpannableString2 = this.subtitle;
        return "PageSocialAdditionalOptionDTO(title=" + ((Object) ozonSpannableString) + ", subtitle=" + ((Object) ozonSpannableString2) + ", socialLoginButton=" + this.socialLoginButton + ", submitButton=" + this.submitButton + ", cancelButton=" + this.cancelButton + ")";
    }
}
