package ru.ozon.id.nativeauth.data.api;

import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;
import ru.ozon.id.logout.data.ConfirmTrustedDeviceDTO;
import ru.ozon.id.nativeauth.accountMerge.data.AccountMergeDTO;
import ru.ozon.id.nativeauth.credentials.countryCode.PhoneCodeCountrySelectDTO;
import ru.ozon.id.nativeauth.data.models.EntryDTO;
import ru.ozon.id.nativeauth.data.models.OtpDTO;
import ru.ozon.id.nativeauth.data.models.RestoreAccesDTO;
import ru.ozon.id.nativeauth.pageAgreementWithConditions.data.PageAgreementWithConditionsDTO;
import ru.ozon.id.nativeauth.pageNotification.data.PageNotificationDTO;
import ru.ozon.id.nativeauth.pageSocialAdditional.data.PageSocialAdditionalOptionDTO;
import ru.ozon.id.nativeauth.requestPhoneAccess.data.RequestPhoneAccessDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\rJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000f\u0010\rJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0011\u0010\rJ \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0015\u0010\rJ \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0017\u0010\rJ \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0019\u0010\rJ \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001b\u0010\rJ \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001d\u0010\r¨\u0006\u001e"}, d2 = {"Lru/ozon/id/nativeauth/data/api/ComposerAuthApi;", "", "", ImagesContract.URL, "iso", "Lru/ozon/id/nativeauth/data/api/GetEntryRequestBody;", "body", "Lru/ozon/id/nativeauth/data/api/PageResponse;", "Lru/ozon/id/nativeauth/data/models/EntryDTO;", "getEntry", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/id/nativeauth/data/api/GetEntryRequestBody;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/id/nativeauth/credentials/countryCode/PhoneCodeCountrySelectDTO;", "getPhoneCodes", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/id/nativeauth/data/models/OtpDTO;", "getOtp", "Lru/ozon/id/nativeauth/requestPhoneAccess/data/RequestPhoneAccessDTO;", "getRequestPhoneAccess", "Lru/ozon/id/logout/data/ConfirmTrustedDeviceDTO;", "getConfirmTrustedDevice", "Lru/ozon/id/nativeauth/data/models/RestoreAccesDTO;", "getRestoreAccess", "Lru/ozon/id/nativeauth/pageNotification/data/PageNotificationDTO;", "getPageNotification", "Lru/ozon/id/nativeauth/accountMerge/data/AccountMergeDTO;", "getAccountMerge", "Lru/ozon/id/nativeauth/pageSocialAdditional/data/PageSocialAdditionalOptionDTO;", "getPageSocialAdditionalOption", "Lru/ozon/id/nativeauth/pageAgreementWithConditions/data/PageAgreementWithConditionsDTO;", "getPageAgreementWithConditions", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ComposerAuthApi {
    @POST
    Object getAccountMerge(@Url @NotNull String str, @NotNull d<? super PageResponse<AccountMergeDTO>> dVar);

    @POST
    Object getConfirmTrustedDevice(@Url @NotNull String str, @NotNull d<? super PageResponse<ConfirmTrustedDeviceDTO>> dVar);

    @POST
    Object getEntry(@Url @NotNull String str, @Query("iso") String str2, @Body @NotNull GetEntryRequestBody getEntryRequestBody, @NotNull d<? super PageResponse<EntryDTO>> dVar);

    @POST
    Object getOtp(@Url @NotNull String str, @NotNull d<? super PageResponse<OtpDTO>> dVar);

    @POST
    Object getPageAgreementWithConditions(@Url @NotNull String str, @NotNull d<? super PageResponse<PageAgreementWithConditionsDTO>> dVar);

    @POST
    Object getPageNotification(@Url @NotNull String str, @NotNull d<? super PageResponse<PageNotificationDTO>> dVar);

    @POST
    Object getPageSocialAdditionalOption(@Url @NotNull String str, @NotNull d<? super PageResponse<PageSocialAdditionalOptionDTO>> dVar);

    @POST
    Object getPhoneCodes(@Url @NotNull String str, @NotNull d<? super PageResponse<PhoneCodeCountrySelectDTO>> dVar);

    @POST
    Object getRequestPhoneAccess(@Url @NotNull String str, @NotNull d<? super PageResponse<RequestPhoneAccessDTO>> dVar);

    @POST
    Object getRestoreAccess(@Url @NotNull String str, @NotNull d<? super PageResponse<RestoreAccesDTO>> dVar);
}
