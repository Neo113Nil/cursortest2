package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.data;

import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.app.android.utils.Result;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J(\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@¢\u0006\u0004\b\n\u0010\bJ \u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00052\u0006\u0010\u000b\u001a\u00020\u0002H¦@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/AddLegalRepository;", "", "", "action", "postData", "Lru/ozon/app/android/utils/Result;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/AddLegalResponse;", "addLegalMobile", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/ProcessRegistrationResponse;", "processRegistration", FormPageDTO.Field.FIELD_TYPE_ADDRESS, "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/GetPostResponse;", "getPostByAddress", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface AddLegalRepository {
    Object addLegalMobile(@NotNull String str, @NotNull String str2, @NotNull d<? super Result<AddLegalResponse>> dVar);

    Object getPostByAddress(@NotNull String str, @NotNull d<? super Result<GetPostResponse>> dVar);

    Object processRegistration(@NotNull String str, @NotNull String str2, @NotNull d<? super Result<ProcessRegistrationResponse>> dVar);
}
