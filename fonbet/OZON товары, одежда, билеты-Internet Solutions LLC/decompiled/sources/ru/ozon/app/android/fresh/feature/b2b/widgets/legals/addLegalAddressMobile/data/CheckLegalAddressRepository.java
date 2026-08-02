package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.data;

import io.reactivex.y;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/data/CheckLegalAddressRepository;", "", "", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "postData", "Lio/reactivex/y;", "checkLegalAddress", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/y;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CheckLegalAddressRepository {
    @NotNull
    y<String> checkLegalAddress(@NotNull String address, @NotNull String postData);
}
