package ru.ozon.app.android.partpayment.formpage.data;

import We.D;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.reactivex.y;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;
import retrofit2.http.Url;
import ru.ozon.app.android.partpayment.formpage.data.autocomplete.MaskAutocompleteDTO;
import ru.ozon.app.android.partpayment.formpage.data.validation.PassFormDTO;
import ru.ozon.app.android.partpayment.formpage.data.validation.VerifySmsDTO;
import ru.ozon.app.android.partpayment.smssign.data.ValidateSmsRequest;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J5\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0002H'¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH'¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0012H'¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b\u0016\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/data/FormPageApiDataSource;", "", "", ImagesContract.URL, "", "body", "Lio/reactivex/y;", "Lru/ozon/app/android/partpayment/formpage/data/validation/PassFormDTO;", "passForm", "(Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/y;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/partpayment/formpage/data/autocomplete/MaskAutocompleteDTO;", "getAutocompleteSuggest", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/y;", "LWe/D$c;", "photoPart", "passPhoto", "(Ljava/lang/String;LWe/D$c;)Lio/reactivex/y;", "Lru/ozon/app/android/partpayment/smssign/data/ValidateSmsRequest;", "Lru/ozon/app/android/partpayment/formpage/data/validation/VerifySmsDTO;", "validateSmsCode", "(Ljava/lang/String;Lru/ozon/app/android/partpayment/smssign/data/ValidateSmsRequest;)Lio/reactivex/y;", "passLimit", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface FormPageApiDataSource {
    @GET
    @NotNull
    y<MaskAutocompleteDTO> getAutocompleteSuggest(@Url @NotNull String url, @NotNull @Query("value") String value);

    @POST
    @NotNull
    y<PassFormDTO> passForm(@Url @NotNull String url, @Body @NotNull Map<String, String> body);

    @POST
    @NotNull
    y<PassFormDTO> passLimit(@Url @NotNull String url, @Body @NotNull Map<String, String> body);

    @POST
    @NotNull
    @Multipart
    y<PassFormDTO> passPhoto(@Url @NotNull String url, @NotNull @Part D.c photoPart);

    @POST
    @NotNull
    y<VerifySmsDTO> validateSmsCode(@Url @NotNull String url, @Body @NotNull ValidateSmsRequest body);
}
